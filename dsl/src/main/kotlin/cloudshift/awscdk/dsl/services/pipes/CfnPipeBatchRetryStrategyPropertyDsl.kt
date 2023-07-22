@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeBatchRetryStrategyPropertyDsl {
  private val cdkBuilder: CfnPipe.BatchRetryStrategyProperty.Builder =
      CfnPipe.BatchRetryStrategyProperty.builder()

  /**
   * @param attempts The number of times to move a job to the `RUNNABLE` status.
   * If the value of `attempts` is greater than one, the job is retried on failure the same number
   * of attempts as the value.
   */
  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun build(): CfnPipe.BatchRetryStrategyProperty = cdkBuilder.build()
}
