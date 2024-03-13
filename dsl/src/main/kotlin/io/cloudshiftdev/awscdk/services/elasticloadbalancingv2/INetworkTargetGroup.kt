package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface INetworkTargetGroup : ITargetGroup {
  public fun addTarget(arg0: INetworkLoadBalancerTarget)

  public fun metrics(): INetworkTargetGroupMetrics

  public fun registerListener(arg0: INetworkListener)

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup,
  ) : INetworkTargetGroup {
    public override fun addTarget(arg0: INetworkLoadBalancerTarget) {
      unwrap(this).addTarget(arg0.let(INetworkLoadBalancerTarget::unwrap))
    }

    public override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

    public override fun loadBalancerAttached(): IDependable =
        unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

    public override fun metrics(): INetworkTargetGroupMetrics =
        unwrap(this).getMetrics().let(INetworkTargetGroupMetrics::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun registerListener(arg0: INetworkListener) {
      unwrap(this).registerListener(arg0.let(INetworkListener::unwrap))
    }

    public override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

    public override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup):
        INetworkTargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup = (wrapped as
        Wrapper).cdkObject
  }
}
