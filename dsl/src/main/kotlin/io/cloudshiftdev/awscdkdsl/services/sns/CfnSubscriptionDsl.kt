@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sns.CfnSubscription
import software.constructs.Construct

/**
 * The `AWS::SNS::Subscription` resource subscribes an endpoint to an Amazon SNS topic.
 *
 * For a subscription to be created, the owner of the endpoint must confirm the subscription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * Object deliveryPolicy;
 * Object filterPolicy;
 * Object redrivePolicy;
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
 * .subscriptionRoleArn("subscriptionRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
 */
@CdkDslMarker
public class CfnSubscriptionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscription.Builder = CfnSubscription.Builder.create(scope, id)

    /**
     * The delivery policy JSON assigned to the subscription.
     *
     * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
     * endpoint subscribed to the topic. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and
     * [Message delivery retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html)
     * in the *Amazon SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
     *
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription.
     */
    public fun deliveryPolicy(deliveryPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(deliveryPolicy)
        cdkBuilder.deliveryPolicy(builder.map)
    }

    /**
     * The delivery policy JSON assigned to the subscription.
     *
     * Enables the subscriber to define the message delivery retry strategy in the case of an HTTP/S
     * endpoint subscribed to the topic. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and
     * [Message delivery retries](https://docs.aws.amazon.com/sns/latest/dg/sns-message-delivery-retries.html)
     * in the *Amazon SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy)
     *
     * @param deliveryPolicy The delivery policy JSON assigned to the subscription.
     */
    public fun deliveryPolicy(deliveryPolicy: Any) {
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
     *
     * @param endpoint The subscription's endpoint.
     */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    /**
     * The filter policy JSON assigned to the subscription.
     *
     * Enables the subscriber to filter out unwanted messages. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and
     * [Message filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in
     * the *Amazon SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
     *
     * @param filterPolicy The filter policy JSON assigned to the subscription.
     */
    public fun filterPolicy(filterPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(filterPolicy)
        cdkBuilder.filterPolicy(builder.map)
    }

    /**
     * The filter policy JSON assigned to the subscription.
     *
     * Enables the subscriber to filter out unwanted messages. For more information, see
     * `[GetSubscriptionAttributes](https://docs.aws.amazon.com/sns/latest/api/API_GetSubscriptionAttributes.html)`
     * in the *Amazon SNS API Reference* and
     * [Message filtering](https://docs.aws.amazon.com/sns/latest/dg/sns-message-filtering.html) in
     * the *Amazon SNS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy)
     *
     * @param filterPolicy The filter policy JSON assigned to the subscription.
     */
    public fun filterPolicy(filterPolicy: Any) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    /**
     * This attribute lets you choose the filtering scope by using one of the following string value
     * types:.
     * * `MessageAttributes` (default) - The filter is applied on the message attributes.
     * * `MessageBody` - The filter is applied on the message body.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicyscope)
     *
     * @param filterPolicyScope This attribute lets you choose the filtering scope by using one of
     *   the following string value types:.
     */
    public fun filterPolicyScope(filterPolicyScope: String) {
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
     *
     * @param protocol The subscription's protocol.
     */
    public fun protocol(protocol: String) {
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
     *
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     */
    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
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
     *
     * @param rawMessageDelivery When set to `true` , enables raw message delivery.
     */
    public fun rawMessageDelivery(rawMessageDelivery: IResolvable) {
        cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    /**
     * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
     *
     * Messages that can't be delivered due to client errors (for example, when the subscribed
     * endpoint is unreachable) or server errors (for example, when the service that powers the
     * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further
     * analysis or reprocessing.
     *
     * For more information about the redrive policy and dead-letter queues, see
     * [Amazon SQS dead-letter queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy)
     *
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     *   dead-letter queue.
     */
    public fun redrivePolicy(redrivePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(redrivePolicy)
        cdkBuilder.redrivePolicy(builder.map)
    }

    /**
     * When specified, sends undeliverable messages to the specified Amazon SQS dead-letter queue.
     *
     * Messages that can't be delivered due to client errors (for example, when the subscribed
     * endpoint is unreachable) or server errors (for example, when the service that powers the
     * subscribed endpoint becomes unavailable) are held in the dead-letter queue for further
     * analysis or reprocessing.
     *
     * For more information about the redrive policy and dead-letter queues, see
     * [Amazon SQS dead-letter queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy)
     *
     * @param redrivePolicy When specified, sends undeliverable messages to the specified Amazon SQS
     *   dead-letter queue.
     */
    public fun redrivePolicy(redrivePolicy: Any) {
        cdkBuilder.redrivePolicy(redrivePolicy)
    }

    /**
     * For cross-region subscriptions, the region in which the topic resides.
     *
     * If no region is specified, AWS CloudFormation uses the region of the caller as the default.
     *
     * If you perform an update operation that only updates the `Region` property of a
     * `AWS::SNS::Subscription` resource, that operation will fail unless you are either:
     * * Updating the `Region` from `NULL` to the caller region.
     * * Updating the `Region` from the caller region to `NULL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region)
     *
     * @param region For cross-region subscriptions, the region in which the topic resides.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * This property applies only to Amazon Kinesis Data Firehose delivery stream subscriptions.
     *
     * Specify the ARN of the IAM role that has the following:
     * * Permission to write to the Amazon Kinesis Data Firehose delivery stream
     * * Amazon SNS listed as a trusted entity
     *
     * Specifying a valid ARN for this attribute is required for Kinesis Data Firehose delivery
     * stream subscriptions. For more information, see
     * [Fanout to Amazon Kinesis Data Firehose delivery streams](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html)
     * in the *Amazon SNS Developer Guide.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-subscriptionrolearn)
     *
     * @param subscriptionRoleArn This property applies only to Amazon Kinesis Data Firehose
     *   delivery stream subscriptions.
     */
    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
        cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    /**
     * The ARN of the topic to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-topicarn)
     *
     * @param topicArn The ARN of the topic to subscribe to.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnSubscription = cdkBuilder.build()
}
