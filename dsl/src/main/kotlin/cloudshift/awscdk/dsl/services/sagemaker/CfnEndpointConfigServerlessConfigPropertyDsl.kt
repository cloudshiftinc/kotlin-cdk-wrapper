@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigServerlessConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ServerlessConfigProperty.Builder =
      CfnEndpointConfig.ServerlessConfigProperty.builder()

  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  public fun memorySizeInMb(memorySizeInMb: Number) {
    cdkBuilder.memorySizeInMb(memorySizeInMb)
  }

  public fun provisionedConcurrency(provisionedConcurrency: Number) {
    cdkBuilder.provisionedConcurrency(provisionedConcurrency)
  }

  public fun build(): CfnEndpointConfig.ServerlessConfigProperty = cdkBuilder.build()
}
