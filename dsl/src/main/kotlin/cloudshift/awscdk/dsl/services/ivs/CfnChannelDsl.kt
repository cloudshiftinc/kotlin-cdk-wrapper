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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnChannel
import software.constructs.Construct

/**
 * The `AWS::IVS::Channel` resource specifies an channel.
 *
 * A channel stores configuration information related to your live stream. For more information, see
 * [CreateChannel](https://docs.aws.amazon.com/ivs/latest/APIReference/API_CreateChannel.html) in
 * the *Amazon Interactive Video Service API Reference* .
 *
 * By default, the IVS API CreateChannel endpoint creates a stream key in addition to a channel. The
 * Channel resource *does not* create a stream key; to create a stream key, use the StreamKey
 * resource instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivs.*;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .authorized(false)
 * .insecureIngest(false)
 * .latencyMode("latencyMode")
 * .name("name")
 * .preset("preset")
 * .recordingConfigurationArn("recordingConfigurationArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html)
 */
@CdkDslMarker
public class CfnChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     *
     * @param authorized Whether the channel is authorized.
     */
    public fun authorized(authorized: Boolean) {
        cdkBuilder.authorized(authorized)
    }

    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     *
     * @param authorized Whether the channel is authorized.
     */
    public fun authorized(authorized: IResolvable) {
        cdkBuilder.authorized(authorized)
    }

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     *
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     */
    public fun insecureIngest(insecureIngest: Boolean) {
        cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     *
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     */
    public fun insecureIngest(insecureIngest: IResolvable) {
        cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * Channel latency mode. Valid values:.
     * * `NORMAL` : Use NORMAL to broadcast and deliver live video up to Full HD.
     * * `LOW` : Use LOW for near real-time interactions with viewers.
     *
     * In the console, `LOW` and `NORMAL` correspond to `Ultra-low` and `Standard` , respectively.
     *
     * *Default* : `LOW`
     *
     * Default: - "LOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
     *
     * @param latencyMode Channel latency mode. Valid values:.
     */
    public fun latencyMode(latencyMode: String) {
        cdkBuilder.latencyMode(latencyMode)
    }

    /**
     * Channel name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     *
     * @param name Channel name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * An optional transcode preset for the channel.
     *
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC`
     * and `STANDARD` ), `preset` is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     *
     * @param preset An optional transcode preset for the channel.
     */
    public fun preset(preset: String) {
        cdkBuilder.preset(preset)
    }

    /**
     * The ARN of a RecordingConfiguration resource.
     *
     * An empty string indicates that recording is disabled for the channel. A
     * RecordingConfiguration ARN indicates that recording is enabled using the specified recording
     * configuration. See the
     * [RecordingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
     * resource for more information and an example.
     *
     * *Default* : "" (empty string, recording is disabled)
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
     *
     * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource.
     */
    public fun recordingConfigurationArn(recordingConfigurationArn: String) {
        cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The channel type, which determines the allowable resolution and bitrate.
     *
     * *If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.* Valid values:
     * * `STANDARD` : Video is transcoded: multiple qualities are generated from the original input
     *   to automatically give viewers the best experience for their devices and network conditions.
     *   Transcoding allows higher playback quality across a range of download speeds. Resolution
     *   can be up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for
     *   renditions 360p and below; above that, audio is passed through.
     * * `BASIC` : Video is transmuxed: Amazon IVS delivers the original input to viewers. The
     *   viewer’s video-quality choice is limited to the original input. Resolution can be up to
     *   1080p and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between
     *   480p and 1080p.
     * * `ADVANCED_SD` : Video is transcoded; multiple qualities are generated from the original
     *   input, to automatically give viewers the best experience for their devices and network
     *   conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output
     *   is capped at SD quality (480p). You can select an optional transcode preset (see below).
     *   Audio for all renditions is transcoded, and an audio-only rendition is available.
     * * `ADVANCED_HD` : Video is transcoded; multiple qualities are generated from the original
     *   input, to automatically give viewers the best experience for their devices and network
     *   conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output
     *   is capped at HD quality (720p). You can select an optional transcode preset (see below).
     *   Audio for all renditions is transcoded, and an audio-only rendition is available.
     *
     * Optional *transcode presets* (available for the `ADVANCED` types) allow you to trade off
     * available download bandwidth and video quality, to optimize the viewing experience. There are
     * two presets:
     * * *Constrained bandwidth delivery* uses a lower bitrate for each quality level. Use it if you
     *   have low download bandwidth and/or simple video content (e.g., talking heads)
     * * *Higher bandwidth delivery* uses a higher bitrate for each quality level. Use it if you
     *   have high download bandwidth and/or complex video content (e.g., flashes and quick scene
     *   changes).
     *
     * *Default* : `STANDARD`
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-type)
     *
     * @param type The channel type, which determines the allowable resolution and bitrate.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnChannel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
