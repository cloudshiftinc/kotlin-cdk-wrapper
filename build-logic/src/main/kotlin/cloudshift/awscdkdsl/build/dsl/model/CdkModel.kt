package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal data class CdkModel(
    val classes: List<CdkClass>,
    val builders: List<CdkBuilder>,
    private val buildablesToBuilders: Map<ClassName, CdkClass>
) {
    fun builderClassFor(type: TypeName) = buildablesToBuilders[type]
}
