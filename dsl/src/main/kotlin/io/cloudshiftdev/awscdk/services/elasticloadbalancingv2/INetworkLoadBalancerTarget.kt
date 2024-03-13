package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public interface INetworkLoadBalancerTarget {
  public fun attachToNetworkTargetGroup(arg0: INetworkTargetGroup): LoadBalancerTargetProps

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget,
  ) : INetworkLoadBalancerTarget {
    public override fun attachToNetworkTargetGroup(arg0: INetworkTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToNetworkTargetGroup(arg0.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget):
        INetworkLoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkLoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget = (wrapped
        as Wrapper).cdkObject
  }
}
