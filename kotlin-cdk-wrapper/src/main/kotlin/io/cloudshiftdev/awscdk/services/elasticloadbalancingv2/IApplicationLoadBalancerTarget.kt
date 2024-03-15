@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IApplicationLoadBalancerTarget {
  public fun attachToApplicationTargetGroup(arg0: IApplicationTargetGroup): LoadBalancerTargetProps

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget,
  ) : CdkObject(cdkObject), IApplicationLoadBalancerTarget {
    override fun attachToApplicationTargetGroup(arg0: IApplicationTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToApplicationTargetGroup(arg0.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget):
        IApplicationLoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancerTarget):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
  }
}
