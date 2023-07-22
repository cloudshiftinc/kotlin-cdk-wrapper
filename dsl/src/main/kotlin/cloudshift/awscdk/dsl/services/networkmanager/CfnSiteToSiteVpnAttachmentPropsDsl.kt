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

  /**
   * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
   * attachment. 
   */
  public fun coreNetworkId(coreNetworkId: String) {
    cdkBuilder.coreNetworkId(coreNetworkId)
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
      fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty) {
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
   * @param vpnConnectionArn The ARN of the site-to-site VPN attachment. 
   */
  public fun vpnConnectionArn(vpnConnectionArn: String) {
    cdkBuilder.vpnConnectionArn(vpnConnectionArn)
  }

  public fun build(): CfnSiteToSiteVpnAttachmentProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
