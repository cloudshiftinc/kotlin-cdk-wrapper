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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to republish to another topic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * RepublishActionProperty republishActionProperty = RepublishActionProperty.builder()
 * .roleArn("roleArn")
 * .topic("topic")
 * // the properties below are optional
 * .headers(RepublishActionHeadersProperty.builder()
 * .contentType("contentType")
 * .correlationData("correlationData")
 * .messageExpiry("messageExpiry")
 * .payloadFormatIndicator("payloadFormatIndicator")
 * .responseTopic("responseTopic")
 * .userProperties(List.of(UserPropertyProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .qos(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleRepublishActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.RepublishActionProperty.Builder =
        CfnTopicRule.RepublishActionProperty.builder()

    /**
     * @param headers MQTT Version 5.0 headers information. For more information, see
     *   [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
     *   Developer Guide.
     */
    public fun headers(headers: IResolvable) {
        cdkBuilder.headers(headers)
    }

    /**
     * @param headers MQTT Version 5.0 headers information. For more information, see
     *   [MQTT](https://docs.aws.amazon.com//iot/latest/developerguide/mqtt.html) in the IoT Core
     *   Developer Guide.
     */
    public fun headers(headers: CfnTopicRule.RepublishActionHeadersProperty) {
        cdkBuilder.headers(headers)
    }

    /**
     * @param qos The Quality of Service (QoS) level to use when republishing messages. The default
     *   value is 0.
     */
    public fun qos(qos: Number) {
        cdkBuilder.qos(qos)
    }

    /** @param roleArn The ARN of the IAM role that grants access. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param topic The name of the MQTT topic. */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnTopicRule.RepublishActionProperty = cdkBuilder.build()
}
