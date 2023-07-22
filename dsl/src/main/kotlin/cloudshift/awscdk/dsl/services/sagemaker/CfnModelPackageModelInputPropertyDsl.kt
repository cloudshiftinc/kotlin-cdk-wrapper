@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Input object for the model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelInputProperty modelInputProperty = ModelInputProperty.builder()
 * .dataInputConfig("dataInputConfig")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-modelinput.html)
 */
@CdkDslMarker
public class CfnModelPackageModelInputPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelInputProperty.Builder =
      CfnModelPackage.ModelInputProperty.builder()

  /**
   * @param dataInputConfig The input configuration object for the model. 
   */
  public fun dataInputConfig(dataInputConfig: String) {
    cdkBuilder.dataInputConfig(dataInputConfig)
  }

  public fun build(): CfnModelPackage.ModelInputProperty = cdkBuilder.build()
}
