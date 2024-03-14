package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface ITaskDefinition : IResource {
  public fun compatibility(): Compatibility

  public fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

  public fun isEc2Compatible(): Boolean

  public fun isExternalCompatible(): Boolean

  public fun isFargateCompatible(): Boolean

  public fun networkMode(): NetworkMode

  public fun taskDefinitionArn(): String

  public fun taskRole(): IRole

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinition,
  ) : ITaskDefinition {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun compatibility(): Compatibility =
        unwrap(this).getCompatibility().let(Compatibility::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun executionRole(): IRole? = unwrap(this).getExecutionRole()?.let(IRole::wrap)

    override fun isEc2Compatible(): Boolean = unwrap(this).getIsEc2Compatible()

    override fun isExternalCompatible(): Boolean = unwrap(this).getIsExternalCompatible()

    override fun isFargateCompatible(): Boolean = unwrap(this).getIsFargateCompatible()

    override fun networkMode(): NetworkMode = unwrap(this).getNetworkMode().let(NetworkMode::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()

    override fun taskRole(): IRole = unwrap(this).getTaskRole().let(IRole::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ITaskDefinition):
        ITaskDefinition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITaskDefinition):
        software.amazon.awscdk.services.ecs.ITaskDefinition = (wrapped as Wrapper).cdkObject
  }
}
