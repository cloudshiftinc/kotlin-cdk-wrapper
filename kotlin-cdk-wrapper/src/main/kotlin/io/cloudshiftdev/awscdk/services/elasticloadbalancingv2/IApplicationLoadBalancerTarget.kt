@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject

/**
 * Interface for constructs that can be targets of an application load balancer.
 */
public interface IApplicationLoadBalancerTarget {
  /**
   * Attach load-balanced target to a TargetGroup.
   *
   * May return JSON to directly add to the [Targets] list, or return undefined
   * if the target will register itself with the load balancer.
   *
   * @param targetGroup 
   */
  public fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
      LoadBalancerTargetProps

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget,
  ) : CdkObject(cdkObject), IApplicationLoadBalancerTarget {
    /**
     * Attach load-balanced target to a TargetGroup.
     *
     * May return JSON to directly add to the [Targets] list, or return undefined
     * if the target will register itself with the load balancer.
     *
     * @param targetGroup 
     */
    override fun attachToApplicationTargetGroup(targetGroup: IApplicationTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)
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
