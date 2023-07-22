@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentModelInfrastructureConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.ModelInfrastructureConfigProperty.Builder =
      CfnInferenceExperiment.ModelInfrastructureConfigProperty.builder()

  /**
   * @param infrastructureType The inference option to which to deploy your model. Possible values
   * are the following:. 
   * * `RealTime` : Deploy to real-time inference.
   */
  public fun infrastructureType(infrastructureType: String) {
    cdkBuilder.infrastructureType(infrastructureType)
  }

  /**
   * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
   * real-time inference. 
   */
  public fun realTimeInferenceConfig(realTimeInferenceConfig: IResolvable) {
    cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig)
  }

  /**
   * @param realTimeInferenceConfig The infrastructure configuration for deploying the model to
   * real-time inference. 
   */
  public
      fun realTimeInferenceConfig(realTimeInferenceConfig: CfnInferenceExperiment.RealTimeInferenceConfigProperty) {
    cdkBuilder.realTimeInferenceConfig(realTimeInferenceConfig)
  }

  public fun build(): CfnInferenceExperiment.ModelInfrastructureConfigProperty = cdkBuilder.build()
}
