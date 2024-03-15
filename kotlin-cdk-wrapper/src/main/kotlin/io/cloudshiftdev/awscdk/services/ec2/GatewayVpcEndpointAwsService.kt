@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * An AWS service for a gateway VPC endpoint.
 *
 * Example:
 *
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
public open class GatewayVpcEndpointAwsService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService,
) : CdkObject(cdkObject), IGatewayVpcEndpointService {
  public constructor(name: String, prefix: String) :
      this(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService(name, prefix))

  public constructor(name: String) :
      this(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService(name))

  /**
   * The name of the service.
   */
  public override fun name(): String = unwrap(this).getName()

  public companion object {
    public val DYNAMODB: GatewayVpcEndpointAwsService =
        GatewayVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService.DYNAMODB)

    public val S3: GatewayVpcEndpointAwsService =
        GatewayVpcEndpointAwsService.wrap(software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService.S3)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService):
        GatewayVpcEndpointAwsService = GatewayVpcEndpointAwsService(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointAwsService):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointAwsService = wrapped.cdkObject
  }
}
