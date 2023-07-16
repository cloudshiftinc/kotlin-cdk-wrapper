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
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps

@CdkDslMarker
public class CfnSiteToSiteVpnAttachmentPropsDsl {
  private val cdkBuilder: CfnSiteToSiteVpnAttachmentProps.Builder =
      CfnSiteToSiteVpnAttachmentProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun coreNetworkId(coreNetworkId: String) {
    cdkBuilder.coreNetworkId(coreNetworkId)
  }

  public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public
      fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpnConnectionArn(vpnConnectionArn: String) {
    cdkBuilder.vpnConnectionArn(vpnConnectionArn)
  }

  public fun build(): CfnSiteToSiteVpnAttachmentProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
