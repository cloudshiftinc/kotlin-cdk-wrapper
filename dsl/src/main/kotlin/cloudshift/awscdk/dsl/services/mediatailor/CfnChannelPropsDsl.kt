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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnChannel
import software.amazon.awscdk.services.mediatailor.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html)
 */
@CdkDslMarker
public class CfnChannelPropsDsl {
    private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param channelName the value to be set. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /** @param fillerSlate Slate VOD source configuration.</p>. */
    public fun fillerSlate(fillerSlate: IResolvable) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /** @param fillerSlate Slate VOD source configuration.</p>. */
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /** @param logConfiguration The log configuration for the channel.</p>. */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /** @param logConfiguration The log configuration for the channel.</p>. */
    public fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /** @param outputs The channel's output properties.</p>. */
    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs The channel's output properties.</p>. */
    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    /** @param outputs The channel's output properties.</p>. */
    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    /** @param playbackMode the value to be set. */
    public fun playbackMode(playbackMode: String) {
        cdkBuilder.playbackMode(playbackMode)
    }

    /** @param tags The tags to assign to the channel. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the channel. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param tier the value to be set. */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    public fun build(): CfnChannelProps {
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
