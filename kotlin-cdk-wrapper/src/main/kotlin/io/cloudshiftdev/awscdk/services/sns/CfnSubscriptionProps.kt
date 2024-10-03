@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object deliveryPolicy;
 * Object filterPolicy;
 * Object redrivePolicy;
 * Object replayPolicy;
 * CfnSubscriptionProps cfnSubscriptionProps = CfnSubscriptionProps.builder()
 * .protocol("protocol")
 * .topicArn("topicArn")
 * // the properties below are optional
 * .deliveryPolicy(deliveryPolicy)
 * .endpoint("endpoint")
 * .filterPolicy(filterPolicy)
 * .filterPolicyScope("filterPolicyScope")
 * .rawMessageDelivery(false)
 * .redrivePolicy(redrivePolicy)
 * .region("region")
 * .replayPolicy(replayPolicy)
 * .subscriptionRoleArn("subscriptionRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 */
public interface CfnSubscriptionProps {
  /**
   * The delivery policy JSON assigned to the subscription.
   *
   * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
   * endpoint subscribed to the topic. For more information, see
   * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
   * in the *Amazon SNS API Reference* and [Message delivery
   * retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html) in the
   * *Amazon SNS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
   */
  public fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

  /**
   * The subscription's endpoint.
   *
   * The endpoint value depends on the protocol that you specify. For more information, see the
   * `Endpoint` parameter of the
   * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the *Amazon
   * SNS API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-endpoint)
   */
  public fun endpoint(): String? = unwrap(this).getEndpoint()

  /**
   * The filter policy JSON assigned to the subscription.
   *
   * Enables the subscriber to filter out unwanted messages. For more information, see
   * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
   * in the *Amazon SNS API Reference* and [Message
   * filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in the *Amazon
   * SNS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
   */
  public fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

  /**
   * This attribute lets you choose the filtering scope by using one of the following string value
   * types:.
   *
   * * `MessageAttributes` (default) - The filter is applied on the message attributes.
   * * `MessageBody` - The filter is applied on the message body.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicyscope)
   */
  public fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

  /**
   * The subscription's protocol.
   *
   * For more information, see the `Protocol` parameter of the
   * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the *Amazon
   * SNS API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-protocol)
   */
  public fun protocol(): String

  /**
   * When set to `true` , enables raw message delivery.
   *
   * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
   * endpoints. For more information, see
   * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
   * in the *Amazon SNS API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
   */
  public fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

  /**
   * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
   *
   * Messages that can't be delivered due to client errors (for example, when the subscribed
   * endpoint is unreachable) or server errors (for example, when the service that powers the
   * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis or
   * reprocessing.
   *
   * For more information about the redrive policy and dead-letter queues, see [Amazon SQS
   * dead-letter
   * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy)
   */
  public fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  /**
   * For cross-region subscriptions, the region in which the topic resides.
   *
   * If no region is specified, AWS CloudFormation uses the region of the caller as the default.
   *
   * If you perform an update operation that only updates the `Region` property of a
   * `AWS::SNS::Subscription` resource, that operation will fail unless you are either:
   *
   * * Updating the `Region` from `NULL` to the caller region.
   * * Updating the `Region` from the caller region to `NULL` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Specifies whether Amazon SNS resends the notification to the subscription when a message's
   * attribute changes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-replaypolicy)
   */
  public fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

  /**
   * This property applies only to Amazon Data Firehose delivery stream subscriptions.
   *
   * Specify the ARN of the IAM role that has the following:
   *
   * * Permission to write to the Amazon Data Firehose delivery stream
   * * Amazon SNS listed as a trusted entity
   *
   * Specifying a valid ARN for this attribute is required for Firehose delivery stream
   * subscriptions. For more information, see [Fanout to Amazon Data Firehose delivery
   * streams](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html) in the *Amazon
   * SNS Developer Guide.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-subscriptionrolearn)
   */
  public fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  /**
   * The ARN of the topic to subscribe to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-topicarn)
   */
  public fun topicArn(): String

  /**
   * A builder for [CfnSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription.
     * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
     * endpoint subscribed to the topic. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message delivery
     * retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html) in the
     * *Amazon SNS Developer Guide* .
     */
    public fun deliveryPolicy(deliveryPolicy: Any)

    /**
     * @param endpoint The subscription's endpoint.
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     */
    public fun endpoint(endpoint: String)

    /**
     * @param filterPolicy The filter policy JSON assigned to the subscription.
     * Enables the subscriber to filter out unwanted messages. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message
     * filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in the *Amazon
     * SNS Developer Guide* .
     */
    public fun filterPolicy(filterPolicy: Any)

    /**
     * @param filterPolicyScope This attribute lets you choose the filtering scope by using one of
     * the following string value types:.
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     */
    public fun filterPolicyScope(filterPolicyScope: String)

    /**
     * @param protocol The subscription's protocol. 
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     */
    public fun protocol(protocol: String)

    /**
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    /**
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     */
    public fun rawMessageDelivery(rawMessageDelivery: IResolvable)

    /**
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     * dead-letter queue.
     * Messages that can't be delivered due to client errors (for example, when the subscribed
     * endpoint is unreachable) or server errors (for example, when the service that powers the
     * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis
     * or reprocessing.
     *
     * For more information about the redrive policy and dead-letter queues, see [Amazon SQS
     * dead-letter
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun redrivePolicy(redrivePolicy: Any)

    /**
     * @param region For cross-region subscriptions, the region in which the topic resides.
     * If no region is specified, AWS CloudFormation uses the region of the caller as the default.
     *
     * If you perform an update operation that only updates the `Region` property of a
     * `AWS::SNS::Subscription` resource, that operation will fail unless you are either:
     *
     * * Updating the `Region` from `NULL` to the caller region.
     * * Updating the `Region` from the caller region to `NULL` .
     */
    public fun region(region: String)

    /**
     * @param replayPolicy Specifies whether Amazon SNS resends the notification to the subscription
     * when a message's attribute changes.
     */
    public fun replayPolicy(replayPolicy: Any)

    /**
     * @param subscriptionRoleArn This property applies only to Amazon Data Firehose delivery stream
     * subscriptions.
     * Specify the ARN of the IAM role that has the following:
     *
     * * Permission to write to the Amazon Data Firehose delivery stream
     * * Amazon SNS listed as a trusted entity
     *
     * Specifying a valid ARN for this attribute is required for Firehose delivery stream
     * subscriptions. For more information, see [Fanout to Amazon Data Firehose delivery
     * streams](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html) in the
     * *Amazon SNS Developer Guide.*
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String)

    /**
     * @param topicArn The ARN of the topic to subscribe to. 
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnSubscriptionProps.Builder =
        software.amazon.awscdk.services.sns.CfnSubscriptionProps.builder()

    /**
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription.
     * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
     * endpoint subscribed to the topic. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message delivery
     * retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html) in the
     * *Amazon SNS Developer Guide* .
     */
    override fun deliveryPolicy(deliveryPolicy: Any) {
      cdkBuilder.deliveryPolicy(deliveryPolicy)
    }

    /**
     * @param endpoint The subscription's endpoint.
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    /**
     * @param filterPolicy The filter policy JSON assigned to the subscription.
     * Enables the subscriber to filter out unwanted messages. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message
     * filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in the *Amazon
     * SNS Developer Guide* .
     */
    override fun filterPolicy(filterPolicy: Any) {
      cdkBuilder.filterPolicy(filterPolicy)
    }

    /**
     * @param filterPolicyScope This attribute lets you choose the filtering scope by using one of
     * the following string value types:.
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     */
    override fun filterPolicyScope(filterPolicyScope: String) {
      cdkBuilder.filterPolicyScope(filterPolicyScope)
    }

    /**
     * @param protocol The subscription's protocol. 
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     */
    override fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     * dead-letter queue.
     * Messages that can't be delivered due to client errors (for example, when the subscribed
     * endpoint is unreachable) or server errors (for example, when the service that powers the
     * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis
     * or reprocessing.
     *
     * For more information about the redrive policy and dead-letter queues, see [Amazon SQS
     * dead-letter
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    /**
     * @param region For cross-region subscriptions, the region in which the topic resides.
     * If no region is specified, AWS CloudFormation uses the region of the caller as the default.
     *
     * If you perform an update operation that only updates the `Region` property of a
     * `AWS::SNS::Subscription` resource, that operation will fail unless you are either:
     *
     * * Updating the `Region` from `NULL` to the caller region.
     * * Updating the `Region` from the caller region to `NULL` .
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param replayPolicy Specifies whether Amazon SNS resends the notification to the subscription
     * when a message's attribute changes.
     */
    override fun replayPolicy(replayPolicy: Any) {
      cdkBuilder.replayPolicy(replayPolicy)
    }

    /**
     * @param subscriptionRoleArn This property applies only to Amazon Data Firehose delivery stream
     * subscriptions.
     * Specify the ARN of the IAM role that has the following:
     *
     * * Permission to write to the Amazon Data Firehose delivery stream
     * * Amazon SNS listed as a trusted entity
     *
     * Specifying a valid ARN for this attribute is required for Firehose delivery stream
     * subscriptions. For more information, see [Fanout to Amazon Data Firehose delivery
     * streams](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html) in the
     * *Amazon SNS Developer Guide.*
     */
    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    /**
     * @param topicArn The ARN of the topic to subscribe to. 
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.CfnSubscriptionProps,
  ) : CdkObject(cdkObject),
      CfnSubscriptionProps {
    /**
     * The delivery policy JSON assigned to the subscription.
     *
     * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
     * endpoint subscribed to the topic. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message delivery
     * retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html) in the
     * *Amazon SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
     */
    override fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

    /**
     * The subscription's endpoint.
     *
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-endpoint)
     */
    override fun endpoint(): String? = unwrap(this).getEndpoint()

    /**
     * The filter policy JSON assigned to the subscription.
     *
     * Enables the subscriber to filter out unwanted messages. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and [Message
     * filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in the *Amazon
     * SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
     */
    override fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

    /**
     * This attribute lets you choose the filtering scope by using one of the following string value
     * types:.
     *
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicyscope)
     */
    override fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

    /**
     * The subscription's protocol.
     *
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-protocol)
     */
    override fun protocol(): String = unwrap(this).getProtocol()

    /**
     * When set to `true` , enables raw message delivery.
     *
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
     */
    override fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

    /**
     * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
     *
     * Messages that can't be delivered due to client errors (for example, when the subscribed
     * endpoint is unreachable) or server errors (for example, when the service that powers the
     * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further analysis
     * or reprocessing.
     *
     * For more information about the redrive policy and dead-letter queues, see [Amazon SQS
     * dead-letter
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy)
     */
    override fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

    /**
     * For cross-region subscriptions, the region in which the topic resides.
     *
     * If no region is specified, AWS CloudFormation uses the region of the caller as the default.
     *
     * If you perform an update operation that only updates the `Region` property of a
     * `AWS::SNS::Subscription` resource, that operation will fail unless you are either:
     *
     * * Updating the `Region` from `NULL` to the caller region.
     * * Updating the `Region` from the caller region to `NULL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Specifies whether Amazon SNS resends the notification to the subscription when a message's
     * attribute changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-replaypolicy)
     */
    override fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

    /**
     * This property applies only to Amazon Data Firehose delivery stream subscriptions.
     *
     * Specify the ARN of the IAM role that has the following:
     *
     * * Permission to write to the Amazon Data Firehose delivery stream
     * * Amazon SNS listed as a trusted entity
     *
     * Specifying a valid ARN for this attribute is required for Firehose delivery stream
     * subscriptions. For more information, see [Fanout to Amazon Data Firehose delivery
     * streams](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html) in the
     * *Amazon SNS Developer Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-subscriptionrolearn)
     */
    override fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

    /**
     * The ARN of the topic to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-topicarn)
     */
    override fun topicArn(): String = unwrap(this).getTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnSubscriptionProps):
        CfnSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSubscriptionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionProps):
        software.amazon.awscdk.services.sns.CfnSubscriptionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sns.CfnSubscriptionProps
  }
}
