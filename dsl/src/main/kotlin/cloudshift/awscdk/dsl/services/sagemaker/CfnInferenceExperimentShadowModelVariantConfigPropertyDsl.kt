@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The name and sampling percentage of a shadow variant.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ShadowModelVariantConfigProperty shadowModelVariantConfigProperty =
 * ShadowModelVariantConfigProperty.builder()
 * .samplingPercentage(123)
 * .shadowModelVariantName("shadowModelVariantName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodelvariantconfig.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentShadowModelVariantConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.ShadowModelVariantConfigProperty.Builder =
      CfnInferenceExperiment.ShadowModelVariantConfigProperty.builder()

  /**
   * @param samplingPercentage The percentage of inference requests that Amazon SageMaker replicates
   * from the production variant to the shadow variant. 
   */
  public fun samplingPercentage(samplingPercentage: Number) {
    cdkBuilder.samplingPercentage(samplingPercentage)
  }

  /**
   * @param shadowModelVariantName The name of the shadow variant. 
   */
  public fun shadowModelVariantName(shadowModelVariantName: String) {
    cdkBuilder.shadowModelVariantName(shadowModelVariantName)
  }

  public fun build(): CfnInferenceExperiment.ShadowModelVariantConfigProperty = cdkBuilder.build()
}
