package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnectPeer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrConfiguration(): IResolvable =
      unwrap(this).getAttrConfiguration().let(IResolvable::wrap)

  public open fun attrConfigurationBgpConfigurations(): IResolvable =
      unwrap(this).getAttrConfigurationBgpConfigurations().let(IResolvable::wrap)

  public open fun attrConfigurationCoreNetworkAddress(): String =
      unwrap(this).getAttrConfigurationCoreNetworkAddress()

  public open fun attrConfigurationInsideCidrBlocks(): List<String> =
      unwrap(this).getAttrConfigurationInsideCidrBlocks() ?: emptyList()

  public open fun attrConfigurationPeerAddress(): String =
      unwrap(this).getAttrConfigurationPeerAddress()

  public open fun attrConfigurationProtocol(): String = unwrap(this).getAttrConfigurationProtocol()

  public open fun attrConnectPeerId(): String = unwrap(this).getAttrConnectPeerId()

  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun bgpOptions(): Any? = unwrap(this).getBgpOptions()

  public open fun bgpOptions(`value`: IResolvable) {
    unwrap(this).setBgpOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun bgpOptions(`value`: BgpOptionsProperty) {
    unwrap(this).setBgpOptions(`value`.let(BgpOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3442340593a91ec3ca164948bd4562624886d304d757caa1a6318d7ccd82419")
  public open fun bgpOptions(`value`: BgpOptionsProperty.Builder.() -> Unit): Unit =
      bgpOptions(BgpOptionsProperty(`value`))

  public open fun connectAttachmentId(): String = unwrap(this).getConnectAttachmentId()

  public open fun connectAttachmentId(`value`: String) {
    unwrap(this).setConnectAttachmentId(`value`)
  }

  public open fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

  public open fun coreNetworkAddress(`value`: String) {
    unwrap(this).setCoreNetworkAddress(`value`)
  }

  public open fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
      emptyList()

  public open fun insideCidrBlocks(`value`: List<String>) {
    unwrap(this).setInsideCidrBlocks(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun peerAddress(): String = unwrap(this).getPeerAddress()

  public open fun peerAddress(`value`: String) {
    unwrap(this).setPeerAddress(`value`)
  }

  public open fun subnetArn(): String? = unwrap(this).getSubnetArn()

  public open fun subnetArn(`value`: String) {
    unwrap(this).setSubnetArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun bgpOptions(bgpOptions: IResolvable) {
    }

    public fun bgpOptions(bgpOptions: BgpOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef3cfeb0160be5b40a7dad5d7ed794fe5cf58ba20edd90fcd2558d674a1d1b25")
    public fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit) {
    }

    public fun connectAttachmentId(connectAttachmentId: String) {
    }

    public fun coreNetworkAddress(coreNetworkAddress: String) {
    }

    public fun insideCidrBlocks(insideCidrBlocks: List<String>) {
    }

    public fun peerAddress(peerAddress: String) {
    }

    public fun subnetArn(subnetArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.Builder =
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer.Builder.create(scope, id)

    public override fun bgpOptions(bgpOptions: IResolvable) {
      cdkBuilder.bgpOptions(bgpOptions.let(IResolvable::unwrap))
    }

    public override fun bgpOptions(bgpOptions: BgpOptionsProperty) {
      cdkBuilder.bgpOptions(bgpOptions.let(BgpOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef3cfeb0160be5b40a7dad5d7ed794fe5cf58ba20edd90fcd2558d674a1d1b25")
    public override fun bgpOptions(bgpOptions: BgpOptionsProperty.Builder.() -> Unit): Unit =
        bgpOptions(BgpOptionsProperty(bgpOptions))

    public override fun connectAttachmentId(connectAttachmentId: String) {
      cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    public override fun coreNetworkAddress(coreNetworkAddress: String) {
      cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    public override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
      cdkBuilder.insideCidrBlocks(insideCidrBlocks)
    }

    public override fun peerAddress(peerAddress: String) {
      cdkBuilder.peerAddress(peerAddress)
    }

    public override fun subnetArn(subnetArn: String) {
      cdkBuilder.subnetArn(subnetArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnConnectPeer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnectPeer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnectPeer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer):
        CfnConnectPeer = CfnConnectPeer(cdkObject)

    internal fun unwrap(wrapped: CfnConnectPeer):
        software.amazon.awscdk.services.networkmanager.CfnConnectPeer = wrapped.cdkObject
  }

  public interface ConnectPeerBgpConfigurationProperty {
    public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    public fun coreNetworkAsn(): Number? = unwrap(this).getCoreNetworkAsn()

    public fun peerAddress(): String? = unwrap(this).getPeerAddress()

    public fun peerAsn(): Number? = unwrap(this).getPeerAsn()

    public interface Builder {
      public fun coreNetworkAddress(coreNetworkAddress: String) {
      }

      public fun coreNetworkAsn(coreNetworkAsn: Number) {
      }

      public fun peerAddress(peerAddress: String) {
      }

      public fun peerAsn(peerAsn: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty.builder()

      public override fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
      }

      public override fun coreNetworkAsn(coreNetworkAsn: Number) {
        cdkBuilder.coreNetworkAsn(coreNetworkAsn)
      }

      public override fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
      }

      public override fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty,
    ) : ConnectPeerBgpConfigurationProperty {
      public override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

      public override fun coreNetworkAsn(): Number? = unwrap(this).getCoreNetworkAsn()

      public override fun peerAddress(): String? = unwrap(this).getPeerAddress()

      public override fun peerAsn(): Number? = unwrap(this).getPeerAsn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectPeerBgpConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty):
          ConnectPeerBgpConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectPeerBgpConfigurationProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerBgpConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BgpOptionsProperty {
    public fun peerAsn(): Number? = unwrap(this).getPeerAsn()

    public interface Builder {
      public fun peerAsn(peerAsn: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty.builder()

      public override fun peerAsn(peerAsn: Number) {
        cdkBuilder.peerAsn(peerAsn)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty,
    ) : BgpOptionsProperty {
      public override fun peerAsn(): Number? = unwrap(this).getPeerAsn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BgpOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty):
          BgpOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BgpOptionsProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.BgpOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectPeerConfigurationProperty {
    public fun bgpConfigurations(): Any? = unwrap(this).getBgpConfigurations()

    public fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

    public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

    public fun peerAddress(): String? = unwrap(this).getPeerAddress()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public interface Builder {
      public fun bgpConfigurations(bgpConfigurations: IResolvable) {
      }

      public fun bgpConfigurations(bgpConfigurations: List<Any>) {
      }

      public fun coreNetworkAddress(coreNetworkAddress: String) {
      }

      public fun insideCidrBlocks(insideCidrBlocks: List<String>) {
      }

      public fun peerAddress(peerAddress: String) {
      }

      public fun protocol(protocol: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty.builder()

      public override fun bgpConfigurations(bgpConfigurations: IResolvable) {
        cdkBuilder.bgpConfigurations(bgpConfigurations.let(IResolvable::unwrap))
      }

      public override fun bgpConfigurations(bgpConfigurations: List<Any>) {
        cdkBuilder.bgpConfigurations(bgpConfigurations)
      }

      public override fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
      }

      public override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
        cdkBuilder.insideCidrBlocks(insideCidrBlocks)
      }

      public override fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
      }

      public override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty,
    ) : ConnectPeerConfigurationProperty {
      public override fun bgpConfigurations(): Any? = unwrap(this).getBgpConfigurations()

      public override fun coreNetworkAddress(): String? = unwrap(this).getCoreNetworkAddress()

      public override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
          emptyList()

      public override fun peerAddress(): String? = unwrap(this).getPeerAddress()

      public override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectPeerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty):
          ConnectPeerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectPeerConfigurationProperty):
          software.amazon.awscdk.services.networkmanager.CfnConnectPeer.ConnectPeerConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
