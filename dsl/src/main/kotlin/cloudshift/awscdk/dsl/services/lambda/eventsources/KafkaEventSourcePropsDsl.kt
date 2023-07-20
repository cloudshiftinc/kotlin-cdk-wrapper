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
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps
import software.amazon.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class KafkaEventSourcePropsDsl {
    private val cdkBuilder: KafkaEventSourceProps.Builder = KafkaEventSourceProps.builder()

    private val _filters: MutableList<Map<String, Any>> = mutableListOf()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
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

    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): KafkaEventSourceProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
