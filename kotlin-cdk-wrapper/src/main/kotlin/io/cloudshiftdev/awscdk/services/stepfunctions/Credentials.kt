@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Specifies a target role assumed by the State Machine's execution role for invoking the task's
 * resource.
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
public interface Credentials {
  /**
   * The role to be assumed for executing the Task.
   */
  public fun role(): TaskRole

  /**
   * A builder for [Credentials]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param role The role to be assumed for executing the Task. 
     */
    public fun role(role: TaskRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.Credentials.Builder =
        software.amazon.awscdk.services.stepfunctions.Credentials.builder()

    /**
     * @param role The role to be assumed for executing the Task. 
     */
    override fun role(role: TaskRole) {
      cdkBuilder.role(role.let(TaskRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.Credentials =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.Credentials,
  ) : CdkObject(cdkObject),
      Credentials {
    /**
     * The role to be assumed for executing the Task.
     */
    override fun role(): TaskRole = unwrap(this).getRole().let(TaskRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Credentials {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Credentials):
        Credentials = CdkObjectWrappers.wrap(cdkObject) as? Credentials ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Credentials):
        software.amazon.awscdk.services.stepfunctions.Credentials = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.stepfunctions.Credentials
  }
}
