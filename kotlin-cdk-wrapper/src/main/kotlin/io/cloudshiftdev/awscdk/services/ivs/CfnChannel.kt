@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::Channel` resource specifies an  channel.
 *
 * A channel stores configuration information related to your live stream. For more information, see
 * [CreateChannel](https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/API_CreateChannel.html)
 * in the *Amazon IVS Low-Latency Streaming API Reference* .
 *
 *
 * By default, the IVS API CreateChannel endpoint creates a stream key in addition to a channel. The
 *  Channel resource *does not* create a stream key; to create a stream key, use the StreamKey resource
 * instead.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
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
public open class CfnChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivs.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The channel ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:channel/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Channel ingest endpoint, part of the definition of an ingest server, used when you set up
   * streaming software.
   *
   * For example: `a1b2c3d4e5f6.global-contribute.live-video.net`
   */
  public open fun attrIngestEndpoint(): String = unwrap(this).getAttrIngestEndpoint()

  /**
   * Channel playback URL.
   *
   * For example:
   * `https://a1b2c3d4e5f6.us-west-2.playback.live-video.net/api/video/v1/us-west-2.123456789012.channel.abcdEFGH.m3u8`
   */
  public open fun attrPlaybackUrl(): String = unwrap(this).getAttrPlaybackUrl()

  /**
   * Whether the channel is authorized.
   */
  public open fun authorized(): Any? = unwrap(this).getAuthorized()

  /**
   * Whether the channel is authorized.
   */
  public open fun authorized(`value`: Boolean) {
    unwrap(this).setAuthorized(`value`)
  }

  /**
   * Whether the channel is authorized.
   */
  public open fun authorized(`value`: IResolvable) {
    unwrap(this).setAuthorized(`value`.let(IResolvable::unwrap))
  }

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(`value`: Boolean) {
    unwrap(this).setInsecureIngest(`value`)
  }

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(`value`: IResolvable) {
    unwrap(this).setInsecureIngest(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Channel latency mode.
   *
   * Valid values:.
   */
  public open fun latencyMode(): String? = unwrap(this).getLatencyMode()

  /**
   * Channel latency mode.
   *
   * Valid values:.
   */
  public open fun latencyMode(`value`: String) {
    unwrap(this).setLatencyMode(`value`)
  }

  /**
   * Channel name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Channel name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An optional transcode preset for the channel.
   */
  public open fun preset(): String? = unwrap(this).getPreset()

  /**
   * An optional transcode preset for the channel.
   */
  public open fun preset(`value`: String) {
    unwrap(this).setPreset(`value`)
  }

  /**
   * The ARN of a RecordingConfiguration resource.
   */
  public open fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  /**
   * The ARN of a RecordingConfiguration resource.
   */
  public open fun recordingConfigurationArn(`value`: String) {
    unwrap(this).setRecordingConfigurationArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The channel type, which determines the allowable resolution and bitrate.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The channel type, which determines the allowable resolution and bitrate.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    public fun authorized(authorized: Boolean)

    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    public fun authorized(authorized: IResolvable)

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    public fun insecureIngest(insecureIngest: IResolvable)

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
     * @param latencyMode Channel latency mode. Valid values:. 
     */
    public fun latencyMode(latencyMode: String)

    /**
     * Channel name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     * @param name Channel name. 
     */
    public fun name(name: String)

    /**
     * An optional transcode preset for the channel.
     *
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
     * `STANDARD` ), `preset` is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     * @param preset An optional transcode preset for the channel. 
     */
    public fun preset(preset: String)

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
     * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource. 
     */
    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param type The channel type, which determines the allowable resolution and bitrate. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnChannel.Builder =
        software.amazon.awscdk.services.ivs.CfnChannel.Builder.create(scope, id)

    /**
     * Whether the channel is authorized.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    override fun authorized(authorized: Boolean) {
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
     * @param authorized Whether the channel is authorized. 
     */
    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable::unwrap))
    }

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * *Default* : `false`
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    override fun insecureIngest(insecureIngest: Boolean) {
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
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable::unwrap))
    }

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
     * @param latencyMode Channel latency mode. Valid values:. 
     */
    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    /**
     * Channel name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     * @param name Channel name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An optional transcode preset for the channel.
     *
     * This is selectable only for `ADVANCED_HD` and `ADVANCED_SD` channel types. For those channel
     * types, the default preset is `HIGHER_BANDWIDTH_DELIVERY` . For other channel types ( `BASIC` and
     * `STANDARD` ), `preset` is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     * @param preset An optional transcode preset for the channel. 
     */
    override fun preset(preset: String) {
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
     * @param recordingConfigurationArn The ARN of a RecordingConfiguration resource. 
     */
    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param type The channel type, which determines the allowable resolution and bitrate. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnChannel): CfnChannel =
        CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.ivs.CfnChannel =
        wrapped.cdkObject
  }
}
