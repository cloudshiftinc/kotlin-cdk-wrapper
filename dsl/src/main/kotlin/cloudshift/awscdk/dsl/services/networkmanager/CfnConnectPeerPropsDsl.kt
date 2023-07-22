@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps

@CdkDslMarker
public class CfnConnectPeerPropsDsl {
  private val cdkBuilder: CfnConnectPeerProps.Builder = CfnConnectPeerProps.builder()

  private val _insideCidrBlocks: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param bgpOptions Bgp options.
   */
  public fun bgpOptions(bgpOptions: IResolvable) {
    cdkBuilder.bgpOptions(bgpOptions)
  }

  /**
   * @param bgpOptions Bgp options.
   */
  public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
    cdkBuilder.bgpOptions(bgpOptions)
  }

  /**
   * @param connectAttachmentId The ID of the attachment to connect. 
   */
  public fun connectAttachmentId(connectAttachmentId: String) {
    cdkBuilder.connectAttachmentId(connectAttachmentId)
  }

  /**
   * @param coreNetworkAddress The IP address of a core network.
   */
  public fun coreNetworkAddress(coreNetworkAddress: String) {
    cdkBuilder.coreNetworkAddress(coreNetworkAddress)
  }

  /**
   * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
   */
  public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
    _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
  }

  /**
   * @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration.
   */
  public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
    _insideCidrBlocks.addAll(insideCidrBlocks)
  }

  /**
   * @param peerAddress The IP address of the Connect peer. 
   */
  public fun peerAddress(peerAddress: String) {
    cdkBuilder.peerAddress(peerAddress)
  }

  /**
   * @param tags The list of key-value tags associated with the Connect peer.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The list of key-value tags associated with the Connect peer.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConnectPeerProps {
    if(_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
