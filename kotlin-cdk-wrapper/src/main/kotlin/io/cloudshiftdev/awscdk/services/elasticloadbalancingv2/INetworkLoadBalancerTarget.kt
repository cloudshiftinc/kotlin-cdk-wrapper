@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject

public interface INetworkLoadBalancerTarget {
  public fun attachToNetworkTargetGroup(arg0: INetworkTargetGroup): LoadBalancerTargetProps

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget,
  ) : CdkObject(cdkObject), INetworkLoadBalancerTarget {
    override fun attachToNetworkTargetGroup(arg0: INetworkTargetGroup): LoadBalancerTargetProps =
        unwrap(this).attachToNetworkTargetGroup(arg0.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
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
