@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer

/**
 * Describes the BGP options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * BgpOptionsProperty bgpOptionsProperty = BgpOptionsProperty.builder()
 * .peerAsn(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-connectpeer-bgpoptions.html)
 */
@CdkDslMarker
public class CfnConnectPeerBgpOptionsPropertyDsl {
  private val cdkBuilder: CfnConnectPeer.BgpOptionsProperty.Builder =
      CfnConnectPeer.BgpOptionsProperty.builder()

  /**
   * @param peerAsn The Peer ASN of the BGP.
   */
  public fun peerAsn(peerAsn: Number) {
    cdkBuilder.peerAsn(peerAsn)
  }

  public fun build(): CfnConnectPeer.BgpOptionsProperty = cdkBuilder.build()
}
