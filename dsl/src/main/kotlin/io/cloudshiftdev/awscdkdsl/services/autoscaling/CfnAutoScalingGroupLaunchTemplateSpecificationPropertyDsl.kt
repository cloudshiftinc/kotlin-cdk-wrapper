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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

/**
 * Specifies a launch template to use when provisioning EC2 instances for an Auto Scaling group.
 *
 * You must specify the following:
 * * The ID or the name of the launch template, but not both.
 * * The version of the launch template.
 *
 * `LaunchTemplateSpecification` is property of the
 * [AWS::AutoScaling::AutoScalingGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
 * resource. It is also a property of the
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplate.html)
 * and
 * [AWS::AutoScaling::AutoScalingGroup LaunchTemplateOverrides](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplateoverrides.html)
 * property types.
 *
 * For information about creating a launch template, see
 * [AWS::EC2::LaunchTemplate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 * and
 * [Create a launch template for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * For examples of launch templates, see
 * [Create launch templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-ec2-launch-templates.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * LaunchTemplateSpecificationProperty launchTemplateSpecificationProperty =
 * LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder =
        CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder()

    /**
     * @param launchTemplateId The ID of the launch template. You must specify the
     *   `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
     */
    public fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
    }

    /**
     * @param launchTemplateName The name of the launch template. You must specify the
     *   `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param version The version number of the launch template. Specifying `$Latest` or `$Default`
     *   for the template version number is not supported. However, you can specify
     *   `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic function.
     *   For more information, see
     *   [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
     *   .
     *
     * For an example of using the `Fn::GetAtt` function, see the
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#aws-resource-autoscaling-autoscalinggroup--examples)
     * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
     */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnAutoScalingGroup.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
