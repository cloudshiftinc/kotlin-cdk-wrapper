@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class SnsEventSourceDsl(
    topic: ITopic,
) {
    private val cdkBuilder: SnsEventSource.Builder = SnsEventSource.Builder.create(topic)

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
        cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
    }

    public fun build(): SnsEventSource = cdkBuilder.build()
}
