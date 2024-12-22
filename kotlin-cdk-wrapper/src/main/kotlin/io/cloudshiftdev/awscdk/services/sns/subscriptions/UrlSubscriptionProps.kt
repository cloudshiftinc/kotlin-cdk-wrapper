@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.DeliveryPolicy
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.SubscriptionProtocol
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Options for URL subscriptions.
 *
 * Example:
 *
 * ```
 * Topic myTopic = new Topic(this, "MyTopic");
 * myTopic.addSubscription(
 * UrlSubscription.Builder.create("https://foobar.com/")
 * .deliveryPolicy(DeliveryPolicy.builder()
 * .healthyRetryPolicy(HealthyRetryPolicy.builder()
 * .minDelayTarget(Duration.seconds(5))
 * .maxDelayTarget(Duration.seconds(10))
 * .numRetries(6)
 * .backoffFunction(BackoffFunction.EXPONENTIAL)
 * .build())
 * .throttlePolicy(ThrottlePolicy.builder()
 * .maxReceivesPerSecond(10)
 * .build())
 * .requestPolicy(RequestPolicy.builder()
 * .headerContentType("application/json")
 * .build())
 * .build())
 * .build());
 * ```
 */
public interface UrlSubscriptionProps : SubscriptionProps {
  /**
   * The delivery policy.
   *
   * Default: - if the initial delivery of the message fails, three retries with a delay between
   * failed attempts set at 20 seconds
   */
  public fun deliveryPolicy(): DeliveryPolicy? =
      unwrap(this).getDeliveryPolicy()?.let(DeliveryPolicy::wrap)

  /**
   * The subscription's protocol.
   *
   * Default: - Protocol is derived from url
   */
  public fun protocol(): SubscriptionProtocol? =
      unwrap(this).getProtocol()?.let(SubscriptionProtocol::wrap)

  /**
   * The message to the queue is the same as it was sent to the topic.
   *
   * If false, the message will be wrapped in an SNS envelope.
   *
   * Default: false
   */
  public fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

  /**
   * A builder for [UrlSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param deliveryPolicy The delivery policy.
     */
    public fun deliveryPolicy(deliveryPolicy: DeliveryPolicy)

    /**
     * @param deliveryPolicy The delivery policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80ff28c9732efceee233b16c54975c46eb955e14a45b8a87e60a3448ecca8abd")
    public fun deliveryPolicy(deliveryPolicy: DeliveryPolicy.Builder.() -> Unit)

    /**
     * @param filterPolicy The filter policy.
     */
    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    /**
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     */
    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)

    /**
     * @param protocol The subscription's protocol.
     */
    public fun protocol(protocol: SubscriptionProtocol)

    /**
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic.
     * If false, the message will be wrapped in an SNS envelope.
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps.Builder =
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps.builder()

    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param deliveryPolicy The delivery policy.
     */
    override fun deliveryPolicy(deliveryPolicy: DeliveryPolicy) {
      cdkBuilder.deliveryPolicy(deliveryPolicy.let(DeliveryPolicy.Companion::unwrap))
    }

    /**
     * @param deliveryPolicy The delivery policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80ff28c9732efceee233b16c54975c46eb955e14a45b8a87e60a3448ecca8abd")
    override fun deliveryPolicy(deliveryPolicy: DeliveryPolicy.Builder.() -> Unit): Unit =
        deliveryPolicy(DeliveryPolicy(deliveryPolicy))

    /**
     * @param filterPolicy The filter policy.
     */
    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    /**
     * @param filterPolicyWithMessageBody The filter policy that is applied on the message body.
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     */
    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    /**
     * @param protocol The subscription's protocol.
     */
    override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol.Companion::unwrap))
    }

    /**
     * @param rawMessageDelivery The message to the queue is the same as it was sent to the topic.
     * If false, the message will be wrapped in an SNS envelope.
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps,
  ) : CdkObject(cdkObject),
      UrlSubscriptionProps {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The delivery policy.
     *
     * Default: - if the initial delivery of the message fails, three retries with a delay between
     * failed attempts set at 20 seconds
     */
    override fun deliveryPolicy(): DeliveryPolicy? =
        unwrap(this).getDeliveryPolicy()?.let(DeliveryPolicy::wrap)

    /**
     * The filter policy.
     *
     * Default: - all messages are delivered
     */
    override fun filterPolicy(): Map<String, SubscriptionFilter> =
        unwrap(this).getFilterPolicy()?.mapValues{SubscriptionFilter.wrap(it.value)} ?: emptyMap()

    /**
     * The filter policy that is applied on the message body.
     *
     * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
     * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
     *
     * Default: - all messages are delivered
     */
    override fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
        unwrap(this).getFilterPolicyWithMessageBody()?.mapValues{FilterOrPolicy.wrap(it.value)} ?:
        emptyMap()

    /**
     * The subscription's protocol.
     *
     * Default: - Protocol is derived from url
     */
    override fun protocol(): SubscriptionProtocol? =
        unwrap(this).getProtocol()?.let(SubscriptionProtocol::wrap)

    /**
     * The message to the queue is the same as it was sent to the topic.
     *
     * If false, the message will be wrapped in an SNS envelope.
     *
     * Default: false
     */
    override fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UrlSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps):
        UrlSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? UrlSubscriptionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UrlSubscriptionProps):
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps
  }
}
