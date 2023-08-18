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

package io.cloudshiftdev.awscdkdsl.services.sns.subscriptions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Options for URL subscriptions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * import software.amazon.awscdk.services.sns.subscriptions.*;
 * import software.amazon.awscdk.services.sqs.*;
 * FilterOrPolicy filterOrPolicy;
 * Queue queue;
 * SubscriptionFilter subscriptionFilter;
 * UrlSubscriptionProps urlSubscriptionProps = UrlSubscriptionProps.builder()
 * .deadLetterQueue(queue)
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .protocol(SubscriptionProtocol.HTTP)
 * .rawMessageDelivery(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class UrlSubscriptionPropsDsl {
    private val cdkBuilder: UrlSubscriptionProps.Builder = UrlSubscriptionProps.builder()

    /**
     * @param deadLetterQueue Queue to be used as dead letter queue. If not passed no dead letter
     *   queue is enabled.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /** @param filterPolicy The filter policy. */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    /**
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body. To
     *   apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     *   `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     */
    public fun filterPolicyWithMessageBody(
        filterPolicyWithMessageBody: Map<String, FilterOrPolicy>
    ) {
        cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
    }

    /** @param protocol The subscription's protocol. */
    public fun protocol(protocol: SubscriptionProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic.
     *   If false, the message will be wrapped in an SNS envelope.
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun build(): UrlSubscriptionProps = cdkBuilder.build()
}
