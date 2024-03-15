@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnRouteProps {
  public fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

  public fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  public fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  public fun egressOnlyInternetGatewayId(): String? = unwrap(this).getEgressOnlyInternetGatewayId()

  public fun gatewayId(): String? = unwrap(this).getGatewayId()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

  public fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public fun routeTableId(): String

  public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  public fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

  @CdkDslMarker
  public interface Builder {
    public fun carrierGatewayId(carrierGatewayId: String)

    public fun coreNetworkArn(coreNetworkArn: String)

    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String)

    public fun destinationPrefixListId(destinationPrefixListId: String)

    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String)

    public fun gatewayId(gatewayId: String)

    public fun instanceId(instanceId: String)

    public fun localGatewayId(localGatewayId: String)

    public fun natGatewayId(natGatewayId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun routeTableId(routeTableId: String)

    public fun transitGatewayId(transitGatewayId: String)

    public fun vpcEndpointId(vpcEndpointId: String)

    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteProps.builder()

    override fun carrierGatewayId(carrierGatewayId: String) {
      cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    override fun coreNetworkArn(coreNetworkArn: String) {
      cdkBuilder.coreNetworkArn(coreNetworkArn)
    }

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
      cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    override fun natGatewayId(natGatewayId: String) {
      cdkBuilder.natGatewayId(natGatewayId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
      cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    override fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

    override fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    override fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

    override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    override fun egressOnlyInternetGatewayId(): String? =
        unwrap(this).getEgressOnlyInternetGatewayId()

    override fun gatewayId(): String? = unwrap(this).getGatewayId()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

    override fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    override fun routeTableId(): String = unwrap(this).getRouteTableId()

    override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    override fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteProps): CfnRouteProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps): software.amazon.awscdk.services.ec2.CfnRouteProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteProps
  }
}
