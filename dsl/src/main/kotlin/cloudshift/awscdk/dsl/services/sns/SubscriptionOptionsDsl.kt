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

  /**
   * @param deadLetterQueue Queue to be used as dead letter queue.
   * If not passed no dead letter queue is enabled.
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * @param endpoint The subscription endpoint. 
   * The meaning of this value depends on the value for 'protocol'.
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param filterPolicy The filter policy.
   */
  public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  /**
   * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
   * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
   * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
   */
  public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  /**
   * @param protocol What type of subscription to add. 
   */
  public fun protocol(protocol: SubscriptionProtocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param rawMessageDelivery true if raw message delivery is enabled for the subscription.
   * Raw messages are free of JSON formatting and can be
   * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes in
   * the Amazon Simple
   * Notification Service API Reference.
   */
  public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    cdkBuilder.rawMessageDelivery(rawMessageDelivery)
  }

  /**
   * @param region The region where the topic resides, in the case of cross-region subscriptions.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream.
   * Required for a firehose subscription protocol.
   */
  public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
  }

  public fun build(): SubscriptionOptions = cdkBuilder.build()
}
