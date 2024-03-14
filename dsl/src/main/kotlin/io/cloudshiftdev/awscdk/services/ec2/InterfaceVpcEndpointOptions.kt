package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface InterfaceVpcEndpointOptions {
    /**
     * Limit to only those availability zones where the endpoint service can be created.
     *
     * Setting this to 'true' requires a lookup to be performed at synthesis time. Account and
     * region must be set on the containing stack for this to work.
     *
     * Default: false
     */
    public fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

    /**
     * Whether to automatically allow VPC traffic to the endpoint.
     *
     * If enabled, all traffic to the endpoint from within the VPC will be automatically allowed.
     * This is done based on the VPC's CIDR range.
     *
     * Default: true
     */
    public fun `open`(): Boolean? = unwrap(this).getOpen()

    /**
     * Whether to associate a private hosted zone with the specified VPC.
     *
     * This allows you to make requests to the service using its default DNS hostname.
     *
     * Default: set by the instance of IInterfaceVpcEndpointService, or true if not defined by the
     * instance of IInterfaceVpcEndpointService
     */
    public fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

    /**
     * The security groups to associate with this interface VPC endpoint.
     *
     * Default: - a new security group is created
     */
    public fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /** The service to use for this interface VPC endpoint. */
    public fun service(): IInterfaceVpcEndpointService

    /**
     * The subnets in which to create an endpoint network interface.
     *
     * At most one per availability zone.
     *
     * Default: - private subnets
     */
    public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    /** A builder for [InterfaceVpcEndpointOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param lookupSupportedAzs Limit to only those availability zones where the endpoint
         *   service can be created. Setting this to 'true' requires a lookup to be performed at
         *   synthesis time. Account and region must be set on the containing stack for this to
         *   work.
         */
        public fun lookupSupportedAzs(lookupSupportedAzs: Boolean)

        /**
         * @param open Whether to automatically allow VPC traffic to the endpoint. If enabled, all
         *   traffic to the endpoint from within the VPC will be automatically allowed. This is done
         *   based on the VPC's CIDR range.
         */
        public fun `open`(`open`: Boolean)

        /**
         * @param privateDnsEnabled Whether to associate a private hosted zone with the specified
         *   VPC. This allows you to make requests to the service using its default DNS hostname.
         */
        public fun privateDnsEnabled(privateDnsEnabled: Boolean)

        /**
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        public fun securityGroups(securityGroups: List<ISecurityGroup>)

        /**
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        public fun securityGroups(vararg securityGroups: ISecurityGroup)

        /** @param service The service to use for this interface VPC endpoint. */
        public fun service(service: IInterfaceVpcEndpointService)

        /**
         * @param subnets The subnets in which to create an endpoint network interface. At most one
         *   per availability zone.
         */
        public fun subnets(subnets: SubnetSelection)

        /**
         * @param subnets The subnets in which to create an endpoint network interface. At most one
         *   per availability zone.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("41961a405f9019549cd4f6bef0e89b8c8835511f3fd849fdc0b2cb42ee990fdf")
        public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions.Builder =
            software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions.builder()

        /**
         * @param lookupSupportedAzs Limit to only those availability zones where the endpoint
         *   service can be created. Setting this to 'true' requires a lookup to be performed at
         *   synthesis time. Account and region must be set on the containing stack for this to
         *   work.
         */
        override fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
            cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
        }

        /**
         * @param open Whether to automatically allow VPC traffic to the endpoint. If enabled, all
         *   traffic to the endpoint from within the VPC will be automatically allowed. This is done
         *   based on the VPC's CIDR range.
         */
        override fun `open`(`open`: Boolean) {
            cdkBuilder.`open`(`open`)
        }

        /**
         * @param privateDnsEnabled Whether to associate a private hosted zone with the specified
         *   VPC. This allows you to make requests to the service using its default DNS hostname.
         */
        override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
            cdkBuilder.privateDnsEnabled(privateDnsEnabled)
        }

        /**
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        override fun securityGroups(securityGroups: List<ISecurityGroup>) {
            cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
        }

        /**
         * @param securityGroups The security groups to associate with this interface VPC endpoint.
         */
        override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
            securityGroups(securityGroups.toList())

        /** @param service The service to use for this interface VPC endpoint. */
        override fun service(service: IInterfaceVpcEndpointService) {
            cdkBuilder.service(service.let(IInterfaceVpcEndpointService::unwrap))
        }

        /**
         * @param subnets The subnets in which to create an endpoint network interface. At most one
         *   per availability zone.
         */
        override fun subnets(subnets: SubnetSelection) {
            cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
        }

        /**
         * @param subnets The subnets in which to create an endpoint network interface. At most one
         *   per availability zone.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("41961a405f9019549cd4f6bef0e89b8c8835511f3fd849fdc0b2cb42ee990fdf")
        override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
            subnets(SubnetSelection(subnets))

        public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions,
    ) : InterfaceVpcEndpointOptions {
        /**
         * Limit to only those availability zones where the endpoint service can be created.
         *
         * Setting this to 'true' requires a lookup to be performed at synthesis time. Account and
         * region must be set on the containing stack for this to work.
         *
         * Default: false
         */
        override fun lookupSupportedAzs(): Boolean? = unwrap(this).getLookupSupportedAzs()

        /**
         * Whether to automatically allow VPC traffic to the endpoint.
         *
         * If enabled, all traffic to the endpoint from within the VPC will be automatically
         * allowed. This is done based on the VPC's CIDR range.
         *
         * Default: true
         */
        override fun `open`(): Boolean? = unwrap(this).getOpen()

        /**
         * Whether to associate a private hosted zone with the specified VPC.
         *
         * This allows you to make requests to the service using its default DNS hostname.
         *
         * Default: set by the instance of IInterfaceVpcEndpointService, or true if not defined by
         * the instance of IInterfaceVpcEndpointService
         */
        override fun privateDnsEnabled(): Boolean? = unwrap(this).getPrivateDnsEnabled()

        /**
         * The security groups to associate with this interface VPC endpoint.
         *
         * Default: - a new security group is created
         */
        override fun securityGroups(): List<ISecurityGroup> =
            unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

        /** The service to use for this interface VPC endpoint. */
        override fun service(): IInterfaceVpcEndpointService =
            unwrap(this).getService().let(IInterfaceVpcEndpointService::wrap)

        /**
         * The subnets in which to create an endpoint network interface.
         *
         * At most one per availability zone.
         *
         * Default: - private subnets
         */
        override fun subnets(): SubnetSelection? =
            unwrap(this).getSubnets()?.let(SubnetSelection::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions
        ): InterfaceVpcEndpointOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: InterfaceVpcEndpointOptions
        ): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions =
            (wrapped as Wrapper).cdkObject
    }
}
