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
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
import software.constructs.Construct

/**
 * Creates a VPC attachment on an edge location of a core network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnVpcAttachment cfnVpcAttachment = CfnVpcAttachment.Builder.create(this, "MyCfnVpcAttachment")
 * .coreNetworkId("coreNetworkId")
 * .subnetArns(List.of("subnetArns"))
 * .vpcArn("vpcArn")
 * // the properties below are optional
 * .options(VpcOptionsProperty.builder()
 * .applianceModeSupport(false)
 * .ipv6Support(false)
 * .build())
 * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html)
 */
@CdkDslMarker
public class CfnVpcAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVpcAttachment.Builder = CfnVpcAttachment.Builder.create(scope, id)

  private val _subnetArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The core network ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-corenetworkid)
   * @param coreNetworkId The core network ID. 
   */
  public fun coreNetworkId(coreNetworkId: String) {
    cdkBuilder.coreNetworkId(coreNetworkId)
  }

  /**
   * Options for creating the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
   * @param options Options for creating the VPC attachment. 
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * Options for creating the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
   * @param options Options for creating the VPC attachment. 
   */
  public fun options(options: CfnVpcAttachment.VpcOptionsProperty) {
    cdkBuilder.options(options)
  }

  /**
   * The attachment to move from one segment to another.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
   * @param proposedSegmentChange The attachment to move from one segment to another. 
   */
  public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  /**
   * The attachment to move from one segment to another.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
   * @param proposedSegmentChange The attachment to move from one segment to another. 
   */
  public
      fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty) {
    cdkBuilder.proposedSegmentChange(proposedSegmentChange)
  }

  /**
   * The subnet ARNs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
   * @param subnetArns The subnet ARNs. 
   */
  public fun subnetArns(vararg subnetArns: String) {
    _subnetArns.addAll(listOf(*subnetArns))
  }

  /**
   * The subnet ARNs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
   * @param subnetArns The subnet ARNs. 
   */
  public fun subnetArns(subnetArns: Collection<String>) {
    _subnetArns.addAll(subnetArns)
  }

  /**
   * The tags associated with the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
   * @param tags The tags associated with the VPC attachment. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags associated with the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
   * @param tags The tags associated with the VPC attachment. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The ARN of the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-vpcarn)
   * @param vpcArn The ARN of the VPC attachment. 
   */
  public fun vpcArn(vpcArn: String) {
    cdkBuilder.vpcArn(vpcArn)
  }

  public fun build(): CfnVpcAttachment {
    if(_subnetArns.isNotEmpty()) cdkBuilder.subnetArns(_subnetArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
