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
import kotlin.jvm.JvmName

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
public interface CfnChannelProps {
  /**
   * Whether the channel is authorized.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
   */
  public fun authorized(): Any? = unwrap(this).getAuthorized()

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
   */
  public fun containerFormat(): String? = unwrap(this).getContainerFormat()

  /**
   * Whether the channel allows insecure ingest.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
   */
  public fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Channel latency mode.
   *
   * Default: - "LOW"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
   */
  public fun latencyMode(): String? = unwrap(this).getLatencyMode()

  /**
   * Object specifying multitrack input configuration.
   *
   * Default: no multitrack input configuration is specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
   */
  public fun multitrackInputConfiguration(): Any? = unwrap(this).getMultitrackInputConfiguration()

  /**
   * Channel.
   *
   * Default: - "-"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Optional transcode preset for the channel.
   *
   * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel types,
   * the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and STANDARD),
   * preset is the empty string ("").
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
   */
  public fun preset(): String? = unwrap(this).getPreset()

  /**
   * Recording Configuration ARN.
   *
   * A value other than an empty string indicates that recording is enabled. Default: "" (recording
   * is disabled).
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
   */
  public fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

  /**
   * A list of key-value pairs that contain metadata for the asset model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Channel type, which determines the allowable resolution and bitrate.
   *
   * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
   * immediately.
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
     */
    public fun authorized(authorized: Boolean)

    /**
     * @param authorized Whether the channel is authorized.
     */
    public fun authorized(authorized: IResolvable)

    /**
     * @param containerFormat Indicates which content-packaging format is used (MPEG-TS or fMP4).
     * If multitrackInputConfiguration is specified and enabled is true, then containerFormat is
     * required and must be set to FRAGMENTED_MP4. Otherwise, containerFormat may be set to TS or
     * FRAGMENTED_MP4. Default: TS.
     */
    public fun containerFormat(containerFormat: String)

    /**
     * @param insecureIngest Whether the channel allows insecure ingest.
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * @param insecureIngest Whether the channel allows insecure ingest.
     */
    public fun insecureIngest(insecureIngest: IResolvable)

    /**
     * @param latencyMode Channel latency mode.
     */
    public fun latencyMode(latencyMode: String)

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    public fun multitrackInputConfiguration(multitrackInputConfiguration: IResolvable)

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    public
        fun multitrackInputConfiguration(multitrackInputConfiguration: CfnChannel.MultitrackInputConfigurationProperty)

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e653bbe31d591c5c975b26a80acc6c599f15fa93dc9e6e9334fc6addc60645e")
    public
        fun multitrackInputConfiguration(multitrackInputConfiguration: CfnChannel.MultitrackInputConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name Channel.
     */
    public fun name(name: String)

    /**
     * @param preset Optional transcode preset for the channel.
     * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel
     * types, the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and
     * STANDARD), preset is the empty string ("").
     */
    public fun preset(preset: String)

    /**
     * @param recordingConfigurationArn Recording Configuration ARN.
     * A value other than an empty string indicates that recording is enabled. Default: ""
     * (recording is disabled).
     */
    public fun recordingConfigurationArn(recordingConfigurationArn: String)

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset model.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset model.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type Channel type, which determines the allowable resolution and bitrate.
     * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnChannelProps.Builder =
        software.amazon.awscdk.services.ivs.CfnChannelProps.builder()

    /**
     * @param authorized Whether the channel is authorized.
     */
    override fun authorized(authorized: Boolean) {
      cdkBuilder.authorized(authorized)
    }

    /**
     * @param authorized Whether the channel is authorized.
     */
    override fun authorized(authorized: IResolvable) {
      cdkBuilder.authorized(authorized.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param containerFormat Indicates which content-packaging format is used (MPEG-TS or fMP4).
     * If multitrackInputConfiguration is specified and enabled is true, then containerFormat is
     * required and must be set to FRAGMENTED_MP4. Otherwise, containerFormat may be set to TS or
     * FRAGMENTED_MP4. Default: TS.
     */
    override fun containerFormat(containerFormat: String) {
      cdkBuilder.containerFormat(containerFormat)
    }

    /**
     * @param insecureIngest Whether the channel allows insecure ingest.
     */
    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * @param insecureIngest Whether the channel allows insecure ingest.
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param latencyMode Channel latency mode.
     */
    override fun latencyMode(latencyMode: String) {
      cdkBuilder.latencyMode(latencyMode)
    }

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    override fun multitrackInputConfiguration(multitrackInputConfiguration: IResolvable) {
      cdkBuilder.multitrackInputConfiguration(multitrackInputConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    override
        fun multitrackInputConfiguration(multitrackInputConfiguration: CfnChannel.MultitrackInputConfigurationProperty) {
      cdkBuilder.multitrackInputConfiguration(multitrackInputConfiguration.let(CfnChannel.MultitrackInputConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param multitrackInputConfiguration Object specifying multitrack input configuration.
     * Default: no multitrack input configuration is specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e653bbe31d591c5c975b26a80acc6c599f15fa93dc9e6e9334fc6addc60645e")
    override
        fun multitrackInputConfiguration(multitrackInputConfiguration: CfnChannel.MultitrackInputConfigurationProperty.Builder.() -> Unit):
        Unit =
        multitrackInputConfiguration(CfnChannel.MultitrackInputConfigurationProperty(multitrackInputConfiguration))

    /**
     * @param name Channel.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param preset Optional transcode preset for the channel.
     * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel
     * types, the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and
     * STANDARD), preset is the empty string ("").
     */
    override fun preset(preset: String) {
      cdkBuilder.preset(preset)
    }

    /**
     * @param recordingConfigurationArn Recording Configuration ARN.
     * A value other than an empty string indicates that recording is enabled. Default: ""
     * (recording is disabled).
     */
    override fun recordingConfigurationArn(recordingConfigurationArn: String) {
      cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset model.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the asset model.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type Channel type, which determines the allowable resolution and bitrate.
     * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnChannelProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnChannelProps,
  ) : CdkObject(cdkObject),
      CfnChannelProps {
    /**
     * Whether the channel is authorized.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-authorized)
     */
    override fun authorized(): Any? = unwrap(this).getAuthorized()

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
     */
    override fun containerFormat(): String? = unwrap(this).getContainerFormat()

    /**
     * Whether the channel allows insecure ingest.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-insecureingest)
     */
    override fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

    /**
     * Channel latency mode.
     *
     * Default: - "LOW"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-latencymode)
     */
    override fun latencyMode(): String? = unwrap(this).getLatencyMode()

    /**
     * Object specifying multitrack input configuration.
     *
     * Default: no multitrack input configuration is specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-multitrackinputconfiguration)
     */
    override fun multitrackInputConfiguration(): Any? =
        unwrap(this).getMultitrackInputConfiguration()

    /**
     * Channel.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Optional transcode preset for the channel.
     *
     * This is selectable only for ADVANCED_HD and ADVANCED_SD channel types. For those channel
     * types, the default preset is HIGHER_BANDWIDTH_DELIVERY. For other channel types (BASIC and
     * STANDARD), preset is the empty string ("").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-preset)
     */
    override fun preset(): String? = unwrap(this).getPreset()

    /**
     * Recording Configuration ARN.
     *
     * A value other than an empty string indicates that recording is enabled. Default: ""
     * (recording is disabled).
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-recordingconfigurationarn)
     */
    override fun recordingConfigurationArn(): String? = unwrap(this).getRecordingConfigurationArn()

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-channel.html#cfn-ivs-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Channel type, which determines the allowable resolution and bitrate.
     *
     * If you exceed the allowable resolution or bitrate, the stream probably will disconnect
     * immediately.
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
