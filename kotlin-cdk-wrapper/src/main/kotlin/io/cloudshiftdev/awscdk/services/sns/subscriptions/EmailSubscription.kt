@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sns.ITopicSubscription
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.TopicSubscriptionConfig
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

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
public open class EmailSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sns.subscriptions.EmailSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  /**
   * Returns a configuration for an email address to subscribe to an SNS topic.
   *
   * @param _topic 
   */
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.subscriptions.EmailSubscription].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicy The filter policy. 
     */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

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
    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)

    /**
     * Indicates if the full notification JSON should be sent to the email address or just the
     * message text.
     *
     * Default: false (Message text)
     *
     * @param json Indicates if the full notification JSON should be sent to the email address or
     * just the message text. 
     */
    public fun json(json: Boolean)
  }

  private class BuilderImpl(
    emailAddress: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription.Builder.create(emailAddress)

    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     *
     * @param filterPolicy The filter policy. 
     */
    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
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
    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    /**
     * Indicates if the full notification JSON should be sent to the email address or just the
     * message text.
     *
     * Default: false (Message text)
     *
     * @param json Indicates if the full notification JSON should be sent to the email address or
     * just the message text. 
     */
    override fun json(json: Boolean) {
      cdkBuilder.json(json)
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.EmailSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(emailAddress: String, block: Builder.() -> Unit = {}):
        EmailSubscription {
      val builderImpl = BuilderImpl(emailAddress)
      return EmailSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.EmailSubscription):
        EmailSubscription = EmailSubscription(cdkObject)

    internal fun unwrap(wrapped: EmailSubscription):
        software.amazon.awscdk.services.sns.subscriptions.EmailSubscription = wrapped.cdkObject
  }
}
