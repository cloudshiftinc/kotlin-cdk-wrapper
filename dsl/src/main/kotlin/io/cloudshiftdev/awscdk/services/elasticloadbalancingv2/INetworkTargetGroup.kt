package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface INetworkTargetGroup : ITargetGroup {
    /**
     * Add a load balancing target to this target group.
     *
     * @param targets
     */
    public fun addTarget(targets: INetworkLoadBalancerTarget)

    /** All metrics available for this target group. */
    public fun metrics(): INetworkTargetGroupMetrics

    /**
     * Register a listener that is load balancing to this target group.
     *
     * Don't call this directly. It will be called by listeners.
     *
     * @param listener
     */
    public fun registerListener(listener: INetworkListener)

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup,
    ) : INetworkTargetGroup {
        /**
         * Add a load balancing target to this target group.
         *
         * @param targets
         */
        override fun addTarget(targets: INetworkLoadBalancerTarget) {
            unwrap(this).addTarget(targets.let(INetworkLoadBalancerTarget::unwrap))
        }

        /**
         * A token representing a list of ARNs of the load balancers that route traffic to this
         * target group.
         */
        override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

        /** Return an object to depend on the listeners added to this target group. */
        override fun loadBalancerAttached(): IDependable =
            unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

        /** All metrics available for this target group. */
        override fun metrics(): INetworkTargetGroupMetrics =
            unwrap(this).getMetrics().let(INetworkTargetGroupMetrics::wrap)

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /**
         * Register a listener that is load balancing to this target group.
         *
         * Don't call this directly. It will be called by listeners.
         *
         * @param listener
         */
        override fun registerListener(listener: INetworkListener) {
            unwrap(this).registerListener(listener.let(INetworkListener::unwrap))
        }

        /** ARN of the target group. */
        override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

        /** The name of the target group. */
        override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
        ): INetworkTargetGroup = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: INetworkTargetGroup
        ): software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup =
            (wrapped as Wrapper).cdkObject
    }
}
