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

public open class CfnServiceProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLoRaWanChannelMask(): String = unwrap(this).getAttrLoRaWanChannelMask()

  public open fun attrLoRaWanDevStatusReqFreq(): Number =
      unwrap(this).getAttrLoRaWanDevStatusReqFreq()

  public open fun attrLoRaWanDlBucketSize(): Number = unwrap(this).getAttrLoRaWanDlBucketSize()

  public open fun attrLoRaWanDlRate(): Number = unwrap(this).getAttrLoRaWanDlRate()

  public open fun attrLoRaWanDlRatePolicy(): String = unwrap(this).getAttrLoRaWanDlRatePolicy()

  public open fun attrLoRaWanDrMax(): Number = unwrap(this).getAttrLoRaWanDrMax()

  public open fun attrLoRaWanDrMin(): Number = unwrap(this).getAttrLoRaWanDrMin()

  public open fun attrLoRaWanHrAllowed(): IResolvable =
      unwrap(this).getAttrLoRaWanHrAllowed().let(IResolvable::wrap)

  public open fun attrLoRaWanMinGwDiversity(): Number = unwrap(this).getAttrLoRaWanMinGwDiversity()

  public open fun attrLoRaWanNwkGeoLoc(): IResolvable =
      unwrap(this).getAttrLoRaWanNwkGeoLoc().let(IResolvable::wrap)

  public open fun attrLoRaWanReportDevStatusBattery(): IResolvable =
      unwrap(this).getAttrLoRaWanReportDevStatusBattery().let(IResolvable::wrap)

  public open fun attrLoRaWanReportDevStatusMargin(): IResolvable =
      unwrap(this).getAttrLoRaWanReportDevStatusMargin().let(IResolvable::wrap)

  public open fun attrLoRaWanResponse(): IResolvable =
      unwrap(this).getAttrLoRaWanResponse().let(IResolvable::wrap)

  public open fun attrLoRaWanTargetPer(): Number = unwrap(this).getAttrLoRaWanTargetPer()

  public open fun attrLoRaWanUlBucketSize(): Number = unwrap(this).getAttrLoRaWanUlBucketSize()

  public open fun attrLoRaWanUlRate(): Number = unwrap(this).getAttrLoRaWanUlRate()

  public open fun attrLoRaWanUlRatePolicy(): String = unwrap(this).getAttrLoRaWanUlRatePolicy()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public open fun loRaWan(`value`: IResolvable) {
    unwrap(this).setLoRaWan(`value`.let(IResolvable::unwrap))
  }

  public open fun loRaWan(`value`: LoRaWANServiceProfileProperty) {
    unwrap(this).setLoRaWan(`value`.let(LoRaWANServiceProfileProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a90efb522269a4bef1cf7a8897f6cb01d2c8bc254c78d95f85206f6426485b2")
  public open fun loRaWan(`value`: LoRaWANServiceProfileProperty.Builder.() -> Unit): Unit =
      loRaWan(LoRaWANServiceProfileProperty(`value`))

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

    public fun loRaWan(loRaWan: LoRaWANServiceProfileProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982f9e5497357dc9cc9cb2cf985bb6a1f014c6ac8fb5fe941b4bc0ee586ce8f")
    public fun loRaWan(loRaWan: LoRaWANServiceProfileProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotwireless.CfnServiceProfile.Builder =
        software.amazon.awscdk.services.iotwireless.CfnServiceProfile.Builder.create(scope, id)

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: LoRaWANServiceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(LoRaWANServiceProfileProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982f9e5497357dc9cc9cb2cf985bb6a1f014c6ac8fb5fe941b4bc0ee586ce8f")
    override fun loRaWan(loRaWan: LoRaWANServiceProfileProperty.Builder.() -> Unit): Unit =
        loRaWan(LoRaWANServiceProfileProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnServiceProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile):
        CfnServiceProfile = CfnServiceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProfile):
        software.amazon.awscdk.services.iotwireless.CfnServiceProfile = wrapped.cdkObject
  }

  public interface LoRaWANServiceProfileProperty {
    public fun addGwMetadata(): Any? = unwrap(this).getAddGwMetadata()

    public fun channelMask(): String? = unwrap(this).getChannelMask()

    public fun devStatusReqFreq(): Number? = unwrap(this).getDevStatusReqFreq()

    public fun dlBucketSize(): Number? = unwrap(this).getDlBucketSize()

    public fun dlRate(): Number? = unwrap(this).getDlRate()

    public fun dlRatePolicy(): String? = unwrap(this).getDlRatePolicy()

    public fun drMax(): Number? = unwrap(this).getDrMax()

    public fun drMin(): Number? = unwrap(this).getDrMin()

    public fun hrAllowed(): Any? = unwrap(this).getHrAllowed()

    public fun minGwDiversity(): Number? = unwrap(this).getMinGwDiversity()

    public fun nwkGeoLoc(): Any? = unwrap(this).getNwkGeoLoc()

    public fun prAllowed(): Any? = unwrap(this).getPrAllowed()

    public fun raAllowed(): Any? = unwrap(this).getRaAllowed()

    public fun reportDevStatusBattery(): Any? = unwrap(this).getReportDevStatusBattery()

    public fun reportDevStatusMargin(): Any? = unwrap(this).getReportDevStatusMargin()

    public fun targetPer(): Number? = unwrap(this).getTargetPer()

    public fun ulBucketSize(): Number? = unwrap(this).getUlBucketSize()

    public fun ulRate(): Number? = unwrap(this).getUlRate()

    public fun ulRatePolicy(): String? = unwrap(this).getUlRatePolicy()

    public interface Builder {
      public fun addGwMetadata(addGwMetadata: Boolean)

      public fun addGwMetadata(addGwMetadata: IResolvable)

      public fun channelMask(channelMask: String)

      public fun devStatusReqFreq(devStatusReqFreq: Number)

      public fun dlBucketSize(dlBucketSize: Number)

      public fun dlRate(dlRate: Number)

      public fun dlRatePolicy(dlRatePolicy: String)

      public fun drMax(drMax: Number)

      public fun drMin(drMin: Number)

      public fun hrAllowed(hrAllowed: Boolean)

      public fun hrAllowed(hrAllowed: IResolvable)

      public fun minGwDiversity(minGwDiversity: Number)

      public fun nwkGeoLoc(nwkGeoLoc: Boolean)

      public fun nwkGeoLoc(nwkGeoLoc: IResolvable)

      public fun prAllowed(prAllowed: Boolean)

      public fun prAllowed(prAllowed: IResolvable)

      public fun raAllowed(raAllowed: Boolean)

      public fun raAllowed(raAllowed: IResolvable)

      public fun reportDevStatusBattery(reportDevStatusBattery: Boolean)

      public fun reportDevStatusBattery(reportDevStatusBattery: IResolvable)

      public fun reportDevStatusMargin(reportDevStatusMargin: Boolean)

      public fun reportDevStatusMargin(reportDevStatusMargin: IResolvable)

      public fun targetPer(targetPer: Number)

      public fun ulBucketSize(ulBucketSize: Number)

      public fun ulRate(ulRate: Number)

      public fun ulRatePolicy(ulRatePolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty.Builder
          =
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty.builder()

      override fun addGwMetadata(addGwMetadata: Boolean) {
        cdkBuilder.addGwMetadata(addGwMetadata)
      }

      override fun addGwMetadata(addGwMetadata: IResolvable) {
        cdkBuilder.addGwMetadata(addGwMetadata.let(IResolvable::unwrap))
      }

      override fun channelMask(channelMask: String) {
        cdkBuilder.channelMask(channelMask)
      }

      override fun devStatusReqFreq(devStatusReqFreq: Number) {
        cdkBuilder.devStatusReqFreq(devStatusReqFreq)
      }

      override fun dlBucketSize(dlBucketSize: Number) {
        cdkBuilder.dlBucketSize(dlBucketSize)
      }

      override fun dlRate(dlRate: Number) {
        cdkBuilder.dlRate(dlRate)
      }

      override fun dlRatePolicy(dlRatePolicy: String) {
        cdkBuilder.dlRatePolicy(dlRatePolicy)
      }

      override fun drMax(drMax: Number) {
        cdkBuilder.drMax(drMax)
      }

      override fun drMin(drMin: Number) {
        cdkBuilder.drMin(drMin)
      }

      override fun hrAllowed(hrAllowed: Boolean) {
        cdkBuilder.hrAllowed(hrAllowed)
      }

      override fun hrAllowed(hrAllowed: IResolvable) {
        cdkBuilder.hrAllowed(hrAllowed.let(IResolvable::unwrap))
      }

      override fun minGwDiversity(minGwDiversity: Number) {
        cdkBuilder.minGwDiversity(minGwDiversity)
      }

      override fun nwkGeoLoc(nwkGeoLoc: Boolean) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc)
      }

      override fun nwkGeoLoc(nwkGeoLoc: IResolvable) {
        cdkBuilder.nwkGeoLoc(nwkGeoLoc.let(IResolvable::unwrap))
      }

      override fun prAllowed(prAllowed: Boolean) {
        cdkBuilder.prAllowed(prAllowed)
      }

      override fun prAllowed(prAllowed: IResolvable) {
        cdkBuilder.prAllowed(prAllowed.let(IResolvable::unwrap))
      }

      override fun raAllowed(raAllowed: Boolean) {
        cdkBuilder.raAllowed(raAllowed)
      }

      override fun raAllowed(raAllowed: IResolvable) {
        cdkBuilder.raAllowed(raAllowed.let(IResolvable::unwrap))
      }

      override fun reportDevStatusBattery(reportDevStatusBattery: Boolean) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery)
      }

      override fun reportDevStatusBattery(reportDevStatusBattery: IResolvable) {
        cdkBuilder.reportDevStatusBattery(reportDevStatusBattery.let(IResolvable::unwrap))
      }

      override fun reportDevStatusMargin(reportDevStatusMargin: Boolean) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin)
      }

      override fun reportDevStatusMargin(reportDevStatusMargin: IResolvable) {
        cdkBuilder.reportDevStatusMargin(reportDevStatusMargin.let(IResolvable::unwrap))
      }

      override fun targetPer(targetPer: Number) {
        cdkBuilder.targetPer(targetPer)
      }

      override fun ulBucketSize(ulBucketSize: Number) {
        cdkBuilder.ulBucketSize(ulBucketSize)
      }

      override fun ulRate(ulRate: Number) {
        cdkBuilder.ulRate(ulRate)
      }

      override fun ulRatePolicy(ulRatePolicy: String) {
        cdkBuilder.ulRatePolicy(ulRatePolicy)
      }

      public fun build():
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty,
    ) : LoRaWANServiceProfileProperty {
      override fun addGwMetadata(): Any? = unwrap(this).getAddGwMetadata()

      override fun channelMask(): String? = unwrap(this).getChannelMask()

      override fun devStatusReqFreq(): Number? = unwrap(this).getDevStatusReqFreq()

      override fun dlBucketSize(): Number? = unwrap(this).getDlBucketSize()

      override fun dlRate(): Number? = unwrap(this).getDlRate()

      override fun dlRatePolicy(): String? = unwrap(this).getDlRatePolicy()

      override fun drMax(): Number? = unwrap(this).getDrMax()

      override fun drMin(): Number? = unwrap(this).getDrMin()

      override fun hrAllowed(): Any? = unwrap(this).getHrAllowed()

      override fun minGwDiversity(): Number? = unwrap(this).getMinGwDiversity()

      override fun nwkGeoLoc(): Any? = unwrap(this).getNwkGeoLoc()

      override fun prAllowed(): Any? = unwrap(this).getPrAllowed()

      override fun raAllowed(): Any? = unwrap(this).getRaAllowed()

      override fun reportDevStatusBattery(): Any? = unwrap(this).getReportDevStatusBattery()

      override fun reportDevStatusMargin(): Any? = unwrap(this).getReportDevStatusMargin()

      override fun targetPer(): Number? = unwrap(this).getTargetPer()

      override fun ulBucketSize(): Number? = unwrap(this).getUlBucketSize()

      override fun ulRate(): Number? = unwrap(this).getUlRate()

      override fun ulRatePolicy(): String? = unwrap(this).getUlRatePolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoRaWANServiceProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty):
          LoRaWANServiceProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoRaWANServiceProfileProperty):
          software.amazon.awscdk.services.iotwireless.CfnServiceProfile.LoRaWANServiceProfileProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
