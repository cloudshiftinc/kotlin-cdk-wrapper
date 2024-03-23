@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Attributes used to import an existing External task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * ExternalTaskDefinitionAttributes externalTaskDefinitionAttributes =
 * ExternalTaskDefinitionAttributes.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .executionRole(role)
 * .networkMode(NetworkMode.NONE)
 * .taskRole(role)
 * .build();
 * ```
 */
public interface ExternalTaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  /**
   * A builder for [ExternalTaskDefinitionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param executionRole The IAM role that grants containers and Fargate agents permission to
     * make AWS API calls on your behalf.
     * Some tasks do not have an execution role.
     */
    public fun executionRole(executionRole: IRole)

    /**
     * @param networkMode The networking mode to use for the containers in the task.
     */
    public fun networkMode(networkMode: NetworkMode)

    /**
     * @param taskDefinitionArn The arn of the task definition. 
     */
    public fun taskDefinitionArn(taskDefinitionArn: String)

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    public fun taskRole(taskRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes.Builder =
        software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes.builder()

    /**
     * @param executionRole The IAM role that grants containers and Fargate agents permission to
     * make AWS API calls on your behalf.
     * Some tasks do not have an execution role.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    /**
     * @param networkMode The networking mode to use for the containers in the task.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    /**
     * @param taskDefinitionArn The arn of the task definition. 
     */
    override fun taskDefinitionArn(taskDefinitionArn: String) {
      cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    /**
     * @param taskRole The name of the IAM role that grants containers in the task permission to
     * call AWS APIs on your behalf.
     */
    override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes,
  ) : CdkObject(cdkObject), ExternalTaskDefinitionAttributes {
    /**
     * The IAM role that grants containers and Fargate agents permission to make AWS API calls on
     * your behalf.
     *
     * Some tasks do not have an execution role.
     *
     * Default: - undefined
     */
    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    /**
     * The networking mode to use for the containers in the task.
     *
     * Default: Network mode cannot be provided to the imported task.
     */
    override fun networkMode(): NetworkMode? = unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    /**
     * The arn of the task definition.
     */
    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    /**
     * The name of the IAM role that grants containers in the task permission to call AWS APIs on
     * your behalf.
     *
     * Default: Permissions cannot be granted to the imported task.
     */
    override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalTaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes):
        ExternalTaskDefinitionAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        ExternalTaskDefinitionAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalTaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes
  }
}
