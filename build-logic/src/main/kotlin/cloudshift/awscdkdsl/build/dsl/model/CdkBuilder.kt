package cloudshift.awscdkdsl.build.dsl.model

import cloudshift.awscdkdsl.build.dsl.dslClassName

internal data class CdkBuilder(
    val buildableClass: CdkClass,
    val cdkBuilderClass: CdkClass,
    val builderFactoryFunction: BuilderFactoryFunction,
    val properties: List<BuilderProperty>
) {
    val dslBuilderClass = cdkBuilderClass.className.dslClassName()
}
