package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.MAP
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeName

internal data class BuilderProperty(
    val name: String,
    val type: TypeName,
    val deprecated: Boolean,
    val builderClass: CdkClass?,
    val methodSignature: String,
    val comment: String?
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
