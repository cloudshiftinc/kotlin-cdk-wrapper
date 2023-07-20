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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl {
    private val cdkBuilder: CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder =
        CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun launchTemplate(launchTemplate: CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    public fun maxParallelLaunches(maxParallelLaunches: Number) {
        cdkBuilder.maxParallelLaunches(maxParallelLaunches)
    }

    public fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration)
    }

    public fun snapshotConfiguration(snapshotConfiguration: CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration)
    }

    public fun build(): CfnDistributionConfiguration.FastLaunchConfigurationProperty =
        cdkBuilder.build()
}
