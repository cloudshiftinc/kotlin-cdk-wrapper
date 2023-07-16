@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetFleetLaunchTemplateSpecificationPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder =
      CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.builder()

  public fun launchTemplateId(launchTemplateId: String) {
    cdkBuilder.launchTemplateId(launchTemplateId)
  }

  public fun launchTemplateName(launchTemplateName: String) {
    cdkBuilder.launchTemplateName(launchTemplateName)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnSpotFleet.FleetLaunchTemplateSpecificationProperty = cdkBuilder.build()
}
