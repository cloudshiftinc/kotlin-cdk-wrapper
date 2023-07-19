package cloudshift.awscdkdsl.build.dsl

import cloudshift.awscdkdsl.build.dsl.model.Builder
import cloudshift.awscdkdsl.build.dsl.model.BuilderFactoryFunction
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty
import cloudshift.awscdkdsl.build.dsl.model.Parameter
import cloudshift.awscdkdsl.build.dsl.model.inferArgumentNames
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.KType
import kotlin.reflect.KVisibility
import kotlin.reflect.full.findAnnotations
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.staticFunctions
import kotlin.reflect.full.valueParameters

internal data class CdkClassRegistry(
    val classes: List<CdkClass>,
    private val typeMap: Map<KClass<*>, CdkClass>,
    private val buildableMap: Map<CdkClass, Pair<CdkClass, CdkClass>>,
    private val buildableClasses: Set<KClass<*>>,
) {
    companion object {
        fun create(classes: List<CdkClass>): CdkClassRegistry {
            val typeMap = classes.associateBy { it.kClass }

            val buildableMap = classes.asSequence()
                .filter { it.simpleBuilder() }
                .map {
                    Pair(
                        it,
                        typeMap[it.builderType()]!!
                    )
                }
                .associateBy { it.second }

            val buildableClasses = buildableMap.entries.map { it.value.second.kClass }.toSet()
            return CdkClassRegistry(
                classes,
                typeMap,
                buildableMap,
                buildableClasses,
            )
        }
    }

    fun builderTypeFor(cdkClass: CdkClass): CdkClass {
        return buildableMap[cdkClass]!!.first
    }

    fun isBuildable(kType: KType): Boolean = kType.classifier as KClass<*> in buildableClasses

    fun lookup(kClass: KClass<*>): CdkClass? = typeMap[kClass]

    fun lookup(kClass: KType): CdkClass? = lookup(kClass.classifier as KClass<*>)
    fun lookup(name: String): CdkClass {
        return classes.first { it.qualifiedName == name }
    }

    fun allBuilders(): List<Builder> {
        return classes.asSequence()
            .filter { it.builder }
            .map { builderClass ->
                val buildableClass =
                    typeMap[builderClass.builderType()] ?: error("Not able to find buildable class for $builderClass")
                val properties = findBuilderProperties(builderClass)
                val builderFactoryFunction = findBuilderFactoryFunction(builderClass, buildableClass)
                Builder(
                    buildableClass = buildableClass.className,
                    dslBuilderClass = builderClass.dslClassName(),
                    cdkBuilderClass = builderClass.className,
                    builderFactoryFunction = builderFactoryFunction,
                    properties = properties
                )
            }.toList()
    }


    private fun findBuilderFactoryFunction(builderClass: CdkClass, buildableClass: CdkClass): BuilderFactoryFunction {
        return builderCreationResolvers.firstNotNullOfOrNull { it(builderClass, buildableClass) }
            ?: error("Unable to locate builder factory function for $builderClass / $buildableClass")
    }

    private val builderCreationResolvers = listOf(

        // static builder() on buildable type
        { _: CdkClass, buildableClass: CdkClass ->
            buildableClass.kClass.staticFunctions
                .filter { it.name == "builder" && it.visibility == KVisibility.PUBLIC }
                .map {
                    BuilderFactoryFunction(
                        className = buildableClass.className,
                        functionName = it.name,
                        parameters = it.valueParameters.toParameters().inferArgumentNames()
                    )
                }
                .firstOrNull()
        },

        // static create() on builder type
        { builderClass: CdkClass, _: CdkClass ->
            builderClass.kClass.staticFunctions
                .filter { it.name == "create" && it.visibility == KVisibility.PUBLIC }
                .map {
                    BuilderFactoryFunction(
                        className = builderClass.className,
                        functionName = it.name,
                        parameters = it.valueParameters.toParameters().inferArgumentNames()
                    )
                }
                .firstOrNull()
        }
    )

    private fun List<KParameter>.toParameters(): List<Parameter> = map { it.toParameter() }
    private fun KParameter.toParameter(): Parameter {
        return Parameter(name = this.name ?: "<unknown>", type = this.type.asTypeName())
    }

    private fun findBuilderProperties(builderClass: CdkClass): List<BuilderProperty> {
        builderClass.kClass.memberFunctions.forEach {
            require(it.valueParameters.size < 2) { "More than one parameter $it" }
        }
        return builderClass.kClass.memberFunctions
            .filter { it.name !in excludedMembers && it.valueParameters.isNotEmpty() }
            .map {
                val parameter = it.valueParameters[0]
                it.toString() to BuilderProperty(it.name,parameter.type) }
            .sortedBy { it.first }
            .map { it.second }
    }

    private val excludedMembers = setOf("build", "equals")


    internal data class ConstructBuilder(val builder: CdkClass, val buildable: CdkClass)
}
