@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

/**
 * The output of the bridge.
 *
 * A network output is delivered to your premises.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * BridgeNetworkOutputProperty bridgeNetworkOutputProperty = BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html)
 */
@CdkDslMarker
public class CfnBridgeBridgeNetworkOutputPropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeNetworkOutputProperty.Builder =
      CfnBridge.BridgeNetworkOutputProperty.builder()

  /**
   * @param ipAddress The network output IP Address. 
   */
  public fun ipAddress(ipAddress: String) {
    cdkBuilder.ipAddress(ipAddress)
  }

  /**
   * @param name The network output name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param networkName The network output's gateway network name. 
   */
  public fun networkName(networkName: String) {
    cdkBuilder.networkName(networkName)
  }

  /**
   * @param port The network output port. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The network output protocol. 
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param ttl The network output TTL. 
   */
  public fun ttl(ttl: Number) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CfnBridge.BridgeNetworkOutputProperty = cdkBuilder.build()
}
