@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeSourceSqsQueueParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeSourceSqsQueueParametersProperty.Builder =
      CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

  /**
   * @param batchSize The maximum number of records to include in each batch.
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events.
   */
  public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
    cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
  }

  public fun build(): CfnPipe.PipeSourceSqsQueueParametersProperty = cdkBuilder.build()
}
