@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMultiplexprogram internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram,
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun pipelineDetails(vararg __idx_ac66f0: Any): Unit =
      pipelineDetails(__idx_ac66f0.toList())

  public open fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

  public open fun preferredChannelPipeline(`value`: String) {
    unwrap(this).setPreferredChannelPipeline(`value`)
  }

  public open fun programName(): String? = unwrap(this).getProgramName()

  public open fun programName(`value`: String) {
    unwrap(this).setProgramName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun channelId(channelId: String)

    public fun multiplexId(multiplexId: String)

    public fun multiplexProgramSettings(multiplexProgramSettings: IResolvable)

    public fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
    public
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit)

    public fun packetIdentifiersMap(packetIdentifiersMap: IResolvable)

    public
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
    public
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit)

    public fun pipelineDetails(pipelineDetails: IResolvable)

    public fun pipelineDetails(pipelineDetails: List<Any>)

    public fun pipelineDetails(vararg pipelineDetails: Any)

    public fun preferredChannelPipeline(preferredChannelPipeline: String)

    public fun programName(programName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder =
        software.amazon.awscdk.services.medialive.CfnMultiplexprogram.Builder.create(scope, id)

    override fun channelId(channelId: String) {
      cdkBuilder.channelId(channelId)
    }

    override fun multiplexId(multiplexId: String) {
      cdkBuilder.multiplexId(multiplexId)
    }

    override fun multiplexProgramSettings(multiplexProgramSettings: IResolvable) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(IResolvable::unwrap))
    }

    override
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty) {
      cdkBuilder.multiplexProgramSettings(multiplexProgramSettings.let(MultiplexProgramSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be93b333b9815f74414662d77a433705c08246870a2a935d82e52c2097eacd1c")
    override
        fun multiplexProgramSettings(multiplexProgramSettings: MultiplexProgramSettingsProperty.Builder.() -> Unit):
        Unit = multiplexProgramSettings(MultiplexProgramSettingsProperty(multiplexProgramSettings))

    override fun packetIdentifiersMap(packetIdentifiersMap: IResolvable) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(IResolvable::unwrap))
    }

    override
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty) {
      cdkBuilder.packetIdentifiersMap(packetIdentifiersMap.let(MultiplexProgramPacketIdentifiersMapProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fb6bbfbb5908fdf91f3af347ef99f65c1840e420d10eb6be3388a404b36e0fd")
    override
        fun packetIdentifiersMap(packetIdentifiersMap: MultiplexProgramPacketIdentifiersMapProperty.Builder.() -> Unit):
        Unit =
        packetIdentifiersMap(MultiplexProgramPacketIdentifiersMapProperty(packetIdentifiersMap))

    override fun pipelineDetails(pipelineDetails: IResolvable) {
      cdkBuilder.pipelineDetails(pipelineDetails.let(IResolvable::unwrap))
    }

    override fun pipelineDetails(pipelineDetails: List<Any>) {
      cdkBuilder.pipelineDetails(pipelineDetails)
    }

    override fun pipelineDetails(vararg pipelineDetails: Any): Unit =
        pipelineDetails(pipelineDetails.toList())

    override fun preferredChannelPipeline(preferredChannelPipeline: String) {
      cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
    }

    override fun programName(programName: String) {
      cdkBuilder.programName(programName)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnMultiplexprogram =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnMultiplexprogram.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun audioPids(audioPids: IResolvable)

      public fun audioPids(audioPids: List<Number>)

      public fun audioPids(vararg audioPids: Number)

      public fun dvbSubPids(dvbSubPids: IResolvable)

      public fun dvbSubPids(dvbSubPids: List<Number>)

      public fun dvbSubPids(vararg dvbSubPids: Number)

      public fun dvbTeletextPid(dvbTeletextPid: Number)

      public fun etvPlatformPid(etvPlatformPid: Number)

      public fun etvSignalPid(etvSignalPid: Number)

      public fun klvDataPids(klvDataPids: IResolvable)

      public fun klvDataPids(klvDataPids: List<Number>)

      public fun klvDataPids(vararg klvDataPids: Number)

      public fun pcrPid(pcrPid: Number)

      public fun pmtPid(pmtPid: Number)

      public fun privateMetadataPid(privateMetadataPid: Number)

      public fun scte27Pids(scte27Pids: IResolvable)

      public fun scte27Pids(scte27Pids: List<Number>)

      public fun scte27Pids(vararg scte27Pids: Number)

      public fun scte35Pid(scte35Pid: Number)

      public fun timedMetadataPid(timedMetadataPid: Number)

      public fun videoPid(videoPid: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty.builder()

      override fun audioPids(audioPids: IResolvable) {
        cdkBuilder.audioPids(audioPids.let(IResolvable::unwrap))
      }

      override fun audioPids(audioPids: List<Number>) {
        cdkBuilder.audioPids(audioPids)
      }

      override fun audioPids(vararg audioPids: Number): Unit = audioPids(audioPids.toList())

      override fun dvbSubPids(dvbSubPids: IResolvable) {
        cdkBuilder.dvbSubPids(dvbSubPids.let(IResolvable::unwrap))
      }

      override fun dvbSubPids(dvbSubPids: List<Number>) {
        cdkBuilder.dvbSubPids(dvbSubPids)
      }

      override fun dvbSubPids(vararg dvbSubPids: Number): Unit = dvbSubPids(dvbSubPids.toList())

      override fun dvbTeletextPid(dvbTeletextPid: Number) {
        cdkBuilder.dvbTeletextPid(dvbTeletextPid)
      }

      override fun etvPlatformPid(etvPlatformPid: Number) {
        cdkBuilder.etvPlatformPid(etvPlatformPid)
      }

      override fun etvSignalPid(etvSignalPid: Number) {
        cdkBuilder.etvSignalPid(etvSignalPid)
      }

      override fun klvDataPids(klvDataPids: IResolvable) {
        cdkBuilder.klvDataPids(klvDataPids.let(IResolvable::unwrap))
      }

      override fun klvDataPids(klvDataPids: List<Number>) {
        cdkBuilder.klvDataPids(klvDataPids)
      }

      override fun klvDataPids(vararg klvDataPids: Number): Unit = klvDataPids(klvDataPids.toList())

      override fun pcrPid(pcrPid: Number) {
        cdkBuilder.pcrPid(pcrPid)
      }

      override fun pmtPid(pmtPid: Number) {
        cdkBuilder.pmtPid(pmtPid)
      }

      override fun privateMetadataPid(privateMetadataPid: Number) {
        cdkBuilder.privateMetadataPid(privateMetadataPid)
      }

      override fun scte27Pids(scte27Pids: IResolvable) {
        cdkBuilder.scte27Pids(scte27Pids.let(IResolvable::unwrap))
      }

      override fun scte27Pids(scte27Pids: List<Number>) {
        cdkBuilder.scte27Pids(scte27Pids)
      }

      override fun scte27Pids(vararg scte27Pids: Number): Unit = scte27Pids(scte27Pids.toList())

      override fun scte35Pid(scte35Pid: Number) {
        cdkBuilder.scte35Pid(scte35Pid)
      }

      override fun timedMetadataPid(timedMetadataPid: Number) {
        cdkBuilder.timedMetadataPid(timedMetadataPid)
      }

      override fun videoPid(videoPid: Number) {
        cdkBuilder.videoPid(videoPid)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty,
    ) : CdkObject(cdkObject), MultiplexProgramPacketIdentifiersMapProperty {
      override fun audioPids(): Any? = unwrap(this).getAudioPids()

      override fun dvbSubPids(): Any? = unwrap(this).getDvbSubPids()

      override fun dvbTeletextPid(): Number? = unwrap(this).getDvbTeletextPid()

      override fun etvPlatformPid(): Number? = unwrap(this).getEtvPlatformPid()

      override fun etvSignalPid(): Number? = unwrap(this).getEtvSignalPid()

      override fun klvDataPids(): Any? = unwrap(this).getKlvDataPids()

      override fun pcrPid(): Number? = unwrap(this).getPcrPid()

      override fun pmtPid(): Number? = unwrap(this).getPmtPid()

      override fun privateMetadataPid(): Number? = unwrap(this).getPrivateMetadataPid()

      override fun scte27Pids(): Any? = unwrap(this).getScte27Pids()

      override fun scte35Pid(): Number? = unwrap(this).getScte35Pid()

      override fun timedMetadataPid(): Number? = unwrap(this).getTimedMetadataPid()

      override fun videoPid(): Number? = unwrap(this).getVideoPid()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPacketIdentifiersMapProperty
    }
  }

  public interface MultiplexProgramPipelineDetailProperty {
    public fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

    public fun pipelineId(): String? = unwrap(this).getPipelineId()

    @CdkDslMarker
    public interface Builder {
      public fun activeChannelPipeline(activeChannelPipeline: String)

      public fun pipelineId(pipelineId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty.builder()

      override fun activeChannelPipeline(activeChannelPipeline: String) {
        cdkBuilder.activeChannelPipeline(activeChannelPipeline)
      }

      override fun pipelineId(pipelineId: String) {
        cdkBuilder.pipelineId(pipelineId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty,
    ) : CdkObject(cdkObject), MultiplexProgramPipelineDetailProperty {
      override fun activeChannelPipeline(): String? = unwrap(this).getActiveChannelPipeline()

      override fun pipelineId(): String? = unwrap(this).getPipelineId()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramPipelineDetailProperty
    }
  }

  public interface MultiplexVideoSettingsProperty {
    public fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

    public fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()

    @CdkDslMarker
    public interface Builder {
      public fun constantBitrate(constantBitrate: Number)

      public fun statmuxSettings(statmuxSettings: IResolvable)

      public fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
      public
          fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty.builder()

      override fun constantBitrate(constantBitrate: Number) {
        cdkBuilder.constantBitrate(constantBitrate)
      }

      override fun statmuxSettings(statmuxSettings: IResolvable) {
        cdkBuilder.statmuxSettings(statmuxSettings.let(IResolvable::unwrap))
      }

      override fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty) {
        cdkBuilder.statmuxSettings(statmuxSettings.let(MultiplexStatmuxVideoSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ddc73ffa0466c7d988ca6e4e973c2f917fd50220bbadb87eb7cb973fb23a464")
      override
          fun statmuxSettings(statmuxSettings: MultiplexStatmuxVideoSettingsProperty.Builder.() -> Unit):
          Unit = statmuxSettings(MultiplexStatmuxVideoSettingsProperty(statmuxSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexVideoSettingsProperty {
      override fun constantBitrate(): Number? = unwrap(this).getConstantBitrate()

      override fun statmuxSettings(): Any? = unwrap(this).getStatmuxSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexVideoSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty):
          MultiplexVideoSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexVideoSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexVideoSettingsProperty
    }
  }

  public interface MultiplexProgramSettingsProperty {
    public fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

    public fun programNumber(): Number

    public fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

    public fun videoSettings(): Any? = unwrap(this).getVideoSettings()

    @CdkDslMarker
    public interface Builder {
      public fun preferredChannelPipeline(preferredChannelPipeline: String)

      public fun programNumber(programNumber: Number)

      public fun serviceDescriptor(serviceDescriptor: IResolvable)

      public fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
      public
          fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit)

      public fun videoSettings(videoSettings: IResolvable)

      public fun videoSettings(videoSettings: MultiplexVideoSettingsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
      public fun videoSettings(videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty.builder()

      override fun preferredChannelPipeline(preferredChannelPipeline: String) {
        cdkBuilder.preferredChannelPipeline(preferredChannelPipeline)
      }

      override fun programNumber(programNumber: Number) {
        cdkBuilder.programNumber(programNumber)
      }

      override fun serviceDescriptor(serviceDescriptor: IResolvable) {
        cdkBuilder.serviceDescriptor(serviceDescriptor.let(IResolvable::unwrap))
      }

      override fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty) {
        cdkBuilder.serviceDescriptor(serviceDescriptor.let(MultiplexProgramServiceDescriptorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a6e846fd554323f07f8275310eea9b910309617d1c8b914a665f964a6fc7f59")
      override
          fun serviceDescriptor(serviceDescriptor: MultiplexProgramServiceDescriptorProperty.Builder.() -> Unit):
          Unit = serviceDescriptor(MultiplexProgramServiceDescriptorProperty(serviceDescriptor))

      override fun videoSettings(videoSettings: IResolvable) {
        cdkBuilder.videoSettings(videoSettings.let(IResolvable::unwrap))
      }

      override fun videoSettings(videoSettings: MultiplexVideoSettingsProperty) {
        cdkBuilder.videoSettings(videoSettings.let(MultiplexVideoSettingsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70cbefc78833f7ffe5fb191287577c2b3a7c0588ffd239d944a6c3cf3749857c")
      override fun videoSettings(videoSettings: MultiplexVideoSettingsProperty.Builder.() -> Unit):
          Unit = videoSettings(MultiplexVideoSettingsProperty(videoSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexProgramSettingsProperty {
      override fun preferredChannelPipeline(): String? = unwrap(this).getPreferredChannelPipeline()

      override fun programNumber(): Number = unwrap(this).getProgramNumber()

      override fun serviceDescriptor(): Any? = unwrap(this).getServiceDescriptor()

      override fun videoSettings(): Any? = unwrap(this).getVideoSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MultiplexProgramSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty):
          MultiplexProgramSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultiplexProgramSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramSettingsProperty
    }
  }

  public interface MultiplexStatmuxVideoSettingsProperty {
    public fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

    public fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

    public fun priority(): Number? = unwrap(this).getPriority()

    @CdkDslMarker
    public interface Builder {
      public fun maximumBitrate(maximumBitrate: Number)

      public fun minimumBitrate(minimumBitrate: Number)

      public fun priority(priority: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty.builder()

      override fun maximumBitrate(maximumBitrate: Number) {
        cdkBuilder.maximumBitrate(maximumBitrate)
      }

      override fun minimumBitrate(minimumBitrate: Number) {
        cdkBuilder.minimumBitrate(minimumBitrate)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty,
    ) : CdkObject(cdkObject), MultiplexStatmuxVideoSettingsProperty {
      override fun maximumBitrate(): Number? = unwrap(this).getMaximumBitrate()

      override fun minimumBitrate(): Number? = unwrap(this).getMinimumBitrate()

      override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
    }
  }

  public interface MultiplexProgramServiceDescriptorProperty {
    public fun providerName(): String

    public fun serviceName(): String

    @CdkDslMarker
    public interface Builder {
      public fun providerName(providerName: String)

      public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty.builder()

      override fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
      }

      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty,
    ) : CdkObject(cdkObject), MultiplexProgramServiceDescriptorProperty {
      override fun providerName(): String = unwrap(this).getProviderName()

      override fun serviceName(): String = unwrap(this).getServiceName()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnMultiplexprogram.MultiplexProgramServiceDescriptorProperty
    }
  }
}
