@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder =
      CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder()

  /**
   * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent by
   * the SageMaker client to the model container.
   * If no value is provided, SageMaker will choose an optimal value for you.
   */
  public fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number) {
    cdkBuilder.maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance)
  }

  public fun build(): CfnEndpointConfig.AsyncInferenceClientConfigProperty = cdkBuilder.build()
}
