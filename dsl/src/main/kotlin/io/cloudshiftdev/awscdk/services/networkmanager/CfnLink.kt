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

public open class CfnLink internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLinkArn(): String = unwrap(this).getAttrLinkArn()

  public open fun attrLinkId(): String = unwrap(this).getAttrLinkId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun bandwidth(): Any = unwrap(this).getBandwidth()

  public open fun bandwidth(`value`: IResolvable) {
    unwrap(this).setBandwidth(`value`.let(IResolvable::unwrap))
  }

  public open fun bandwidth(`value`: BandwidthProperty) {
    unwrap(this).setBandwidth(`value`.let(BandwidthProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a44c8db638e441798bc507b144b7de9f51015256fd54644bf0b794e5aa0cfc15")
  public open fun bandwidth(`value`: BandwidthProperty.Builder.() -> Unit): Unit =
      bandwidth(BandwidthProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun provider(): String? = unwrap(this).getProvider()

  public open fun provider(`value`: String) {
    unwrap(this).setProvider(`value`)
  }

  public open fun siteId(): String = unwrap(this).getSiteId()

  public open fun siteId(`value`: String) {
    unwrap(this).setSiteId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun bandwidth(bandwidth: IResolvable)

    public fun bandwidth(bandwidth: BandwidthProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e9c4c1283b201998580fa4db416940d6c8c8bf89fd651530692bffdd36454")
    public fun bandwidth(bandwidth: BandwidthProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun provider(provider: String)

    public fun siteId(siteId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnLink.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLink.Builder.create(scope, id)

    override fun bandwidth(bandwidth: IResolvable) {
      cdkBuilder.bandwidth(bandwidth.let(IResolvable::unwrap))
    }

    override fun bandwidth(bandwidth: BandwidthProperty) {
      cdkBuilder.bandwidth(bandwidth.let(BandwidthProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a49e9c4c1283b201998580fa4db416940d6c8c8bf89fd651530692bffdd36454")
    override fun bandwidth(bandwidth: BandwidthProperty.Builder.() -> Unit): Unit =
        bandwidth(BandwidthProperty(bandwidth))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLink = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink): CfnLink =
        CfnLink(cdkObject)

    internal fun unwrap(wrapped: CfnLink): software.amazon.awscdk.services.networkmanager.CfnLink =
        wrapped.cdkObject
  }

  public interface BandwidthProperty {
    public fun downloadSpeed(): Number? = unwrap(this).getDownloadSpeed()

    public fun uploadSpeed(): Number? = unwrap(this).getUploadSpeed()

    public interface Builder {
      public fun downloadSpeed(downloadSpeed: Number)

      public fun uploadSpeed(uploadSpeed: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty.builder()

      override fun downloadSpeed(downloadSpeed: Number) {
        cdkBuilder.downloadSpeed(downloadSpeed)
      }

      override fun uploadSpeed(uploadSpeed: Number) {
        cdkBuilder.uploadSpeed(uploadSpeed)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty,
    ) : BandwidthProperty {
      override fun downloadSpeed(): Number? = unwrap(this).getDownloadSpeed()

      override fun uploadSpeed(): Number? = unwrap(this).getUploadSpeed()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BandwidthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty):
          BandwidthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BandwidthProperty):
          software.amazon.awscdk.services.networkmanager.CfnLink.BandwidthProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
