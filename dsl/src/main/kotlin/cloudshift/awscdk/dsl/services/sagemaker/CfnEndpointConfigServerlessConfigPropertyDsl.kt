@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigServerlessConfigPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ServerlessConfigProperty.Builder =
      CfnEndpointConfig.ServerlessConfigProperty.builder()

  /**
   * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint can
   * process. 
   */
  public fun maxConcurrency(maxConcurrency: Number) {
    cdkBuilder.maxConcurrency(maxConcurrency)
  }

  /**
   * @param memorySizeInMb The memory size of your serverless endpoint. 
   * Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144 MB.
   */
  public fun memorySizeInMb(memorySizeInMb: Number) {
    cdkBuilder.memorySizeInMb(memorySizeInMb)
  }

  /**
   * @param provisionedConcurrency the value to be set.
   */
  public fun provisionedConcurrency(provisionedConcurrency: Number) {
    cdkBuilder.provisionedConcurrency(provisionedConcurrency)
  }

  public fun build(): CfnEndpointConfig.ServerlessConfigProperty = cdkBuilder.build()
}
