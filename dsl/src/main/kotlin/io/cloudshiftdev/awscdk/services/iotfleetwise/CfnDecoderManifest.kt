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
    public fun description(description: String) {
    }

    public fun modelManifestArn(modelManifestArn: String) {
    }

    public fun name(name: String) {
    }

    public fun networkInterfaces(networkInterfaces: IResolvable) {
    }

    public fun networkInterfaces(networkInterfaces: List<Any>) {
    }

    public fun signalDecoders(signalDecoders: IResolvable) {
    }

    public fun signalDecoders(signalDecoders: List<Any>) {
    }

    public fun status(status: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder
        = software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    public override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces)
    }

    public override fun signalDecoders(signalDecoders: IResolvable) {
      cdkBuilder.signalDecoders(signalDecoders.let(IResolvable::unwrap))
    }

    public override fun signalDecoders(signalDecoders: List<Any>) {
      cdkBuilder.signalDecoders(signalDecoders)
    }

    public override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public override fun tags(tags: List<CfnTag>) {
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
      public fun name(name: String) {
      }

      public fun protocolName(protocolName: String) {
      }

      public fun protocolVersion(protocolVersion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanInterfaceProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun protocolName(protocolName: String) {
        cdkBuilder.protocolName(protocolName)
      }

      public override fun protocolVersion(protocolVersion: String) {
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
      public override fun name(): String = unwrap(this).getName()

      public override fun protocolName(): String? = unwrap(this).getProtocolName()

      public override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()
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
      public fun bitMaskLength(bitMaskLength: String) {
      }

      public fun bitRightShift(bitRightShift: String) {
      }

      public fun byteLength(byteLength: String) {
      }

      public fun offset(offset: String) {
      }

      public fun pid(pid: String) {
      }

      public fun pidResponseLength(pidResponseLength: String) {
      }

      public fun scaling(scaling: String) {
      }

      public fun serviceMode(serviceMode: String) {
      }

      public fun startByte(startByte: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalProperty.builder()

      public override fun bitMaskLength(bitMaskLength: String) {
        cdkBuilder.bitMaskLength(bitMaskLength)
      }

      public override fun bitRightShift(bitRightShift: String) {
        cdkBuilder.bitRightShift(bitRightShift)
      }

      public override fun byteLength(byteLength: String) {
        cdkBuilder.byteLength(byteLength)
      }

      public override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      public override fun pid(pid: String) {
        cdkBuilder.pid(pid)
      }

      public override fun pidResponseLength(pidResponseLength: String) {
        cdkBuilder.pidResponseLength(pidResponseLength)
      }

      public override fun scaling(scaling: String) {
        cdkBuilder.scaling(scaling)
      }

      public override fun serviceMode(serviceMode: String) {
        cdkBuilder.serviceMode(serviceMode)
      }

      public override fun startByte(startByte: String) {
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
      public override fun bitMaskLength(): String? = unwrap(this).getBitMaskLength()

      public override fun bitRightShift(): String? = unwrap(this).getBitRightShift()

      public override fun byteLength(): String = unwrap(this).getByteLength()

      public override fun offset(): String = unwrap(this).getOffset()

      public override fun pid(): String = unwrap(this).getPid()

      public override fun pidResponseLength(): String = unwrap(this).getPidResponseLength()

      public override fun scaling(): String = unwrap(this).getScaling()

      public override fun serviceMode(): String = unwrap(this).getServiceMode()

      public override fun startByte(): String = unwrap(this).getStartByte()
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
      public fun interfaceId(interfaceId: String) {
      }

      public fun obdInterface(obdInterface: IResolvable) {
      }

      public fun obdInterface(obdInterface: ObdInterfaceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
      public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdNetworkInterfaceProperty.builder()

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
      }

      public override fun obdInterface(obdInterface: ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0b4e925efad6770cab1c4f601f1ca931315944f146f2e4ff09af99a7ecf270c6")
      public override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit
          = obdInterface(ObdInterfaceProperty(obdInterface))

      public override fun type(type: String) {
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
      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun obdInterface(): Any = unwrap(this).getObdInterface()

      public override fun type(): String = unwrap(this).getType()
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
      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun interfaceId(interfaceId: String) {
      }

      public fun obdSignal(obdSignal: IResolvable) {
      }

      public fun obdSignal(obdSignal: ObdSignalProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
      public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdSignalDecoderProperty.builder()

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
      }

      public override fun obdSignal(obdSignal: ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("545450d963d2c02495fc803f670fba23cdd13545e14eb56d63ec0a8a0ac6c982")
      public override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
          obdSignal(ObdSignalProperty(obdSignal))

      public override fun type(type: String) {
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
      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun obdSignal(): Any = unwrap(this).getObdSignal()

      public override fun type(): String = unwrap(this).getType()
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
      public fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
      }

      public fun hasTransmissionEcu(hasTransmissionEcu: String) {
      }

      public fun name(name: String) {
      }

      public fun obdStandard(obdStandard: String) {
      }

      public fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
      }

      public fun requestMessageId(requestMessageId: String) {
      }

      public fun useExtendedIds(useExtendedIds: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.ObdInterfaceProperty.builder()

      public override fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
        cdkBuilder.dtcRequestIntervalSeconds(dtcRequestIntervalSeconds)
      }

      public override fun hasTransmissionEcu(hasTransmissionEcu: String) {
        cdkBuilder.hasTransmissionEcu(hasTransmissionEcu)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun obdStandard(obdStandard: String) {
        cdkBuilder.obdStandard(obdStandard)
      }

      public override fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
        cdkBuilder.pidRequestIntervalSeconds(pidRequestIntervalSeconds)
      }

      public override fun requestMessageId(requestMessageId: String) {
        cdkBuilder.requestMessageId(requestMessageId)
      }

      public override fun useExtendedIds(useExtendedIds: String) {
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
      public override fun dtcRequestIntervalSeconds(): String? =
          unwrap(this).getDtcRequestIntervalSeconds()

      public override fun hasTransmissionEcu(): String? = unwrap(this).getHasTransmissionEcu()

      public override fun name(): String = unwrap(this).getName()

      public override fun obdStandard(): String? = unwrap(this).getObdStandard()

      public override fun pidRequestIntervalSeconds(): String? =
          unwrap(this).getPidRequestIntervalSeconds()

      public override fun requestMessageId(): String = unwrap(this).getRequestMessageId()

      public override fun useExtendedIds(): String? = unwrap(this).getUseExtendedIds()
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
      public fun canSignal(canSignal: IResolvable) {
      }

      public fun canSignal(canSignal: CanSignalProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
      public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun interfaceId(interfaceId: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalDecoderProperty.builder()

      public override fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
      }

      public override fun canSignal(canSignal: CanSignalProperty) {
        cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2a1842cbcac4f2b866b161094e72b63d3112354f748ef6d99bc66cf3d200f3")
      public override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
          canSignal(CanSignalProperty(canSignal))

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun type(type: String) {
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
      public override fun canSignal(): Any = unwrap(this).getCanSignal()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun type(): String = unwrap(this).getType()
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
      public fun canInterface(canInterface: IResolvable) {
      }

      public fun canInterface(canInterface: CanInterfaceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
      public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit) {
      }

      public fun interfaceId(interfaceId: String) {
      }

      public fun obdInterface(obdInterface: IResolvable) {
      }

      public fun obdInterface(obdInterface: ObdInterfaceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
      public fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.NetworkInterfacesItemsProperty.builder()

      public override fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
      }

      public override fun canInterface(canInterface: CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8562fca49c5ff0d4d8b84f5158b802d27f9e743abe47c01088703b8768d205d")
      public override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit
          = canInterface(CanInterfaceProperty(canInterface))

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun obdInterface(obdInterface: IResolvable) {
        cdkBuilder.obdInterface(obdInterface.let(IResolvable::unwrap))
      }

      public override fun obdInterface(obdInterface: ObdInterfaceProperty) {
        cdkBuilder.obdInterface(obdInterface.let(ObdInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f2d33ddb6c1a7eb3c8b36cf64dc8a3941cd226a91a76c00910c2807f6d9ca34")
      public override fun obdInterface(obdInterface: ObdInterfaceProperty.Builder.() -> Unit): Unit
          = obdInterface(ObdInterfaceProperty(obdInterface))

      public override fun type(type: String) {
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
      public override fun canInterface(): Any? = unwrap(this).getCanInterface()

      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun obdInterface(): Any? = unwrap(this).getObdInterface()

      public override fun type(): String = unwrap(this).getType()
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
      public fun factor(factor: String) {
      }

      public fun isBigEndian(isBigEndian: String) {
      }

      public fun isSigned(isSigned: String) {
      }

      public fun length(length: String) {
      }

      public fun messageId(messageId: String) {
      }

      public fun name(name: String) {
      }

      public fun offset(offset: String) {
      }

      public fun startBit(startBit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanSignalProperty.builder()

      public override fun factor(factor: String) {
        cdkBuilder.factor(factor)
      }

      public override fun isBigEndian(isBigEndian: String) {
        cdkBuilder.isBigEndian(isBigEndian)
      }

      public override fun isSigned(isSigned: String) {
        cdkBuilder.isSigned(isSigned)
      }

      public override fun length(length: String) {
        cdkBuilder.length(length)
      }

      public override fun messageId(messageId: String) {
        cdkBuilder.messageId(messageId)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun offset(offset: String) {
        cdkBuilder.offset(offset)
      }

      public override fun startBit(startBit: String) {
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
      public override fun factor(): String = unwrap(this).getFactor()

      public override fun isBigEndian(): String = unwrap(this).getIsBigEndian()

      public override fun isSigned(): String = unwrap(this).getIsSigned()

      public override fun length(): String = unwrap(this).getLength()

      public override fun messageId(): String = unwrap(this).getMessageId()

      public override fun name(): String? = unwrap(this).getName()

      public override fun offset(): String = unwrap(this).getOffset()

      public override fun startBit(): String = unwrap(this).getStartBit()
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
      public fun canSignal(canSignal: IResolvable) {
      }

      public fun canSignal(canSignal: CanSignalProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
      public fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit) {
      }

      public fun fullyQualifiedName(fullyQualifiedName: String) {
      }

      public fun interfaceId(interfaceId: String) {
      }

      public fun obdSignal(obdSignal: IResolvable) {
      }

      public fun obdSignal(obdSignal: ObdSignalProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
      public fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.SignalDecodersItemsProperty.builder()

      public override fun canSignal(canSignal: IResolvable) {
        cdkBuilder.canSignal(canSignal.let(IResolvable::unwrap))
      }

      public override fun canSignal(canSignal: CanSignalProperty) {
        cdkBuilder.canSignal(canSignal.let(CanSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c03da5aff98cc945bf7b5a2ff25eb67f4a53368d2e72df6c9ee9ce7fae3fb9e0")
      public override fun canSignal(canSignal: CanSignalProperty.Builder.() -> Unit): Unit =
          canSignal(CanSignalProperty(canSignal))

      public override fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
      }

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun obdSignal(obdSignal: IResolvable) {
        cdkBuilder.obdSignal(obdSignal.let(IResolvable::unwrap))
      }

      public override fun obdSignal(obdSignal: ObdSignalProperty) {
        cdkBuilder.obdSignal(obdSignal.let(ObdSignalProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f78cea4a7a5bf3090f416aab0c323829366ec9091c55a3229b65fd9ae57a0b33")
      public override fun obdSignal(obdSignal: ObdSignalProperty.Builder.() -> Unit): Unit =
          obdSignal(ObdSignalProperty(obdSignal))

      public override fun type(type: String) {
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
      public override fun canSignal(): Any? = unwrap(this).getCanSignal()

      public override fun fullyQualifiedName(): String = unwrap(this).getFullyQualifiedName()

      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun obdSignal(): Any? = unwrap(this).getObdSignal()

      public override fun type(): String = unwrap(this).getType()
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
      public fun canInterface(canInterface: IResolvable) {
      }

      public fun canInterface(canInterface: CanInterfaceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
      public fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit) {
      }

      public fun interfaceId(interfaceId: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest.CanNetworkInterfaceProperty.builder()

      public override fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface.let(IResolvable::unwrap))
      }

      public override fun canInterface(canInterface: CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface.let(CanInterfaceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bb3dae54526a244431924d675fa419eff6b69f0d87bbfe3ffc677046131a6f5")
      public override fun canInterface(canInterface: CanInterfaceProperty.Builder.() -> Unit): Unit
          = canInterface(CanInterfaceProperty(canInterface))

      public override fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
      }

      public override fun type(type: String) {
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
      public override fun canInterface(): Any = unwrap(this).getCanInterface()

      public override fun interfaceId(): String = unwrap(this).getInterfaceId()

      public override fun type(): String = unwrap(this).getType()
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
