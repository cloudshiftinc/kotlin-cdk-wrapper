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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.CfnDBCluster
import kotlin.Number

@CdkDslMarker
public class CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder =
        CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnDBCluster.ServerlessV2ScalingConfigurationProperty = cdkBuilder.build()
}
