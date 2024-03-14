package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface IComputeEnvironment : IResource {
  public fun computeEnvironmentArn(): String

  public fun computeEnvironmentName(): String

  public fun enabled(): Boolean

  public fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IComputeEnvironment,
  ) : IComputeEnvironment {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

    public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

    public override fun enabled(): Boolean = unwrap(this).getEnabled()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IComputeEnvironment):
        IComputeEnvironment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IComputeEnvironment):
        software.amazon.awscdk.services.batch.IComputeEnvironment = (wrapped as Wrapper).cdkObject
  }
}
