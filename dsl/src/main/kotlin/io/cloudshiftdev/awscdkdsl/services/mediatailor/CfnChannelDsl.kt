@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnChannel
import software.constructs.Construct

/**
 * The configuration parameters for a channel.
 *
 * For information about MediaTailor channels, see
 * [Working with channels](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html)
 * in the *MediaTailor User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
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
@CdkDslMarker
public class CfnChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
     *
     * @param channelName The name of the channel.
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     *
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     */
    public fun fillerSlate(fillerSlate: IResolvable) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /**
     * The slate used to fill gaps between programs in the schedule.
     *
     * You must configure filler slate if your channel uses the `LINEAR` `PlaybackMode` .
     * MediaTailor doesn't support filler slate for channels using the `LOOP` `PlaybackMode` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     *
     * @param fillerSlate The slate used to fill gaps between programs in the schedule.
     */
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     *
     * @param logConfiguration The log configuration.
     */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The log configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     *
     * @param logConfiguration The log configuration.
     */
    public fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.
     */
    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.
     */
    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    /**
     * The channel's output properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.
     */
    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    /**
     * The type of playback mode for this channel.
     *
     * `LINEAR` - Programs play back-to-back only once.
     *
     * `LOOP` - Programs play back-to-back in an endless loop. When the last program in the schedule
     * plays, playback loops back to the first program in the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
     *
     * @param playbackMode The type of playback mode for this channel.
     */
    public fun playbackMode(playbackMode: String) {
        cdkBuilder.playbackMode(playbackMode)
    }

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     *
     * @param tags The tags to assign to the channel.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the channel.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     *
     * @param tags The tags to assign to the channel.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The tier for this channel.
     *
     * STANDARD tier channels can contain live programs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
     *
     * @param tier The tier for this channel.
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     *
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    public fun timeShiftConfiguration(timeShiftConfiguration: IResolvable) {
        cdkBuilder.timeShiftConfiguration(timeShiftConfiguration)
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-timeshiftconfiguration)
     *
     * @param timeShiftConfiguration The configuration for time-shifted viewing.
     */
    public fun timeShiftConfiguration(
        timeShiftConfiguration: CfnChannel.TimeShiftConfigurationProperty
    ) {
        cdkBuilder.timeShiftConfiguration(timeShiftConfiguration)
    }

    public fun build(): CfnChannel {
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
