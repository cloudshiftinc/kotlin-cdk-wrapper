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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnSiteToSiteVpnAttachment cfnSiteToSiteVpnAttachment =
 * CfnSiteToSiteVpnAttachment.Builder.create(this, "MyCfnSiteToSiteVpnAttachment")
 * .coreNetworkId("coreNetworkId")
 * .vpnConnectionArn("vpnConnectionArn")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html)
 */
public open class CfnSiteToSiteVpnAttachment(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSiteToSiteVpnAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSiteToSiteVpnAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSiteToSiteVpnAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSiteToSiteVpnAttachmentProps(props)
  )

  /**
   * The ID of the site-to-site VPN attachment.
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
   * This will be `SITE_TO_SITE_VPN` .
   */
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  /**
   * The ARN of the core network.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * The timestamp when the site-to-site VPN attachment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Region where the core network edge is located.
   */
  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  /**
   * The ID of the site-to-site VPN attachment owner.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The resource ARN for the site-to-site VPN attachment.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The name of the site-to-site VPN attachment's segment.
   */
  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  /**
   * The state of the site-to-site VPN attachment.
   *
   * This can be: `REJECTED` | `PENDING_ATTACHMENT_ACCEPTANCE` | `CREATING` | `FAILED` | `AVAILABLE`
   * | `UPDATING` | `PENDING_NETWORK_UPDATE` | `PENDING_TAG_ACCEPTANCE` | `DELETING` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The timestamp when the site-to-site VPN attachment was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The ID of a core network where you're creating a site-to-site VPN attachment.
   */
  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  /**
   * The ID of a core network where you're creating a site-to-site VPN attachment.
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
   * The name of the network function group.
   */
  public open fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

  /**
   * The name of the network function group.
   */
  public open fun networkFunctionGroupName(`value`: String) {
    unwrap(this).setNetworkFunctionGroupName(`value`)
  }

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
  @JvmName("9384e425d8f9b92c5bcf5d24a2f47b73cdabe3b79ce68a5d1323eed719999bfc")
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
  @JvmName("336ef54f14a81fe5f5273097375dd293068269cd141a3bff84bb76c5e0587aef")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with the Site-to-Site VPN attachment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with the Site-to-Site VPN attachment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags associated with the Site-to-Site VPN attachment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ARN of the site-to-site VPN attachment.
   */
  public open fun vpnConnectionArn(): String = unwrap(this).getVpnConnectionArn()

  /**
   * The ARN of the site-to-site VPN attachment.
   */
  public open fun vpnConnectionArn(`value`: String) {
    unwrap(this).setVpnConnectionArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     * attachment. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * The name of the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-networkfunctiongroupname)
     * @param networkFunctionGroupName The name of the network function group. 
     */
    public fun networkFunctionGroupName(networkFunctionGroupName: String)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("689e603bbabcae40c3396f1f6c2b1fcf049251bf8a9b158944543ca4c16432f4")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ede075052f137cb415454c0085f7edd151418adae72edc0456ce3bd825c957d")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * The tags associated with the Site-to-Site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     * @param tags The tags associated with the Site-to-Site VPN attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the Site-to-Site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     * @param tags The tags associated with the Site-to-Site VPN attachment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ARN of the site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-vpnconnectionarn)
     * @param vpnConnectionArn The ARN of the site-to-site VPN attachment. 
     */
    public fun vpnConnectionArn(vpnConnectionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.Builder.create(scope,
        id)

    /**
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     * attachment. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * The name of the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-networkfunctiongroupname)
     * @param networkFunctionGroupName The name of the network function group. 
     */
    override fun networkFunctionGroupName(networkFunctionGroupName: String) {
      cdkBuilder.networkFunctionGroupName(networkFunctionGroupName)
    }

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("689e603bbabcae40c3396f1f6c2b1fcf049251bf8a9b158944543ca4c16432f4")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ede075052f137cb415454c0085f7edd151418adae72edc0456ce3bd825c957d")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * The tags associated with the Site-to-Site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     * @param tags The tags associated with the Site-to-Site VPN attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags associated with the Site-to-Site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     * @param tags The tags associated with the Site-to-Site VPN attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ARN of the site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-vpnconnectionarn)
     * @param vpnConnectionArn The ARN of the site-to-site VPN attachment. 
     */
    override fun vpnConnectionArn(vpnConnectionArn: String) {
      cdkBuilder.vpnConnectionArn(vpnConnectionArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSiteToSiteVpnAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSiteToSiteVpnAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment):
        CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnSiteToSiteVpnAttachment):
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment =
        wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html)
   */
  public interface ProposedNetworkFunctionGroupChangeProperty {
    /**
     * The proposed new attachment policy rule number for the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The proposed name change for the network function group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
     */
    public fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

    /**
     * The list of proposed changes to the key-value tags associated with the network function
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-tags)
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
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedNetworkFunctionGroupChangeProperty {
      /**
       * The proposed new attachment policy rule number for the network function group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The proposed name change for the network function group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
       */
      override fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

      /**
       * The list of proposed changes to the key-value tags associated with the network function
       * group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange-tags)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty):
          ProposedNetworkFunctionGroupChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedNetworkFunctionGroupChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedNetworkFunctionGroupChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html)
   */
  public interface ProposedSegmentChangeProperty {
    /**
     * The rule number in the policy document that applies to this change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The name of the segment to change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-segmentname)
     */
    public fun segmentName(): String? = unwrap(this).getSegmentName()

    /**
     * The list of key-value tags that changed for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-tags)
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
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedSegmentChangeProperty {
      /**
       * The rule number in the policy document that applies to this change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The name of the segment to change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-segmentname)
       */
      override fun segmentName(): String? = unwrap(this).getSegmentName()

      /**
       * The list of key-value tags that changed for the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-sitetositevpnattachment-proposedsegmentchange.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedSegmentChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
    }
  }
}
