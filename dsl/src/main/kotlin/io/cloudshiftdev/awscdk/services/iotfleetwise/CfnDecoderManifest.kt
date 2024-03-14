package io.cloudshiftdev.awscdk.services.iotfleetwise

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

public open class CfnDecoderManifest internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastModificationTime(): String = unwrap(this).getAttrLastModificationTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

  public open fun modelManifestArn(`value`: String) {
    unwrap(this).setModelManifestArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  public open fun networkInterfaces(`value`: IResolvable) {
    unwrap(this).setNetworkInterfaces(`value`.let(IResolvable::unwrap))
  }

  public open fun networkInterfaces(__idx_ac66f0: List<Any>) {
    unwrap(this).setNetworkInterfaces(__idx_ac66f0)
  }

  public open fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

  public open fun signalDecoders(`value`: IResolvable) {
    unwrap(this).setSignalDecoders(`value`.let(IResolvable::unwrap))
  }

  public open fun signalDecoders(__idx_ac66f0: List<Any>) {
    unwrap(this).setSignalDecoders(__idx_ac66f0)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun modelManifestArn(modelManifestArn: String)

    public fun name(name: String)

    public fun networkInterfaces(networkInterfaces: IResolvable)

    public fun networkInterfaces(networkInterfaces: List<Any>)

    public fun signalDecoders(signalDecoders: IResolvable)

    public fun signalDecoders(signalDecoders: List<Any>)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder
        = software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces)
    }

    override fun signalDecoders(signalDecoders: IResolvable) {
      cdkBuilder.signalDecoders(signalDecoders.let(IResolvable::unwrap))
    }

    override fun signalDecoders(signalDecoders: List<Any>) {
      cdkBuilder.signalDecoders(signalDecoders)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDecoderManifest {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDecoderManifest(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest):
        CfnDecoderManifest = CfnDecoderManifest(cdkObject)

    internal fun unwrap(wrapped: CfnDecoderManifest):
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest = wrapped.cdkObject
  }

  public interface CanInterfaceProperty {
    public fun name(): String

    public fun protocolName(): String? = unwrap(this).getProtocolName()

    public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    public interface Builder {
      public fun name(name: String)

      public fun protocolName(protocolName: String)

      public fun protocolVersion(protocolVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun protocolName(protocolName: String) {
        cdkBuilder.protocolName(protocolName)
      }

      override fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty,
    ) : CanInterfaceProperty {
      override fun name(): String = unwrap(this).getName()

      override fun protocolName(): String? = unwrap(this).getProtocolName()

      override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty):
          CanInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanInterfaceProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObdSignalProperty {
    public fun bitMaskLength(): String? = unwrap(this).getBitMaskLength()

    public fun bitRightShift(): String? = unwrap(this).getBitRightShift()

    public fun byteLength(): String

    public fun offset(): String

    public fun pid(): String

    public fun pidResponseLength(): String

    public fun scaling(): String

    public fun serviceMode(): String

    public fun startByte(): String

    public interface Builder {
      public fun bitMaskLength(bitMaskLength: String)

      public fun bitRightShift(bitRightShift: String)

      public fun byteLength(byteLength: String)

      public fun offset(offset: String)

      public fun pid(pid: String)

      public fun pidResponseLength(pidResponseLength: String)

      public fun scaling(scaling: String)

      public fun serviceMode(serviceMode: String)

      public fun startByte(startByte: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty.builder()

      override fun bitMaskLength(bitMaskLength: String) {
        cdkBuilder.bitMaskLength(bitMaskLength)
      }

      override fun bitRightShift(bitRightShift: String) {
        cdkBuilder.bitRightShift(bitRightShift)
      }

      override fun byteLength(byteLength: String) {
        cdkBuilder.byteLength(byteLength)
      }

      override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      override fun pid(pid: String) {
        cdkBuilder.pid(pid)
      }

      override fun pidResponseLength(pidResponseLength: String) {
        cdkBuilder.pidResponseLength(pidResponseLength)
      }

      override fun scaling(scaling: String) {
        cdkBuilder.scaling(scaling)
      }

      override fun serviceMode(serviceMode: String) {
        cdkBuilder.serviceMode(serviceMode)
      }

      override fun startByte(startByte: String) {
        cdkBuilder.startByte(startByte)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty,
    ) : ObdSignalProperty {
      override fun bitMaskLength(): String? = unwrap(this).getBitMaskLength()

      override fun bitRightShift(): String? = unwrap(this).getBitRightShift()

      override fun byteLength(): String = unwrap(this).getByteLength()

      override fun offset(): String = unwrap(this).getOffset()

      override fun pid(): String = unwrap(this).getPid()

      override fun pidResponseLength(): String = unwrap(this).getPidResponseLength()

      override fun scaling(): String = unwrap(this).getScaling()

      override fun serviceMode(): String = unwrap(this).getServiceMode()

      override fun startByte(): String = unwrap(this).getStartByte()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObdSignalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty):
          ObdSignalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObdSignalProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObdNetworkInterfaceProperty {
    public fun interfaceId(): String

    public fun obdInterface(): Any

    public fun type(): String

    public interface Builder {
      public fun interfaceId(interfaceId: String)

      public fun obdInterface(obdInterface: IResolvable)

      public fun obdInterface(obdInterface: ObdInterfaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
      public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty.builder()

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
      }

      override fun obdInterface(obdInterface: ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
      override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit =
          obdInterface(ObdInterfaceProperty(obdInterface))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty,
    ) : ObdNetworkInterfaceProperty {
      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun obdInterface(): Any = unwrap(this).getObdInterface()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObdNetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty):
          ObdNetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObdNetworkInterfaceProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObdSignalDecoderProperty {
    public fun fullyQualifiedName(): String

    public fun interfaceId(): String

    public fun obdSignal(): Any

    public fun type(): String

    public interface Builder {
      public fun fullyQualifiedName(fullyQualifiedName: String)

      public fun interfaceId(interfaceId: String)

      public fun obdSignal(obdSignal: IResolvable)

      public fun obdSignal(obdSignal: ObdSignalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
      public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty.builder()

      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
      }

      override fun obdSignal(obdSignal: ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
      override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
          obdSignal(ObdSignalProperty(obdSignal))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty,
    ) : ObdSignalDecoderProperty {
      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun obdSignal(): Any = unwrap(this).getObdSignal()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObdSignalDecoderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty):
          ObdSignalDecoderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObdSignalDecoderProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObdInterfaceProperty {
    public fun dtcRequestIntervalSeconds(): String? = unwrap(this).getDtcRequestIntervalSeconds()

    public fun hasTransmissionEcu(): String? = unwrap(this).getHasTransmissionEcu()

    public fun name(): String

    public fun obdStandard(): String? = unwrap(this).getObdStandard()

    public fun pidRequestIntervalSeconds(): String? = unwrap(this).getPidRequestIntervalSeconds()

    public fun requestMessageId(): String

    public fun useExtendedIds(): String? = unwrap(this).getUseExtendedIds()

    public interface Builder {
      public fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String)

      public fun hasTransmissionEcu(hasTransmissionEcu: String)

      public fun name(name: String)

      public fun obdStandard(obdStandard: String)

      public fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String)

      public fun requestMessageId(requestMessageId: String)

      public fun useExtendedIds(useExtendedIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty.builder()

      override fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
        cdkBuilder.dtcRequestIntervalSeconds(dtcRequestIntervalSeconds)
      }

      override fun hasTransmissionEcu(hasTransmissionEcu: String) {
        cdkBuilder.hasTransmissionEcu(hasTransmissionEcu)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun obdStandard(obdStandard: String) {
        cdkBuilder.obdStandard(obdStandard)
      }

      override fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
        cdkBuilder.pidRequestIntervalSeconds(pidRequestIntervalSeconds)
      }

      override fun requestMessageId(requestMessageId: String) {
        cdkBuilder.requestMessageId(requestMessageId)
      }

      override fun useExtendedIds(useExtendedIds: String) {
        cdkBuilder.useExtendedIds(useExtendedIds)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty,
    ) : ObdInterfaceProperty {
      override fun dtcRequestIntervalSeconds(): String? =
          unwrap(this).getDtcRequestIntervalSeconds()

      override fun hasTransmissionEcu(): String? = unwrap(this).getHasTransmissionEcu()

      override fun name(): String = unwrap(this).getName()

      override fun obdStandard(): String? = unwrap(this).getObdStandard()

      override fun pidRequestIntervalSeconds(): String? =
          unwrap(this).getPidRequestIntervalSeconds()

      override fun requestMessageId(): String = unwrap(this).getRequestMessageId()

      override fun useExtendedIds(): String? = unwrap(this).getUseExtendedIds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ObdInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty):
          ObdInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObdInterfaceProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CanSignalDecoderProperty {
    public fun canSignal(): Any

    public fun fullyQualifiedName(): String

    public fun interfaceId(): String

    public fun type(): String

    public interface Builder {
      public fun canSignal(canSignal: IResolvable)

      public fun canSignal(canSignal: CanSignalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
      public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit)

      public fun fullyQualifiedName(fullyQualifiedName: String)

      public fun interfaceId(interfaceId: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty.builder()

      override fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
      }

      override fun canSignal(canSignal: CanSignalProperty) {
        cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
      override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
          canSignal(CanSignalProperty(canSignal))

      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty,
    ) : CanSignalDecoderProperty {
      override fun canSignal(): Any = unwrap(this).getCanSignal()

      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanSignalDecoderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty):
          CanSignalDecoderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanSignalDecoderProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NetworkInterfacesItemsProperty {
    public fun canInterface(): Any? = unwrap(this).getCanInterface()

    public fun interfaceId(): String

    public fun obdInterface(): Any? = unwrap(this).getObdInterface()

    public fun type(): String

    public interface Builder {
      public fun canInterface(canInterface: IResolvable)

      public fun canInterface(canInterface: CanInterfaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
      public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit)

      public fun interfaceId(interfaceId: String)

      public fun obdInterface(obdInterface: IResolvable)

      public fun obdInterface(obdInterface: ObdInterfaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
      public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty.builder()

      override fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
      }

      override fun canInterface(canInterface: CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
      override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit =
          canInterface(CanInterfaceProperty(canInterface))

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
      }

      override fun obdInterface(obdInterface: ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
      override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit =
          obdInterface(ObdInterfaceProperty(obdInterface))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty,
    ) : NetworkInterfacesItemsProperty {
      override fun canInterface(): Any? = unwrap(this).getCanInterface()

      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun obdInterface(): Any? = unwrap(this).getObdInterface()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfacesItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty):
          NetworkInterfacesItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfacesItemsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CanSignalProperty {
    public fun factor(): String

    public fun isBigEndian(): String

    public fun isSigned(): String

    public fun length(): String

    public fun messageId(): String

    public fun name(): String? = unwrap(this).getName()

    public fun offset(): String

    public fun startBit(): String

    public interface Builder {
      public fun factor(factor: String)

      public fun isBigEndian(isBigEndian: String)

      public fun isSigned(isSigned: String)

      public fun length(length: String)

      public fun messageId(messageId: String)

      public fun name(name: String)

      public fun offset(offset: String)

      public fun startBit(startBit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty.builder()

      override fun factor(factor: String) {
        cdkBuilder.factor(factor)
      }

      override fun isBigEndian(isBigEndian: String) {
        cdkBuilder.isBigEndian(isBigEndian)
      }

      override fun isSigned(isSigned: String) {
        cdkBuilder.isSigned(isSigned)
      }

      override fun length(length: String) {
        cdkBuilder.length(length)
      }

      override fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      override fun startBit(startBit: String) {
        cdkBuilder.startBit(startBit)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty,
    ) : CanSignalProperty {
      override fun factor(): String = unwrap(this).getFactor()

      override fun isBigEndian(): String = unwrap(this).getIsBigEndian()

      override fun isSigned(): String = unwrap(this).getIsSigned()

      override fun length(): String = unwrap(this).getLength()

      override fun messageId(): String = unwrap(this).getMessageId()

      override fun name(): String? = unwrap(this).getName()

      override fun offset(): String = unwrap(this).getOffset()

      override fun startBit(): String = unwrap(this).getStartBit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanSignalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty):
          CanSignalProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanSignalProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SignalDecodersItemsProperty {
    public fun canSignal(): Any? = unwrap(this).getCanSignal()

    public fun fullyQualifiedName(): String

    public fun interfaceId(): String

    public fun obdSignal(): Any? = unwrap(this).getObdSignal()

    public fun type(): String

    public interface Builder {
      public fun canSignal(canSignal: IResolvable)

      public fun canSignal(canSignal: CanSignalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
      public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit)

      public fun fullyQualifiedName(fullyQualifiedName: String)

      public fun interfaceId(interfaceId: String)

      public fun obdSignal(obdSignal: IResolvable)

      public fun obdSignal(obdSignal: ObdSignalProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
      public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty.builder()

      override fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
      }

      override fun canSignal(canSignal: CanSignalProperty) {
        cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
      override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
          canSignal(CanSignalProperty(canSignal))

      override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
      }

      override fun obdSignal(obdSignal: ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
      override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
          obdSignal(ObdSignalProperty(obdSignal))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty,
    ) : SignalDecodersItemsProperty {
      override fun canSignal(): Any? = unwrap(this).getCanSignal()

      override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun obdSignal(): Any? = unwrap(this).getObdSignal()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SignalDecodersItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty):
          SignalDecodersItemsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SignalDecodersItemsProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CanNetworkInterfaceProperty {
    public fun canInterface(): Any

    public fun interfaceId(): String

    public fun type(): String

    public interface Builder {
      public fun canInterface(canInterface: IResolvable)

      public fun canInterface(canInterface: CanInterfaceProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
      public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit)

      public fun interfaceId(interfaceId: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty.builder()

      override fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
      }

      override fun canInterface(canInterface: CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
      override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit =
          canInterface(CanInterfaceProperty(canInterface))

      override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty,
    ) : CanNetworkInterfaceProperty {
      override fun canInterface(): Any = unwrap(this).getCanInterface()

      override fun interfaceId(): String = unwrap(this).getInterfaceId()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CanNetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty):
          CanNetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CanNetworkInterfaceProperty):
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
