@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

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
 * Properties for defining a `CfnEncoderConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnEncoderConfigurationProps cfnEncoderConfigurationProps =
 * CfnEncoderConfigurationProps.builder()
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
public interface CfnEncoderConfigurationProps {
  /**
   * Encoder cnfiguration name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Video configuration.
   *
   * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
   * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
   * property type for more information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
   */
  public fun video(): Any? = unwrap(this).getVideo()

  /**
   * A builder for [CfnEncoderConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Encoder cnfiguration name.
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    public fun video(video: IResolvable)

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    public fun video(video: CfnEncoderConfiguration.VideoProperty)

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f6db334e82212675c7e60af6cb8b08ccb0f4a5e632ca4def55d864d7c75cda")
    public fun video(video: CfnEncoderConfiguration.VideoProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps.Builder
        = software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps.builder()

    /**
     * @param name Encoder cnfiguration name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    override fun video(video: IResolvable) {
      cdkBuilder.video(video.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    override fun video(video: CfnEncoderConfiguration.VideoProperty) {
      cdkBuilder.video(video.let(CfnEncoderConfiguration.VideoProperty.Companion::unwrap))
    }

    /**
     * @param video Video configuration.
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f6db334e82212675c7e60af6cb8b08ccb0f4a5e632ca4def55d864d7c75cda")
    override fun video(video: CfnEncoderConfiguration.VideoProperty.Builder.() -> Unit): Unit =
        video(CfnEncoderConfiguration.VideoProperty(video))

    public fun build(): software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnEncoderConfigurationProps {
    /**
     * Encoder cnfiguration name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-tag.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Video configuration.
     *
     * Default: video resolution 1280x720, bitrate 2500 kbps, 30 fps. See the
     * [Video](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivs-encoderconfiguration-video.html)
     * property type for more information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-encoderconfiguration.html#cfn-ivs-encoderconfiguration-video)
     */
    override fun video(): Any? = unwrap(this).getVideo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEncoderConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps):
        CfnEncoderConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEncoderConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEncoderConfigurationProps):
        software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnEncoderConfigurationProps
  }
}
