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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::RecordingConfiguration` resource specifies an  recording configuration.
 *
 * A recording configuration enables the recording of a channel’s live streams to a data store.
 * Multiple channels can reference the same recording configuration. For more information, see
 * [RecordingConfiguration](https://docs.aws.amazon.com/ivs/latest/LowLatencyAPIReference/API_RecordingConfiguration.html)
 * in the *Amazon IVS Low-Latency Streaming API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnRecordingConfiguration cfnRecordingConfiguration =
 * CfnRecordingConfiguration.Builder.create(this, "MyCfnRecordingConfiguration")
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
public open class CfnRecordingConfiguration(
  cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRecordingConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnRecordingConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRecordingConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRecordingConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRecordingConfigurationProps(props)
  )

  /**
   * The recording configuration ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:recording-configuration/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates the current state of the recording configuration.
   *
   * When the state is `ACTIVE` , the configuration is ready to record a channel stream. Valid
   * values: `CREATING` | `CREATE_FAILED` | `ACTIVE` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * A destination configuration describes an S3 bucket where recorded video will be stored.
   */
  public open fun destinationConfiguration(): Any = unwrap(this).getDestinationConfiguration()

  /**
   * A destination configuration describes an S3 bucket where recorded video will be stored.
   */
  public open fun destinationConfiguration(`value`: IResolvable) {
    unwrap(this).setDestinationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A destination configuration describes an S3 bucket where recorded video will be stored.
   */
  public open fun destinationConfiguration(`value`: DestinationConfigurationProperty) {
    unwrap(this).setDestinationConfiguration(`value`.let(DestinationConfigurationProperty.Companion::unwrap))
  }

  /**
   * A destination configuration describes an S3 bucket where recorded video will be stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1921f679292ab1ae792a66300e1e0d230f2f7cba64e28ec7975cc6fc4c92aeac")
  public open
      fun destinationConfiguration(`value`: DestinationConfigurationProperty.Builder.() -> Unit):
      Unit = destinationConfiguration(DestinationConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Recording-configuration name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Recording-configuration name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * If a broadcast disconnects and then reconnects within the specified interval, the multiple
   * streams will be considered a single broadcast and merged together.
   */
  public open fun recordingReconnectWindowSeconds(): Number? =
      unwrap(this).getRecordingReconnectWindowSeconds()

  /**
   * If a broadcast disconnects and then reconnects within the specified interval, the multiple
   * streams will be considered a single broadcast and merged together.
   */
  public open fun recordingReconnectWindowSeconds(`value`: Number) {
    unwrap(this).setRecordingReconnectWindowSeconds(`value`)
  }

  /**
   * A rendition configuration describes which renditions should be recorded for a stream.
   */
  public open fun renditionConfiguration(): Any? = unwrap(this).getRenditionConfiguration()

  /**
   * A rendition configuration describes which renditions should be recorded for a stream.
   */
  public open fun renditionConfiguration(`value`: IResolvable) {
    unwrap(this).setRenditionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A rendition configuration describes which renditions should be recorded for a stream.
   */
  public open fun renditionConfiguration(`value`: RenditionConfigurationProperty) {
    unwrap(this).setRenditionConfiguration(`value`.let(RenditionConfigurationProperty.Companion::unwrap))
  }

  /**
   * A rendition configuration describes which renditions should be recorded for a stream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("998630e0944425bfb8c6aa257c81d1294bf15c3111d89530bdf26fc71f34980b")
  public open
      fun renditionConfiguration(`value`: RenditionConfigurationProperty.Builder.() -> Unit): Unit =
      renditionConfiguration(RenditionConfigurationProperty(`value`))

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   */
  public open fun thumbnailConfiguration(): Any? = unwrap(this).getThumbnailConfiguration()

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   */
  public open fun thumbnailConfiguration(`value`: IResolvable) {
    unwrap(this).setThumbnailConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   */
  public open fun thumbnailConfiguration(`value`: ThumbnailConfigurationProperty) {
    unwrap(this).setThumbnailConfiguration(`value`.let(ThumbnailConfigurationProperty.Companion::unwrap))
  }

  /**
   * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
   * controls the interval at which thumbnails are generated for the live session.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("783585c19e0119f64cc61872ea9770f740260629bcdd9e1d511a651cd596b5bf")
  public open
      fun thumbnailConfiguration(`value`: ThumbnailConfigurationProperty.Builder.() -> Unit): Unit =
      thumbnailConfiguration(ThumbnailConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnRecordingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    public fun destinationConfiguration(destinationConfiguration: IResolvable)

    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    public fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty)

    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d407aa52af6315fb1a25da2154bbca3bc18a842da6c107df7f70a70267d611")
    public
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit)

    /**
     * Recording-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
     * @param name Recording-configuration name. 
     */
    public fun name(name: String)

    /**
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple
     * streams will be considered a single broadcast and merged together.
     *
     * *Default* : `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-recordingreconnectwindowseconds)
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     * the specified interval, the multiple streams will be considered a single broadcast and merged
     * together. 
     */
    public fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number)

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    public fun renditionConfiguration(renditionConfiguration: IResolvable)

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    public fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty)

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4293250e20969ee1d8871f0ac5697aea6481c930d08da9419416730803c5c5e1")
    public
        fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable)

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    public fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty)

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b4057fa8d0b9a6fb3c9537c51e3b0b34b433634c0beaa0966bd68e04cdf83fe")
    public
        fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder =
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.Builder.create(scope, id)

    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    override fun destinationConfiguration(destinationConfiguration: IResolvable) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty) {
      cdkBuilder.destinationConfiguration(destinationConfiguration.let(DestinationConfigurationProperty.Companion::unwrap))
    }

    /**
     * A destination configuration describes an S3 bucket where recorded video will be stored.
     *
     * See the DestinationConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration)
     * @param destinationConfiguration A destination configuration describes an S3 bucket where
     * recorded video will be stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d407aa52af6315fb1a25da2154bbca3bc18a842da6c107df7f70a70267d611")
    override
        fun destinationConfiguration(destinationConfiguration: DestinationConfigurationProperty.Builder.() -> Unit):
        Unit = destinationConfiguration(DestinationConfigurationProperty(destinationConfiguration))

    /**
     * Recording-configuration name.
     *
     * The value does not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-name)
     * @param name Recording-configuration name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * If a broadcast disconnects and then reconnects within the specified interval, the multiple
     * streams will be considered a single broadcast and merged together.
     *
     * *Default* : `0`
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-recordingreconnectwindowseconds)
     * @param recordingReconnectWindowSeconds If a broadcast disconnects and then reconnects within
     * the specified interval, the multiple streams will be considered a single broadcast and merged
     * together. 
     */
    override fun recordingReconnectWindowSeconds(recordingReconnectWindowSeconds: Number) {
      cdkBuilder.recordingReconnectWindowSeconds(recordingReconnectWindowSeconds)
    }

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    override fun renditionConfiguration(renditionConfiguration: IResolvable) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    override fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty) {
      cdkBuilder.renditionConfiguration(renditionConfiguration.let(RenditionConfigurationProperty.Companion::unwrap))
    }

    /**
     * A rendition configuration describes which renditions should be recorded for a stream.
     *
     * See the RenditionConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration)
     * @param renditionConfiguration A rendition configuration describes which renditions should be
     * recorded for a stream. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4293250e20969ee1d8871f0ac5697aea6481c930d08da9419416730803c5c5e1")
    override
        fun renditionConfiguration(renditionConfiguration: RenditionConfigurationProperty.Builder.() -> Unit):
        Unit = renditionConfiguration(RenditionConfigurationProperty(renditionConfiguration))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    override fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    override fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty) {
      cdkBuilder.thumbnailConfiguration(thumbnailConfiguration.let(ThumbnailConfigurationProperty.Companion::unwrap))
    }

    /**
     * A thumbnail configuration enables/disables the recording of thumbnails for a live session and
     * controls the interval at which thumbnails are generated for the live session.
     *
     * See the ThumbnailConfiguration property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-recordingconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration)
     * @param thumbnailConfiguration A thumbnail configuration enables/disables the recording of
     * thumbnails for a live session and controls the interval at which thumbnails are generated for
     * the live session. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b4057fa8d0b9a6fb3c9537c51e3b0b34b433634c0beaa0966bd68e04cdf83fe")
    override
        fun thumbnailConfiguration(thumbnailConfiguration: ThumbnailConfigurationProperty.Builder.() -> Unit):
        Unit = thumbnailConfiguration(ThumbnailConfigurationProperty(thumbnailConfiguration))

    public fun build(): software.amazon.awscdk.services.ivs.CfnRecordingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRecordingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRecordingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration):
        CfnRecordingConfiguration = CfnRecordingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnRecordingConfiguration):
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
  }

  /**
   * The DestinationConfiguration property type describes the location where recorded videos will be
   * stored.
   *
   * Each member represents a type of destination configuration. For recording, you define one and
   * only one type of destination configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * DestinationConfigurationProperty destinationConfigurationProperty =
   * DestinationConfigurationProperty.builder()
   * .s3(S3DestinationConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html)
   */
  public interface DestinationConfigurationProperty {
    /**
     * An S3 destination configuration where recorded videos will be stored.
     *
     * See the
     * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      public fun s3(s3: S3DestinationConfigurationProperty)

      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6ad42ab79105fc24c2341e6d6a65a26eefa911bae8021e12fd5343174471510")
      public fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty.builder()

      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      override fun s3(s3: S3DestinationConfigurationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param s3 An S3 destination configuration where recorded videos will be stored.
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a6ad42ab79105fc24c2341e6d6a65a26eefa911bae8021e12fd5343174471510")
      override fun s3(s3: S3DestinationConfigurationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationConfigurationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty,
    ) : CdkObject(cdkObject),
        DestinationConfigurationProperty {
      /**
       * An S3 destination configuration where recorded videos will be stored.
       *
       * See the
       * [S3DestinationConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
       * property type for more information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-destinationconfiguration.html#cfn-ivs-recordingconfiguration-destinationconfiguration-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty):
          DestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.DestinationConfigurationProperty
    }
  }

  /**
   * The RenditionConfiguration property type describes which renditions should be recorded for a
   * stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * RenditionConfigurationProperty renditionConfigurationProperty =
   * RenditionConfigurationProperty.builder()
   * .renditions(List.of("renditions"))
   * .renditionSelection("renditionSelection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html)
   */
  public interface RenditionConfigurationProperty {
    /**
     * The set of renditions are recorded for a stream.
     *
     * For `BASIC` channels, the `CUSTOM` value has no effect. If `CUSTOM` is specified, a set of
     * renditions can be specified in the `renditions` field. Default: `ALL` .
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration-renditionselection)
     */
    public fun renditionSelection(): String? = unwrap(this).getRenditionSelection()

    /**
     * A list of which renditions are recorded for a stream, if `renditionSelection` is `CUSTOM` ;
     *
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are
     * available during the stream. If a selected rendition is unavailable, the best available
     * rendition is recorded. For details on the resolution dimensions of each rendition, see
     * [Auto-Record to Amazon
     * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration-renditions)
     */
    public fun renditions(): List<String> = unwrap(this).getRenditions() ?: emptyList()

    /**
     * A builder for [RenditionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param renditionSelection The set of renditions are recorded for a stream.
       * For `BASIC` channels, the `CUSTOM` value has no effect. If `CUSTOM` is specified, a set of
       * renditions can be specified in the `renditions` field. Default: `ALL` .
       */
      public fun renditionSelection(renditionSelection: String)

      /**
       * @param renditions A list of which renditions are recorded for a stream, if
       * `renditionSelection` is `CUSTOM` ;.
       * otherwise, this field is irrelevant. The selected renditions are recorded if they are
       * available during the stream. If a selected rendition is unavailable, the best available
       * rendition is recorded. For details on the resolution dimensions of each rendition, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      public fun renditions(renditions: List<String>)

      /**
       * @param renditions A list of which renditions are recorded for a stream, if
       * `renditionSelection` is `CUSTOM` ;.
       * otherwise, this field is irrelevant. The selected renditions are recorded if they are
       * available during the stream. If a selected rendition is unavailable, the best available
       * rendition is recorded. For details on the resolution dimensions of each rendition, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      public fun renditions(vararg renditions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty.builder()

      /**
       * @param renditionSelection The set of renditions are recorded for a stream.
       * For `BASIC` channels, the `CUSTOM` value has no effect. If `CUSTOM` is specified, a set of
       * renditions can be specified in the `renditions` field. Default: `ALL` .
       */
      override fun renditionSelection(renditionSelection: String) {
        cdkBuilder.renditionSelection(renditionSelection)
      }

      /**
       * @param renditions A list of which renditions are recorded for a stream, if
       * `renditionSelection` is `CUSTOM` ;.
       * otherwise, this field is irrelevant. The selected renditions are recorded if they are
       * available during the stream. If a selected rendition is unavailable, the best available
       * rendition is recorded. For details on the resolution dimensions of each rendition, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      override fun renditions(renditions: List<String>) {
        cdkBuilder.renditions(renditions)
      }

      /**
       * @param renditions A list of which renditions are recorded for a stream, if
       * `renditionSelection` is `CUSTOM` ;.
       * otherwise, this field is irrelevant. The selected renditions are recorded if they are
       * available during the stream. If a selected rendition is unavailable, the best available
       * rendition is recorded. For details on the resolution dimensions of each rendition, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      override fun renditions(vararg renditions: String): Unit = renditions(renditions.toList())

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty,
    ) : CdkObject(cdkObject),
        RenditionConfigurationProperty {
      /**
       * The set of renditions are recorded for a stream.
       *
       * For `BASIC` channels, the `CUSTOM` value has no effect. If `CUSTOM` is specified, a set of
       * renditions can be specified in the `renditions` field. Default: `ALL` .
       *
       * Default: - "ALL"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration-renditionselection)
       */
      override fun renditionSelection(): String? = unwrap(this).getRenditionSelection()

      /**
       * A list of which renditions are recorded for a stream, if `renditionSelection` is `CUSTOM` ;
       *
       * otherwise, this field is irrelevant. The selected renditions are recorded if they are
       * available during the stream. If a selected rendition is unavailable, the best available
       * rendition is recorded. For details on the resolution dimensions of each rendition, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-renditionconfiguration.html#cfn-ivs-recordingconfiguration-renditionconfiguration-renditions)
       */
      override fun renditions(): List<String> = unwrap(this).getRenditions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RenditionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty):
          RenditionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RenditionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RenditionConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.RenditionConfigurationProperty
    }
  }

  /**
   * The S3DestinationConfiguration property type describes an S3 location where recorded videos
   * will be stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
   * S3DestinationConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html)
   */
  public interface S3DestinationConfigurationProperty {
    /**
     * Location (S3 bucket name) where recorded videos will be stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html#cfn-ivs-recordingconfiguration-s3destinationconfiguration-bucketname)
     */
    public fun bucketName(): String

    /**
     * A builder for [S3DestinationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName Location (S3 bucket name) where recorded videos will be stored. 
       */
      public fun bucketName(bucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder()

      /**
       * @param bucketName Location (S3 bucket name) where recorded videos will be stored. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty,
    ) : CdkObject(cdkObject),
        S3DestinationConfigurationProperty {
      /**
       * Location (S3 bucket name) where recorded videos will be stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-s3destinationconfiguration.html#cfn-ivs-recordingconfiguration-s3destinationconfiguration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DestinationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty):
          S3DestinationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3DestinationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.S3DestinationConfigurationProperty
    }
  }

  /**
   * The ThumbnailConfiguration property type describes a configuration of thumbnails for recorded
   * video.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * ThumbnailConfigurationProperty thumbnailConfigurationProperty =
   * ThumbnailConfigurationProperty.builder()
   * .recordingMode("recordingMode")
   * .resolution("resolution")
   * .storage(List.of("storage"))
   * .targetIntervalSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html)
   */
  public interface ThumbnailConfigurationProperty {
    /**
     * Thumbnail recording mode. Valid values:.
     *
     * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
     * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a
     * time interval controlled by the
     * [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
     * property.
     *
     * *Default* : `INTERVAL`
     *
     * Default: - "INTERVAL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
     */
    public fun recordingMode(): String? = unwrap(this).getRecordingMode()

    /**
     * The desired resolution of recorded thumbnails for a stream.
     *
     * Thumbnails are recorded at the selected resolution if the corresponding rendition is
     * available during the stream; otherwise, they are recorded at source resolution. For more
     * information about resolution values and their corresponding height and width dimensions, see
     * [Auto-Record to Amazon
     * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-resolution)
     */
    public fun resolution(): String? = unwrap(this).getResolution()

    /**
     * The format in which thumbnails are recorded for a stream.
     *
     * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
     * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
     * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
     * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-storage)
     */
    public fun storage(): List<String> = unwrap(this).getStorage() ?: emptyList()

    /**
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required)
     * only if
     * [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
     * is `INTERVAL` .
     *
     *
     * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are generated
     * at the specified interval. For thumbnails to be generated at the `TargetIntervalSeconds`
     * interval, the `IDR/Keyframe` value for the input video must be less than the
     * `TargetIntervalSeconds` value. See [Amazon IVS Streaming
     * Configuration](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/streaming-config.html)
     * for information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
     *
     *
     * *Default* : 60
     *
     * Default: - 60
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
     */
    public fun targetIntervalSeconds(): Number? = unwrap(this).getTargetIntervalSeconds()

    /**
     * A builder for [ThumbnailConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordingMode Thumbnail recording mode. Valid values:.
       * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
       * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a
       * time interval controlled by the
       * [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
       * property.
       *
       * *Default* : `INTERVAL`
       */
      public fun recordingMode(recordingMode: String)

      /**
       * @param resolution The desired resolution of recorded thumbnails for a stream.
       * Thumbnails are recorded at the selected resolution if the corresponding rendition is
       * available during the stream; otherwise, they are recorded at source resolution. For more
       * information about resolution values and their corresponding height and width dimensions, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      public fun resolution(resolution: String)

      /**
       * @param storage The format in which thumbnails are recorded for a stream.
       * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
       * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
       * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
       * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
       */
      public fun storage(storage: List<String>)

      /**
       * @param storage The format in which thumbnails are recorded for a stream.
       * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
       * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
       * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
       * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
       */
      public fun storage(vararg storage: String)

      /**
       * @param targetIntervalSeconds The targeted thumbnail-generation interval in seconds. This is
       * configurable (and required) only if
       * [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
       * is `INTERVAL` .
       *
       * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are
       * generated at the specified interval. For thumbnails to be generated at the
       * `TargetIntervalSeconds` interval, the `IDR/Keyframe` value for the input video must be less
       * than the `TargetIntervalSeconds` value. See [Amazon IVS Streaming
       * Configuration](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/streaming-config.html)
       * for information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
       *
       *
       * *Default* : 60
       */
      public fun targetIntervalSeconds(targetIntervalSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty.builder()

      /**
       * @param recordingMode Thumbnail recording mode. Valid values:.
       * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
       * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a
       * time interval controlled by the
       * [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
       * property.
       *
       * *Default* : `INTERVAL`
       */
      override fun recordingMode(recordingMode: String) {
        cdkBuilder.recordingMode(recordingMode)
      }

      /**
       * @param resolution The desired resolution of recorded thumbnails for a stream.
       * Thumbnails are recorded at the selected resolution if the corresponding rendition is
       * available during the stream; otherwise, they are recorded at source resolution. For more
       * information about resolution values and their corresponding height and width dimensions, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       */
      override fun resolution(resolution: String) {
        cdkBuilder.resolution(resolution)
      }

      /**
       * @param storage The format in which thumbnails are recorded for a stream.
       * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
       * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
       * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
       * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
       */
      override fun storage(storage: List<String>) {
        cdkBuilder.storage(storage)
      }

      /**
       * @param storage The format in which thumbnails are recorded for a stream.
       * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
       * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
       * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
       * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
       */
      override fun storage(vararg storage: String): Unit = storage(storage.toList())

      /**
       * @param targetIntervalSeconds The targeted thumbnail-generation interval in seconds. This is
       * configurable (and required) only if
       * [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
       * is `INTERVAL` .
       *
       * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are
       * generated at the specified interval. For thumbnails to be generated at the
       * `TargetIntervalSeconds` interval, the `IDR/Keyframe` value for the input video must be less
       * than the `TargetIntervalSeconds` value. See [Amazon IVS Streaming
       * Configuration](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/streaming-config.html)
       * for information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
       *
       *
       * *Default* : 60
       */
      override fun targetIntervalSeconds(targetIntervalSeconds: Number) {
        cdkBuilder.targetIntervalSeconds(targetIntervalSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty,
    ) : CdkObject(cdkObject),
        ThumbnailConfigurationProperty {
      /**
       * Thumbnail recording mode. Valid values:.
       *
       * * `DISABLED` : Use DISABLED to disable the generation of thumbnails for recorded video.
       * * `INTERVAL` : Use INTERVAL to enable the generation of thumbnails for recorded video at a
       * time interval controlled by the
       * [TargetIntervalSeconds](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
       * property.
       *
       * *Default* : `INTERVAL`
       *
       * Default: - "INTERVAL"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
       */
      override fun recordingMode(): String? = unwrap(this).getRecordingMode()

      /**
       * The desired resolution of recorded thumbnails for a stream.
       *
       * Thumbnails are recorded at the selected resolution if the corresponding rendition is
       * available during the stream; otherwise, they are recorded at source resolution. For more
       * information about resolution values and their corresponding height and width dimensions, see
       * [Auto-Record to Amazon
       * S3](https://docs.aws.amazon.com//ivs/latest/LowLatencyUserGuide/record-to-s3.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-resolution)
       */
      override fun resolution(): String? = unwrap(this).getResolution()

      /**
       * The format in which thumbnails are recorded for a stream.
       *
       * `SEQUENTIAL` records all generated thumbnails in a serial manner, to the media/thumbnails
       * directory. `LATEST` saves the latest thumbnail in media/thumbnails/latest/thumb.jpg and
       * overwrites it at the interval specified by `targetIntervalSeconds` . You can enable both
       * `SEQUENTIAL` and `LATEST` . Default: `SEQUENTIAL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-storage)
       */
      override fun storage(): List<String> = unwrap(this).getStorage() ?: emptyList()

      /**
       * The targeted thumbnail-generation interval in seconds. This is configurable (and required)
       * only if
       * [RecordingMode](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-recordingmode)
       * is `INTERVAL` .
       *
       *
       * Setting a value for `TargetIntervalSeconds` does not guarantee that thumbnails are
       * generated at the specified interval. For thumbnails to be generated at the
       * `TargetIntervalSeconds` interval, the `IDR/Keyframe` value for the input video must be less
       * than the `TargetIntervalSeconds` value. See [Amazon IVS Streaming
       * Configuration](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/streaming-config.html)
       * for information on setting `IDR/Keyframe` to the recommended value in video-encoder settings.
       *
       *
       * *Default* : 60
       *
       * Default: - 60
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-recordingconfiguration-thumbnailconfiguration.html#cfn-ivs-recordingconfiguration-thumbnailconfiguration-targetintervalseconds)
       */
      override fun targetIntervalSeconds(): Number? = unwrap(this).getTargetIntervalSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ThumbnailConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty):
          ThumbnailConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ThumbnailConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThumbnailConfigurationProperty):
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnRecordingConfiguration.ThumbnailConfigurationProperty
    }
  }
}
