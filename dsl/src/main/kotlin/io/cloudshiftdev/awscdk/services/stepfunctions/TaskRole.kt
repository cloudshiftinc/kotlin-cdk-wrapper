package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String

public abstract class TaskRole internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
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
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
  ) : TaskRole(cdkObject)

  public companion object {
    public fun fromRole(role: IRole): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRole(role.let(IRole::unwrap)).let(TaskRole::wrap)

    public fun fromRoleArnJsonPath(expression: String): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRoleArnJsonPath(expression).let(TaskRole::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole): TaskRole =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskRole): software.amazon.awscdk.services.stepfunctions.TaskRole =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.TaskRole
  }
}
