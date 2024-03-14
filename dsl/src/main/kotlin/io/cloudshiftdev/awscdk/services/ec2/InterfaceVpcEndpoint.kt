package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class InterfaceVpcEndpoint
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint,
) : VpcEndpoint(cdkObject), IInterfaceVpcEndpoint {
    /** Access to network connections. */
    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    /** The date and time the interface VPC endpoint was created. */
    public open fun vpcEndpointCreationTimestamp(): String =
        unwrap(this).getVpcEndpointCreationTimestamp()

    /**
     * The DNS entries for the interface VPC endpoint.
     *
     * Each entry is a combination of the hosted zone ID and the DNS name. The entries are ordered
     * as follows: regional public DNS, zonal public DNS, private DNS, and wildcard DNS. This order
     * is not enforced for AWS Marketplace services.
     *
     * The following is an example. In the first entry, the hosted zone ID is Z1HUB23UULQXV and the
     * DNS name is vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com.
     *
     * ["Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com",
     * "Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3-us-east-1a.ec2.us-east-1.vpce.amazonaws.com",
     * "Z1C12344VYDITB0:ec2.us-east-1.amazonaws.com"]
     *
     * If you update the PrivateDnsEnabled or SubnetIds properties, the DNS entries in the list will
     * change.
     */
    public open fun vpcEndpointDnsEntries(): List<String> = unwrap(this).getVpcEndpointDnsEntries()

    /** The interface VPC endpoint identifier. */
    public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

    /** One or more network interfaces for the interface VPC endpoint. */
    public open fun vpcEndpointNetworkInterfaceIds(): List<String> =
        unwrap(this).getVpcEndpointNetworkInterfaceIds()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.InterfaceVpcEndpoint]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Limit to only those availability zones where the endpoint service can be created.
         *
         * Setting this to 'true' requires a lookup to be performed at synthesis time. Account and
         * region must be set on the containing stack for this to work.
         *
         * Default: false
         *
         * @param lookupSupportedAzs Limit to only those availability zones where the endpoint
         *   service can be created.
         */
        public fun lookupSupportedAzs(lookupSupportedAzs: Boolean)

        /**
         * Whether to automatically allow VPC traffic to the endpoint.
         *
         * If enabled, all traffic to the endpoint from within the VPC will be automatically
         * allowed. This is done based on the VPC's CIDR range.
         *
         * Default: true
         *
         * @param open Whether to automatically allow VPC traffic to the endpoint.
         */
        public fun `open`(`open`: Boolean)

        /**
         * Whether to associate a private hosted zone with the specified VPC.
         *
         * This allows you to make requests to the service using its default DNS hostname.
         *
         * Default: set by the instance of IInterfaceVpcEndpointService, or true if not defined by
         * the instance of IInterfaceVpcEndpointService
         *
         * @param privateDnsEnabled Whether to associate a private hosted zone with the specified
         *   VPC.
         */
        public fun privateDnsEnabled(privateDnsEnabled: Boolean)

        /**
         * The security groups to associate with this interface VPC endpoint.
         *
         * Default: - a new security group is created
         *
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /**
         * The security groups to associate with this interface VPC endpoint.
         *
         * Default: - a new security group is created
         *
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        public fun securityGroups(vararg securityGroups: ISecurityGroup)

        /**
         * The service to use for this interface VPC endpoint.
         *
         * @param service The service to use for this interface VPC endpoint.
         */
        public fun service(service: IInterfaceVpcEndpointService)

        /**
         * The subnets in which to create an endpoint network interface.
         *
         * At most one per availability zone.
         *
         * Default: - private subnets
         *
         * @param subnets The subnets in which to create an endpoint network interface.
         */
        public fun subnets(subnets: SubnetSelection)

        /**
         * The subnets in which to create an endpoint network interface.
         *
         * At most one per availability zone.
         *
         * Default: - private subnets
         *
         * @param subnets The subnets in which to create an endpoint network interface.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d78aef04157c83ec653390dbf7d09f4dc3276cd8641ce21de017f7e4c5b6029d")
        public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

        /**
         * The VPC network in which the interface endpoint will be used.
         *
         * @param vpc The VPC network in which the interface endpoint will be used.
         */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint.Builder =
            software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint.Builder.create(scope, id)

        /**
         * Limit to only those availability zones where the endpoint service can be created.
         *
         * Setting this to 'true' requires a lookup to be performed at synthesis time. Account and
         * region must be set on the containing stack for this to work.
         *
         * Default: false
         *
         * @param lookupSupportedAzs Limit to only those availability zones where the endpoint
         *   service can be created.
         */
        override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
            cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
        }

        /**
         * Whether to automatically allow VPC traffic to the endpoint.
         *
         * If enabled, all traffic to the endpoint from within the VPC will be automatically
         * allowed. This is done based on the VPC's CIDR range.
         *
         * Default: true
         *
         * @param open Whether to automatically allow VPC traffic to the endpoint.
         */
        override fun `open`(`open`: Boolean) {
            cdkBuilder.`open`(`open`)
        }

        /**
         * Whether to associate a private hosted zone with the specified VPC.
         *
         * This allows you to make requests to the service using its default DNS hostname.
         *
         * Default: set by the instance of IInterfaceVpcEndpointService, or true if not defined by
         * the instance of IInterfaceVpcEndpointService
         *
         * @param privateDnsEnabled Whether to associate a private hosted zone with the specified
         *   VPC.
         */
        override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
            cdkBuilder.privateDnsEnabled(privateDnsEnabled)
        }

        /**
         * The security groups to associate with this interface VPC endpoint.
         *
         * Default: - a new security group is created
         *
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /**
         * The security groups to associate with this interface VPC endpoint.
         *
         * Default: - a new security group is created
         *
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
            securityGroups(securityGroups.toList())

        /**
         * The service to use for this interface VPC endpoint.
         *
         * @param service The service to use for this interface VPC endpoint.
         */
        override fun service(service: IInterfaceVpcEndpointService) {
            cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
        }

        /**
         * The subnets in which to create an endpoint network interface.
         *
         * At most one per availability zone.
         *
         * Default: - private subnets
         *
         * @param subnets The subnets in which to create an endpoint network interface.
         */
        override fun subnets(subnets: SubnetSelection) {
            cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
        }

        /**
         * The subnets in which to create an endpoint network interface.
         *
         * At most one per availability zone.
         *
         * Default: - private subnets
         *
         * @param subnets The subnets in which to create an endpoint network interface.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("d78aef04157c83ec653390dbf7d09f4dc3276cd8641ce21de017f7e4c5b6029d")
        override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
            subnets(SubnetSelection(subnets))

        /**
         * The VPC network in which the interface endpoint will be used.
         *
         * @param vpc The VPC network in which the interface endpoint will be used.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromInterfaceVpcEndpointAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: InterfaceVpcEndpointAttributes,
        ): IInterfaceVpcEndpoint =
            software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
                .fromInterfaceVpcEndpointAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(InterfaceVpcEndpointAttributes::unwrap)
                )
                .let(IInterfaceVpcEndpoint::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("043f62487a2a59022231e31cd1d63b4fdc03fcd7d42e156db33883fa2f60c551")
        public fun fromInterfaceVpcEndpointAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: InterfaceVpcEndpointAttributes.Builder.() -> Unit,
        ): IInterfaceVpcEndpoint =
            fromInterfaceVpcEndpointAttributes(scope, id, InterfaceVpcEndpointAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): InterfaceVpcEndpoint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return InterfaceVpcEndpoint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
        ): InterfaceVpcEndpoint = InterfaceVpcEndpoint(cdkObject)

        internal fun unwrap(
            wrapped: InterfaceVpcEndpoint
        ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint = wrapped.cdkObject
    }
}
