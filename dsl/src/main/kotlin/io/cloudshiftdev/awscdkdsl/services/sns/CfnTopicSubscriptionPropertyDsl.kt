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

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sns.CfnTopic

/**
 * `Subscription` is an embedded property that describes the subscription endpoints of an Amazon SNS
 * topic.
 *
 * For full control over subscription behavior (for example, delivery policy, filtering, raw message
 * delivery, and cross-region subscriptions), use the
 * [AWS::SNS::Subscription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
 * .endpoint("endpoint")
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html)
 */
@CdkDslMarker
public class CfnTopicSubscriptionPropertyDsl {
    private val cdkBuilder: CfnTopic.SubscriptionProperty.Builder =
        CfnTopic.SubscriptionProperty.builder()

    /**
     * @param endpoint The endpoint that receives notifications from the Amazon SNS topic. The
     *   endpoint value depends on the protocol that you specify. For more information, see the
     *   `Endpoint` parameter of the
     *   `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     *   *Amazon SNS API Reference* .
     */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param protocol The subscription's protocol. For more information, see the `Protocol`
     *   parameter of the
     *   `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     *   *Amazon SNS API Reference* .
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnTopic.SubscriptionProperty = cdkBuilder.build()
}
