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
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * Tags for the attachment.
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
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags for the attachment.
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
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty::unwrap))
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
     * @param tags Tags for the attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags for the attachment.
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
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps,
  ) : CdkObject(cdkObject), CfnSiteToSiteVpnAttachmentProps {
    /**
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * Tags for the attachment.
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
        CfnSiteToSiteVpnAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnSiteToSiteVpnAttachmentProps

    internal fun unwrap(wrapped: CfnSiteToSiteVpnAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
  }
}
