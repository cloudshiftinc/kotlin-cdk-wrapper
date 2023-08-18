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

package io.cloudshiftdev.awscdkdsl.services.lambda.eventsources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps

/**
 * Example:
 * ```
 * import software.amazon.awscdk.services.kinesis.*;
 * import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource;
 * Function myFunction;
 * Stream stream = new Stream(this, "MyStream");
 * myFunction.addEventSource(KinesisEventSource.Builder.create(stream)
 * .batchSize(100) // default
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .build());
 * ```
 */
@CdkDslMarker
public class KinesisEventSourcePropsDsl {
    private val cdkBuilder: KinesisEventSourceProps.Builder = KinesisEventSourceProps.builder()

    private val _filters: MutableList<Map<String, Any>> = mutableListOf()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     *   source at the time of invoking your function. Your function receives an event with all the
     *   retrieved records.
     *
     * Valid Range:
     * * Minimum value of 1
     * * Maximum value of:
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     */
    public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
        cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    /** @param enabled If the stream event source mapping should be enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param filters Add filter criteria option. */
    public fun filters(vararg filters: Map<String, Any>) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters Add filter criteria option. */
    public fun filters(filters: Collection<Map<String, Any>>) {
        _filters.addAll(filters)
    }

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     *   function. Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
        cdkBuilder.maxBatchingWindow(maxBatchingWindow)
    }

    /**
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     *   processing. Valid Range:
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     */
    public fun maxRecordAge(maxRecordAge: Duration) {
        cdkBuilder.maxRecordAge(maxRecordAge)
    }

    /**
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */
    public fun onFailure(onFailure: IEventSourceDlq) {
        cdkBuilder.onFailure(onFailure)
    }

    /**
     * @param parallelizationFactor The number of batches to process from each shard concurrently.
     *   Valid Range:
     * * Minimum value of 1
     * * Maximum value of 10
     */
    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     *   batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
        cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    /**
     * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
     *   Maximum value of 10000.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /** @param startingPosition Where to begin consuming the stream. */
    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     *   Kinesis Valid Range: 0 - 15 minutes.
     */
    public fun tumblingWindow(tumblingWindow: Duration) {
        cdkBuilder.tumblingWindow(tumblingWindow)
    }

    public fun build(): KinesisEventSourceProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
