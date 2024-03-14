package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public interface INetworkLoadBalancerTarget {
    /**
     * Attach load-balanced target to a TargetGroup.
     *
     * May return JSON to directly add to the [Targets] list, or return undefined if the target will
     * register itself with the load balancer.
     *
     * @param targetGroup
     */
    public fun attachToNetworkTargetGroup(targetGroup: INetworkTargetGroup): LoadBalancerTargetProps

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget,
    ) : INetworkLoadBalancerTarget {
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
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
        ): INetworkLoadBalancerTarget = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: INetworkLoadBalancerTarget
        ): software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget =
            (wrapped as Wrapper).cdkObject
    }
}
