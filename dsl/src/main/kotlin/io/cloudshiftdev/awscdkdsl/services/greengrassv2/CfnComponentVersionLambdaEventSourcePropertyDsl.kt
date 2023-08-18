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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains information about an event source for an AWS Lambda function.
 *
 * The event source defines the topics on which this Lambda function subscribes to receive messages
 * that run the function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaEventSourceProperty lambdaEventSourceProperty = LambdaEventSourceProperty.builder()
 * .topic("topic")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdaeventsource.html)
 */
@CdkDslMarker
public class CfnComponentVersionLambdaEventSourcePropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaEventSourceProperty.Builder =
        CfnComponentVersion.LambdaEventSourceProperty.builder()

    /** @param topic The topic to which to subscribe to receive event messages. */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    /**
     * @param type The type of event source. Choose from the following options:.
     * * `PUB_SUB` – Subscribe to local publish/subscribe messages. This event source type doesn't
     *   support MQTT wildcards ( `+` and `#` ) in the event source topic.
     * * `IOT_CORE` – Subscribe to AWS IoT Core MQTT messages. This event source type supports MQTT
     *   wildcards ( `+` and `#` ) in the event source topic.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnComponentVersion.LambdaEventSourceProperty = cdkBuilder.build()
}
