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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition

/**
 * Subscriptions define how MQTT messages can be exchanged between devices, functions, and
 * connectors in the group, and with AWS IoT or the local shadow service.
 *
 * A subscription defines a message source, message target, and a topic (or subject) that's used to
 * route messages from the source to the target. A subscription defines the message flow in one
 * direction, from the source to the target. For two-way communication, you must set up two
 * subscriptions, one for each direction.
 *
 * In an AWS CloudFormation template, the `Subscriptions` property of the
 * [`SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
 * property type contains a list of `Subscription` property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
 */
@CdkDslMarker
public class CfnSubscriptionDefinitionSubscriptionPropertyDsl {
    private val cdkBuilder: CfnSubscriptionDefinition.SubscriptionProperty.Builder =
        CfnSubscriptionDefinition.SubscriptionProperty.builder()

    /**
     * @param id A descriptive or arbitrary ID for the subscription. This value must be unique
     *   within the subscription definition version. Maximum length is 128 characters with pattern
     *   `[a-zA-Z0-9:_-]+` .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param source The originator of the message. The value can be a thing ARN, the ARN of a
     *   Lambda function alias (recommended) or version, a connector ARN, `cloud` (which represents
     *   the AWS IoT cloud), or `GGShadowService` .
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /** @param subject The MQTT topic used to route the message. */
    public fun subject(subject: String) {
        cdkBuilder.subject(subject)
    }

    /**
     * @param target The destination of the message. The value can be a thing ARN, the ARN of a
     *   Lambda function alias (recommended) or version, a connector ARN, `cloud` (which represents
     *   the AWS IoT cloud), or `GGShadowService` .
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnSubscriptionDefinition.SubscriptionProperty = cdkBuilder.build()
}
