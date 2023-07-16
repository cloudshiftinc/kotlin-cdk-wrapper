package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.Builder
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ImmutableMultimap
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT
import org.slf4j.LoggerFactory

internal class NamespaceObjectGenerator {

    fun generate(builders : List<Builder>): ImmutableMultimap<ClassName, FunSpec> {
        val namespaceFunctionMap = ArrayListMultimap.create<ClassName, FunSpec>()

        // add extension function to allow DSL builder
        builders.forEach { builder ->
                val namespaceObjectName = packageToNamespaceObject(builder.buildableClass.packageName)
                namespaceFunctionMap.put(namespaceObjectName, processBuilder(builder))
            }

        return ImmutableMultimap.copyOf(namespaceFunctionMap)
    }

    private fun processBuilder(builder : Builder): FunSpec {
        val name = builder.buildableClass.simpleNames.joinToString(separator = "").replaceFirstChar { it.lowercase() }
        val funSpecBuilder = FunSpec.builder(name)
            .addModifiers(KModifier.INLINE)
            .returns(builder.buildableClass)

        builder.builderFactoryFunction.parameters.forEach {
            funSpecBuilder.addParameter(it.name, it.type)
        }

        val dslBuilderClass = builder.dslBuilderClass

        // enable builder DSL
        val lambdaTypeName = LambdaTypeName.get(
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
            builder.builderFactoryFunction.parameters.joinToString(", ") { it.name }
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
}
