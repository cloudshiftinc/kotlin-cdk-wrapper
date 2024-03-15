@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom SageMaker image.
 *
 * A SageMaker image is a set of image versions. Each image version represents a container image
 * stored in Amazon ECR. For more information, see [Bring your own SageMaker
 * image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnImage cfnImage = CfnImage.Builder.create(this, "MyCfnImage")
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
public open class CfnImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the image.
   *
   * *Type* : String
   *
   * *Length Constraints* : Maximum length of 256.
   *
   * *Pattern* : `^arn:aws(-[\w]+)*:sagemaker:.+:[0-9]{12}:image/[a-z0-9]([-.]?[a-z0-9])*$`
   */
  public open fun attrImageArn(): String = unwrap(this).getAttrImageArn()

  /**
   * The description of the image.
   */
  public open fun imageDescription(): String? = unwrap(this).getImageDescription()

  /**
   * The description of the image.
   */
  public open fun imageDescription(`value`: String) {
    unwrap(this).setImageDescription(`value`)
  }

  /**
   * The display name of the image.
   */
  public open fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

  /**
   * The display name of the image.
   */
  public open fun imageDisplayName(`value`: String) {
    unwrap(this).setImageDisplayName(`value`)
  }

  /**
   * The name of the Image.
   *
   * Must be unique by region in your account.
   */
  public open fun imageName(): String = unwrap(this).getImageName()

  /**
   * The name of the Image.
   *
   * Must be unique by region in your account.
   */
  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * your behalf.
   */
  public open fun imageRoleArn(): String = unwrap(this).getImageRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * your behalf.
   */
  public open fun imageRoleArn(`value`: String) {
    unwrap(this).setImageRoleArn(`value`)
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
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedescription)
     * @param imageDescription The description of the image. 
     */
    public fun imageDescription(imageDescription: String)

    /**
     * The display name of the image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedisplayname)
     * @param imageDisplayName The display name of the image. 
     */
    public fun imageDisplayName(imageDisplayName: String)

    /**
     * The name of the Image. Must be unique by region in your account.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagename)
     * @param imageName The name of the Image. Must be unique by region in your account. 
     */
    public fun imageName(imageName: String)

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on your behalf.
     *
     * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagerolearn)
     * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf. 
     */
    public fun imageRoleArn(imageRoleArn: String)

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImage.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImage.Builder.create(scope, id)

    /**
     * The description of the image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedescription)
     * @param imageDescription The description of the image. 
     */
    override fun imageDescription(imageDescription: String) {
      cdkBuilder.imageDescription(imageDescription)
    }

    /**
     * The display name of the image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedisplayname)
     * @param imageDisplayName The display name of the image. 
     */
    override fun imageDisplayName(imageDisplayName: String) {
      cdkBuilder.imageDisplayName(imageDisplayName)
    }

    /**
     * The name of the Image. Must be unique by region in your account.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagename)
     * @param imageName The name of the Image. Must be unique by region in your account. 
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks
     * on your behalf.
     *
     * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagerolearn)
     * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     * SageMaker to perform tasks on your behalf. 
     */
    override fun imageRoleArn(imageRoleArn: String) {
      cdkBuilder.imageRoleArn(imageRoleArn)
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of key-value pairs to apply to this resource.
     *
     * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
     * @param tags A list of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnImage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImage): CfnImage =
        CfnImage(cdkObject)

    internal fun unwrap(wrapped: CfnImage): software.amazon.awscdk.services.sagemaker.CfnImage =
        wrapped.cdkObject
  }
}
