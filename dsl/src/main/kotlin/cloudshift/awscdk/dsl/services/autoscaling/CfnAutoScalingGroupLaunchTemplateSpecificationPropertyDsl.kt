@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.Builder =
      CfnAutoScalingGroup.LaunchTemplateSpecificationProperty.builder()

  /**
   * @param launchTemplateId The ID of the launch template.
   * You must specify the `LaunchTemplateID` or the `LaunchTemplateName` , but not both.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param launchTemplateName The name of the launch template.
   * You must specify the `LaunchTemplateName` or the `LaunchTemplateID` , but not both.
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * @param version The version number of the launch template. 
   * Specifying `$Latest` or `$Default` for the template version number is not supported. However,
   * you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic
   * function. For more information, see
   * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
   * .
   *
   *
   * For an example of using the `Fn::GetAtt` function, see the
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#aws-properties-as-group--examples)
   * section of the `AWS::AutoScaling::AutoScalingGroup` resource.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnAutoScalingGroup.LaunchTemplateSpecificationProperty = cdkBuilder.build()
}
