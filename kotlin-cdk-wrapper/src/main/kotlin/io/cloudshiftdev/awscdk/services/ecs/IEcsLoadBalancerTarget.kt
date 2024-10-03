@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps

/**
 * Interface for ECS load balancer target.
 */
public interface IEcsLoadBalancerTarget : IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget, ILoadBalancerTarget {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget,
  ) : CdkObject(cdkObject),
      IEcsLoadBalancerTarget {
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
        unwrap(this).attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

    /**
     * Attach load-balanced target to a classic ELB.
     *
     * @param loadBalancer [disable-awslint:ref-via-interface] The load balancer to attach the
     * target to. 
     */
    override fun attachToClassicLB(loadBalancer: LoadBalancer) {
      unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer.Companion::unwrap))
    }

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
        unwrap(this).attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup.Companion::unwrap)).let(LoadBalancerTargetProps::wrap)

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget):
        IEcsLoadBalancerTarget = CdkObjectWrappers.wrap(cdkObject) as? IEcsLoadBalancerTarget ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsLoadBalancerTarget):
        software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget
  }
}
