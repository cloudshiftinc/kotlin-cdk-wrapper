@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Subscription configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * import software.constructs.*;
 * Construct construct;
 * IDependable dependable;
 * FilterOrPolicy filterOrPolicy;
 * Queue queue;
 * SubscriptionFilter subscriptionFilter;
 * TopicSubscriptionConfig topicSubscriptionConfig = TopicSubscriptionConfig.builder()
 * .endpoint("endpoint")
 * .protocol(SubscriptionProtocol.HTTP)
 * .subscriberId("subscriberId")
 * // the properties below are optional
 * .deadLetterQueue(queue)
 * .deliveryPolicy(DeliveryPolicy.builder()
 * .healthyRetryPolicy(HealthyRetryPolicy.builder()
 * .backoffFunction(BackoffFunction.ARITHMETIC)
 * .maxDelayTarget(Duration.minutes(30))
 * .minDelayTarget(Duration.minutes(30))
 * .numMaxDelayRetries(123)
 * .numMinDelayRetries(123)
 * .numNoDelayRetries(123)
 * .numRetries(123)
 * .build())
 * .requestPolicy(RequestPolicy.builder()
 * .headerContentType("headerContentType")
 * .build())
 * .throttlePolicy(ThrottlePolicy.builder()
 * .maxReceivesPerSecond(123)
 * .build())
 * .build())
 * .filterPolicy(Map.of(
 * "filterPolicyKey", subscriptionFilter))
 * .filterPolicyWithMessageBody(Map.of(
 * "filterPolicyWithMessageBodyKey", filterOrPolicy))
 * .rawMessageDelivery(false)
 * .region("region")
 * .subscriberScope(construct)
 * .subscriptionDependency(dependable)
 * .subscriptionRoleArn("subscriptionRoleArn")
 * .build();
 * ```
 */
public interface TopicSubscriptionConfig : SubscriptionOptions {
  /**
   * The id of the SNS subscription resource created under `scope`.
   *
   * In most
   * cases, it is recommended to use the `uniqueId` of the topic you are
   * subscribing to.
   */
  public fun subscriberId(): String

  /**
   * The scope in which to create the SNS subscription resource.
   *
   * Normally you'd
   * want the subscription to be created on the consuming stack because the
   * topic is usually referenced by the consumer's resource policy (e.g. SQS
   * queue policy). Otherwise, it will cause a cyclic reference.
   *
   * If this is undefined, the subscription will be created on the topic's stack.
   *
   * Default: - use the topic as the scope of the subscription, in which case `subscriberId` must be
   * defined.
   */
  public fun subscriberScope(): Construct? = unwrap(this).getSubscriberScope()?.let(Construct::wrap)

  /**
   * The resources that need to be created before the subscription can be safely created.
   *
   * For example for SQS subscription, the subscription needs to have a dependency on the SQS queue
   * policy
   * in order for the subscription to successfully deliver messages.
   *
   * Default: - empty list
   */
  public fun subscriptionDependency(): IDependable? =
      unwrap(this).getSubscriptionDependency()?.let(IDependable::wrap)

  /**
   * A builder for [TopicSubscriptionConfig]
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
    @JvmName("a97c0035d50678bf6d8a22fcb4294e449db8146af282d98ffae0484c06b359cb")
    public fun deliveryPolicy(deliveryPolicy: DeliveryPolicy.Builder.() -> Unit)

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
     * @param subscriberId The id of the SNS subscription resource created under `scope`. 
     * In most
     * cases, it is recommended to use the `uniqueId` of the topic you are
     * subscribing to.
     */
    public fun subscriberId(subscriberId: String)

    /**
     * @param subscriberScope The scope in which to create the SNS subscription resource.
     * Normally you'd
     * want the subscription to be created on the consuming stack because the
     * topic is usually referenced by the consumer's resource policy (e.g. SQS
     * queue policy). Otherwise, it will cause a cyclic reference.
     *
     * If this is undefined, the subscription will be created on the topic's stack.
     */
    public fun subscriberScope(subscriberScope: Construct)

    /**
     * @param subscriptionDependency The resources that need to be created before the subscription
     * can be safely created.
     * For example for SQS subscription, the subscription needs to have a dependency on the SQS
     * queue policy
     * in order for the subscription to successfully deliver messages.
     */
    public fun subscriptionDependency(subscriptionDependency: IDependable)

    /**
     * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream.
     * Required for a firehose subscription protocol.
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicSubscriptionConfig.Builder =
        software.amazon.awscdk.services.sns.TopicSubscriptionConfig.builder()

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
    @JvmName("a97c0035d50678bf6d8a22fcb4294e449db8146af282d98ffae0484c06b359cb")
    override fun deliveryPolicy(deliveryPolicy: DeliveryPolicy.Builder.() -> Unit): Unit =
        deliveryPolicy(DeliveryPolicy(deliveryPolicy))

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
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol.Companion::unwrap))
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
     * @param subscriberId The id of the SNS subscription resource created under `scope`. 
     * In most
     * cases, it is recommended to use the `uniqueId` of the topic you are
     * subscribing to.
     */
    override fun subscriberId(subscriberId: String) {
      cdkBuilder.subscriberId(subscriberId)
    }

    /**
     * @param subscriberScope The scope in which to create the SNS subscription resource.
     * Normally you'd
     * want the subscription to be created on the consuming stack because the
     * topic is usually referenced by the consumer's resource policy (e.g. SQS
     * queue policy). Otherwise, it will cause a cyclic reference.
     *
     * If this is undefined, the subscription will be created on the topic's stack.
     */
    override fun subscriberScope(subscriberScope: Construct) {
      cdkBuilder.subscriberScope(subscriberScope.let(Construct.Companion::unwrap))
    }

    /**
     * @param subscriptionDependency The resources that need to be created before the subscription
     * can be safely created.
     * For example for SQS subscription, the subscription needs to have a dependency on the SQS
     * queue policy
     * in order for the subscription to successfully deliver messages.
     */
    override fun subscriptionDependency(subscriptionDependency: IDependable) {
      cdkBuilder.subscriptionDependency(subscriptionDependency.let(IDependable.Companion::unwrap))
    }

    /**
     * @param subscriptionRoleArn Arn of role allowing access to firehose delivery stream.
     * Required for a firehose subscription protocol.
     */
    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.TopicSubscriptionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.TopicSubscriptionConfig,
  ) : CdkObject(cdkObject),
      TopicSubscriptionConfig {
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
     * The id of the SNS subscription resource created under `scope`.
     *
     * In most
     * cases, it is recommended to use the `uniqueId` of the topic you are
     * subscribing to.
     */
    override fun subscriberId(): String = unwrap(this).getSubscriberId()

    /**
     * The scope in which to create the SNS subscription resource.
     *
     * Normally you'd
     * want the subscription to be created on the consuming stack because the
     * topic is usually referenced by the consumer's resource policy (e.g. SQS
     * queue policy). Otherwise, it will cause a cyclic reference.
     *
     * If this is undefined, the subscription will be created on the topic's stack.
     *
     * Default: - use the topic as the scope of the subscription, in which case `subscriberId` must
     * be defined.
     */
    override fun subscriberScope(): Construct? =
        unwrap(this).getSubscriberScope()?.let(Construct::wrap)

    /**
     * The resources that need to be created before the subscription can be safely created.
     *
     * For example for SQS subscription, the subscription needs to have a dependency on the SQS
     * queue policy
     * in order for the subscription to successfully deliver messages.
     *
     * Default: - empty list
     */
    override fun subscriptionDependency(): IDependable? =
        unwrap(this).getSubscriptionDependency()?.let(IDependable::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicSubscriptionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicSubscriptionConfig):
        TopicSubscriptionConfig = CdkObjectWrappers.wrap(cdkObject) as? TopicSubscriptionConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicSubscriptionConfig):
        software.amazon.awscdk.services.sns.TopicSubscriptionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.TopicSubscriptionConfig
  }
}
