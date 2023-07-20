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

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class UrlSubscriptionPropsDsl {
    private val cdkBuilder: UrlSubscriptionProps.Builder = UrlSubscriptionProps.builder()

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
        cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
    }

    public fun protocol(protocol: SubscriptionProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun build(): UrlSubscriptionProps = cdkBuilder.build()
}
