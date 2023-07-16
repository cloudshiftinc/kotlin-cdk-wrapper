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

  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  public fun ipRange(ipRange: String) {
    cdkBuilder.ipRange(ipRange)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnFleet.IpPermissionProperty = cdkBuilder.build()
}
