package io.cloudshiftdev.awscdk.services.iotwireless

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

public open class CfnMulticastGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun associateWirelessDevice(): String? = unwrap(this).getAssociateWirelessDevice()

  public open fun associateWirelessDevice(`value`: String) {
    unwrap(this).setAssociateWirelessDevice(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLoRaWanNumberOfDevicesInGroup(): Number =
      unwrap(this).getAttrLoRaWanNumberOfDevicesInGroup()

  public open fun attrLoRaWanNumberOfDevicesRequested(): Number =
      unwrap(this).getAttrLoRaWanNumberOfDevicesRequested()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun disassociateWirelessDevice(): String? =
      unwrap(this).getDisassociateWirelessDevice()

  public open fun disassociateWirelessDevice(`value`: String) {
    unwrap(this).setDisassociateWirelessDevice(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loRaWan(): Any = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca632aeb7f2eeef983633b1b61a2bd08b2e8ff57e2a7f825712dc93ed3b1198b")
  public open fun loRaWan(`value`: LoRaWANProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANProperty(`value`))

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

  public interface Builder {
    public fun associateWirelessDevice(associateWirelessDevice: String) {
    }

    public fun description(description: String) {
    }

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
    }

    public fun loRaWan(loRaWan: IResolvable) {
    }

    public fun loRaWan(loRaWan: LoRaWANProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e81466f9f53e95dc3ea306e87391160bd8fd845ac2861cffba3f0c6e021678")
    public fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.Builder =
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.Builder.create(scope, id)

    public override fun associateWirelessDevice(associateWirelessDevice: String) {
      cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
      cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    public override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    public override fun loRaWan(loRaWan: LoRaWANProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e81466f9f53e95dc3ea306e87391160bd8fd845ac2861cffba3f0c6e021678")
    public override fun loRaWan(loRaWan: LoRaWANProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANProperty(loRaWan))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnMulticastGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMulticastGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMulticastGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup):
        CfnMulticastGroup = CfnMulticastGroup(cdkObject)

    internal fun unwrap(wrapped: CfnMulticastGroup):
        software.amazon.awscdk.services.iotwireless.CfnMulticastGroup = wrapped.cdkObject
  }

  public interface LoRaWANProperty {
    public fun dlClass(): String

    public fun numberOfDevicesInGroup(): Number? = unwrap(this).getNumberOfDevicesInGroup()

    public fun numberOfDevicesRequested(): Number? = unwrap(this).getNumberOfDevicesRequested()

    public fun rfRegion(): String

    public interface Builder {
      public fun dlClass(dlClass: String) {
      }

      public fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
      }

      public fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
      }

      public fun rfRegion(rfRegion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty.builder()

      public override fun dlClass(dlClass: String) {
        cdkBuilder.dlClass(dlClass)
      }

      public override fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
        cdkBuilder.numberOfDevicesInGroup(numberOfDevicesInGroup)
      }

      public override fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
        cdkBuilder.numberOfDevicesRequested(numberOfDevicesRequested)
      }

      public override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty,
    ) : LoRaWANProperty {
      public override fun dlClass(): String = unwrap(this).getDlClass()

      public override fun numberOfDevicesInGroup(): Number? =
          unwrap(this).getNumberOfDevicesInGroup()

      public override fun numberOfDevicesRequested(): Number? =
          unwrap(this).getNumberOfDevicesRequested()

      public override fun rfRegion(): String = unwrap(this).getRfRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty):
          LoRaWANProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANProperty):
          software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
