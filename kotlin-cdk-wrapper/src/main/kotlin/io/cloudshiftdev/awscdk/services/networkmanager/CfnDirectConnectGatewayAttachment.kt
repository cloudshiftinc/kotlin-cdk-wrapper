@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * Creates an AWS Direct Connect gateway attachment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnDirectConnectGatewayAttachment cfnDirectConnectGatewayAttachment =
 * CfnDirectConnectGatewayAttachment.Builder.create(this, "MyCfnDirectConnectGatewayAttachment")
 * .coreNetworkId("coreNetworkId")
 * .directConnectGatewayArn("directConnectGatewayArn")
 * .edgeLocations(List.of("edgeLocations"))
 * // the properties below are optional
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html)
 */
public open class CfnDirectConnectGatewayAttachment(
  cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectConnectGatewayAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDirectConnectGatewayAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDirectConnectGatewayAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDirectConnectGatewayAttachmentProps(props)
  )

  /**
   * Id of the attachment.
   */
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  /**
   * The policy rule number associated with the attachment.
   */
  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  /**
   * Attachment type.
   */
  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  /**
   * The ARN of a core network for the Direct Connect Gateway attachment.
   */
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  /**
   * Creation time of the attachment.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The name of the network function group.
   */
  public open fun attrNetworkFunctionGroupName(): String =
      unwrap(this).getAttrNetworkFunctionGroupName()

  /**
   * Owner account of the attachment.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * The ARN of the Resource.
   */
  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  /**
   * The name of the segment attachment..
   */
  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  /**
   * State of the attachment.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Last update time of the attachment.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The ID of a core network for the Direct Connect Gateway attachment.
   */
  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  /**
   * The ID of a core network for the Direct Connect Gateway attachment.
   */
  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  /**
   * The Direct Connect gateway attachment ARN.
   */
  public open fun directConnectGatewayArn(): String = unwrap(this).getDirectConnectGatewayArn()

  /**
   * The Direct Connect gateway attachment ARN.
   */
  public open fun directConnectGatewayArn(`value`: String) {
    unwrap(this).setDirectConnectGatewayArn(`value`)
  }

  /**
   * The Regions where the edges are located.
   */
  public open fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations()

  /**
   * The Regions where the edges are located.
   */
  public open fun edgeLocations(`value`: List<String>) {
    unwrap(this).setEdgeLocations(`value`)
  }

  /**
   * The Regions where the edges are located.
   */
  public open fun edgeLocations(vararg `value`: String): Unit = edgeLocations(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
  @JvmName("5b3d8a043035bba75fc3b53050abd557a4c1944a29ae9742645e26266f01413a")
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
  @JvmName("dd2c1b63cc940c991a5ae86c8aab59487892c172cae4e38a0a7fddc83c6f9a09")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  /**
   * Tags for the attachment.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Tags for the attachment.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Tags for the attachment.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of a core network for the Direct Connect Gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-corenetworkid)
     * @param coreNetworkId The ID of a core network for the Direct Connect Gateway attachment. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * The Direct Connect gateway attachment ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-directconnectgatewayarn)
     * @param directConnectGatewayArn The Direct Connect gateway attachment ARN. 
     */
    public fun directConnectGatewayArn(directConnectGatewayArn: String)

    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
     * @param edgeLocations The Regions where the edges are located. 
     */
    public fun edgeLocations(edgeLocations: List<String>)

    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
     * @param edgeLocations The Regions where the edges are located. 
     */
    public fun edgeLocations(vararg edgeLocations: String)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: IResolvable)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty)

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("698a0d013da57064cbd24455ccd2fbb0960455da3feb3e6db960ad6bfc40f6ce")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d8a7bb6421c39da891ae99faa0ce2cbf847108e7666b6c9cbfe969d8a3605c7")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
     * @param tags Tags for the attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
     * @param tags Tags for the attachment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.Builder =
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.Builder.create(scope,
        id)

    /**
     * The ID of a core network for the Direct Connect Gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-corenetworkid)
     * @param coreNetworkId The ID of a core network for the Direct Connect Gateway attachment. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * The Direct Connect gateway attachment ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-directconnectgatewayarn)
     * @param directConnectGatewayArn The Direct Connect gateway attachment ARN. 
     */
    override fun directConnectGatewayArn(directConnectGatewayArn: String) {
      cdkBuilder.directConnectGatewayArn(directConnectGatewayArn)
    }

    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
     * @param edgeLocations The Regions where the edges are located. 
     */
    override fun edgeLocations(edgeLocations: List<String>) {
      cdkBuilder.edgeLocations(edgeLocations)
    }

    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
     * @param edgeLocations The Regions where the edges are located. 
     */
    override fun edgeLocations(vararg edgeLocations: String): Unit =
        edgeLocations(edgeLocations.toList())

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("698a0d013da57064cbd24455ccd2fbb0960455da3feb3e6db960ad6bfc40f6ce")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
     * @param proposedSegmentChange Describes a proposed segment change. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d8a7bb6421c39da891ae99faa0ce2cbf847108e7666b6c9cbfe969d8a3605c7")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
     * @param tags Tags for the attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
     * @param tags Tags for the attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDirectConnectGatewayAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDirectConnectGatewayAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment):
        CfnDirectConnectGatewayAttachment = CfnDirectConnectGatewayAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnDirectConnectGatewayAttachment):
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment =
        wrapped.cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html)
   */
  public interface ProposedNetworkFunctionGroupChangeProperty {
    /**
     * The proposed new attachment policy rule number for the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The proposed name change for the network function group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
     */
    public fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

    /**
     * The list of proposed changes to the key-value tags associated with the network function
     * group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-tags)
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
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedNetworkFunctionGroupChangeProperty {
      /**
       * The proposed new attachment policy rule number for the network function group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The proposed name change for the network function group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-networkfunctiongroupname)
       */
      override fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

      /**
       * The list of proposed changes to the key-value tags associated with the network function
       * group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange-tags)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty):
          ProposedNetworkFunctionGroupChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedNetworkFunctionGroupChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedNetworkFunctionGroupChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html)
   */
  public interface ProposedSegmentChangeProperty {
    /**
     * The rule number in the policy document that applies to this change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-attachmentpolicyrulenumber)
     */
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    /**
     * The name of the segment to change.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-segmentname)
     */
    public fun segmentName(): String? = unwrap(this).getSegmentName()

    /**
     * The list of key-value tags that changed for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-tags)
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
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty.builder()

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
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty,
    ) : CdkObject(cdkObject),
        ProposedSegmentChangeProperty {
      /**
       * The rule number in the policy document that applies to this change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-attachmentpolicyrulenumber)
       */
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      /**
       * The name of the segment to change.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-segmentname)
       */
      override fun segmentName(): String? = unwrap(this).getSegmentName()

      /**
       * The list of key-value tags that changed for the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-directconnectgatewayattachment-proposedsegmentchange.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProposedSegmentChangeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty
    }
  }
}
