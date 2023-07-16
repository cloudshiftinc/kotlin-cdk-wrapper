package cloudshift.awscdkdsl.build.dsl

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ImmutableMultimap
import com.google.common.collect.Multimap
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KFunction
import kotlin.reflect.full.instanceParameter
import kotlin.reflect.full.valueParameters

internal class BuildableLastArgumentExtensionGenerator(private val registry: CdkClassRegistry) {

    fun generate(): ImmutableMultimap<String, ExtensionFunctionSpec> {
        val extensionFunctionMap = ArrayListMultimap.create<String, ExtensionFunctionSpec>()

        // add extension function to allow DSL builder
        registry.classes.asSequence()
            .filter { !it.builder }
            .flatMap { it.functionsWithBuildableLastArgument(registry) }
            .forEach { fn ->
                val buildableType = registry.lookup(fn.valueParameters.last().type)!!
                val builderClass = registry.builderTypeFor(buildableType)
                val receiverClass = registry.lookup(fn.instanceParameter?.type!!)!!
                val funSpec = generateExtensionForBuildableArg(
                    fn,
                    receiverClass,
                    builderClass
                )
                extensionFunctionMap.put(receiverClass.dslClassName().packageName, funSpec)
            }

        // adjust overrides that now class as the sole argument is always the configuration lambda
        val fixedMap = fixOverrides(extensionFunctionMap)

        return ImmutableMultimap.copyOf(fixedMap)
    }

    private fun fixOverrides(extensionFunctionMap: Multimap<String, ExtensionFunctionSpec>): Multimap<String, ExtensionFunctionSpec> {
        val newMap = ArrayListMultimap.create<String, ExtensionFunctionSpec>()
        extensionFunctionMap.asMap().forEach { (packageName, funSpecs) ->
            newMap.putAll(packageName, fixOverrides(funSpecs))
        }

        return newMap
    }

    private fun fixOverrides(funSpecs: Collection<ExtensionFunctionSpec>): Collection<ExtensionFunctionSpec> {
        if (funSpecs.size == 1) {
            // nothing to do
            return funSpecs
        }

        val newList = mutableListOf<ExtensionFunctionSpec>()
        val groupedSpecs =
            funSpecs.groupBy { "${it.qualifiedName()}.${it.funSpec.parameters.size}" }

        // functions with only a single instance are not a problem, retain these
        groupedSpecs.filter { it.value.size == 1 }.forEach { (_, u) -> newList.addAll(u) }

        groupedSpecs.filter { it.value.size > 1 }.forEach { (_, u) ->
            // rename each of these
            u.forEach { spec ->
                val builderClass = spec.builderClass!!
                val newName =
                    spec.funSpec.name + when (builderClass.className.simpleNames.size) {
                        1 -> builderClass.className.simpleName
                        else -> builderClass.className.simpleNames.filter {
                            it != "Builder" && !it.startsWith("Cfn")
                        }.joinToString("")
                    }
                val newSpec = spec.funSpec.toBuilder(name = newName).build()
                newList.add(spec.copy(funSpec = newSpec))
            }
        }
        return newList
    }

    private fun generateExtensionForBuildableArg(
        function: KFunction<*>,
        receiverClass: CdkClass,
        builderClass: CdkClass
    ): ExtensionFunctionSpec {

        val builder = FunSpec.builder(function.name)
            .addModifiers(KModifier.INLINE)
            .receiver(receiverClass.className)
            .returns(function.returnType.asTypeName())

        val args = mutableListOf<String>()
        function.valueParameters.dropLast(1).forEach {
            builder.addParameter(it.name!!, it.type.asTypeName())
            args.add(it.name!!)
        }
        args.add("builder.build()")

        // enable builder DSL
        val lambdaTypeName = LambdaTypeName.get(
            builderClass.dslClassName(),
            returnType = UNIT
        )
        builder.addParameter(
            ParameterSpec.builder("block", lambdaTypeName)
                .defaultValue("{}")
                .build()
        )

        val codeBlockBuilder = CodeBlock.builder()
        builder.addStatement(
            "val builder = %T()",
            builderClass.dslClassName()
        )
        codeBlockBuilder.addStatement("builder.apply(block)")
            .addStatement("return %L(%L)", function.name, args.joinToString(","))
        builder.addCode(codeBlockBuilder.build())

        return ExtensionFunctionSpec(
            builder.build(),
            builderClass
        )
    }
}
