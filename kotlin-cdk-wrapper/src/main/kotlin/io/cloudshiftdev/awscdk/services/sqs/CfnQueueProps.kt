@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Object redriveAllowPolicy;
 * Object redrivePolicy;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .contentBasedDeduplication(false)
 * .deduplicationScope("deduplicationScope")
 * .delaySeconds(123)
 * .fifoQueue(false)
 * .fifoThroughputLimit("fifoThroughputLimit")
 * .kmsDataKeyReusePeriodSeconds(123)
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .maximumMessageSize(123)
 * .messageRetentionPeriod(123)
 * .queueName("queueName")
 * .receiveMessageWaitTimeSeconds(123)
 * .redriveAllowPolicy(redriveAllowPolicy)
 * .redrivePolicy(redrivePolicy)
 * .sqsManagedSseEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .visibilityTimeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html)
 */
public interface CfnQueueProps {
  /**
   * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication.
   *
   * During the deduplication interval, Amazon SQS treats messages that are sent with identical
   * content as duplicates and delivers only one copy of the message. For more information, see the
   * `ContentBasedDeduplication` attribute for the
   * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
   * action in the *Amazon SQS API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-contentbaseddeduplication)
   */
  public fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  /**
   * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
   * message group or queue level.
   *
   * Valid values are `messageGroup` and `queue` .
   *
   * To enable high throughput for a FIFO queue, set this attribute to `messageGroup` *and* set the
   * `FifoThroughputLimit` attribute to `perMessageGroupId` . If you set these attributes to anything
   * other than these values, normal throughput is in effect and deduplication occurs as specified. For
   * more information, see [High throughput for FIFO
   * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
   * and [Quotas related to
   * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-deduplicationscope)
   */
  public fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

  /**
   * The time in seconds for which the delivery of all messages in the queue is delayed.
   *
   * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-delayseconds)
   */
  public fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

  /**
   * If set to true, creates a FIFO queue.
   *
   * If you don't specify this property, Amazon SQS creates a standard queue. For more information,
   * see [FIFO
   * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
   */
  public fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

  /**
   * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota applies
   * to the entire queue or per message group.
   *
   * Valid values are `perQueue` and `perMessageGroupId` .
   *
   * To enable high throughput for a FIFO queue, set this attribute to `perMessageGroupId` *and* set
   * the `DeduplicationScope` attribute to `messageGroup` . If you set these attributes to anything
   * other than these values, normal throughput is in effect and deduplication occurs as specified. For
   * more information, see [High throughput for FIFO
   * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
   * and [Quotas related to
   * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifothroughputlimit)
   */
  public fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

  /**
   * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt
   * messages before calling AWS KMS again.
   *
   * The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300 (5
   * minutes).
   *
   *
   * A shorter time period provides better security, but results in more calls to AWS KMS , which
   * might incur charges after Free Tier. For more information, see [Encryption at
   * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work)
   * in the *Amazon SQS Developer Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsdatakeyreuseperiodseconds)
   */
  public fun kmsDataKeyReusePeriodSeconds(): Number? =
      unwrap(this).getKmsDataKeyReusePeriodSeconds()

  /**
   * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
   *
   * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (e.g.
   * `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
   *
   * * [Encryption at
   * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html)
   * in the *Amazon SQS Developer Guide*
   * *
   * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
   * in the *Amazon SQS API Reference*
   * * [Request
   * Parameters](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)
   * in the *AWS Key Management Service API Reference*
   * * The Key Management Service (KMS) section of the [AWS Key Management Service Best
   * Practices](https://docs.aws.amazon.com/https://d0.awsstatic.com/whitepapers/aws-kms-best-practices.pdf)
   * whitepaper
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsmasterkeyid)
   */
  public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  /**
   * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
   *
   * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
   * default value is `262,144` (256 KiB).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-maximummessagesize)
   */
  public fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

  /**
   * The number of seconds that Amazon SQS retains a message.
   *
   * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14 days).
   * The default value is `345,600` seconds (4 days).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-messageretentionperiod)
   */
  public fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

  /**
   * A name for the queue.
   *
   * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For more
   * information, see [FIFO
   * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the queue name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) in
   * the *AWS CloudFormation User Guide* .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-queuename)
   */
  public fun queueName(): String? = unwrap(this).getQueueName()

  /**
   * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message
   * is in the queue in order to include it in the response, rather than returning an empty response if
   * a message isn't yet available.
   *
   * You can specify an integer from 1 to 20. Short polling is used as the default or when you
   * specify 0 for this property. For more information, see [Consuming messages using long
   * polling](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-short-and-long-polling.html#sqs-long-polling)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-receivemessagewaittimeseconds)
   */
  public fun receiveMessageWaitTimeSeconds(): Number? =
      unwrap(this).getReceiveMessageWaitTimeSeconds()

  /**
   * The string that includes the parameters for the permissions for the dead-letter queue redrive
   * permission and which source queues can specify dead-letter queues as a JSON object.
   *
   * The parameters are as follows:
   *
   * * `redrivePermission` : The permission type that defines which source queues can specify the
   * current queue as the dead-letter queue. Valid values are:
   * * `allowAll` : (Default) Any source queues in this AWS account in the same Region can specify
   * this queue as the dead-letter queue.
   * * `denyAll` : No source queues can specify this queue as the dead-letter queue.
   * * `byQueue` : Only queues specified by the `sourceQueueArns` parameter can specify this queue
   * as the dead-letter queue.
   * * `sourceQueueArns` : The Amazon Resource Names (ARN)s of the source queues that can specify
   * this queue as the dead-letter queue and redrive messages. You can specify this parameter only when
   * the `redrivePermission` parameter is set to `byQueue` . You can specify up to 10 source queue
   * ARNs. To allow more than 10 source queues to specify dead-letter queues, set the
   * `redrivePermission` parameter to `allowAll` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-redriveallowpolicy)
   */
  public fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

  /**
   * The string that includes the parameters for the dead-letter queue functionality of the source
   * queue as a JSON object.
   *
   * The parameters are as follows:
   *
   * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
   * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
   * * `maxReceiveCount` : The number of times a message is delivered to the source queue before
   * being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds the
   * `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
   *
   *
   * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter
   * queue of a standard queue must also be a standard queue.
   *
   *
   * *JSON*
   *
   * `{ "deadLetterTargetArn" : *String* , "maxReceiveCount" : *Integer* }`
   *
   * *YAML*
   *
   * `deadLetterTargetArn : *String*`
   *
   * `maxReceiveCount : *Integer*`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-redrivepolicy)
   */
  public fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  /**
   * Enables server-side queue encryption using SQS owned encryption keys.
   *
   * Only one server-side encryption option is supported per queue (for example,
   * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
   * or
   * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
   * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-sqsmanagedsseenabled)
   */
  public fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

  /**
   * The tags that you attach to this queue.
   *
   * For more information, see [Resource
   * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The length of time during which a message will be unavailable after a message is delivered from
   * the queue.
   *
   * This blocks other components from receiving the same message and gives the initial component
   * time to process and delete the message from the queue.
   *
   * Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS
   * CloudFormation uses the default value of 30 seconds.
   *
   * For more information about Amazon SQS queue visibility timeouts, see [Visibility
   * timeout](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)
   * in the *Amazon SQS Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-visibilitytimeout)
   */
  public fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()

  /**
   * A builder for [CfnQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication.
     * During the deduplication interval, Amazon SQS treats messages that are sent with identical
     * content as duplicates and delivers only one copy of the message. For more information, see the
     * `ContentBasedDeduplication` attribute for the
     * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
     * action in the *Amazon SQS API Reference* .
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication.
     * During the deduplication interval, Amazon SQS treats messages that are sent with identical
     * content as duplicates and delivers only one copy of the message. For more information, see the
     * `ContentBasedDeduplication` attribute for the
     * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
     * action in the *Amazon SQS API Reference* .
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    /**
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level.
     * Valid values are `messageGroup` and `queue` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `messageGroup` *and* set
     * the `FifoThroughputLimit` attribute to `perMessageGroupId` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun deduplicationScope(deduplicationScope: String)

    /**
     * @param delaySeconds The time in seconds for which the delivery of all messages in the queue
     * is delayed.
     * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
     */
    public fun delaySeconds(delaySeconds: Number)

    /**
     * @param fifoQueue If set to true, creates a FIFO queue.
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun fifoQueue(fifoQueue: Boolean)

    /**
     * @param fifoQueue If set to true, creates a FIFO queue.
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun fifoQueue(fifoQueue: IResolvable)

    /**
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group.
     * Valid values are `perQueue` and `perMessageGroupId` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `perMessageGroupId` *and*
     * set the `DeduplicationScope` attribute to `messageGroup` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun fifoThroughputLimit(fifoThroughputLimit: String)

    /**
     * @param kmsDataKeyReusePeriodSeconds The length of time in seconds for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
     * The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300
     * (5 minutes).
     *
     *
     * A shorter time period provides better security, but results in more calls to AWS KMS , which
     * might incur charges after Free Tier. For more information, see [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number)

    /**
     * @param kmsMasterKeyId The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a
     * custom KMS.
     * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (e.g.
     * `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
     *
     * * [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html)
     * in the *Amazon SQS Developer Guide*
     * *
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     * in the *Amazon SQS API Reference*
     * * [Request
     * Parameters](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)
     * in the *AWS Key Management Service API Reference*
     * * The Key Management Service (KMS) section of the [AWS Key Management Service Best
     * Practices](https://docs.aws.amazon.com/https://d0.awsstatic.com/whitepapers/aws-kms-best-practices.pdf)
     * whitepaper
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    /**
     * @param maximumMessageSize The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it.
     * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
     * default value is `262,144` (256 KiB).
     */
    public fun maximumMessageSize(maximumMessageSize: Number)

    /**
     * @param messageRetentionPeriod The number of seconds that Amazon SQS retains a message.
     * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14
     * days). The default value is `345,600` seconds (4 days).
     */
    public fun messageRetentionPeriod(messageRetentionPeriod: Number)

    /**
     * @param queueName A name for the queue.
     * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For
     * more information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the queue name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun queueName(queueName: String)

    /**
     * @param receiveMessageWaitTimeSeconds Specifies the duration, in seconds, that the
     * ReceiveMessage action call waits until a message is in the queue in order to include it in the
     * response, rather than returning an empty response if a message isn't yet available.
     * You can specify an integer from 1 to 20. Short polling is used as the default or when you
     * specify 0 for this property. For more information, see [Consuming messages using long
     * polling](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-short-and-long-polling.html#sqs-long-polling)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number)

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues as a
     * JSON object.
     * The parameters are as follows:
     *
     * * `redrivePermission` : The permission type that defines which source queues can specify the
     * current queue as the dead-letter queue. Valid values are:
     * * `allowAll` : (Default) Any source queues in this AWS account in the same Region can specify
     * this queue as the dead-letter queue.
     * * `denyAll` : No source queues can specify this queue as the dead-letter queue.
     * * `byQueue` : Only queues specified by the `sourceQueueArns` parameter can specify this queue
     * as the dead-letter queue.
     * * `sourceQueueArns` : The Amazon Resource Names (ARN)s of the source queues that can specify
     * this queue as the dead-letter queue and redrive messages. You can specify this parameter only
     * when the `redrivePermission` parameter is set to `byQueue` . You can specify up to 10 source
     * queue ARNs. To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` parameter to `allowAll` .
     */
    public fun redriveAllowPolicy(redriveAllowPolicy: Any)

    /**
     * @param redrivePolicy The string that includes the parameters for the dead-letter queue
     * functionality of the source queue as a JSON object.
     * The parameters are as follows:
     *
     * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
     * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
     * * `maxReceiveCount` : The number of times a message is delivered to the source queue before
     * being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds the
     * `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *
     *
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter
     * queue of a standard queue must also be a standard queue.
     *
     *
     * *JSON*
     *
     * `{ "deadLetterTargetArn" : *String* , "maxReceiveCount" : *Integer* }`
     *
     * *YAML*
     *
     * `deadLetterTargetArn : *String*`
     *
     * `maxReceiveCount : *Integer*`
     */
    public fun redrivePolicy(redrivePolicy: Any)

    /**
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys.
     * Only one server-side encryption option is supported per queue (for example,
     * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
     * or
     * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
     * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
     */
    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean)

    /**
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys.
     * Only one server-side encryption option is supported per queue (for example,
     * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
     * or
     * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
     * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
     */
    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable)

    /**
     * @param tags The tags that you attach to this queue.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that you attach to this queue.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param visibilityTimeout The length of time during which a message will be unavailable after
     * a message is delivered from the queue.
     * This blocks other components from receiving the same message and gives the initial component
     * time to process and delete the message from the queue.
     *
     * Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS
     * CloudFormation uses the default value of 30 seconds.
     *
     * For more information about Amazon SQS queue visibility timeouts, see [Visibility
     * timeout](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)
     * in the *Amazon SQS Developer Guide* .
     */
    public fun visibilityTimeout(visibilityTimeout: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueProps.builder()

    /**
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication.
     * During the deduplication interval, Amazon SQS treats messages that are sent with identical
     * content as duplicates and delivers only one copy of the message. For more information, see the
     * `ContentBasedDeduplication` attribute for the
     * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
     * action in the *Amazon SQS API Reference* .
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication.
     * During the deduplication interval, Amazon SQS treats messages that are sent with identical
     * content as duplicates and delivers only one copy of the message. For more information, see the
     * `ContentBasedDeduplication` attribute for the
     * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
     * action in the *Amazon SQS API Reference* .
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    /**
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level.
     * Valid values are `messageGroup` and `queue` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `messageGroup` *and* set
     * the `FifoThroughputLimit` attribute to `perMessageGroupId` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun deduplicationScope(deduplicationScope: String) {
      cdkBuilder.deduplicationScope(deduplicationScope)
    }

    /**
     * @param delaySeconds The time in seconds for which the delivery of all messages in the queue
     * is delayed.
     * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
     */
    override fun delaySeconds(delaySeconds: Number) {
      cdkBuilder.delaySeconds(delaySeconds)
    }

    /**
     * @param fifoQueue If set to true, creates a FIFO queue.
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun fifoQueue(fifoQueue: Boolean) {
      cdkBuilder.fifoQueue(fifoQueue)
    }

    /**
     * @param fifoQueue If set to true, creates a FIFO queue.
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun fifoQueue(fifoQueue: IResolvable) {
      cdkBuilder.fifoQueue(fifoQueue.let(IResolvable::unwrap))
    }

    /**
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group.
     * Valid values are `perQueue` and `perMessageGroupId` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `perMessageGroupId` *and*
     * set the `DeduplicationScope` attribute to `messageGroup` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun fifoThroughputLimit(fifoThroughputLimit: String) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
    }

    /**
     * @param kmsDataKeyReusePeriodSeconds The length of time in seconds for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again.
     * The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300
     * (5 minutes).
     *
     *
     * A shorter time period provides better security, but results in more calls to AWS KMS , which
     * might incur charges after Free Tier. For more information, see [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
      cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
    }

    /**
     * @param kmsMasterKeyId The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a
     * custom KMS.
     * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (e.g.
     * `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
     *
     * * [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html)
     * in the *Amazon SQS Developer Guide*
     * *
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     * in the *Amazon SQS API Reference*
     * * [Request
     * Parameters](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)
     * in the *AWS Key Management Service API Reference*
     * * The Key Management Service (KMS) section of the [AWS Key Management Service Best
     * Practices](https://docs.aws.amazon.com/https://d0.awsstatic.com/whitepapers/aws-kms-best-practices.pdf)
     * whitepaper
     */
    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * @param maximumMessageSize The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it.
     * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
     * default value is `262,144` (256 KiB).
     */
    override fun maximumMessageSize(maximumMessageSize: Number) {
      cdkBuilder.maximumMessageSize(maximumMessageSize)
    }

    /**
     * @param messageRetentionPeriod The number of seconds that Amazon SQS retains a message.
     * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14
     * days). The default value is `345,600` seconds (4 days).
     */
    override fun messageRetentionPeriod(messageRetentionPeriod: Number) {
      cdkBuilder.messageRetentionPeriod(messageRetentionPeriod)
    }

    /**
     * @param queueName A name for the queue.
     * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For
     * more information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the queue name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    /**
     * @param receiveMessageWaitTimeSeconds Specifies the duration, in seconds, that the
     * ReceiveMessage action call waits until a message is in the queue in order to include it in the
     * response, rather than returning an empty response if a message isn't yet available.
     * You can specify an integer from 1 to 20. Short polling is used as the default or when you
     * specify 0 for this property. For more information, see [Consuming messages using long
     * polling](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-short-and-long-polling.html#sqs-long-polling)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number) {
      cdkBuilder.receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds)
    }

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues as a
     * JSON object.
     * The parameters are as follows:
     *
     * * `redrivePermission` : The permission type that defines which source queues can specify the
     * current queue as the dead-letter queue. Valid values are:
     * * `allowAll` : (Default) Any source queues in this AWS account in the same Region can specify
     * this queue as the dead-letter queue.
     * * `denyAll` : No source queues can specify this queue as the dead-letter queue.
     * * `byQueue` : Only queues specified by the `sourceQueueArns` parameter can specify this queue
     * as the dead-letter queue.
     * * `sourceQueueArns` : The Amazon Resource Names (ARN)s of the source queues that can specify
     * this queue as the dead-letter queue and redrive messages. You can specify this parameter only
     * when the `redrivePermission` parameter is set to `byQueue` . You can specify up to 10 source
     * queue ARNs. To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` parameter to `allowAll` .
     */
    override fun redriveAllowPolicy(redriveAllowPolicy: Any) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy)
    }

    /**
     * @param redrivePolicy The string that includes the parameters for the dead-letter queue
     * functionality of the source queue as a JSON object.
     * The parameters are as follows:
     *
     * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
     * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
     * * `maxReceiveCount` : The number of times a message is delivered to the source queue before
     * being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds the
     * `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *
     *
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter
     * queue of a standard queue must also be a standard queue.
     *
     *
     * *JSON*
     *
     * `{ "deadLetterTargetArn" : *String* , "maxReceiveCount" : *Integer* }`
     *
     * *YAML*
     *
     * `deadLetterTargetArn : *String*`
     *
     * `maxReceiveCount : *Integer*`
     */
    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    /**
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys.
     * Only one server-side encryption option is supported per queue (for example,
     * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
     * or
     * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
     * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
     */
    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
    }

    /**
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys.
     * Only one server-side encryption option is supported per queue (for example,
     * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
     * or
     * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
     * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
     */
    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param tags The tags that you attach to this queue.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags that you attach to this queue.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param visibilityTimeout The length of time during which a message will be unavailable after
     * a message is delivered from the queue.
     * This blocks other components from receiving the same message and gives the initial component
     * time to process and delete the message from the queue.
     *
     * Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS
     * CloudFormation uses the default value of 30 seconds.
     *
     * For more information about Amazon SQS queue visibility timeouts, see [Visibility
     * timeout](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)
     * in the *Amazon SQS Developer Guide* .
     */
    override fun visibilityTimeout(visibilityTimeout: Number) {
      cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueueProps,
  ) : CdkObject(cdkObject), CfnQueueProps {
    /**
     * For first-in-first-out (FIFO) queues, specifies whether to enable content-based
     * deduplication.
     *
     * During the deduplication interval, Amazon SQS treats messages that are sent with identical
     * content as duplicates and delivers only one copy of the message. For more information, see the
     * `ContentBasedDeduplication` attribute for the
     * `[CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)`
     * action in the *Amazon SQS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-contentbaseddeduplication)
     */
    override fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

    /**
     * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
     * message group or queue level.
     *
     * Valid values are `messageGroup` and `queue` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `messageGroup` *and* set
     * the `FifoThroughputLimit` attribute to `perMessageGroupId` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-deduplicationscope)
     */
    override fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-delayseconds)
     */
    override fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

    /**
     * If set to true, creates a FIFO queue.
     *
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
     */
    override fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

    /**
     * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota
     * applies to the entire queue or per message group.
     *
     * Valid values are `perQueue` and `perMessageGroupId` .
     *
     * To enable high throughput for a FIFO queue, set this attribute to `perMessageGroupId` *and*
     * set the `DeduplicationScope` attribute to `messageGroup` . If you set these attributes to
     * anything other than these values, normal throughput is in effect and deduplication occurs as
     * specified. For more information, see [High throughput for FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/high-throughput-fifo.html)
     * and [Quotas related to
     * messages](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-messages.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifothroughputlimit)
     */
    override fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

    /**
     * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt
     * messages before calling AWS KMS again.
     *
     * The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300
     * (5 minutes).
     *
     *
     * A shorter time period provides better security, but results in more calls to AWS KMS , which
     * might incur charges after Free Tier. For more information, see [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-how-does-the-data-key-reuse-period-work)
     * in the *Amazon SQS Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsdatakeyreuseperiodseconds)
     */
    override fun kmsDataKeyReusePeriodSeconds(): Number? =
        unwrap(this).getKmsDataKeyReusePeriodSeconds()

    /**
     * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
     *
     * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (e.g.
     * `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
     *
     * * [Encryption at
     * rest](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html)
     * in the *Amazon SQS Developer Guide*
     * *
     * [CreateQueue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_CreateQueue.html)
     * in the *Amazon SQS API Reference*
     * * [Request
     * Parameters](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)
     * in the *AWS Key Management Service API Reference*
     * * The Key Management Service (KMS) section of the [AWS Key Management Service Best
     * Practices](https://docs.aws.amazon.com/https://d0.awsstatic.com/whitepapers/aws-kms-best-practices.pdf)
     * whitepaper
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsmasterkeyid)
     */
    override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
     * default value is `262,144` (256 KiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-maximummessagesize)
     */
    override fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14
     * days). The default value is `345,600` seconds (4 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-messageretentionperiod)
     */
    override fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

    /**
     * A name for the queue.
     *
     * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For
     * more information, see [FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the queue name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-queuename)
     */
    override fun queueName(): String? = unwrap(this).getQueueName()

    /**
     * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message
     * is in the queue in order to include it in the response, rather than returning an empty response
     * if a message isn't yet available.
     *
     * You can specify an integer from 1 to 20. Short polling is used as the default or when you
     * specify 0 for this property. For more information, see [Consuming messages using long
     * polling](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-short-and-long-polling.html#sqs-long-polling)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-receivemessagewaittimeseconds)
     */
    override fun receiveMessageWaitTimeSeconds(): Number? =
        unwrap(this).getReceiveMessageWaitTimeSeconds()

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues as a JSON object.
     *
     * The parameters are as follows:
     *
     * * `redrivePermission` : The permission type that defines which source queues can specify the
     * current queue as the dead-letter queue. Valid values are:
     * * `allowAll` : (Default) Any source queues in this AWS account in the same Region can specify
     * this queue as the dead-letter queue.
     * * `denyAll` : No source queues can specify this queue as the dead-letter queue.
     * * `byQueue` : Only queues specified by the `sourceQueueArns` parameter can specify this queue
     * as the dead-letter queue.
     * * `sourceQueueArns` : The Amazon Resource Names (ARN)s of the source queues that can specify
     * this queue as the dead-letter queue and redrive messages. You can specify this parameter only
     * when the `redrivePermission` parameter is set to `byQueue` . You can specify up to 10 source
     * queue ARNs. To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` parameter to `allowAll` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-redriveallowpolicy)
     */
    override fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

    /**
     * The string that includes the parameters for the dead-letter queue functionality of the source
     * queue as a JSON object.
     *
     * The parameters are as follows:
     *
     * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
     * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
     * * `maxReceiveCount` : The number of times a message is delivered to the source queue before
     * being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds the
     * `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
     *
     *
     * The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter
     * queue of a standard queue must also be a standard queue.
     *
     *
     * *JSON*
     *
     * `{ "deadLetterTargetArn" : *String* , "maxReceiveCount" : *Integer* }`
     *
     * *YAML*
     *
     * `deadLetterTargetArn : *String*`
     *
     * `maxReceiveCount : *Integer*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-redrivepolicy)
     */
    override fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

    /**
     * Enables server-side queue encryption using SQS owned encryption keys.
     *
     * Only one server-side encryption option is supported per queue (for example,
     * [SSE-KMS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sse-existing-queue.html)
     * or
     * [SSE-SQS](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-configure-sqs-sse-queue.html)
     * ). When `SqsManagedSseEnabled` is not defined, `SSE-SQS` encryption is enabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-sqsmanagedsseenabled)
     */
    override fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

    /**
     * The tags that you attach to this queue.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The length of time during which a message will be unavailable after a message is delivered
     * from the queue.
     *
     * This blocks other components from receiving the same message and gives the initial component
     * time to process and delete the message from the queue.
     *
     * Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS
     * CloudFormation uses the default value of 30 seconds.
     *
     * For more information about Amazon SQS queue visibility timeouts, see [Visibility
     * timeout](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-visibilitytimeout)
     */
    override fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueProps): CfnQueueProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps): software.amazon.awscdk.services.sqs.CfnQueueProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.CfnQueueProps
  }
}
