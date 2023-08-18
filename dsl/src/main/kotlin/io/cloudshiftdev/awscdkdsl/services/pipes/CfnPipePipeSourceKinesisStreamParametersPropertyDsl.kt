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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Kinesis stream as a source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeSourceKinesisStreamParametersProperty pipeSourceKinesisStreamParametersProperty =
 * PipeSourceKinesisStreamParametersProperty.builder()
 * .startingPosition("startingPosition")
 * // the properties below are optional
 * .batchSize(123)
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build())
 * .maximumBatchingWindowInSeconds(123)
 * .maximumRecordAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .onPartialBatchItemFailure("onPartialBatchItemFailure")
 * .parallelizationFactor(123)
 * .startingPositionTimestamp("startingPositionTimestamp")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipesourcekinesisstreamparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeSourceKinesisStreamParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeSourceKinesisStreamParametersProperty.Builder =
        CfnPipe.PipeSourceKinesisStreamParametersProperty.builder()

    /** @param batchSize The maximum number of records to include in each batch. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param deadLetterConfig Define the target queue to send dead-letter queue events to. */
    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /** @param deadLetterConfig Define the target queue to send dead-letter queue events to. */
    public fun deadLetterConfig(deadLetterConfig: CfnPipe.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /** @param maximumBatchingWindowInSeconds The maximum length of a time to wait for events. */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param maximumRecordAgeInSeconds (Streams only) Discard records older than the specified age.
     *   The default value is -1, which sets the maximum age to infinite. When the value is set to
     *   infinite, EventBridge never discards old records.
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts (Streams only) Discard records after the specified number of
     *   retries. The default value is -1, which sets the maximum number of retries to infinite.
     *   When MaximumRetryAttempts is infinite, EventBridge retries failed records until the record
     *   expires in the event source.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * @param onPartialBatchItemFailure (Streams only) Define how to handle item process failures.
     *   `AUTOMATIC_BISECT` halves each batch and retry each half until all the records are
     *   processed or there is one failed message left in the batch.
     */
    public fun onPartialBatchItemFailure(onPartialBatchItemFailure: String) {
        cdkBuilder.onPartialBatchItemFailure(onPartialBatchItemFailure)
    }

    /**
     * @param parallelizationFactor (Streams only) The number of batches to process concurrently
     *   from each shard. The default value is 1.
     */
    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param startingPosition (Streams only) The position in a stream from which to start reading.
     */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     *   from which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: String) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    public fun build(): CfnPipe.PipeSourceKinesisStreamParametersProperty = cdkBuilder.build()
}
