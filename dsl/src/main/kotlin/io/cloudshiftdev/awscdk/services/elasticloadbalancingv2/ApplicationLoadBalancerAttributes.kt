package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ApplicationLoadBalancerAttributes {
    /** ARN of the load balancer. */
    public fun loadBalancerArn(): String

    /**
     * The canonical hosted zone ID of this load balancer.
     *
     * Default: - When not provided, LB cannot be used as Route53 Alias target.
     */
    public fun loadBalancerCanonicalHostedZoneId(): String? =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    /**
     * The DNS name of this load balancer.
     *
     * Default: - When not provided, LB cannot be used as Route53 Alias target.
     */
    public fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

    /**
     * Whether the security group allows all outbound traffic or not.
     *
     * Unless set to `false`, no egress rules will be added to the security group.
     *
     * Default: true
     */
    public fun securityGroupAllowsAllOutbound(): Boolean? =
        unwrap(this).getSecurityGroupAllowsAllOutbound()

    /** ID of the load balancer's security group. */
    public fun securityGroupId(): String

    /**
     * The VPC this load balancer has been created in, if available.
     *
     * Default: - If the Load Balancer was imported and a VPC was not specified, the VPC is not
     * available.
     */
    public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /** A builder for [ApplicationLoadBalancerAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param loadBalancerArn ARN of the load balancer. */
        public fun loadBalancerArn(loadBalancerArn: String)

        /**
         * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load
         *   balancer.
         */
        public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String)

        /** @param loadBalancerDnsName The DNS name of this load balancer. */
        public fun loadBalancerDnsName(loadBalancerDnsName: String)

        /**
         * @param securityGroupAllowsAllOutbound Whether the security group allows all outbound
         *   traffic or not. Unless set to `false`, no egress rules will be added to the security
         *   group.
         */
        public fun securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound: Boolean)

        /** @param securityGroupId ID of the load balancer's security group. */
        public fun securityGroupId(securityGroupId: String)

        /** @param vpc The VPC this load balancer has been created in, if available. */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes.Builder =
            software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes
                .builder()

        /** @param loadBalancerArn ARN of the load balancer. */
        override fun loadBalancerArn(loadBalancerArn: String) {
            cdkBuilder.loadBalancerArn(loadBalancerArn)
        }

        /**
         * @param loadBalancerCanonicalHostedZoneId The canonical hosted zone ID of this load
         *   balancer.
         */
        override fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
            cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
        }

        /** @param loadBalancerDnsName The DNS name of this load balancer. */
        override fun loadBalancerDnsName(loadBalancerDnsName: String) {
            cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
        }

        /**
         * @param securityGroupAllowsAllOutbound Whether the security group allows all outbound
         *   traffic or not. Unless set to `false`, no egress rules will be added to the security
         *   group.
         */
        override fun securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound: Boolean) {
            cdkBuilder.securityGroupAllowsAllOutbound(securityGroupAllowsAllOutbound)
        }

        /** @param securityGroupId ID of the load balancer's security group. */
        override fun securityGroupId(securityGroupId: String) {
            cdkBuilder.securityGroupId(securityGroupId)
        }

        /** @param vpc The VPC this load balancer has been created in, if available. */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes,
    ) : ApplicationLoadBalancerAttributes {
        /** ARN of the load balancer. */
        override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

        /**
         * The canonical hosted zone ID of this load balancer.
         *
         * Default: - When not provided, LB cannot be used as Route53 Alias target.
         */
        override fun loadBalancerCanonicalHostedZoneId(): String? =
            unwrap(this).getLoadBalancerCanonicalHostedZoneId()

        /**
         * The DNS name of this load balancer.
         *
         * Default: - When not provided, LB cannot be used as Route53 Alias target.
         */
        override fun loadBalancerDnsName(): String? = unwrap(this).getLoadBalancerDnsName()

        /**
         * Whether the security group allows all outbound traffic or not.
         *
         * Unless set to `false`, no egress rules will be added to the security group.
         *
         * Default: true
         */
        override fun securityGroupAllowsAllOutbound(): Boolean? =
            unwrap(this).getSecurityGroupAllowsAllOutbound()

        /** ID of the load balancer's security group. */
        override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

        /**
         * The VPC this load balancer has been created in, if available.
         *
         * Default: - If the Load Balancer was imported and a VPC was not specified, the VPC is not
         * available.
         */
        override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): ApplicationLoadBalancerAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes
        ): ApplicationLoadBalancerAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ApplicationLoadBalancerAttributes
        ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
