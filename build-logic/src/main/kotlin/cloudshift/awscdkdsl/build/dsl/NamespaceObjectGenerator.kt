package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkDsl
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT


internal class NamespaceObjectGenerator {
    fun generate(cdkModel: CdkModel): List<FileSpec> {
        val namespaceBuilders = mutableMapOf<ClassName, NamespaceBuilder>()

        // add extension function to allow DSL builder
        val builderFunctions = generateBuilderFunctions(cdkModel.builders)
        builderFunctions.forEach { (namespace, builderFunction) ->
            val namespaceBuilder =
                namespaceBuilders.getOrPut(namespace) { NamespaceBuilder(namespace) }
            namespaceBuilder.addBuilderFunctions(builderFunction)
        }

        val staticBuilderFunctions = generateStaticBuilderFunctions(cdkModel)
        staticBuilderFunctions.forEach { (namespace, staticBuilderFunction) ->
            val namespaceBuilder =
                namespaceBuilders.getOrPut(namespace) { NamespaceBuilder(namespace) }
            namespaceBuilder.addStaticBuilderFunctions(staticBuilderFunction)
        }

        return namespaceBuilders.values.map { it.build() }
    }

    private class NamespaceBuilder(val name: ClassName) {
        private val builderFunctions = mutableListOf<BuilderFunction>()
        private val staticBuilderFunctions = mutableListOf<StaticBuilderFunction>()

        fun addBuilderFunctions(builderFunctions: List<BuilderFunction>) {
            this.builderFunctions.addAll(builderFunctions)
        }

        fun addStaticBuilderFunctions(staticBuilderFunctions: List<StaticBuilderFunction>) {
            this.staticBuilderFunctions.addAll(staticBuilderFunctions)
        }

        fun build(): FileSpec {

            val staticStuff = staticBuilderFunctions.groupBy { it.cdkClass.className }.toSortedMap()

            val builder = FileSpec.builder(name.packageName, "_${name.simpleName}")
            builder.suppressWarningTypes(SUPPRESSIONS)
            val namespaceObjectBuilder = TypeSpec.objectBuilder(name)
            builderFunctions.sortedBy { it.builderName }
                .forEach { builderFn -> namespaceObjectBuilder.addFunction(builderFn.funSpec) }

            // nested objects for each type to hold static functions
            staticStuff.forEach { (className, staticBuilderFunctions) ->
                val staticBuilder = TypeSpec.objectBuilder(className.simpleNames.last())
                staticBuilderFunctions.sortedBy { it.funSpec.name }
                    .forEach { staticBuilderFn -> staticBuilder.addFunction(staticBuilderFn.funSpec) }
                namespaceObjectBuilder.addType(staticBuilder.build())
            }

            builder.addType(namespaceObjectBuilder.build())
            return builder.build()
        }
    }

    private fun generateStaticBuilderFunctions(cdkModel: CdkModel): Map<ClassName, List<StaticBuilderFunction>> {
        return cdkModel.classes
            .asSequence()
            .filterNot { it.isBuilder() }
            .flatMap { cdkClass ->
                cdkClass.publicStaticFunctions
                    .filter { method -> method.parameters.isNotEmpty() }
                    .mapNotNull { method ->
                        val lastParam = method.parameters.last()
                        val builderClass =
                            cdkModel.builderClassFor(lastParam.type) ?: return@mapNotNull null
                        if (!builderClass.canInstantiate()) return@mapNotNull null
                        generateStaticBuilderFunction(cdkClass, method, builderClass)
                    }
            }
            .groupBy { packageToNamespaceObject(it.cdkClass.className.packageName) }
    }

    private fun List<CdkClass.Method.Parameter>.argumentFormat(): String {
        return when {
            isEmpty() -> ""
            else -> joinToString(separator = ", ", postfix = ", ") { "%N" }
        }
    }

    private fun generateStaticBuilderFunction(
        cdkClass: CdkClass,
        method: CdkClass.Method,
        builderClass: CdkClass
    ): StaticBuilderFunction {
        val builder =
            FunSpec.builder(method.name)
                .returns(method.returnType)

        method.comment?.let { builder.addKdoc("%L", it) }

        val args = method.parameters.dropLast(1)
        args.forEach {
            builder.addParameter(it.name, it.typeName())
        }

        val argFmt = args.argumentFormat()

        // enable builder DSL
        val lambdaTypeName =
            LambdaTypeName.get(builderClass.className.dslClassName(), returnType = UNIT)
        builder.addParameter(
            ParameterSpec.builder("block", lambdaTypeName).defaultValue("{}").build(),
        )

        val codeBlockBuilder = CodeBlock.builder()
        builder.addStatement("val builder = %T()", builderClass.className.dslClassName())
        codeBlockBuilder
            .addStatement("builder.apply(block)")
            .addStatement(
                "return %T.%N($argFmt%L)",
                cdkClass.className,
                method.name,
                *args.map { it.name }.toTypedArray(),
                "builder.build()",
            )
        builder.addCode(codeBlockBuilder.build())

        return StaticBuilderFunction(cdkClass = cdkClass, funSpec = builder.build())
    }

    private data class StaticBuilderFunction(val cdkClass: CdkClass, val funSpec: FunSpec)

    private fun generateBuilderFunctions(builders: List<CdkBuilder>): Map<ClassName, List<BuilderFunction>> {
        val namespaceBuilderFunctions = builders
            .map { builder ->
                val namespaceObjectName =
                    packageToNamespaceObject(builder.buildableClass.className.packageName)
                val builderName =
                    builder.buildableClass.className.simpleNames
                        .joinToString(separator = "")
                        .replaceFirstChar { it.lowercase() }
                val fn = processBuilder(builder, builderName)
                BuilderFunction(
                    namespace = namespaceObjectName,
                    builderName = builderName,
                    funSpec = fn,
                )
            }
            .groupBy { it.namespace }
        return namespaceBuilderFunctions
    }

    private fun processBuilder(builder: CdkBuilder, builderName: String): FunSpec {
        val funSpecBuilder =
            FunSpec.builder(builderName)
                .addModifiers(KModifier.INLINE)
                .returns(builder.buildableClass.className)

        if (builder.cdkBuilderClass.deprecated) {
            funSpecBuilder.addAnnotation(Annotations.Deprecated)
        }

        builder.buildableClass.comment?.let { funSpecBuilder.addKdoc("%L", it) }

        builder.builderFactoryFunction.parameters.forEach {
            funSpecBuilder.addParameter(it.name, it.typeName())
        }

        val dslBuilderClass = builder.dslBuilderClass

        // enable builder DSL
        val lambdaTypeName = LambdaTypeName.get(dslBuilderClass, returnType = UNIT)
        funSpecBuilder.addParameter(
            ParameterSpec.builder("block", lambdaTypeName).defaultValue("{}").build(),
        )

        val codeBlockBuilder = CodeBlock.builder()

        codeBlockBuilder
            .addStatement(
                "val builder = %T(%L)",
                dslBuilderClass,
                builder.builderFactoryFunction.parameters.joinToString(", ") { it.name },
            )
            .addStatement("builder.apply(block)")
            .addStatement("return builder.build()")

        funSpecBuilder.addCode(codeBlockBuilder.build())
        return funSpecBuilder.build()
    }

    private fun packageToNamespaceObject(packageName: String): ClassName {
        val dslPackageName = packageName.replace(CdkDsl.cdkPackageName, CdkDsl.packageName)

        return ClassName(dslPackageName, packageName.split(".").last())
    }

    internal data class BuilderFunction(
        val namespace: ClassName,
        val builderName: String,
        val funSpec: FunSpec
    )
}
