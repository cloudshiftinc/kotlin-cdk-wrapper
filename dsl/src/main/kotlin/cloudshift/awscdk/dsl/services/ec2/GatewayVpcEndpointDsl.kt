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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct

/**
 * A gateway VPC endpoint.
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
public class GatewayVpcEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: GatewayVpcEndpoint.Builder =
        GatewayVpcEndpoint.Builder.create(scope, id)

    private val _subnets: MutableList<SubnetSelection> = mutableListOf()

    /**
     * The service to use for this gateway VPC endpoint.
     *
     * @param service The service to use for this gateway VPC endpoint.
     */
    public fun service(service: IGatewayVpcEndpointService) {
        cdkBuilder.service(service)
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
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
        _subnets.add(SubnetSelectionDsl().apply(subnets).build())
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
    public fun subnets(subnets: Collection<SubnetSelection>) {
        _subnets.addAll(subnets)
    }

    /**
     * The VPC network in which the gateway endpoint will be used.
     *
     * @param vpc The VPC network in which the gateway endpoint will be used.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): GatewayVpcEndpoint {
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
