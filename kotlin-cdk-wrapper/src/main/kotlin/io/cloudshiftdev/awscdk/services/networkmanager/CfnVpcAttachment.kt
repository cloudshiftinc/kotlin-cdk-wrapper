@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a VPC attachment on an edge location of a core network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnVpcAttachment cfnVpcAttachment = CfnVpcAttachment.Builder.create(this, "MyCfnVpcAttachment")
 * .coreNetworkId("coreNetworkId")
 * .subnetArns(List.of("subnetArns"))
 * .vpcArn("vpcArn")
 * // the properties below are optional
 * .options(VpcOptionsProperty.builder()
 * .applianceModeSupport(false)
 * .dnsSupport(false)
 * .ipv6Support(false)
 * .securityGroupReferencingSupport(false)
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html)
 */
public open class CfnVpcAttachment(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnVpcAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVpcAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcAttachmentProps(props)
  )

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
   * The name of the network function group.
   */
  public open fun attrNetworkFunctionGroupName(): String =
      unwrap(this).getAttrNetworkFunctionGroupName()

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(): Any? = unwrap(this).getOptions()

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  public open fun options(`value`: VpcOptionsProperty) {
    unwrap(this).setOptions(`value`.let(VpcOptionsProperty.Companion::unwrap))
  }

  /**
   * Options for creating the VPC attachment.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e12fd0a4faa3aac7d9970559cee1a47349f2ab80c469430c5f6ef126d8686e81")
  public open fun options(`value`: VpcOptionsProperty.Builder.() -> Unit): Unit =
      options(VpcOptionsProperty(`value`))

  /**
   * Describes proposed changes to a network function group.
   */
  public open fun proposedNetworkFunctionGroupChange(): Any? =
      unwrap(this).getProposedNetworkFunctionGroupChange()

  /**
   * Describes proposed changes to a network function group.
   */
  public open fun proposedNetworkFunctionGroupChange(`value`: IResolvable) {
    unwrap(this).setProposedNetworkFunctionGroupChange(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes proposed changes to a network function group.
   */
  public open
      fun proposedNetworkFunctionGroupChange(`value`: ProposedNetworkFunctionGroupChangeProperty) {
    unwrap(this).setProposedNetworkFunctionGroupChange(`value`.let(ProposedNetworkFunctionGroupChangeProperty.Companion::unwrap))
  }

  /**
   * Describes proposed changes to a network function group.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e53bfd081fe0b30db2236031993dddc72ebab4b0427cf09c4f05bc562c9ed72")
  public open
      fun proposedNetworkFunctionGroupChange(`value`: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
      Unit = proposedNetworkFunctionGroupChange(ProposedNetworkFunctionGroupChangeProperty(`value`))

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes a proposed segment change.
   */
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty.Companion::unwrap))
  }

  /**
   * Describes a proposed segment change.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    public fun options(options: VpcOptionsProperty.Builder.() -> Unit)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d941744ff082e1f82723639e4e1dda96153b7e355b2922dff1286be21d8b7838")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.options(options.let(IResolvable.Companion::unwrap))
    }

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    override fun options(options: VpcOptionsProperty) {
      cdkBuilder.options(options.let(VpcOptionsProperty.Companion::unwrap))
    }

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     * @param options Options for creating the VPC attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eacb9293db63e6186b9b8dd6e9c5fe8aa22c9ceeb6cce74db1a42b2d3b3c998")
    override fun options(options: VpcOptionsProperty.Builder.() -> Unit): Unit =
        options(VpcOptionsProperty(options))

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(ProposedNetworkFunctionGroupChangeProperty.Companion::unwrap))
    }

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d941744ff082e1f82723639e4e1dda96153b7e355b2922dff1286be21d8b7838")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty.Companion::unwrap))
    }

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachment
  }

  /**
   * Describes proposed changes to a network function group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * ProposedNetworkFunctionGroupChangeProperty proposedNetworkFunctionGroupChangeProperty =
   * ProposedNetworkFunctionGroupChangeProperty.builder()
   * .attachmentPolicyRuleNumber(123)
   * .networkFunctionGroupName("networkFunctionGroupName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html)
   */
  public interface ProposedNetworkFunctionGroupChangeProperty {
    /**
     * The proposed new attachment policy rule number for the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The proposed name change for the network function group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
     */
    public fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

    /**
     * The list of proposed changes to the key-value tags associated with the network function
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-tags)
     */
    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A builder for [ProposedNetworkFunctionGroupChangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attachmentPolicyRuleNumber The proposed new attachment policy rule number for the
       * network function group.
       */
      public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number)

      /**
       * @param networkFunctionGroupName The proposed name change for the network function group
       * name.
       */
      public fun networkFunctionGroupName(networkFunctionGroupName: String)

      /**
       * @param tags The list of proposed changes to the key-value tags associated with the network
       * function group.
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The list of proposed changes to the key-value tags associated with the network
       * function group.
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty.builder()

      /**
       * @param attachmentPolicyRuleNumber The proposed new attachment policy rule number for the
       * network function group.
       */
      override fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
      }

      /**
       * @param networkFunctionGroupName The proposed name change for the network function group
       * name.
       */
      override fun networkFunctionGroupName(networkFunctionGroupName: String) {
        cdkBuilder.networkFunctionGroupName(networkFunctionGroupName)
      }

      /**
       * @param tags The list of proposed changes to the key-value tags associated with the network
       * function group.
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
      }

      /**
       * @param tags The list of proposed changes to the key-value tags associated with the network
       * function group.
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedNetworkFunctionGroupChangeProperty {
      /**
       * The proposed new attachment policy rule number for the network function group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The proposed name change for the network function group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
       */
      override fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

      /**
       * The list of proposed changes to the key-value tags associated with the network function
       * group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-vpcattachment-proposednetworkfunctiongroupchange-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProposedNetworkFunctionGroupChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty):
          ProposedNetworkFunctionGroupChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedNetworkFunctionGroupChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedNetworkFunctionGroupChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedNetworkFunctionGroupChangeProperty
    }
  }

  /**
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
   * ProposedSegmentChangeProperty.builder()
   * .attachmentPolicyRuleNumber(123)
   * .segmentName("segmentName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html)
   */
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
        cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedSegmentChangeProperty {
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
          ProposedSegmentChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedSegmentChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.ProposedSegmentChangeProperty
    }
  }

  /**
   * Describes the VPC options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkmanager.*;
   * VpcOptionsProperty vpcOptionsProperty = VpcOptionsProperty.builder()
   * .applianceModeSupport(false)
   * .dnsSupport(false)
   * .ipv6Support(false)
   * .securityGroupReferencingSupport(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html)
   */
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
     * Indicates whether DNS is supported.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-dnssupport)
     */
    public fun dnsSupport(): Any? = unwrap(this).getDnsSupport()

    /**
     * Indicates whether IPv6 is supported.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-ipv6support)
     */
    public fun ipv6Support(): Any? = unwrap(this).getIpv6Support()

    /**
     * Indicates whether security group referencing is enabled for this VPC attachment.
     *
     * The default is `true` . However, at the core network policy-level the default is set to
     * `false` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-securitygroupreferencingsupport)
     */
    public fun securityGroupReferencingSupport(): Any? =
        unwrap(this).getSecurityGroupReferencingSupport()

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
       * @param dnsSupport Indicates whether DNS is supported.
       */
      public fun dnsSupport(dnsSupport: Boolean)

      /**
       * @param dnsSupport Indicates whether DNS is supported.
       */
      public fun dnsSupport(dnsSupport: IResolvable)

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      public fun ipv6Support(ipv6Support: Boolean)

      /**
       * @param ipv6Support Indicates whether IPv6 is supported.
       */
      public fun ipv6Support(ipv6Support: IResolvable)

      /**
       * @param securityGroupReferencingSupport Indicates whether security group referencing is
       * enabled for this VPC attachment.
       * The default is `true` . However, at the core network policy-level the default is set to
       * `false` .
       */
      public fun securityGroupReferencingSupport(securityGroupReferencingSupport: Boolean)

      /**
       * @param securityGroupReferencingSupport Indicates whether security group referencing is
       * enabled for this VPC attachment.
       * The default is `true` . However, at the core network policy-level the default is set to
       * `false` .
       */
      public fun securityGroupReferencingSupport(securityGroupReferencingSupport: IResolvable)
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
        cdkBuilder.applianceModeSupport(applianceModeSupport.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dnsSupport Indicates whether DNS is supported.
       */
      override fun dnsSupport(dnsSupport: Boolean) {
        cdkBuilder.dnsSupport(dnsSupport)
      }

      /**
       * @param dnsSupport Indicates whether DNS is supported.
       */
      override fun dnsSupport(dnsSupport: IResolvable) {
        cdkBuilder.dnsSupport(dnsSupport.let(IResolvable.Companion::unwrap))
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
        cdkBuilder.ipv6Support(ipv6Support.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param securityGroupReferencingSupport Indicates whether security group referencing is
       * enabled for this VPC attachment.
       * The default is `true` . However, at the core network policy-level the default is set to
       * `false` .
       */
      override fun securityGroupReferencingSupport(securityGroupReferencingSupport: Boolean) {
        cdkBuilder.securityGroupReferencingSupport(securityGroupReferencingSupport)
      }

      /**
       * @param securityGroupReferencingSupport Indicates whether security group referencing is
       * enabled for this VPC attachment.
       * The default is `true` . However, at the core network policy-level the default is set to
       * `false` .
       */
      override fun securityGroupReferencingSupport(securityGroupReferencingSupport: IResolvable) {
        cdkBuilder.securityGroupReferencingSupport(securityGroupReferencingSupport.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty,
    ) : CdkObject(cdkObject),
        VpcOptionsProperty {
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
       * Indicates whether DNS is supported.
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-dnssupport)
       */
      override fun dnsSupport(): Any? = unwrap(this).getDnsSupport()

      /**
       * Indicates whether IPv6 is supported.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-ipv6support)
       */
      override fun ipv6Support(): Any? = unwrap(this).getIpv6Support()

      /**
       * Indicates whether security group referencing is enabled for this VPC attachment.
       *
       * The default is `true` . However, at the core network policy-level the default is set to
       * `false` .
       *
       * Default: - true
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-vpcoptions.html#cfn-networkmanager-vpcattachment-vpcoptions-securitygroupreferencingsupport)
       */
      override fun securityGroupReferencingSupport(): Any? =
          unwrap(this).getSecurityGroupReferencingSupport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty):
          VpcOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnVpcAttachment.VpcOptionsProperty
    }
  }
}
