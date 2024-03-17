@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnRecordingConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnRecordingConfigurationProps cfnRecordingConfigurationProps =
 * CfnRecordingConfigurationProps.builder()
 * .destinationConfiguration(DestinationConfigurationProperty.builder()
 * .s3(S3DestinationConfigurationProperty.builder()
 * .bucketName("bucketName")
 * .build())
 * .build())
 * // the properties below are optional
 * .name("name")
 * .recordingReconnectWindowSeconds(123)
 * .renditionConfiguration(RenditionConfigurationProperty.builder()
 * .renditions(List.of("renditions"))
 * .renditionSelection("renditionSelection")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thumbnailConfiguration(ThumbnailConfigurationProperty.builder()
 * .recordingMode("recordingMode")
 * .resolution("resolution")
 * .storage(List.of("storage"))
 * .targetIntervalSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html)
 */
public interface CfnRecordingConfigurationProps {
  /**
   * A destination configuration contains information about where recorded video will be stored.
   *
   * See the DestinationConfiguration property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
   */
  public fun destinationConfiguration(): Any

  /**
   * Recording-configuration name.
   *
   * The value does not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * If a broadcast disconnects and then reconnects within the specified interval, the multiple
   * streams will be considered a single broadcast and merged together.
   *
   * *Default* : `0`
   *
   * Default: - 0
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-recordingreconnectwindowseconds)
   */
  public fun recordingReconnectWindowSeconds(): Number? =
      unwrap(this).getRecordingReconnectWindowSeconds()

  /**
   * A rendition configuration describes which renditions should be recorded for a stream.
   *
   * See the RenditionConfiguration property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
   */
  public fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   *
   * See the ThumbnailConfiguration property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
   */
  public fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

  /**
   * A builder for [CfnRecordingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    public
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty)

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58180dd4e9264a9c8911be547ae7711ddc29314df75c8f32ab8db35c7186bb6c")
    public
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name Recording-configuration name.
     * The value does not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     * the specified interval, the multiple streams will be considered a single broadcast and merged
     * together.
     * *Default* : `0`
     */
    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number)

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    public fun renditionConfiguration(renditionConfiguration: IResolvable)

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    public
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty)

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cda16ae9df549bb6c087fdea06900e71e8f7d940b95b30468a33e9d114198c")
    public
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable)

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    public
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty)

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b0021c4b1e2f576647e42217dede135f3ceb4a05c2cef1f9334c060539e15c")
    public
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.Builder =
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps.builder()

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    override
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(CfnRecordingConfiguration.DestinationConfigurationProperty::unwrap))
    }

    /**
     * @param destinationConfiguration A destination configuration contains information about where
     * recorded video will be stored. 
     * See the DestinationConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58180dd4e9264a9c8911be547ae7711ddc29314df75c8f32ab8db35c7186bb6c")
    override
        fun destinationConfiguration(destinationConfiguration: CfnRecordingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit):
        Unit =
        destinationConfiguration(CfnRecordingConfiguration.DestinationConfigurationProperty(destinationConfiguration))

    /**
     * @param name Recording-configuration name.
     * The value does not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     * the specified interval, the multiple streams will be considered a single broadcast and merged
     * together.
     * *Default* : `0`
     */
    override fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
      cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    override fun renditionConfiguration(renditionConfiguration: IResolvable) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    override
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(CfnRecordingConfiguration.RenditionConfigurationProperty::unwrap))
    }

    /**
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream.
     * See the RenditionConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42cda16ae9df549bb6c087fdea06900e71e8f7d940b95b30468a33e9d114198c")
    override
        fun renditionConfiguration(renditionConfiguration: CfnRecordingConfiguration.RenditionConfigurationProperty.Builder.() -> Unit):
        Unit =
        renditionConfiguration(CfnRecordingConfiguration.RenditionConfigurationProperty(renditionConfiguration))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    override
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(CfnRecordingConfiguration.ThumbnailConfigurationProperty::unwrap))
    }

    /**
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session.
     * See the ThumbnailConfiguration property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b0021c4b1e2f576647e42217dede135f3ceb4a05c2cef1f9334c060539e15c")
    override
        fun thumbnailConfiguration(thumbnailConfiguration: CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder.() -> Unit):
        Unit =
        thumbnailConfiguration(CfnRecordingConfiguration.ThumbnailConfigurationProperty(thumbnailConfiguration))

    public fun build(): software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps,
  ) : CdkObject(cdkObject), CfnRecordingConfigurationProps {
    /**
     * A destination configuration contains information about where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     */
    override fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

    /**
     * Recording-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple
     * streams will be considered a single broadcast and merged together.
     *
     * *Default* : `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-recordingreconnectwindowseconds)
     */
    override fun recordingReconnectWindowSeconds(): Number? =
        unwrap(this).getRecordingReconnectWindowSeconds()

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     */
    override fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     */
    override fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRecordingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps):
        CfnRecordingConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRecordingConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRecordingConfigurationProps):
        software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
  }
}
