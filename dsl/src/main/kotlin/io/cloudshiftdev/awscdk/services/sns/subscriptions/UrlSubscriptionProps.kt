package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.SubscriptionProtocol
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface UrlSubscriptionProps : SubscriptionProps {
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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

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
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
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
    override val cdkObject: software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps,
  ) : CdkObject(cdkObject), UrlSubscriptionProps {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

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
        UrlSubscriptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UrlSubscriptionProps):
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.subscriptions.UrlSubscriptionProps
  }
}
