@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.constructs.Construct

/**
 * Specifies a network route to add to a Client VPN endpoint.
 *
 * Each Client VPN endpoint has a route table that describes the available destination network
 * routes. Each route in the route table specifies the path for traffic to specific resources or
 * networks.
 *
 * A target network association must be created before you can specify a route. If you're setting up
 * all the components of a Client VPN endpoint at the same time, you must use the [DependsOn
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to declare a dependency on the `AWS::EC2::ClientVpnTargetNetworkAssociation` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnClientVpnRoute cfnClientVpnRoute = CfnClientVpnRoute.Builder.create(this,
 * "MyCfnClientVpnRoute")
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .destinationCidrBlock("destinationCidrBlock")
 * .targetVpcSubnetId("targetVpcSubnetId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html)
 */
@CdkDslMarker
public class CfnClientVpnRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClientVpnRoute.Builder = CfnClientVpnRoute.Builder.create(scope, id)

  /**
   * The ID of the Client VPN endpoint to which to add the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-clientvpnendpointid)
   * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
   */
  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  /**
   * A brief description of the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-description)
   * @param description A brief description of the route. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The IPv4 address range, in CIDR notation, of the route destination. For example:.
   *
   * * To add a route for Internet access, enter `0.0.0.0/0`
   * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
   * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
   * CIDR range
   * * To add a route for the local network, enter the client CIDR range
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-destinationcidrblock)
   * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route destination.
   * For example:. 
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  /**
   * The ID of the subnet through which you want to route traffic.
   *
   * The specified subnet must be an existing target network of the Client VPN endpoint.
   *
   * Alternatively, if you're adding a route for the local network, specify `local` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-targetvpcsubnetid)
   * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
   */
  public fun targetVpcSubnetId(targetVpcSubnetId: String) {
    cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
  }

  public fun build(): CfnClientVpnRoute = cdkBuilder.build()
}
