@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigClarifyExplainerConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ClarifyExplainerConfigProperty.Builder =
      CfnEndpointConfig.ClarifyExplainerConfigProperty.builder()

  /**
   * @param enableExplanations the value to be set.
   */
  public fun enableExplanations(enableExplanations: String) {
    cdkBuilder.enableExplanations(enableExplanations)
  }

  /**
   * @param inferenceConfig the value to be set.
   */
  public fun inferenceConfig(inferenceConfig: IResolvable) {
    cdkBuilder.inferenceConfig(inferenceConfig)
  }

  /**
   * @param inferenceConfig the value to be set.
   */
  public fun inferenceConfig(inferenceConfig: CfnEndpointConfig.ClarifyInferenceConfigProperty) {
    cdkBuilder.inferenceConfig(inferenceConfig)
  }

  /**
   * @param shapConfig the value to be set. 
   */
  public fun shapConfig(shapConfig: IResolvable) {
    cdkBuilder.shapConfig(shapConfig)
  }

  /**
   * @param shapConfig the value to be set. 
   */
  public fun shapConfig(shapConfig: CfnEndpointConfig.ClarifyShapConfigProperty) {
    cdkBuilder.shapConfig(shapConfig)
  }

  public fun build(): CfnEndpointConfig.ClarifyExplainerConfigProperty = cdkBuilder.build()
}
