@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscription
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class EmailSubscriptionDsl(
  emailAddress: String,
) {
  private val cdkBuilder: EmailSubscription.Builder = EmailSubscription.Builder.create(emailAddress)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  public fun json(json: Boolean) {
    cdkBuilder.json(json)
  }

  public fun build(): EmailSubscription = cdkBuilder.build()
}
