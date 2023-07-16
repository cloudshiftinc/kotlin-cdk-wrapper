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
import software.constructs.Construct

@CdkDslMarker
public class CfnSiteToSiteVpnAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSiteToSiteVpnAttachment.Builder =
      CfnSiteToSiteVpnAttachment.Builder.create(scope, id)

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

  public fun build(): CfnSiteToSiteVpnAttachment {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
