@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties for a GatewayVpcEndpoint.
 *
 * Example:
 *
 * ```
 * Stack stack = new Stack();
 * VpcV2 myVpc = new VpcV2(this, "Vpc");
 * RouteTable routeTable = RouteTable.Builder.create(this, "RouteTable")
 * .vpc(myVpc)
 * .build();
 * SubnetV2 subnet = SubnetV2.Builder.create(this, "Subnet")
 * .vpc(myVpc)
 * .availabilityZone("eu-west-2a")
 * .ipv4CidrBlock(new IpCidr("10.0.0.0/24"))
 * .subnetType(SubnetType.PRIVATE)
 * .build();
 * GatewayVpcEndpoint dynamoEndpoint = GatewayVpcEndpoint.Builder.create(this, "DynamoEndpoint")
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .vpc(myVpc)
 * .subnets(List.of(subnet))
 * .build();
 * Route.Builder.create(this, "DynamoDBRoute")
 * .routeTable(routeTable)
 * .destination("0.0.0.0/0")
 * .target(Map.of("endpoint", dynamoEndpoint))
 * .build();
 * ```
 */
public interface GatewayVpcEndpointProps : GatewayVpcEndpointOptions {
  /**
   * The VPC network in which the gateway endpoint will be used.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [GatewayVpcEndpointProps]
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

    /**
     * @param vpc The VPC network in which the gateway endpoint will be used. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps.builder()

    /**
     * @param service The service to use for this gateway VPC endpoint. 
     */
    override fun service(service: IGatewayVpcEndpointService) {
      cdkBuilder.service(service.let(IGatewayVpcEndpointService.Companion::unwrap))
    }

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    override fun subnets(subnets: List<SubnetSelection>) {
      cdkBuilder.subnets(subnets.map(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param subnets Where to add endpoint routing.
     * By default, this endpoint will be routable from all subnets in the VPC.
     * Specify a list of subnet selection objects here to be more specific.
     */
    override fun subnets(vararg subnets: SubnetSelection): Unit = subnets(subnets.toList())

    /**
     * @param vpc The VPC network in which the gateway endpoint will be used. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps,
  ) : CdkObject(cdkObject),
      GatewayVpcEndpointProps {
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

    /**
     * The VPC network in which the gateway endpoint will be used.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayVpcEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps):
        GatewayVpcEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? GatewayVpcEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayVpcEndpointProps):
        software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
  }
}
