package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import kotlin.reflect.KType

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
    val name : String,
    val type : KType,
)

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
