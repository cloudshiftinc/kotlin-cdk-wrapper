package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface Ec2TaskDefinitionAttributes : CommonTaskDefinitionAttributes {
  public interface Builder {
    public fun executionRole(executionRole: IRole) {
    }

    public fun networkMode(networkMode: NetworkMode) {
    }

    public fun taskDefinitionArn(taskDefinitionArn: String) {
    }

    public fun taskRole(taskRole: IRole) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes.Builder
        = software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes.builder()

    public override fun executionRole(executionRole: IRole) {
      cdkBuilder.executionRole(executionRole.let(IRole::unwrap))
    }

    public override fun networkMode(networkMode: NetworkMode) {
      cdkBuilder.networkMode(networkMode.let(NetworkMode::unwrap))
    }

    public override fun taskDefinitionArn(taskDefinitionArn: String) {
      cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public override fun taskRole(taskRole: IRole) {
      cdkBuilder.taskRole(taskRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Ec2TaskDefinitionAttributes,
  ) : Ec2TaskDefinitionAttributes {
    public override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    public override fun networkMode(): NetworkMode? =
        unwrap(this).getNetworkMode()?.let(NetworkMode::wrap)

    public override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    public override fun taskRole(): IRole? = unwrap(this).getTaskRole()?.let(IRole::wrap)
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
