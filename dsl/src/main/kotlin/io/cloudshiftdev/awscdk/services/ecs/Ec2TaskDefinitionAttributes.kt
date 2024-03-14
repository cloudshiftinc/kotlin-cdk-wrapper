package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface Ec2TaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  /**
   * A builder for [Ec2TaskDefinitionAttributes]
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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes.Builder
        = software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes,
  ) : Ec2TaskDefinitionAttributes {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Ec2TaskDefinitionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes):
        Ec2TaskDefinitionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Ec2TaskDefinitionAttributes):
        software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
