@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * Contains information about the deployment options of a model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelVariantConfigProperty modelVariantConfigProperty = ModelVariantConfigProperty.builder()
 * .infrastructureConfig(ModelInfrastructureConfigProperty.builder()
 * .infrastructureType("infrastructureType")
 * .realTimeInferenceConfig(RealTimeInferenceConfigProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .build())
 * .build())
 * .modelName("modelName")
 * .variantName("variantName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-modelvariantconfig.html)
 */
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
