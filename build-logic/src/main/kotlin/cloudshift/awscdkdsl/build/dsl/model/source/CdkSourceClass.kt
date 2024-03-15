package cloudshift.awscdkdsl.build.dsl.model.source

import com.fasterxml.jackson.annotation.JsonIgnore
import com.squareup.kotlinpoet.ClassName

data class CdkSourceClass(
    val className: ClassName,
    val methods: List<CdkSourceMethod>,
    val comment: String?
) {
    fun methodFor(name: String): CdkSourceMethod? {
        return methods.firstOrNull { it.name == name }
    }
}

data class CdkSourceMethod(val name: String, val parameterNames : List<String>, val comment: String?) {
    @get:JsonIgnore
    val parameterCount: Int
        get() = parameterNames.size
}
