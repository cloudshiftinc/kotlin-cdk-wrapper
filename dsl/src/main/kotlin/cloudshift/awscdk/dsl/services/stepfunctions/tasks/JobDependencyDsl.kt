@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.JobDependency

/**
 * An object representing an AWS Batch job dependency.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * JobDependency jobDependency = JobDependency.builder()
 * .jobId("jobId")
 * .type("type")
 * .build();
 * ```
 */
@CdkDslMarker
public class JobDependencyDsl {
  private val cdkBuilder: JobDependency.Builder = JobDependency.builder()

  /**
   * @param jobId The job ID of the AWS Batch job associated with this dependency.
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

  public fun build(): JobDependency = cdkBuilder.build()
}
