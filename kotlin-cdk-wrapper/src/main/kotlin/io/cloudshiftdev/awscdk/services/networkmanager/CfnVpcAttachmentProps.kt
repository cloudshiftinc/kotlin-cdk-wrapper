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
 * Properties for defining a `CfnVpcAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnVpcAttachmentProps cfnVpcAttachmentProps = CfnVpcAttachmentProps.builder()
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
public interface CfnVpcAttachmentProps {
  /**
   * The core network ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-corenetworkid)
   */
  public fun coreNetworkId(): String

  /**
   * Options for creating the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
   */
  public fun options(): Any? = unwrap(this).getOptions()

  /**
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * The subnet ARNs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
   */
  public fun subnetArns(): List<String>

  /**
   * The tags associated with the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ARN of the VPC attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-vpcarn)
   */
  public fun vpcArn(): String

  /**
   * A builder for [CfnVpcAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreNetworkId The core network ID. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * @param options Options for creating the VPC attachment.
     */
    public fun options(options: IResolvable)

    /**
     * @param options Options for creating the VPC attachment.
     */
    public fun options(options: CfnVpcAttachment.VpcOptionsProperty)

    /**
     * @param options Options for creating the VPC attachment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757c0f2d355da3d8905624f7e84eb5a2ec2edf3d14c9ccf5c2ed4d293c7071e")
    public fun options(options: CfnVpcAttachment.VpcOptionsProperty.Builder.() -> Unit)

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
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fa792b5bab8929ef8bf38ca43abb6d29804f2238a50e6d7866cc3f18990d1b")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * @param subnetArns The subnet ARNs. 
     */
    public fun subnetArns(subnetArns: List<String>)

    /**
     * @param subnetArns The subnet ARNs. 
     */
    public fun subnetArns(vararg subnetArns: String)

    /**
     * @param tags The tags associated with the VPC attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the VPC attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcArn The ARN of the VPC attachment. 
     */
    public fun vpcArn(vpcArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps.builder()

    /**
     * @param coreNetworkId The core network ID. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * @param options Options for creating the VPC attachment.
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * @param options Options for creating the VPC attachment.
     */
    override fun options(options: CfnVpcAttachment.VpcOptionsProperty) {
      cdkBuilder.options(options.let(CfnVpcAttachment.VpcOptionsProperty::unwrap))
    }

    /**
     * @param options Options for creating the VPC attachment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6757c0f2d355da3d8905624f7e84eb5a2ec2edf3d14c9ccf5c2ed4d293c7071e")
    override fun options(options: CfnVpcAttachment.VpcOptionsProperty.Builder.() -> Unit): Unit =
        options(CfnVpcAttachment.VpcOptionsProperty(options))

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
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnVpcAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3fa792b5bab8929ef8bf38ca43abb6d29804f2238a50e6d7866cc3f18990d1b")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnVpcAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    /**
     * @param subnetArns The subnet ARNs. 
     */
    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    /**
     * @param subnetArns The subnet ARNs. 
     */
    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    /**
     * @param tags The tags associated with the VPC attachment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the VPC attachment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcArn The ARN of the VPC attachment. 
     */
    override fun vpcArn(vpcArn: String) {
      cdkBuilder.vpcArn(vpcArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps,
  ) : CdkObject(cdkObject), CfnVpcAttachmentProps {
    /**
     * The core network ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * Options for creating the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-options)
     */
    override fun options(): Any? = unwrap(this).getOptions()

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * The subnet ARNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-subnetarns)
     */
    override fun subnetArns(): List<String> = unwrap(this).getSubnetArns()

    /**
     * The tags associated with the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ARN of the VPC attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-vpcattachment.html#cfn-networkmanager-vpcattachment-vpcarn)
     */
    override fun vpcArn(): String = unwrap(this).getVpcArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps):
        CfnVpcAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as CfnVpcAttachmentProps

    internal fun unwrap(wrapped: CfnVpcAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnVpcAttachmentProps
  }
}
