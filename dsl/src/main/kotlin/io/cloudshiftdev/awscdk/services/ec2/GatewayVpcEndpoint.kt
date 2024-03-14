package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class GatewayVpcEndpoint
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint,
) : VpcEndpoint(cdkObject), IGatewayVpcEndpoint {
    /** The date and time the gateway VPC endpoint was created. */
    public open fun vpcEndpointCreationTimestamp(): String =
        unwrap(this).getVpcEndpointCreationTimestamp()

    /**  */
    public open fun vpcEndpointDnsEntries(): List<String> = unwrap(this).getVpcEndpointDnsEntries()

    /** The gateway VPC endpoint identifier. */
    public override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()

    /**  */
    public open fun vpcEndpointNetworkInterfaceIds(): List<String> =
        unwrap(this).getVpcEndpointNetworkInterfaceIds()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.GatewayVpcEndpoint]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The service to use for this gateway VPC endpoint.
         *
         * @param service The service to use for this gateway VPC endpoint.
         */
        public fun service(service: IGatewayVpcEndpointService)

        /**
         * Where to add endpoint routing.
         *
         * By default, this endpoint will be routable from all subnets in the VPC. Specify a list of
         * subnet selection objects here to be more specific.
         *
         * Default: - All subnets in the VPC
         *
         * Example:
         * ```
         * Vpc vpc;
         * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
         * .service(GatewayVpcEndpointAwsService.DYNAMODB)
         * // Add only to ISOLATED subnets
         * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
         * .build());
         * ```
         *
         * @param subnets Where to add endpoint routing.
         */
        public fun subnets(subnets: List<SubnetSelection>)

        /**
         * Where to add endpoint routing.
         *
         * By default, this endpoint will be routable from all subnets in the VPC. Specify a list of
         * subnet selection objects here to be more specific.
         *
         * Default: - All subnets in the VPC
         *
         * Example:
         * ```
         * Vpc vpc;
         * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
         * .service(GatewayVpcEndpointAwsService.DYNAMODB)
         * // Add only to ISOLATED subnets
         * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
         * .build());
         * ```
         *
         * @param subnets Where to add endpoint routing.
         */
        public fun subnets(vararg subnets: SubnetSelection)

        /**
         * The VPC network in which the gateway endpoint will be used.
         *
         * @param vpc The VPC network in which the gateway endpoint will be used.
         */
        public fun vpc(vpc: IVpc)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder =
            software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.Builder.create(scope, id)

        /**
         * The service to use for this gateway VPC endpoint.
         *
         * @param service The service to use for this gateway VPC endpoint.
         */
        override fun service(service: IGatewayVpcEndpointService) {
            cdkBuilder.service(service.let(IGatewayVpcEndpointService::unwrap))
        }

        /**
         * Where to add endpoint routing.
         *
         * By default, this endpoint will be routable from all subnets in the VPC. Specify a list of
         * subnet selection objects here to be more specific.
         *
         * Default: - All subnets in the VPC
         *
         * Example:
         * ```
         * Vpc vpc;
         * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
         * .service(GatewayVpcEndpointAwsService.DYNAMODB)
         * // Add only to ISOLATED subnets
         * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
         * .build());
         * ```
         *
         * @param subnets Where to add endpoint routing.
         */
        override fun subnets(subnets: List<SubnetSelection>) {
            cdkBuilder.subnets(subnets.map(SubnetSelection::unwrap))
        }

        /**
         * Where to add endpoint routing.
         *
         * By default, this endpoint will be routable from all subnets in the VPC. Specify a list of
         * subnet selection objects here to be more specific.
         *
         * Default: - All subnets in the VPC
         *
         * Example:
         * ```
         * Vpc vpc;
         * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
         * .service(GatewayVpcEndpointAwsService.DYNAMODB)
         * // Add only to ISOLATED subnets
         * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
         * .build());
         * ```
         *
         * @param subnets Where to add endpoint routing.
         */
        override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

        /**
         * The VPC network in which the gateway endpoint will be used.
         *
         * @param vpc The VPC network in which the gateway endpoint will be used.
         */
        override fun vpc(vpc: IVpc) {
            cdkBuilder.vpc(vpc.let(IVpc::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromGatewayVpcEndpointId(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            gatewayVpcEndpointId: String,
        ): IGatewayVpcEndpoint =
            software.amazon.awscdk.services.ec2.GatewayVpcEndpoint.fromGatewayVpcEndpointId(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    gatewayVpcEndpointId
                )
                .let(IGatewayVpcEndpoint::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): GatewayVpcEndpoint {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return GatewayVpcEndpoint(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
        ): GatewayVpcEndpoint = GatewayVpcEndpoint(cdkObject)

        internal fun unwrap(
            wrapped: GatewayVpcEndpoint
        ): software.amazon.awscdk.services.ec2.GatewayVpcEndpoint = wrapped.cdkObject
    }
}
