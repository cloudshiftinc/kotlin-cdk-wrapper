package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWirelessGateway internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  public open fun lastUplinkReceivedAt(`value`: String) {
    unwrap(this).setLastUplinkReceivedAt(`value`)
  }

  public open fun loRaWan(): Any = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANGatewayProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANGatewayProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ab405ea2d76532ea6e626d227a65e8d69f7d1ca44b2e5b64ee66c0946c9ad")
  public open fun loRaWan(`value`: LoRaWANGatewayProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANGatewayProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun thingArn(): String? = unwrap(this).getThingArn()

  public open fun thingArn(`value`: String) {
    unwrap(this).setThingArn(`value`)
  }

  public open fun thingName(): String? = unwrap(this).getThingName()

  public open fun thingName(`value`: String) {
    unwrap(this).setThingName(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: LoRaWANGatewayProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2edb31ea263b4d6a7606bcf64e145d28b52083400d9b3be894280b6d67deae33")
    public fun loRaWan(loRaWan: LoRaWANGatewayProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun thingArn(thingArn: String)

    public fun thingName(thingName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: LoRaWANGatewayProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANGatewayProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2edb31ea263b4d6a7606bcf64e145d28b52083400d9b3be894280b6d67deae33")
    override fun loRaWan(loRaWan: LoRaWANGatewayProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANGatewayProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    override fun thingName(thingName: String) {
      cdkBuilder.thingName(thingName)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessGateway =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway):
        CfnWirelessGateway = CfnWirelessGateway(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessGateway):
        software.amazon.awscdk.services.iotwireless.CfnWirelessGateway = wrapped.cdkObject
  }

  public interface LoRaWANGatewayProperty {
    public fun gatewayEui(): String

    public fun rfRegion(): String

    public interface Builder {
      public fun gatewayEui(gatewayEui: String)

      public fun rfRegion(rfRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.builder()

      override fun gatewayEui(gatewayEui: String) {
        cdkBuilder.gatewayEui(gatewayEui)
      }

      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty,
    ) : LoRaWANGatewayProperty {
      override fun gatewayEui(): String = unwrap(this).getGatewayEui()

      override fun rfRegion(): String = unwrap(this).getRfRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANGatewayProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty):
          LoRaWANGatewayProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANGatewayProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
