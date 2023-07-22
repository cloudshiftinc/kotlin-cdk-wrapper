@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateSpecificationRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder =
      CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.builder()

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
   * @param version The launch template version number, `$Latest` , or `$Default` . You must specify
   * a value, otherwise the request fails. 
   * If the value is `$Latest` , Amazon EC2 uses the latest version of the launch template.
   *
   * If the value is `$Default` , Amazon EC2 uses the default version of the launch template.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty =
      cdkBuilder.build()
}
