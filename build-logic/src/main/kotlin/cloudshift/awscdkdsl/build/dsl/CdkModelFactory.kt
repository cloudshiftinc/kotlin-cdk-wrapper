package cloudshift.awscdkdsl.build.dsl


import cloudshift.awscdkdsl.build.dsl.model.BuilderFactoryFunction2
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty2
import cloudshift.awscdkdsl.build.dsl.model.CdkBuilder
import cloudshift.awscdkdsl.build.dsl.model.CdkClass2
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName

internal object CdkModelFactory {
    fun createModel(cdkClasses : List<CdkClass2>) : CdkModel {

        val classMap = cdkClasses.associateBy { it.className }

        val builderClasses = cdkClasses.filter { cdkClass ->
            cdkClass.implementsInterface(BuilderInterface)
        }.sortedBy { it.className }

        val buildableClasses = builderClasses.associate { builderClass ->
            val buildMethod = builderClass.publicMemberFunctions.single {
                it.name == "build" && it.parameters.isEmpty()
            }
            val returnType = buildMethod.returnType
            builderClass.className to (classMap[returnType] ?: error("Unable to resolve $returnType"))
        }

        val buildersForBuildable = builderClasses.associateBy { builderClass ->
            val buildMethod = builderClass.publicMemberFunctions.single {
                it.name == "build" && it.parameters.isEmpty()
            }
            val returnType = buildMethod.returnType
            (classMap[returnType] ?: error("Unable to resolve $returnType")).className
        }

        val builders = builderClasses.map { builderClass ->
            val buildableClass =
                buildableClasses[builderClass.className] ?: error("Cannot find buildable for ${builderClass.className}")
            val builderFactoryFunction = findBuilderFactoryFunction(builderClass, buildableClass)

            CdkBuilder(
                buildableClass = buildableClass,
                cdkBuilderClass = builderClass,
                builderFactoryFunction = builderFactoryFunction,
                properties = findBuilderProperties(builderClass, buildersForBuildable),
            )
        }

        return CdkModel(classes = cdkClasses, builders = builders)
    }
}

private val BuilderInterface = ClassName("software.amazon.jsii", listOf("Builder"))


private fun findBuilderFactoryFunction(builderClass: CdkClass2, buildableClass: CdkClass2): BuilderFactoryFunction2 {
    return builderFactoryFunctionLocators.firstNotNullOfOrNull { it(builderClass, buildableClass) }
        ?: error("Cannot find builder factory function $builderClass $buildableClass")
}

private val builderFactoryFunctionLocators = listOf(

    // static builder() on buildable type
    { _: CdkClass2, buildableClass: CdkClass2 ->
        buildableClass.publicStaticFunctions
            .filter { it.name == "builder" }
            .map {
                BuilderFactoryFunction2(
                    className = buildableClass.className,
                    functionName = it.name,
                    parameters = it.parameters,

                    )
            }
            .firstOrNull()
    },

    // static create() on builder type
    { builderClass: CdkClass2, _: CdkClass2 ->
        builderClass.publicStaticFunctions
            .filter { it.name == "create" }
            .map {
                BuilderFactoryFunction2(
                    className = builderClass.className,
                    functionName = it.name,
                    parameters = it.parameters,
                )
            }
            .firstOrNull()
    },
)


internal data class CdkModel(val classes: List<CdkClass2>, val builders: List<CdkBuilder>)


private fun findBuilderProperties(
    builderClass: CdkClass2,
    buildersForBuildable: Map<ClassName, CdkClass2>,
): List<BuilderProperty2> {
    val candidates = builderClass.publicMemberFunctions
        .filter { it.name !in excludedMembers && it.parameters.isNotEmpty() }

    require(candidates.all { it.parameters.size == 1 }) { "Expected builder methods with a single parameter" }

    return candidates.map { method ->
        val parameter = method.parameters[0]
        val type = parameter.type
        val actualType = when(type) {
            is ParameterizedTypeName -> type.typeArguments[0]
            else  -> parameter.type
        }
        val propertyBuilderClass = buildersForBuildable[actualType]

        "${method.name}/${parameter.type}" to BuilderProperty2(
            name = parameter.name,
            type = parameter.type,
            builderClass = propertyBuilderClass,
            methodSignature = method.signature,
            deprecated = method.deprecated
        )
    }.sortedBy { it.first }.map { it.second }
}

private val excludedMembers = setOf("build", "equals")


internal fun ClassName.dslClassName(): ClassName {
    val newName = "${simpleNames.filterNot { it == "Builder" }.joinToString("")}Dsl"

    return ClassName(packageName.replace(CdkDsl.cdkPackageName, CdkDsl.packageName), newName)
}

