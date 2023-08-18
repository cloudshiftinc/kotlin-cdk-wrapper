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
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Properties for a MSK event source.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.secretsmanager.Secret;
 * import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * Function myFunction;
 * // Your MSK cluster arn
 * String clusterArn =
 * "arn:aws:kafka:us-east-1:0123456789019:cluster/SalesCluster/abcd1234-abcd-cafe-abab-9876543210ab-4";
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * // The secret that allows access to your MSK cluster
 * // You still have to make sure that it is associated with your cluster as described in the
 * documentation
 * Secret secret = Secret.Builder.create(this,
 * "Secret").secretName("AmazonMSK_KafkaSecret").build();
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .secret(secret)
 * .batchSize(100) // default
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .build());
 * ```
 */
@CdkDslMarker
public class ManagedKafkaEventSourcePropsDsl {
    private val cdkBuilder: ManagedKafkaEventSourceProps.Builder =
        ManagedKafkaEventSourceProps.builder()

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

    /** @param clusterArn An MSK cluster construct. */
    public fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
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

    public fun build(): ManagedKafkaEventSourceProps {
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        return cdkBuilder.build()
    }
}
