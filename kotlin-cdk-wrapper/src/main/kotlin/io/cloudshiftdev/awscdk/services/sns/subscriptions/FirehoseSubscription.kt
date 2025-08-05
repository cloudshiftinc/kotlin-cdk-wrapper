@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
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
import io.cloudshiftdev.awscdk.services.kinesisfirehose.IDeliveryStream as CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream as AmazonAwscdkServicesKinesisfirehoseIDeliveryStream

/**
 * Use an Amazon Data Firehose delivery stream as a subscription target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * DeliveryStream stream;
 * Topic myTopic = new Topic(this, "Topic");
 * myTopic.addSubscription(new FirehoseSubscription(stream));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html)
 */
public open class FirehoseSubscription(
  cdkObject: software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription,
) : CdkObject(cdkObject),
    ITopicSubscription {
  public constructor(deliveryStream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream) :
      this(software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription(deliveryStream.let(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.Companion::unwrap))
  )

  public constructor(deliveryStream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
      props: FirehoseSubscriptionProps) :
      this(software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription(deliveryStream.let(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.Companion::unwrap),
      props.let(FirehoseSubscriptionProps.Companion::unwrap))
  )

  public constructor(deliveryStream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
      props: FirehoseSubscriptionProps.Builder.() -> Unit) : this(deliveryStream,
      FirehoseSubscriptionProps(props)
  )

  /**
   * Returns a configuration for a Lambda function to subscribe to an SNS topic.
   *
   * @param topic 
   */
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic.Companion::unwrap)).let(TopicSubscriptionConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.subscriptions.FirehoseSubscription].
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
     * Whether to remove any Amazon SNS metadata from published messages.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-large-payload-raw-message-delivery.html)
     * @param rawMessageDelivery Whether to remove any Amazon SNS metadata from published messages. 
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    /**
     * The role to assume to write messages to the Amazon Data Firehose delivery stream.
     *
     * Default: - A new Role is created
     *
     * @param role The role to assume to write messages to the Amazon Data Firehose delivery stream.
     * 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    deliveryStream: AmazonAwscdkServicesKinesisfirehoseIDeliveryStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription.Builder.create(deliveryStream)

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
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
     * Whether to remove any Amazon SNS metadata from published messages.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-large-payload-raw-message-delivery.html)
     * @param rawMessageDelivery Whether to remove any Amazon SNS metadata from published messages. 
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * The role to assume to write messages to the Amazon Data Firehose delivery stream.
     *
     * Default: - A new Role is created
     *
     * @param role The role to assume to write messages to the Amazon Data Firehose delivery stream.
     * 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator
        fun invoke(deliveryStream: CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream,
        block: Builder.() -> Unit = {}): FirehoseSubscription {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesKinesisfirehoseIDeliveryStream.unwrap(deliveryStream))
      return FirehoseSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription):
        FirehoseSubscription = FirehoseSubscription(cdkObject)

    internal fun unwrap(wrapped: FirehoseSubscription):
        software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription = wrapped.cdkObject
        as software.amazon.awscdk.services.sns.subscriptions.FirehoseSubscription
  }
}
