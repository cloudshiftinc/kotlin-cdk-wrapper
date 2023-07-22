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

/**
 * A new subscription.
 *
 * Prefer to use the `ITopic.addSubscription()` methods to create instances of
 * this class.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.kinesisfirehose.alpha.DeliveryStream;
 * DeliveryStream stream;
 * Topic topic = new Topic(this, "Topic");
 * Subscription.Builder.create(this, "Subscription")
 * .topic(topic)
 * .endpoint(stream.getDeliveryStreamArn())
 * .protocol(SubscriptionProtocol.FIREHOSE)
 * .subscriptionRoleArn("SAMPLE_ARN")
 * .build();
 * ```
 */
@CdkDslMarker
public class SubscriptionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Subscription.Builder = Subscription.Builder.create(scope, id)

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
   * The subscription endpoint.
   *
   * The meaning of this value depends on the value for 'protocol'.
   *
   * @param endpoint The subscription endpoint. 
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
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
   * What type of subscription to add.
   *
   * @param protocol What type of subscription to add. 
   */
  public fun protocol(protocol: SubscriptionProtocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * true if raw message delivery is enabled for the subscription.
   *
   * Raw messages are free of JSON formatting and can be
   * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes in
   * the Amazon Simple
   * Notification Service API Reference.
   *
   * Default: false
   *
   * @param rawMessageDelivery true if raw message delivery is enabled for the subscription. 
   */
  public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    cdkBuilder.rawMessageDelivery(rawMessageDelivery)
  }

  /**
   * The region where the topic resides, in the case of cross-region subscriptions.
   *
   * Default: - the region where the CloudFormation stack is being deployed.
   *
   * @param region The region where the topic resides, in the case of cross-region subscriptions. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * Arn of role allowing access to firehose delivery stream.
   *
   * Required for a firehose subscription protocol.
   *
   * Default: - No subscription role is provided
   *
   * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream. 
   */
  public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
  }

  /**
   * The topic to subscribe to.
   *
   * @param topic The topic to subscribe to. 
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Subscription = cdkBuilder.build()
}
