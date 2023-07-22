@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@CdkDslMarker
public class CfnEventSourceMappingScalingConfigPropertyDsl {
  private val cdkBuilder: CfnEventSourceMapping.ScalingConfigProperty.Builder =
      CfnEventSourceMapping.ScalingConfigProperty.builder()

  /**
   * @param maximumConcurrency Limits the number of concurrent instances that the Amazon SQS event
   * source can invoke.
   */
  public fun maximumConcurrency(maximumConcurrency: Number) {
    cdkBuilder.maximumConcurrency(maximumConcurrency)
  }

  public fun build(): CfnEventSourceMapping.ScalingConfigProperty = cdkBuilder.build()
}
