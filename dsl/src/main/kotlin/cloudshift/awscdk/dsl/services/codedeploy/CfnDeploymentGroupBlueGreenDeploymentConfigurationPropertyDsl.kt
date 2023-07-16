@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder =
      CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.builder()

  public fun deploymentReadyOption(deploymentReadyOption: IResolvable) {
    cdkBuilder.deploymentReadyOption(deploymentReadyOption)
  }

  public
      fun deploymentReadyOption(deploymentReadyOption: CfnDeploymentGroup.DeploymentReadyOptionProperty) {
    cdkBuilder.deploymentReadyOption(deploymentReadyOption)
  }

  public fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable) {
    cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption)
  }

  public
      fun greenFleetProvisioningOption(greenFleetProvisioningOption: CfnDeploymentGroup.GreenFleetProvisioningOptionProperty) {
    cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption)
  }

  public
      fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable) {
    cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess)
  }

  public
      fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: CfnDeploymentGroup.BlueInstanceTerminationOptionProperty) {
    cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess)
  }

  public fun build(): CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty =
      cdkBuilder.build()
}
