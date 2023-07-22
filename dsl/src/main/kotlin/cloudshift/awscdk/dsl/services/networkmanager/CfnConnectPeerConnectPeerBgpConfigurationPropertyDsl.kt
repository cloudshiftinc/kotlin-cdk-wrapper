@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

@CdkDslMarker
public class CfnConnectPeerConnectPeerBgpConfigurationPropertyDsl {
  private val cdkBuilder: CfnConnectPeer.ConnectPeerBgpConfigurationProperty.Builder =
      CfnConnectPeer.ConnectPeerBgpConfigurationProperty.builder()

  /**
   * @param coreNetworkAddress The address of a core network.
   */
  public fun coreNetworkAddress(coreNetworkAddress: String) {
    cdkBuilder.coreNetworkAddress(coreNetworkAddress)
  }

  /**
   * @param coreNetworkAsn The ASN of the Coret Network.
   */
  public fun coreNetworkAsn(coreNetworkAsn: Number) {
    cdkBuilder.coreNetworkAsn(coreNetworkAsn)
  }

  /**
   * @param peerAddress The address of a core network Connect peer.
   */
  public fun peerAddress(peerAddress: String) {
    cdkBuilder.peerAddress(peerAddress)
  }

  /**
   * @param peerAsn The ASN of the Connect peer.
   */
  public fun peerAsn(peerAsn: Number) {
    cdkBuilder.peerAsn(peerAsn)
  }

  public fun build(): CfnConnectPeer.ConnectPeerBgpConfigurationProperty = cdkBuilder.build()
}
