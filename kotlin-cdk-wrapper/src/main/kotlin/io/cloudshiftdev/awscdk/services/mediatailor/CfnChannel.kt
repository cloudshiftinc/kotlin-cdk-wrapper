@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The configuration parameters for a channel.
 *
 * For information about MediaTailor channels, see [Working with
 * channels](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html) in the
 * *MediaTailor User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
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
public open class CfnChannel(
  cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps,
  ) :
      this(software.amazon.awscdk.services.mediatailor.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelProps(props)
  )

  /**
   * The ARN of the channel.</p>.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The list of audiences defined in channel.
   */
  public open fun audiences(): List<String> = unwrap(this).getAudiences() ?: emptyList()

  /**
   * The list of audiences defined in channel.
   */
  public open fun audiences(`value`: List<String>) {
    unwrap(this).setAudiences(`value`)
  }

  /**
   * The list of audiences defined in channel.
   */
  public open fun audiences(vararg `value`: String): Unit = audiences(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the channel.
   */
  public open fun channelName(): String = unwrap(this).getChannelName()

  /**
   * The name of the channel.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * The slate used to fill gaps between programs in the schedule.
   */
  public open fun fillerSlate(): Any? = unwrap(this).getFillerSlate()

  /**
   * The slate used to fill gaps between programs in the schedule.
   */
  public open fun fillerSlate(`value`: IResolvable) {
    unwrap(this).setFillerSlate(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The slate used to fill gaps between programs in the schedule.
   */
  public open fun fillerSlate(`value`: SlateSourceProperty) {
    unwrap(this).setFillerSlate(`value`.let(SlateSourceProperty.Companion::unwrap))
  }

  /**
   * The slate used to fill gaps between programs in the schedule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7bc76d039987a0d9ac04c0752dbe7f3ea033c86dbddbf5126429d9d062adb4d1")
  public open fun fillerSlate(`value`: SlateSourceProperty.Builder.() -> Unit): Unit =
      fillerSlate(SlateSourceProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The log configuration.
   */
  public open fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

  /**
   * The log configuration.
   */
  public open fun logConfiguration(`value`: IResolvable) {
    unwrap(this).setLogConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The log configuration.
   */
  public open fun logConfiguration(`value`: LogConfigurationForChannelProperty) {
    unwrap(this).setLogConfiguration(`value`.let(LogConfigurationForChannelProperty.Companion::unwrap))
  }

  /**
   * The log configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2197d13de28944ab6ddec1cd9bce556edf6c040556e5325b6b612e218f491670")
  public open fun logConfiguration(`value`: LogConfigurationForChannelProperty.Builder.() -> Unit):
      Unit = logConfiguration(LogConfigurationForChannelProperty(`value`))

  /**
   * The channel's output properties.
   */
  public open fun outputs(): Any = unwrap(this).getOutputs()

  /**
   * The channel's output properties.
   */
  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The channel's output properties.
   */
  public open fun outputs(`value`: List<Any>) {
    unwrap(this).setOutputs(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The channel's output properties.
   */
  public open fun outputs(vararg `value`: Any): Unit = outputs(`value`.toList())

  /**
   * The type of playback mode for this channel.
   */
  public open fun playbackMode(): String = unwrap(this).getPlaybackMode()

  /**
   * The type of playback mode for this channel.
   */
  public open fun playbackMode(`value`: String) {
    unwrap(this).setPlaybackMode(`value`)
  }

  /**
   * The tags to assign to the channel.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to assign to the channel.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to assign to the channel.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The tier for this channel.
   */
  public open fun tier(): String? = unwrap(this).getTier()

  /**
   * The tier for this channel.
   */
  public open fun tier(`value`: String) {
    unwrap(this).setTier(`value`)
  }

  /**
   * The configuration for time-shifted viewing.
   */
  public open fun timeShiftConfiguration(): Any? = unwrap(this).getTimeShiftConfiguration()

  /**
   * The configuration for time-shifted viewing.
   */
  public open fun timeShiftConfiguration(`value`: IResolvable) {
    unwrap(this).setTimeShiftConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for time-shifted viewing.
   */
  public open fun timeShiftConfiguration(`value`: TimeShiftConfigurationProperty) {
    unwrap(this).setTimeShiftConfiguration(`value`.let(TimeShiftConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration for time-shifted viewing.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed05ba9d5ea56df03ba4e2b4484a74f1178ebccbfff9a1947441a82a3a522603")
  public open
      fun timeShiftConfiguration(`value`: TimeShiftConfigurationProperty.Builder.() -> Unit): Unit =
      timeShiftConfiguration(TimeShiftConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediatailor.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of audiences defined in channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
     * @param audiences The list of audiences defined in channel. 
     */
    public fun audiences(audiences: List<String>)

    /**
     * The list of audiences defined in channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
     * @param audiences The list of audiences defined in channel. 
     */
    public fun audiences(vararg audiences: String)

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
     * @param channelName The name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    public fun fillerSlate(fillerSlate: IResolvable)

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    public fun fillerSlate(fillerSlate: SlateSourceProperty)

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc15b775dcda1f69f258cd144d43b770592da7ee3b924c346b59f344eb6fe9dd")
    public fun fillerSlate(fillerSlate: SlateSourceProperty.Builder.() -> Unit)

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    public fun logConfiguration(logConfiguration: IResolvable)

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    public fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty)

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94949cb391a71a94dd70b8af0b88f622a6f1eebba3e9fcf8a4b988a3c3fcc69d")
    public
        fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty.Builder.() -> Unit)

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    public fun outputs(outputs: IResolvable)

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    public fun outputs(outputs: List<Any>)

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    public fun outputs(vararg outputs: Any)

    /**
     * The type of playback mode for this channel.
     *
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
     * @param playbackMode The type of playback mode for this channel. 
     */
    public fun playbackMode(playbackMode: String)

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The tier for this channel.
     *
     * STANDARD tier channels can contain live programs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
     * @param tier The tier for this channel. 
     */
    public fun tier(tier: String)

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    public fun timeShiftConfiguration(timeShiftConfiguration: IResolvable)

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    public fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty)

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379d6e486ade6dcc94011afd8012251d9b7f6e360478a5a4b0add39a85684605")
    public
        fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnChannel.Builder =
        software.amazon.awscdk.services.mediatailor.CfnChannel.Builder.create(scope, id)

    /**
     * The list of audiences defined in channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
     * @param audiences The list of audiences defined in channel. 
     */
    override fun audiences(audiences: List<String>) {
      cdkBuilder.audiences(audiences)
    }

    /**
     * The list of audiences defined in channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-audiences)
     * @param audiences The list of audiences defined in channel. 
     */
    override fun audiences(vararg audiences: String): Unit = audiences(audiences.toList())

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
     * @param channelName The name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    override fun fillerSlate(fillerSlate: IResolvable) {
      cdkBuilder.fillerSlate(fillerSlate.let(IResolvable.Companion::unwrap))
    }

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    override fun fillerSlate(fillerSlate: SlateSourceProperty) {
      cdkBuilder.fillerSlate(fillerSlate.let(SlateSourceProperty.Companion::unwrap))
    }

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     * @param fillerSlate The slate used to fill gaps between programs in the schedule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc15b775dcda1f69f258cd144d43b770592da7ee3b924c346b59f344eb6fe9dd")
    override fun fillerSlate(fillerSlate: SlateSourceProperty.Builder.() -> Unit): Unit =
        fillerSlate(SlateSourceProperty(fillerSlate))

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    override fun logConfiguration(logConfiguration: IResolvable) {
      cdkBuilder.logConfiguration(logConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    override fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty) {
      cdkBuilder.logConfiguration(logConfiguration.let(LogConfigurationForChannelProperty.Companion::unwrap))
    }

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     * @param logConfiguration The log configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94949cb391a71a94dd70b8af0b88f622a6f1eebba3e9fcf8a4b988a3c3fcc69d")
    override
        fun logConfiguration(logConfiguration: LogConfigurationForChannelProperty.Builder.() -> Unit):
        Unit = logConfiguration(LogConfigurationForChannelProperty(logConfiguration))

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     * @param outputs The channel's output properties. 
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * The type of playback mode for this channel.
     *
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
     * @param playbackMode The type of playback mode for this channel. 
     */
    override fun playbackMode(playbackMode: String) {
      cdkBuilder.playbackMode(playbackMode)
    }

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The tier for this channel.
     *
     * STANDARD tier channels can contain live programs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
     * @param tier The tier for this channel. 
     */
    override fun tier(tier: String) {
      cdkBuilder.tier(tier)
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    override fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    override fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty) {
      cdkBuilder.timeShiftConfiguration(timeShiftConfiguration.let(TimeShiftConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     * @param timeShiftConfiguration The configuration for time-shifted viewing. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379d6e486ade6dcc94011afd8012251d9b7f6e360478a5a4b0add39a85684605")
    override
        fun timeShiftConfiguration(timeShiftConfiguration: TimeShiftConfigurationProperty.Builder.() -> Unit):
        Unit = timeShiftConfiguration(TimeShiftConfigurationProperty(timeShiftConfiguration))

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnChannel.CFN_RESOURCE_TYPE_NAME

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
        = wrapped.cdkObject as software.amazon.awscdk.services.mediatailor.CfnChannel
  }

  /**
   * Dash manifest configuration parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * DashPlaylistSettingsProperty dashPlaylistSettingsProperty =
   * DashPlaylistSettingsProperty.builder()
   * .manifestWindowSeconds(123)
   * .minBufferTimeSeconds(123)
   * .minUpdatePeriodSeconds(123)
   * .suggestedPresentationDelaySeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html)
   */
  public interface DashPlaylistSettingsProperty {
    /**
     * The total duration (in seconds) of each manifest.
     *
     * Minimum value: `30` seconds. Maximum value: `3600` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * Minimum amount of content (measured in seconds) that a player must keep available in the
     * buffer.
     *
     * Minimum value: `2` seconds. Maximum value: `60` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-minbuffertimeseconds)
     */
    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    /**
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to
     * the manifest.
     *
     * Minimum value: `2` seconds. Maximum value: `60` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-minupdateperiodseconds)
     */
    public fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

    /**
     * Amount of time (in seconds) that the player should be from the live point at the end of the
     * manifest.
     *
     * Minimum value: `2` seconds. Maximum value: `60` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-suggestedpresentationdelayseconds)
     */
    public fun suggestedPresentationDelaySeconds(): Number? =
        unwrap(this).getSuggestedPresentationDelaySeconds()

    /**
     * A builder for [DashPlaylistSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param manifestWindowSeconds The total duration (in seconds) of each manifest.
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number)

      /**
       * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
       * be from the live point at the end of the manifest.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty.builder()

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of each manifest.
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      /**
       * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
       * be from the live point at the end of the manifest.
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       */
      override fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty,
    ) : CdkObject(cdkObject),
        DashPlaylistSettingsProperty {
      /**
       * The total duration (in seconds) of each manifest.
       *
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * Minimum amount of content (measured in seconds) that a player must keep available in the
       * buffer.
       *
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-minbuffertimeseconds)
       */
      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      /**
       * Minimum amount of time (in seconds) that the player should wait before requesting updates
       * to the manifest.
       *
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-minupdateperiodseconds)
       */
      override fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

      /**
       * Amount of time (in seconds) that the player should be from the live point at the end of the
       * manifest.
       *
       * Minimum value: `2` seconds. Maximum value: `60` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html#cfn-mediatailor-channel-dashplaylistsettings-suggestedpresentationdelayseconds)
       */
      override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashPlaylistSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty):
          DashPlaylistSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DashPlaylistSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPlaylistSettingsProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.DashPlaylistSettingsProperty
    }
  }

  /**
   * HLS playlist configuration parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * HlsPlaylistSettingsProperty hlsPlaylistSettingsProperty = HlsPlaylistSettingsProperty.builder()
   * .adMarkupType(List.of("adMarkupType"))
   * .manifestWindowSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html)
   */
  public interface HlsPlaylistSettingsProperty {
    /**
     * Determines the type of SCTE 35 tags to use in ad markup.
     *
     * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
     * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html#cfn-mediatailor-channel-hlsplaylistsettings-admarkuptype)
     */
    public fun adMarkupType(): List<String> = unwrap(this).getAdMarkupType() ?: emptyList()

    /**
     * The total duration (in seconds) of each manifest.
     *
     * Minimum value: `30` seconds. Maximum value: `3600` seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html#cfn-mediatailor-channel-hlsplaylistsettings-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * A builder for [HlsPlaylistSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup.
       * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
       * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
       */
      public fun adMarkupType(adMarkupType: List<String>)

      /**
       * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup.
       * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
       * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
       */
      public fun adMarkupType(vararg adMarkupType: String)

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of each manifest.
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty.builder()

      /**
       * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup.
       * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
       * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
       */
      override fun adMarkupType(adMarkupType: List<String>) {
        cdkBuilder.adMarkupType(adMarkupType)
      }

      /**
       * @param adMarkupType Determines the type of SCTE 35 tags to use in ad markup.
       * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
       * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
       */
      override fun adMarkupType(vararg adMarkupType: String): Unit =
          adMarkupType(adMarkupType.toList())

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of each manifest.
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty,
    ) : CdkObject(cdkObject),
        HlsPlaylistSettingsProperty {
      /**
       * Determines the type of SCTE 35 tags to use in ad markup.
       *
       * Specify `DATERANGE` to use `DATERANGE` tags (for live or VOD content). Specify
       * `SCTE35_ENHANCED` to use `EXT-X-CUE-OUT` and `EXT-X-CUE-IN` tags (for VOD content only).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html#cfn-mediatailor-channel-hlsplaylistsettings-admarkuptype)
       */
      override fun adMarkupType(): List<String> = unwrap(this).getAdMarkupType() ?: emptyList()

      /**
       * The total duration (in seconds) of each manifest.
       *
       * Minimum value: `30` seconds. Maximum value: `3600` seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html#cfn-mediatailor-channel-hlsplaylistsettings-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPlaylistSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty):
          HlsPlaylistSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HlsPlaylistSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPlaylistSettingsProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.HlsPlaylistSettingsProperty
    }
  }

  /**
   * The log configuration for the channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * LogConfigurationForChannelProperty logConfigurationForChannelProperty =
   * LogConfigurationForChannelProperty.builder()
   * .logTypes(List.of("logTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-logconfigurationforchannel.html)
   */
  public interface LogConfigurationForChannelProperty {
    /**
     * The log types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-logconfigurationforchannel.html#cfn-mediatailor-channel-logconfigurationforchannel-logtypes)
     */
    public fun logTypes(): List<String> = unwrap(this).getLogTypes() ?: emptyList()

    /**
     * A builder for [LogConfigurationForChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logTypes The log types.
       */
      public fun logTypes(logTypes: List<String>)

      /**
       * @param logTypes The log types.
       */
      public fun logTypes(vararg logTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty.builder()

      /**
       * @param logTypes The log types.
       */
      override fun logTypes(logTypes: List<String>) {
        cdkBuilder.logTypes(logTypes)
      }

      /**
       * @param logTypes The log types.
       */
      override fun logTypes(vararg logTypes: String): Unit = logTypes(logTypes.toList())

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty,
    ) : CdkObject(cdkObject),
        LogConfigurationForChannelProperty {
      /**
       * The log types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-logconfigurationforchannel.html#cfn-mediatailor-channel-logconfigurationforchannel-logtypes)
       */
      override fun logTypes(): List<String> = unwrap(this).getLogTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LogConfigurationForChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty):
          LogConfigurationForChannelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogConfigurationForChannelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationForChannelProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.LogConfigurationForChannelProperty
    }
  }

  /**
   * The output configuration for this channel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * RequestOutputItemProperty requestOutputItemProperty = RequestOutputItemProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html)
   */
  public interface RequestOutputItemProperty {
    /**
     * DASH manifest configuration parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-dashplaylistsettings)
     */
    public fun dashPlaylistSettings(): Any? = unwrap(this).getDashPlaylistSettings()

    /**
     * HLS playlist configuration parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-hlsplaylistsettings)
     */
    public fun hlsPlaylistSettings(): Any? = unwrap(this).getHlsPlaylistSettings()

    /**
     * The name of the manifest for the channel.
     *
     * The name appears in the `PlaybackUrl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-manifestname)
     */
    public fun manifestName(): String

    /**
     * A string used to match which `HttpPackageConfiguration` is used for each `VodSource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-sourcegroup)
     */
    public fun sourceGroup(): String

    /**
     * A builder for [RequestOutputItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      public fun dashPlaylistSettings(dashPlaylistSettings: IResolvable)

      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      public fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty)

      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7a7710c565431f307a58d27f8ce88a64ad27492db8239912d9a637e74265fe0")
      public
          fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty.Builder.() -> Unit)

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      public fun hlsPlaylistSettings(hlsPlaylistSettings: IResolvable)

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      public fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty)

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cf35f7d5127c92b88381658a8f5a573c1972c7ba3540a432e108990d3915006")
      public
          fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty.Builder.() -> Unit)

      /**
       * @param manifestName The name of the manifest for the channel. 
       * The name appears in the `PlaybackUrl` .
       */
      public fun manifestName(manifestName: String)

      /**
       * @param sourceGroup A string used to match which `HttpPackageConfiguration` is used for each
       * `VodSource` . 
       */
      public fun sourceGroup(sourceGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty.Builder =
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty.builder()

      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      override fun dashPlaylistSettings(dashPlaylistSettings: IResolvable) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      override fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings.let(DashPlaylistSettingsProperty.Companion::unwrap))
      }

      /**
       * @param dashPlaylistSettings DASH manifest configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7a7710c565431f307a58d27f8ce88a64ad27492db8239912d9a637e74265fe0")
      override
          fun dashPlaylistSettings(dashPlaylistSettings: DashPlaylistSettingsProperty.Builder.() -> Unit):
          Unit = dashPlaylistSettings(DashPlaylistSettingsProperty(dashPlaylistSettings))

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      override fun hlsPlaylistSettings(hlsPlaylistSettings: IResolvable) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      override fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings.let(HlsPlaylistSettingsProperty.Companion::unwrap))
      }

      /**
       * @param hlsPlaylistSettings HLS playlist configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4cf35f7d5127c92b88381658a8f5a573c1972c7ba3540a432e108990d3915006")
      override
          fun hlsPlaylistSettings(hlsPlaylistSettings: HlsPlaylistSettingsProperty.Builder.() -> Unit):
          Unit = hlsPlaylistSettings(HlsPlaylistSettingsProperty(hlsPlaylistSettings))

      /**
       * @param manifestName The name of the manifest for the channel. 
       * The name appears in the `PlaybackUrl` .
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param sourceGroup A string used to match which `HttpPackageConfiguration` is used for each
       * `VodSource` . 
       */
      override fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty,
    ) : CdkObject(cdkObject),
        RequestOutputItemProperty {
      /**
       * DASH manifest configuration parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-dashplaylistsettings)
       */
      override fun dashPlaylistSettings(): Any? = unwrap(this).getDashPlaylistSettings()

      /**
       * HLS playlist configuration parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-hlsplaylistsettings)
       */
      override fun hlsPlaylistSettings(): Any? = unwrap(this).getHlsPlaylistSettings()

      /**
       * The name of the manifest for the channel.
       *
       * The name appears in the `PlaybackUrl` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-manifestname)
       */
      override fun manifestName(): String = unwrap(this).getManifestName()

      /**
       * A string used to match which `HttpPackageConfiguration` is used for each `VodSource` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html#cfn-mediatailor-channel-requestoutputitem-sourcegroup)
       */
      override fun sourceGroup(): String = unwrap(this).getSourceGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RequestOutputItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty):
          RequestOutputItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RequestOutputItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestOutputItemProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.RequestOutputItemProperty
    }
  }

  /**
   * Slate VOD source configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * SlateSourceProperty slateSourceProperty = SlateSourceProperty.builder()
   * .sourceLocationName("sourceLocationName")
   * .vodSourceName("vodSourceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html)
   */
  public interface SlateSourceProperty {
    /**
     * The name of the source location where the slate VOD source is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html#cfn-mediatailor-channel-slatesource-sourcelocationname)
     */
    public fun sourceLocationName(): String? = unwrap(this).getSourceLocationName()

    /**
     * The slate VOD source name.
     *
     * The VOD source must already exist in a source location before it can be used for slate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html#cfn-mediatailor-channel-slatesource-vodsourcename)
     */
    public fun vodSourceName(): String? = unwrap(this).getVodSourceName()

    /**
     * A builder for [SlateSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceLocationName The name of the source location where the slate VOD source is
       * stored.
       */
      public fun sourceLocationName(sourceLocationName: String)

      /**
       * @param vodSourceName The slate VOD source name.
       * The VOD source must already exist in a source location before it can be used for slate.
       */
      public fun vodSourceName(vodSourceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty.Builder =
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty.builder()

      /**
       * @param sourceLocationName The name of the source location where the slate VOD source is
       * stored.
       */
      override fun sourceLocationName(sourceLocationName: String) {
        cdkBuilder.sourceLocationName(sourceLocationName)
      }

      /**
       * @param vodSourceName The slate VOD source name.
       * The VOD source must already exist in a source location before it can be used for slate.
       */
      override fun vodSourceName(vodSourceName: String) {
        cdkBuilder.vodSourceName(vodSourceName)
      }

      public fun build(): software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty,
    ) : CdkObject(cdkObject),
        SlateSourceProperty {
      /**
       * The name of the source location where the slate VOD source is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html#cfn-mediatailor-channel-slatesource-sourcelocationname)
       */
      override fun sourceLocationName(): String? = unwrap(this).getSourceLocationName()

      /**
       * The slate VOD source name.
       *
       * The VOD source must already exist in a source location before it can be used for slate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html#cfn-mediatailor-channel-slatesource-vodsourcename)
       */
      override fun vodSourceName(): String? = unwrap(this).getVodSourceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SlateSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty):
          SlateSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SlateSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SlateSourceProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.SlateSourceProperty
    }
  }

  /**
   * The configuration for time-shifted viewing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * TimeShiftConfigurationProperty timeShiftConfigurationProperty =
   * TimeShiftConfigurationProperty.builder()
   * .maxTimeDelaySeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-timeshiftconfiguration.html)
   */
  public interface TimeShiftConfigurationProperty {
    /**
     * The maximum time delay for time-shifted viewing.
     *
     * The minimum allowed maximum time delay is 0 seconds, and the maximum allowed maximum time
     * delay is 21600 seconds (6 hours).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-timeshiftconfiguration.html#cfn-mediatailor-channel-timeshiftconfiguration-maxtimedelayseconds)
     */
    public fun maxTimeDelaySeconds(): Number

    /**
     * A builder for [TimeShiftConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxTimeDelaySeconds The maximum time delay for time-shifted viewing. 
       * The minimum allowed maximum time delay is 0 seconds, and the maximum allowed maximum time
       * delay is 21600 seconds (6 hours).
       */
      public fun maxTimeDelaySeconds(maxTimeDelaySeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty.builder()

      /**
       * @param maxTimeDelaySeconds The maximum time delay for time-shifted viewing. 
       * The minimum allowed maximum time delay is 0 seconds, and the maximum allowed maximum time
       * delay is 21600 seconds (6 hours).
       */
      override fun maxTimeDelaySeconds(maxTimeDelaySeconds: Number) {
        cdkBuilder.maxTimeDelaySeconds(maxTimeDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty,
    ) : CdkObject(cdkObject),
        TimeShiftConfigurationProperty {
      /**
       * The maximum time delay for time-shifted viewing.
       *
       * The minimum allowed maximum time delay is 0 seconds, and the maximum allowed maximum time
       * delay is 21600 seconds (6 hours).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-timeshiftconfiguration.html#cfn-mediatailor-channel-timeshiftconfiguration-maxtimedelayseconds)
       */
      override fun maxTimeDelaySeconds(): Number = unwrap(this).getMaxTimeDelaySeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimeShiftConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty):
          TimeShiftConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimeShiftConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimeShiftConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnChannel.TimeShiftConfigurationProperty
    }
  }
}
