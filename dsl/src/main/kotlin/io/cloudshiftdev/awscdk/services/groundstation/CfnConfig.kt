package io.cloudshiftdev.awscdk.services.groundstation

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

public open class CfnConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrType(): String = unwrap(this).getAttrType()

  public open fun configData(): Any = unwrap(this).getConfigData()

  public open fun configData(`value`: IResolvable) {
    unwrap(this).setConfigData(`value`.let(IResolvable::unwrap))
  }

  public open fun configData(`value`: ConfigDataProperty) {
    unwrap(this).setConfigData(`value`.let(ConfigDataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad1cba991ba68797a0182dfde1623e59e6af576977ec8c35cf05cfa9eddc8d80")
  public open fun configData(`value`: ConfigDataProperty.Builder.() -> Unit): Unit =
      configData(ConfigDataProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

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
    public fun configData(configData: IResolvable)

    public fun configData(configData: ConfigDataProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bdf5af7de0ff43d0573dd7103ea00c681cadc3f9f100193f8727c8b62912646")
    public fun configData(configData: ConfigDataProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnConfig.Builder =
        software.amazon.awscdk.services.groundstation.CfnConfig.Builder.create(scope, id)

    override fun configData(configData: IResolvable) {
      cdkBuilder.configData(configData.let(IResolvable::unwrap))
    }

    override fun configData(configData: ConfigDataProperty) {
      cdkBuilder.configData(configData.let(ConfigDataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bdf5af7de0ff43d0573dd7103ea00c681cadc3f9f100193f8727c8b62912646")
    override fun configData(configData: ConfigDataProperty.Builder.() -> Unit): Unit =
        configData(ConfigDataProperty(configData))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig): CfnConfig
        = CfnConfig(cdkObject)

    internal fun unwrap(wrapped: CfnConfig): software.amazon.awscdk.services.groundstation.CfnConfig
        = wrapped.cdkObject
  }

  public interface DataflowEndpointConfigProperty {
    public fun dataflowEndpointName(): String? = unwrap(this).getDataflowEndpointName()

    public fun dataflowEndpointRegion(): String? = unwrap(this).getDataflowEndpointRegion()

    public interface Builder {
      public fun dataflowEndpointName(dataflowEndpointName: String)

      public fun dataflowEndpointRegion(dataflowEndpointRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty.builder()

      override fun dataflowEndpointName(dataflowEndpointName: String) {
        cdkBuilder.dataflowEndpointName(dataflowEndpointName)
      }

      override fun dataflowEndpointRegion(dataflowEndpointRegion: String) {
        cdkBuilder.dataflowEndpointRegion(dataflowEndpointRegion)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty,
    ) : DataflowEndpointConfigProperty {
      override fun dataflowEndpointName(): String? = unwrap(this).getDataflowEndpointName()

      override fun dataflowEndpointRegion(): String? = unwrap(this).getDataflowEndpointRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEndpointConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty):
          DataflowEndpointConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataflowEndpointConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UplinkSpectrumConfigProperty {
    public fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

    public fun polarization(): String? = unwrap(this).getPolarization()

    public interface Builder {
      public fun centerFrequency(centerFrequency: IResolvable)

      public fun centerFrequency(centerFrequency: FrequencyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce5ef5bdc5a0cc681dbba37350877f9524c0fb76096c96eb150111dddad9694d")
      public fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit)

      public fun polarization(polarization: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty.builder()

      override fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency.let(IResolvable::unwrap))
      }

      override fun centerFrequency(centerFrequency: FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency.let(FrequencyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce5ef5bdc5a0cc681dbba37350877f9524c0fb76096c96eb150111dddad9694d")
      override fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit): Unit =
          centerFrequency(FrequencyProperty(centerFrequency))

      override fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty,
    ) : UplinkSpectrumConfigProperty {
      override fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

      override fun polarization(): String? = unwrap(this).getPolarization()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UplinkSpectrumConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty):
          UplinkSpectrumConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UplinkSpectrumConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrackingConfigProperty {
    public fun autotrack(): String? = unwrap(this).getAutotrack()

    public interface Builder {
      public fun autotrack(autotrack: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.builder()

      override fun autotrack(autotrack: String) {
        cdkBuilder.autotrack(autotrack)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty,
    ) : TrackingConfigProperty {
      override fun autotrack(): String? = unwrap(this).getAutotrack()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty):
          TrackingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrackingConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FrequencyProperty {
    public fun units(): String? = unwrap(this).getUnits()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun units(units: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty.builder()

      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty,
    ) : FrequencyProperty {
      override fun units(): String? = unwrap(this).getUnits()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrequencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty):
          FrequencyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrequencyProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfigDataProperty {
    public fun antennaDownlinkConfig(): Any? = unwrap(this).getAntennaDownlinkConfig()

    public fun antennaDownlinkDemodDecodeConfig(): Any? =
        unwrap(this).getAntennaDownlinkDemodDecodeConfig()

    public fun antennaUplinkConfig(): Any? = unwrap(this).getAntennaUplinkConfig()

    public fun dataflowEndpointConfig(): Any? = unwrap(this).getDataflowEndpointConfig()

    public fun s3RecordingConfig(): Any? = unwrap(this).getS3RecordingConfig()

    public fun trackingConfig(): Any? = unwrap(this).getTrackingConfig()

    public fun uplinkEchoConfig(): Any? = unwrap(this).getUplinkEchoConfig()

    public interface Builder {
      public fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable)

      public fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7a2cb2e2de5da61ba05fee08241c3e250ac1c4ae9b09b4c778b8b7fa82f7764")
      public
          fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty.Builder.() -> Unit)

      public fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable)

      public
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d0baf1af43e1879e4081b34471973f4d932da70bfc6a9a450e0ea950877607")
      public
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty.Builder.() -> Unit)

      public fun antennaUplinkConfig(antennaUplinkConfig: IResolvable)

      public fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e683d9dbb2881828c7f91e7acf80e85b64ac1a993fe3920e567b26f5ab4bb3e")
      public
          fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty.Builder.() -> Unit)

      public fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable)

      public fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ecd5f3e83583f469ac597f4908c851e4e743ba415170780e3b6ec1b0b32a07f")
      public
          fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty.Builder.() -> Unit)

      public fun s3RecordingConfig(s3RecordingConfig: IResolvable)

      public fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b810d472a639602948402c858f31c95b7f7e2c83183883330e5db314bbe364")
      public fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty.Builder.() -> Unit)

      public fun trackingConfig(trackingConfig: IResolvable)

      public fun trackingConfig(trackingConfig: TrackingConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc026be17cdda923100e7e206217b7badfcc1d5b4b8787c6fff3048146a53ece")
      public fun trackingConfig(trackingConfig: TrackingConfigProperty.Builder.() -> Unit)

      public fun uplinkEchoConfig(uplinkEchoConfig: IResolvable)

      public fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2dd7c421827f5ef12e5f61f27d89e3cb3a7df37bfde8d3f36d1365ac5be1962")
      public fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty.builder()

      override fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig.let(IResolvable::unwrap))
      }

      override fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig.let(AntennaDownlinkConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7a2cb2e2de5da61ba05fee08241c3e250ac1c4ae9b09b4c778b8b7fa82f7764")
      override
          fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty.Builder.() -> Unit):
          Unit = antennaDownlinkConfig(AntennaDownlinkConfigProperty(antennaDownlinkConfig))

      override fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig.let(IResolvable::unwrap))
      }

      override
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig.let(AntennaDownlinkDemodDecodeConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d0baf1af43e1879e4081b34471973f4d932da70bfc6a9a450e0ea950877607")
      override
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty.Builder.() -> Unit):
          Unit =
          antennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfigProperty(antennaDownlinkDemodDecodeConfig))

      override fun antennaUplinkConfig(antennaUplinkConfig: IResolvable) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig.let(IResolvable::unwrap))
      }

      override fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig.let(AntennaUplinkConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e683d9dbb2881828c7f91e7acf80e85b64ac1a993fe3920e567b26f5ab4bb3e")
      override
          fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty.Builder.() -> Unit):
          Unit = antennaUplinkConfig(AntennaUplinkConfigProperty(antennaUplinkConfig))

      override fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig.let(IResolvable::unwrap))
      }

      override fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig.let(DataflowEndpointConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ecd5f3e83583f469ac597f4908c851e4e743ba415170780e3b6ec1b0b32a07f")
      override
          fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty.Builder.() -> Unit):
          Unit = dataflowEndpointConfig(DataflowEndpointConfigProperty(dataflowEndpointConfig))

      override fun s3RecordingConfig(s3RecordingConfig: IResolvable) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig.let(IResolvable::unwrap))
      }

      override fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig.let(S3RecordingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b810d472a639602948402c858f31c95b7f7e2c83183883330e5db314bbe364")
      override
          fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty.Builder.() -> Unit):
          Unit = s3RecordingConfig(S3RecordingConfigProperty(s3RecordingConfig))

      override fun trackingConfig(trackingConfig: IResolvable) {
        cdkBuilder.trackingConfig(trackingConfig.let(IResolvable::unwrap))
      }

      override fun trackingConfig(trackingConfig: TrackingConfigProperty) {
        cdkBuilder.trackingConfig(trackingConfig.let(TrackingConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc026be17cdda923100e7e206217b7badfcc1d5b4b8787c6fff3048146a53ece")
      override fun trackingConfig(trackingConfig: TrackingConfigProperty.Builder.() -> Unit): Unit =
          trackingConfig(TrackingConfigProperty(trackingConfig))

      override fun uplinkEchoConfig(uplinkEchoConfig: IResolvable) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig.let(IResolvable::unwrap))
      }

      override fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig.let(UplinkEchoConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2dd7c421827f5ef12e5f61f27d89e3cb3a7df37bfde8d3f36d1365ac5be1962")
      override fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty.Builder.() -> Unit):
          Unit = uplinkEchoConfig(UplinkEchoConfigProperty(uplinkEchoConfig))

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty,
    ) : ConfigDataProperty {
      override fun antennaDownlinkConfig(): Any? = unwrap(this).getAntennaDownlinkConfig()

      override fun antennaDownlinkDemodDecodeConfig(): Any? =
          unwrap(this).getAntennaDownlinkDemodDecodeConfig()

      override fun antennaUplinkConfig(): Any? = unwrap(this).getAntennaUplinkConfig()

      override fun dataflowEndpointConfig(): Any? = unwrap(this).getDataflowEndpointConfig()

      override fun s3RecordingConfig(): Any? = unwrap(this).getS3RecordingConfig()

      override fun trackingConfig(): Any? = unwrap(this).getTrackingConfig()

      override fun uplinkEchoConfig(): Any? = unwrap(this).getUplinkEchoConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty):
          ConfigDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigDataProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FrequencyBandwidthProperty {
    public fun units(): String? = unwrap(this).getUnits()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun units(units: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty.builder()

      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty,
    ) : FrequencyBandwidthProperty {
      override fun units(): String? = unwrap(this).getUnits()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FrequencyBandwidthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty):
          FrequencyBandwidthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrequencyBandwidthProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DecodeConfigProperty {
    public fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()

    public interface Builder {
      public fun unvalidatedJson(unvalidatedJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty.builder()

      override fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty,
    ) : DecodeConfigProperty {
      override fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty):
          DecodeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecodeConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EirpProperty {
    public fun units(): String? = unwrap(this).getUnits()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun units(units: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty.builder()

      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty,
    ) : EirpProperty {
      override fun units(): String? = unwrap(this).getUnits()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EirpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty):
          EirpProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EirpProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AntennaDownlinkDemodDecodeConfigProperty {
    public fun decodeConfig(): Any? = unwrap(this).getDecodeConfig()

    public fun demodulationConfig(): Any? = unwrap(this).getDemodulationConfig()

    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    public interface Builder {
      public fun decodeConfig(decodeConfig: IResolvable)

      public fun decodeConfig(decodeConfig: DecodeConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f6fe2a6a288dc6d33fb2eed29827a3837936477d02861ab99cad291d7cde72")
      public fun decodeConfig(decodeConfig: DecodeConfigProperty.Builder.() -> Unit)

      public fun demodulationConfig(demodulationConfig: IResolvable)

      public fun demodulationConfig(demodulationConfig: DemodulationConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0a9f2fe13c3bd64c02bcd06addc44c8e1290399ec3a59a50da1a9d5af7c78e0")
      public
          fun demodulationConfig(demodulationConfig: DemodulationConfigProperty.Builder.() -> Unit)

      public fun spectrumConfig(spectrumConfig: IResolvable)

      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e396683af6258796a463bfcfe4e947b18814e7a7223d1dfbbf3f2a08d326e96")
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.builder()

      override fun decodeConfig(decodeConfig: IResolvable) {
        cdkBuilder.decodeConfig(decodeConfig.let(IResolvable::unwrap))
      }

      override fun decodeConfig(decodeConfig: DecodeConfigProperty) {
        cdkBuilder.decodeConfig(decodeConfig.let(DecodeConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f6fe2a6a288dc6d33fb2eed29827a3837936477d02861ab99cad291d7cde72")
      override fun decodeConfig(decodeConfig: DecodeConfigProperty.Builder.() -> Unit): Unit =
          decodeConfig(DecodeConfigProperty(decodeConfig))

      override fun demodulationConfig(demodulationConfig: IResolvable) {
        cdkBuilder.demodulationConfig(demodulationConfig.let(IResolvable::unwrap))
      }

      override fun demodulationConfig(demodulationConfig: DemodulationConfigProperty) {
        cdkBuilder.demodulationConfig(demodulationConfig.let(DemodulationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0a9f2fe13c3bd64c02bcd06addc44c8e1290399ec3a59a50da1a9d5af7c78e0")
      override
          fun demodulationConfig(demodulationConfig: DemodulationConfigProperty.Builder.() -> Unit):
          Unit = demodulationConfig(DemodulationConfigProperty(demodulationConfig))

      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(SpectrumConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e396683af6258796a463bfcfe4e947b18814e7a7223d1dfbbf3f2a08d326e96")
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit): Unit =
          spectrumConfig(SpectrumConfigProperty(spectrumConfig))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty,
    ) : AntennaDownlinkDemodDecodeConfigProperty {
      override fun decodeConfig(): Any? = unwrap(this).getDecodeConfig()

      override fun demodulationConfig(): Any? = unwrap(this).getDemodulationConfig()

      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AntennaDownlinkDemodDecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty):
          AntennaDownlinkDemodDecodeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AntennaDownlinkDemodDecodeConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DemodulationConfigProperty {
    public fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()

    public interface Builder {
      public fun unvalidatedJson(unvalidatedJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.builder()

      override fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty,
    ) : DemodulationConfigProperty {
      override fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DemodulationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty):
          DemodulationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DemodulationConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AntennaDownlinkConfigProperty {
    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    public interface Builder {
      public fun spectrumConfig(spectrumConfig: IResolvable)

      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b5683f44729ff20d9fefa85e712c39f52d7130711aadca8f83422b35d01ae3")
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.builder()

      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(SpectrumConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b5683f44729ff20d9fefa85e712c39f52d7130711aadca8f83422b35d01ae3")
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit): Unit =
          spectrumConfig(SpectrumConfigProperty(spectrumConfig))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty,
    ) : AntennaDownlinkConfigProperty {
      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AntennaDownlinkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty):
          AntennaDownlinkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AntennaDownlinkConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3RecordingConfigProperty {
    public fun bucketArn(): String? = unwrap(this).getBucketArn()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun bucketArn(bucketArn: String)

      public fun prefix(prefix: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty.builder()

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty,
    ) : S3RecordingConfigProperty {
      override fun bucketArn(): String? = unwrap(this).getBucketArn()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3RecordingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty):
          S3RecordingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3RecordingConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface UplinkEchoConfigProperty {
    public fun antennaUplinkConfigArn(): String? = unwrap(this).getAntennaUplinkConfigArn()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public interface Builder {
      public fun antennaUplinkConfigArn(antennaUplinkConfigArn: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty.builder()

      override fun antennaUplinkConfigArn(antennaUplinkConfigArn: String) {
        cdkBuilder.antennaUplinkConfigArn(antennaUplinkConfigArn)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty,
    ) : UplinkEchoConfigProperty {
      override fun antennaUplinkConfigArn(): String? = unwrap(this).getAntennaUplinkConfigArn()

      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): UplinkEchoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty):
          UplinkEchoConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UplinkEchoConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SpectrumConfigProperty {
    public fun bandwidth(): Any? = unwrap(this).getBandwidth()

    public fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

    public fun polarization(): String? = unwrap(this).getPolarization()

    public interface Builder {
      public fun bandwidth(bandwidth: IResolvable)

      public fun bandwidth(bandwidth: FrequencyBandwidthProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f86b6a696ee407f4e18ed6b8fa7d088c5cba74464613b1c99c83cb55ecc5e3b4")
      public fun bandwidth(bandwidth: FrequencyBandwidthProperty.Builder.() -> Unit)

      public fun centerFrequency(centerFrequency: IResolvable)

      public fun centerFrequency(centerFrequency: FrequencyProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fe26014ac8993be2915449f92c808ec5143605d29c7a43e98e914df410af126")
      public fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit)

      public fun polarization(polarization: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty.builder()

      override fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth.let(IResolvable::unwrap))
      }

      override fun bandwidth(bandwidth: FrequencyBandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth.let(FrequencyBandwidthProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f86b6a696ee407f4e18ed6b8fa7d088c5cba74464613b1c99c83cb55ecc5e3b4")
      override fun bandwidth(bandwidth: FrequencyBandwidthProperty.Builder.() -> Unit): Unit =
          bandwidth(FrequencyBandwidthProperty(bandwidth))

      override fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency.let(IResolvable::unwrap))
      }

      override fun centerFrequency(centerFrequency: FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency.let(FrequencyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fe26014ac8993be2915449f92c808ec5143605d29c7a43e98e914df410af126")
      override fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit): Unit =
          centerFrequency(FrequencyProperty(centerFrequency))

      override fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty,
    ) : SpectrumConfigProperty {
      override fun bandwidth(): Any? = unwrap(this).getBandwidth()

      override fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

      override fun polarization(): String? = unwrap(this).getPolarization()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpectrumConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty):
          SpectrumConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpectrumConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AntennaUplinkConfigProperty {
    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    public fun targetEirp(): Any? = unwrap(this).getTargetEirp()

    public fun transmitDisabled(): Any? = unwrap(this).getTransmitDisabled()

    public interface Builder {
      public fun spectrumConfig(spectrumConfig: IResolvable)

      public fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dea05ab978fd04ba084abfba00bf59ebfbef118fee29ca1b9ff8785385774e84")
      public fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty.Builder.() -> Unit)

      public fun targetEirp(targetEirp: IResolvable)

      public fun targetEirp(targetEirp: EirpProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feefa4f5b0ff7258c3c5a4c739c2e1924d755d513639600e6a72ac97c904e03e")
      public fun targetEirp(targetEirp: EirpProperty.Builder.() -> Unit)

      public fun transmitDisabled(transmitDisabled: Boolean)

      public fun transmitDisabled(transmitDisabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty.builder()

      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      override fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(UplinkSpectrumConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dea05ab978fd04ba084abfba00bf59ebfbef118fee29ca1b9ff8785385774e84")
      override fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty.Builder.() -> Unit):
          Unit = spectrumConfig(UplinkSpectrumConfigProperty(spectrumConfig))

      override fun targetEirp(targetEirp: IResolvable) {
        cdkBuilder.targetEirp(targetEirp.let(IResolvable::unwrap))
      }

      override fun targetEirp(targetEirp: EirpProperty) {
        cdkBuilder.targetEirp(targetEirp.let(EirpProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feefa4f5b0ff7258c3c5a4c739c2e1924d755d513639600e6a72ac97c904e03e")
      override fun targetEirp(targetEirp: EirpProperty.Builder.() -> Unit): Unit =
          targetEirp(EirpProperty(targetEirp))

      override fun transmitDisabled(transmitDisabled: Boolean) {
        cdkBuilder.transmitDisabled(transmitDisabled)
      }

      override fun transmitDisabled(transmitDisabled: IResolvable) {
        cdkBuilder.transmitDisabled(transmitDisabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty,
    ) : AntennaUplinkConfigProperty {
      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

      override fun targetEirp(): Any? = unwrap(this).getTargetEirp()

      override fun transmitDisabled(): Any? = unwrap(this).getTransmitDisabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AntennaUplinkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty):
          AntennaUplinkConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AntennaUplinkConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
