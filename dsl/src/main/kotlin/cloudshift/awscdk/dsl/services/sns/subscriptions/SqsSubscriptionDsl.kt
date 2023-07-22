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

/**
 * Use an SQS queue as a subscription target.
 *
 * Example:
 *
 * ```
 * Queue queue;
 * Topic myTopic = new Topic(this, "MyTopic");
 * myTopic.addSubscription(new SqsSubscription(queue));
 * ```
 */
@CdkDslMarker
public class SqsSubscriptionDsl(
  queue: IQueue,
) {
  private val cdkBuilder: SqsSubscription.Builder = SqsSubscription.Builder.create(queue)

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
  public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  /**
   * The message to the queue is the same as it was sent to the topic.
   *
   * If false, the message will be wrapped in an SNS envelope.
   *
   * Default: false
   *
   * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic. 
   */
  public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    cdkBuilder.rawMessageDelivery(rawMessageDelivery)
  }

  public fun build(): SqsSubscription = cdkBuilder.build()
}
