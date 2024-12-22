@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SQS::Queue` resource creates an Amazon SQS standard or FIFO queue.
 *
 * Keep the following caveats in mind:
 *
 * * If you don't specify the `FifoQueue` property, Amazon SQS creates a standard queue.
 *
 *
 * You can't change the queue type after you create it and you can't convert an existing standard
 * queue into a FIFO queue. You must either create a new FIFO queue for your application or delete your
 * existing standard queue and recreate it as a FIFO queue. For more information, see [Moving from a
 * standard queue to a FIFO
 * queue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-moving.html)
 * in the *Amazon SQS Developer Guide* .
 *
 *
 * * If you don't provide a value for a property, the queue is created with the default value for
 * the property.
 * * If you delete a queue, you must wait at least 60 seconds before creating a queue with the same
 * name.
 * * To successfully create a new queue, you must provide a queue name that adheres to the [limits
 * related to
 * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)
 * and is unique within the scope of your queues.
 *
 * For more information about creating FIFO (first-in-first-out) queues, see [Creating an Amazon SQS
 * queue ( AWS CloudFormation
 * )](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/create-queue-cloudformation.html)
 * in the *Amazon SQS Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Object redriveAllowPolicy;
 * Object redrivePolicy;
 * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
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
public open class CfnQueue(
  cdkObject: software.amazon.awscdk.services.sqs.CfnQueue,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sqs.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps,
  ) :
      this(software.amazon.awscdk.services.sqs.CfnQueue(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of the queue.
   *
   * For example: `arn:aws:sqs:us-east-2:123456789012:mystack-myqueue-15PG5C2FC1CW8` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the queue name.
   *
   * For example: `mystack-myqueue-1VF9BKQH5BJVI` .
   */
  public open fun attrQueueName(): String = unwrap(this).getAttrQueueName()

  /**
   * Returns the URLs of the queues from the policy.
   */
  public open fun attrQueueUrl(): String = unwrap(this).getAttrQueueUrl()

  /**
   * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication.
   */
  public open fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  /**
   * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication.
   */
  public open fun contentBasedDeduplication(`value`: Boolean) {
    unwrap(this).setContentBasedDeduplication(`value`)
  }

  /**
   * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication.
   */
  public open fun contentBasedDeduplication(`value`: IResolvable) {
    unwrap(this).setContentBasedDeduplication(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
   * message group or queue level.
   */
  public open fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

  /**
   * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
   * message group or queue level.
   */
  public open fun deduplicationScope(`value`: String) {
    unwrap(this).setDeduplicationScope(`value`)
  }

  /**
   * The time in seconds for which the delivery of all messages in the queue is delayed.
   */
  public open fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

  /**
   * The time in seconds for which the delivery of all messages in the queue is delayed.
   */
  public open fun delaySeconds(`value`: Number) {
    unwrap(this).setDelaySeconds(`value`)
  }

  /**
   * If set to true, creates a FIFO queue.
   */
  public open fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

  /**
   * If set to true, creates a FIFO queue.
   */
  public open fun fifoQueue(`value`: Boolean) {
    unwrap(this).setFifoQueue(`value`)
  }

  /**
   * If set to true, creates a FIFO queue.
   */
  public open fun fifoQueue(`value`: IResolvable) {
    unwrap(this).setFifoQueue(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota applies
   * to the entire queue or per message group.
   */
  public open fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

  /**
   * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota applies
   * to the entire queue or per message group.
   */
  public open fun fifoThroughputLimit(`value`: String) {
    unwrap(this).setFifoThroughputLimit(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt
   * messages before calling AWS KMS again.
   */
  public open fun kmsDataKeyReusePeriodSeconds(): Number? =
      unwrap(this).getKmsDataKeyReusePeriodSeconds()

  /**
   * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt
   * messages before calling AWS KMS again.
   */
  public open fun kmsDataKeyReusePeriodSeconds(`value`: Number) {
    unwrap(this).setKmsDataKeyReusePeriodSeconds(`value`)
  }

  /**
   * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
   */
  public open fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  /**
   * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
   */
  public open fun kmsMasterKeyId(`value`: String) {
    unwrap(this).setKmsMasterKeyId(`value`)
  }

  /**
   * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
   */
  public open fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

  /**
   * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
   */
  public open fun maximumMessageSize(`value`: Number) {
    unwrap(this).setMaximumMessageSize(`value`)
  }

  /**
   * The number of seconds that Amazon SQS retains a message.
   */
  public open fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

  /**
   * The number of seconds that Amazon SQS retains a message.
   */
  public open fun messageRetentionPeriod(`value`: Number) {
    unwrap(this).setMessageRetentionPeriod(`value`)
  }

  /**
   * A name for the queue.
   */
  public open fun queueName(): String? = unwrap(this).getQueueName()

  /**
   * A name for the queue.
   */
  public open fun queueName(`value`: String) {
    unwrap(this).setQueueName(`value`)
  }

  /**
   * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message
   * is in the queue in order to include it in the response, rather than returning an empty response if
   * a message isn't yet available.
   */
  public open fun receiveMessageWaitTimeSeconds(): Number? =
      unwrap(this).getReceiveMessageWaitTimeSeconds()

  /**
   * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message
   * is in the queue in order to include it in the response, rather than returning an empty response if
   * a message isn't yet available.
   */
  public open fun receiveMessageWaitTimeSeconds(`value`: Number) {
    unwrap(this).setReceiveMessageWaitTimeSeconds(`value`)
  }

  /**
   * The string that includes the parameters for the permissions for the dead-letter queue redrive
   * permission and which source queues can specify dead-letter queues as a JSON object.
   */
  public open fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

  /**
   * The string that includes the parameters for the permissions for the dead-letter queue redrive
   * permission and which source queues can specify dead-letter queues as a JSON object.
   */
  public open fun redriveAllowPolicy(`value`: Any) {
    unwrap(this).setRedriveAllowPolicy(`value`)
  }

  /**
   * The string that includes the parameters for the dead-letter queue functionality of the source
   * queue as a JSON object.
   */
  public open fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  /**
   * The string that includes the parameters for the dead-letter queue functionality of the source
   * queue as a JSON object.
   */
  public open fun redrivePolicy(`value`: Any) {
    unwrap(this).setRedrivePolicy(`value`)
  }

  /**
   * Enables server-side queue encryption using SQS owned encryption keys.
   */
  public open fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

  /**
   * Enables server-side queue encryption using SQS owned encryption keys.
   */
  public open fun sqsManagedSseEnabled(`value`: Boolean) {
    unwrap(this).setSqsManagedSseEnabled(`value`)
  }

  /**
   * Enables server-side queue encryption using SQS owned encryption keys.
   */
  public open fun sqsManagedSseEnabled(`value`: IResolvable) {
    unwrap(this).setSqsManagedSseEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that you attach to this queue.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags that you attach to this queue.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags that you attach to this queue.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The length of time during which a message will be unavailable after a message is delivered from
   * the queue.
   */
  public open fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()

  /**
   * The length of time during which a message will be unavailable after a message is delivered from
   * the queue.
   */
  public open fun visibilityTimeout(`value`: Number) {
    unwrap(this).setVisibilityTimeout(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sqs.CfnQueue].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

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
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

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
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level. 
     */
    public fun deduplicationScope(deduplicationScope: String)

    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-delayseconds)
     * @param delaySeconds The time in seconds for which the delivery of all messages in the queue
     * is delayed. 
     */
    public fun delaySeconds(delaySeconds: Number)

    /**
     * If set to true, creates a FIFO queue.
     *
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
     * @param fifoQueue If set to true, creates a FIFO queue. 
     */
    public fun fifoQueue(fifoQueue: Boolean)

    /**
     * If set to true, creates a FIFO queue.
     *
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
     * @param fifoQueue If set to true, creates a FIFO queue. 
     */
    public fun fifoQueue(fifoQueue: IResolvable)

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
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group. 
     */
    public fun fifoThroughputLimit(fifoThroughputLimit: String)

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
     * @param kmsDataKeyReusePeriodSeconds The length of time in seconds for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. 
     */
    public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number)

    /**
     * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
     *
     * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (for
     * example `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
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
     * * The Key Management Service (KMS) section of the [Security best practices for AWS Key
     * Management Service](https://docs.aws.amazon.com/kms/latest/developerguide/best-practices.html)
     * in the *AWS Key Management Service Developer Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsmasterkeyid)
     * @param kmsMasterKeyId The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a
     * custom KMS. 
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
     * default value is `262,144` (256 KiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-maximummessagesize)
     * @param maximumMessageSize The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it. 
     */
    public fun maximumMessageSize(maximumMessageSize: Number)

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14
     * days). The default value is `345,600` seconds (4 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-messageretentionperiod)
     * @param messageRetentionPeriod The number of seconds that Amazon SQS retains a message. 
     */
    public fun messageRetentionPeriod(messageRetentionPeriod: Number)

    /**
     * A name for the queue.
     *
     * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For
     * more information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
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
     * @param queueName A name for the queue. 
     */
    public fun queueName(queueName: String)

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
     * @param receiveMessageWaitTimeSeconds Specifies the duration, in seconds, that the
     * ReceiveMessage action call waits until a message is in the queue in order to include it in the
     * response, rather than returning an empty response if a message isn't yet available. 
     */
    public fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number)

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
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues as a
     * JSON object. 
     */
    public fun redriveAllowPolicy(redriveAllowPolicy: Any)

    /**
     * The string that includes the parameters for the dead-letter queue functionality of the source
     * queue as a JSON object.
     *
     * The parameters are as follows:
     *
     * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
     * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
     * * `maxReceiveCount` : The number of times a message is received by a consumer of the source
     * queue before being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds
     * the `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
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
     * @param redrivePolicy The string that includes the parameters for the dead-letter queue
     * functionality of the source queue as a JSON object. 
     */
    public fun redrivePolicy(redrivePolicy: Any)

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
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys. 
     */
    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean)

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
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys. 
     */
    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable)

    /**
     * The tags that you attach to this queue.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
     * @param tags The tags that you attach to this queue. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags that you attach to this queue.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
     * @param tags The tags that you attach to this queue. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param visibilityTimeout The length of time during which a message will be unavailable after
     * a message is delivered from the queue. 
     */
    public fun visibilityTimeout(visibilityTimeout: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueue.Builder =
        software.amazon.awscdk.services.sqs.CfnQueue.Builder.create(scope, id)

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
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

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
     * @param contentBasedDeduplication For first-in-first-out (FIFO) queues, specifies whether to
     * enable content-based deduplication. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable.Companion::unwrap))
    }

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
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level. 
     */
    override fun deduplicationScope(deduplicationScope: String) {
      cdkBuilder.deduplicationScope(deduplicationScope)
    }

    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of `0` to `900` (15 minutes). The default value is `0` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-delayseconds)
     * @param delaySeconds The time in seconds for which the delivery of all messages in the queue
     * is delayed. 
     */
    override fun delaySeconds(delaySeconds: Number) {
      cdkBuilder.delaySeconds(delaySeconds)
    }

    /**
     * If set to true, creates a FIFO queue.
     *
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
     * @param fifoQueue If set to true, creates a FIFO queue. 
     */
    override fun fifoQueue(fifoQueue: Boolean) {
      cdkBuilder.fifoQueue(fifoQueue)
    }

    /**
     * If set to true, creates a FIFO queue.
     *
     * If you don't specify this property, Amazon SQS creates a standard queue. For more
     * information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-fifoqueue)
     * @param fifoQueue If set to true, creates a FIFO queue. 
     */
    override fun fifoQueue(fifoQueue: IResolvable) {
      cdkBuilder.fifoQueue(fifoQueue.let(IResolvable.Companion::unwrap))
    }

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
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group. 
     */
    override fun fifoThroughputLimit(fifoThroughputLimit: String) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
    }

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
     * @param kmsDataKeyReusePeriodSeconds The length of time in seconds for which Amazon SQS can
     * reuse a data key to encrypt or decrypt messages before calling AWS KMS again. 
     */
    override fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
      cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
    }

    /**
     * The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a custom KMS.
     *
     * To use the AWS managed KMS for Amazon SQS , specify a (default) alias ARN, alias name (for
     * example `alias/aws/sqs` ), key ARN, or key ID. For more information, see the following:
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
     * * The Key Management Service (KMS) section of the [Security best practices for AWS Key
     * Management Service](https://docs.aws.amazon.com/kms/latest/developerguide/best-practices.html)
     * in the *AWS Key Management Service Developer Guide*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-kmsmasterkeyid)
     * @param kmsMasterKeyId The ID of an AWS Key Management Service (KMS) for Amazon SQS , or a
     * custom KMS. 
     */
    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from `1,024` bytes (1 KiB) to `262,144` bytes (256 KiB). The
     * default value is `262,144` (256 KiB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-maximummessagesize)
     * @param maximumMessageSize The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it. 
     */
    override fun maximumMessageSize(maximumMessageSize: Number) {
      cdkBuilder.maximumMessageSize(maximumMessageSize)
    }

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from `60` seconds (1 minute) to `1,209,600` seconds (14
     * days). The default value is `345,600` seconds (4 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-messageretentionperiod)
     * @param messageRetentionPeriod The number of seconds that Amazon SQS retains a message. 
     */
    override fun messageRetentionPeriod(messageRetentionPeriod: Number) {
      cdkBuilder.messageRetentionPeriod(messageRetentionPeriod)
    }

    /**
     * A name for the queue.
     *
     * To create a FIFO queue, the name of your FIFO queue must end with the `.fifo` suffix. For
     * more information, see [Amazon SQS FIFO
     * queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-fifo-queues.html)
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
     * @param queueName A name for the queue. 
     */
    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

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
     * @param receiveMessageWaitTimeSeconds Specifies the duration, in seconds, that the
     * ReceiveMessage action call waits until a message is in the queue in order to include it in the
     * response, rather than returning an empty response if a message isn't yet available. 
     */
    override fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number) {
      cdkBuilder.receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds)
    }

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
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues as a
     * JSON object. 
     */
    override fun redriveAllowPolicy(redriveAllowPolicy: Any) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy)
    }

    /**
     * The string that includes the parameters for the dead-letter queue functionality of the source
     * queue as a JSON object.
     *
     * The parameters are as follows:
     *
     * * `deadLetterTargetArn` : The Amazon Resource Name (ARN) of the dead-letter queue to which
     * Amazon SQS moves messages after the value of `maxReceiveCount` is exceeded.
     * * `maxReceiveCount` : The number of times a message is received by a consumer of the source
     * queue before being moved to the dead-letter queue. When the `ReceiveCount` for a message exceeds
     * the `maxReceiveCount` for a queue, Amazon SQS moves the message to the dead-letter-queue.
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
     * @param redrivePolicy The string that includes the parameters for the dead-letter queue
     * functionality of the source queue as a JSON object. 
     */
    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

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
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys. 
     */
    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
    }

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
     * @param sqsManagedSseEnabled Enables server-side queue encryption using SQS owned encryption
     * keys. 
     */
    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The tags that you attach to this queue.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
     * @param tags The tags that you attach to this queue. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags that you attach to this queue.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html#cfn-sqs-queue-tags)
     * @param tags The tags that you attach to this queue. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param visibilityTimeout The length of time during which a message will be unavailable after
     * a message is delivered from the queue. 
     */
    override fun visibilityTimeout(visibilityTimeout: Number) {
      cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sqs.CfnQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.sqs.CfnQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.sqs.CfnQueue
  }
}
