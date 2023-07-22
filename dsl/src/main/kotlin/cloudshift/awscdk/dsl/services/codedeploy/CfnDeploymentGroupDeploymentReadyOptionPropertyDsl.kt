@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupDeploymentReadyOptionPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder =
      CfnDeploymentGroup.DeploymentReadyOptionProperty.builder()

  /**
   * @param actionOnTimeout Information about when to reroute traffic from an original environment
   * to a replacement environment in a blue/green deployment.
   * * CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new
   * application revision is installed on the instances in the replacement environment.
   * * STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting
   * is started using
   * [ContinueDeployment](https://docs.aws.amazon.com/codedeploy/latest/APIReference/API_ContinueDeployment.html)
   * . If traffic rerouting is not started before the end of the specified wait period, the deployment
   * status is changed to Stopped.
   */
  public fun actionOnTimeout(actionOnTimeout: String) {
    cdkBuilder.actionOnTimeout(actionOnTimeout)
  }

  /**
   * @param waitTimeInMinutes The number of minutes to wait before the status of a blue/green
   * deployment is changed to Stopped if rerouting is not started manually.
   * Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout` .
   */
  public fun waitTimeInMinutes(waitTimeInMinutes: Number) {
    cdkBuilder.waitTimeInMinutes(waitTimeInMinutes)
  }

  public fun build(): CfnDeploymentGroup.DeploymentReadyOptionProperty = cdkBuilder.build()
}
