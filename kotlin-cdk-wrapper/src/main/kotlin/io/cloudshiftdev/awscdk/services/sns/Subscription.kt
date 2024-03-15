@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new subscription.
 *
 * Prefer to use the `ITopic.addSubscription()` methods to create instances of
 * this class.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.alpha.DeliveryStream;
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
public open class Subscription internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.Subscription,
) : Resource(cdkObject) {
  /**
   * The DLQ associated with this subscription if present.
   */
  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.Subscription].
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
     * The subscription endpoint.
     *
     * The meaning of this value depends on the value for 'protocol'.
     *
     * @param endpoint The subscription endpoint. 
     */
    public fun endpoint(endpoint: String)

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
     * What type of subscription to add.
     *
     * @param protocol What type of subscription to add. 
     */
    public fun protocol(protocol: SubscriptionProtocol)

    /**
     * true if raw message delivery is enabled for the subscription.
     *
     * Raw messages are free of JSON formatting and can be
     * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes
     * in the Amazon Simple
     * Notification Service API Reference.
     *
     * Default: false
     *
     * @param rawMessageDelivery true if raw message delivery is enabled for the subscription. 
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    /**
     * The region where the topic resides, in the case of cross-region subscriptions.
     *
     * Default: - the region where the CloudFormation stack is being deployed.
     *
     * @param region The region where the topic resides, in the case of cross-region subscriptions. 
     */
    public fun region(region: String)

    /**
     * Arn of role allowing access to firehose delivery stream.
     *
     * Required for a firehose subscription protocol.
     *
     * Default: - No subscription role is provided
     *
     * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream. 
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String)

    /**
     * The topic to subscribe to.
     *
     * @param topic The topic to subscribe to. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.Subscription.Builder =
        software.amazon.awscdk.services.sns.Subscription.Builder.create(scope, id)

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
     * The subscription endpoint.
     *
     * The meaning of this value depends on the value for 'protocol'.
     *
     * @param endpoint The subscription endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
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
     * What type of subscription to add.
     *
     * @param protocol What type of subscription to add. 
     */
    override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
    }

    /**
     * true if raw message delivery is enabled for the subscription.
     *
     * Raw messages are free of JSON formatting and can be
     * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes
     * in the Amazon Simple
     * Notification Service API Reference.
     *
     * Default: false
     *
     * @param rawMessageDelivery true if raw message delivery is enabled for the subscription. 
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * The region where the topic resides, in the case of cross-region subscriptions.
     *
     * Default: - the region where the CloudFormation stack is being deployed.
     *
     * @param region The region where the topic resides, in the case of cross-region subscriptions. 
     */
    override fun region(region: String) {
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
    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    /**
     * The topic to subscribe to.
     *
     * @param topic The topic to subscribe to. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.Subscription = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Subscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Subscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Subscription): Subscription =
        Subscription(cdkObject)

    internal fun unwrap(wrapped: Subscription): software.amazon.awscdk.services.sns.Subscription =
        wrapped.cdkObject
  }
}
