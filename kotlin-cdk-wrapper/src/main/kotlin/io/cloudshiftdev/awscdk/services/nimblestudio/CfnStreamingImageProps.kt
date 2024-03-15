@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnStreamingImage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnStreamingImageProps cfnStreamingImageProps = CfnStreamingImageProps.builder()
 * .ec2ImageId("ec2ImageId")
 * .name("name")
 * .studioId("studioId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html)
 */
public interface CfnStreamingImageProps {
  /**
   * A human-readable description of the streaming image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of an EC2 machine image with which to create the streaming image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
   */
  public fun ec2ImageId(): String

  /**
   * A friendly name for a streaming image resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
   */
  public fun name(): String

  /**
   * The unique identifier for a studio resource.
   *
   * In Nimble Studio , all other resources are contained in a studio resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
   */
  public fun studioId(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnStreamingImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A human-readable description of the streaming image.
     */
    public fun description(description: String)

    /**
     * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image. 
     */
    public fun ec2ImageId(ec2ImageId: String)

    /**
     * @param name A friendly name for a streaming image resource. 
     */
    public fun name(name: String)

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    public fun studioId(studioId: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps.builder()

    /**
     * @param description A human-readable description of the streaming image.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ec2ImageId The ID of an EC2 machine image with which to create the streaming image. 
     */
    override fun ec2ImageId(ec2ImageId: String) {
      cdkBuilder.ec2ImageId(ec2ImageId)
    }

    /**
     * @param name A friendly name for a streaming image resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param studioId The unique identifier for a studio resource. 
     * In Nimble Studio , all other resources are contained in a studio resource.
     */
    override fun studioId(studioId: String) {
      cdkBuilder.studioId(studioId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps,
  ) : CdkObject(cdkObject), CfnStreamingImageProps {
    /**
     * A human-readable description of the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of an EC2 machine image with which to create the streaming image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-ec2imageid)
     */
    override fun ec2ImageId(): String = unwrap(this).getEc2ImageId()

    /**
     * A friendly name for a streaming image resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The unique identifier for a studio resource.
     *
     * In Nimble Studio , all other resources are contained in a studio resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-studioid)
     */
    override fun studioId(): String = unwrap(this).getStudioId()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-streamingimage.html#cfn-nimblestudio-streamingimage-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStreamingImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps):
        CfnStreamingImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStreamingImageProps):
        software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStreamingImageProps
  }
}
