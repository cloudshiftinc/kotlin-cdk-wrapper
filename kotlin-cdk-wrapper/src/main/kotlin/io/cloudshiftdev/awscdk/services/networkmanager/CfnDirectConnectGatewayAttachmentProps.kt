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
 * Properties for defining a `CfnDirectConnectGatewayAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnDirectConnectGatewayAttachmentProps cfnDirectConnectGatewayAttachmentProps =
 * CfnDirectConnectGatewayAttachmentProps.builder()
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
public interface CfnDirectConnectGatewayAttachmentProps {
  /**
   * The ID of a core network for the Direct Connect Gateway attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-corenetworkid)
   */
  public fun coreNetworkId(): String

  /**
   * The Direct Connect gateway attachment ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-directconnectgatewayarn)
   */
  public fun directConnectGatewayArn(): String

  /**
   * The Regions where the edges are located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
   */
  public fun edgeLocations(): List<String>

  /**
   * Describes proposed changes to a network function group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
   */
  public fun proposedNetworkFunctionGroupChange(): Any? =
      unwrap(this).getProposedNetworkFunctionGroupChange()

  /**
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * Tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDirectConnectGatewayAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreNetworkId The ID of a core network for the Direct Connect Gateway attachment. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * @param directConnectGatewayArn The Direct Connect gateway attachment ARN. 
     */
    public fun directConnectGatewayArn(directConnectGatewayArn: String)

    /**
     * @param edgeLocations The Regions where the edges are located. 
     */
    public fun edgeLocations(edgeLocations: List<String>)

    /**
     * @param edgeLocations The Regions where the edges are located. 
     */
    public fun edgeLocations(vararg edgeLocations: String)

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
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty)

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e6e3f5b691b0ddf98d0f68aceb7b585f5ccbdc3b2a2adfa6cc91021e6b4fe")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1659198aa57cbad94d7b3e75d1ce740ee27a12b81b25ad9dabc7d976668b2f51")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags for the attachment.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps.Builder
        =
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps.builder()

    /**
     * @param coreNetworkId The ID of a core network for the Direct Connect Gateway attachment. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * @param directConnectGatewayArn The Direct Connect gateway attachment ARN. 
     */
    override fun directConnectGatewayArn(directConnectGatewayArn: String) {
      cdkBuilder.directConnectGatewayArn(directConnectGatewayArn)
    }

    /**
     * @param edgeLocations The Regions where the edges are located. 
     */
    override fun edgeLocations(edgeLocations: List<String>) {
      cdkBuilder.edgeLocations(edgeLocations)
    }

    /**
     * @param edgeLocations The Regions where the edges are located. 
     */
    override fun edgeLocations(vararg edgeLocations: String): Unit =
        edgeLocations(edgeLocations.toList())

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
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("257e6e3f5b691b0ddf98d0f68aceb7b585f5ccbdc3b2a2adfa6cc91021e6b4fe")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(CfnDirectConnectGatewayAttachment.ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1659198aa57cbad94d7b3e75d1ce740ee27a12b81b25ad9dabc7d976668b2f51")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnDirectConnectGatewayAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * @param tags Tags for the attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags for the attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnDirectConnectGatewayAttachmentProps {
    /**
     * The ID of a core network for the Direct Connect Gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * The Direct Connect gateway attachment ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-directconnectgatewayarn)
     */
    override fun directConnectGatewayArn(): String = unwrap(this).getDirectConnectGatewayArn()

    /**
     * The Regions where the edges are located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-edgelocations)
     */
    override fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations()

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposednetworkfunctiongroupchange)
     */
    override fun proposedNetworkFunctionGroupChange(): Any? =
        unwrap(this).getProposedNetworkFunctionGroupChange()

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-directconnectgatewayattachment.html#cfn-networkmanager-directconnectgatewayattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnDirectConnectGatewayAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps):
        CfnDirectConnectGatewayAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDirectConnectGatewayAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectConnectGatewayAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnDirectConnectGatewayAttachmentProps
  }
}
