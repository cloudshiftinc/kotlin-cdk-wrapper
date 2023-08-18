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
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

/**
 * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows
 * instances to create pre-provisioned snapshots.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * FastLaunchLaunchTemplateSpecificationProperty fastLaunchLaunchTemplateSpecificationProperty =
 * FastLaunchLaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .launchTemplateVersion("launchTemplateVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html)
 */
@CdkDslMarker
public class CfnDistributionConfigurationFastLaunchLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder:
        CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.Builder =
        CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.builder()

    /**
     * @param launchTemplateId The ID of the launch template to use for faster launching for a
     *   Windows AMI.
     */
    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName The name of the launch template to use for faster launching for a
     *   Windows AMI.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param launchTemplateVersion The version of the launch template to use for faster launching
     *   for a Windows AMI.
     */
    public fun launchTemplateVersion(launchTemplateVersion: String) {
        cdkBuilder.launchTemplateVersion(launchTemplateVersion)
    }

    public fun build(): CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty =
        cdkBuilder.build()
}
