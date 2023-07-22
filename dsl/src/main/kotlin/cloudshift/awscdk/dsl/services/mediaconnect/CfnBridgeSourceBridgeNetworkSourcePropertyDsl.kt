@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource

@CdkDslMarker
public class CfnBridgeSourceBridgeNetworkSourcePropertyDsl {
  private val cdkBuilder: CfnBridgeSource.BridgeNetworkSourceProperty.Builder =
      CfnBridgeSource.BridgeNetworkSourceProperty.builder()

  /**
   * @param multicastIp The network source multicast IP. 
   */
  public fun multicastIp(multicastIp: String) {
    cdkBuilder.multicastIp(multicastIp)
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

  public fun build(): CfnBridgeSource.BridgeNetworkSourceProperty = cdkBuilder.build()
}
