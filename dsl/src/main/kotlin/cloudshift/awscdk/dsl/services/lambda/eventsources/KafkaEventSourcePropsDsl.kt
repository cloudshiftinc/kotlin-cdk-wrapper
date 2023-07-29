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
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Properties for a Kafka event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.lambda.eventsources.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Object filters;
 * Secret secret;
 * KafkaEventSourceProps kafkaEventSourceProps = KafkaEventSourceProps.builder()
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .topic("topic")
 * // the properties below are optional
 * .batchSize(123)
 * .consumerGroupId("consumerGroupId")
 * .enabled(false)
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .maxBatchingWindow(Duration.minutes(30))
 * .secret(secret)
 * .build();
 * ```
 */
@CdkDslMarker
public class KafkaEventSourcePropsDsl {
    private val cdkBuilder: KafkaEventSourceProps.Builder = KafkaEventSourceProps.builder()

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
     * @param consumerGroupId The identifier for the Kafka consumer group to join. The consumer
     *   group ID must be unique among all your Kafka event sources. After creating a Kafka event
     *   source mapping with the consumer group ID specified, you cannot update this value. The
     *   value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     *   *:_+=.&#64;-]*'.
     */
    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    /** @param enabled If the stream event source mapping should be enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param filters Add filter criteria to Event Source. */
    public fun filters(vararg filters: Map<String, Any>) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters Add filter criteria to Event Source. */
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
     * @param secret The secret with the Kafka credentials, see
     *   https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This
     *   field is required if your Kafka brokers are accessed over the Internet.
     */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    /** @param startingPosition Where to begin consuming the stream. */
    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /** @param topic The Kafka topic to subscribe to. */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): KafkaEventSourceProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
