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

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps

/**
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.eventsources.SqsEventSource;
 * Function fn;
 * Queue queue = Queue.Builder.create(this, "MyQueue")
 * .visibilityTimeout(Duration.seconds(30)) // default,
 * .receiveMessageWaitTime(Duration.seconds(20))
 * .build();
 * fn.addEventSource(SqsEventSource.Builder.create(queue)
 * .batchSize(10) // default
 * .maxBatchingWindow(Duration.minutes(5))
 * .reportBatchItemFailures(true)
 * .build());
 * ```
 */
@CdkDslMarker
public class SqsEventSourcePropsDsl {
    private val cdkBuilder: SqsEventSourceProps.Builder = SqsEventSourceProps.builder()

    private val _filters: MutableList<Map<String, Any>> = mutableListOf()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     *   source at the time of invoking your function. Your function receives an event with all the
     *   retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10. If `maxBatchingWindow` is configured,
     * this value can go up to 10,000.
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param enabled If the SQS event source mapping should be enabled. */
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
     *   function. Valid Range: Minimum value of 0 minutes. Maximum value of 5 minutes.
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
        cdkBuilder.maxBatchingWindow(maxBatchingWindow)
    }

    /**
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     *   instances of the function that an Amazon SQS event source can invoke.
     */
    public fun maxConcurrency(maxConcurrency: Number) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     *   batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
        cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public fun build(): SqsEventSourceProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
