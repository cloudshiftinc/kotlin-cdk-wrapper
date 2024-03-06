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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
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
 * .headers(List.of(KafkaActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
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

    private val _headers: MutableList<Any> = mutableListOf()

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

    /** @param headers The list of Kafka headers that you specify. */
    public fun headers(vararg headers: Any) {
        _headers.addAll(listOf(*headers))
    }

    /** @param headers The list of Kafka headers that you specify. */
    public fun headers(headers: Collection<Any>) {
        _headers.addAll(headers)
    }

    /** @param headers The list of Kafka headers that you specify. */
    public fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers)
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

    public fun build(): CfnTopicRule.KafkaActionProperty {
        if (_headers.isNotEmpty()) cdkBuilder.headers(_headers)
        return cdkBuilder.build()
    }
}
