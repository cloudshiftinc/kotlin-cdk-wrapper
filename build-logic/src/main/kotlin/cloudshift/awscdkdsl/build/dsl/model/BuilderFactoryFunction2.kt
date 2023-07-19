package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName

internal data class BuilderFactoryFunction2(
    val className: ClassName,
    val functionName: String,
    val parameters: List<CdkClass2.Method.Parameter>,
)
