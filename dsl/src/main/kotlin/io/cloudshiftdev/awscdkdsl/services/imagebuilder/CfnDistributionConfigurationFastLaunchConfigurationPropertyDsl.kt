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

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * The Windows faster-launching configuration to use for AMI distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * FastLaunchConfigurationProperty fastLaunchConfigurationProperty =
 * FastLaunchConfigurationProperty.builder()
 * .accountId("accountId")
 * .enabled(false)
 * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .launchTemplateVersion("launchTemplateVersion")
 * .build())
 * .maxParallelLaunches(123)
 * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
 * .targetResourceCount(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchConfigurationPropertyDsl {
    private val cdkBuilder: CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder =
        CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

    /** @param accountId The owner account ID for the fast-launch enabled Windows AMI. */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param enabled A Boolean that represents the current state of faster launching for the
     *   Windows AMI. Set to true to start using Windows faster launching, or false to stop using
     *   it.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean that represents the current state of faster launching for the
     *   Windows AMI. Set to true to start using Windows faster launching, or false to stop using
     *   it.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses when
     *   it launches Windows instances to create pre-provisioned snapshots.
     */
    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses when
     *   it launches Windows instances to create pre-provisioned snapshots.
     */
    public fun launchTemplate(
        launchTemplate: CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
    ) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * @param maxParallelLaunches The maximum number of parallel instances that are launched for
     *   creating resources.
     */
    public fun maxParallelLaunches(maxParallelLaunches: Number) {
        cdkBuilder.maxParallelLaunches(maxParallelLaunches)
    }

    /**
     * @param snapshotConfiguration Configuration settings for managing the number of snapshots that
     *   are created from pre-provisioned instances for the Windows AMI when faster launching is
     *   enabled.
     */
    public fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration)
    }

    /**
     * @param snapshotConfiguration Configuration settings for managing the number of snapshots that
     *   are created from pre-provisioned instances for the Windows AMI when faster launching is
     *   enabled.
     */
    public fun snapshotConfiguration(
        snapshotConfiguration: CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
    ) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration)
    }

    public fun build(): CfnDistributionConfiguration.FastLaunchConfigurationProperty =
        cdkBuilder.build()
}
