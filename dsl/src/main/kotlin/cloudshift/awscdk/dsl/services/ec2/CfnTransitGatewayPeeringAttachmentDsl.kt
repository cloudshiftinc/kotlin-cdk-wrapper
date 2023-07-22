@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayPeeringAttachment.Builder =
      CfnTransitGatewayPeeringAttachment.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The ID of the AWS account that owns the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peeraccountid)
   * @param peerAccountId The ID of the AWS account that owns the transit gateway. 
   */
  public fun peerAccountId(peerAccountId: String) {
    cdkBuilder.peerAccountId(peerAccountId)
  }

  /**
   * The Region of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peerregion)
   * @param peerRegion The Region of the transit gateway. 
   */
  public fun peerRegion(peerRegion: String) {
    cdkBuilder.peerRegion(peerRegion)
  }

  /**
   * The ID of the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-peertransitgatewayid)
   * @param peerTransitGatewayId The ID of the transit gateway. 
   */
  public fun peerTransitGatewayId(peerTransitGatewayId: String) {
    cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
  }

  /**
   * The tags for the transit gateway peering attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
   * @param tags The tags for the transit gateway peering attachment. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags for the transit gateway peering attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-tags)
   * @param tags The tags for the transit gateway peering attachment. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ID of the transit gateway peering attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaypeeringattachment.html#cfn-ec2-transitgatewaypeeringattachment-transitgatewayid)
   * @param transitGatewayId The ID of the transit gateway peering attachment. 
   */
  public fun transitGatewayId(transitGatewayId: String) {
    cdkBuilder.transitGatewayId(transitGatewayId)
  }

  public fun build(): CfnTransitGatewayPeeringAttachment {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
