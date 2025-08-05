@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

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
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * // the properties below are optional
 * .description("description")
 * .inputSwitchConfiguration(InputSwitchConfigurationProperty.builder()
 * .mqcsInputSwitching(false)
 * .build())
 * .inputType("inputType")
 * .outputHeaderConfiguration(OutputHeaderConfigurationProperty.builder()
 * .publishMqcs(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html)
 */
public interface CfnChannelProps {
  /**
   * The name of the channel group associated with the channel configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelgroupname)
   */
  public fun channelGroupName(): String

  /**
   * The name of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelname)
   */
  public fun channelName(): String

  /**
   * The description of the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The configuration for input switching based on the media quality confidence score (MQCS) as
   * provided from AWS Elemental MediaLive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
   */
  public fun inputSwitchConfiguration(): Any? = unwrap(this).getInputSwitchConfiguration()

  /**
   * The input type will be an immutable field which will be used to define whether the channel will
   * allow CMAF ingest or HLS ingest.
   *
   * If unprovided, it will default to HLS to preserve current behavior.
   *
   * The allowed values are:
   *
   * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
   * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
   * DASH manifests).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputtype)
   */
  public fun inputType(): String? = unwrap(this).getInputType()

  /**
   * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
   * includes in responses to the CDN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
   */
  public fun outputHeaderConfiguration(): Any? = unwrap(this).getOutputHeaderConfiguration()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelGroupName The name of the channel group associated with the channel
     * configuration. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * @param channelName The name of the channel. 
     */
    public fun channelName(channelName: String)

    /**
     * @param description The description of the channel.
     */
    public fun description(description: String)

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    public fun inputSwitchConfiguration(inputSwitchConfiguration: IResolvable)

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    public
        fun inputSwitchConfiguration(inputSwitchConfiguration: CfnChannel.InputSwitchConfigurationProperty)

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7af3d439ba801fafad6507e60b8bafdf441a69c0c47f9bd7d35d5d15a3ea4d02")
    public
        fun inputSwitchConfiguration(inputSwitchConfiguration: CfnChannel.InputSwitchConfigurationProperty.Builder.() -> Unit)

    /**
     * @param inputType The input type will be an immutable field which will be used to define
     * whether the channel will allow CMAF ingest or HLS ingest.
     * If unprovided, it will default to HLS to preserve current behavior.
     *
     * The allowed values are:
     *
     * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
     * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
     * DASH manifests).
     */
    public fun inputType(inputType: String)

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    public fun outputHeaderConfiguration(outputHeaderConfiguration: IResolvable)

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    public
        fun outputHeaderConfiguration(outputHeaderConfiguration: CfnChannel.OutputHeaderConfigurationProperty)

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86a49b28f8e9ee40ee7a7f1e92c2f2e587ebeec963cbef268c71c72f7ab8bc4f")
    public
        fun outputHeaderConfiguration(outputHeaderConfiguration: CfnChannel.OutputHeaderConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnChannelProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelProps.builder()

    /**
     * @param channelGroupName The name of the channel group associated with the channel
     * configuration. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * @param channelName The name of the channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param description The description of the channel.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    override fun inputSwitchConfiguration(inputSwitchConfiguration: IResolvable) {
      cdkBuilder.inputSwitchConfiguration(inputSwitchConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    override
        fun inputSwitchConfiguration(inputSwitchConfiguration: CfnChannel.InputSwitchConfigurationProperty) {
      cdkBuilder.inputSwitchConfiguration(inputSwitchConfiguration.let(CfnChannel.InputSwitchConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param inputSwitchConfiguration The configuration for input switching based on the media
     * quality confidence score (MQCS) as provided from AWS Elemental MediaLive.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7af3d439ba801fafad6507e60b8bafdf441a69c0c47f9bd7d35d5d15a3ea4d02")
    override
        fun inputSwitchConfiguration(inputSwitchConfiguration: CfnChannel.InputSwitchConfigurationProperty.Builder.() -> Unit):
        Unit =
        inputSwitchConfiguration(CfnChannel.InputSwitchConfigurationProperty(inputSwitchConfiguration))

    /**
     * @param inputType The input type will be an immutable field which will be used to define
     * whether the channel will allow CMAF ingest or HLS ingest.
     * If unprovided, it will default to HLS to preserve current behavior.
     *
     * The allowed values are:
     *
     * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
     * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
     * DASH manifests).
     */
    override fun inputType(inputType: String) {
      cdkBuilder.inputType(inputType)
    }

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    override fun outputHeaderConfiguration(outputHeaderConfiguration: IResolvable) {
      cdkBuilder.outputHeaderConfiguration(outputHeaderConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    override
        fun outputHeaderConfiguration(outputHeaderConfiguration: CfnChannel.OutputHeaderConfigurationProperty) {
      cdkBuilder.outputHeaderConfiguration(outputHeaderConfiguration.let(CfnChannel.OutputHeaderConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param outputHeaderConfiguration The settings for what common media server data (CMSD)
     * headers AWS Elemental MediaPackage includes in responses to the CDN.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86a49b28f8e9ee40ee7a7f1e92c2f2e587ebeec963cbef268c71c72f7ab8bc4f")
    override
        fun outputHeaderConfiguration(outputHeaderConfiguration: CfnChannel.OutputHeaderConfigurationProperty.Builder.() -> Unit):
        Unit =
        outputHeaderConfiguration(CfnChannel.OutputHeaderConfigurationProperty(outputHeaderConfiguration))

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelProps,
  ) : CdkObject(cdkObject),
      CfnChannelProps {
    /**
     * The name of the channel group associated with the channel configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelgroupname)
     */
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /**
     * The name of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The description of the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The configuration for input switching based on the media quality confidence score (MQCS) as
     * provided from AWS Elemental MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputswitchconfiguration)
     */
    override fun inputSwitchConfiguration(): Any? = unwrap(this).getInputSwitchConfiguration()

    /**
     * The input type will be an immutable field which will be used to define whether the channel
     * will allow CMAF ingest or HLS ingest.
     *
     * If unprovided, it will default to HLS to preserve current behavior.
     *
     * The allowed values are:
     *
     * * `HLS` - The HLS streaming specification (which defines M3U8 manifests and TS segments).
     * * `CMAF` - The DASH-IF CMAF Ingest specification (which defines CMAF segments with optional
     * DASH manifests).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-inputtype)
     */
    override fun inputType(): String? = unwrap(this).getInputType()

    /**
     * The settings for what common media server data (CMSD) headers AWS Elemental MediaPackage
     * includes in responses to the CDN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-outputheaderconfiguration)
     */
    override fun outputHeaderConfiguration(): Any? = unwrap(this).getOutputHeaderConfiguration()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channel.html#cfn-mediapackagev2-channel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelProps):
        CfnChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackagev2.CfnChannelProps
  }
}
