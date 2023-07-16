@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class SqsSubscriptionDsl(
  arg0: IQueue,
) {
  private val cdkBuilder: SqsSubscription.Builder = SqsSubscription.Builder.create(arg0)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun filterPolicy(filterPolicy: Map<String, out SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  public
      fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, out FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    cdkBuilder.rawMessageDelivery(rawMessageDelivery)
  }

  public fun build(): SqsSubscription = cdkBuilder.build()
}
