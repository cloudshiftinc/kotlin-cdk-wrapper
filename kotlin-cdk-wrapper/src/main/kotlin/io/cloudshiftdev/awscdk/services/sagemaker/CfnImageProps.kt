@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnImage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnImageProps cfnImageProps = CfnImageProps.builder()
 * .imageName("imageName")
 * .imageRoleArn("imageRoleArn")
 * // the properties below are optional
 * .imageDescription("imageDescription")
 * .imageDisplayName("imageDisplayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html)
 */
public interface CfnImageProps {
  /**
   * The description of the image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedescription)
   */
  public fun imageDescription(): String? = unwrap(this).getImageDescription()

  /**
   * The display name of the image.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 128.
   *
   * *Pattern* : `^\S(.*\S)?$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedisplayname)
   */
  public fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

  /**
   * The name of the Image. Must be unique by region in your account.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 63.
   *
   * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagename)
   */
  public fun imageName(): String

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * your behalf.
   *
   * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
   *
   * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagerolearn)
   */
  public fun imageRoleArn(): String

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageDescription The description of the image.
     */
    public fun imageDescription(imageDescription: String)

    /**
     * @param imageDisplayName The display name of the image.
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     */
    public fun imageDisplayName(imageDisplayName: String)

    /**
     * @param imageName The name of the Image. Must be unique by region in your account. 
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    public fun imageName(imageName: String)

    /**
     * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf. 
     * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     */
    public fun imageRoleArn(imageRoleArn: String)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImageProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImageProps.builder()

    /**
     * @param imageDescription The description of the image.
     */
    override fun imageDescription(imageDescription: String) {
      cdkBuilder.imageDescription(imageDescription)
    }

    /**
     * @param imageDisplayName The display name of the image.
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     */
    override fun imageDisplayName(imageDisplayName: String) {
      cdkBuilder.imageDisplayName(imageDisplayName)
    }

    /**
     * @param imageName The name of the Image. Must be unique by region in your account. 
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf. 
     * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     */
    override fun imageRoleArn(imageRoleArn: String) {
      cdkBuilder.imageRoleArn(imageRoleArn)
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource.
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImageProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageProps,
  ) : CdkObject(cdkObject), CfnImageProps {
    /**
     * The description of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedescription)
     */
    override fun imageDescription(): String? = unwrap(this).getImageDescription()

    /**
     * The display name of the image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedisplayname)
     */
    override fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

    /**
     * The name of the Image. Must be unique by region in your account.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagename)
     */
    override fun imageName(): String = unwrap(this).getImageName()

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on your behalf.
     *
     * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagerolearn)
     */
    override fun imageRoleArn(): String = unwrap(this).getImageRoleArn()

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImageProps):
        CfnImageProps = CdkObjectWrappers.wrap(cdkObject) as CfnImageProps

    internal fun unwrap(wrapped: CfnImageProps):
        software.amazon.awscdk.services.sagemaker.CfnImageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnImageProps
  }
}
