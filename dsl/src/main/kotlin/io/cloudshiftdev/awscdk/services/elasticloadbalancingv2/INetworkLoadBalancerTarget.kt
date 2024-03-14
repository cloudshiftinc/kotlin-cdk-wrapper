package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject

public interface INetworkLoadBalancerTarget {
  /**
   * Attach load-balanced target to a TargetGroup.
   *
   * May return JSON to directly add to the [Targets] list, or return undefined
   * if the target will register itself with the load balancer.
   *
   * @param targetGroup 
   */
  public fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup): LoadBalancerTargetProps

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget,
  ) : CdkObject(cdkObject), INetworkLoadBalancerTarget {
    /**
     * Attach load-balanced target to a TargetGroup.
     *
     * May return JSON to directly add to the [Targets] list, or return undefined
     * if the target will register itself with the load balancer.
     *
     * @param targetGroup 
     */
    override fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget):
        INetworkLoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkLoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
  }
}
