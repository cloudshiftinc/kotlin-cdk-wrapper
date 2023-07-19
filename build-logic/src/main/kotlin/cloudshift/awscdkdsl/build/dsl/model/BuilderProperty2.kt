package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.*

internal data class BuilderProperty2(
    val name: String,
    val type: TypeName,
    val builderClass: CdkClass2?,
    val methodSignature: String,
) {
    fun typeName(): TypeName = type

    fun isList(): Boolean {
        return when (type) {
            is ParameterizedTypeName -> type.rawType == LIST
            is ClassName -> type == LIST
            else -> false
        }
    }

    fun isObjectMap(): Boolean {
        return when (type) {
            is ParameterizedTypeName -> {
                type.rawType == MAP && type.typeArguments.size == 2 && type.typeArguments[0] == STRING && type.typeArguments[1] == ANY
            }
            else -> false
        }
    }

    fun isObject() = type == ANY
}
