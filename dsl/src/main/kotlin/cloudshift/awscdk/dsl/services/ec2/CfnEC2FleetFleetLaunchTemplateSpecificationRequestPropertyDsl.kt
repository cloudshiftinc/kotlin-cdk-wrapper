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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * Specifies the launch template to be used by the EC2 Fleet for configuring Amazon EC2 instances.
 *
 * You must specify the following:
 * * The ID or the name of the launch template, but not both.
 * * The version of the launch template.
 *
 * `FleetLaunchTemplateSpecificationRequest` is a property of the
 * [FleetLaunchTemplateConfigRequest](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html)
 * property type.
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
 * FleetLaunchTemplateSpecificationRequestProperty fleetLaunchTemplateSpecificationRequestProperty =
 * FleetLaunchTemplateSpecificationRequestProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html)
 */
@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl {
    private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder =
        CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder()

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
     * @param version The launch template version number, `$Latest` , or `$Default` . You must
     *   specify a value, otherwise the request fails. If the value is `$Latest` , Amazon EC2 uses
     *   the latest version of the launch template.
     *
     * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty =
        cdkBuilder.build()
}
