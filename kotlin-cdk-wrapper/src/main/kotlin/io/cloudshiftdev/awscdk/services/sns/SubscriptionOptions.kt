@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Options for creating a new subscription.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * FilterOrPolicy filterOrPolicy;
 * Queue queue;
 * SubscriptionFilter subscriptionFilter;
 * SubscriptionOptions subscriptionOptions = SubscriptionOptions.builder()
 * .endpoint("endpoint")
 * .protocol(SubscriptionProtocol.HTTP)
 * // the properties below are optional
 * .deadLetterQueue(queue)
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .rawMessageDelivery(false)
 * .region("region")
 * .subscriptionRoleArn("subscriptionRoleArn")
 * .build();
 * ```
 */
public interface SubscriptionOptions {
  /**
   * Queue to be used as dead letter queue.
   *
   * If not passed no dead letter queue is enabled.
   *
   * Default: - No dead letter queue enabled.
   */
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * The subscription endpoint.
   *
   * The meaning of this value depends on the value for 'protocol'.
   */
  public fun endpoint(): String

  /**
   * The filter policy.
   *
   * Default: - all messages are delivered
   */
  public fun filterPolicy(): Map<String, SubscriptionFilter> =
      unwrap(this).getFilterPolicy()?.mapValues{SubscriptionFilter.wrap(it.value)} ?: emptyMap()

  /**
   * The filter policy that is applied on the message body.
   *
   * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
   * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
   *
   * Default: - all messages are delivered
   */
  public fun filterPolicyWithMessageBody(): Map<String, FilterOrPolicy> =
      unwrap(this).getFilterPolicyWithMessageBody()?.mapValues{FilterOrPolicy.wrap(it.value)} ?:
      emptyMap()

  /**
   * What type of subscription to add.
   */
  public fun protocol(): SubscriptionProtocol

  /**
   * true if raw message delivery is enabled for the subscription.
   *
   * Raw messages are free of JSON formatting and can be
   * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes in
   * the Amazon Simple
   * Notification Service API Reference.
   *
   * Default: false
   */
  public fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

  /**
   * The region where the topic resides, in the case of cross-region subscriptions.
   *
   * Default: - the region where the CloudFormation stack is being deployed.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Arn of role allowing access to firehose delivery stream.
   *
   * Required for a firehose subscription protocol.
   *
   * Default: - No subscription role is provided
   */
  public fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  /**
   * A builder for [SubscriptionOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param endpoint The subscription endpoint. 
     * The meaning of this value depends on the value for 'protocol'.
     */
    public fun endpoint(endpoint: String)

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
     * @param protocol What type of subscription to add. 
     */
    public fun protocol(protocol: SubscriptionProtocol)

    /**
     * @param rawMessageDelivery true if raw message delivery is enabled for the subscription.
     * Raw messages are free of JSON formatting and can be
     * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes
     * in the Amazon Simple
     * Notification Service API Reference.
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    /**
     * @param region The region where the topic resides, in the case of cross-region subscriptions.
     */
    public fun region(region: String)

    /**
     * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream.
     * Required for a firehose subscription protocol.
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.SubscriptionOptions.Builder =
        software.amazon.awscdk.services.sns.SubscriptionOptions.builder()

    /**
     * @param deadLetterQueue Queue to be used as dead letter queue.
     * If not passed no dead letter queue is enabled.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * @param endpoint The subscription endpoint. 
     * The meaning of this value depends on the value for 'protocol'.
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
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
     * @param protocol What type of subscription to add. 
     */
    override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
    }

    /**
     * @param rawMessageDelivery true if raw message delivery is enabled for the subscription.
     * Raw messages are free of JSON formatting and can be
     * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes
     * in the Amazon Simple
     * Notification Service API Reference.
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * @param region The region where the topic resides, in the case of cross-region subscriptions.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream.
     * Required for a firehose subscription protocol.
     */
    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.SubscriptionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.SubscriptionOptions,
  ) : CdkObject(cdkObject), SubscriptionOptions {
    /**
     * Queue to be used as dead letter queue.
     *
     * If not passed no dead letter queue is enabled.
     *
     * Default: - No dead letter queue enabled.
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The subscription endpoint.
     *
     * The meaning of this value depends on the value for 'protocol'.
     */
    override fun endpoint(): String = unwrap(this).getEndpoint()

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
     * What type of subscription to add.
     */
    override fun protocol(): SubscriptionProtocol =
        unwrap(this).getProtocol().let(SubscriptionProtocol::wrap)

    /**
     * true if raw message delivery is enabled for the subscription.
     *
     * Raw messages are free of JSON formatting and can be
     * sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes
     * in the Amazon Simple
     * Notification Service API Reference.
     *
     * Default: false
     */
    override fun rawMessageDelivery(): Boolean? = unwrap(this).getRawMessageDelivery()

    /**
     * The region where the topic resides, in the case of cross-region subscriptions.
     *
     * Default: - the region where the CloudFormation stack is being deployed.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Arn of role allowing access to firehose delivery stream.
     *
     * Required for a firehose subscription protocol.
     *
     * Default: - No subscription role is provided
     */
    override fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.SubscriptionOptions):
        SubscriptionOptions = CdkObjectWrappers.wrap(cdkObject) as? SubscriptionOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionOptions):
        software.amazon.awscdk.services.sns.SubscriptionOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sns.SubscriptionOptions
  }
}
