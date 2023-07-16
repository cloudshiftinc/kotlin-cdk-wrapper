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

  public fun coreNetworkId(coreNetworkId: String) {
    cdkBuilder.coreNetworkId(coreNetworkId)
  }

  public fun edgeLocation(edgeLocation: String) {
    cdkBuilder.edgeLocation(edgeLocation)
  }

  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
    cdkBuilder.options(options)
  }

  public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public
      fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transportAttachmentId(transportAttachmentId: String) {
    cdkBuilder.transportAttachmentId(transportAttachmentId)
  }

  public fun build(): CfnConnectAttachmentProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
