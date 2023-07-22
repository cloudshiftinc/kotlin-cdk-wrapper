@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnRoute
import software.constructs.Construct

/**
 * Specifies a route in a route table.
 *
 * You must specify either `DestinationCidrBlock` or `DestinationIpv6CidrBlock` , plus the ID of one
 * of the target resources.
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
 * import software.amazon.awscdk.services.ec2.*;
 * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
 * .routeTableId("routeTableId")
 * // the properties below are optional
 * .carrierGatewayId("carrierGatewayId")
 * .destinationCidrBlock("destinationCidrBlock")
 * .destinationIpv6CidrBlock("destinationIpv6CidrBlock")
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
@CdkDslMarker
public class CfnRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRoute.Builder = CfnRoute.Builder.create(scope, id)

  /**
   * The ID of the carrier gateway.
   *
   * You can only use this option when the VPC contains a subnet which is associated with a
   * Wavelength Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-carriergatewayid)
   * @param carrierGatewayId The ID of the carrier gateway. 
   */
  public fun carrierGatewayId(carrierGatewayId: String) {
    cdkBuilder.carrierGatewayId(carrierGatewayId)
  }

  /**
   * The IPv4 CIDR address block used for the destination match.
   *
   * Routing decisions are based on the most specific match. We modify the specified CIDR block to
   * its canonical form; for example, if you specify `100.68.0.18/18` , we modify it to `100.68.0.0/18`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-destinationcidrblock)
   * @param destinationCidrBlock The IPv4 CIDR address block used for the destination match. 
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
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
  public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
    cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
  }

  /**
   * [IPv6 traffic only] The ID of an egress-only internet gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-egressonlyinternetgatewayid)
   * @param egressOnlyInternetGatewayId [IPv6 traffic only] The ID of an egress-only internet
   * gateway. 
   */
  public fun egressOnlyInternetGatewayId(egressOnlyInternetGatewayId: String) {
    cdkBuilder.egressOnlyInternetGatewayId(egressOnlyInternetGatewayId)
  }

  /**
   * The ID of an internet gateway or virtual private gateway attached to your VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-gatewayid)
   * @param gatewayId The ID of an internet gateway or virtual private gateway attached to your VPC.
   * 
   */
  public fun gatewayId(gatewayId: String) {
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
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * The ID of the local gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-localgatewayid)
   * @param localGatewayId The ID of the local gateway. 
   */
  public fun localGatewayId(localGatewayId: String) {
    cdkBuilder.localGatewayId(localGatewayId)
  }

  /**
   * [IPv4 traffic only] The ID of a NAT gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-natgatewayid)
   * @param natGatewayId [IPv4 traffic only] The ID of a NAT gateway. 
   */
  public fun natGatewayId(natGatewayId: String) {
    cdkBuilder.natGatewayId(natGatewayId)
  }

  /**
   * The ID of a network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-networkinterfaceid)
   * @param networkInterfaceId The ID of a network interface. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * The ID of the route table for the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-routetableid)
   * @param routeTableId The ID of the route table for the route. 
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  /**
   * The ID of a transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-transitgatewayid)
   * @param transitGatewayId The ID of a transit gateway. 
   */
  public fun transitGatewayId(transitGatewayId: String) {
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
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  /**
   * The ID of a VPC peering connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-route.html#cfn-ec2-route-vpcpeeringconnectionid)
   * @param vpcPeeringConnectionId The ID of a VPC peering connection. 
   */
  public fun vpcPeeringConnectionId(vpcPeeringConnectionId: String) {
    cdkBuilder.vpcPeeringConnectionId(vpcPeeringConnectionId)
  }

  public fun build(): CfnRoute = cdkBuilder.build()
}
