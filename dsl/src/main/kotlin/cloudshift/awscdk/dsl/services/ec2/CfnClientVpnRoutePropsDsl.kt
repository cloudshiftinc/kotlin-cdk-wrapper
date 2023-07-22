@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps

@CdkDslMarker
public class CfnClientVpnRoutePropsDsl {
  private val cdkBuilder: CfnClientVpnRouteProps.Builder = CfnClientVpnRouteProps.builder()

  /**
   * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
   */
  public fun clientVpnEndpointId(clientVpnEndpointId: String) {
    cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
  }

  /**
   * @param description A brief description of the route.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route destination.
   * For example:. 
   * * To add a route for Internet access, enter `0.0.0.0/0`
   * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
   * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
   * CIDR range
   * * To add a route for the local network, enter the client CIDR range
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  /**
   * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
   * The specified subnet must be an existing target network of the Client VPN endpoint.
   *
   * Alternatively, if you're adding a route for the local network, specify `local` .
   */
  public fun targetVpcSubnetId(targetVpcSubnetId: String) {
    cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
  }

  public fun build(): CfnClientVpnRouteProps = cdkBuilder.build()
}
