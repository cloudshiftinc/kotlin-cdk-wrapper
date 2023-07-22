package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName

internal data class BuilderFactoryFunction(
    val className: ClassName,
    val functionName: String,
    val parameters: List<CdkClass.Method.Parameter>
)
