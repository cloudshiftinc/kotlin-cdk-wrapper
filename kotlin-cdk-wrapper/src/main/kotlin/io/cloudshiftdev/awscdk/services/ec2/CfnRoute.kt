@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a route in a route table. For more information, see
 * [Routes](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html#route-table-routes)
 * in the *Amazon VPC User Guide* .
 *
 * You must specify either a destination CIDR block or prefix list ID. You must also specify exactly
 * one of the resources as the target.
 *
 * If you create a route that references a transit gateway in the same template where you create the
 * transit gateway, you must declare a dependency on the transit gateway attachment. The route table
 * cannot use the transit gateway until it has successfully attached to the VPC. Add a [DependsOn
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * in the `AWS::EC2::Route` resource to explicitly declare a dependency on the
 * `AWS::EC2::TransitGatewayAttachment` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
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
public open class CfnRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnRoute,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnRoute(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnRouteProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteProps(props)
  )

  /**
   * The IPv4 CIDR block.
   */
  public open fun attrCidrBlock(): String = unwrap(this).getAttrCidrBlock()

  /**
   * The ID of the carrier gateway.
   */
  public open fun carrierGatewayId(): String? = unwrap(this).getCarrierGatewayId()

  /**
   * The ID of the carrier gateway.
   */
  public open fun carrierGatewayId(`value`: String) {
    unwrap(this).setCarrierGatewayId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the core network.
   */
  public open fun coreNetworkArn(): String? = unwrap(this).getCoreNetworkArn()

  /**
   * The Amazon Resource Name (ARN) of the core network.
   */
  public open fun coreNetworkArn(`value`: String) {
    unwrap(this).setCoreNetworkArn(`value`)
  }

  /**
   * The IPv4 CIDR address block used for the destination match.
   */
  public open fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  /**
   * The IPv4 CIDR address block used for the destination match.
   */
  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
  }

  /**
   * The IPv6 CIDR block used for the destination match.
   */
  public open fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  /**
   * The IPv6 CIDR block used for the destination match.
   */
  public open fun destinationIpv6CidrBlock(`value`: String) {
    unwrap(this).setDestinationIpv6CidrBlock(`value`)
  }

  /**
   * The ID of a prefix list used for the destination match.
   */
  public open fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  /**
   * The ID of a prefix list used for the destination match.
   */
  public open fun destinationPrefixListId(`value`: String) {
    unwrap(this).setDestinationPrefixListId(`value`)
  }

  /**
   * [IPv6 traffic only] The ID of an egress-only internet gateway.
   */
  public open fun egressOnlyInternetGatewayId(): String? =
      unwrap(this).getEgressOnlyInternetGatewayId()

  /**
   * [IPv6 traffic only] The ID of an egress-only internet gateway.
   */
  public open fun egressOnlyInternetGatewayId(`value`: String) {
    unwrap(this).setEgressOnlyInternetGatewayId(`value`)
  }

  /**
   * The ID of an internet gateway or virtual private gateway attached to your VPC.
   */
  public open fun gatewayId(): String? = unwrap(this).getGatewayId()

  /**
   * The ID of an internet gateway or virtual private gateway attached to your VPC.
   */
  public open fun gatewayId(`value`: String) {
    unwrap(this).setGatewayId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of a NAT instance in your VPC.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of a NAT instance in your VPC.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The ID of the local gateway.
   */
  public open fun localGatewayId(): String? = unwrap(this).getLocalGatewayId()

  /**
   * The ID of the local gateway.
   */
  public open fun localGatewayId(`value`: String) {
    unwrap(this).setLocalGatewayId(`value`)
  }

  /**
   * [IPv4 traffic only] The ID of a NAT gateway.
   */
  public open fun natGatewayId(): String? = unwrap(this).getNatGatewayId()

  /**
   * [IPv4 traffic only] The ID of a NAT gateway.
   */
  public open fun natGatewayId(`value`: String) {
    unwrap(this).setNatGatewayId(`value`)
  }

  /**
   * The ID of a network interface.
   */
  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The ID of a network interface.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * The ID of the route table for the route.
   */
  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  /**
   * The ID of the route table for the route.
   */
  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  /**
   * The ID of a transit gateway.
   */
  public open fun transitGatewayId(): String? = unwrap(this).getTransitGatewayId()

  /**
   * The ID of a transit gateway.
   */
  public open fun transitGatewayId(`value`: String) {
    unwrap(this).setTransitGatewayId(`value`)
  }

  /**
   * The ID of a VPC endpoint.
   */
  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * The ID of a VPC endpoint.
   */
  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  /**
   * The ID of a VPC peering connection.
   */
  public open fun vpcPeeringConnectionId(): String? = unwrap(this).getVpcPeeringConnectionId()

  /**
   * The ID of a VPC peering connection.
   */
  public open fun vpcPeeringConnectionId(`value`: String) {
    unwrap(this).setVpcPeeringConnectionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the carrier gateway.
     *
     * You can only use this option when the VPC contains a subnet which is associated with a
     * Wavelength Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-carriergatewayid)
     * @param carrierGatewayId The ID of the carrier gateway. 
     */
    public fun carrierGatewayId(carrierGatewayId: String)

    /**
     * The Amazon Resource Name (ARN) of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-corenetworkarn)
     * @param coreNetworkArn The Amazon Resource Name (ARN) of the core network. 
     */
    public fun coreNetworkArn(coreNetworkArn: String)

    /**
     * The IPv4 CIDR address block used for the destination match.
     *
     * Routing decisions are based on the most specific match. We modify the specified CIDR block to
     * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     * `100.68.0.0/18` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
     * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The IPv6 CIDR block used for the destination match.
     *
     * Routing decisions are based on the most specific match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
     * @param destinationIpv6CidrBlock The IPv6 CIDR block used for the destination match. 
     */
    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String)

    /**
     * The ID of a prefix list used for the destination match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationprefixlistid)
     * @param destinationPrefixListId The ID of a prefix list used for the destination match. 
     */
    public fun destinationPrefixListId(destinationPrefixListId: String)

    /**
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
     * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
     * gateway. 
     */
    public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String)

    /**
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
     * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your
     * VPC. 
     */
    public fun gatewayId(gatewayId: String)

    /**
     * The ID of a NAT instance in your VPC.
     *
     * The operation fails if you specify an instance ID unless exactly one network interface is
     * attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
     * @param instanceId The ID of a NAT instance in your VPC. 
     */
    public fun instanceId(instanceId: String)

    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-localgatewayid)
     * @param localGatewayId The ID of the local gateway. 
     */
    public fun localGatewayId(localGatewayId: String)

    /**
     * [IPv4 traffic only] The ID of a NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
     * @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway. 
     */
    public fun natGatewayId(natGatewayId: String)

    /**
     * The ID of a network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
     * @param networkInterfaceId The ID of a network interface. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * The ID of the route table for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
     * @param routeTableId The ID of the route table for the route. 
     */
    public fun routeTableId(routeTableId: String)

    /**
     * The ID of a transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-transitgatewayid)
     * @param transitGatewayId The ID of a transit gateway. 
     */
    public fun transitGatewayId(transitGatewayId: String)

    /**
     * The ID of a VPC endpoint.
     *
     * Supported for Gateway Load Balancer endpoints only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcendpointid)
     * @param vpcEndpointId The ID of a VPC endpoint. 
     */
    public fun vpcEndpointId(vpcEndpointId: String)

    /**
     * The ID of a VPC peering connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
     * @param vpcPeeringConnectionId The ID of a VPC peering connection. 
     */
    public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnRoute.Builder.create(scope, id)

    /**
     * The ID of the carrier gateway.
     *
     * You can only use this option when the VPC contains a subnet which is associated with a
     * Wavelength Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-carriergatewayid)
     * @param carrierGatewayId The ID of the carrier gateway. 
     */
    override fun carrierGatewayId(carrierGatewayId: String) {
      cdkBuilder.carrierGatewayId(carrierGatewayId)
    }

    /**
     * The Amazon Resource Name (ARN) of the core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-corenetworkarn)
     * @param coreNetworkArn The Amazon Resource Name (ARN) of the core network. 
     */
    override fun coreNetworkArn(coreNetworkArn: String) {
      cdkBuilder.coreNetworkArn(coreNetworkArn)
    }

    /**
     * The IPv4 CIDR address block used for the destination match.
     *
     * Routing decisions are based on the most specific match. We modify the specified CIDR block to
     * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to
     * `100.68.0.0/18` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
     * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The IPv6 CIDR block used for the destination match.
     *
     * Routing decisions are based on the most specific match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationipv6cidrblock)
     * @param destinationIpv6CidrBlock The IPv6 CIDR block used for the destination match. 
     */
    override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    /**
     * The ID of a prefix list used for the destination match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationprefixlistid)
     * @param destinationPrefixListId The ID of a prefix list used for the destination match. 
     */
    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    /**
     * [IPv6 traffic only] The ID of an egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
     * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
     * gateway. 
     */
    override fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
      cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
    }

    /**
     * The ID of an internet gateway or virtual private gateway attached to your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
     * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your
     * VPC. 
     */
    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    /**
     * The ID of a NAT instance in your VPC.
     *
     * The operation fails if you specify an instance ID unless exactly one network interface is
     * attached.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-instanceid)
     * @param instanceId The ID of a NAT instance in your VPC. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The ID of the local gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-localgatewayid)
     * @param localGatewayId The ID of the local gateway. 
     */
    override fun localGatewayId(localGatewayId: String) {
      cdkBuilder.localGatewayId(localGatewayId)
    }

    /**
     * [IPv4 traffic only] The ID of a NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
     * @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway. 
     */
    override fun natGatewayId(natGatewayId: String) {
      cdkBuilder.natGatewayId(natGatewayId)
    }

    /**
     * The ID of a network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
     * @param networkInterfaceId The ID of a network interface. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The ID of the route table for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
     * @param routeTableId The ID of the route table for the route. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    /**
     * The ID of a transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-transitgatewayid)
     * @param transitGatewayId The ID of a transit gateway. 
     */
    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The ID of a VPC endpoint.
     *
     * Supported for Gateway Load Balancer endpoints only.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcendpointid)
     * @param vpcEndpointId The ID of a VPC endpoint. 
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /**
     * The ID of a VPC peering connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
     * @param vpcPeeringConnectionId The ID of a VPC peering connection. 
     */
    override fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
      cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnRoute): CfnRoute =
        CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.ec2.CfnRoute =
        wrapped.cdkObject
  }
}
