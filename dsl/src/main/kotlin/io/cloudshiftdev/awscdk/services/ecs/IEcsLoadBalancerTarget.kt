package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps

public interface IEcsLoadBalancerTarget :
    IApplicationLoadBalancerTarget, INetworkLoadBalancerTarget, ILoadBalancerTarget {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget,
    ) : IEcsLoadBalancerTarget {
        /**
         * Attach load-balanced target to a TargetGroup.
         *
         * May return JSON to directly add to the [Targets] list, or return undefined if the target
         * will register itself with the load balancer.
         *
         * @param targetGroup
         */
        override fun attachToApplicationTargetGroup(
            targetGroup: IApplicationTargetGroup
        ): LoadBalancerTargetProps =
            unwrap(this)
                .attachToApplicationTargetGroup(targetGroup.let(IApplicationTargetGroup::unwrap))
                .let(LoadBalancerTargetProps::wrap)

        /**
         * Attach load-balanced target to a classic ELB.
         *
         * @param loadBalancer [disable-awslint:ref-via-interface] The load balancer to attach the
         *   target to.
         */
        override fun attachToClassicLb(loadBalancer: LoadBalancer) {
            unwrap(this).attachToClassicLB(loadBalancer.let(LoadBalancer::unwrap))
        }

        /**
         * Attach load-balanced target to a TargetGroup.
         *
         * May return JSON to directly add to the [Targets] list, or return undefined if the target
         * will register itself with the load balancer.
         *
         * @param targetGroup
         */
        override fun attachToNetworkTargetGroup(
            targetGroup: INetworkTargetGroup
        ): LoadBalancerTargetProps =
            unwrap(this)
                .attachToNetworkTargetGroup(targetGroup.let(INetworkTargetGroup::unwrap))
                .let(LoadBalancerTargetProps::wrap)

        /** The network connections associated with this resource. */
        override fun connections(): Connections =
            unwrap(this).getConnections().let(Connections::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget
        ): IEcsLoadBalancerTarget = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IEcsLoadBalancerTarget
        ): software.amazon.awscdk.services.ecs.IEcsLoadBalancerTarget =
            (wrapped as Wrapper).cdkObject
    }
}
