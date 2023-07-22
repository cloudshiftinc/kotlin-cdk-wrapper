@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Describes a source image repository.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * ImageRepositoryProperty imageRepositoryProperty = ImageRepositoryProperty.builder()
 * .imageIdentifier("imageIdentifier")
 * .imageRepositoryType("imageRepositoryType")
 * // the properties below are optional
 * .imageConfiguration(ImageConfigurationProperty.builder()
 * .port("port")
 * .runtimeEnvironmentSecrets(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .runtimeEnvironmentVariables(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .startCommand("startCommand")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-imagerepository.html)
 */
@CdkDslMarker
public class CfnServiceImageRepositoryPropertyDsl {
  private val cdkBuilder: CfnService.ImageRepositoryProperty.Builder =
      CfnService.ImageRepositoryProperty.builder()

  /**
   * @param imageConfiguration Configuration for running the identified image.
   */
  public fun imageConfiguration(imageConfiguration: IResolvable) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  /**
   * @param imageConfiguration Configuration for running the identified image.
   */
  public fun imageConfiguration(imageConfiguration: CfnService.ImageConfigurationProperty) {
    cdkBuilder.imageConfiguration(imageConfiguration)
  }

  /**
   * @param imageIdentifier The identifier of an image. 
   * For an image in Amazon Elastic Container Registry (Amazon ECR), this is an image name. For the
   * image name format, see [Pulling an
   * image](https://docs.aws.amazon.com/AmazonECR/latest/userguide/docker-pull-ecr-image.html) in the
   * *Amazon ECR User Guide* .
   */
  public fun imageIdentifier(imageIdentifier: String) {
    cdkBuilder.imageIdentifier(imageIdentifier)
  }

  /**
   * @param imageRepositoryType The type of the image repository. 
   * This reflects the repository provider and whether the repository is private or public.
   */
  public fun imageRepositoryType(imageRepositoryType: String) {
    cdkBuilder.imageRepositoryType(imageRepositoryType)
  }

  public fun build(): CfnService.ImageRepositoryProperty = cdkBuilder.build()
}
