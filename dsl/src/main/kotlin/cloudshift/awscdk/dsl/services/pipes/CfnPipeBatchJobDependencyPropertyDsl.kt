@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipeBatchJobDependencyPropertyDsl {
  private val cdkBuilder: CfnPipe.BatchJobDependencyProperty.Builder =
      CfnPipe.BatchJobDependencyProperty.builder()

  /**
   * @param jobId The job ID of the AWS Batch job that's associated with this dependency.
   */
  public fun jobId(jobId: String) {
    cdkBuilder.jobId(jobId)
  }

  /**
   * @param type The type of the job dependency.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnPipe.BatchJobDependencyProperty = cdkBuilder.build()
}
