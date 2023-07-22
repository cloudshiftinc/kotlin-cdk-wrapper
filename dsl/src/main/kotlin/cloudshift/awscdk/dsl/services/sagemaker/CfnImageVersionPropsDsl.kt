@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps

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
