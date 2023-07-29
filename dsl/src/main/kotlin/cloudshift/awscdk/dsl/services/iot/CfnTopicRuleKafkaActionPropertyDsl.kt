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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed Apache
 * Kafka cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * KafkaActionProperty kafkaActionProperty = KafkaActionProperty.builder()
 * .clientProperties(Map.of(
 * "clientPropertiesKey", "clientProperties"))
 * .destinationArn("destinationArn")
 * .topic("topic")
 * // the properties below are optional
 * .key("key")
 * .partition("partition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleKafkaActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.KafkaActionProperty.Builder =
        CfnTopicRule.KafkaActionProperty.builder()

    /** @param clientProperties Properties of the Apache Kafka producer client. */
    public fun clientProperties(clientProperties: Map<String, String>) {
        cdkBuilder.clientProperties(clientProperties)
    }

    /** @param clientProperties Properties of the Apache Kafka producer client. */
    public fun clientProperties(clientProperties: IResolvable) {
        cdkBuilder.clientProperties(clientProperties)
    }

    /** @param destinationArn The ARN of Kafka action's VPC `TopicRuleDestination` . */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /** @param key The Kafka message key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param partition The Kafka message partition. */
    public fun partition(partition: String) {
        cdkBuilder.partition(partition)
    }

    /** @param topic The Kafka topic for messages to be sent to the Kafka broker. */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnTopicRule.KafkaActionProperty = cdkBuilder.build()
}
