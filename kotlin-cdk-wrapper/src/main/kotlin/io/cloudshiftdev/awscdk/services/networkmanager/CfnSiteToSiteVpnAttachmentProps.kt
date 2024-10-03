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
 * Properties for defining a `CfnSiteToSiteVpnAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnSiteToSiteVpnAttachmentProps cfnSiteToSiteVpnAttachmentProps =
 * CfnSiteToSiteVpnAttachmentProps.builder()
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
public interface CfnSiteToSiteVpnAttachmentProps {
  /**
   * The ID of a core network where you're creating a site-to-site VPN attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
   */
  public fun coreNetworkId(): String

  /**
   * The name of the network function group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-networkfunctiongroupname)
   */
  public fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

  /**
   * Describes proposed changes to a network function group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
   */
  public fun proposedNetworkFunctionGroupChange(): Any? =
      unwrap(this).getProposedNetworkFunctionGroupChange()

  /**
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * The tags associated with the Site-to-Site VPN attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the site-to-site VPN attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-vpnconnectionarn)
   */
  public fun vpnConnectionArn(): String

  /**
   * A builder for [CfnSiteToSiteVpnAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     * attachment. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * @param networkFunctionGroupName The name of the network function group.
     */
    public fun networkFunctionGroupName(networkFunctionGroupName: String)

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
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty)

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba964619265a75ba81bc3ce36b7cb03793468be066789304a2a05d55d8f25ab")
    public
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit)

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
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a2349541b75d627879d946aaf65fca8f46d23c33dbb13cc1feb8fd82d31185")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * @param tags The tags associated with the Site-to-Site VPN attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the Site-to-Site VPN attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpnConnectionArn The ARN of the site-to-site VPN attachment. 
     */
    public fun vpnConnectionArn(vpnConnectionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps.builder()

    /**
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     * attachment. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * @param networkFunctionGroupName The name of the network function group.
     */
    override fun networkFunctionGroupName(networkFunctionGroupName: String) {
      cdkBuilder.networkFunctionGroupName(networkFunctionGroupName)
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
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty) {
      cdkBuilder.proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange.let(CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedNetworkFunctionGroupChange Describes proposed changes to a network function
     * group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fba964619265a75ba81bc3ce36b7cb03793468be066789304a2a05d55d8f25ab")
    override
        fun proposedNetworkFunctionGroupChange(proposedNetworkFunctionGroupChange: CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty.Builder.() -> Unit):
        Unit =
        proposedNetworkFunctionGroupChange(CfnSiteToSiteVpnAttachment.ProposedNetworkFunctionGroupChangeProperty(proposedNetworkFunctionGroupChange))

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
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Companion::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a2349541b75d627879d946aaf65fca8f46d23c33dbb13cc1feb8fd82d31185")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * @param tags The tags associated with the Site-to-Site VPN attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags associated with the Site-to-Site VPN attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpnConnectionArn The ARN of the site-to-site VPN attachment. 
     */
    override fun vpnConnectionArn(vpnConnectionArn: String) {
      cdkBuilder.vpnConnectionArn(vpnConnectionArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnSiteToSiteVpnAttachmentProps {
    /**
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * The name of the network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-networkfunctiongroupname)
     */
    override fun networkFunctionGroupName(): String? = unwrap(this).getNetworkFunctionGroupName()

    /**
     * Describes proposed changes to a network function group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposednetworkfunctiongroupchange)
     */
    override fun proposedNetworkFunctionGroupChange(): Any? =
        unwrap(this).getProposedNetworkFunctionGroupChange()

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * The tags associated with the Site-to-Site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-vpnconnectionarn)
     */
    override fun vpnConnectionArn(): String = unwrap(this).getVpnConnectionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSiteToSiteVpnAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps):
        CfnSiteToSiteVpnAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSiteToSiteVpnAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSiteToSiteVpnAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
  }
}
