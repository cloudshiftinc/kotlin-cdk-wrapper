@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .channelName("channelName")
 * .outputs(List.of(RequestOutputItemProperty.builder()
 * .manifestName("manifestName")
 * .sourceGroup("sourceGroup")
 * // the properties below are optional
 * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .suggestedPresentationDelaySeconds(123)
 * .build())
 * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
 * .adMarkupType(List.of("adMarkupType"))
 * .manifestWindowSeconds(123)
 * .build())
 * .build()))
 * .playbackMode("playbackMode")
 * // the properties below are optional
 * .audiences(List.of("audiences"))
 * .fillerSlate(SlateSourceProperty.builder()
 * .sourceLocationName("sourceLocationName")
 * .vodSourceName("vodSourceName")
 * .build())
 * .logConfiguration(LogConfigurationForChannelProperty.builder()
 * .logTypes(List.of("logTypes"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tier("tier")
 * .timeShiftConfiguration(TimeShiftConfigurationProperty.builder()
 * .maxTimeDelaySeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html)
 */
public interface CfnChannelProps {
  /**
   * The list of audiences defined in channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
   */
  public fun audiences(): List<String> = unwrap(this).getAudiences() ?: emptyList()

  /**
   * The name of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
   */
  public fun channelName(): String

  /**
   * The slate used to fill gaps between programs in the schedule.
   *
   * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` . MediaTailor
   * doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
   */
  public fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

  /**
   * The log configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
   */
  public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The channel's output properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
   */
  public fun outputs(): Any

  /**
   * The type of playback mode for this channel.
   *
   * `LINEAR` - Programs play back-to-back only once.
   *
   * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
   * plays, playback loops back to the first program in the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
   */
  public fun playbackMode(): String

  /**
   * The tags to assign to the channel.
   *
   * Tags are key-value pairs that you can associate with Amazon resources to help with
   * organization, access control, and cost tracking. For more information, see [Tagging AWS Elemental
   * MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tier for this channel.
   *
   * STANDARD tier channels can contain live programs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
   */
  public fun tier(): String? = unwrap(this).getTier()

  /**
   * The configuration for time-shifted viewing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
   */
  public fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param audiences The list of audiences defined in channel.
     */
    public fun audiences(audiences: List<String>)

    /**
     * @param audiences The list of audiences defined in channel.
     */
    public fun audiences(vararg audiences: String)

    /**
     * @param channelName The name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    public fun fillerSlate(fillerSlate: IResolvable)

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty)

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3630406ac8daf209f49224ced0626b8e477ab1f8cf49b506554fb513039556e7")
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty.Builder.() -> Unit)

    /**
     * @param logConfiguration The log configuration.
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * @param logConfiguration The log configuration.
     */
    public fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty)

    /**
     * @param logConfiguration The log configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("912c5e8c0457d2a9c16a430b335d4ffb91b9b345b269159c812350456fd30518")
    public
        fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty.Builder.() -> Unit)

    /**
     * @param outputs The channel's output properties. 
     */
    public fun outputs(outputs: IResolvable)

    /**
     * @param outputs The channel's output properties. 
     */
    public fun outputs(outputs: List<Any>)

    /**
     * @param outputs The channel's output properties. 
     */
    public fun outputs(vararg outputs: Any)

    /**
     * @param playbackMode The type of playback mode for this channel. 
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     */
    public fun playbackMode(playbackMode: String)

    /**
     * @param tags The tags to assign to the channel.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the channel.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tier The tier for this channel.
     * STANDARD tier channels can contain live programs.
     */
    public fun tier(tier: String)

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    public fun timeShiftConfiguration(timeShiftConfiguration: IResolvable)

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    public
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty)

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f880b814fefcd9aff85728770f6112e76298f051e7c790acfefc3fdd99d296b")
    public
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannelProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannelProps.builder()

    /**
     * @param audiences The list of audiences defined in channel.
     */
    override fun audiences(audiences: List<String>) {
      cdkBuilder.audiences(audiences)
    }

    /**
     * @param audiences The list of audiences defined in channel.
     */
    override fun audiences(vararg audiences: String): Unit = audiences(audiences.toList())

    /**
     * @param channelName The name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    override fun fillerSlate(fillerSlate: IResolvable) {
      cdkBuilder.fillerSlate(fillerSlate.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    override fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty) {
      cdkBuilder.fillerSlate(fillerSlate.let(CfnChannel.SlateSourceProperty.Companion::unwrap))
    }

    /**
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3630406ac8daf209f49224ced0626b8e477ab1f8cf49b506554fb513039556e7")
    override fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty.Builder.() -> Unit): Unit =
        fillerSlate(CfnChannel.SlateSourceProperty(fillerSlate))

    /**
     * @param logConfiguration The log configuration.
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logConfiguration The log configuration.
     */
    override fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(CfnChannel.LogConfigurationForChannelProperty.Companion::unwrap))
    }

    /**
     * @param logConfiguration The log configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("912c5e8c0457d2a9c16a430b335d4ffb91b9b345b269159c812350456fd30518")
    override
        fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty.Builder.() -> Unit):
        Unit = logConfiguration(CfnChannel.LogConfigurationForChannelProperty(logConfiguration))

    /**
     * @param outputs The channel's output properties. 
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputs The channel's output properties. 
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param outputs The channel's output properties. 
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * @param playbackMode The type of playback mode for this channel. 
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     */
    override fun playbackMode(playbackMode: String) {
      cdkBuilder.playbackMode(playbackMode)
    }

    /**
     * @param tags The tags to assign to the channel.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to assign to the channel.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tier The tier for this channel.
     * STANDARD tier channels can contain live programs.
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    override fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    override
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(CfnChannel.TimeShiftConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f880b814fefcd9aff85728770f6112e76298f051e7c790acfefc3fdd99d296b")
    override
        fun timeShiftConfiguration(timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty.Builder.() -> Unit):
        Unit =
        timeShiftConfiguration(CfnChannel.TimeShiftConfigurationProperty(timeShiftConfiguration))

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelProps,
  ) : CdkObject(cdkObject),
      CfnChannelProps {
    /**
     * The list of audiences defined in channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
     */
    override fun audiences(): List<String> = unwrap(this).getAudiences() ?: emptyList()

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     */
    override fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     */
    override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     */
    override fun outputs(): Any = unwrap(this).getOutputs()

    /**
     * The type of playback mode for this channel.
     *
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
     */
    override fun playbackMode(): String = unwrap(this).getPlaybackMode()

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The tier for this channel.
     *
     * STANDARD tier channels can contain live programs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
     */
    override fun tier(): String? = unwrap(this).getTier()

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     */
    override fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.mediatailor.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnChannelProps
  }
}
