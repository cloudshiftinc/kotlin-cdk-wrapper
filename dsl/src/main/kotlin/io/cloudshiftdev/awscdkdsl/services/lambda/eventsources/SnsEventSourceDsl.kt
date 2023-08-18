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

package io.cloudshiftdev.awscdkdsl.services.lambda.eventsources

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Use an Amazon SNS topic as an event source for AWS Lambda.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.sns.*;
 * import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource;
 * Topic topic;
 * Function fn;
 * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
 * fn.addEventSource(SnsEventSource.Builder.create(topic)
 * .filterPolicy(Map.of())
 * .deadLetterQueue(deadLetterQueue)
 * .build());
 * ```
 */
@CdkDslMarker
public class SnsEventSourceDsl(
    topic: ITopic,
) {
    private val cdkBuilder: SnsEventSource.Builder = SnsEventSource.Builder.create(topic)

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

    public fun build(): SnsEventSource = cdkBuilder.build()
}
