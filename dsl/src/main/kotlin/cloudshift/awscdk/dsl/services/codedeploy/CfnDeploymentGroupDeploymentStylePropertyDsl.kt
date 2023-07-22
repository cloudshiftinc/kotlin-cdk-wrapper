@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupDeploymentStylePropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.DeploymentStyleProperty.Builder =
      CfnDeploymentGroup.DeploymentStyleProperty.builder()

  /**
   * @param deploymentOption Indicates whether to route deployment traffic behind a load balancer.
   *
   * An Amazon EC2 Application Load Balancer or Network Load Balancer is required for an Amazon ECS
   * deployment.
   */
  public fun deploymentOption(deploymentOption: String) {
    cdkBuilder.deploymentOption(deploymentOption)
  }

  /**
   * @param deploymentType Indicates whether to run an in-place or blue/green deployment.
   */
  public fun deploymentType(deploymentType: String) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun build(): CfnDeploymentGroup.DeploymentStyleProperty = cdkBuilder.build()
}
