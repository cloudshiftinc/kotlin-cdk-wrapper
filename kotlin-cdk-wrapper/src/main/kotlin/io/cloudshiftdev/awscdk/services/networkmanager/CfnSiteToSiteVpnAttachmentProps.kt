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

public interface CfnSiteToSiteVpnAttachmentProps {
  public fun coreNetworkId(): String

  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpnConnectionArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a2349541b75d627879d946aaf65fca8f46d23c33dbb13cc1feb8fd82d31185")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpnConnectionArn(vpnConnectionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps.builder()

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a2349541b75d627879d946aaf65fca8f46d23c33dbb13cc1feb8fd82d31185")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
    override fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpnConnectionArn(): String = unwrap(this).getVpnConnectionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSiteToSiteVpnAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps):
        CfnSiteToSiteVpnAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSiteToSiteVpnAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachmentProps
  }
}
