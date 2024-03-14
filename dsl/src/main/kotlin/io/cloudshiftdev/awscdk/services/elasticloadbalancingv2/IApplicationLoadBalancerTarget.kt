package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

public interface IApplicationLoadBalancerTarget {
    /**
     * Attach load-balanced target to a TargetGroup.
     *
     * May return JSON to directly add to the [Targets] list, or return undefined if the target will
     * register itself with the load balancer.
     *
     * @param targetGroup
     */
    public fun attachToApplicationTargetGroup(
        targetGroup: IApplicationTargetGroup
    ): LoadBalancerTargetProps

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget,
    ) : IApplicationLoadBalancerTarget {
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
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget
        ): IApplicationLoadBalancerTarget = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IApplicationLoadBalancerTarget
        ): software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget =
            (wrapped as Wrapper).cdkObject
    }
}
