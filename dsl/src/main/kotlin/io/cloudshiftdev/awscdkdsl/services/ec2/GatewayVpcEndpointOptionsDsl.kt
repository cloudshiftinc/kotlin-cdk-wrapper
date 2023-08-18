@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Options to add a gateway endpoint to a VPC.
 *
 * Example:
 * ```
 * // Add gateway endpoints when creating the VPC
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .gatewayEndpoints(Map.of(
 * "S3", GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.S3)
 * .build()))
 * .build();
 * // Alternatively gateway endpoints can be added on the VPC
 * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
 * GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .build());
 * // This allows to customize the endpoint policy
 * dynamoDbEndpoint.addToPolicy(
 * PolicyStatement.Builder.create() // Restrict to listing and describing tables
 * .principals(List.of(new AnyPrincipal()))
 * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
 * .resources(List.of("*")).build());
 * // Add an interface endpoint
 * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
 * .build());
 * ```
 */
@CdkDslMarker
public class GatewayVpcEndpointOptionsDsl {
    private val cdkBuilder: GatewayVpcEndpointOptions.Builder = GatewayVpcEndpointOptions.builder()

    private val _subnets: MutableList<SubnetSelection> = mutableListOf()

    /** @param service The service to use for this gateway VPC endpoint. */
    public fun service(service: IGatewayVpcEndpointService) {
        cdkBuilder.service(service)
    }

    /**
     * @param subnets Where to add endpoint routing. By default, this endpoint will be routable from
     *   all subnets in the VPC. Specify a list of subnet selection objects here to be more
     *   specific.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
        _subnets.add(SubnetSelectionDsl().apply(subnets).build())
    }

    /**
     * @param subnets Where to add endpoint routing. By default, this endpoint will be routable from
     *   all subnets in the VPC. Specify a list of subnet selection objects here to be more
     *   specific.
     */
    public fun subnets(subnets: Collection<SubnetSelection>) {
        _subnets.addAll(subnets)
    }

    public fun build(): GatewayVpcEndpointOptions {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
