@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.FargateTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class FargateTaskDefinitionAttributesDsl {
  private val cdkBuilder: FargateTaskDefinitionAttributes.Builder =
      FargateTaskDefinitionAttributes.builder()

  /**
   * @param executionRole The IAM role that grants containers and Fargate agents permission to make
   * AWS API calls on your behalf.
   * Some tasks do not have an execution role.
   */
  public fun executionRole(executionRole: IRole) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param networkMode The networking mode to use for the containers in the task.
   */
  public fun networkMode(networkMode: NetworkMode) {
    cdkBuilder.networkMode(networkMode)
  }

  /**
   * @param taskDefinitionArn The arn of the task definition. 
   */
  public fun taskDefinitionArn(taskDefinitionArn: String) {
    cdkBuilder.taskDefinitionArn(taskDefinitionArn)
  }

  /**
   * @param taskRole The name of the IAM role that grants containers in the task permission to call
   * AWS APIs on your behalf.
   */
  public fun taskRole(taskRole: IRole) {
    cdkBuilder.taskRole(taskRole)
  }

  public fun build(): FargateTaskDefinitionAttributes = cdkBuilder.build()
}
