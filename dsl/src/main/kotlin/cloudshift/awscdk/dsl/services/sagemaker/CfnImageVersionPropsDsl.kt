@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps

/**
 * Properties for defining a `CfnImageVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnImageVersionProps cfnImageVersionProps = CfnImageVersionProps.builder()
 * .baseImage("baseImage")
 * .imageName("imageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html)
 */
@CdkDslMarker
public class CfnImageVersionPropsDsl {
  private val cdkBuilder: CfnImageVersionProps.Builder = CfnImageVersionProps.builder()

  /**
   * @param baseImage The container image that the SageMaker image version is based on. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 255.
   *
   * *Pattern* : `.*`
   */
  public fun baseImage(baseImage: String) {
    cdkBuilder.baseImage(baseImage)
  }

  /**
   * @param imageName The name of the parent image. 
   * *Length Constraints* : Minimum length of 1. Maximum length of 63.
   *
   * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
   */
  public fun imageName(imageName: String) {
    cdkBuilder.imageName(imageName)
  }

  public fun build(): CfnImageVersionProps = cdkBuilder.build()
}
