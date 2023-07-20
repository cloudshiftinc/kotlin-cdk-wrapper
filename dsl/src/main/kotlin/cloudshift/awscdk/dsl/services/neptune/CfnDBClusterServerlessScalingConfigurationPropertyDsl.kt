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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.neptune.CfnDBCluster
import kotlin.Number

@CdkDslMarker
public class CfnDBClusterServerlessScalingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder =
        CfnDBCluster.ServerlessScalingConfigurationProperty.builder()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnDBCluster.ServerlessScalingConfigurationProperty = cdkBuilder.build()
}
