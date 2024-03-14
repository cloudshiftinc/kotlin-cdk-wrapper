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

public open class CfnWirelessDevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrThingName(): String = unwrap(this).getAttrThingName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun destinationName(): String = unwrap(this).getDestinationName()

  public open fun destinationName(`value`: String) {
    unwrap(this).setDestinationName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lastUplinkReceivedAt(): String? = unwrap(this).getLastUplinkReceivedAt()

  public open fun lastUplinkReceivedAt(`value`: String) {
    unwrap(this).setLastUplinkReceivedAt(`value`)
  }

  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANDeviceProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANDeviceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9fbba6cb746fd6a471043e0ecf24050f1a731300ece4041b15da041702ead454")
  public open fun loRaWan(`value`: LoRaWANDeviceProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANDeviceProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun positioning(): String? = unwrap(this).getPositioning()

  public open fun positioning(`value`: String) {
    unwrap(this).setPositioning(`value`)
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

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun destinationName(destinationName: String)

    public fun lastUplinkReceivedAt(lastUplinkReceivedAt: String)

    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: LoRaWANDeviceProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17db95673df2b6886b960f1082d8cbdb9116647da1b05b3a57a75d0b298dc6e4")
    public fun loRaWan(loRaWan: LoRaWANDeviceProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun positioning(positioning: String)

    public fun tags(tags: List<CfnTag>)

    public fun thingArn(thingArn: String)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.Builder =
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationName(destinationName: String) {
      cdkBuilder.destinationName(destinationName)
    }

    override fun lastUplinkReceivedAt(lastUplinkReceivedAt: String) {
      cdkBuilder.lastUplinkReceivedAt(lastUplinkReceivedAt)
    }

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: LoRaWANDeviceProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANDeviceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17db95673df2b6886b960f1082d8cbdb9116647da1b05b3a57a75d0b298dc6e4")
    override fun loRaWan(loRaWan: LoRaWANDeviceProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANDeviceProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun positioning(positioning: String) {
      cdkBuilder.positioning(positioning)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun thingArn(thingArn: String) {
      cdkBuilder.thingArn(thingArn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWirelessDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWirelessDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice):
        CfnWirelessDevice = CfnWirelessDevice(cdkObject)

    internal fun unwrap(wrapped: CfnWirelessDevice):
        software.amazon.awscdk.services.iotwireless.CfnWirelessDevice = wrapped.cdkObject
  }

  public interface AbpV11Property {
    public fun devAddr(): String

    public fun sessionKeys(): Any

    public interface Builder {
      public fun devAddr(devAddr: String)

      public fun sessionKeys(sessionKeys: IResolvable)

      public fun sessionKeys(sessionKeys: SessionKeysAbpV11Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a4ab19815afb52a5115c2c1c22281e7dc245874a390b9057281b5f2477d776")
      public fun sessionKeys(sessionKeys: SessionKeysAbpV11Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.builder()

      override fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
      }

      override fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys.let(IResolvable::unwrap))
      }

      override fun sessionKeys(sessionKeys: SessionKeysAbpV11Property) {
        cdkBuilder.sessionKeys(sessionKeys.let(SessionKeysAbpV11Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59a4ab19815afb52a5115c2c1c22281e7dc245874a390b9057281b5f2477d776")
      override fun sessionKeys(sessionKeys: SessionKeysAbpV11Property.Builder.() -> Unit): Unit =
          sessionKeys(SessionKeysAbpV11Property(sessionKeys))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property,
    ) : AbpV11Property {
      override fun devAddr(): String = unwrap(this).getDevAddr()

      override fun sessionKeys(): Any = unwrap(this).getSessionKeys()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AbpV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property):
          AbpV11Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbpV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SessionKeysAbpV11Property {
    public fun appSKey(): String

    public fun fNwkSIntKey(): String

    public fun nwkSEncKey(): String

    public fun sNwkSIntKey(): String

    public interface Builder {
      public fun appSKey(appSKey: String)

      public fun fNwkSIntKey(fNwkSIntKey: String)

      public fun nwkSEncKey(nwkSEncKey: String)

      public fun sNwkSIntKey(sNwkSIntKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.builder()

      override fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
      }

      override fun fNwkSIntKey(fNwkSIntKey: String) {
        cdkBuilder.fNwkSIntKey(fNwkSIntKey)
      }

      override fun nwkSEncKey(nwkSEncKey: String) {
        cdkBuilder.nwkSEncKey(nwkSEncKey)
      }

      override fun sNwkSIntKey(sNwkSIntKey: String) {
        cdkBuilder.sNwkSIntKey(sNwkSIntKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property,
    ) : SessionKeysAbpV11Property {
      override fun appSKey(): String = unwrap(this).getAppSKey()

      override fun fNwkSIntKey(): String = unwrap(this).getFNwkSIntKey()

      override fun nwkSEncKey(): String = unwrap(this).getNwkSEncKey()

      override fun sNwkSIntKey(): String = unwrap(this).getSNwkSIntKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SessionKeysAbpV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property):
          SessionKeysAbpV11Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionKeysAbpV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OtaaV11Property {
    public fun appKey(): String

    public fun joinEui(): String

    public fun nwkKey(): String

    public interface Builder {
      public fun appKey(appKey: String)

      public fun joinEui(joinEui: String)

      public fun nwkKey(nwkKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.builder()

      override fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
      }

      override fun joinEui(joinEui: String) {
        cdkBuilder.joinEui(joinEui)
      }

      override fun nwkKey(nwkKey: String) {
        cdkBuilder.nwkKey(nwkKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property,
    ) : OtaaV11Property {
      override fun appKey(): String = unwrap(this).getAppKey()

      override fun joinEui(): String = unwrap(this).getJoinEui()

      override fun nwkKey(): String = unwrap(this).getNwkKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OtaaV11Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property):
          OtaaV11Property = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtaaV11Property):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AbpV10xProperty {
    public fun devAddr(): String

    public fun sessionKeys(): Any

    public interface Builder {
      public fun devAddr(devAddr: String)

      public fun sessionKeys(sessionKeys: IResolvable)

      public fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb15038e40fff6bc52daf846737f0c14b826cf665300fcaa90a307c5cdef1235")
      public fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty.builder()

      override fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
      }

      override fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys.let(IResolvable::unwrap))
      }

      override fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty) {
        cdkBuilder.sessionKeys(sessionKeys.let(SessionKeysAbpV10xProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb15038e40fff6bc52daf846737f0c14b826cf665300fcaa90a307c5cdef1235")
      override fun sessionKeys(sessionKeys: SessionKeysAbpV10xProperty.Builder.() -> Unit): Unit =
          sessionKeys(SessionKeysAbpV10xProperty(sessionKeys))

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty,
    ) : AbpV10xProperty {
      override fun devAddr(): String = unwrap(this).getDevAddr()

      override fun sessionKeys(): Any = unwrap(this).getSessionKeys()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AbpV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty):
          AbpV10xProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbpV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OtaaV10xProperty {
    public fun appEui(): String

    public fun appKey(): String

    public interface Builder {
      public fun appEui(appEui: String)

      public fun appKey(appKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty.Builder =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty.builder()

      override fun appEui(appEui: String) {
        cdkBuilder.appEui(appEui)
      }

      override fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty,
    ) : OtaaV10xProperty {
      override fun appEui(): String = unwrap(this).getAppEui()

      override fun appKey(): String = unwrap(this).getAppKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OtaaV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty):
          OtaaV10xProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtaaV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SessionKeysAbpV10xProperty {
    public fun appSKey(): String

    public fun nwkSKey(): String

    public interface Builder {
      public fun appSKey(appSKey: String)

      public fun nwkSKey(nwkSKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.builder()

      override fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
      }

      override fun nwkSKey(nwkSKey: String) {
        cdkBuilder.nwkSKey(nwkSKey)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty,
    ) : SessionKeysAbpV10xProperty {
      override fun appSKey(): String = unwrap(this).getAppSKey()

      override fun nwkSKey(): String = unwrap(this).getNwkSKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SessionKeysAbpV10xProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty):
          SessionKeysAbpV10xProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionKeysAbpV10xProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LoRaWANDeviceProperty {
    public fun abpV10x(): Any? = unwrap(this).getAbpV10X()

    public fun abpV11(): Any? = unwrap(this).getAbpV11()

    public fun devEui(): String? = unwrap(this).getDevEui()

    public fun deviceProfileId(): String? = unwrap(this).getDeviceProfileId()

    public fun otaaV10x(): Any? = unwrap(this).getOtaaV10X()

    public fun otaaV11(): Any? = unwrap(this).getOtaaV11()

    public fun serviceProfileId(): String? = unwrap(this).getServiceProfileId()

    public interface Builder {
      public fun abpV10x(abpV10X: IResolvable)

      public fun abpV10x(abpV10X: AbpV10xProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5178e3a9b15e101d25e20d372730d352b8850925bb7d52c981ab283bfd41e05e")
      public fun abpV10x(abpV10X: AbpV10xProperty.Builder.() -> Unit)

      public fun abpV11(abpV11: IResolvable)

      public fun abpV11(abpV11: AbpV11Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6536c67eef3767a4ae92e3a1014e34742a2aa29f52f0b6055fe5fcc30ac41b40")
      public fun abpV11(abpV11: AbpV11Property.Builder.() -> Unit)

      public fun devEui(devEui: String)

      public fun deviceProfileId(deviceProfileId: String)

      public fun otaaV10x(otaaV10X: IResolvable)

      public fun otaaV10x(otaaV10X: OtaaV10xProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42f54ce128eedb8686fb22d1877fea1d6a762394c25c672f14833e1d980f3285")
      public fun otaaV10x(otaaV10X: OtaaV10xProperty.Builder.() -> Unit)

      public fun otaaV11(otaaV11: IResolvable)

      public fun otaaV11(otaaV11: OtaaV11Property)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50001fd6c81be7952f9e3e7f379b431600dce85809310301bde2e1cf32cf63a3")
      public fun otaaV11(otaaV11: OtaaV11Property.Builder.() -> Unit)

      public fun serviceProfileId(serviceProfileId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty.builder()

      override fun abpV10x(abpV10X: IResolvable) {
        cdkBuilder.abpV10X(abpV10X.let(IResolvable::unwrap))
      }

      override fun abpV10x(abpV10X: AbpV10xProperty) {
        cdkBuilder.abpV10X(abpV10X.let(AbpV10xProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5178e3a9b15e101d25e20d372730d352b8850925bb7d52c981ab283bfd41e05e")
      override fun abpV10x(abpV10X: AbpV10xProperty.Builder.() -> Unit): Unit =
          abpV10x(AbpV10xProperty(abpV10X))

      override fun abpV11(abpV11: IResolvable) {
        cdkBuilder.abpV11(abpV11.let(IResolvable::unwrap))
      }

      override fun abpV11(abpV11: AbpV11Property) {
        cdkBuilder.abpV11(abpV11.let(AbpV11Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6536c67eef3767a4ae92e3a1014e34742a2aa29f52f0b6055fe5fcc30ac41b40")
      override fun abpV11(abpV11: AbpV11Property.Builder.() -> Unit): Unit =
          abpV11(AbpV11Property(abpV11))

      override fun devEui(devEui: String) {
        cdkBuilder.devEui(devEui)
      }

      override fun deviceProfileId(deviceProfileId: String) {
        cdkBuilder.deviceProfileId(deviceProfileId)
      }

      override fun otaaV10x(otaaV10X: IResolvable) {
        cdkBuilder.otaaV10X(otaaV10X.let(IResolvable::unwrap))
      }

      override fun otaaV10x(otaaV10X: OtaaV10xProperty) {
        cdkBuilder.otaaV10X(otaaV10X.let(OtaaV10xProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42f54ce128eedb8686fb22d1877fea1d6a762394c25c672f14833e1d980f3285")
      override fun otaaV10x(otaaV10X: OtaaV10xProperty.Builder.() -> Unit): Unit =
          otaaV10x(OtaaV10xProperty(otaaV10X))

      override fun otaaV11(otaaV11: IResolvable) {
        cdkBuilder.otaaV11(otaaV11.let(IResolvable::unwrap))
      }

      override fun otaaV11(otaaV11: OtaaV11Property) {
        cdkBuilder.otaaV11(otaaV11.let(OtaaV11Property::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("50001fd6c81be7952f9e3e7f379b431600dce85809310301bde2e1cf32cf63a3")
      override fun otaaV11(otaaV11: OtaaV11Property.Builder.() -> Unit): Unit =
          otaaV11(OtaaV11Property(otaaV11))

      override fun serviceProfileId(serviceProfileId: String) {
        cdkBuilder.serviceProfileId(serviceProfileId)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty,
    ) : LoRaWANDeviceProperty {
      override fun abpV10x(): Any? = unwrap(this).getAbpV10X()

      override fun abpV11(): Any? = unwrap(this).getAbpV11()

      override fun devEui(): String? = unwrap(this).getDevEui()

      override fun deviceProfileId(): String? = unwrap(this).getDeviceProfileId()

      override fun otaaV10x(): Any? = unwrap(this).getOtaaV10X()

      override fun otaaV11(): Any? = unwrap(this).getOtaaV11()

      override fun serviceProfileId(): String? = unwrap(this).getServiceProfileId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANDeviceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty):
          LoRaWANDeviceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANDeviceProperty):
          software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
