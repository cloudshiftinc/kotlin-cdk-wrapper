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
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Options for email subscriptions.
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
 * EmailSubscriptionProps emailSubscriptionProps = EmailSubscriptionProps.builder()
 * .deadLetterQueue(queue)
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .json(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class EmailSubscriptionPropsDsl {
    private val cdkBuilder: EmailSubscriptionProps.Builder = EmailSubscriptionProps.builder()

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

    /**
     * @param json Indicates if the full notification JSON should be sent to the email address or
     *   just the message text.
     */
    public fun json(json: Boolean) {
        cdkBuilder.json(json)
    }

    public fun build(): EmailSubscriptionProps = cdkBuilder.build()
}
