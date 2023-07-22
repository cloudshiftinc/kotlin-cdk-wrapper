@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

/**
 * Information about blue/green deployment options for a deployment group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * BlueGreenDeploymentConfigurationProperty blueGreenDeploymentConfigurationProperty =
 * BlueGreenDeploymentConfigurationProperty.builder()
 * .deploymentReadyOption(DeploymentReadyOptionProperty.builder()
 * .actionOnTimeout("actionOnTimeout")
 * .waitTimeInMinutes(123)
 * .build())
 * .greenFleetProvisioningOption(GreenFleetProvisioningOptionProperty.builder()
 * .action("action")
 * .build())
 * .terminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOptionProperty.builder()
 * .action("action")
 * .terminationWaitTimeInMinutes(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-bluegreendeploymentconfiguration.html)
 */
@CdkDslMarker
public class CfnDeploymentGroupBlueGreenDeploymentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.Builder =
      CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty.builder()

  /**
   * @param deploymentReadyOption Information about the action to take when newly provisioned
   * instances are ready to receive traffic in a blue/green deployment.
   */
  public fun deploymentReadyOption(deploymentReadyOption: IResolvable) {
    cdkBuilder.deploymentReadyOption(deploymentReadyOption)
  }

  /**
   * @param deploymentReadyOption Information about the action to take when newly provisioned
   * instances are ready to receive traffic in a blue/green deployment.
   */
  public
      fun deploymentReadyOption(deploymentReadyOption: CfnDeploymentGroup.DeploymentReadyOptionProperty) {
    cdkBuilder.deploymentReadyOption(deploymentReadyOption)
  }

  /**
   * @param greenFleetProvisioningOption Information about how instances are provisioned for a
   * replacement environment in a blue/green deployment.
   */
  public fun greenFleetProvisioningOption(greenFleetProvisioningOption: IResolvable) {
    cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption)
  }

  /**
   * @param greenFleetProvisioningOption Information about how instances are provisioned for a
   * replacement environment in a blue/green deployment.
   */
  public
      fun greenFleetProvisioningOption(greenFleetProvisioningOption: CfnDeploymentGroup.GreenFleetProvisioningOptionProperty) {
    cdkBuilder.greenFleetProvisioningOption(greenFleetProvisioningOption)
  }

  /**
   * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
   * instances in the original fleet during a blue/green deployment.
   */
  public
      fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: IResolvable) {
    cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess)
  }

  /**
   * @param terminateBlueInstancesOnDeploymentSuccess Information about whether to terminate
   * instances in the original fleet during a blue/green deployment.
   */
  public
      fun terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess: CfnDeploymentGroup.BlueInstanceTerminationOptionProperty) {
    cdkBuilder.terminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess)
  }

  public fun build(): CfnDeploymentGroup.BlueGreenDeploymentConfigurationProperty =
      cdkBuilder.build()
}
