@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget

/**
 * Interface for ECS load balancer target.
 */
public interface IEcsLoadBalancerTarget : IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget, ILoadBalancerTarget {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget):
        IEcsLoadBalancerTarget = CdkObjectWrappers.wrap(cdkObject) as IEcsLoadBalancerTarget

    internal fun unwrap(wrapped: IEcsLoadBalancerTarget):
        software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget
  }
}
