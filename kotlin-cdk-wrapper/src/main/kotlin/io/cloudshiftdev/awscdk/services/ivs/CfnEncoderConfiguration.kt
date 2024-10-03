@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
 * The `AWS::IVS::EncoderConfiguration` resource specifies an  encoder configuration.
 *
 * An encoder configuration describes a stream’s video configuration. For more information, see
 * [Streaming
 * Configuration](https://docs.aws.amazon.com/ivs/latest/LowLatencyUserGuide/streaming-config.html) in
 * the *Amazon IVS Low-Latency Streaming User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnEncoderConfiguration cfnEncoderConfiguration = CfnEncoderConfiguration.Builder.create(this,
 * "MyCfnEncoderConfiguration")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .video(VideoProperty.builder()
 * .bitrate(123)
 * .framerate(123)
 * .height(123)
 * .width(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html)
 */
public open class CfnEncoderConfiguration(
  cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivs.CfnEncoderConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEncoderConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnEncoderConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEncoderConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEncoderConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEncoderConfigurationProps(props)
  )

  /**
   * The encoder-configuration ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:encoder-configuration/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Encoder cnfiguration name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Encoder cnfiguration name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Video configuration.
   */
  public open fun video(): Any? = unwrap(this).getVideo()

  /**
   * Video configuration.
   */
  public open fun video(`value`: IResolvable) {
    unwrap(this).setVideo(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Video configuration.
   */
  public open fun video(`value`: VideoProperty) {
    unwrap(this).setVideo(`value`.let(VideoProperty.Companion::unwrap))
  }

  /**
   * Video configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fb700c58dc8e1dbd583b91299e23788be36e9b0264cf655622d21d6785dfa188")
  public open fun video(`value`: VideoProperty.Builder.() -> Unit): Unit =
      video(VideoProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnEncoderConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Encoder cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-name)
     * @param name Encoder cnfiguration name. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    public fun video(video: IResolvable)

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    public fun video(video: VideoProperty)

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c05f7797faa42a030690b7207fb246a6f98c20d306aba01737584eb8ed7795ae")
    public fun video(video: VideoProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.Builder =
        software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.Builder.create(scope, id)

    /**
     * Encoder cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-name)
     * @param name Encoder cnfiguration name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    override fun video(video: IResolvable) {
      cdkBuilder.video(video.let(IResolvable.Companion::unwrap))
    }

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    override fun video(video: VideoProperty) {
      cdkBuilder.video(video.let(VideoProperty.Companion::unwrap))
    }

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     * @param video Video configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c05f7797faa42a030690b7207fb246a6f98c20d306aba01737584eb8ed7795ae")
    override fun video(video: VideoProperty.Builder.() -> Unit): Unit = video(VideoProperty(video))

    public fun build(): software.amazon.awscdk.services.ivs.CfnEncoderConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEncoderConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEncoderConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfiguration):
        CfnEncoderConfiguration = CfnEncoderConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnEncoderConfiguration):
        software.amazon.awscdk.services.ivs.CfnEncoderConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnEncoderConfiguration
  }

  /**
   * The Video property type describes a stream's video configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ivs.*;
   * VideoProperty videoProperty = VideoProperty.builder()
   * .bitrate(123)
   * .framerate(123)
   * .height(123)
   * .width(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
   */
  public interface VideoProperty {
    /**
     * Bitrate for generated output, in bps.
     *
     * Default: 2500000.
     *
     * Default: - 2500000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-bitrate)
     */
    public fun bitrate(): Number? = unwrap(this).getBitrate()

    /**
     * Video frame rate, in fps.
     *
     * Default: 30.
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-framerate)
     */
    public fun framerate(): Number? = unwrap(this).getFramerate()

    /**
     * Video-resolution height.
     *
     * Note that the maximum value is determined by width times height, such that the maximum total
     * pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
     *
     * Default: - 720
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-height)
     */
    public fun height(): Number? = unwrap(this).getHeight()

    /**
     * Video-resolution width.
     *
     * Note that the maximum value is determined by width times height, such that the maximum total
     * pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
     *
     * Default: - 1280
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-width)
     */
    public fun width(): Number? = unwrap(this).getWidth()

    /**
     * A builder for [VideoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bitrate Bitrate for generated output, in bps.
       * Default: 2500000.
       */
      public fun bitrate(bitrate: Number)

      /**
       * @param framerate Video frame rate, in fps.
       * Default: 30.
       */
      public fun framerate(framerate: Number)

      /**
       * @param height Video-resolution height.
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
       */
      public fun height(height: Number)

      /**
       * @param width Video-resolution width.
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
       */
      public fun width(width: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty.Builder =
          software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty.builder()

      /**
       * @param bitrate Bitrate for generated output, in bps.
       * Default: 2500000.
       */
      override fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
      }

      /**
       * @param framerate Video frame rate, in fps.
       * Default: 30.
       */
      override fun framerate(framerate: Number) {
        cdkBuilder.framerate(framerate)
      }

      /**
       * @param height Video-resolution height.
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
       */
      override fun height(height: Number) {
        cdkBuilder.height(height)
      }

      /**
       * @param width Video-resolution width.
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
       */
      override fun width(width: Number) {
        cdkBuilder.width(width)
      }

      public fun build(): software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty,
    ) : CdkObject(cdkObject),
        VideoProperty {
      /**
       * Bitrate for generated output, in bps.
       *
       * Default: 2500000.
       *
       * Default: - 2500000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-bitrate)
       */
      override fun bitrate(): Number? = unwrap(this).getBitrate()

      /**
       * Video frame rate, in fps.
       *
       * Default: 30.
       *
       * Default: - 30
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-framerate)
       */
      override fun framerate(): Number? = unwrap(this).getFramerate()

      /**
       * Video-resolution height.
       *
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 720.
       *
       * Default: - 720
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-height)
       */
      override fun height(): Number? = unwrap(this).getHeight()

      /**
       * Video-resolution width.
       *
       * Note that the maximum value is determined by width times height, such that the maximum
       * total pixels is 2073600 (1920x1080 or 1080x1920). Default: 1280.
       *
       * Default: - 1280
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html#cfn-ivs-encoderconfiguration-video-width)
       */
      override fun width(): Number? = unwrap(this).getWidth()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty):
          VideoProperty = CdkObjectWrappers.wrap(cdkObject) as? VideoProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoProperty):
          software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ivs.CfnEncoderConfiguration.VideoProperty
    }
  }
}
