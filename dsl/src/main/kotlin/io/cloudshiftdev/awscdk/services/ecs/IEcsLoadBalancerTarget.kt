package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps

public interface IEcsLoadBalancerTarget : IApplicationLoadBalancerTarget,
    INetworkLoadBalancerTarget, ILoadBalancerTarget {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget,
  ) : IEcsLoadBalancerTarget {
    override fun attachToApplicationTargetGroup(arg0: IApplicationTargetGroup):
        LoadBalancerTargetProps =
        unwrap(this).attachToApplicationTargetGroup(arg0.let(IApplicationTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

    override fun attachToClassicLb(arg0: LoadBalancer) {
      unwrap(this).attachToClassicLB(arg0.let(LoadBalancer::unwrap))
    }

    override fun attachToNetworkTargetGroup(arg0: INetworkTargetGroup): LoadBalancerTargetProps =
        unwrap(this).attachToNetworkTargetGroup(arg0.let(INetworkTargetGroup::unwrap)).let(LoadBalancerTargetProps::wrap)

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget):
        IEcsLoadBalancerTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEcsLoadBalancerTarget):
        software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget = (wrapped as Wrapper).cdkObject
  }
}
