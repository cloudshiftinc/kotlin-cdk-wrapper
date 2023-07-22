@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelPackageCreatorProperty modelPackageCreatorProperty = ModelPackageCreatorProperty.builder()
 * .userProfileName("userProfileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modelpackagecreator.html)
 */
@CdkDslMarker
public class CfnModelCardModelPackageCreatorPropertyDsl {
  private val cdkBuilder: CfnModelCard.ModelPackageCreatorProperty.Builder =
      CfnModelCard.ModelPackageCreatorProperty.builder()

  /**
   * @param userProfileName The name of the user's profile in Studio.
   */
  public fun userProfileName(userProfileName: String) {
    cdkBuilder.userProfileName(userProfileName)
  }

  public fun build(): CfnModelCard.ModelPackageCreatorProperty = cdkBuilder.build()
}
