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
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayRouteTableAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayRouteTableAttachment.Builder =
      CfnTransitGatewayRouteTableAttachment.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun peeringId(peeringId: String) {
    cdkBuilder.peeringId(peeringId)
  }

  public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public
      fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
    cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
  }

  public fun build(): CfnTransitGatewayRouteTableAttachment {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
