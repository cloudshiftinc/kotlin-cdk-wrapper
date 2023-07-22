@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnImageVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnImageVersion.Builder = CfnImageVersion.Builder.create(scope, id)

  /**
   * The container image that the SageMaker image version is based on.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 255.
   *
   * *Pattern* : `.*`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
   * @param baseImage The container image that the SageMaker image version is based on. 
   */
  public fun baseImage(baseImage: String) {
    cdkBuilder.baseImage(baseImage)
  }

  /**
   * The name of the parent image.
   *
   * *Length Constraints* : Minimum length of 1. Maximum length of 63.
   *
   * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
   * @param imageName The name of the parent image. 
   */
  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public fun build(): CfnImageVersion = cdkBuilder.build()
}
