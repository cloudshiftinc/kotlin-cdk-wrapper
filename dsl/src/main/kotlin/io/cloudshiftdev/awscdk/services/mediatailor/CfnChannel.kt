package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun channelName(): String = unwrap(this).getChannelName()

  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  public open fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

  public open fun fillerSlate(`value`: IResolvable) {
    unwrap(this).setFillerSlate(`value`.let(IResolvable::unwrap))
  }

  public open fun fillerSlate(`value`: SlateSourceProperty) {
    unwrap(this).setFillerSlate(`value`.let(SlateSourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7bc76d039987a0d9ac04c0752dbe7f3ea033c86dbddbf5126429d9d062adb4d1")
  public open fun fillerSlate(`value`: SlateSourceProperty.Builder.() -> Unit): Unit =
      fillerSlate(SlateSourceProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfiguration(`value`: LogConfigurationForChannelProperty) {
    unwrap(this).setLogConfiguration(`value`.let(LogConfigurationForChannelProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2197d13de28944ab6ddec1cd9bce556edf6c040556e5325b6b612e218f491670")
  public open fun logConfiguration(`value`: LogConfigurationForChannelProperty.Builder.() -> Unit):
      Unit = logConfiguration(LogConfigurationForChannelProperty(`value`))

  public open fun outputs(): Any = unwrap(this).getOutputs()

  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable::unwrap))
  }

  public open fun outputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputs(__idx_ac66f0)
  }

  public open fun playbackMode(): String = unwrap(this).getPlaybackMode()

  public open fun playbackMode(`value`: String) {
    unwrap(this).setPlaybackMode(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tier(): String? = unwrap(this).getTier()

  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  public open fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()

  public open fun timeShiftConfiguration(`value`: IResolvable) {
    unwrap(this).setTimeShiftConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun timeShiftConfiguration(`value`: TimeShiftConfigurationProperty) {
    unwrap(this).setTimeShiftConfiguration(`value`.let(TimeShiftConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed05ba9d5ea56df03ba4e2b4484a74f1178ebccbfff9a1947441a82a3a522603")
  public open
      fun timeShiftConfiguration(`value`: TimeShiftConfigurationProperty.Builder.() -> Unit): Unit =
      timeShiftConfiguration(TimeShiftConfigurationProperty(`value`))

  public interface Builder {
    public fun channelName(channelName: String) {
    }

    public fun fillerSlate(fillerSlate: IResolvable) {
    }

    public fun fillerSlate(fillerSlate: SlateSourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc15b775dcda1f69f258cd144d43b770592da7ee3b924c346b59f344eb6fe9dd")
    public fun fillerSlate(fillerSlate: SlateSourceProperty.Builder.() -> Unit) {
    }

    public fun logConfiguration(logConfiguration: IResolvable) {
    }

    public fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94949cb391a71a94dd70b8af0b88f622a6f1eebba3e9fcf8a4b988a3c3fcc69d")
    public
        fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty.Builder.() -> Unit) {
    }

    public fun outputs(outputs: IResolvable) {
    }

    public fun outputs(outputs: List<Any>) {
    }

    public fun playbackMode(playbackMode: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun tier(tier: String) {
    }

    public fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
    }

    public fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379d6e486ade6dcc94011afd8012251d9b7f6e360478a5a4b0add39a85684605")
    public
        fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannel.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannel.Builder.create(scope, id)

    public override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    public override fun fillerSlate(fillerSlate: IResolvable) {
      cdkBuilder.fillerSlate(fillerSlate.let(IResolvable::unwrap))
    }

    public override fun fillerSlate(fillerSlate: SlateSourceProperty) {
      cdkBuilder.fillerSlate(fillerSlate.let(SlateSourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc15b775dcda1f69f258cd144d43b770592da7ee3b924c346b59f344eb6fe9dd")
    public override fun fillerSlate(fillerSlate: SlateSourceProperty.Builder.() -> Unit): Unit =
        fillerSlate(SlateSourceProperty(fillerSlate))

    public override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
    }

    public override fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationForChannelProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94949cb391a71a94dd70b8af0b88f622a6f1eebba3e9fcf8a4b988a3c3fcc69d")
    public override
        fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty.Builder.() -> Unit):
        Unit = logConfiguration(LogConfigurationForChannelProperty(logConfiguration))

    public override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    public override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    public override fun playbackMode(playbackMode: String) {
      cdkBuilder.playbackMode(playbackMode)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    public override fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(TimeShiftConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379d6e486ade6dcc94011afd8012251d9b7f6e360478a5a4b0add39a85684605")
    public override
        fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty.Builder.() -> Unit):
        Unit = timeShiftConfiguration(TimeShiftConfigurationProperty(timeShiftConfiguration))

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel): CfnChannel
        = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.mediatailor.CfnChannel
        = wrapped.cdkObject
  }

  public interface LogConfigurationForChannelProperty {
    public fun logTypes(): List<String> = unwrap(this).getLogTypes() ?: emptyList()

    public interface Builder {
      public fun logTypes(logTypes: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty.builder()

      public override fun logTypes(logTypes: List<String>) {
        cdkBuilder.logTypes(logTypes)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty,
    ) : LogConfigurationForChannelProperty {
      public override fun logTypes(): List<String> = unwrap(this).getLogTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LogConfigurationForChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty):
          LogConfigurationForChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationForChannelProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TimeShiftConfigurationProperty {
    public fun maxTimeDelaySeconds(): Number

    public interface Builder {
      public fun maxTimeDelaySeconds(maxTimeDelaySeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty.builder()

      public override fun maxTimeDelaySeconds(maxTimeDelaySeconds: Number) {
        cdkBuilder.maxTimeDelaySeconds(maxTimeDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty,
    ) : TimeShiftConfigurationProperty {
      public override fun maxTimeDelaySeconds(): Number = unwrap(this).getMaxTimeDelaySeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TimeShiftConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty):
          TimeShiftConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeShiftConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SlateSourceProperty {
    public fun sourceLocationName(): String? = unwrap(this).getSourceLocationName()

    public fun vodSourceName(): String? = unwrap(this).getVodSourceName()

    public interface Builder {
      public fun sourceLocationName(sourceLocationName: String) {
      }

      public fun vodSourceName(vodSourceName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty.Builder =
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty.builder()

      public override fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
      }

      public override fun vodSourceName(vodSourceName: String) {
        cdkBuilder.vodSourceName(vodSourceName)
      }

      public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty,
    ) : SlateSourceProperty {
      public override fun sourceLocationName(): String? = unwrap(this).getSourceLocationName()

      public override fun vodSourceName(): String? = unwrap(this).getVodSourceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SlateSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty):
          SlateSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlateSourceProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HlsPlaylistSettingsProperty {
    public fun adMarkupType(): List<String> = unwrap(this).getAdMarkupType() ?: emptyList()

    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public interface Builder {
      public fun adMarkupType(adMarkupType: List<String>) {
      }

      public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty.builder()

      public override fun adMarkupType(adMarkupType: List<String>) {
        cdkBuilder.adMarkupType(adMarkupType)
      }

      public override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty,
    ) : HlsPlaylistSettingsProperty {
      public override fun adMarkupType(): List<String> = unwrap(this).getAdMarkupType() ?:
          emptyList()

      public override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPlaylistSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty):
          HlsPlaylistSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPlaylistSettingsProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DashPlaylistSettingsProperty {
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    public fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

    public fun suggestedPresentationDelaySeconds(): Number? =
        unwrap(this).getSuggestedPresentationDelaySeconds()

    public interface Builder {
      public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
      }

      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
      }

      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
      }

      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty.builder()

      public override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      public override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      public override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      public override
          fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty,
    ) : DashPlaylistSettingsProperty {
      public override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      public override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      public override fun minUpdatePeriodSeconds(): Number? =
          unwrap(this).getMinUpdatePeriodSeconds()

      public override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DashPlaylistSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty):
          DashPlaylistSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPlaylistSettingsProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RequestOutputItemProperty {
    public fun dashPlaylistSettings(): Any? = unwrap(this).getDashPlaylistSettings()

    public fun hlsPlaylistSettings(): Any? = unwrap(this).getHlsPlaylistSettings()

    public fun manifestName(): String

    public fun sourceGroup(): String

    public interface Builder {
      public fun dashPlaylistSettings(dashPlaylistSettings: IResolvable) {
      }

      public fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7a7710c565431f307a58d27f8ce88a64ad27492db8239912d9a637e74265fe0")
      public
          fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty.Builder.() -> Unit) {
      }

      public fun hlsPlaylistSettings(hlsPlaylistSettings: IResolvable) {
      }

      public fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cf35f7d5127c92b88381658a8f5a573c1972c7ba3540a432e108990d3915006")
      public
          fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty.Builder.() -> Unit) {
      }

      public fun manifestName(manifestName: String) {
      }

      public fun sourceGroup(sourceGroup: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty.Builder =
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty.builder()

      public override fun dashPlaylistSettings(dashPlaylistSettings: IResolvable) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings.let(IResolvable::unwrap))
      }

      public override fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings.let(DashPlaylistSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7a7710c565431f307a58d27f8ce88a64ad27492db8239912d9a637e74265fe0")
      public override
          fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty.Builder.() -> Unit):
          Unit = dashPlaylistSettings(DashPlaylistSettingsProperty(dashPlaylistSettings))

      public override fun hlsPlaylistSettings(hlsPlaylistSettings: IResolvable) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings.let(IResolvable::unwrap))
      }

      public override fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings.let(HlsPlaylistSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cf35f7d5127c92b88381658a8f5a573c1972c7ba3540a432e108990d3915006")
      public override
          fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty.Builder.() -> Unit):
          Unit = hlsPlaylistSettings(HlsPlaylistSettingsProperty(hlsPlaylistSettings))

      public override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      public override fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty,
    ) : RequestOutputItemProperty {
      public override fun dashPlaylistSettings(): Any? = unwrap(this).getDashPlaylistSettings()

      public override fun hlsPlaylistSettings(): Any? = unwrap(this).getHlsPlaylistSettings()

      public override fun manifestName(): String = unwrap(this).getManifestName()

      public override fun sourceGroup(): String = unwrap(this).getSourceGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequestOutputItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty):
          RequestOutputItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestOutputItemProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
