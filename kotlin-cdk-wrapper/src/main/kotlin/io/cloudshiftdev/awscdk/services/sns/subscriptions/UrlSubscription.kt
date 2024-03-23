@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sns.ITopicSubscription
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.SubscriptionProtocol
import io.cloudshiftdev.awscdk.services.sns.TopicSubscriptionConfig
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Use a URL as a subscription target.
 *
 * The message will be POSTed to the given URL.
 *
 * Example:
 *
 * ```
 * Topic myTopic = new Topic(this, "MyTopic");
 * myTopic.addSubscription(new UrlSubscription("https://foobar.com/"));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-http-https-endpoint-as-subscriber.html)
 */
public open class UrlSubscription(
  cdkObject: software.amazon.awscdk.services.sns.subscriptions.UrlSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  public constructor(url: String) :
      this(software.amazon.awscdk.services.sns.subscriptions.UrlSubscription(url)
  )

  public constructor(url: String, props: UrlSubscriptionProps) :
      this(software.amazon.awscdk.services.sns.subscriptions.UrlSubscription(url,
      props.let(UrlSubscriptionProps::unwrap))
  )

  public constructor(url: String, props: UrlSubscriptionProps.Builder.() -> Unit) : this(url,
      UrlSubscriptionProps(props)
  )

  /**
   * Returns a configuration for a URL to subscribe to an SNS topic.
   *
   * @param _topic 
   */
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.subscriptions.UrlSubscription].
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
     * The subscription's protocol.
     *
     * Default: - Protocol is derived from url
     *
     * @param protocol The subscription's protocol. 
     */
    public fun protocol(protocol: SubscriptionProtocol)

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
    url: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscription.Builder.create(url)

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
     * The subscription's protocol.
     *
     * Default: - Protocol is derived from url
     *
     * @param protocol The subscription's protocol. 
     */
    override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
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

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.UrlSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(url: String, block: Builder.() -> Unit = {}): UrlSubscription {
      val builderImpl = BuilderImpl(url)
      return UrlSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.UrlSubscription):
        UrlSubscription = UrlSubscription(cdkObject)

    internal fun unwrap(wrapped: UrlSubscription):
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscription
  }
}
