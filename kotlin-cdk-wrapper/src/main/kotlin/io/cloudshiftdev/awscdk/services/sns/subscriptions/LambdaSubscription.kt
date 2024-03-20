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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Use a Lambda function as a subscription target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on message body:
 * // color: 'red' or 'orange'
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicyWithMessageBody(Map.of(
 * "background", FilterOrPolicy.policy(Map.of(
 * "color", FilterOrPolicy.filter(SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .build()))))))
 * .build());
 * ```
 */
public open class LambdaSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction, props: LambdaSubscriptionProps)
      :
      this(software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription(fn.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap),
      props.let(LambdaSubscriptionProps::unwrap))
  )

  public constructor(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
      props: LambdaSubscriptionProps.Builder.() -> Unit) : this(fn, LambdaSubscriptionProps(props)
  )

  /**
   * Returns a configuration for a Lambda function to subscribe to an SNS topic.
   *
   * @param topic 
   */
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.subscriptions.LambdaSubscription].
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
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription.Builder.create(fn)

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

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(fn))
      return LambdaSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription):
        LambdaSubscription = LambdaSubscription(cdkObject)

    internal fun unwrap(wrapped: LambdaSubscription):
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription = wrapped.cdkObject
  }
}
