@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.IEventSourceDlq
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class KinesisEventSourceDsl(
    stream: IStream,
) {
    private val cdkBuilder: KinesisEventSource.Builder = KinesisEventSource.Builder.create(stream)

    private val _filters: MutableList<Map<String, Any>> = mutableListOf()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun bisectBatchOnError(bisectBatchOnError: Boolean) {
        cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun filters(vararg filters: Map<String, Any>) {
        _filters.addAll(listOf(*filters))
    }

    public fun filters(filters: Collection<Map<String, Any>>) {
        _filters.addAll(filters)
    }

    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
        cdkBuilder.maxBatchingWindow(maxBatchingWindow)
    }

    public fun maxRecordAge(maxRecordAge: Duration) {
        cdkBuilder.maxRecordAge(maxRecordAge)
    }

    public fun onFailure(onFailure: IEventSourceDlq) {
        cdkBuilder.onFailure(onFailure)
    }

    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
        cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    public fun tumblingWindow(tumblingWindow: Duration) {
        cdkBuilder.tumblingWindow(tumblingWindow)
    }

    public fun build(): KinesisEventSource {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
