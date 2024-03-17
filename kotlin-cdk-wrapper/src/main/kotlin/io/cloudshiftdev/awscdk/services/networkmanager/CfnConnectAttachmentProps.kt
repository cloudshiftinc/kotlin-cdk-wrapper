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
 * Properties for defining a `CfnConnectAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnConnectAttachmentProps cfnConnectAttachmentProps = CfnConnectAttachmentProps.builder()
 * .coreNetworkId("coreNetworkId")
 * .edgeLocation("edgeLocation")
 * .options(ConnectAttachmentOptionsProperty.builder()
 * .protocol("protocol")
 * .build())
 * .transportAttachmentId("transportAttachmentId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html)
 */
public interface CfnConnectAttachmentProps {
  /**
   * The ID of the core network where the Connect attachment is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-corenetworkid)
   */
  public fun coreNetworkId(): String

  /**
   * The Region where the edge is located.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-edgelocation)
   */
  public fun edgeLocation(): String

  /**
   * Options for connecting an attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-options)
   */
  public fun options(): Any

  /**
   * Describes a proposed segment change.
   *
   * In some cases, the segment change must first be evaluated and accepted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-proposedsegmentchange)
   */
  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  /**
   * Tags for the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the transport attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-transportattachmentid)
   */
  public fun transportAttachmentId(): String

  /**
   * A builder for [CfnConnectAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreNetworkId The ID of the core network where the Connect attachment is located. 
     */
    public fun coreNetworkId(coreNetworkId: String)

    /**
     * @param edgeLocation The Region where the edge is located. 
     */
    public fun edgeLocation(edgeLocation: String)

    /**
     * @param options Options for connecting an attachment. 
     */
    public fun options(options: IResolvable)

    /**
     * @param options Options for connecting an attachment. 
     */
    public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty)

    /**
     * @param options Options for connecting an attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58873062cc15cf12a1d7297d6a74a7b80bc16778bed23edbe0ebfdf908937744")
    public
        fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder.() -> Unit)

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
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty)

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c1800493c066d168ef03331a8555cad9428d25049746951c61b7c46d9bfda0")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    /**
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags for the attachment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transportAttachmentId The ID of the transport attachment. 
     */
    public fun transportAttachmentId(transportAttachmentId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps.builder()

    /**
     * @param coreNetworkId The ID of the core network where the Connect attachment is located. 
     */
    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * @param edgeLocation The Region where the edge is located. 
     */
    override fun edgeLocation(edgeLocation: String) {
      cdkBuilder.edgeLocation(edgeLocation)
    }

    /**
     * @param options Options for connecting an attachment. 
     */
    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    /**
     * @param options Options for connecting an attachment. 
     */
    override fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
      cdkBuilder.options(options.let(CfnConnectAttachment.ConnectAttachmentOptionsProperty::unwrap))
    }

    /**
     * @param options Options for connecting an attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58873062cc15cf12a1d7297d6a74a7b80bc16778bed23edbe0ebfdf908937744")
    override
        fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder.() -> Unit):
        Unit = options(CfnConnectAttachment.ConnectAttachmentOptionsProperty(options))

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
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnConnectAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    /**
     * @param proposedSegmentChange Describes a proposed segment change.
     * In some cases, the segment change must first be evaluated and accepted.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c1800493c066d168ef03331a8555cad9428d25049746951c61b7c46d9bfda0")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnConnectAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

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
     * @param transportAttachmentId The ID of the transport attachment. 
     */
    override fun transportAttachmentId(transportAttachmentId: String) {
      cdkBuilder.transportAttachmentId(transportAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps,
  ) : CdkObject(cdkObject), CfnConnectAttachmentProps {
    /**
     * The ID of the core network where the Connect attachment is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-corenetworkid)
     */
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    /**
     * The Region where the edge is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-edgelocation)
     */
    override fun edgeLocation(): String = unwrap(this).getEdgeLocation()

    /**
     * Options for connecting an attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-options)
     */
    override fun options(): Any = unwrap(this).getOptions()

    /**
     * Describes a proposed segment change.
     *
     * In some cases, the segment change must first be evaluated and accepted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-proposedsegmentchange)
     */
    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the transport attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectattachment.html#cfn-networkmanager-connectattachment-transportattachmentid)
     */
    override fun transportAttachmentId(): String = unwrap(this).getTransportAttachmentId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps):
        CfnConnectAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectAttachmentProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps
  }
}
