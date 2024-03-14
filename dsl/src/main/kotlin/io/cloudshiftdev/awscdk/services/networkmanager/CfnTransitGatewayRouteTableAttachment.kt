package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRouteTableAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the transit gateway route table attachment.
   */
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  /**
   * The policy rule number associated with the attachment.
   */
  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  /**
   * The type of attachment.
   *
   * This will be `TRANSIT_GATEWAY_ROUTE_TABLE` .
   */
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  /**
   * The ARN of the core network.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * The ID of the core network.
   */
  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  /**
   * The timestamp when the transit gateway route table attachment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Region where the core network edge is located.
   */
  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  /**
   * The ID of the transit gateway route table attachment owner.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The resource ARN for the transit gateway route table attachment.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The name of the attachment's segment.
   */
  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  /**
   * The state of the attachment.
   *
   * This can be: `REJECTED` | `PENDING_ATTACHMENT_ACCEPTANCE` | `CREATING` | `FAILED` | `AVAILABLE`
   * | `UPDATING` | `PENDING_NETWORK_UPDATE` | `PENDING_TAG_ACCEPTANCE` | `DELETING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The timestamp when the transit gateway route table attachment was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the transit gateway peering.
   */
  public open fun peeringId(): String = unwrap(this).getPeeringId()

  /**
   * The ID of the transit gateway peering.
   */
  public open fun peeringId(`value`: String) {
    unwrap(this).setPeeringId(`value`)
  }

  /**
   * This property is read-only.
   */
  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * This property is read-only.
   */
  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  /**
   * This property is read-only.
   */
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  /**
   * This property is read-only.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1119ab37be45fcd13819f8543e90599f5ea47b92adf94d468b7fa43dfcc4eb93")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of key-value pairs associated with the transit gateway route table attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of key-value pairs associated with the transit gateway route table attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of key-value pairs associated with the transit gateway route table attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the transit gateway attachment route table.
   */
  public open fun transitGatewayRouteTableArn(): String =
      unwrap(this).getTransitGatewayRouteTableArn()

  /**
   * The ARN of the transit gateway attachment route table.
   */
  public open fun transitGatewayRouteTableArn(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the transit gateway peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-peeringid)
     * @param peeringId The ID of the transit gateway peering. 
     */
    public fun peeringId(peeringId: String)

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d991b34abdf57174eede1ec2d656faad25f64d971bd38f7465659b28918fb763")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * The list of key-value pairs associated with the transit gateway route table attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value pairs associated with the transit gateway route table attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the transit gateway attachment route table.
     *
     * For example, `"TransitGatewayRouteTableArn":
     * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-transitgatewayroutetablearn)
     * @param transitGatewayRouteTableArn The ARN of the transit gateway attachment route table. 
     */
    public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.Builder
        =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.Builder.create(scope,
        id)

    /**
     * The ID of the transit gateway peering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-peeringid)
     * @param peeringId The ID of the transit gateway peering. 
     */
    override fun peeringId(peeringId: String) {
      cdkBuilder.peeringId(peeringId)
    }

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    /**
     * This property is read-only.
     *
     * Values can't be assigned to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange)
     * @param proposedSegmentChange This property is read-only. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d991b34abdf57174eede1ec2d656faad25f64d971bd38f7465659b28918fb763")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * The list of key-value pairs associated with the transit gateway route table attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of key-value pairs associated with the transit gateway route table attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-tags)
     * @param tags The list of key-value pairs associated with the transit gateway route table
     * attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the transit gateway attachment route table.
     *
     * For example, `"TransitGatewayRouteTableArn":
     * "arn:aws:ec2:us-west-2:123456789012:transit-gateway-route-table/tgw-rtb-9876543210123456"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-transitgatewayroutetableattachment.html#cfn-networkmanager-transitgatewayroutetableattachment-transitgatewayroutetablearn)
     * @param transitGatewayRouteTableArn The ARN of the transit gateway attachment route table. 
     */
    override fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
      cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRouteTableAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRouteTableAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment):
        CfnTransitGatewayRouteTableAttachment = CfnTransitGatewayRouteTableAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAttachment):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment =
        wrapped.cdkObject
  }

  public interface ProposedSegmentChangeProperty {
    /**
     * The rule number in the policy document that applies to this change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The name of the segment to change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-segmentname)
     */
    public fun segmentName(): String? = unwrap(this).getSegmentName()

    /**
     * The list of key-value tags that changed for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [ProposedSegmentChangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentPolicyRuleNumber The rule number in the policy document that applies to
       * this change.
       */
      public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number)

      /**
       * @param segmentName The name of the segment to change.
       */
      public fun segmentName(segmentName: String)

      /**
       * @param tags The list of key-value tags that changed for the segment.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The list of key-value tags that changed for the segment.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.builder()

      /**
       * @param attachmentPolicyRuleNumber The rule number in the policy document that applies to
       * this change.
       */
      override fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
      }

      /**
       * @param segmentName The name of the segment to change.
       */
      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      /**
       * @param tags The list of key-value tags that changed for the segment.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The list of key-value tags that changed for the segment.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject), ProposedSegmentChangeProperty {
      /**
       * The rule number in the policy document that applies to this change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The name of the segment to change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-segmentname)
       */
      override fun segmentName(): String? = unwrap(this).getSegmentName()

      /**
       * The list of key-value tags that changed for the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange.html#cfn-networkmanager-transitgatewayroutetableattachment-proposedsegmentchange-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty
    }
  }
}
