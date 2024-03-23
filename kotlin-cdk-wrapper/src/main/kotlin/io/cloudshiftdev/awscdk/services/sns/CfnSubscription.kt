@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SNS::Subscription` resource subscribes an endpoint to an Amazon SNS topic.
 *
 * For a subscription to be created, the owner of the endpoint must confirm the subscription.
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
 * CfnSubscription cfnSubscription = CfnSubscription.Builder.create(this, "MyCfnSubscription")
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
public open class CfnSubscription(
  cdkObject: software.amazon.awscdk.services.sns.CfnSubscription,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionProps,
  ) :
      this(software.amazon.awscdk.services.sns.CfnSubscription(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSubscriptionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubscriptionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The delivery policy JSON assigned to the subscription.
   */
  public open fun deliveryPolicy(): Any? = unwrap(this).getDeliveryPolicy()

  /**
   * The delivery policy JSON assigned to the subscription.
   */
  public open fun deliveryPolicy(`value`: Any) {
    unwrap(this).setDeliveryPolicy(`value`)
  }

  /**
   * The subscription's endpoint.
   */
  public open fun endpoint(): String? = unwrap(this).getEndpoint()

  /**
   * The subscription's endpoint.
   */
  public open fun endpoint(`value`: String) {
    unwrap(this).setEndpoint(`value`)
  }

  /**
   * The filter policy JSON assigned to the subscription.
   */
  public open fun filterPolicy(): Any? = unwrap(this).getFilterPolicy()

  /**
   * The filter policy JSON assigned to the subscription.
   */
  public open fun filterPolicy(`value`: Any) {
    unwrap(this).setFilterPolicy(`value`)
  }

  /**
   * This attribute lets you choose the filtering scope by using one of the following string value
   * types:.
   */
  public open fun filterPolicyScope(): String? = unwrap(this).getFilterPolicyScope()

  /**
   * This attribute lets you choose the filtering scope by using one of the following string value
   * types:.
   */
  public open fun filterPolicyScope(`value`: String) {
    unwrap(this).setFilterPolicyScope(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The subscription's protocol.
   */
  public open fun protocol(): String = unwrap(this).getProtocol()

  /**
   * The subscription's protocol.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * When set to `true` , enables raw message delivery.
   */
  public open fun rawMessageDelivery(): Any? = unwrap(this).getRawMessageDelivery()

  /**
   * When set to `true` , enables raw message delivery.
   */
  public open fun rawMessageDelivery(`value`: Boolean) {
    unwrap(this).setRawMessageDelivery(`value`)
  }

  /**
   * When set to `true` , enables raw message delivery.
   */
  public open fun rawMessageDelivery(`value`: IResolvable) {
    unwrap(this).setRawMessageDelivery(`value`.let(IResolvable::unwrap))
  }

  /**
   * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
   */
  public open fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  /**
   * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
   */
  public open fun redrivePolicy(`value`: Any) {
    unwrap(this).setRedrivePolicy(`value`)
  }

  /**
   * For cross-region subscriptions, the region in which the topic resides.
   */
  public open fun region(): String? = unwrap(this).getRegion()

  /**
   * For cross-region subscriptions, the region in which the topic resides.
   */
  public open fun region(`value`: String) {
    unwrap(this).setRegion(`value`)
  }

  /**
   *
   */
  public open fun replayPolicy(): Any? = unwrap(this).getReplayPolicy()

  /**
   *
   */
  public open fun replayPolicy(`value`: Any) {
    unwrap(this).setReplayPolicy(`value`)
  }

  /**
   * This property applies only to Amazon Data Firehose delivery stream subscriptions.
   */
  public open fun subscriptionRoleArn(): String? = unwrap(this).getSubscriptionRoleArn()

  /**
   * This property applies only to Amazon Data Firehose delivery stream subscriptions.
   */
  public open fun subscriptionRoleArn(`value`: String) {
    unwrap(this).setSubscriptionRoleArn(`value`)
  }

  /**
   * The ARN of the topic to subscribe to.
   */
  public open fun topicArn(): String = unwrap(this).getTopicArn()

  /**
   * The ARN of the topic to subscribe to.
   */
  public open fun topicArn(`value`: String) {
    unwrap(this).setTopicArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.CfnSubscription].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription. 
     */
    public fun deliveryPolicy(deliveryPolicy: Any)

    /**
     * The subscription's endpoint.
     *
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-endpoint)
     * @param endpoint The subscription's endpoint. 
     */
    public fun endpoint(endpoint: String)

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
     * @param filterPolicy The filter policy JSON assigned to the subscription. 
     */
    public fun filterPolicy(filterPolicy: Any)

    /**
     * This attribute lets you choose the filtering scope by using one of the following string value
     * types:.
     *
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicyscope)
     * @param filterPolicyScope This attribute lets you choose the filtering scope by using one of
     * the following string value types:. 
     */
    public fun filterPolicyScope(filterPolicyScope: String)

    /**
     * The subscription's protocol.
     *
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-protocol)
     * @param protocol The subscription's protocol. 
     */
    public fun protocol(protocol: String)

    /**
     * When set to `true` , enables raw message delivery.
     *
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
     * @param rawMessageDelivery When set to `true` , enables raw message delivery. 
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean)

    /**
     * When set to `true` , enables raw message delivery.
     *
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
     * @param rawMessageDelivery When set to `true` , enables raw message delivery. 
     */
    public fun rawMessageDelivery(rawMessageDelivery: IResolvable)

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
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     * dead-letter queue. 
     */
    public fun redrivePolicy(redrivePolicy: Any)

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
     * @param region For cross-region subscriptions, the region in which the topic resides. 
     */
    public fun region(region: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-replaypolicy)
     * @param replayPolicy 
     */
    public fun replayPolicy(replayPolicy: Any)

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
     * @param subscriptionRoleArn This property applies only to Amazon Data Firehose delivery stream
     * subscriptions. 
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String)

    /**
     * The ARN of the topic to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-topicarn)
     * @param topicArn The ARN of the topic to subscribe to. 
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnSubscription.Builder =
        software.amazon.awscdk.services.sns.CfnSubscription.Builder.create(scope, id)

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
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription. 
     */
    override fun deliveryPolicy(deliveryPolicy: Any) {
      cdkBuilder.deliveryPolicy(deliveryPolicy)
    }

    /**
     * The subscription's endpoint.
     *
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-endpoint)
     * @param endpoint The subscription's endpoint. 
     */
    override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

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
     * @param filterPolicy The filter policy JSON assigned to the subscription. 
     */
    override fun filterPolicy(filterPolicy: Any) {
      cdkBuilder.filterPolicy(filterPolicy)
    }

    /**
     * This attribute lets you choose the filtering scope by using one of the following string value
     * types:.
     *
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicyscope)
     * @param filterPolicyScope This attribute lets you choose the filtering scope by using one of
     * the following string value types:. 
     */
    override fun filterPolicyScope(filterPolicyScope: String) {
      cdkBuilder.filterPolicyScope(filterPolicyScope)
    }

    /**
     * The subscription's protocol.
     *
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-protocol)
     * @param protocol The subscription's protocol. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * When set to `true` , enables raw message delivery.
     *
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
     * @param rawMessageDelivery When set to `true` , enables raw message delivery. 
     */
    override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * When set to `true` , enables raw message delivery.
     *
     * Raw messages don't contain any JSON formatting and can be sent to Amazon SQS and HTTP/S
     * endpoints. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery)
     * @param rawMessageDelivery When set to `true` , enables raw message delivery. 
     */
    override fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery.let(IResolvable::unwrap))
    }

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
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     * dead-letter queue. 
     */
    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

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
     * @param region For cross-region subscriptions, the region in which the topic resides. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-replaypolicy)
     * @param replayPolicy 
     */
    override fun replayPolicy(replayPolicy: Any) {
      cdkBuilder.replayPolicy(replayPolicy)
    }

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
     * @param subscriptionRoleArn This property applies only to Amazon Data Firehose delivery stream
     * subscriptions. 
     */
    override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    /**
     * The ARN of the topic to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-topicarn)
     * @param topicArn The ARN of the topic to subscribe to. 
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnSubscription = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sns.CfnSubscription.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnSubscription):
        CfnSubscription = CfnSubscription(cdkObject)

    internal fun unwrap(wrapped: CfnSubscription):
        software.amazon.awscdk.services.sns.CfnSubscription = wrapped.cdkObject as
        software.amazon.awscdk.services.sns.CfnSubscription
  }
}
