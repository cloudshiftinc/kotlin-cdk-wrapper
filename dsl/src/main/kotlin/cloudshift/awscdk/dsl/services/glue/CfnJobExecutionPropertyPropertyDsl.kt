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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnJob

/**
 * An execution property of a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * ExecutionPropertyProperty executionPropertyProperty = ExecutionPropertyProperty.builder()
 * .maxConcurrentRuns(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html)
 */
@CdkDslMarker
public class CfnJobExecutionPropertyPropertyDsl {
    private val cdkBuilder: CfnJob.ExecutionPropertyProperty.Builder =
        CfnJob.ExecutionPropertyProperty.builder()

    /**
     * @param maxConcurrentRuns The maximum number of concurrent runs allowed for the job. The
     *   default is 1. An error is returned when this threshold is reached. The maximum value you
     *   can specify is controlled by a service limit.
     */
    public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
        cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    public fun build(): CfnJob.ExecutionPropertyProperty = cdkBuilder.build()
}
