@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The retry strategy that's associated with a job.
 *
 * For more information, see
 * [Automated job retries](https://docs.aws.amazon.com/batch/latest/userguide/job_retries.html) in
 * the *AWS Batch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * BatchRetryStrategyProperty batchRetryStrategyProperty = BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchretrystrategy.html)
 */
@CdkDslMarker
public class CfnPipeBatchRetryStrategyPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchRetryStrategyProperty.Builder =
        CfnPipe.BatchRetryStrategyProperty.builder()

    /**
     * @param attempts The number of times to move a job to the `RUNNABLE` status. If the value of
     *   `attempts` is greater than one, the job is retried on failure the same number of attempts
     *   as the value.
     */
    public fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
    }

    public fun build(): CfnPipe.BatchRetryStrategyProperty = cdkBuilder.build()
}
