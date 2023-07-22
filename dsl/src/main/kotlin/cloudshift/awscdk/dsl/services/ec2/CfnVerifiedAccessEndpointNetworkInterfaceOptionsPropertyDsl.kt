@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

@CdkDslMarker
public class CfnVerifiedAccessEndpointNetworkInterfaceOptionsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.Builder =
      CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty.builder()

  /**
   * @param networkInterfaceId The ID of the network interface.
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param port The IP port number.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The IP protocol.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnVerifiedAccessEndpoint.NetworkInterfaceOptionsProperty = cdkBuilder.build()
}
