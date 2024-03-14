package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface INetworkLoadBalancer :
    ILoadBalancerV2, IVpcEndpointServiceLoadBalancer, IConnectable {
    /**
     * Add a listener to this load balancer.
     *
     * @param id
     * @param props
     * @return The newly created listener
     */
    public fun addListener(id: String, props: BaseNetworkListenerProps): NetworkListener

    /**
     * Add a listener to this load balancer.
     *
     * @param id
     * @param props
     * @return The newly created listener
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
    public fun addListener(
        id: String,
        props: BaseNetworkListenerProps.Builder.() -> Unit
    ): NetworkListener

    /**
     * The type of IP addresses to use.
     *
     * Default: IpAddressType.IPV4
     */
    public fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /** All metrics available for this load balancer. */
    public fun metrics(): INetworkLoadBalancerMetrics

    /** Security groups associated with this load balancer. */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /** The VPC this load balancer has been created in (if available). */
    public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer,
    ) : INetworkLoadBalancer {
        /**
         * Add a listener to this load balancer.
         *
         * @param id
         * @param props
         * @return The newly created listener
         */
        override fun addListener(id: String, props: BaseNetworkListenerProps): NetworkListener =
            unwrap(this)
                .addListener(id, props.let(BaseNetworkListenerProps::unwrap))
                .let(NetworkListener::wrap)

        /**
         * Add a listener to this load balancer.
         *
         * @param id
         * @param props
         * @return The newly created listener
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
        override fun addListener(
            id: String,
            props: BaseNetworkListenerProps.Builder.() -> Unit
        ): NetworkListener = addListener(id, BaseNetworkListenerProps(props))

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

        /** The network connections associated with this resource. */
        override fun connections(): Connections =
            unwrap(this).getConnections().let(Connections::wrap)

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
         * The type of IP addresses to use.
         *
         * Default: IpAddressType.IPV4
         */
        override fun ipAddressType(): IpAddressType? =
            unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

        /** The ARN of the load balancer that hosts the VPC Endpoint Service. */
        override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

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

        /** All metrics available for this load balancer. */
        override fun metrics(): INetworkLoadBalancerMetrics =
            unwrap(this).getMetrics().let(INetworkLoadBalancerMetrics::wrap)

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** Security groups associated with this load balancer. */
        override fun securityGroups(): List<String> =
            unwrap(this).getSecurityGroups() ?: emptyList()

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

        /** The VPC this load balancer has been created in (if available). */
        override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
        ): INetworkLoadBalancer = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: INetworkLoadBalancer
        ): software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer =
            (wrapped as Wrapper).cdkObject
    }
}
