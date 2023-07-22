@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.ivs.CfnChannelProps

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivs.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
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
public class CfnChannelPropsDsl {
  private val cdkBuilder: CfnChannelProps.Builder = CfnChannelProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param authorized Whether the channel is authorized.
   * *Default* : `false`
   */
  public fun authorized(authorized: Boolean) {
    cdkBuilder.authorized(authorized)
  }

  /**
   * @param authorized Whether the channel is authorized.
   * *Default* : `false`
   */
  public fun authorized(authorized: IResolvable) {
    cdkBuilder.authorized(authorized)
  }

  /**
   * @param insecureIngest Whether the channel allows insecure RTMP ingest.
   * *Default* : `false`
   */
  public fun insecureIngest(insecureIngest: Boolean) {
    cdkBuilder.insecureIngest(insecureIngest)
  }

  /**
   * @param insecureIngest Whether the channel allows insecure RTMP ingest.
   * *Default* : `false`
   */
  public fun insecureIngest(insecureIngest: IResolvable) {
    cdkBuilder.insecureIngest(insecureIngest)
  }

  /**
   * @param latencyMode Channel latency mode. Valid values:.
   * * `NORMAL` : Use NORMAL to broadcast and deliver live video up to Full HD.
   * * `LOW` : Use LOW for near real-time interactions with viewers.
   *
   *
   * In the  console, `LOW` and `NORMAL` correspond to `Ultra-low` and `Standard` , respectively.
   *
   *
   * *Default* : `LOW`
   */
  public fun latencyMode(latencyMode: String) {
    cdkBuilder.latencyMode(latencyMode)
  }

  /**
   * @param name Channel name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param preset An optional transcode preset for the channel.
   * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
   * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
   * `STANDARD` ), `preset` is the empty string ("").
   */
  public fun preset(preset: String) {
    cdkBuilder.preset(preset)
  }

  /**
   * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource.
   * An empty string indicates that recording is disabled for the channel. A RecordingConfiguration
   * ARN indicates that recording is enabled using the specified recording configuration. See the
   * [RecordingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
   * resource for more information and an example.
   *
   * *Default* : "" (empty string, recording is disabled)
   */
  public fun recordingConfigurationArn(recordingConfigurationArn: String) {
    cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param type The channel type, which determines the allowable resolution and bitrate.
   * *If you exceed the allowable resolution or bitrate, the stream probably will disconnect
   * immediately.* Valid values:
   *
   * * `STANDARD` : Video is transcoded: multiple qualities are generated from the original input to
   * automatically give viewers the best experience for their devices and network conditions.
   * Transcoding allows higher playback quality across a range of download speeds. Resolution can be up
   * to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and
   * below; above that, audio is passed through.
   * * `BASIC` : Video is transmuxed: Amazon IVS delivers the original input to viewers. The
   * viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p and
   * bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and 1080p.
   * * `ADVANCED_SD` : Video is transcoded; multiple qualities are generated from the original
   * input, to automatically give viewers the best experience for their devices and network conditions.
   * Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is capped at SD
   * quality (480p). You can select an optional transcode preset (see below). Audio for all renditions
   * is transcoded, and an audio-only rendition is available.
   * * `ADVANCED_HD` : Video is transcoded; multiple qualities are generated from the original
   * input, to automatically give viewers the best experience for their devices and network conditions.
   * Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is capped at HD
   * quality (720p). You can select an optional transcode preset (see below). Audio for all renditions
   * is transcoded, and an audio-only rendition is available.
   *
   * Optional *transcode presets* (available for the `ADVANCED` types) allow you to trade off
   * available download bandwidth and video quality, to optimize the viewing experience. There are two
   * presets:
   *
   * * *Constrained bandwidth delivery* uses a lower bitrate for each quality level. Use it if you
   * have low download bandwidth and/or simple video content (e.g., talking heads)
   * * *Higher bandwidth delivery* uses a higher bitrate for each quality level. Use it if you have
   * high download bandwidth and/or complex video content (e.g., flashes and quick scene changes).
   *
   * *Default* : `STANDARD`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnChannelProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
