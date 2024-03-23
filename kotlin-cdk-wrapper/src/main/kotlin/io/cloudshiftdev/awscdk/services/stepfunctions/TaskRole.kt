@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String

/**
 * Role to be assumed by the State Machine's execution role for invoking a task's resource.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function submitLambda;
 * Role iamRole;
 * // use a fixed role for all task invocations
 * TaskRole role = TaskRole.fromRole(iamRole);
 * // or use a json expression to resolve the role at runtime based on task inputs
 * //const role = sfn.TaskRole.fromRoleArnJsonPath('$.RoleArn');
 * LambdaInvoke submitJob = LambdaInvoke.Builder.create(this, "Submit Job")
 * .lambdaFunction(submitLambda)
 * .outputPath("$.Payload")
 * // use credentials
 * .credentials(Credentials.builder().role(role).build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-task-state.html#task-state-fields)
 */
public abstract class TaskRole(
  cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
) : CdkObject(cdkObject) {
  /**
   * Retrieves the resource for use in IAM Policies for this TaskRole.
   */
  public open fun resource(): String = unwrap(this).getResource()

  /**
   * Retrieves the roleArn for this TaskRole.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
  ) : TaskRole(cdkObject)

  public companion object {
    public fun fromRole(role: IRole): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRole(role.let(IRole::unwrap)).let(TaskRole::wrap)

    public fun fromRoleArnJsonPath(expression: String): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRoleArnJsonPath(expression).let(TaskRole::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole): TaskRole =
        CdkObjectWrappers.wrap(cdkObject) as? TaskRole ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskRole): software.amazon.awscdk.services.stepfunctions.TaskRole =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.TaskRole
  }
}
