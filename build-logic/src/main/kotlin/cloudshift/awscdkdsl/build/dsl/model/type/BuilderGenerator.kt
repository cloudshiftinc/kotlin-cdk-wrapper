package cloudshift.awscdkdsl.build.dsl.model.type

import cloudshift.awscdkdsl.build.dsl.Annotations
import cloudshift.awscdkdsl.build.dsl.TypeGeneratorContext
import cloudshift.awscdkdsl.build.dsl.dslClassName
import cloudshift.awscdkdsl.build.dsl.dslFunctionSpec
import cloudshift.awscdkdsl.build.dsl.mapClassName
import cloudshift.awscdkdsl.build.dsl.mappedClassName
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkDsl
import com.squareup.kotlinpoet.COLLECTION
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MUTABLE_LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT

private fun ClassName.builderName() = mappedClassName().nestedClass("Builder")

internal object BuilderGenerator {
    fun generateBuilder(cdkBuilder: CdkBuilder, ctx: TypeGeneratorContext): List<TypeSpec> {

        val builderName = cdkBuilder.buildableClass.className.builderName()
        val builderImplName =
            cdkBuilder.buildableClass.className.mappedClassName().nestedClass("BuilderImpl")

        val builderImplBuilder =
            TypeSpec.classBuilder(builderImplName).addModifiers(KModifier.PRIVATE)
                .addSuperinterface(builderName)

        if (cdkBuilder.builderFactoryFunction.parameters.isNotEmpty()) {
            val constructorBuilder = FunSpec.constructorBuilder()
            cdkBuilder.builderFactoryFunction.parameters.forEach { parameter ->
                val param = ParameterSpec.builder(parameter.name, parameter.type).build()
                constructorBuilder.addParameter(param)
            }
            builderImplBuilder.primaryConstructor(constructorBuilder.build())
        }


        val builderInterfaceBuilder = TypeSpec.interfaceBuilder(builderName)

        generateBuilder(builderInterfaceBuilder, builderImplBuilder, cdkBuilder, ctx)

        return listOf(builderInterfaceBuilder.build(), builderImplBuilder.build())
    }

    private fun generateBuilder(
        builderInterfaceBuilder: TypeSpec.Builder,
        builderImplBuilder: TypeSpec.Builder,
        builderInfo: CdkBuilder,
        ctx: TypeGeneratorContext
    ) {

        val paramNames = builderInfo.builderFactoryFunction.parameters.map { it.name }
        val paramFormat = paramNames.joinToString(", ") { "%N" }

        builderImplBuilder.addProperty(
            PropertySpec.builder(
                "cdkBuilder",
                builderInfo.cdkBuilderClass.className,
                KModifier.PRIVATE,
            ).initializer(
                "%T.%N($paramFormat)", // TODO - use %N for parameters
                builderInfo.builderFactoryFunction.className,
                builderInfo.builderFactoryFunction.functionName,
                *paramNames.toTypedArray(),
            ).build(),
        )

        // the main build() function of the builder dsl
        val buildFnBuilder = FunSpec.builder("build").returns(builderInfo.buildableClass.className)

        if (builderInfo.cdkBuilderClass.deprecated) {
            builderInterfaceBuilder.addAnnotation(Annotations.Deprecated)
        }
        builderInfo.cdkBuilderClass.comment?.let {
            builderInterfaceBuilder.addKdoc("%L", it)
        }

        val methods =
            builderInfo.cdkBuilderClass.publicMemberFunctions.filter { it.name != "build" }

        val generator = MethodGenerator(ctx.model, listOf(BuilderMethodFactory(ctx)))
        val cdkMethods = generator.generate(builderInfo.cdkBuilderClass, methods)

        cdkMethods.forEach {
            builderInterfaceBuilder.addFunction(it.interfaceMethod)
            builderImplBuilder.addFunction(it.implementationMethod)
        }

//
//        val overloadedProps =
//            builderInfo.properties.groupBy { it.name }.filter { it.value.size > 1 }.map { it.key }
//        builderInfo.properties.map { property ->
//            ctx.referencedType(property.typeName())
//            when {
//                // list of objects (possibly buildable)
//                property.isList() ->
//                    handleListProperty(
//                        property,
//                        builderImplBuilder,
//                        builderInterfaceBuilder,
//                        buildFnBuilder,
//                    )
//
//                property.builderClass?.canInstantiate() ?: false ->
//                    handleBuildable(
//                        property,
//                        builderImplBuilder,
//                        builderInterfaceBuilder,
//                        property.name in overloadedProps,
//                    )
//                property.isObject() || property.isObjectMap() ->
//                    handleObjectProperty(property, builderImplBuilder, builderInterfaceBuilder)
//                else -> handleOtherProperty(property, builderImplBuilder, builderInterfaceBuilder)
//            }
//        }

        // finish off build() function
        buildFnBuilder.addStatement("return cdkBuilder.build()")
        builderImplBuilder.addFunction(buildFnBuilder.build())
    }

    private fun handleObjectProperty(
        prop: BuilderProperty,
        builderImplBuilder: TypeSpec.Builder,
        builderInterfaceBuilder: TypeSpec.Builder
    ) {
        val lambdaTypeName = LambdaTypeName.get(CdkDsl.MapBuilderClass, returnType = UNIT)

        // DSL setter
        prop.dslFunc(
            builderInterfaceBuilder, builderImplBuilder,
            ParameterSpec.builder(prop.name, lambdaTypeName).defaultValue("{}").build(),
        ) {
            addStatement(
                "val builder = %T()",
                CdkDsl.MapBuilderClass,
            )
            addStatement("builder.apply(%N)", prop.name)
            addStatement("cdkBuilder.%N(builder.map)", prop.name)
        }

        // existing setter
        prop.dslFunc(
            builderInterfaceBuilder, builderImplBuilder,
            ParameterSpec.builder(prop.name, prop.typeName().mapClassName()).build(),
        ) {
            addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
        }
    }

    private fun handleBuildable(
        prop: BuilderProperty,
        builderImplBuilder: TypeSpec.Builder,
        builderInterfaceBuilder: TypeSpec.Builder,
        overloaded: Boolean
    ) {
        val builderClass = prop.builderClass ?: error("Expected builder class")
        val dslBuilderClass = (prop.typeName() as ClassName).builderName()
        val lambdaTypeName = LambdaTypeName.get(receiver = dslBuilderClass, returnType = UNIT)

        // DSL setter
        if (!overloaded) {
            prop.dslFunc(
                builderInterfaceBuilder, builderImplBuilder,
                ParameterSpec.builder(prop.name, lambdaTypeName).defaultValue("{}").build(),
            ) {
                addStatement(
                    "val builder = %T()",
                    dslBuilderClass,
                )
                addStatement("builder.apply(%N)", prop.name)
                addStatement("cdkBuilder.%N(builder.build())", prop.name)
            }
        }
        // TODO - handle overloaded methods

        // setter as specified in CDK builder
        prop.dslFunc(
            builderInterfaceBuilder, builderImplBuilder,
            ParameterSpec.builder(prop.name, prop.typeName().mapClassName()).build(),
        ) {
            addStatement("cdkBuilder.%N(%N.cdkObject)", prop.name, prop.name)
        }
    }

    private fun handleOtherProperty(
        prop: BuilderProperty,
        builderImplBuilder: TypeSpec.Builder,
        builderInterfaceBuilder: TypeSpec.Builder
    ) {
        // setter as specified in the CDK builder
        prop.dslFunc(
            builderInterfaceBuilder, builderImplBuilder,
            ParameterSpec.builder(prop.name, prop.typeName().mapClassName()).build(),
        ) {
            addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
        }
    }

    private fun handleListProperty(
        prop: BuilderProperty,
        builderImplBuilder: TypeSpec.Builder,
        builderInterfaceBuilder: TypeSpec.Builder,
        buildFnBuilder: FunSpec.Builder
    ) {
        val type = prop.typeName() as ParameterizedTypeName
        val collectionName = "_${prop.name}"
        builderImplBuilder.addProperty(
            PropertySpec.builder(
                collectionName,
                MUTABLE_LIST.parameterizedBy(type.typeArguments),
                KModifier.PRIVATE,
            ).initializer("mutableListOf()").build(),
        )

        if (prop.isList() && prop.builderClass?.canInstantiate() == true) {
            val builderClass = prop.builderClass.className.dslClassName()
            val lambdaTypeName = LambdaTypeName.get(builderClass, returnType = UNIT)

            prop.dslFunc(
                builderInterfaceBuilder, builderImplBuilder,
                ParameterSpec.builder(prop.name, lambdaTypeName).build(),
            ) {
                addStatement(
                    "%N.add(%T().apply(%N).build())",
                    collectionName,
                    builderClass,
                    prop.name,
                )
            }
        } else {
            prop.dslFunc(
                builderInterfaceBuilder,
                builderImplBuilder,
                ParameterSpec.builder(prop.name, type.typeArguments[0], KModifier.VARARG).build(),
            ) {
                addStatement("%N.addAll(listOf(*%N))", collectionName, prop.name)
            }
        }

        prop.dslFunc(
            builderInterfaceBuilder,
            builderImplBuilder,
            ParameterSpec.builder(prop.name, COLLECTION.parameterizedBy(type.typeArguments))
                .build(),
        ) {
            addStatement("%N.addAll(%N)", collectionName, prop.name)
        }

        // delegate to CDK builder
        buildFnBuilder.addStatement(
            "if(%N.isNotEmpty()) cdkBuilder.%N(%N)",
            collectionName,
            prop.name,
            collectionName,
        )
    }
}


private fun BuilderProperty.dslFunc(
    interfaceBuilder: TypeSpec.Builder,
    implBuilder: TypeSpec.Builder,
    parameterSpec: ParameterSpec,
    implFunc: (FunSpec.Builder).() -> Unit
) {
    interfaceBuilder.addFunction(
        dslFunctionSpec(this) {
            addParameter(parameterSpec)
            addModifiers(KModifier.ABSTRACT)
        },
    )
    implBuilder.addFunction(
        dslFunctionSpec(this) {
            addParameter(parameterSpec.toBuilder().defaultValue(null).build())
            addModifiers(KModifier.OVERRIDE)
            apply(implFunc)
        },
    )
}
