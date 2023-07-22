@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.Compatibility
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.ecs.TaskDefinitionAttributes
import software.amazon.awscdk.services.iam.IRole

/**
 * A reference to an existing task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * TaskDefinitionAttributes taskDefinitionAttributes = TaskDefinitionAttributes.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .compatibility(Compatibility.EC2)
 * .executionRole(role)
 * .networkMode(NetworkMode.NONE)
 * .taskRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class TaskDefinitionAttributesDsl {
  private val cdkBuilder: TaskDefinitionAttributes.Builder = TaskDefinitionAttributes.builder()

  /**
   * @param compatibility What launch types this task definition should be compatible with.
   */
  public fun compatibility(compatibility: Compatibility) {
    cdkBuilder.compatibility(compatibility)
  }

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

  public fun build(): TaskDefinitionAttributes = cdkBuilder.build()
}
