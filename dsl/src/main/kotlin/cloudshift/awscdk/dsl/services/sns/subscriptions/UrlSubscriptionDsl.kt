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

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscription
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Use a URL as a subscription target.
 *
 * The message will be POSTed to the given URL.
 *
 * Example:
 * ```
 * Topic myTopic = new Topic(this, "MyTopic");
 * myTopic.addSubscription(new UrlSubscription("https://foobar.com/"));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-http-https-endpoint-as-subscriber.html)
 */
@CdkDslMarker
public class UrlSubscriptionDsl(
    url: String,
) {
    private val cdkBuilder: UrlSubscription.Builder = UrlSubscription.Builder.create(url)

    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicy The filter policy.
     */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    /**
     * The filter policy that is applied on the message body.
     *
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
     */
    public fun filterPolicyWithMessageBody(
        filterPolicyWithMessageBody: Map<String, FilterOrPolicy>
    ) {
        cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
    }

    /**
     * The subscription's protocol.
     *
     * Default: - Protocol is derived from url
     *
     * @param protocol The subscription's protocol.
     */
    public fun protocol(protocol: SubscriptionProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * The message to the queue is the same as it was sent to the topic.
     *
     * If false, the message will be wrapped in an SNS envelope.
     *
     * Default: false
     *
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic.
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun build(): UrlSubscription = cdkBuilder.build()
}
