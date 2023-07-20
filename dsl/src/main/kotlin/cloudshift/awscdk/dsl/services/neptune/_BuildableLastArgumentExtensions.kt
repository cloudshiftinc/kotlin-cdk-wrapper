@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.neptune

import software.amazon.awscdk.services.neptune.CfnDBCluster
import kotlin.Unit

public inline fun CfnDBCluster.setServerlessScalingConfiguration(
    block: CfnDBClusterServerlessScalingConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDBClusterServerlessScalingConfigurationPropertyDsl()
    builder.apply(block)
    return setServerlessScalingConfiguration(builder.build())
}
