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
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps

@CdkDslMarker
public class CfnConnectAttachmentPropsDsl {
  private val cdkBuilder: CfnConnectAttachmentProps.Builder = CfnConnectAttachmentProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param coreNetworkId The ID of the core network where the Connect attachment is located. 
   */
  public fun coreNetworkId(coreNetworkId: String) {
    cdkBuilder.coreNetworkId(coreNetworkId)
  }

  /**
   * @param edgeLocation The Region where the edge is located. 
   */
  public fun edgeLocation(edgeLocation: String) {
    cdkBuilder.edgeLocation(edgeLocation)
  }

  /**
   * @param options Options for connecting an attachment. 
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * @param options Options for connecting an attachment. 
   */
  public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
    cdkBuilder.options(options)
  }

  /**
   * @param proposedSegmentChange The attachment to move from one segment to another.
   */
  public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  /**
   * @param proposedSegmentChange The attachment to move from one segment to another.
   */
  public
      fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  /**
   * @param tags Tags for the attachment.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Tags for the attachment.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param transportAttachmentId The ID of the transport attachment. 
   */
  public fun transportAttachmentId(transportAttachmentId: String) {
    cdkBuilder.transportAttachmentId(transportAttachmentId)
  }

  public fun build(): CfnConnectAttachmentProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
