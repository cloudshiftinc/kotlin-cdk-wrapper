@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * A reference to an existing task definition.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
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
public interface TaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  /**
   * What launch types this task definition should be compatible with.
   *
   * Default: Compatibility.EC2_AND_FARGATE
   */
  public fun compatibility(): Compatibility? =
      unwrap(this).getCompatibility()?.let(Compatibility::wrap)

  /**
   * A builder for [TaskDefinitionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibility What launch types this task definition should be compatible with.
     */
    public fun compatibility(compatibility: Compatibility)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes.Builder =
        software.amazon.awscdk.services.ecs.TaskDefinitionAttributes.builder()

    /**
     * @param compatibility What launch types this task definition should be compatible with.
     */
    override fun compatibility(compatibility: Compatibility) {
      cdkBuilder.compatibility(compatibility.let(Compatibility.Companion::unwrap))
    }

    /**
     * @param executionRole The IAM role that grants containers and Fargate agents permission to
     * make AWS API calls on your behalf.
     * Some tasks do not have an execution role.
     */
    override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param networkMode The networking mode to use for the containers in the task.
     */
    override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode.Companion::unwrap))
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
      cdkBuilder.taskRole(taskRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.TaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes,
  ) : CdkObject(cdkObject), TaskDefinitionAttributes {
    /**
     * What launch types this task definition should be compatible with.
     *
     * Default: Compatibility.EC2_AND_FARGATE
     */
    override fun compatibility(): Compatibility? =
        unwrap(this).getCompatibility()?.let(Compatibility::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): TaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TaskDefinitionAttributes):
        TaskDefinitionAttributes = CdkObjectWrappers.wrap(cdkObject) as? TaskDefinitionAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.TaskDefinitionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.TaskDefinitionAttributes
  }
}
