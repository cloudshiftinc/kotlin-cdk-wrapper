@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnFleet

@CdkDslMarker
public class CfnFleetIpPermissionPropertyDsl {
  private val cdkBuilder: CfnFleet.IpPermissionProperty.Builder =
      CfnFleet.IpPermissionProperty.builder()

  /**
   * @param fromPort A starting value for a range of allowed port numbers. 
   * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
   *
   * For fleets using Windows builds, only ports `1026-60000` are valid.
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param ipRange A range of allowed IP addresses. 
   * This value must be expressed in CIDR notation. Example: " `000.000.000.000/[subnet mask]` " or
   * optionally the shortened version " `0.0.0.0/[subnet mask]` ".
   */
  public fun ipRange(ipRange: String) {
    cdkBuilder.ipRange(ipRange)
  }

  /**
   * @param protocol The network communication protocol used by the fleet. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param toPort An ending value for a range of allowed port numbers. 
   * Port numbers are end-inclusive. This value must be equal to or greater than `FromPort` .
   *
   * For fleets using Linux builds, only ports `22` and `1026-60000` are valid.
   *
   * For fleets using Windows builds, only ports `1026-60000` are valid.
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnFleet.IpPermissionProperty = cdkBuilder.build()
}
