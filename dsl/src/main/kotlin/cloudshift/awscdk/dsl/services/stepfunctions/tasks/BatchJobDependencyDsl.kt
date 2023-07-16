@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency

@CdkDslMarker
public class BatchJobDependencyDsl {
  private val cdkBuilder: BatchJobDependency.Builder = BatchJobDependency.builder()

  public fun jobId(jobId: String) {
    cdkBuilder.jobId(jobId)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): BatchJobDependency = cdkBuilder.build()
}
