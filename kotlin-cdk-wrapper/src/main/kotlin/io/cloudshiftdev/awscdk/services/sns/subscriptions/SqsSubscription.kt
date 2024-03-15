@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sns.ITopicSubscription
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.TopicSubscriptionConfig
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.sqs.IQueue as CloudshiftdevAwscdkServicesSqsIQueue
import software.amazon.awscdk.services.sqs.IQueue as AmazonAwscdkServicesSqsIQueue

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
public open class SqsSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sns.subscriptions.SqsSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  /**
   * Returns a configuration for an SQS queue to subscribe to an SNS topic.
   *
   * @param topic 
   */
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.subscriptions.SqsSubscription].
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
    public fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue)

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
     * The message to the queue is the same as it was sent to the topic.
     *
     * If false, the message will be wrapped in an SNS envelope.
     *
     * Default: false
     *
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic. 
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)
  }

  private class BuilderImpl(
    queue: AmazonAwscdkServicesSqsIQueue,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.SqsSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.SqsSubscription.Builder.create(queue)

    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     *
     * @param deadLetterQueue Queue to be used as dead letter queue. 
     */
    override fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CloudshiftdevAwscdkServicesSqsIQueue::unwrap))
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
     * The message to the queue is the same as it was sent to the topic.
     *
     * If false, the message will be wrapped in an SNS envelope.
     *
     * Default: false
     *
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic. 
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.SqsSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(queue: CloudshiftdevAwscdkServicesSqsIQueue,
        block: Builder.() -> Unit = {}): SqsSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSqsIQueue.unwrap(queue))
      return SqsSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.SqsSubscription):
        SqsSubscription = SqsSubscription(cdkObject)

    internal fun unwrap(wrapped: SqsSubscription):
        software.amazon.awscdk.services.sns.subscriptions.SqsSubscription = wrapped.cdkObject
  }
}
