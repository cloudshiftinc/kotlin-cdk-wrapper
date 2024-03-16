@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for creating a new Queue.
 *
 * Example:
 *
 * ```
 * Topic topic = new Topic(this, "Topic");
 * Queue dlQueue = Queue.Builder.create(this, "DeadLetterQueue")
 * .queueName("MySubscription_DLQ")
 * .retentionPeriod(Duration.days(14))
 * .build();
 * Subscription.Builder.create(this, "Subscription")
 * .endpoint("endpoint")
 * .protocol(SubscriptionProtocol.LAMBDA)
 * .topic(topic)
 * .deadLetterQueue(dlQueue)
 * .build();
 * ```
 */
public interface QueueProps {
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
   */
  public fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

  /**
   * The length of time that Amazon SQS reuses a data key before calling KMS again.
   *
   * The value must be an integer between 60 (1 minute) and 86,400 (24
   * hours). The default is 300 (5 minutes).
   *
   * Default: Duration.minutes(5)
   */
  public fun dataKeyReuse(): Duration? = unwrap(this).getDataKeyReuse()?.let(Duration::wrap)

  /**
   * Send messages to this queue if they were unsuccessfully dequeued a number of times.
   *
   * Default: no dead-letter queue
   */
  public fun deadLetterQueue(): DeadLetterQueue? =
      unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

  /**
   * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
   * message group or queue level.
   *
   * (Only applies to FIFO queues.)
   *
   * Default: DeduplicationScope.QUEUE
   */
  public fun deduplicationScope(): DeduplicationScope? =
      unwrap(this).getDeduplicationScope()?.let(DeduplicationScope::wrap)

  /**
   * The time in seconds that the delivery of all messages in the queue is delayed.
   *
   * You can specify an integer value of 0 to 900 (15 minutes). The default
   * value is 0.
   *
   * Default: 0
   */
  public fun deliveryDelay(): Duration? = unwrap(this).getDeliveryDelay()?.let(Duration::wrap)

  /**
   * Whether the contents of the queue are encrypted, and by what type of key.
   *
   * Be aware that encryption is not available in all regions, please see the docs
   * for current availability details.
   *
   * Default: SQS_MANAGED (SSE-SQS) for newly created queues
   */
  public fun encryption(): QueueEncryption? =
      unwrap(this).getEncryption()?.let(QueueEncryption::wrap)

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
   */
  public fun encryptionMasterKey(): IKey? = unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  /**
   * Enforce encryption of data in transit.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-security-best-practices.html#enforce-encryption-data-in-transit)
   */
  public fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

  /**
   * Whether this a first-in-first-out (FIFO) queue.
   *
   * Default: false, unless queueName ends in '.fifo' or 'contentBasedDeduplication' is true.
   */
  public fun fifo(): Boolean? = unwrap(this).getFifo()

  /**
   * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota applies
   * to the entire queue or per message group.
   *
   * (Only applies to FIFO queues.)
   *
   * Default: FifoThroughputLimit.PER_QUEUE
   */
  public fun fifoThroughputLimit(): FifoThroughputLimit? =
      unwrap(this).getFifoThroughputLimit()?.let(FifoThroughputLimit::wrap)

  /**
   * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
   *
   * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
   * (256 KiB). The default value is 262144 (256 KiB).
   *
   * Default: 256KiB
   */
  public fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

  /**
   * A name for the queue.
   *
   * If specified and this is a FIFO queue, must end in the string '.fifo'.
   *
   * Default: CloudFormation-generated name
   */
  public fun queueName(): String? = unwrap(this).getQueueName()

  /**
   * Default wait time for ReceiveMessage calls.
   *
   * Does not wait if set to 0, otherwise waits this amount of seconds
   * by default for messages to arrive.
   *
   * For more information, see Amazon SQS Long Poll.
   *
   * Default: 0
   */
  public fun receiveMessageWaitTime(): Duration? =
      unwrap(this).getReceiveMessageWaitTime()?.let(Duration::wrap)

  /**
   * The string that includes the parameters for the permissions for the dead-letter queue redrive
   * permission and which source queues can specify dead-letter queues.
   *
   * Default: - All source queues can designate this queue as their dead-letter queue.
   */
  public fun redriveAllowPolicy(): RedriveAllowPolicy? =
      unwrap(this).getRedriveAllowPolicy()?.let(RedriveAllowPolicy::wrap)

  /**
   * Policy to apply when the queue is removed from the stack.
   *
   * Even though queues are technically stateful, their contents are transient and it
   * is common to add and remove Queues while rearchitecting your application. The
   * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
   * valuable that accidentally losing them would be unacceptable.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The number of seconds that Amazon SQS retains a message.
   *
   * You can specify an integer value from 60 seconds (1 minute) to 1209600
   * seconds (14 days). The default value is 345600 seconds (4 days).
   *
   * Default: Duration.days(4)
   */
  public fun retentionPeriod(): Duration? = unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

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
   */
  public fun visibilityTimeout(): Duration? =
      unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)

  /**
   * A builder for [QueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentBasedDeduplication Specifies whether to enable content-based deduplication.
     * During the deduplication interval (5 minutes), Amazon SQS treats
     * messages that are sent with identical content (excluding attributes) as
     * duplicates and delivers only one copy of the message.
     *
     * If you don't enable content-based deduplication and you want to deduplicate
     * messages, provide an explicit deduplication ID in your SendMessage() call.
     *
     * (Only applies to FIFO queues.)
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * @param dataKeyReuse The length of time that Amazon SQS reuses a data key before calling KMS
     * again.
     * The value must be an integer between 60 (1 minute) and 86,400 (24
     * hours). The default is 300 (5 minutes).
     */
    public fun dataKeyReuse(dataKeyReuse: Duration)

    /**
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times.
     */
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue)

    /**
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c52ffff7131f7048cf4b40cc247eaf4a5e1add0002f5f64e936bcf2863ba4c")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit)

    /**
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level.
     * (Only applies to FIFO queues.)
     */
    public fun deduplicationScope(deduplicationScope: DeduplicationScope)

    /**
     * @param deliveryDelay The time in seconds that the delivery of all messages in the queue is
     * delayed.
     * You can specify an integer value of 0 to 900 (15 minutes). The default
     * value is 0.
     */
    public fun deliveryDelay(deliveryDelay: Duration)

    /**
     * @param encryption Whether the contents of the queue are encrypted, and by what type of key.
     * Be aware that encryption is not available in all regions, please see the docs
     * for current availability details.
     */
    public fun encryption(encryption: QueueEncryption)

    /**
     * @param encryptionMasterKey External KMS key to use for queue encryption.
     * Individual messages will be encrypted using data keys. The data keys in
     * turn will be encrypted using this key, and reused for a maximum of
     * `dataKeyReuseSecs` seconds.
     *
     * If the 'encryptionMasterKey' property is set, 'encryption' type will be
     * implicitly set to "KMS".
     */
    public fun encryptionMasterKey(encryptionMasterKey: IKey)

    /**
     * @param enforceSsl Enforce encryption of data in transit.
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * @param fifo Whether this a first-in-first-out (FIFO) queue.
     */
    public fun fifo(fifo: Boolean)

    /**
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group.
     * (Only applies to FIFO queues.)
     */
    public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit)

    /**
     * @param maxMessageSizeBytes The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it.
     * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
     * (256 KiB). The default value is 262144 (256 KiB).
     */
    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number)

    /**
     * @param queueName A name for the queue.
     * If specified and this is a FIFO queue, must end in the string '.fifo'.
     */
    public fun queueName(queueName: String)

    /**
     * @param receiveMessageWaitTime Default wait time for ReceiveMessage calls.
     * Does not wait if set to 0, otherwise waits this amount of seconds
     * by default for messages to arrive.
     *
     * For more information, see Amazon SQS Long Poll.
     */
    public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration)

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues.
     */
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy)

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3513208c1e5568414a05e6ff76efa67ef80d61dea2eec0b2bfe4b6c24cb7cf73")
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit)

    /**
     * @param removalPolicy Policy to apply when the queue is removed from the stack.
     * Even though queues are technically stateful, their contents are transient and it
     * is common to add and remove Queues while rearchitecting your application. The
     * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
     * valuable that accidentally losing them would be unacceptable.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param retentionPeriod The number of seconds that Amazon SQS retains a message.
     * You can specify an integer value from 60 seconds (1 minute) to 1209600
     * seconds (14 days). The default value is 345600 seconds (4 days).
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * @param visibilityTimeout Timeout of processing a single message.
     * After dequeuing, the processor has this much time to handle the message
     * and delete it from the queue before it becomes visible again for dequeueing
     * by another processor.
     *
     * Values must be from 0 to 43200 seconds (12 hours). If you don't specify
     * a value, AWS CloudFormation uses the default value of 30 seconds.
     */
    public fun visibilityTimeout(visibilityTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueueProps.Builder =
        software.amazon.awscdk.services.sqs.QueueProps.builder()

    /**
     * @param contentBasedDeduplication Specifies whether to enable content-based deduplication.
     * During the deduplication interval (5 minutes), Amazon SQS treats
     * messages that are sent with identical content (excluding attributes) as
     * duplicates and delivers only one copy of the message.
     *
     * If you don't enable content-based deduplication and you want to deduplicate
     * messages, provide an explicit deduplication ID in your SendMessage() call.
     *
     * (Only applies to FIFO queues.)
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param dataKeyReuse The length of time that Amazon SQS reuses a data key before calling KMS
     * again.
     * The value must be an integer between 60 (1 minute) and 86,400 (24
     * hours). The default is 300 (5 minutes).
     */
    override fun dataKeyReuse(dataKeyReuse: Duration) {
      cdkBuilder.dataKeyReuse(dataKeyReuse.let(Duration::unwrap))
    }

    /**
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times.
     */
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueue::unwrap))
    }

    /**
     * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
     * number of times.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c52ffff7131f7048cf4b40cc247eaf4a5e1add0002f5f64e936bcf2863ba4c")
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit): Unit =
        deadLetterQueue(DeadLetterQueue(deadLetterQueue))

    /**
     * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
     * deduplication occurs at the message group or queue level.
     * (Only applies to FIFO queues.)
     */
    override fun deduplicationScope(deduplicationScope: DeduplicationScope) {
      cdkBuilder.deduplicationScope(deduplicationScope.let(DeduplicationScope::unwrap))
    }

    /**
     * @param deliveryDelay The time in seconds that the delivery of all messages in the queue is
     * delayed.
     * You can specify an integer value of 0 to 900 (15 minutes). The default
     * value is 0.
     */
    override fun deliveryDelay(deliveryDelay: Duration) {
      cdkBuilder.deliveryDelay(deliveryDelay.let(Duration::unwrap))
    }

    /**
     * @param encryption Whether the contents of the queue are encrypted, and by what type of key.
     * Be aware that encryption is not available in all regions, please see the docs
     * for current availability details.
     */
    override fun encryption(encryption: QueueEncryption) {
      cdkBuilder.encryption(encryption.let(QueueEncryption::unwrap))
    }

    /**
     * @param encryptionMasterKey External KMS key to use for queue encryption.
     * Individual messages will be encrypted using data keys. The data keys in
     * turn will be encrypted using this key, and reused for a maximum of
     * `dataKeyReuseSecs` seconds.
     *
     * If the 'encryptionMasterKey' property is set, 'encryption' type will be
     * implicitly set to "KMS".
     */
    override fun encryptionMasterKey(encryptionMasterKey: IKey) {
      cdkBuilder.encryptionMasterKey(encryptionMasterKey.let(IKey::unwrap))
    }

    /**
     * @param enforceSsl Enforce encryption of data in transit.
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * @param fifo Whether this a first-in-first-out (FIFO) queue.
     */
    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    /**
     * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
     * queue throughput quota applies to the entire queue or per message group.
     * (Only applies to FIFO queues.)
     */
    override fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit.let(FifoThroughputLimit::unwrap))
    }

    /**
     * @param maxMessageSizeBytes The limit of how many bytes that a message can contain before
     * Amazon SQS rejects it.
     * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
     * (256 KiB). The default value is 262144 (256 KiB).
     */
    override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    /**
     * @param queueName A name for the queue.
     * If specified and this is a FIFO queue, must end in the string '.fifo'.
     */
    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    /**
     * @param receiveMessageWaitTime Default wait time for ReceiveMessage calls.
     * Does not wait if set to 0, otherwise waits this amount of seconds
     * by default for messages to arrive.
     *
     * For more information, see Amazon SQS Long Poll.
     */
    override fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
      cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime.let(Duration::unwrap))
    }

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues.
     */
    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy.let(RedriveAllowPolicy::unwrap))
    }

    /**
     * @param redriveAllowPolicy The string that includes the parameters for the permissions for the
     * dead-letter queue redrive permission and which source queues can specify dead-letter queues.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3513208c1e5568414a05e6ff76efa67ef80d61dea2eec0b2bfe4b6c24cb7cf73")
    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit): Unit
        = redriveAllowPolicy(RedriveAllowPolicy(redriveAllowPolicy))

    /**
     * @param removalPolicy Policy to apply when the queue is removed from the stack.
     * Even though queues are technically stateful, their contents are transient and it
     * is common to add and remove Queues while rearchitecting your application. The
     * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
     * valuable that accidentally losing them would be unacceptable.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param retentionPeriod The number of seconds that Amazon SQS retains a message.
     * You can specify an integer value from 60 seconds (1 minute) to 1209600
     * seconds (14 days). The default value is 345600 seconds (4 days).
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * @param visibilityTimeout Timeout of processing a single message.
     * After dequeuing, the processor has this much time to handle the message
     * and delete it from the queue before it becomes visible again for dequeueing
     * by another processor.
     *
     * Values must be from 0 to 43200 seconds (12 hours). If you don't specify
     * a value, AWS CloudFormation uses the default value of 30 seconds.
     */
    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.QueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.QueueProps,
  ) : CdkObject(cdkObject), QueueProps {
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
     */
    override fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

    /**
     * The length of time that Amazon SQS reuses a data key before calling KMS again.
     *
     * The value must be an integer between 60 (1 minute) and 86,400 (24
     * hours). The default is 300 (5 minutes).
     *
     * Default: Duration.minutes(5)
     */
    override fun dataKeyReuse(): Duration? = unwrap(this).getDataKeyReuse()?.let(Duration::wrap)

    /**
     * Send messages to this queue if they were unsuccessfully dequeued a number of times.
     *
     * Default: no dead-letter queue
     */
    override fun deadLetterQueue(): DeadLetterQueue? =
        unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

    /**
     * For high throughput for FIFO queues, specifies whether message deduplication occurs at the
     * message group or queue level.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: DeduplicationScope.QUEUE
     */
    override fun deduplicationScope(): DeduplicationScope? =
        unwrap(this).getDeduplicationScope()?.let(DeduplicationScope::wrap)

    /**
     * The time in seconds that the delivery of all messages in the queue is delayed.
     *
     * You can specify an integer value of 0 to 900 (15 minutes). The default
     * value is 0.
     *
     * Default: 0
     */
    override fun deliveryDelay(): Duration? = unwrap(this).getDeliveryDelay()?.let(Duration::wrap)

    /**
     * Whether the contents of the queue are encrypted, and by what type of key.
     *
     * Be aware that encryption is not available in all regions, please see the docs
     * for current availability details.
     *
     * Default: SQS_MANAGED (SSE-SQS) for newly created queues
     */
    override fun encryption(): QueueEncryption? =
        unwrap(this).getEncryption()?.let(QueueEncryption::wrap)

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
     */
    override fun encryptionMasterKey(): IKey? =
        unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

    /**
     * Enforce encryption of data in transit.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-security-best-practices.html#enforce-encryption-data-in-transit)
     */
    override fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

    /**
     * Whether this a first-in-first-out (FIFO) queue.
     *
     * Default: false, unless queueName ends in '.fifo' or 'contentBasedDeduplication' is true.
     */
    override fun fifo(): Boolean? = unwrap(this).getFifo()

    /**
     * For high throughput for FIFO queues, specifies whether the FIFO queue throughput quota
     * applies to the entire queue or per message group.
     *
     * (Only applies to FIFO queues.)
     *
     * Default: FifoThroughputLimit.PER_QUEUE
     */
    override fun fifoThroughputLimit(): FifoThroughputLimit? =
        unwrap(this).getFifoThroughputLimit()?.let(FifoThroughputLimit::wrap)

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it.
     *
     * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
     * (256 KiB). The default value is 262144 (256 KiB).
     *
     * Default: 256KiB
     */
    override fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

    /**
     * A name for the queue.
     *
     * If specified and this is a FIFO queue, must end in the string '.fifo'.
     *
     * Default: CloudFormation-generated name
     */
    override fun queueName(): String? = unwrap(this).getQueueName()

    /**
     * Default wait time for ReceiveMessage calls.
     *
     * Does not wait if set to 0, otherwise waits this amount of seconds
     * by default for messages to arrive.
     *
     * For more information, see Amazon SQS Long Poll.
     *
     * Default: 0
     */
    override fun receiveMessageWaitTime(): Duration? =
        unwrap(this).getReceiveMessageWaitTime()?.let(Duration::wrap)

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive
     * permission and which source queues can specify dead-letter queues.
     *
     * Default: - All source queues can designate this queue as their dead-letter queue.
     */
    override fun redriveAllowPolicy(): RedriveAllowPolicy? =
        unwrap(this).getRedriveAllowPolicy()?.let(RedriveAllowPolicy::wrap)

    /**
     * Policy to apply when the queue is removed from the stack.
     *
     * Even though queues are technically stateful, their contents are transient and it
     * is common to add and remove Queues while rearchitecting your application. The
     * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
     * valuable that accidentally losing them would be unacceptable.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The number of seconds that Amazon SQS retains a message.
     *
     * You can specify an integer value from 60 seconds (1 minute) to 1209600
     * seconds (14 days). The default value is 345600 seconds (4 days).
     *
     * Default: Duration.days(4)
     */
    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

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
     */
    override fun visibilityTimeout(): Duration? =
        unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueProps): QueueProps =
        CdkObjectWrappers.wrap(cdkObject) as QueueProps

    internal fun unwrap(wrapped: QueueProps): software.amazon.awscdk.services.sqs.QueueProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.QueueProps
  }
}
