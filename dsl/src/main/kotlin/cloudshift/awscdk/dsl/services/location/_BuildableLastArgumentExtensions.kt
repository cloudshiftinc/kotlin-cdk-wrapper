@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.location

import kotlin.Unit
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnPlaceIndex

/** Specifies the data storage option requesting Places. */
public inline fun CfnPlaceIndex.setDataSourceConfiguration(
    block: CfnPlaceIndexDataSourceConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPlaceIndexDataSourceConfigurationPropertyDsl()
    builder.apply(block)
    return setDataSourceConfiguration(builder.build())
}

/**
 * Specifies the `MapConfiguration` , including the map style, for the map resource that you create.
 */
public inline fun CfnMap.setConfiguration(
    block: CfnMapMapConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMapMapConfigurationPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}
