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
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Specifies a Kafka header using key-value pairs when you create a Rule’s Kafka Action.
 *
 * You can use these headers to route data from IoT clients to downstream Kafka clusters without
 * modifying your message payload.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * KafkaActionHeaderProperty kafkaActionHeaderProperty = KafkaActionHeaderProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kafkaactionheader.html)
 */
@CdkDslMarker
public class CfnTopicRuleKafkaActionHeaderPropertyDsl {
    private val cdkBuilder: CfnTopicRule.KafkaActionHeaderProperty.Builder =
        CfnTopicRule.KafkaActionHeaderProperty.builder()

    /** @param key The key of the Kafka header. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of the Kafka header. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTopicRule.KafkaActionHeaderProperty = cdkBuilder.build()
}
