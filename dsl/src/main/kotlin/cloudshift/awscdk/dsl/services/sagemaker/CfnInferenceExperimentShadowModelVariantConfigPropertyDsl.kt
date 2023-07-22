@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

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
