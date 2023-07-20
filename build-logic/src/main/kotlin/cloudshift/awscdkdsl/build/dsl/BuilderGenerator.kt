package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkDsl
import com.squareup.kotlinpoet.COLLECTION
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
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

internal object BuilderGenerator {
    fun generate(builders: List<CdkBuilder>): List<FileSpec> {
        return builders.map { generate(it) }
    }

    private fun generate(builder: CdkBuilder): FileSpec {
        val builderName = builder.dslBuilderClass.simpleNames.joinToString("")
        val builderClassName = builder.dslBuilderClass
        val builderClassBuilder = TypeSpec.classBuilder(builderClassName)
        builderClassBuilder.addAnnotation(CdkDsl.DslMarkerAnnotation)
        if (builder.cdkBuilderClass.deprecated) {
            builderClassBuilder.addAnnotation(Annotations.Deprecated)
        }

        if (builder.builderFactoryFunction.parameters.isNotEmpty()) {
            val constructorBuilder = FunSpec.constructorBuilder()
            builder.builderFactoryFunction.parameters.forEach { parameter ->
                val param = ParameterSpec.builder(parameter.name, parameter.type)
                    .build()
                constructorBuilder.addParameter(param)
            }
            builderClassBuilder.primaryConstructor(constructorBuilder.build())
        }

        generateBuilderDsl(builder, builderClassBuilder)

        return FileSpec.builder(builderClassName.packageName, builderName)
            .addType(builderClassBuilder.build())
            .suppressWarningTypes(SUPPRESSIONS)
            .build()
    }

    private fun generateBuilderDsl(builder: CdkBuilder, builderClassBuilder: TypeSpec.Builder) {
        builderClassBuilder.addProperty(
            PropertySpec.builder(
                "cdkBuilder",
                builder.cdkBuilderClass.className,
                KModifier.PRIVATE,
            ).initializer(
                "%T.%N(%L)",
                builder.builderFactoryFunction.className,
                builder.builderFactoryFunction.functionName,
                builder.builderFactoryFunction.parameters.joinToString(", ") { it.name },
            ).build(),
        )

        // the main build() function of the builder dsl
        val buildFnBuilder = FunSpec.builder("build")
            .returns(builder.buildableClass.className)

        // add properties into the builder dsl
        val overloadedProps = builder.properties.groupBy { it.name }.filter { it.value.size > 1 }.map { it.key }
        builder.properties.forEach { property ->
            when {
                // list of objects (possibly buildable)
                property.isList() -> handleListProperty(property, builderClassBuilder, buildFnBuilder)
                property.builderClass?.canInstantiate() ?: false -> handleBuildable(
                    property,
                    builderClassBuilder,
                    property.name in overloadedProps,
                )

                property.isObject() || property.isObjectMap() -> handleObjectProperty(
                    property,
                    builderClassBuilder,
                )

                else -> handleOtherProperty(property, builderClassBuilder)
            }
        }

        // finish off build() function
        buildFnBuilder.addStatement("return cdkBuilder.build()")
        builderClassBuilder.addFunction(buildFnBuilder.build())
    }

    private fun handleObjectProperty(prop: BuilderProperty, builderClassBuilder: TypeSpec.Builder) {
        val mapBuilderClass = ClassName("cloudshift.awscdk.common", "MapBuilder")
        val lambdaTypeName = LambdaTypeName.get(
            mapBuilderClass,
            returnType = UNIT,
        )

        // DSL setter
        builderClassBuilder.addFunction(
            dslFunctionSpec(prop) {
                addParameter(
                    ParameterSpec.builder("block", lambdaTypeName)
                        .defaultValue("{}")
                        .build(),
                )
                addStatement("val builder = %T()", mapBuilderClass)
                addStatement("builder.apply(block)")
                addStatement("cdkBuilder.%N(builder.map)", prop.name)
            },
        )

        // existing setter
        builderClassBuilder.addFunction(
            dslFunctionSpec(prop) {
                addParameter(prop.name, prop.typeName())
                addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
            },
        )
    }

    private fun handleBuildable(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder,
        overloaded: Boolean,
    ) {
        val builderClass = prop.builderClass ?: error("Expected builder class")
        val dslBuilderClass = builderClass.className.dslClassName()
        val lambdaTypeName = LambdaTypeName.get(receiver = dslBuilderClass, returnType = UNIT)

        // DSL setter
        if (!overloaded) {
            builderClassBuilder.addFunction(
                dslFunctionSpec(prop) {
                    addParameter(
                        ParameterSpec.builder("block", lambdaTypeName)
                            .defaultValue("{}")
                            .build(),
                    )
                    addStatement("val builder = %T()", dslBuilderClass)
                    addStatement("builder.apply(block)")
                    addStatement("cdkBuilder.%N(builder.build())", prop.name)
                },
            )
        }
        // TODO - handle overloaded methods

        // setter as specified in CDK builder
        builderClassBuilder.addFunction(
            dslFunctionSpec(prop) {
                addParameter(prop.name, prop.typeName())
                addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
            },
        )
    }

    private fun handleOtherProperty(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder,
    ) {
        // setter as specified in the CDK builder
        builderClassBuilder.addFunction(
            dslFunctionSpec(prop) {
                addParameter(prop.name, prop.typeName())
                addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
            },
        )
    }

    private fun handleListProperty(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder,
        buildFnBuilder: FunSpec.Builder,
    ) {
        val type = prop.type as ParameterizedTypeName
        val collectionName = "_${prop.name}"
        builderClassBuilder
            .addProperty(
                PropertySpec.builder(
                    collectionName,
                    MUTABLE_LIST.parameterizedBy(type.typeArguments),
                    KModifier.PRIVATE,
                )
                    //.addKdoc("Signature: ${prop.methodSignature}")
                    .initializer("mutableListOf()")
                    .build(),
            )

        if (prop.isList() && prop.builderClass?.canInstantiate() == true) {
            val builderClass = prop.builderClass.className.dslClassName()
            val lambdaTypeName = LambdaTypeName.get(
                builderClass,
                returnType = UNIT,
            )
            builderClassBuilder.addFunction(
                dslFunctionSpec(prop) {
                    addParameter(ParameterSpec.builder(prop.name, lambdaTypeName).build())
                    addStatement(
                        "%N.add(%T().apply(%N).build())",
                        collectionName,
                        builderClass,
                        prop.name,
                    )
                },
            )
        } else {
            builderClassBuilder.addFunction(
                dslFunctionSpec(prop) {
                    addParameter(prop.name, type.typeArguments[0], KModifier.VARARG)
                    addStatement("%N.addAll(listOf(*%N))", collectionName, prop.name)
                },
            )
        }

        builderClassBuilder.addFunction(
            dslFunctionSpec(prop) {
                addParameter(prop.name, COLLECTION.parameterizedBy(type.typeArguments))
                addStatement("%N.addAll(%N)", collectionName, prop.name)
            },
        )

        // delegate to CDK builder
        buildFnBuilder
            .addStatement("if(%N.isNotEmpty()) cdkBuilder.%N(%N)", collectionName, prop.name, collectionName)
    }

}


