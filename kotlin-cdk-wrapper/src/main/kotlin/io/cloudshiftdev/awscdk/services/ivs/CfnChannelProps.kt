@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
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
public interface CfnChannelProps {
  /**
   * Whether the channel is authorized.
   *
   * *Default* : `false`
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
   */
  public fun authorized(): Any? = unwrap(this).getAuthorized()

  /**
   * Whether the channel allows insecure RTMP ingest.
   *
   * *Default* : `false`
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
   */
  public fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Channel latency mode. Valid values:.
   *
   * * `NORMAL` : Use NORMAL to broadcast and deliver live video up to Full HD.
   * * `LOW` : Use LOW for near real-time interactions with viewers.
   *
   *
   * In the  console, `LOW` and `NORMAL` correspond to `Ultra-low` and `Standard` , respectively.
   *
   *
   * *Default* : `LOW`
   *
   * Default: - "LOW"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
   */
  public fun latencyMode(): String? = unwrap(this).getLatencyMode()

  /**
   * Channel name.
   *
   * Default: - "-"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An optional transcode preset for the channel.
   *
   * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
   * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
   * `STANDARD` ), `preset` is the empty string ("").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
   */
  public fun preset(): String? = unwrap(this).getPreset()

  /**
   * The ARN of a RecordingConfiguration resource.
   *
   * An empty string indicates that recording is disabled for the channel. A RecordingConfiguration
   * ARN indicates that recording is enabled using the specified recording configuration. See the
   * [RecordingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
   * resource for more information and an example.
   *
   * *Default* : "" (empty string, recording is disabled)
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
   */
  public fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The channel type, which determines the allowable resolution and bitrate.
   *
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
   *
   * Default: - "STANDARD"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorized Whether the channel is authorized.
     * *Default* : `false`
     */
    public fun authorized(authorized: Boolean)

    /**
     * @param authorized Whether the channel is authorized.
     * *Default* : `false`
     */
    public fun authorized(authorized: IResolvable)

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * *Default* : `false`
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * *Default* : `false`
     */
    public fun insecureIngest(insecureIngest: IResolvable)

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
    public fun latencyMode(latencyMode: String)

    /**
     * @param name Channel name.
     */
    public fun name(name: String)

    /**
     * @param preset An optional transcode preset for the channel.
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
     * `STANDARD` ), `preset` is the empty string ("").
     */
    public fun preset(preset: String)

    /**
     * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource.
     * An empty string indicates that recording is disabled for the channel. A
     * RecordingConfiguration ARN indicates that recording is enabled using the specified recording
     * configuration. See the
     * [RecordingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
     * resource for more information and an example.
     *
     * *Default* : "" (empty string, recording is disabled)
     */
    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The channel type, which determines the allowable resolution and bitrate.
     * *If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.* Valid values:
     *
     * * `STANDARD` : Video is transcoded: multiple qualities are generated from the original input
     * to automatically give viewers the best experience for their devices and network conditions.
     * Transcoding allows higher playback quality across a range of download speeds. Resolution can be
     * up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and
     * below; above that, audio is passed through.
     * * `BASIC` : Video is transmuxed: Amazon IVS delivers the original input to viewers. The
     * viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p
     * and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and
     * 1080p.
     * * `ADVANCED_SD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at SD quality (480p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     * * `ADVANCED_HD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at HD quality (720p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     *
     * Optional *transcode presets* (available for the `ADVANCED` types) allow you to trade off
     * available download bandwidth and video quality, to optimize the viewing experience. There are
     * two presets:
     *
     * * *Constrained bandwidth delivery* uses a lower bitrate for each quality level. Use it if you
     * have low download bandwidth and/or simple video content (e.g., talking heads)
     * * *Higher bandwidth delivery* uses a higher bitrate for each quality level. Use it if you
     * have high download bandwidth and/or complex video content (e.g., flashes and quick scene
     * changes).
     *
     * *Default* : `STANDARD`
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnChannelProps.Builder =
        software.amazon.awscdk.services.ivs.CfnChannelProps.builder()

    /**
     * @param authorized Whether the channel is authorized.
     * *Default* : `false`
     */
    override fun authorized(authorized: Boolean) {
      cdkBuilder.authorized(authorized)
    }

    /**
     * @param authorized Whether the channel is authorized.
     * *Default* : `false`
     */
    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * *Default* : `false`
     */
    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * *Default* : `false`
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable.Companion::unwrap))
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
    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    /**
     * @param name Channel name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param preset An optional transcode preset for the channel.
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
     * `STANDARD` ), `preset` is the empty string ("").
     */
    override fun preset(preset: String) {
      cdkBuilder.preset(preset)
    }

    /**
     * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource.
     * An empty string indicates that recording is disabled for the channel. A
     * RecordingConfiguration ARN indicates that recording is enabled using the specified recording
     * configuration. See the
     * [RecordingConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
     * resource for more information and an example.
     *
     * *Default* : "" (empty string, recording is disabled)
     */
    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The channel type, which determines the allowable resolution and bitrate.
     * *If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.* Valid values:
     *
     * * `STANDARD` : Video is transcoded: multiple qualities are generated from the original input
     * to automatically give viewers the best experience for their devices and network conditions.
     * Transcoding allows higher playback quality across a range of download speeds. Resolution can be
     * up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and
     * below; above that, audio is passed through.
     * * `BASIC` : Video is transmuxed: Amazon IVS delivers the original input to viewers. The
     * viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p
     * and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and
     * 1080p.
     * * `ADVANCED_SD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at SD quality (480p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     * * `ADVANCED_HD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at HD quality (720p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     *
     * Optional *transcode presets* (available for the `ADVANCED` types) allow you to trade off
     * available download bandwidth and video quality, to optimize the viewing experience. There are
     * two presets:
     *
     * * *Constrained bandwidth delivery* uses a lower bitrate for each quality level. Use it if you
     * have low download bandwidth and/or simple video content (e.g., talking heads)
     * * *Higher bandwidth delivery* uses a higher bitrate for each quality level. Use it if you
     * have high download bandwidth and/or complex video content (e.g., flashes and quick scene
     * changes).
     *
     * *Default* : `STANDARD`
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnChannelProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     */
    override fun authorized(): Any? = unwrap(this).getAuthorized()

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     */
    override fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

    /**
     * Channel latency mode. Valid values:.
     *
     * * `NORMAL` : Use NORMAL to broadcast and deliver live video up to Full HD.
     * * `LOW` : Use LOW for near real-time interactions with viewers.
     *
     *
     * In the  console, `LOW` and `NORMAL` correspond to `Ultra-low` and `Standard` , respectively.
     *
     *
     * *Default* : `LOW`
     *
     * Default: - "LOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
     */
    override fun latencyMode(): String? = unwrap(this).getLatencyMode()

    /**
     * Channel name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An optional transcode preset for the channel.
     *
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
     * `STANDARD` ), `preset` is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     */
    override fun preset(): String? = unwrap(this).getPreset()

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
     */
    override fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The channel type, which determines the allowable resolution and bitrate.
     *
     * *If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.* Valid values:
     *
     * * `STANDARD` : Video is transcoded: multiple qualities are generated from the original input
     * to automatically give viewers the best experience for their devices and network conditions.
     * Transcoding allows higher playback quality across a range of download speeds. Resolution can be
     * up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and
     * below; above that, audio is passed through.
     * * `BASIC` : Video is transmuxed: Amazon IVS delivers the original input to viewers. The
     * viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p
     * and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and
     * 1080p.
     * * `ADVANCED_SD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at SD quality (480p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     * * `ADVANCED_HD` : Video is transcoded; multiple qualities are generated from the original
     * input, to automatically give viewers the best experience for their devices and network
     * conditions. Input resolution can be up to 1080p and bitrate can be up to 8.5 Mbps; output is
     * capped at HD quality (720p). You can select an optional transcode preset (see below). Audio for
     * all renditions is transcoded, and an audio-only rendition is available.
     *
     * Optional *transcode presets* (available for the `ADVANCED` types) allow you to trade off
     * available download bandwidth and video quality, to optimize the viewing experience. There are
     * two presets:
     *
     * * *Constrained bandwidth delivery* uses a lower bitrate for each quality level. Use it if you
     * have low download bandwidth and/or simple video content (e.g., talking heads)
     * * *Higher bandwidth delivery* uses a higher bitrate for each quality level. Use it if you
     * have high download bandwidth and/or complex video content (e.g., flashes and quick scene
     * changes).
     *
     * *Default* : `STANDARD`
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-type)
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.ivs.CfnChannelProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ivs.CfnChannelProps
  }
}
