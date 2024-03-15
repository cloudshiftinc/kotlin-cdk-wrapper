@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConnectAttachmentProps {
  public fun coreNetworkId(): String

  public fun edgeLocation(): String

  public fun options(): Any

  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transportAttachmentId(): String

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun edgeLocation(edgeLocation: String)

    public fun options(options: IResolvable)

    public fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58873062cc15cf12a1d7297d6a74a7b80bc16778bed23edbe0ebfdf908937744")
    public
        fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder.() -> Unit)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c1800493c066d168ef03331a8555cad9428d25049746951c61b7c46d9bfda0")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transportAttachmentId(transportAttachmentId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps.builder()

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun edgeLocation(edgeLocation: String) {
      cdkBuilder.edgeLocation(edgeLocation)
    }

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty) {
      cdkBuilder.options(options.let(CfnConnectAttachment.ConnectAttachmentOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58873062cc15cf12a1d7297d6a74a7b80bc16778bed23edbe0ebfdf908937744")
    override
        fun options(options: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder.() -> Unit):
        Unit = options(CfnConnectAttachment.ConnectAttachmentOptionsProperty(options))

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnConnectAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72c1800493c066d168ef03331a8555cad9428d25049746951c61b7c46d9bfda0")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnConnectAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnConnectAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    override fun edgeLocation(): String = unwrap(this).getEdgeLocation()

    override fun options(): Any = unwrap(this).getOptions()

    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transportAttachmentId(): String = unwrap(this).getTransportAttachmentId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps):
        CfnConnectAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnConnectAttachmentProps
  }
}
