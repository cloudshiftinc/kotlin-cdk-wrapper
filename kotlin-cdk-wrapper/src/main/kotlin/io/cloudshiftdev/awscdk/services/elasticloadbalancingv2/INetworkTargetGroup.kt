@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A network target group.
 */
public interface INetworkTargetGroup : ITargetGroup {
  /**
   * Add a load balancing target to this target group.
   *
   * @param targets 
   */
  public fun addTarget(targets: INetworkLoadBalancerTarget)

  /**
   * All metrics available for this target group.
   */
  public fun metrics(): INetworkTargetGroupMetrics

  /**
   * Register a listener that is load balancing to this target group.
   *
   * Don't call this directly. It will be called by listeners.
   *
   * @param listener 
   */
  public fun registerListener(listener: INetworkListener)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup):
        INetworkTargetGroup = CdkObjectWrappers.wrap(cdkObject) as INetworkTargetGroup

    internal fun unwrap(wrapped: INetworkTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
  }
}
