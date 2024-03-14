package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String

public abstract class TaskRole internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
) {
  public open fun resource(): String = unwrap(this).getResource()

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole,
  ) : TaskRole(cdkObject)

  public companion object {
    public open fun fromRole(role: IRole): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRole(role.let(IRole::unwrap)).let(TaskRole::wrap)

    public open fun fromRoleArnJsonPath(expression: String): TaskRole =
        software.amazon.awscdk.services.stepfunctions.TaskRole.fromRoleArnJsonPath(expression).let(TaskRole::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.TaskRole): TaskRole =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskRole): software.amazon.awscdk.services.stepfunctions.TaskRole =
        (wrapped as Wrapper).cdkObject
  }
}
