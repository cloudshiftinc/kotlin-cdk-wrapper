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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * Specifies the launch template to be used by the Spot Fleet request for configuring Amazon EC2
 * instances.
 *
 * You must specify the following:
 * * The ID or the name of the launch template, but not both.
 * * The version of the launch template.
 *
 * `FleetLaunchTemplateSpecification` is a property of the
 * [AWS::EC2::SpotFleet](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-spotfleet.html)
 * resource.
 *
 * For information about creating a launch template, see
 * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 * and
 * [Create a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html#create-launch-template)
 * in the *Amazon EC2 User Guide* .
 *
 * For examples of launch templates, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate--examples)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * FleetLaunchTemplateSpecificationProperty fleetLaunchTemplateSpecificationProperty =
 * FleetLaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html)
 */
@CdkDslMarker
public class CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder =
        CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder()

    /**
     * @param launchTemplateId The ID of the launch template. You must specify the
     *   `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
     */
    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName The name of the launch template. You must specify the
     *   `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param version The version number of the launch template. Specifying `$Latest` or `$Default`
     *   for the template version number is not supported. However, you can specify
     *   `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic function.
     *   For more information, see
     *   [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
     *   .
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty = cdkBuilder.build()
}
