package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT

internal class BuildableLastArgumentExtensionGenerator {
    fun generate(cdkModel: CdkModel): Map<String, List<ExtensionFunctionSpec>> {
        // add extension function to allow DSL builder
        val extensions =
            cdkModel.classes
                .asSequence()
                .filterNot { it.isBuilder() }
                .flatMap { cdkClass ->
                    cdkClass.publicMemberFunctions
                        .filter { method -> method.parameters.isNotEmpty() }
                        .mapNotNull { method ->
                            val lastParam = method.parameters.last()
                            val builderClass =
                                cdkModel.builderClassFor(lastParam.type) ?: return@mapNotNull null
                            if (!builderClass.canInstantiate()) return@mapNotNull null
                            val funSpec =
                                generateExtensionForBuildableArg(builderClass, cdkClass, method)
                            ExtensionFunctionSpec(
                                packageName = cdkClass.className.dslClassName().packageName,
                                funSpec = funSpec,
                                builderClass = builderClass
                            )
                        }
                }
                .groupBy { it.packageName }

        // adjust overrides that now class as the sole argument is always the configuration lambda
        return fixOverrides(extensions)
    }

    private fun fixOverrides(
        extensions: Map<String, List<ExtensionFunctionSpec>>
    ): Map<String, List<ExtensionFunctionSpec>> {
        return extensions.mapValues { fixOverrides(it.value) }
    }

    private fun fixOverrides(funSpecs: List<ExtensionFunctionSpec>): List<ExtensionFunctionSpec> {
        if (funSpecs.size == 1) {
            // nothing to do
            return funSpecs
        }

        val newList = mutableListOf<ExtensionFunctionSpec>()
        val groupedSpecs =
            funSpecs.groupBy { "${it.qualifiedName()}.${it.funSpec.parameters.size}" }

        // functions with only a single instance are not a problem, retain these
        groupedSpecs.filter { it.value.size == 1 }.forEach { (_, u) -> newList.addAll(u) }

        groupedSpecs
            .filter { it.value.size > 1 }
            .forEach { (_, u) ->
                // rename each of these
                u.forEach { spec ->
                    val builderClass = spec.builderClass
                    val newName =
                        spec.funSpec.name +
                            when (builderClass.className.simpleNames.size) {
                                1 -> builderClass.className.simpleName
                                else ->
                                    builderClass.className.simpleNames
                                        .filter { it != "Builder" && !it.startsWith("Cfn") }
                                        .joinToString("")
                            }
                    val newSpec = spec.funSpec.toBuilder(name = newName).build()
                    newList.add(spec.copy(funSpec = newSpec))
                }
            }
        return newList
    }

    private fun generateExtensionForBuildableArg(
        builderClass: CdkClass,
        receiverClass: CdkClass,
        method: CdkClass.Method
    ): FunSpec {
        val builder =
            FunSpec.builder(method.name)
                .addModifiers(KModifier.INLINE)
                .receiver(receiverClass.className)
                .returns(method.returnType)

        method.comment?.let { builder.addKdoc("%L", it) }

        val args = mutableListOf<String>()
        method.parameters.dropLast(1).forEach {
            builder.addParameter(it.name, it.typeName())
            args.add(it.name)
        }
        args.add("builder.build()")

        // enable builder DSL
        val lambdaTypeName =
            LambdaTypeName.get(builderClass.className.dslClassName(), returnType = UNIT)
        builder.addParameter(
            ParameterSpec.builder("block", lambdaTypeName).defaultValue("{}").build()
        )

        val codeBlockBuilder = CodeBlock.builder()
        builder.addStatement("val builder = %T()", builderClass.className.dslClassName())
        codeBlockBuilder
            .addStatement("builder.apply(block)")
            .addStatement("return %N(%L)", method.name, args.joinToString(", "))
        builder.addCode(codeBlockBuilder.build())

        return builder.build()
    }
}

internal data class ExtensionFunctionSpec(
    val packageName: String,
    val funSpec: FunSpec,
    val builderClass: CdkClass
) : Comparable<ExtensionFunctionSpec> {
    fun qualifiedName(): String {
        return "${funSpec.receiverType}.${funSpec.name}"
    }

    override fun compareTo(other: ExtensionFunctionSpec): Int {
        return compareValuesBy(
            this,
            other,
            { it.packageName },
            { it.qualifiedName() },
        )
    }
}
