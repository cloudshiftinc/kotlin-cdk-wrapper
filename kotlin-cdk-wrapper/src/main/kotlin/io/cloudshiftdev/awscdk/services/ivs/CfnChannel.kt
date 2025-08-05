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
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
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
 * .containerFormat("containerFormat")
 * .insecureIngest(false)
 * .latencyMode("latencyMode")
 * .multitrackInputConfiguration(MultitrackInputConfigurationProperty.builder()
 * .enabled(false)
 * .maximumResolution("maximumResolution")
 * .policy("policy")
 * .build())
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
public open class CfnChannel(
  cdkObject: software.amazon.awscdk.services.ivs.CfnChannel,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivs.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelProps(props)
  )

  /**
   * Channel ARN is automatically generated on creation and assigned as the unique identifier.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Channel ingest endpoint, part of the definition of an ingest server, used when you set up
   * streaming software.
   */
  public open fun attrIngestEndpoint(): String = unwrap(this).getAttrIngestEndpoint()

  /**
   * Channel Playback URL.
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
    unwrap(this).setAuthorized(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Indicates which content-packaging format is used (MPEG-TS or fMP4).
   */
  public open fun containerFormat(): String? = unwrap(this).getContainerFormat()

  /**
   * Indicates which content-packaging format is used (MPEG-TS or fMP4).
   */
  public open fun containerFormat(`value`: String) {
    unwrap(this).setContainerFormat(`value`)
  }

  /**
   * Whether the channel allows insecure ingest.
   */
  public open fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Whether the channel allows insecure ingest.
   */
  public open fun insecureIngest(`value`: Boolean) {
    unwrap(this).setInsecureIngest(`value`)
  }

  /**
   * Whether the channel allows insecure ingest.
   */
  public open fun insecureIngest(`value`: IResolvable) {
    unwrap(this).setInsecureIngest(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Channel latency mode.
   */
  public open fun latencyMode(): String? = unwrap(this).getLatencyMode()

  /**
   * Channel latency mode.
   */
  public open fun latencyMode(`value`: String) {
    unwrap(this).setLatencyMode(`value`)
  }

  /**
   * Object specifying multitrack input configuration.
   */
  public open fun multitrackInputConfiguration(): Any? =
      unwrap(this).getMultitrackInputConfiguration()

  /**
   * Object specifying multitrack input configuration.
   */
  public open fun multitrackInputConfiguration(`value`: IResolvable) {
    unwrap(this).setMultitrackInputConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Object specifying multitrack input configuration.
   */
  public open fun multitrackInputConfiguration(`value`: MultitrackInputConfigurationProperty) {
    unwrap(this).setMultitrackInputConfiguration(`value`.let(MultitrackInputConfigurationProperty.Companion::unwrap))
  }

  /**
   * Object specifying multitrack input configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b1ab5ba18304761613b6aa50622b86cb42d69e4cccc7f83f53c5eeb88c441f8b")
  public open
      fun multitrackInputConfiguration(`value`: MultitrackInputConfigurationProperty.Builder.() -> Unit):
      Unit = multitrackInputConfiguration(MultitrackInputConfigurationProperty(`value`))

  /**
   * Channel.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Channel.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Optional transcode preset for the channel.
   */
  public open fun preset(): String? = unwrap(this).getPreset()

  /**
   * Optional transcode preset for the channel.
   */
  public open fun preset(`value`: String) {
    unwrap(this).setPreset(`value`)
  }

  /**
   * Recording Configuration ARN.
   */
  public open fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  /**
   * Recording Configuration ARN.
   */
  public open fun recordingConfigurationArn(`value`: String) {
    unwrap(this).setRecordingConfigurationArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs that contain metadata for the asset model.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs that contain metadata for the asset model.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that contain metadata for the asset model.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Channel type, which determines the allowable resolution and bitrate.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * Channel type, which determines the allowable resolution and bitrate.
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
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    public fun authorized(authorized: Boolean)

    /**
     * Whether the channel is authorized.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    public fun authorized(authorized: IResolvable)

    /**
     * Indicates which content-packaging format is used (MPEG-TS or fMP4).
     *
     * If multitrackInputConfiguration is specified and enabled is true, then containerFormat is
     * required and must be set to FRAGMENTED_MP4. Otherwise, containerFormat may be set to TS or
     * FRAGMENTED_MP4. Default: TS.
     *
     * Default: - "TS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-containerformat)
     * @param containerFormat Indicates which content-packaging format is used (MPEG-TS or fMP4). 
     */
    public fun containerFormat(containerFormat: String)

    /**
     * Whether the channel allows insecure ingest.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure ingest. 
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * Whether the channel allows insecure ingest.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure ingest. 
     */
    public fun insecureIngest(insecureIngest: IResolvable)

    /**
     * Channel latency mode.
     *
     * Default: - "LOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
     * @param latencyMode Channel latency mode. 
     */
    public fun latencyMode(latencyMode: String)

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    public fun multitrackInputConfiguration(multitrackInputConfiguration: IResolvable)

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    public
        fun multitrackInputConfiguration(multitrackInputConfiguration: MultitrackInputConfigurationProperty)

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42be2672fcaf777ae76d9b9a03d37254c47e3dd9fa182b0311f0bb258039b84c")
    public
        fun multitrackInputConfiguration(multitrackInputConfiguration: MultitrackInputConfigurationProperty.Builder.() -> Unit)

    /**
     * Channel.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     * @param name Channel. 
     */
    public fun name(name: String)

    /**
     * Optional transcode preset for the channel.
     *
     * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel
     * types, the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and
     * STANDARD), preset is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     * @param preset Optional transcode preset for the channel. 
     */
    public fun preset(preset: String)

    /**
     * Recording Configuration ARN.
     *
     * A value other than an empty string indicates that recording is enabled. Default: ""
     * (recording is disabled).
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
     * @param recordingConfigurationArn Recording Configuration ARN. 
     */
    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset model. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset model. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Channel type, which determines the allowable resolution and bitrate.
     *
     * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-type)
     * @param type Channel type, which determines the allowable resolution and bitrate. 
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
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     * @param authorized Whether the channel is authorized. 
     */
    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable.Companion::unwrap))
    }

    /**
     * Indicates which content-packaging format is used (MPEG-TS or fMP4).
     *
     * If multitrackInputConfiguration is specified and enabled is true, then containerFormat is
     * required and must be set to FRAGMENTED_MP4. Otherwise, containerFormat may be set to TS or
     * FRAGMENTED_MP4. Default: TS.
     *
     * Default: - "TS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-containerformat)
     * @param containerFormat Indicates which content-packaging format is used (MPEG-TS or fMP4). 
     */
    override fun containerFormat(containerFormat: String) {
      cdkBuilder.containerFormat(containerFormat)
    }

    /**
     * Whether the channel allows insecure ingest.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure ingest. 
     */
    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * Whether the channel allows insecure ingest.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     * @param insecureIngest Whether the channel allows insecure ingest. 
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable.Companion::unwrap))
    }

    /**
     * Channel latency mode.
     *
     * Default: - "LOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
     * @param latencyMode Channel latency mode. 
     */
    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    override fun multitrackInputConfiguration(multitrackInputConfiguration: IResolvable) {
      cdkBuilder.multitrackInputConfiguration(multitrackInputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    override
        fun multitrackInputConfiguration(multitrackInputConfiguration: MultitrackInputConfigurationProperty) {
      cdkBuilder.multitrackInputConfiguration(multitrackInputConfiguration.let(MultitrackInputConfigurationProperty.Companion::unwrap))
    }

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     * @param multitrackInputConfiguration Object specifying multitrack input configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42be2672fcaf777ae76d9b9a03d37254c47e3dd9fa182b0311f0bb258039b84c")
    override
        fun multitrackInputConfiguration(multitrackInputConfiguration: MultitrackInputConfigurationProperty.Builder.() -> Unit):
        Unit =
        multitrackInputConfiguration(MultitrackInputConfigurationProperty(multitrackInputConfiguration))

    /**
     * Channel.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     * @param name Channel. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Optional transcode preset for the channel.
     *
     * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel
     * types, the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and
     * STANDARD), preset is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     * @param preset Optional transcode preset for the channel. 
     */
    override fun preset(preset: String) {
      cdkBuilder.preset(preset)
    }

    /**
     * Recording Configuration ARN.
     *
     * A value other than an empty string indicates that recording is enabled. Default: ""
     * (recording is disabled).
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
     * @param recordingConfigurationArn Recording Configuration ARN. 
     */
    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset model. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     * @param tags A list of key-value pairs that contain metadata for the asset model. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Channel type, which determines the allowable resolution and bitrate.
     *
     * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.
     *
     * Default: - "STANDARD"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-type)
     * @param type Channel type, which determines the allowable resolution and bitrate. 
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
        wrapped.cdkObject as software.amazon.awscdk.services.ivs.CfnChannel
  }

  /**
   * A complex type that specifies multitrack input configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * MultitrackInputConfigurationProperty multitrackInputConfigurationProperty =
   * MultitrackInputConfigurationProperty.builder()
   * .enabled(false)
   * .maximumResolution("maximumResolution")
   * .policy("policy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html)
   */
  public interface MultitrackInputConfigurationProperty {
    /**
     * Indicates whether multitrack input is enabled.
     *
     * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
     * channel type will cause an exception. If true, then policy, maximumResolution, and
     * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default: false.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Maximum resolution for multitrack input.
     *
     * Required if enabled is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-maximumresolution)
     */
    public fun maximumResolution(): String? = unwrap(this).getMaximumResolution()

    /**
     * Indicates whether multitrack input is allowed or required.
     *
     * Required if enabled is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-policy)
     */
    public fun policy(): String? = unwrap(this).getPolicy()

    /**
     * A builder for [MultitrackInputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether multitrack input is enabled.
       * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
       * channel type will cause an exception. If true, then policy, maximumResolution, and
       * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default:
       * false.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether multitrack input is enabled.
       * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
       * channel type will cause an exception. If true, then policy, maximumResolution, and
       * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default:
       * false.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param maximumResolution Maximum resolution for multitrack input.
       * Required if enabled is true.
       */
      public fun maximumResolution(maximumResolution: String)

      /**
       * @param policy Indicates whether multitrack input is allowed or required.
       * Required if enabled is true.
       */
      public fun policy(policy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty.builder()

      /**
       * @param enabled Indicates whether multitrack input is enabled.
       * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
       * channel type will cause an exception. If true, then policy, maximumResolution, and
       * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default:
       * false.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether multitrack input is enabled.
       * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
       * channel type will cause an exception. If true, then policy, maximumResolution, and
       * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default:
       * false.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maximumResolution Maximum resolution for multitrack input.
       * Required if enabled is true.
       */
      override fun maximumResolution(maximumResolution: String) {
        cdkBuilder.maximumResolution(maximumResolution)
      }

      /**
       * @param policy Indicates whether multitrack input is allowed or required.
       * Required if enabled is true.
       */
      override fun policy(policy: String) {
        cdkBuilder.policy(policy)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty,
    ) : CdkObject(cdkObject),
        MultitrackInputConfigurationProperty {
      /**
       * Indicates whether multitrack input is enabled.
       *
       * Can be set to true only if channel type is STANDARD. Setting enabled to true with any other
       * channel type will cause an exception. If true, then policy, maximumResolution, and
       * containerFormat are required, and containerFormat must be set to FRAGMENTED_MP4. Default:
       * false.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Maximum resolution for multitrack input.
       *
       * Required if enabled is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-maximumresolution)
       */
      override fun maximumResolution(): String? = unwrap(this).getMaximumResolution()

      /**
       * Indicates whether multitrack input is allowed or required.
       *
       * Required if enabled is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-channel-multitrackinputconfiguration.html#cfn-ivs-channel-multitrackinputconfiguration-policy)
       */
      override fun policy(): String? = unwrap(this).getPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MultitrackInputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty):
          MultitrackInputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MultitrackInputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MultitrackInputConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnChannel.MultitrackInputConfigurationProperty
    }
  }
}
