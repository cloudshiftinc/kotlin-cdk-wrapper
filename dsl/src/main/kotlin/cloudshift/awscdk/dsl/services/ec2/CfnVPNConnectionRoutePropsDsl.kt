@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps

/**
 * Properties for defining a `CfnVPNConnectionRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNConnectionRouteProps cfnVPNConnectionRouteProps = CfnVPNConnectionRouteProps.builder()
 * .destinationCidrBlock("destinationCidrBlock")
 * .vpnConnectionId("vpnConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
 */
@CdkDslMarker
public class CfnVPNConnectionRoutePropsDsl {
  private val cdkBuilder: CfnVPNConnectionRouteProps.Builder = CfnVPNConnectionRouteProps.builder()

  /**
   * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
   * network. 
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  /**
   * @param vpnConnectionId The ID of the VPN connection. 
   */
  public fun vpnConnectionId(vpnConnectionId: String) {
    cdkBuilder.vpnConnectionId(vpnConnectionId)
  }

  public fun build(): CfnVPNConnectionRouteProps = cdkBuilder.build()
}
