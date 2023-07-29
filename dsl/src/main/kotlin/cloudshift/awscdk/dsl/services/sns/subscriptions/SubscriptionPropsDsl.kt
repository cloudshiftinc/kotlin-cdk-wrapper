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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.subscriptions.SubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Options to subscribing to an SNS topic.
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
 * SubscriptionProps subscriptionProps = SubscriptionProps.builder()
 * .deadLetterQueue(queue)
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .build();
 * ```
 */
@CdkDslMarker
public class SubscriptionPropsDsl {
    private val cdkBuilder: SubscriptionProps.Builder = SubscriptionProps.builder()

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

    public fun build(): SubscriptionProps = cdkBuilder.build()
}
