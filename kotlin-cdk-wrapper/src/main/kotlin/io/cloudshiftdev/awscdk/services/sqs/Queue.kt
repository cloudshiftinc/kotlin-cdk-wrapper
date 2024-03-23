@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new Amazon SQS queue.
 *
 * Example:
 *
 * ```
 * Queue sourceQueue;
 * Queue targetQueue;
 * SqsTarget pipeTarget = SqsTarget.Builder.create(targetQueue)
 * .inputTransformation(InputTransformation.fromObject(Map.of(
 * "SomeKey", DynamicInput.fromEventPath("$.body"))))
 * .build();
 * Pipe pipe = Pipe.Builder.create(this, "Pipe")
 * .source(new SomeSource(sourceQueue))
 * .target(pipeTarget)
 * .build();
 * ```
 */
public open class Queue(
  cdkObject: software.amazon.awscdk.services.sqs.Queue,
) : QueueBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sqs.Queue(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: QueueProps,
  ) :
      this(software.amazon.awscdk.services.sqs.Queue(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(QueueProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: QueueProps.Builder.() -> Unit,
  ) : this(scope, id, QueueProps(props)
  )

  /**
   * If this queue is configured with a dead-letter queue, this is the dead-letter queue settings.
   */
  public open fun deadLetterQueue(): DeadLetterQueue? =
      unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

  /**
   * If this queue is encrypted, this is the KMS key.
   */
  public override fun encryptionMasterKey(): IKey? =
      unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  /**
   * Whether the contents of the queue are encrypted, and by what type of key.
   */
  public override fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  /**
   * Whether this queue is an Amazon SQS FIFO queue.
   *
   * If false, this is a standard queue.
   */
  public override fun fifo(): Boolean = unwrap(this).getFifo()

  /**
   * The ARN of this queue.
   */
  public override fun queueArn(): String = unwrap(this).getQueueArn()

  /**
   * The name of this queue.
   */
  public override fun queueName(): String = unwrap(this).getQueueName()

  /**
   * The URL of this queue.
   */
  public override fun queueUrl(): String = unwrap(this).getQueueUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sqs.Queue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies whether to enable content-based deduplication.
     *
     * During the deduplication interval (5 minutes), Amazon SQS treats
     * messages that are sent with identical content (excluding attributes) as
     * duplicates and delivers only one copy of the message.
     *
     * If you don't enable content-based deduplication and you want to deduplicate
     * messages, provide an explicit deduplication ID in your SendMessage() call.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: false
     *
     * @param contentBasedDeduplication Specifies whether to enable content-based deduplication. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * The length of time that Amazon SQS reuses a data key before calling KMS again.
     *
     * The value must be an integer between 60 (1 minute) and 86,400 (24
     * hours). The default is 300 (5 minutes).
     *
     * Default: Duration.minutes(5)
     *
     * @param dataKeyReuse The length of time that Amazon SQS reuses a data key before calling KMS
     * again. 
     */
    public fun dataKeyReuse(dataKeyReuse: Duration)

    /**
     * Send messages to this queue if they were unsuccessfully dequeued a number of times.
     *
     * Default: no dead-letter queue
     *
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times. 
     */
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue)

    /**
     * Send messages to this queue if they were unsuccessfully dequeued a number of times.
     *
     * Default: no dead-letter queue
     *
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97f5b14d7b02b73465dced58cc2d1f94d5c49dda8daae774bd8488adcfac5df2")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit)

    /**
     * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
     * message group or queue level.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: DeduplicationScope.QUEUE
     *
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level. 
     */
    public fun deduplicationScope(deduplicationScope: DeduplicationScope)

    /**
     * The time in seconds that the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of 0 to 900 (15 minutes). The default
     * value is 0.
     *
     * Default: 0
     *
     * @param deliveryDelay The time in seconds that the delivery of all messages in the queue is
     * delayed. 
     */
    public fun deliveryDelay(deliveryDelay: Duration)

    /**
     * Whether the contents of the queue are encrypted, and by what type of key.
     *
     * Be aware that encryption is not available in all regions, please see the docs
     * for current availability details.
     *
     * Default: SQS_MANAGED (SSE-SQS) for newly created queues
     *
     * @param encryption Whether the contents of the queue are encrypted, and by what type of key. 
     */
    public fun encryption(encryption: QueueEncryption)

    /**
     * External KMS key to use for queue encryption.
     *
     * Individual messages will be encrypted using data keys. The data keys in
     * turn will be encrypted using this key, and reused for a maximum of
     * `dataKeyReuseSecs` seconds.
     *
     * If the 'encryptionMasterKey' property is set, 'encryption' type will be
     * implicitly set to "KMS".
     *
     * Default: If encryption is set to KMS and not specified, a key will be created.
     *
     * @param encryptionMasterKey External KMS key to use for queue encryption. 
     */
    public fun encryptionMasterKey(encryptionMasterKey: IKey)

    /**
     * Enforce encryption of data in transit.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-security-best-practices.html#enforce-encryption-data-in-transit)
     * @param enforceSsl Enforce encryption of data in transit. 
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * Whether this a first-in-first-out (FIFO) queue.
     *
     * Default: false, unless queueName ends in '.fifo' or 'contentBasedDeduplication' is true.
     *
     * @param fifo Whether this a first-in-first-out (FIFO) queue. 
     */
    public fun fifo(fifo: Boolean)

    /**
     * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota
     * applies to the entire queue or per message group.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: FifoThroughputLimit.PER_QUEUE
     *
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group. 
     */
    public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit)

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
     * (256 KiB). The default value is 262144 (256 KiB).
     *
     * Default: 256KiB
     *
     * @param maxMessageSizeBytes The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it. 
     */
    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number)

    /**
     * A name for the queue.
     *
     * If specified and this is a FIFO queue, must end in the string '.fifo'.
     *
     * Default: CloudFormation-generated name
     *
     * @param queueName A name for the queue. 
     */
    public fun queueName(queueName: String)

    /**
     * Default wait time for ReceiveMessage calls.
     *
     * Does not wait if set to 0, otherwise waits this amount of seconds
     * by default for messages to arrive.
     *
     * For more information, see Amazon SQS Long Poll.
     *
     * Default: 0
     *
     * @param receiveMessageWaitTime Default wait time for ReceiveMessage calls. 
     */
    public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration)

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues.
     *
     * Default: - All source queues can designate this queue as their dead-letter queue.
     *
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues. 
     */
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy)

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues.
     *
     * Default: - All source queues can designate this queue as their dead-letter queue.
     *
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bda4096d045a478f2b31ab46f72925fb4078b6516e4a5c1eef3f25da474a121")
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit)

    /**
     * Policy to apply when the queue is removed from the stack.
     *
     * Even though queues are technically stateful, their contents are transient and it
     * is common to add and remove Queues while rearchitecting your application. The
     * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
     * valuable that accidentally losing them would be unacceptable.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Policy to apply when the queue is removed from the stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from 60 seconds (1 minute) to 1209600
     * seconds (14 days). The default value is 345600 seconds (4 days).
     *
     * Default: Duration.days(4)
     *
     * @param retentionPeriod The number of seconds that Amazon SQS retains a message. 
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * Timeout of processing a single message.
     *
     * After dequeuing, the processor has this much time to handle the message
     * and delete it from the queue before it becomes visible again for dequeueing
     * by another processor.
     *
     * Values must be from 0 to 43200 seconds (12 hours). If you don't specify
     * a value, AWS CloudFormation uses the default value of 30 seconds.
     *
     * Default: Duration.seconds(30)
     *
     * @param visibilityTimeout Timeout of processing a single message. 
     */
    public fun visibilityTimeout(visibilityTimeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.Queue.Builder =
        software.amazon.awscdk.services.sqs.Queue.Builder.create(scope, id)

    /**
     * Specifies whether to enable content-based deduplication.
     *
     * During the deduplication interval (5 minutes), Amazon SQS treats
     * messages that are sent with identical content (excluding attributes) as
     * duplicates and delivers only one copy of the message.
     *
     * If you don't enable content-based deduplication and you want to deduplicate
     * messages, provide an explicit deduplication ID in your SendMessage() call.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: false
     *
     * @param contentBasedDeduplication Specifies whether to enable content-based deduplication. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * The length of time that Amazon SQS reuses a data key before calling KMS again.
     *
     * The value must be an integer between 60 (1 minute) and 86,400 (24
     * hours). The default is 300 (5 minutes).
     *
     * Default: Duration.minutes(5)
     *
     * @param dataKeyReuse The length of time that Amazon SQS reuses a data key before calling KMS
     * again. 
     */
    override fun dataKeyReuse(dataKeyReuse: Duration) {
      cdkBuilder.dataKeyReuse(dataKeyReuse.let(Duration::unwrap))
    }

    /**
     * Send messages to this queue if they were unsuccessfully dequeued a number of times.
     *
     * Default: no dead-letter queue
     *
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times. 
     */
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueue::unwrap))
    }

    /**
     * Send messages to this queue if they were unsuccessfully dequeued a number of times.
     *
     * Default: no dead-letter queue
     *
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97f5b14d7b02b73465dced58cc2d1f94d5c49dda8daae774bd8488adcfac5df2")
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit): Unit =
        deadLetterQueue(DeadLetterQueue(deadLetterQueue))

    /**
     * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
     * message group or queue level.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: DeduplicationScope.QUEUE
     *
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level. 
     */
    override fun deduplicationScope(deduplicationScope: DeduplicationScope) {
      cdkBuilder.deduplicationScope(deduplicationScope.let(DeduplicationScope::unwrap))
    }

    /**
     * The time in seconds that the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of 0 to 900 (15 minutes). The default
     * value is 0.
     *
     * Default: 0
     *
     * @param deliveryDelay The time in seconds that the delivery of all messages in the queue is
     * delayed. 
     */
    override fun deliveryDelay(deliveryDelay: Duration) {
      cdkBuilder.deliveryDelay(deliveryDelay.let(Duration::unwrap))
    }

    /**
     * Whether the contents of the queue are encrypted, and by what type of key.
     *
     * Be aware that encryption is not available in all regions, please see the docs
     * for current availability details.
     *
     * Default: SQS_MANAGED (SSE-SQS) for newly created queues
     *
     * @param encryption Whether the contents of the queue are encrypted, and by what type of key. 
     */
    override fun encryption(encryption: QueueEncryption) {
      cdkBuilder.encryption(encryption.let(QueueEncryption::unwrap))
    }

    /**
     * External KMS key to use for queue encryption.
     *
     * Individual messages will be encrypted using data keys. The data keys in
     * turn will be encrypted using this key, and reused for a maximum of
     * `dataKeyReuseSecs` seconds.
     *
     * If the 'encryptionMasterKey' property is set, 'encryption' type will be
     * implicitly set to "KMS".
     *
     * Default: If encryption is set to KMS and not specified, a key will be created.
     *
     * @param encryptionMasterKey External KMS key to use for queue encryption. 
     */
    override fun encryptionMasterKey(encryptionMasterKey: IKey) {
      cdkBuilder.encryptionMasterKey(encryptionMasterKey.let(IKey::unwrap))
    }

    /**
     * Enforce encryption of data in transit.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-security-best-practices.html#enforce-encryption-data-in-transit)
     * @param enforceSsl Enforce encryption of data in transit. 
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * Whether this a first-in-first-out (FIFO) queue.
     *
     * Default: false, unless queueName ends in '.fifo' or 'contentBasedDeduplication' is true.
     *
     * @param fifo Whether this a first-in-first-out (FIFO) queue. 
     */
    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    /**
     * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota
     * applies to the entire queue or per message group.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: FifoThroughputLimit.PER_QUEUE
     *
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group. 
     */
    override fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit.let(FifoThroughputLimit::unwrap))
    }

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
     * (256 KiB). The default value is 262144 (256 KiB).
     *
     * Default: 256KiB
     *
     * @param maxMessageSizeBytes The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it. 
     */
    override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    /**
     * A name for the queue.
     *
     * If specified and this is a FIFO queue, must end in the string '.fifo'.
     *
     * Default: CloudFormation-generated name
     *
     * @param queueName A name for the queue. 
     */
    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    /**
     * Default wait time for ReceiveMessage calls.
     *
     * Does not wait if set to 0, otherwise waits this amount of seconds
     * by default for messages to arrive.
     *
     * For more information, see Amazon SQS Long Poll.
     *
     * Default: 0
     *
     * @param receiveMessageWaitTime Default wait time for ReceiveMessage calls. 
     */
    override fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
      cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime.let(Duration::unwrap))
    }

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues.
     *
     * Default: - All source queues can designate this queue as their dead-letter queue.
     *
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues. 
     */
    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy.let(RedriveAllowPolicy::unwrap))
    }

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues.
     *
     * Default: - All source queues can designate this queue as their dead-letter queue.
     *
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bda4096d045a478f2b31ab46f72925fb4078b6516e4a5c1eef3f25da474a121")
    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit): Unit
        = redriveAllowPolicy(RedriveAllowPolicy(redriveAllowPolicy))

    /**
     * Policy to apply when the queue is removed from the stack.
     *
     * Even though queues are technically stateful, their contents are transient and it
     * is common to add and remove Queues while rearchitecting your application. The
     * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
     * valuable that accidentally losing them would be unacceptable.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Policy to apply when the queue is removed from the stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from 60 seconds (1 minute) to 1209600
     * seconds (14 days). The default value is 345600 seconds (4 days).
     *
     * Default: Duration.days(4)
     *
     * @param retentionPeriod The number of seconds that Amazon SQS retains a message. 
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * Timeout of processing a single message.
     *
     * After dequeuing, the processor has this much time to handle the message
     * and delete it from the queue before it becomes visible again for dequeueing
     * by another processor.
     *
     * Values must be from 0 to 43200 seconds (12 hours). If you don't specify
     * a value, AWS CloudFormation uses the default value of 30 seconds.
     *
     * Default: Duration.seconds(30)
     *
     * @param visibilityTimeout Timeout of processing a single message. 
     */
    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.Queue = cdkBuilder.build()
  }

  public companion object {
    public fun fromQueueArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      queueArn: String,
    ): IQueue =
        software.amazon.awscdk.services.sqs.Queue.fromQueueArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, queueArn).let(IQueue::wrap)

    public fun fromQueueAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: QueueAttributes,
    ): IQueue =
        software.amazon.awscdk.services.sqs.Queue.fromQueueAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(QueueAttributes::unwrap)).let(IQueue::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e7908d25798651fbd0c90d97212232d58887dfc0aa75b4d5f4c6e87ff68d1bd")
    public fun fromQueueAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: QueueAttributes.Builder.() -> Unit,
    ): IQueue = fromQueueAttributes(scope, id, QueueAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Queue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Queue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.Queue): Queue =
        Queue(cdkObject)

    internal fun unwrap(wrapped: Queue): software.amazon.awscdk.services.sqs.Queue =
        wrapped.cdkObject as software.amazon.awscdk.services.sqs.Queue
  }
}
