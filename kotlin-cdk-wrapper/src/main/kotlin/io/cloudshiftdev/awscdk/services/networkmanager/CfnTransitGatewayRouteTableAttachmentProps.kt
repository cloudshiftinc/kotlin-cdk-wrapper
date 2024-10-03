@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTransitGatewayRouteTableAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnTransitGatewayRouteTableAttachmentProps cfnTransitGatewayRouteTableAttachmentProps =
 * CfnTransitGatewayRouteTableAttachmentProps.builder()
 * .peeringId("peeringId")
 * .transitGatewayRouteTableArn("transitGatewayRouteTableArn")
 * // the properties below are optional
 * .networkFunctionGroupName("networkFunctionGroupName")
 * .proposedNetworkFunctionGroupChange(ProposedNetworkFunctionGroupChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .networkFunctionGroupName("networkFunctionGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html)
 */
public interface CfnTransitGatewayRouteTableAttachmentProps {
  /**
   * The name of the network function group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-networkfunctiongroupname)
   */
  public fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

  /**
   * The ID of the transit gateway peering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-peeringid)
   */
  public fun peeringId(): String

  /**
   * Describes proposed changes to a network function group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposednetworkfunctiongroupchange)
   */
  public fun proposedNetworkFunctionGroupChange(): Any? =
      unwrap(this).getProposedNetworkFunctionGroupChange()

  /**
   * This property is read-only.
   *
   * Values can't be assigned to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * The list of key-value pairs associated with the transit gateway route table attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the transit gateway attachment route table.
   *
   * For example, `"TransitGatewayRouteTableArn":
   * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-transitgatewayroutetablearn)
   */
  public fun transitGatewayRouteTableArn(): String

  /**
   * A builder for [CfnTransitGatewayRouteTableAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param networkFunctionGroupName The name of the network function group.
     */
    public fun networkFunctionGroupName(networkFunctionGroupName: String)

    /**
     * @param peeringId The ID of the transit gateway peering. 
     */
    public fun peeringId(peeringId: String)

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    public fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable)

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty)

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("367a9706b5b0659df6993edda0b1863ba70cddaee1df411f10a6b8bfee20e84c")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty)

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb22f8427a1c5451293ede1b0bbbebd992635a041ae6e46e273bec6a10d39ae")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transitGatewayRouteTableArn The ARN of the transit gateway attachment route table. 
     * For example, `"TransitGatewayRouteTableArn":
     * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
     */
    public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps.Builder
        =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps.builder()

    /**
     * @param networkFunctionGroupName The name of the network function group.
     */
    override fun networkFunctionGroupName(networkFunctionGroupName: String) {
      cdkBuilder.networkFunctionGroupName(networkFunctionGroupName)
    }

    /**
     * @param peeringId The ID of the transit gateway peering. 
     */
    override fun peeringId(peeringId: String) {
      cdkBuilder.peeringId(peeringId)
    }

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("367a9706b5b0659df6993edda0b1863ba70cddaee1df411f10a6b8bfee20e84c")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(CfnTransitGatewayRouteTableAttachment.ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedSegmentChange This property is read-only.
     * Values can't be assigned to it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb22f8427a1c5451293ede1b0bbbebd992635a041ae6e46e273bec6a10d39ae")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transitGatewayRouteTableArn The ARN of the transit gateway attachment route table. 
     * For example, `"TransitGatewayRouteTableArn":
     * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
     */
    override fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
      cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnTransitGatewayRouteTableAttachmentProps {
    /**
     * The name of the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-networkfunctiongroupname)
     */
    override fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

    /**
     * The ID of the transit gateway peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-peeringid)
     */
    override fun peeringId(): String = unwrap(this).getPeeringId()

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposednetworkfunctiongroupchange)
     */
    override fun proposedNetworkFunctionGroupChange(): Any? =
        unwrap(this).getProposedNetworkFunctionGroupChange()

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * The list of key-value pairs associated with the transit gateway route table attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the transit gateway attachment route table.
     *
     * For example, `"TransitGatewayRouteTableArn":
     * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-transitgatewayroutetablearn)
     */
    override fun transitGatewayRouteTableArn(): String =
        unwrap(this).getTransitGatewayRouteTableArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayRouteTableAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps):
        CfnTransitGatewayRouteTableAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayRouteTableAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps
  }
}
