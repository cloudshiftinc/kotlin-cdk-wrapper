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

/**
 * Use an email address as a subscription target.
 *
 * Email subscriptions require confirmation.
 *
 * Example:
 *
 * ```
 * Topic myTopic = new Topic(this, "Topic");
 * CfnParameter emailAddress = new CfnParameter(this, "email-param");
 * myTopic.addSubscription(new EmailSubscription(emailAddress.getValueAsString()));
 * ```
 */
@CdkDslMarker
public class EmailSubscriptionDsl(
  emailAddress: String,
) {
  private val cdkBuilder: EmailSubscription.Builder = EmailSubscription.Builder.create(emailAddress)

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
   * Indicates if the full notification JSON should be sent to the email address or just the message
   * text.
   *
   * Default: false (Message text)
   *
   * @param json Indicates if the full notification JSON should be sent to the email address or just
   * the message text. 
   */
  public fun json(json: Boolean) {
    cdkBuilder.json(json)
  }

  public fun build(): EmailSubscription = cdkBuilder.build()
}
