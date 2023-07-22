@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.constructs.Construct

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
