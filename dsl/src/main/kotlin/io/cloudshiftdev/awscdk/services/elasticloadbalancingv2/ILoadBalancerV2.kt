package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ILoadBalancerV2 : IResource {
    /**
     * The canonical hosted zone ID of this load balancer.
     *
     * Example value: `Z2P70J7EXAMPLE`
     */
    public fun loadBalancerCanonicalHostedZoneId(): String

    /**
     * The DNS name of this load balancer.
     *
     * Example value: `my-load-balancer-424835706.us-west-2.elb.amazonaws.com`
     */
    public fun loadBalancerDnsName(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2,
    ) : ILoadBalancerV2 {
        /**
         * Apply the given removal policy to this resource.
         *
         * The Removal Policy controls what happens to this resource when it stops being managed by
         * CloudFormation, either because you've removed it from the CDK application or because
         * you've made a change that requires the resource to be replaced.
         *
         * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS account for
         * data recovery and cleanup later (`RemovalPolicy.RETAIN`).
         *
         * @param policy
         */
        override fun applyRemovalPolicy(policy: RemovalPolicy) {
            unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
        }

        /**
         * The environment this resource belongs to.
         *
         * For resources that are created and managed by the CDK (generally, those created by
         * creating new class instances like Role, Bucket, etc.), this is always the same as the
         * environment of the stack they belong to; however, for imported resources (those obtained
         * from static methods like fromRoleArn, fromBucketName, etc.), that might be different than
         * the stack they were imported into.
         */
        override fun env(): ResourceEnvironment =
            unwrap(this).getEnv().let(ResourceEnvironment::wrap)

        /**
         * The canonical hosted zone ID of this load balancer.
         *
         * Example value: `Z2P70J7EXAMPLE`
         */
        override fun loadBalancerCanonicalHostedZoneId(): String =
            unwrap(this).getLoadBalancerCanonicalHostedZoneId()

        /**
         * The DNS name of this load balancer.
         *
         * Example value: `my-load-balancer-424835706.us-west-2.elb.amazonaws.com`
         */
        override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
        ): ILoadBalancerV2 = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ILoadBalancerV2
        ): software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2 =
            (wrapped as Wrapper).cdkObject
    }
}
