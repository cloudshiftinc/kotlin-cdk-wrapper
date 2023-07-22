@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder =
      CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.builder()

  /**
   * @param action The action to take on instances in the original environment after a successful
   * blue/green deployment.
   * * `TERMINATE` : Instances are terminated after a specified wait time.
   * * `KEEP_ALIVE` : Instances are left running after they are deregistered from the load balancer
   * and removed from the deployment group.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param terminationWaitTimeInMinutes For an Amazon EC2 deployment, the number of minutes to wait
   * after a successful blue/green deployment before terminating instances from the original
   * environment.
   * For an Amazon ECS deployment, the number of minutes before deleting the original (blue) task
   * set. During an Amazon ECS deployment, CodeDeploy shifts traffic from the original (blue) task set
   * to a replacement (green) task set.
   *
   * The maximum setting is 2880 minutes (2 days).
   */
  public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
    cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
  }

  public fun build(): CfnDeploymentGroup.BlueInstanceTerminationOptionProperty = cdkBuilder.build()
}
