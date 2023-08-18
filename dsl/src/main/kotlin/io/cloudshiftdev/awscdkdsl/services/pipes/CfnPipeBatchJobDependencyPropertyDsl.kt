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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * An object that represents an AWS Batch job dependency.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * BatchJobDependencyProperty batchJobDependencyProperty = BatchJobDependencyProperty.builder()
 * .jobId("jobId")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batchjobdependency.html)
 */
@CdkDslMarker
public class CfnPipeBatchJobDependencyPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchJobDependencyProperty.Builder =
        CfnPipe.BatchJobDependencyProperty.builder()

    /** @param jobId The job ID of the AWS Batch job that's associated with this dependency. */
    public fun jobId(jobId: String) {
        cdkBuilder.jobId(jobId)
    }

    /** @param type The type of the job dependency. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipe.BatchJobDependencyProperty = cdkBuilder.build()
}
