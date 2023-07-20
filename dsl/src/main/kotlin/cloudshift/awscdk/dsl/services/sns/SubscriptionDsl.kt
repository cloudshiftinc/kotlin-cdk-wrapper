@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.Construct

@CdkDslMarker
public class SubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Subscription.Builder = Subscription.Builder.create(scope, id)

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

  public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
  }

  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Subscription = cdkBuilder.build()
}
