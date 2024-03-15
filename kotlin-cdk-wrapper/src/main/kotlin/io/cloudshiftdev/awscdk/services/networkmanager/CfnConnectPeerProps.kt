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

public interface CfnConnectPeerProps {
  public fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

  public fun connectAttachmentId(): String

  public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

  public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

  public fun peerAddress(): String

  public fun subnetArn(): String? = unwrap(this).getSubnetArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun bgpOptions(bgpOptions: IResolvable)

    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916b002b3d0a7744466484cb05d310dbcfc095ac2b5b0b449efded7bac19b7e6")
    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty.Builder.() -> Unit)

    public fun connectAttachmentId(connectAttachmentId: String)

    public fun coreNetworkAddress(coreNetworkAddress: String)

    public fun insideCidrBlocks(insideCidrBlocks: List<String>)

    public fun insideCidrBlocks(vararg insideCidrBlocks: String)

    public fun peerAddress(peerAddress: String)

    public fun subnetArn(subnetArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps.builder()

    override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable::unwrap))
    }

    override fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(CfnConnectPeer.BgpOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916b002b3d0a7744466484cb05d310dbcfc095ac2b5b0b449efded7bac19b7e6")
    override fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty.Builder.() -> Unit): Unit
        = bgpOptions(CfnConnectPeer.BgpOptionsProperty(bgpOptions))

    override fun connectAttachmentId(connectAttachmentId: String) {
      cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    override fun coreNetworkAddress(coreNetworkAddress: String) {
      cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
      cdkBuilder.insideCidrBlocks(insideCidrBlocks)
    }

    override fun insideCidrBlocks(vararg insideCidrBlocks: String): Unit =
        insideCidrBlocks(insideCidrBlocks.toList())

    override fun peerAddress(peerAddress: String) {
      cdkBuilder.peerAddress(peerAddress)
    }

    override fun subnetArn(subnetArn: String) {
      cdkBuilder.subnetArn(subnetArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps,
  ) : CdkObject(cdkObject), CfnConnectPeerProps {
    override fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

    override fun connectAttachmentId(): String = unwrap(this).getConnectAttachmentId()

    override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
        emptyList()

    override fun peerAddress(): String = unwrap(this).getPeerAddress()

    override fun subnetArn(): String? = unwrap(this).getSubnetArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectPeerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps):
        CfnConnectPeerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectPeerProps):
        software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps
  }
}
