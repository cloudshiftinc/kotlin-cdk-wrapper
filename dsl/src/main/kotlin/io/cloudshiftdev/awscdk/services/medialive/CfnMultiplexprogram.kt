package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnMultiplexprogram internal constructor(
  private val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram,
) : CfnResource(cdkObject), IInspectable {
  public open fun channelId(): String? = unwrap(this).getChannelId()

  public open fun channelId(`value`: String) {
    unwrap(this).setChannelId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun multiplexId(): String? = unwrap(this).getMultiplexId()

  public open fun multiplexId(`value`: String) {
    unwrap(this).setMultiplexId(`value`)
  }

  public open fun multiplexProgramSettings(): Any? = unwrap(this).getMultiplexProgramSettings()

  public open fun multiplexProgramSettings(`value`: IResolvable) {
    unwrap(this).setMultiplexProgramSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun multiplexProgramSettings(`value`: MultiplexProgramSettingsProperty) {
    unwrap(this).setMultiplexProgramSettings(`value`.let(MultiplexProgramSettingsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc3af6786ddb05397b91b61e78dd60ca59cdc384de2e9b6729f383b20e914b76")
  public open
      fun multiplexProgramSettings(`value`: MultiplexProgramSettingsProperty.Builder.() -> Unit):
      Unit = multiplexProgramSettings(MultiplexProgramSettingsProperty(`value`))

  public open fun packetIdentifiersMap(): Any? = unwrap(this).getPacketIdentifiersMap()

  public open fun packetIdentifiersMap(`value`: IResolvable) {
    unwrap(this).setPacketIdentifiersMap(`value`.let(IResolvable::unwrap))
  }

  public open fun packetIdentifiersMap(`value`: MultiplexProgramPacketIdentifiersMapProperty) {
    unwrap(this).setPacketIdentifiersMap(`value`.let(MultiplexProgramPacketIdentifiersMapProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe93c7dc6dd6b1d6747cd2c0636b237c4caf4888d182dd9f11ebb19ca5ec6a7d")
  public open
      fun packetIdentifiersMap(`value`: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit):
      Unit = packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty(`value`))

  public open fun pipelineDetails(): Any? = unwrap(this).getPipelineDetails()

  public open fun pipelineDetails(`value`: IResolvable) {
    unwrap(this).setPipelineDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun pipelineDetails(__idx_ac66f0: List<Any>) {
    unwrap(this).setPipelineDetails(__idx_ac66f0)
  }

  public open fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

  public open fun preferredChannelPipeline(`value`: String) {
    unwrap(this).setPreferredChannelPipeline(`value`)
  }

  public open fun programName(): String? = unwrap(this).getProgramName()

  public open fun programName(`value`: String) {
    unwrap(this).setProgramName(`value`)
  }

  public interface Builder {
    public fun channelId(channelId: String) {
    }

    public fun multiplexId(multiplexId: String) {
    }

    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
    }

    public
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
    public
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit) {
    }

    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
    }

    public
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
    public
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit) {
    }

    public fun pipelineDetails(pipelineDetails: IResolvable) {
    }

    public fun pipelineDetails(pipelineDetails: List<Any>) {
    }

    public fun preferredChannelPipeline(preferredChannelPipeline: String) {
    }

    public fun programName(programName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder.create(scope, id)

    public override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    public override fun multiplexId(multiplexId: String) {
      cdkBuilder.multiplexId(multiplexId)
    }

    public override fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(IResolvable::unwrap))
    }

    public override
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(MultiplexProgramSettingsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
    public override
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit):
        Unit = multiplexProgramSettings(MultiplexProgramSettingsProperty(multiplexProgramSettings))

    public override fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(IResolvable::unwrap))
    }

    public override
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(MultiplexProgramPacketIdentifiersMapProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
    public override
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit):
        Unit =
        packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty(packetIdentifiersMap))

    public override fun pipelineDetails(pipelineDetails: IResolvable) {
      cdkBuilder.pipelineDetails(pipelineDetails.let(IResolvable::unwrap))
    }

    public override fun pipelineDetails(pipelineDetails: List<Any>) {
      cdkBuilder.pipelineDetails(pipelineDetails)
    }

    public override fun preferredChannelPipeline(preferredChannelPipeline: String) {
      cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    public override fun programName(programName: String) {
      cdkBuilder.programName(programName)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexprogram =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMultiplexprogram {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMultiplexprogram(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram):
        CfnMultiplexprogram = CfnMultiplexprogram(cdkObject)

    internal fun unwrap(wrapped: CfnMultiplexprogram):
        software.amazon.awscdk.services.medialive.CfnMultiplexprogram = wrapped.cdkObject
  }

  public interface MultiplexProgramPacketIdentifiersMapProperty {
    public fun audioPids(): Any? = unwrap(this).getAudioPids()

    public fun dvbSubPids(): Any? = unwrap(this).getDvbSubPids()

    public fun dvbTeletextPid(): Number? = unwrap(this).getDvbTeletextPid()

    public fun etvPlatformPid(): Number? = unwrap(this).getEtvPlatformPid()

    public fun etvSignalPid(): Number? = unwrap(this).getEtvSignalPid()

    public fun klvDataPids(): Any? = unwrap(this).getKlvDataPids()

    public fun pcrPid(): Number? = unwrap(this).getPcrPid()

    public fun pmtPid(): Number? = unwrap(this).getPmtPid()

    public fun privateMetadataPid(): Number? = unwrap(this).getPrivateMetadataPid()

    public fun scte27Pids(): Any? = unwrap(this).getScte27Pids()

    public fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

    public fun timedMetadataPid(): Number? = unwrap(this).getTimedMetadataPid()

    public fun videoPid(): Number? = unwrap(this).getVideoPid()

    public interface Builder {
      public fun audioPids(audioPids: IResolvable) {
      }

      public fun audioPids(audioPids: List<Number>) {
      }

      public fun dvbSubPids(dvbSubPids: IResolvable) {
      }

      public fun dvbSubPids(dvbSubPids: List<Number>) {
      }

      public fun dvbTeletextPid(dvbTeletextPid: Number) {
      }

      public fun etvPlatformPid(etvPlatformPid: Number) {
      }

      public fun etvSignalPid(etvSignalPid: Number) {
      }

      public fun klvDataPids(klvDataPids: IResolvable) {
      }

      public fun klvDataPids(klvDataPids: List<Number>) {
      }

      public fun pcrPid(pcrPid: Number) {
      }

      public fun pmtPid(pmtPid: Number) {
      }

      public fun privateMetadataPid(privateMetadataPid: Number) {
      }

      public fun scte27Pids(scte27Pids: IResolvable) {
      }

      public fun scte27Pids(scte27Pids: List<Number>) {
      }

      public fun scte35Pid(scte35Pid: Number) {
      }

      public fun timedMetadataPid(timedMetadataPid: Number) {
      }

      public fun videoPid(videoPid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.builder()

      public override fun audioPids(audioPids: IResolvable) {
        cdkBuilder.audioPids(audioPids.let(IResolvable::unwrap))
      }

      public override fun audioPids(audioPids: List<Number>) {
        cdkBuilder.audioPids(audioPids)
      }

      public override fun dvbSubPids(dvbSubPids: IResolvable) {
        cdkBuilder.dvbSubPids(dvbSubPids.let(IResolvable::unwrap))
      }

      public override fun dvbSubPids(dvbSubPids: List<Number>) {
        cdkBuilder.dvbSubPids(dvbSubPids)
      }

      public override fun dvbTeletextPid(dvbTeletextPid: Number) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
      }

      public override fun etvPlatformPid(etvPlatformPid: Number) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
      }

      public override fun etvSignalPid(etvSignalPid: Number) {
        cdkBuilder.etvSignalPid(etvSignalPid)
      }

      public override fun klvDataPids(klvDataPids: IResolvable) {
        cdkBuilder.klvDataPids(klvDataPids.let(IResolvable::unwrap))
      }

      public override fun klvDataPids(klvDataPids: List<Number>) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      public override fun pcrPid(pcrPid: Number) {
        cdkBuilder.pcrPid(pcrPid)
      }

      public override fun pmtPid(pmtPid: Number) {
        cdkBuilder.pmtPid(pmtPid)
      }

      public override fun privateMetadataPid(privateMetadataPid: Number) {
        cdkBuilder.privateMetadataPid(privateMetadataPid)
      }

      public override fun scte27Pids(scte27Pids: IResolvable) {
        cdkBuilder.scte27Pids(scte27Pids.let(IResolvable::unwrap))
      }

      public override fun scte27Pids(scte27Pids: List<Number>) {
        cdkBuilder.scte27Pids(scte27Pids)
      }

      public override fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      public override fun timedMetadataPid(timedMetadataPid: Number) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      public override fun videoPid(videoPid: Number) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty,
    ) : MultiplexProgramPacketIdentifiersMapProperty {
      public override fun audioPids(): Any? = unwrap(this).getAudioPids()

      public override fun dvbSubPids(): Any? = unwrap(this).getDvbSubPids()

      public override fun dvbTeletextPid(): Number? = unwrap(this).getDvbTeletextPid()

      public override fun etvPlatformPid(): Number? = unwrap(this).getEtvPlatformPid()

      public override fun etvSignalPid(): Number? = unwrap(this).getEtvSignalPid()

      public override fun klvDataPids(): Any? = unwrap(this).getKlvDataPids()

      public override fun pcrPid(): Number? = unwrap(this).getPcrPid()

      public override fun pmtPid(): Number? = unwrap(this).getPmtPid()

      public override fun privateMetadataPid(): Number? = unwrap(this).getPrivateMetadataPid()

      public override fun scte27Pids(): Any? = unwrap(this).getScte27Pids()

      public override fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

      public override fun timedMetadataPid(): Number? = unwrap(this).getTimedMetadataPid()

      public override fun videoPid(): Number? = unwrap(this).getVideoPid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexProgramPacketIdentifiersMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty):
          MultiplexProgramPacketIdentifiersMapProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramPacketIdentifiersMapProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexProgramPipelineDetailProperty {
    public fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

    public fun pipelineId(): String? = unwrap(this).getPipelineId()

    public interface Builder {
      public fun activeChannelPipeline(activeChannelPipeline: String) {
      }

      public fun pipelineId(pipelineId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.builder()

      public override fun activeChannelPipeline(activeChannelPipeline: String) {
        cdkBuilder.activeChannelPipeline(activeChannelPipeline)
      }

      public override fun pipelineId(pipelineId: String) {
        cdkBuilder.pipelineId(pipelineId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty,
    ) : MultiplexProgramPipelineDetailProperty {
      public override fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

      public override fun pipelineId(): String? = unwrap(this).getPipelineId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexProgramPipelineDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty):
          MultiplexProgramPipelineDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramPipelineDetailProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexVideoSettingsProperty {
    public fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

    public fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()

    public interface Builder {
      public fun constantBitrate(constantBitrate: Number) {
      }

      public fun statmuxSettings(statmuxSettings: IResolvable) {
      }

      public fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
      public
          fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty.builder()

      public override fun constantBitrate(constantBitrate: Number) {
        cdkBuilder.constantBitrate(constantBitrate)
      }

      public override fun statmuxSettings(statmuxSettings: IResolvable) {
        cdkBuilder.statmuxSettings(statmuxSettings.let(IResolvable::unwrap))
      }

      public override fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty) {
        cdkBuilder.statmuxSettings(statmuxSettings.let(MultiplexStatmuxVideoSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
      public override
          fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit):
          Unit = statmuxSettings(MultiplexStatmuxVideoSettingsProperty(statmuxSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty,
    ) : MultiplexVideoSettingsProperty {
      public override fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

      public override fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexVideoSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty):
          MultiplexVideoSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexVideoSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexProgramSettingsProperty {
    public fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

    public fun programNumber(): Number

    public fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

    public fun videoSettings(): Any? = unwrap(this).getVideoSettings()

    public interface Builder {
      public fun preferredChannelPipeline(preferredChannelPipeline: String) {
      }

      public fun programNumber(programNumber: Number) {
      }

      public fun serviceDescriptor(serviceDescriptor: IResolvable) {
      }

      public fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
      public
          fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit) {
      }

      public fun videoSettings(videoSettings: IResolvable) {
      }

      public fun videoSettings(videoSettings: MultiplexVideoSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
      public fun videoSettings(videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty.builder()

      public override fun preferredChannelPipeline(preferredChannelPipeline: String) {
        cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
      }

      public override fun programNumber(programNumber: Number) {
        cdkBuilder.programNumber(programNumber)
      }

      public override fun serviceDescriptor(serviceDescriptor: IResolvable) {
        cdkBuilder.serviceDescriptor(serviceDescriptor.let(IResolvable::unwrap))
      }

      public override
          fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty) {
        cdkBuilder.serviceDescriptor(serviceDescriptor.let(MultiplexProgramServiceDescriptorProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
      public override
          fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit):
          Unit = serviceDescriptor(MultiplexProgramServiceDescriptorProperty(serviceDescriptor))

      public override fun videoSettings(videoSettings: IResolvable) {
        cdkBuilder.videoSettings(videoSettings.let(IResolvable::unwrap))
      }

      public override fun videoSettings(videoSettings: MultiplexVideoSettingsProperty) {
        cdkBuilder.videoSettings(videoSettings.let(MultiplexVideoSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
      public override
          fun videoSettings(videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit): Unit
          = videoSettings(MultiplexVideoSettingsProperty(videoSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty,
    ) : MultiplexProgramSettingsProperty {
      public override fun preferredChannelPipeline(): String? =
          unwrap(this).getPreferredChannelPipeline()

      public override fun programNumber(): Number = unwrap(this).getProgramNumber()

      public override fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

      public override fun videoSettings(): Any? = unwrap(this).getVideoSettings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexProgramSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty):
          MultiplexProgramSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexStatmuxVideoSettingsProperty {
    public fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

    public fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

    public fun priority(): Number? = unwrap(this).getPriority()

    public interface Builder {
      public fun maximumBitrate(maximumBitrate: Number) {
      }

      public fun minimumBitrate(minimumBitrate: Number) {
      }

      public fun priority(priority: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.builder()

      public override fun maximumBitrate(maximumBitrate: Number) {
        cdkBuilder.maximumBitrate(maximumBitrate)
      }

      public override fun minimumBitrate(minimumBitrate: Number) {
        cdkBuilder.minimumBitrate(minimumBitrate)
      }

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty,
    ) : MultiplexStatmuxVideoSettingsProperty {
      public override fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

      public override fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

      public override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexStatmuxVideoSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty):
          MultiplexStatmuxVideoSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexStatmuxVideoSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MultiplexProgramServiceDescriptorProperty {
    public fun providerName(): String

    public fun serviceName(): String

    public interface Builder {
      public fun providerName(providerName: String) {
      }

      public fun serviceName(serviceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.builder()

      public override fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
      }

      public override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty,
    ) : MultiplexProgramServiceDescriptorProperty {
      public override fun providerName(): String = unwrap(this).getProviderName()

      public override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultiplexProgramServiceDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty):
          MultiplexProgramServiceDescriptorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramServiceDescriptorProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
