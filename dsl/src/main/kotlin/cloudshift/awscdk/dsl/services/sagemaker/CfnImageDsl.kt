@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnImage
import software.constructs.Construct

@CdkDslMarker
public class CfnImageDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImage.Builder = CfnImage.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The description of the image.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 512.
   *
   * *Pattern* : `.*`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagedescription)
   * @param imageDescription The description of the image. 
   */
  public fun imageDescription(imageDescription: String) {
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
  public fun imageDisplayName(imageDisplayName: String) {
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
  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  /**
   * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to perform tasks on
   * your behalf.
   *
   * *Length Constraints* : Minimum length of 20. Maximum length of 2048.
   *
   * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-imagerolearn)
   * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker
   * to perform tasks on your behalf. 
   */
  public fun imageRoleArn(imageRoleArn: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * *Array Members* : Minimum number of 0 items. Maximum number of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html#cfn-sagemaker-image-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnImage {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
