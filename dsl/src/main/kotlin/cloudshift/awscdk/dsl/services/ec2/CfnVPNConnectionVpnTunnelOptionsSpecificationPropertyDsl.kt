@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPNConnection

/**
 * The tunnel options for a single VPN tunnel.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VpnTunnelOptionsSpecificationProperty vpnTunnelOptionsSpecificationProperty =
 * VpnTunnelOptionsSpecificationProperty.builder()
 * .preSharedKey("preSharedKey")
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpnconnection-vpntunneloptionsspecification.html)
 */
@CdkDslMarker
public class CfnVPNConnectionVpnTunnelOptionsSpecificationPropertyDsl {
  private val cdkBuilder: CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.Builder =
      CfnVPNConnection.VpnTunnelOptionsSpecificationProperty.builder()

  /**
   * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between the
   * virtual private gateway and customer gateway.
   * Constraints: Allowed characters are alphanumeric characters, periods (.), and underscores (_).
   * Must be between 8 and 64 characters in length and cannot start with zero (0).
   */
  public fun preSharedKey(preSharedKey: String) {
    cdkBuilder.preSharedKey(preSharedKey)
  }

  /**
   * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
   * Any specified CIDR blocks must be unique across all VPN connections that use the same virtual
   * private gateway.
   *
   * Constraints: A size /30 CIDR block from the `169.254.0.0/16` range. The following CIDR blocks
   * are reserved and cannot be used:
   *
   * * `169.254.0.0/30`
   * * `169.254.1.0/30`
   * * `169.254.2.0/30`
   * * `169.254.3.0/30`
   * * `169.254.4.0/30`
   * * `169.254.5.0/30`
   * * `169.254.169.252/30`
   */
  public fun tunnelInsideCidr(tunnelInsideCidr: String) {
    cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
  }

  public fun build(): CfnVPNConnection.VpnTunnelOptionsSpecificationProperty = cdkBuilder.build()
}
