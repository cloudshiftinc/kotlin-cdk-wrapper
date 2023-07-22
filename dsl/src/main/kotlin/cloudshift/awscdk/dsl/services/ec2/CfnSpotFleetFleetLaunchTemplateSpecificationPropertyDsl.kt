@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder =
      CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder()

  /**
   * @param launchTemplateId The ID of the launch template.
   * You must specify the `LaunchTemplateId` or the `LaunchTemplateName` , but not both.
   */
  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  /**
   * @param launchTemplateName The name of the launch template.
   * You must specify the `LaunchTemplateName` or the `LaunchTemplateId` , but not both.
   */
  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  /**
   * @param version The version number of the launch template. 
   * Specifying `$Latest` or `$Default` for the template version number is not supported. However,
   * you can specify `LatestVersionNumber` or `DefaultVersionNumber` using the `Fn::GetAtt` intrinsic
   * function. For more information, see
   * [Fn::GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#aws-resource-ec2-launchtemplate-return-values-fn--getatt)
   * .
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty = cdkBuilder.build()
}
