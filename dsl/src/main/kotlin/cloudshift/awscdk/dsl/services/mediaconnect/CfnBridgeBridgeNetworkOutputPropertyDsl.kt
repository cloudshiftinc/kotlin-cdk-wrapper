@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeNetworkOutputPropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeNetworkOutputProperty.Builder =
      CfnBridge.BridgeNetworkOutputProperty.builder()

  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
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

  public fun ttl(ttl: Number) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CfnBridge.BridgeNetworkOutputProperty = cdkBuilder.build()
}
