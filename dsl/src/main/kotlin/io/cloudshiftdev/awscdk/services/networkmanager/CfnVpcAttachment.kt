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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVpcAttachment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the VPC attachment.
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
   * This will be `VPC` .
   */
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  /**
   * The ARN of the core network.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * The timestamp when the VPC attachment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Region where the core network edge is located.
   */
  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  /**
   * The ID of the VPC attachment owner.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The resource ARN for the VPC attachment.
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
   * The timestamp when the VPC attachment was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The core network ID.
   */
  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  /**
   * The core network ID.
   */
  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(`value`: VpcOptionsProperty) {
    unwrap(this).setOptions(`value`.let(VpcOptionsProperty::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e12fd0a4faa3aac7d9970559cee1a47349f2ab80c469430c5f6ef126d8686e81")
  public open fun options(`value`: VpcOptionsProperty.Builder.() -> Unit): Unit =
      options(VpcOptionsProperty(`value`))

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  /**
   * Describes a proposed segment change.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b344db48c3da084c253da648cecffdae52f6ec82521c7dc622e326f934fa6d25")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  /**
   * The subnet ARNs.
   */
  public open fun subnetArns(): List<String> = unwrap(this).getSubnetArns()

  /**
   * The subnet ARNs.
   */
  public open fun subnetArns(`value`: List<String>) {
    unwrap(this).setSubnetArns(`value`)
  }

  /**
   * The subnet ARNs.
   */
  public open fun subnetArns(vararg `value`: String): Unit = subnetArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with the VPC attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with the VPC attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with the VPC attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the VPC attachment.
   */
  public open fun vpcArn(): String = unwrap(this).getVpcArn()

  /**
   * The ARN of the VPC attachment.
   */
  public open fun vpcArn(`value`: String) {
    unwrap(this).setVpcArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.networkmanager.CfnVpcAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The core network ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-corenetworkid)
     * @param coreNetworkId The core network ID. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    public fun options(options: IResolvable)

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    public fun options(options: VpcOptionsProperty)

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    public fun options(options: VpcOptionsProperty.Builder.() -> Unit)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6df3611e86e18a84c20a6d40323432db1b1213cd55e3f7ae0a0b4320a85d6b")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * The subnet ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
     * @param subnetArns The subnet ARNs. 
     */
    public fun subnetArns(subnetArns: List<String>)

    /**
     * The subnet ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
     * @param subnetArns The subnet ARNs. 
     */
    public fun subnetArns(vararg subnetArns: String)

    /**
     * The tags associated with the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
     * @param tags The tags associated with the VPC attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
     * @param tags The tags associated with the VPC attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-vpcarn)
     * @param vpcArn The ARN of the VPC attachment. 
     */
    public fun vpcArn(vpcArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.Builder
        = software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.Builder.create(scope, id)

    /**
     * The core network ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-corenetworkid)
     * @param coreNetworkId The core network ID. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    override fun options(options: VpcOptionsProperty) {
      cdkBuilder.options(options.let(VpcOptionsProperty::unwrap))
    }

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    override fun options(options: VpcOptionsProperty.Builder.() -> Unit): Unit =
        options(VpcOptionsProperty(options))

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad6df3611e86e18a84c20a6d40323432db1b1213cd55e3f7ae0a0b4320a85d6b")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * The subnet ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
     * @param subnetArns The subnet ARNs. 
     */
    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    /**
     * The subnet ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
     * @param subnetArns The subnet ARNs. 
     */
    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    /**
     * The tags associated with the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
     * @param tags The tags associated with the VPC attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
     * @param tags The tags associated with the VPC attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-vpcarn)
     * @param vpcArn The ARN of the VPC attachment. 
     */
    override fun vpcArn(vpcArn: String) {
      cdkBuilder.vpcArn(vpcArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnVpcAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment):
        CfnVpcAttachment = CfnVpcAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnVpcAttachment):
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment = wrapped.cdkObject
  }

  public interface VpcOptionsProperty {
    /**
     * Indicates whether appliance mode is supported.
     *
     * If enabled, traffic flow between a source and destination use the same Availability Zone for
     * the VPC attachment for the lifetime of that flow. The default value is `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-appliancemodesupport)
     */
    public fun applianceModeSupport(): Any? = unwrap(this).getApplianceModeSupport()

    /**
     * Indicates whether IPv6 is supported.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-ipv6support)
     */
    public fun ipv6Support(): Any? = unwrap(this).getIpv6Support()

    /**
     * A builder for [VpcOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applianceModeSupport Indicates whether appliance mode is supported.
       * If enabled, traffic flow between a source and destination use the same Availability Zone
       * for the VPC attachment for the lifetime of that flow. The default value is `false` .
       */
      public fun applianceModeSupport(applianceModeSupport: Boolean)

      /**
       * @param applianceModeSupport Indicates whether appliance mode is supported.
       * If enabled, traffic flow between a source and destination use the same Availability Zone
       * for the VPC attachment for the lifetime of that flow. The default value is `false` .
       */
      public fun applianceModeSupport(applianceModeSupport: IResolvable)

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      public fun ipv6Support(ipv6Support: Boolean)

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      public fun ipv6Support(ipv6Support: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty.builder()

      /**
       * @param applianceModeSupport Indicates whether appliance mode is supported.
       * If enabled, traffic flow between a source and destination use the same Availability Zone
       * for the VPC attachment for the lifetime of that flow. The default value is `false` .
       */
      override fun applianceModeSupport(applianceModeSupport: Boolean) {
        cdkBuilder.applianceModeSupport(applianceModeSupport)
      }

      /**
       * @param applianceModeSupport Indicates whether appliance mode is supported.
       * If enabled, traffic flow between a source and destination use the same Availability Zone
       * for the VPC attachment for the lifetime of that flow. The default value is `false` .
       */
      override fun applianceModeSupport(applianceModeSupport: IResolvable) {
        cdkBuilder.applianceModeSupport(applianceModeSupport.let(IResolvable::unwrap))
      }

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      override fun ipv6Support(ipv6Support: Boolean) {
        cdkBuilder.ipv6Support(ipv6Support)
      }

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      override fun ipv6Support(ipv6Support: IResolvable) {
        cdkBuilder.ipv6Support(ipv6Support.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty,
    ) : CdkObject(cdkObject), VpcOptionsProperty {
      /**
       * Indicates whether appliance mode is supported.
       *
       * If enabled, traffic flow between a source and destination use the same Availability Zone
       * for the VPC attachment for the lifetime of that flow. The default value is `false` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-appliancemodesupport)
       */
      override fun applianceModeSupport(): Any? = unwrap(this).getApplianceModeSupport()

      /**
       * Indicates whether IPv6 is supported.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-ipv6support)
       */
      override fun ipv6Support(): Any? = unwrap(this).getIpv6Support()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty):
          VpcOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty
    }
  }

  public interface ProposedSegmentChangeProperty {
    /**
     * The rule number in the policy document that applies to this change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The name of the segment to change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-segmentname)
     */
    public fun segmentName(): String? = unwrap(this).getSegmentName()

    /**
     * The list of key-value tags that changed for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-tags)
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
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject), ProposedSegmentChangeProperty {
      /**
       * The rule number in the policy document that applies to this change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The name of the segment to change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-segmentname)
       */
      override fun segmentName(): String? = unwrap(this).getSegmentName()

      /**
       * The list of key-value tags that changed for the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html#cfn-networkmanager-vpcattachment-proposedsegmentchange-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
    }
  }
}
