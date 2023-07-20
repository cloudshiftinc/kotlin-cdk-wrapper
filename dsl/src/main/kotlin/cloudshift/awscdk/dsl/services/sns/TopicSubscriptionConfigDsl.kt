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

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sns.TopicSubscriptionConfig
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.Construct
import software.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class TopicSubscriptionConfigDsl {
    private val cdkBuilder: TopicSubscriptionConfig.Builder = TopicSubscriptionConfig.builder()

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
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

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun subscriberId(subscriberId: String) {
        cdkBuilder.subscriberId(subscriberId)
    }

    public fun subscriberScope(subscriberScope: Construct) {
        cdkBuilder.subscriberScope(subscriberScope)
    }

    public fun subscriptionDependency(subscriptionDependency: IDependable) {
        cdkBuilder.subscriptionDependency(subscriptionDependency)
    }

    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
        cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun build(): TopicSubscriptionConfig = cdkBuilder.build()
}
