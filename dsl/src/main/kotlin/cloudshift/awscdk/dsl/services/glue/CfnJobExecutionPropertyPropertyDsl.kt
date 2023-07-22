@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnJob

@CdkDslMarker
public class CfnJobExecutionPropertyPropertyDsl {
  private val cdkBuilder: CfnJob.ExecutionPropertyProperty.Builder =
      CfnJob.ExecutionPropertyProperty.builder()

  /**
   * @param maxConcurrentRuns The maximum number of concurrent runs allowed for the job.
   * The default is 1. An error is returned when this threshold is reached. The maximum value you
   * can specify is controlled by a service limit.
   */
  public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
    cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
  }

  public fun build(): CfnJob.ExecutionPropertyProperty = cdkBuilder.build()
}
