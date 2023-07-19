package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.model.BuilderFactoryFunction2
import cloudshift.awscdkdsl.build.dsl.model.BuilderProperty2
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal data class CdkBuilder(
    val buildableClass: TypeName,
    val dslBuilderClass: ClassName,
    val cdkBuilderClass: ClassName,
    val builderFactoryFunction: BuilderFactoryFunction2,
    val properties: List<BuilderProperty2>,
)
