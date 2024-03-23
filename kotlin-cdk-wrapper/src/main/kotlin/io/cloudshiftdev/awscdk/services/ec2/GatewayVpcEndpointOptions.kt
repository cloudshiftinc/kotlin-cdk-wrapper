@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Options to add a gateway endpoint to a VPC.
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
public interface GatewayVpcEndpointOptions {
  /**
   * The service to use for this gateway VPC endpoint.
   */
  public fun service(): IGatewayVpcEndpointService

  /**
   * Where to add endpoint routing.
   *
   * By default, this endpoint will be routable from all subnets in the VPC.
   * Specify a list of subnet selection objects here to be more specific.
   *
   * Default: - All subnets in the VPC
   *
   * Example:
   *
   * ```
   * Vpc vpc;
   * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
   * .service(GatewayVpcEndpointAwsService.DYNAMODB)
   * // Add only to ISOLATED subnets
   * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
   * .build());
   * ```
   */
  public fun subnets(): List<SubnetSelection> =
      unwrap(this).getSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * A builder for [GatewayVpcEndpointOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param service The service to use for this gateway VPC endpoint. 
     */
    public fun service(service: IGatewayVpcEndpointService)

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    public fun subnets(subnets: List<SubnetSelection>)

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    public fun subnets(vararg subnets: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions.builder()

    /**
     * @param service The service to use for this gateway VPC endpoint. 
     */
    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService::unwrap))
    }

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection::unwrap))
    }

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions,
  ) : CdkObject(cdkObject), GatewayVpcEndpointOptions {
    /**
     * The service to use for this gateway VPC endpoint.
     */
    override fun service(): IGatewayVpcEndpointService =
        unwrap(this).getService().let(IGatewayVpcEndpointService::wrap)

    /**
     * Where to add endpoint routing.
     *
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     *
     * Default: - All subnets in the VPC
     *
     * Example:
     *
     * ```
     * Vpc vpc;
     * vpc.addGatewayEndpoint("DynamoDbEndpoint", GatewayVpcEndpointOptions.builder()
     * .service(GatewayVpcEndpointAwsService.DYNAMODB)
     * // Add only to ISOLATED subnets
     * .subnets(List.of(SubnetSelection.builder().subnetType(SubnetType.PRIVATE_ISOLATED).build()))
     * .build());
     * ```
     */
    override fun subnets(): List<SubnetSelection> =
        unwrap(this).getSubnets()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayVpcEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions):
        GatewayVpcEndpointOptions = CdkObjectWrappers.wrap(cdkObject) as? GatewayVpcEndpointOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointOptions):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
  }
}
