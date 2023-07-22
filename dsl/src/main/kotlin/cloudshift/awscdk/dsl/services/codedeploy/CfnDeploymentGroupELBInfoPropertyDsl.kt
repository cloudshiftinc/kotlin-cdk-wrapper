@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupELBInfoPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.ELBInfoProperty.Builder =
      CfnDeploymentGroup.ELBInfoProperty.builder()

  /**
   * @param name For blue/green deployments, the name of the load balancer that is used to route
   * traffic from original instances to replacement instances in a blue/green deployment.
   * For in-place deployments, the name of the load balancer that instances are deregistered from so
   * they are not serving traffic during a deployment, and then re-registered with after the deployment
   * is complete.
   *
   *
   * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDeploymentGroup.ELBInfoProperty = cdkBuilder.build()
}
