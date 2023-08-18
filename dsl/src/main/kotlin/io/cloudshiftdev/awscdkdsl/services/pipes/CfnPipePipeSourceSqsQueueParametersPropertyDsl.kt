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
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Amazon SQS stream as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeSourceSqsQueueParametersProperty pipeSourceSqsQueueParametersProperty =
 * PipeSourceSqsQueueParametersProperty.builder()
 * .batchSize(123)
 * .maximumBatchingWindowInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcesqsqueueparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeSourceSqsQueueParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceSqsQueueParametersProperty.Builder =
        CfnPipe.PipeSourceSqsQueueParametersProperty.builder()

    /** @param batchSize The maximum number of records to include in each batch. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    public fun build(): CfnPipe.PipeSourceSqsQueueParametersProperty = cdkBuilder.build()
}
