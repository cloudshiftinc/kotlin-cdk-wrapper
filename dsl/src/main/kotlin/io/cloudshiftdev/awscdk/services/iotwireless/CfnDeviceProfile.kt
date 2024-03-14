package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDeviceProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANDeviceProfileProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANDeviceProfileProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9694f3d903c8ae2dd619dac8bae1b4904683a5da9eab72ac4356d10d2dfd339")
  public open fun loRaWan(`value`: LoRaWANDeviceProfileProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANDeviceProfileProperty(`value`))

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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43d18a99c6fb09138d364c62a84567fa24f505a0db0725063028f05af9e6abe6")
    public fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.Builder =
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.Builder.create(scope, id)

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANDeviceProfileProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43d18a99c6fb09138d364c62a84567fa24f505a0db0725063028f05af9e6abe6")
    override fun loRaWan(loRaWan: LoRaWANDeviceProfileProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANDeviceProfileProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnDeviceProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeviceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeviceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile):
        CfnDeviceProfile = CfnDeviceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProfile):
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfile = wrapped.cdkObject
  }

  public interface LoRaWANDeviceProfileProperty {
    public fun classBTimeout(): Number? = unwrap(this).getClassBTimeout()

    public fun classCTimeout(): Number? = unwrap(this).getClassCTimeout()

    public fun factoryPresetFreqsList(): Any? = unwrap(this).getFactoryPresetFreqsList()

    public fun macVersion(): String? = unwrap(this).getMacVersion()

    public fun maxDutyCycle(): Number? = unwrap(this).getMaxDutyCycle()

    public fun maxEirp(): Number? = unwrap(this).getMaxEirp()

    public fun pingSlotDr(): Number? = unwrap(this).getPingSlotDr()

    public fun pingSlotFreq(): Number? = unwrap(this).getPingSlotFreq()

    public fun pingSlotPeriod(): Number? = unwrap(this).getPingSlotPeriod()

    public fun regParamsRevision(): String? = unwrap(this).getRegParamsRevision()

    public fun rfRegion(): String? = unwrap(this).getRfRegion()

    public fun rxDataRate2(): Number? = unwrap(this).getRxDataRate2()

    public fun rxDelay1(): Number? = unwrap(this).getRxDelay1()

    public fun rxDrOffset1(): Number? = unwrap(this).getRxDrOffset1()

    public fun rxFreq2(): Number? = unwrap(this).getRxFreq2()

    public fun supports32BitFCnt(): Any? = unwrap(this).getSupports32BitFCnt()

    public fun supportsClassB(): Any? = unwrap(this).getSupportsClassB()

    public fun supportsClassC(): Any? = unwrap(this).getSupportsClassC()

    public fun supportsJoin(): Any? = unwrap(this).getSupportsJoin()

    public interface Builder {
      public fun classBTimeout(classBTimeout: Number)

      public fun classCTimeout(classCTimeout: Number)

      public fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable)

      public fun factoryPresetFreqsList(factoryPresetFreqsList: List<Number>)

      public fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number)

      public fun macVersion(macVersion: String)

      public fun maxDutyCycle(maxDutyCycle: Number)

      public fun maxEirp(maxEirp: Number)

      public fun pingSlotDr(pingSlotDr: Number)

      public fun pingSlotFreq(pingSlotFreq: Number)

      public fun pingSlotPeriod(pingSlotPeriod: Number)

      public fun regParamsRevision(regParamsRevision: String)

      public fun rfRegion(rfRegion: String)

      public fun rxDataRate2(rxDataRate2: Number)

      public fun rxDelay1(rxDelay1: Number)

      public fun rxDrOffset1(rxDrOffset1: Number)

      public fun rxFreq2(rxFreq2: Number)

      public fun supports32BitFCnt(supports32BitFCnt: Boolean)

      public fun supports32BitFCnt(supports32BitFCnt: IResolvable)

      public fun supportsClassB(supportsClassB: Boolean)

      public fun supportsClassB(supportsClassB: IResolvable)

      public fun supportsClassC(supportsClassC: Boolean)

      public fun supportsClassC(supportsClassC: IResolvable)

      public fun supportsJoin(supportsJoin: Boolean)

      public fun supportsJoin(supportsJoin: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty.builder()

      override fun classBTimeout(classBTimeout: Number) {
        cdkBuilder.classBTimeout(classBTimeout)
      }

      override fun classCTimeout(classCTimeout: Number) {
        cdkBuilder.classCTimeout(classCTimeout)
      }

      override fun factoryPresetFreqsList(factoryPresetFreqsList: IResolvable) {
        cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList.let(IResolvable::unwrap))
      }

      override fun factoryPresetFreqsList(factoryPresetFreqsList: List<Number>) {
        cdkBuilder.factoryPresetFreqsList(factoryPresetFreqsList)
      }

      override fun factoryPresetFreqsList(vararg factoryPresetFreqsList: Number): Unit =
          factoryPresetFreqsList(factoryPresetFreqsList.toList())

      override fun macVersion(macVersion: String) {
        cdkBuilder.macVersion(macVersion)
      }

      override fun maxDutyCycle(maxDutyCycle: Number) {
        cdkBuilder.maxDutyCycle(maxDutyCycle)
      }

      override fun maxEirp(maxEirp: Number) {
        cdkBuilder.maxEirp(maxEirp)
      }

      override fun pingSlotDr(pingSlotDr: Number) {
        cdkBuilder.pingSlotDr(pingSlotDr)
      }

      override fun pingSlotFreq(pingSlotFreq: Number) {
        cdkBuilder.pingSlotFreq(pingSlotFreq)
      }

      override fun pingSlotPeriod(pingSlotPeriod: Number) {
        cdkBuilder.pingSlotPeriod(pingSlotPeriod)
      }

      override fun regParamsRevision(regParamsRevision: String) {
        cdkBuilder.regParamsRevision(regParamsRevision)
      }

      override fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
      }

      override fun rxDataRate2(rxDataRate2: Number) {
        cdkBuilder.rxDataRate2(rxDataRate2)
      }

      override fun rxDelay1(rxDelay1: Number) {
        cdkBuilder.rxDelay1(rxDelay1)
      }

      override fun rxDrOffset1(rxDrOffset1: Number) {
        cdkBuilder.rxDrOffset1(rxDrOffset1)
      }

      override fun rxFreq2(rxFreq2: Number) {
        cdkBuilder.rxFreq2(rxFreq2)
      }

      override fun supports32BitFCnt(supports32BitFCnt: Boolean) {
        cdkBuilder.supports32BitFCnt(supports32BitFCnt)
      }

      override fun supports32BitFCnt(supports32BitFCnt: IResolvable) {
        cdkBuilder.supports32BitFCnt(supports32BitFCnt.let(IResolvable::unwrap))
      }

      override fun supportsClassB(supportsClassB: Boolean) {
        cdkBuilder.supportsClassB(supportsClassB)
      }

      override fun supportsClassB(supportsClassB: IResolvable) {
        cdkBuilder.supportsClassB(supportsClassB.let(IResolvable::unwrap))
      }

      override fun supportsClassC(supportsClassC: Boolean) {
        cdkBuilder.supportsClassC(supportsClassC)
      }

      override fun supportsClassC(supportsClassC: IResolvable) {
        cdkBuilder.supportsClassC(supportsClassC.let(IResolvable::unwrap))
      }

      override fun supportsJoin(supportsJoin: Boolean) {
        cdkBuilder.supportsJoin(supportsJoin)
      }

      override fun supportsJoin(supportsJoin: IResolvable) {
        cdkBuilder.supportsJoin(supportsJoin.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty,
    ) : LoRaWANDeviceProfileProperty {
      override fun classBTimeout(): Number? = unwrap(this).getClassBTimeout()

      override fun classCTimeout(): Number? = unwrap(this).getClassCTimeout()

      override fun factoryPresetFreqsList(): Any? = unwrap(this).getFactoryPresetFreqsList()

      override fun macVersion(): String? = unwrap(this).getMacVersion()

      override fun maxDutyCycle(): Number? = unwrap(this).getMaxDutyCycle()

      override fun maxEirp(): Number? = unwrap(this).getMaxEirp()

      override fun pingSlotDr(): Number? = unwrap(this).getPingSlotDr()

      override fun pingSlotFreq(): Number? = unwrap(this).getPingSlotFreq()

      override fun pingSlotPeriod(): Number? = unwrap(this).getPingSlotPeriod()

      override fun regParamsRevision(): String? = unwrap(this).getRegParamsRevision()

      override fun rfRegion(): String? = unwrap(this).getRfRegion()

      override fun rxDataRate2(): Number? = unwrap(this).getRxDataRate2()

      override fun rxDelay1(): Number? = unwrap(this).getRxDelay1()

      override fun rxDrOffset1(): Number? = unwrap(this).getRxDrOffset1()

      override fun rxFreq2(): Number? = unwrap(this).getRxFreq2()

      override fun supports32BitFCnt(): Any? = unwrap(this).getSupports32BitFCnt()

      override fun supportsClassB(): Any? = unwrap(this).getSupportsClassB()

      override fun supportsClassC(): Any? = unwrap(this).getSupportsClassC()

      override fun supportsJoin(): Any? = unwrap(this).getSupportsJoin()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANDeviceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty):
          LoRaWANDeviceProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANDeviceProfileProperty):
          software.amazon.awscdk.services.iotwireless.CfnDeviceProfile.LoRaWANDeviceProfileProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
