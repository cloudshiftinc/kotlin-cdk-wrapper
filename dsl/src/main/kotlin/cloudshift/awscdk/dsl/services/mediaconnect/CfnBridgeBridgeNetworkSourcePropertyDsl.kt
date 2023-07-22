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

  /**
   * @param multicastIp The network source multicast IP. 
   */
  public fun multicastIp(multicastIp: String) {
    cdkBuilder.multicastIp(multicastIp)
  }

  /**
   * @param name The name of the network source. 
   * This name is used to reference the source and must be unique among sources in this bridge.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param networkName The network source's gateway network name. 
   */
  public fun networkName(networkName: String) {
    cdkBuilder.networkName(networkName)
  }

  /**
   * @param port The network source port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The network source protocol. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnBridge.BridgeNetworkSourceProperty = cdkBuilder.build()
}
