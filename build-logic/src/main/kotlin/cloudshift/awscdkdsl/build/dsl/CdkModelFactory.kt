package cloudshift.awscdkdsl.build.dsl


import cloudshift.awscdkdsl.build.dsl.model.BuilderFactoryFunction
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.CdkDsl
import cloudshift.awscdkdsl.build.dsl.model.CdkModel
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName

internal object CdkModelFactory {
    fun createModel(cdkClasses: List<CdkClass>): CdkModel {

        val classMap = cdkClasses.associateBy { it.className }

        val builderClasses = cdkClasses.filter { cdkClass -> cdkClass.isBuilder() }.sortedBy { it.className }

        // map of builder classname to buildable class
        val buildersToBuildables = builderClasses.associate { builderClass ->
            val buildMethod = builderClass.publicMemberFunctions.single {
                it.name == "build" && it.parameters.isEmpty()
            }
            val returnType = buildMethod.returnType
            builderClass.className to (classMap[returnType] ?: error("Unable to resolve $returnType"))
        }

        // map of buildable classname to builder class
        val buildablesToBuilders = builderClasses.associateBy { builderClass ->
            val buildMethod = builderClass.publicMemberFunctions.single {
                it.name == "build" && it.parameters.isEmpty()
            }
            val returnType = buildMethod.returnType
            (classMap[returnType] ?: error("Unable to resolve $returnType")).className
        }

        val builders = builderClasses.map { builderClass ->
            val buildableClass =
                buildersToBuildables[builderClass.className] ?: error("Cannot find buildable for ${builderClass.className}")
            val builderFactoryFunction = findBuilderFactoryFunction(builderClass, buildableClass)

            CdkBuilder(
                buildableClass = buildableClass,
                cdkBuilderClass = builderClass,
                builderFactoryFunction = builderFactoryFunction,
                properties = findBuilderProperties(builderClass, buildablesToBuilders),
            )
        }

        return CdkModel(classes = cdkClasses, builders = builders, buildablesToBuilders = buildablesToBuilders)
    }
}

private fun findBuilderFactoryFunction(builderClass: CdkClass, buildableClass: CdkClass): BuilderFactoryFunction {
    return builderFactoryFunctionLocators.firstNotNullOfOrNull { it(builderClass, buildableClass) }
        ?: error("Cannot find builder factory function $builderClass $buildableClass")
}

private val builderFactoryFunctionLocators = listOf(

    // static builder() on buildable type
    { _: CdkClass, buildableClass: CdkClass ->
        buildableClass.publicStaticFunctions
            .filter { it.name == "builder" }
            .map {
                BuilderFactoryFunction(
                    className = buildableClass.className,
                    functionName = it.name,
                    parameters = it.parameters,

                    )
            }
            .firstOrNull()
    },

    // static create() on builder type
    { builderClass: CdkClass, _: CdkClass ->
        builderClass.publicStaticFunctions
            .filter { it.name == "create" }
            .map {
                BuilderFactoryFunction(
                    className = builderClass.className,
                    functionName = it.name,
                    parameters = it.parameters,
                )
            }
            .firstOrNull()
    },
)


private fun findBuilderProperties(
    builderClass: CdkClass,
    buildersForBuildable: Map<ClassName, CdkClass>,
): List<BuilderProperty> {
    val candidates = builderClass.publicMemberFunctions
        .filter { it.name !in excludedMembers && it.parameters.isNotEmpty() }

    require(candidates.all { it.parameters.size == 1 }) { "Expected builder methods with a single parameter" }

    return candidates.map { method ->
        val parameter = method.parameters[0]
        val type = parameter.type
        val actualType = when (type) {
            is ParameterizedTypeName -> type.typeArguments[0]
            else -> parameter.type
        }
        val propertyBuilderClass = buildersForBuildable[actualType]

        "${method.name}/${parameter.type}" to BuilderProperty(
            name = parameter.name,
            type = parameter.type,
            builderClass = propertyBuilderClass,
            methodSignature = method.signature,
            deprecated = method.deprecated,
        )
    }.sortedBy { it.first }.map { it.second }
}

private val excludedMembers = setOf("build", "equals")


internal fun ClassName.dslClassName(): ClassName {
    val newName = "${simpleNames.filterNot { it == "Builder" }.joinToString("")}Dsl"

    return ClassName(packageName.replace(CdkDsl.cdkPackageName, CdkDsl.packageName), newName)
}

