@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
 * .routeTableId("routeTableId")
 * // the properties below are optional
 * .carrierGatewayId("carrierGatewayId")
 * .coreNetworkArn("coreNetworkArn")
 * .destinationCidrBlock("destinationCidrBlock")
 * .destinationIpv6CidrBlock("destinationIpv6CidrBlock")
 * .destinationPrefixListId("destinationPrefixListId")
 * .egressOnlyInternetGatewayId("egressOnlyInternetGatewayId")
 * .gatewayId("gatewayId")
 * .instanceId("instanceId")
 * .localGatewayId("localGatewayId")
 * .natGatewayId("natGatewayId")
 * .networkInterfaceId("networkInterfaceId")
 * .transitGatewayId("transitGatewayId")
 * .vpcEndpointId("vpcEndpointId")
 * .vpcPeeringConnectionId("vpcPeeringConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html)
 */
public interface CfnRouteProps {
  /**
   * The ID of the carrier gateway.
   *
   * You can only use this option when the VPC contains a subnet which is associated with a
   * Wavelength Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-carriergatewayid)
   */
  public fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

  /**
   * The Amazon Resource Name (ARN) of the core network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-corenetworkarn)
   */
  public fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

  /**
   * The IPv4 CIDR address block used for the destination match.
   *
   * Routing decisions are based on the most specific match. We modify the specified CIDR block to
   * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  /**
   * The IPv6 CIDR block used for the destination match.
   *
   * Routing decisions are based on the most specific match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
   */
  public fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  /**
   * The ID of a prefix list used for the destination match.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationprefixlistid)
   */
  public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  /**
   * [IPv6 traffic only] The ID of an egress-only internet gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
   */
  public fun egressOnlyInternetGatewayId(): String? = unwrap(this).getEgressOnlyInternetGatewayId()

  /**
   * The ID of an internet gateway or virtual private gateway attached to your VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
   */
  public fun gatewayId(): String? = unwrap(this).getGatewayId()

  /**
   * The ID of a NAT instance in your VPC.
   *
   * The operation fails if you specify an instance ID unless exactly one network interface is
   * attached.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the local gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-localgatewayid)
   */
  public fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

  /**
   * [IPv4 traffic only] The ID of a NAT gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
   */
  public fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

  /**
   * The ID of a network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
   */
  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The ID of the route table for the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
   */
  public fun routeTableId(): String

  /**
   * The ID of a transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-transitgatewayid)
   */
  public fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  /**
   * The ID of a VPC endpoint.
   *
   * Supported for Gateway Load Balancer endpoints only.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcendpointid)
   */
  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * The ID of a VPC peering connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
   */
  public fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

  /**
   * A builder for [CfnRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param carrierGatewayId The ID of the carrier gateway.
     * You can only use this option when the VPC contains a subnet which is associated with a
     * Wavelength Zone.
     */
    public fun carrierGatewayId(carrierGatewayId: String)

    /**
     * @param coreNetworkArn The Amazon Resource Name (ARN) of the core network.
     */
    public fun coreNetworkArn(coreNetworkArn: String)

    /**
     * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match.
     * Routing decisions are based on the most specific match. We modify the specified CIDR block to
     * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     * `100.68.0.0/18` .
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param destinationIpv6CidrBlock The IPv6 CIDR block used for the destination match.
     * Routing decisions are based on the most specific match.
     */
    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String)

    /**
     * @param destinationPrefixListId The ID of a prefix list used for the destination match.
     */
    public fun destinationPrefixListId(destinationPrefixListId: String)

    /**
     * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
     * gateway.
     */
    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String)

    /**
     * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     */
    public fun gatewayId(gatewayId: String)

    /**
     * @param instanceId The ID of a NAT instance in your VPC.
     * The operation fails if you specify an instance ID unless exactly one network interface is
     * attached.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param localGatewayId The ID of the local gateway.
     */
    public fun localGatewayId(localGatewayId: String)

    /**
     * @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway.
     */
    public fun natGatewayId(natGatewayId: String)

    /**
     * @param networkInterfaceId The ID of a network interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param routeTableId The ID of the route table for the route. 
     */
    public fun routeTableId(routeTableId: String)

    /**
     * @param transitGatewayId The ID of a transit gateway.
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * @param vpcEndpointId The ID of a VPC endpoint.
     * Supported for Gateway Load Balancer endpoints only.
     */
    public fun vpcEndpointId(vpcEndpointId: String)

    /**
     * @param vpcPeeringConnectionId The ID of a VPC peering connection.
     */
    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnRouteProps.builder()

    /**
     * @param carrierGatewayId The ID of the carrier gateway.
     * You can only use this option when the VPC contains a subnet which is associated with a
     * Wavelength Zone.
     */
    override fun carrierGatewayId(carrierGatewayId: String) {
      cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    /**
     * @param coreNetworkArn The Amazon Resource Name (ARN) of the core network.
     */
    override fun coreNetworkArn(coreNetworkArn: String) {
      cdkBuilder.coreNetworkArn(coreNetworkArn)
    }

    /**
     * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match.
     * Routing decisions are based on the most specific match. We modify the specified CIDR block to
     * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     * `100.68.0.0/18` .
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param destinationIpv6CidrBlock The IPv6 CIDR block used for the destination match.
     * Routing decisions are based on the most specific match.
     */
    override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    /**
     * @param destinationPrefixListId The ID of a prefix list used for the destination match.
     */
    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /**
     * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
     * gateway.
     */
    override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
      cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    /**
     * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your
     * VPC.
     */
    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    /**
     * @param instanceId The ID of a NAT instance in your VPC.
     * The operation fails if you specify an instance ID unless exactly one network interface is
     * attached.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param localGatewayId The ID of the local gateway.
     */
    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    /**
     * @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway.
     */
    override fun natGatewayId(natGatewayId: String) {
      cdkBuilder.natGatewayId(natGatewayId)
    }

    /**
     * @param networkInterfaceId The ID of a network interface.
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param routeTableId The ID of the route table for the route. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    /**
     * @param transitGatewayId The ID of a transit gateway.
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * @param vpcEndpointId The ID of a VPC endpoint.
     * Supported for Gateway Load Balancer endpoints only.
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /**
     * @param vpcPeeringConnectionId The ID of a VPC peering connection.
     */
    override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
      cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    /**
     * The ID of the carrier gateway.
     *
     * You can only use this option when the VPC contains a subnet which is associated with a
     * Wavelength Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-carriergatewayid)
     */
    override fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

    /**
     * The Amazon Resource Name (ARN) of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-corenetworkarn)
     */
    override fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

    /**
     * The IPv4 CIDR address block used for the destination match.
     *
     * Routing decisions are based on the most specific match. We modify the specified CIDR block to
     * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     * `100.68.0.0/18` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    /**
     * The IPv6 CIDR block used for the destination match.
     *
     * Routing decisions are based on the most specific match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
     */
    override fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

    /**
     * The ID of a prefix list used for the destination match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationprefixlistid)
     */
    override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    /**
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
     */
    override fun egressOnlyInternetGatewayId(): String? =
        unwrap(this).getEgressOnlyInternetGatewayId()

    /**
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
     */
    override fun gatewayId(): String? = unwrap(this).getGatewayId()

    /**
     * The ID of a NAT instance in your VPC.
     *
     * The operation fails if you specify an instance ID unless exactly one network interface is
     * attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-localgatewayid)
     */
    override fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

    /**
     * [IPv4 traffic only] The ID of a NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
     */
    override fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

    /**
     * The ID of a network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
     */
    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The ID of the route table for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()

    /**
     * The ID of a transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-transitgatewayid)
     */
    override fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

    /**
     * The ID of a VPC endpoint.
     *
     * Supported for Gateway Load Balancer endpoints only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcendpointid)
     */
    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    /**
     * The ID of a VPC peering connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
     */
    override fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRouteProps): CfnRouteProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps): software.amazon.awscdk.services.ec2.CfnRouteProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnRouteProps
  }
}
