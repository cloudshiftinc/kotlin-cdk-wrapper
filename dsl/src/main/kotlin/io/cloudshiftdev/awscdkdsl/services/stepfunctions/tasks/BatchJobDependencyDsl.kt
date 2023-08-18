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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.BatchJobDependency

/**
 * An object representing an AWS Batch job dependency.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * BatchJobDependency batchJobDependency = BatchJobDependency.builder()
 * .jobId("jobId")
 * .type("type")
 * .build();
 * ```
 */
@CdkDslMarker
public class BatchJobDependencyDsl {
    private val cdkBuilder: BatchJobDependency.Builder = BatchJobDependency.builder()

    /** @param jobId The job ID of the AWS Batch job associated with this dependency. */
    public fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
    }

    /** @param type The type of the job dependency. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): BatchJobDependency = cdkBuilder.build()
}
