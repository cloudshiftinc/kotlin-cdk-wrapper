@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigAsyncInferenceClientConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.AsyncInferenceClientConfigProperty.Builder =
      CfnEndpointConfig.AsyncInferenceClientConfigProperty.builder()

  public fun maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance: Number) {
    cdkBuilder.maxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance)
  }

  public fun build(): CfnEndpointConfig.AsyncInferenceClientConfigProperty = cdkBuilder.build()
}
