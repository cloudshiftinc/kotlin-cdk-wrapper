@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.DeduplicationScope
import software.amazon.awscdk.services.sqs.FifoThroughputLimit
import software.amazon.awscdk.services.sqs.QueueEncryption
import software.amazon.awscdk.services.sqs.QueueProps

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
@CdkDslMarker
public class QueuePropsDsl {
  private val cdkBuilder: QueueProps.Builder = QueueProps.builder()

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
  public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
    cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
  }

  /**
   * @param dataKeyReuse The length of time that Amazon SQS reuses a data key before calling KMS
   * again.
   * The value must be an integer between 60 (1 minute) and 86,400 (24
   * hours). The default is 300 (5 minutes).
   */
  public fun dataKeyReuse(dataKeyReuse: Duration) {
    cdkBuilder.dataKeyReuse(dataKeyReuse)
  }

  /**
   * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
   * number of times.
   */
  public fun deadLetterQueue(deadLetterQueue: DeadLetterQueueDsl.() -> Unit = {}) {
    val builder = DeadLetterQueueDsl()
    builder.apply(deadLetterQueue)
    cdkBuilder.deadLetterQueue(builder.build())
  }

  /**
   * @param deadLetterQueue Send messages to this queue if they were unsuccessfully dequeued a
   * number of times.
   */
  public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * @param deduplicationScope For high throughput for FIFO queues, specifies whether message
   * deduplication occurs at the message group or queue level.
   * (Only applies to FIFO queues.)
   */
  public fun deduplicationScope(deduplicationScope: DeduplicationScope) {
    cdkBuilder.deduplicationScope(deduplicationScope)
  }

  /**
   * @param deliveryDelay The time in seconds that the delivery of all messages in the queue is
   * delayed.
   * You can specify an integer value of 0 to 900 (15 minutes). The default
   * value is 0.
   */
  public fun deliveryDelay(deliveryDelay: Duration) {
    cdkBuilder.deliveryDelay(deliveryDelay)
  }

  /**
   * @param encryption Whether the contents of the queue are encrypted, and by what type of key.
   * Be aware that encryption is not available in all regions, please see the docs
   * for current availability details.
   */
  public fun encryption(encryption: QueueEncryption) {
    cdkBuilder.encryption(encryption)
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
  public fun encryptionMasterKey(encryptionMasterKey: IKey) {
    cdkBuilder.encryptionMasterKey(encryptionMasterKey)
  }

  /**
   * @param enforceSsl Enforce encryption of data in transit.
   */
  public fun enforceSsl(enforceSsl: Boolean) {
    cdkBuilder.enforceSsl(enforceSsl)
  }

  /**
   * @param fifo Whether this a first-in-first-out (FIFO) queue.
   */
  public fun fifo(fifo: Boolean) {
    cdkBuilder.fifo(fifo)
  }

  /**
   * @param fifoThroughputLimit For high throughput for FIFO queues, specifies whether the FIFO
   * queue throughput quota applies to the entire queue or per message group.
   * (Only applies to FIFO queues.)
   */
  public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
    cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
  }

  /**
   * @param maxMessageSizeBytes The limit of how many bytes that a message can contain before Amazon
   * SQS rejects it.
   * You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes
   * (256 KiB). The default value is 262144 (256 KiB).
   */
  public fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
    cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
  }

  /**
   * @param queueName A name for the queue.
   * If specified and this is a FIFO queue, must end in the string '.fifo'.
   */
  public fun queueName(queueName: String) {
    cdkBuilder.queueName(queueName)
  }

  /**
   * @param receiveMessageWaitTime Default wait time for ReceiveMessage calls.
   * Does not wait if set to 0, otherwise waits this amount of seconds
   * by default for messages to arrive.
   *
   * For more information, see Amazon SQS Long Poll.
   */
  public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
    cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime)
  }

  /**
   * @param removalPolicy Policy to apply when the queue is removed from the stack.
   * Even though queues are technically stateful, their contents are transient and it
   * is common to add and remove Queues while rearchitecting your application. The
   * default is therefore `DESTROY`. Change it to `RETAIN` if the messages are so
   * valuable that accidentally losing them would be unacceptable.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param retentionPeriod The number of seconds that Amazon SQS retains a message.
   * You can specify an integer value from 60 seconds (1 minute) to 1209600
   * seconds (14 days). The default value is 345600 seconds (4 days).
   */
  public fun retentionPeriod(retentionPeriod: Duration) {
    cdkBuilder.retentionPeriod(retentionPeriod)
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
  public fun visibilityTimeout(visibilityTimeout: Duration) {
    cdkBuilder.visibilityTimeout(visibilityTimeout)
  }

  public fun build(): QueueProps = cdkBuilder.build()
}
