package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.dslClassName
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName

internal data class CdkBuilder(
    val buildableClass: CdkClass2,
    val cdkBuilderClass: CdkClass2,
    val builderFactoryFunction: BuilderFactoryFunction2,
    val properties: List<BuilderProperty2>,
) {
    val dslBuilderClass = cdkBuilderClass.className.dslClassName()
}
