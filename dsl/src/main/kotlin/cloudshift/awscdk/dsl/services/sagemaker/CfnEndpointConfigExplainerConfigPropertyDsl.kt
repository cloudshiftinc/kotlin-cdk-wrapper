@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigExplainerConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ExplainerConfigProperty.Builder =
      CfnEndpointConfig.ExplainerConfigProperty.builder()

  /**
   * @param clarifyExplainerConfig the value to be set.
   */
  public fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable) {
    cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig)
  }

  /**
   * @param clarifyExplainerConfig the value to be set.
   */
  public
      fun clarifyExplainerConfig(clarifyExplainerConfig: CfnEndpointConfig.ClarifyExplainerConfigProperty) {
    cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig)
  }

  public fun build(): CfnEndpointConfig.ExplainerConfigProperty = cdkBuilder.build()
}
