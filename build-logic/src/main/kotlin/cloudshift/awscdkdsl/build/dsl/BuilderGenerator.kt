package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.Builder
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.COLLECTION
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MUTABLE_LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

internal object CdkDsl {
    const val packageName = "cloudshift.awscdk.dsl"
    const val cdkPackageName = "software.amazon.awscdk"
    val DslMarkerAnnotation = ClassName.bestGuess("cloudshift.awscdk.common.CdkDslMarker")
}

internal class BuilderGenerator(private val registry: CdkClassRegistry) {

    fun generate(builders: List<Builder>): List<FileSpec> {
        return builders.map { generate(it) }
    }

    private fun generate(builder: Builder): FileSpec {
        val builderName = builder.dslBuilderClass.simpleNames.joinToString("")
        val builderClassName = builder.dslBuilderClass
        val builderClassBuilder = TypeSpec.classBuilder(builderClassName)
        builderClassBuilder.addAnnotation(CdkDsl.DslMarkerAnnotation)

        if (builder.builderFactoryFunction.parameters.isNotEmpty()) {
            val constructorBuilder = FunSpec.constructorBuilder()
            builder.builderFactoryFunction.parameters.forEach {
                constructorBuilder.addParameter(it.name, it.type)
            }
            builderClassBuilder.primaryConstructor(constructorBuilder.build())
        }

        generateBuilderDsl(
            builder,
            builderClassBuilder,
            registry
        )

        return FileSpec.builder(builderClassName.packageName, builderName)
            .addType(builderClassBuilder.build())
            .suppressWarningTypes(SUPPRESSIONS)
            .build()
    }

    private fun generateBuilderDsl(
        builder: Builder,
        builderClassBuilder: TypeSpec.Builder,
        registry: CdkClassRegistry,
    ) {
        builderClassBuilder.addProperty(
            PropertySpec.builder(
                "cdkBuilder",
                builder.cdkBuilderClass,
                KModifier.PRIVATE
            ).initializer(
                "%T.%N(%L)",
                builder.builderFactoryFunction.className,
                builder.builderFactoryFunction.functionName,
                builder.builderFactoryFunction.parameters.joinToString(", ") { it.name }
            ).build()
        )

        // the main build() function of the builder dsl
        val buildFnBuilder = FunSpec.builder("build")
            .returns(builder.buildableClass)

        // add properties into the builder dsl
        val overloadedProps = builder.properties.groupBy { it.name }.filter { it.value.size > 1 }.map { it.key }
        builder.properties.forEach { property ->
            when {
                // list of objects (possibly buildable)
                property.isList() -> handleListProperty(property, builderClassBuilder, buildFnBuilder)
                registry.isBuildable(property.type) -> handleBuildable(
                    property,
                    builderClassBuilder,
                    registry,
                    property.name in overloadedProps
                )

                property.isObject() || property.isObjectMap() -> handleObjectProperty(
                    property,
                    builderClassBuilder
                )

                else -> handleOtherProperty(property, builderClassBuilder)
            }
        }

        // finish off build() function
        buildFnBuilder.addStatement("return cdkBuilder.build()")
        builderClassBuilder.addFunction(buildFnBuilder.build())
    }

    private fun BuilderProperty.isList() =
        (type.classifier as KClass<*>).isSubclassOf(List::class)

    private fun BuilderProperty.typeArgument() =
        type.arguments[0].type?.asTypeName() ?: ANY

    private fun BuilderProperty.isListOfBuildable(registry: CdkClassRegistry) =
        isList() && type.arguments[0].type != null && registry.isBuildable(type.arguments[0].type!!)

    private fun BuilderProperty.isObjectMap(): Boolean {
        val kClass = type.classifier as KClass<*>
        if (!kClass.isSubclassOf(Map::class)) {
            return false
        }

        if (type.arguments.size != 2) {
            return false
        }

        if (!type.arguments[0].toString().startsWith("kotlin.String")) {
            return false
        }
        return type.arguments[1].toString().startsWith("*")
    }

    private fun BuilderProperty.isObject() = type.toString().startsWith("kotlin.Any")

    private fun handleObjectProperty(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder
    ) {
        val mapBuilderClass = ClassName("cloudshift.awscdk.common", "MapBuilder")
        val lambdaTypeName = LambdaTypeName.get(
            mapBuilderClass,
            returnType = UNIT
        )

        // DSL setter
        builderClassBuilder.addFunction(
            FunSpec.builder(prop.name)
                .addParameter(
                    ParameterSpec.builder("block", lambdaTypeName)
                        .defaultValue("{}")
                        .build()
                )
                .addStatement("val builder = %T()", mapBuilderClass)
                .addStatement("builder.apply(block)")
                .addStatement("cdkBuilder.%N(builder.map)", prop.name)
                .build()
        )

        // existing setter
        builderClassBuilder.addFunction(
            FunSpec.builder(prop.name)
                .addParameter(prop.name, prop.type.asTypeName())
                .addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
                .build()
        )
    }

    private fun handleBuildable(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder,
        registry: CdkClassRegistry,
        overloaded: Boolean
    ) {
        val propClass = registry.lookup(prop.type)!!
        val builderClass = registry.builderTypeFor(propClass)
        val dslBuilderClass = builderClass.dslClassName()
        val lambdaTypeName = LambdaTypeName.get(
            dslBuilderClass,
            returnType = UNIT
        )

        // DSL setter
        if (!overloaded) {
            builderClassBuilder.addFunction(
                FunSpec.builder(prop.name)
                    .addParameter(
                        ParameterSpec.builder("block", lambdaTypeName)
                            .defaultValue("{}")
                            .build()
                    )
                    .addStatement("val builder = %T()", dslBuilderClass)
                    .addStatement("builder.apply(block)")
                    .addStatement("cdkBuilder.%N(builder.build())", prop.name)
                    .build()
            )
        }
        // TODO - handle overloaded methods

        // setter as specified in CDK builder
        builderClassBuilder.addFunction(
            FunSpec.builder(prop.name)
                .addParameter(prop.name, prop.type.asTypeName())
                .addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
                .build()
        )
    }

    private fun handleOtherProperty(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder
    ) {

        // setter as specified in the CDK builder
        builderClassBuilder.addFunction(
            FunSpec.builder(prop.name)
                .addParameter(prop.name, prop.type.asTypeName())
                .addStatement("cdkBuilder.%N(%N)", prop.name, prop.name)
                .build()
        )
    }

    private fun handleListProperty(
        prop: BuilderProperty,
        builderClassBuilder: TypeSpec.Builder,
        buildFnBuilder: FunSpec.Builder
    ) {
        val argType = prop.typeArgument()

        val collectionName = "_${prop.name}"
        builderClassBuilder.addProperty(
            PropertySpec.builder(
                collectionName,
                MUTABLE_LIST.parameterizedBy(argType),
                KModifier.PRIVATE
            ).initializer("mutableListOf()")
                .build()
        )

        if (prop.isListOfBuildable(registry)) {
            /*
            fun statement( block : StatementBuilder.() -> Unit ) {
                statements.add( StatementBuilder().apply(block).build() )
            }
          */
            val propClass = registry.lookup(argType.toString())
            val builderClass = registry.builderTypeFor(propClass).dslClassName()
            val lambdaTypeName = LambdaTypeName.get(
                builderClass,
                returnType = UNIT
            )
            //val name = builderClass.simpleName.decapitalize().removeSuffix("Builder")
            builderClassBuilder.addFunction(
                FunSpec.builder(prop.name)
                    .addParameter(
                        ParameterSpec.builder(prop.name, lambdaTypeName)
                            .build()
                    )
                    .addStatement(
                        "%N.add(%T().apply(%N).build())",
                        collectionName,
                        builderClass,
                        prop.name
                    )
                    .build()
            )
        } else {
            builderClassBuilder.addFunction(
                FunSpec.builder(prop.name)
                    .addParameter(prop.name, argType, KModifier.VARARG)
                    .addStatement("%N.addAll(listOf(*%N))", collectionName, prop.name)
                    .build()
            )
        }

        builderClassBuilder.addFunction(
            FunSpec.builder(prop.name)
                .addParameter(prop.name, COLLECTION.parameterizedBy(argType))
                .addStatement("%N.addAll(%N)", collectionName, prop.name)
                .build()
        )

        // delegate to CDK builder
        buildFnBuilder
            .addStatement("if(%N.isNotEmpty()) cdkBuilder.%N(%N)", collectionName, prop.name, collectionName)
    }
}
