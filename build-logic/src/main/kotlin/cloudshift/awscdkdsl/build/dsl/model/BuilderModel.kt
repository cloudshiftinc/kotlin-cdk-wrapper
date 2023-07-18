package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.CdkClassRegistry
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.isSubclassOf

internal data class Parameter(val name: String, val type: TypeName)

internal data class Builder(
    val buildableClass: ClassName,
    val dslBuilderClass: ClassName,
    val cdkBuilderClass: ClassName,
    val builderFactoryFunction : BuilderFactoryFunction,
    val properties : List<BuilderProperty>
)

internal data class BuilderFactoryFunction(
    val className : ClassName,
    val functionName : String,
    val parameters : List<Parameter>
)

internal data class BuilderProperty(
    val name: String,
    val type: KType
) {
    fun typeName() : TypeName = type.asTypeName()

    fun isList() =
        (type.classifier as KClass<*>).isSubclassOf(List::class)

    fun typeArgument() =
        type.arguments[0].type?.asTypeName() ?: ANY

    fun isListOfBuildable(registry: CdkClassRegistry) =
        isList() && type.arguments[0].type != null && registry.isBuildable(type.arguments[0].type!!)

    fun isObjectMap(): Boolean {
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

    fun isObject() = type.toString().startsWith("kotlin.Any")

}

// compensate for lack of parameter names for ones we can infer
internal fun List<Parameter>.inferArgumentNames() : List<Parameter> {
    return when (size) {
        2 -> when {
            this[0].name == "arg0" &&
                this[0].type.toString().contains("Construct") &&
                this[1].name == "arg1" &&
                this[1].type.toString().contains("String") -> map {
                it.copy(
                    name = when (it.name) {
                        "arg0" -> "scope"
                        "arg1" -> "id"
                        else -> it.name
                    }
                )
            }

            else -> this
        }

        else -> this
    }
}
