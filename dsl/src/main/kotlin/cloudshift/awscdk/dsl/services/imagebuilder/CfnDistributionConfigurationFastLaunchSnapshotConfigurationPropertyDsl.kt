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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import kotlin.Number

@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchSnapshotConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.Builder =
        CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.builder()

    public fun targetResourceCount(targetResourceCount: Number) {
        cdkBuilder.targetResourceCount(targetResourceCount)
    }

    public fun build(): CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty =
        cdkBuilder.build()
}
