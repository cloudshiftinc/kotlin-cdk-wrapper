@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentModelVariantConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.ModelVariantConfigProperty.Builder =
      CfnInferenceExperiment.ModelVariantConfigProperty.builder()

  /**
   * @param infrastructureConfig The configuration for the infrastructure that the model will be
   * deployed to. 
   */
  public fun infrastructureConfig(infrastructureConfig: IResolvable) {
    cdkBuilder.infrastructureConfig(infrastructureConfig)
  }

  /**
   * @param infrastructureConfig The configuration for the infrastructure that the model will be
   * deployed to. 
   */
  public
      fun infrastructureConfig(infrastructureConfig: CfnInferenceExperiment.ModelInfrastructureConfigProperty) {
    cdkBuilder.infrastructureConfig(infrastructureConfig)
  }

  /**
   * @param modelName The name of the Amazon SageMaker Model entity. 
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  /**
   * @param variantName The name of the variant. 
   */
  public fun variantName(variantName: String) {
    cdkBuilder.variantName(variantName)
  }

  public fun build(): CfnInferenceExperiment.ModelVariantConfigProperty = cdkBuilder.build()
}
