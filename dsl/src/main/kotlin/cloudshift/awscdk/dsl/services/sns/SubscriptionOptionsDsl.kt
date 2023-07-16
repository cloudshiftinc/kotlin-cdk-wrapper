@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.SubscriptionOptions
import software.amazon.awscdk.services.sns.SubscriptionProtocol
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class SubscriptionOptionsDsl {
  private val cdkBuilder: SubscriptionOptions.Builder = SubscriptionOptions.builder()

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun filterPolicy(filterPolicy: Map<String, out SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  public
      fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, out FilterOrPolicy>) {
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

  public fun build(): SubscriptionOptions = cdkBuilder.build()
}
