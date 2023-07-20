@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupGreenFleetProvisioningOptionPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.Builder =
      CfnDeploymentGroup.GreenFleetProvisioningOptionProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnDeploymentGroup.GreenFleetProvisioningOptionProperty = cdkBuilder.build()
}
