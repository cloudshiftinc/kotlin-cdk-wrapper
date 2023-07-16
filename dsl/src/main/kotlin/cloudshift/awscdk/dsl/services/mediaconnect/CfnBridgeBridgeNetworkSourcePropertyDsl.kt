@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeNetworkSourcePropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeNetworkSourceProperty.Builder =
      CfnBridge.BridgeNetworkSourceProperty.builder()

  public fun multicastIp(multicastIp: String) {
    cdkBuilder.multicastIp(multicastIp)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun networkName(networkName: String) {
    cdkBuilder.networkName(networkName)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnBridge.BridgeNetworkSourceProperty = cdkBuilder.build()
}
