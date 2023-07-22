package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkDsl
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT

internal class NamespaceObjectGenerator {
    fun generate(builders: List<CdkBuilder>): Map<ClassName, List<NamespacedBuilderFunction>> {
        // add extension function to allow DSL builder
        return builders.map { builder ->
            val namespaceObjectName =
                packageToNamespaceObject(
                    builder.buildableClass.className.packageName
                )
            val builderName =
                builder.buildableClass.className.simpleNames.joinToString(
                    separator = ""
                )
                    .replaceFirstChar { it.lowercase() }
            val fn = processBuilder(builder, builderName)
            NamespacedBuilderFunction(
                namespace = namespaceObjectName,
                builderName = builderName,
                funSpec = fn
            )
        }.sorted().groupBy { it.namespace }
    }

    private fun processBuilder(builder: CdkBuilder, builderName: String): FunSpec {
        val funSpecBuilder =
            FunSpec.builder(builderName)
                .addModifiers(KModifier.INLINE)
                .returns(builder.buildableClass.className)

        if (builder.cdkBuilderClass.deprecated) {
            funSpecBuilder.addAnnotation(
                Annotations.Deprecated
            )
        }

        builder.builderFactoryFunction.parameters.forEach {
            funSpecBuilder.addParameter(it.name, it.type)
        }

        val dslBuilderClass = builder.dslBuilderClass

        // enable builder DSL
        val lambdaTypeName =
            LambdaTypeName.get(
                dslBuilderClass,
                returnType = UNIT
            )
        funSpecBuilder.addParameter(
            ParameterSpec.builder("block", lambdaTypeName)
                .defaultValue("{}")
                .build()
        )

        val codeBlockBuilder = CodeBlock.builder()

        codeBlockBuilder.addStatement(
            "val builder = %T(%L)",
            dslBuilderClass,
            builder.builderFactoryFunction.parameters.joinToString(
                ", "
            ) { it.name }
        )
            .addStatement("builder.apply(block)")
            .addStatement("return builder.build()")

        funSpecBuilder.addCode(codeBlockBuilder.build())
        return funSpecBuilder.build()
    }

    private fun packageToNamespaceObject(packageName: String): ClassName {
        val dslPackageName =
            packageName.replace(
                CdkDsl.cdkPackageName,
                CdkDsl.packageName
            )

        return ClassName(dslPackageName, packageName.split(".").last())
    }

    internal data class NamespacedBuilderFunction(val namespace: ClassName, val builderName: String, val funSpec: FunSpec) :
        Comparable<NamespacedBuilderFunction> {
            override fun compareTo(other: NamespacedBuilderFunction): Int {
                return compareValuesBy(
                    this,
                    other,
                    { it.namespace },
                    { it.builderName }
                )
            }
        }
}
