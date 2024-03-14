package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String
import kotlin.collections.List

public interface IFairshareSchedulingPolicy : ISchedulingPolicy {
  public fun computeReservation(): Number? = unwrap(this).getComputeReservation()

  public fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

  public fun shares(): List<Share>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy,
  ) : IFairshareSchedulingPolicy {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun schedulingPolicyArn(): String = unwrap(this).getSchedulingPolicyArn()

    public override fun schedulingPolicyName(): String = unwrap(this).getSchedulingPolicyName()

    public override fun shareDecay(): Duration? = unwrap(this).getShareDecay()?.let(Duration::wrap)

    public override fun shares(): List<Share> = unwrap(this).getShares().map(Share::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy):
        IFairshareSchedulingPolicy = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFairshareSchedulingPolicy):
        software.amazon.awscdk.services.batch.IFairshareSchedulingPolicy = (wrapped as
        Wrapper).cdkObject
  }
}
