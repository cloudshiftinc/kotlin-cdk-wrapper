package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISchedulingPolicy : IResource {
  public fun schedulingPolicyArn(): String

  public fun schedulingPolicyName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.ISchedulingPolicy,
  ) : ISchedulingPolicy {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

    public override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.ISchedulingPolicy):
        ISchedulingPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchedulingPolicy):
        software.amazon.awscdk.services.batch.ISchedulingPolicy = (wrapped as Wrapper).cdkObject
  }
}
