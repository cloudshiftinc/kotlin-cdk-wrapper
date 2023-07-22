@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that represents a job timeout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * TimeoutProperty timeoutProperty = TimeoutProperty.builder()
 * .attemptDurationSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html)
 */
@CdkDslMarker
public class CfnJobDefinitionTimeoutPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.TimeoutProperty.Builder =
      CfnJobDefinition.TimeoutProperty.builder()

  /**
   * @param attemptDurationSeconds The job timeout time (in seconds) that's measured from the job
   * attempt's `startedAt` timestamp.
   * After this time passes, AWS Batch terminates your jobs if they aren't finished. The minimum
   * value for the timeout is 60 seconds.
   *
   * For array jobs, the timeout applies to the child jobs, not to the parent array job.
   *
   * For multi-node parallel (MNP) jobs, the timeout applies to the whole job, not to the individual
   * nodes.
   */
  public fun attemptDurationSeconds(attemptDurationSeconds: Number) {
    cdkBuilder.attemptDurationSeconds(attemptDurationSeconds)
  }

  public fun build(): CfnJobDefinition.TimeoutProperty = cdkBuilder.build()
}
