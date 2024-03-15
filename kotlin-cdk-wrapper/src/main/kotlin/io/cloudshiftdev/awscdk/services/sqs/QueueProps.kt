@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface QueueProps {
  public fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

  public fun dataKeyReuse(): Duration? = unwrap(this).getDataKeyReuse()?.let(Duration::wrap)

  public fun deadLetterQueue(): DeadLetterQueue? =
      unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

  public fun deduplicationScope(): DeduplicationScope? =
      unwrap(this).getDeduplicationScope()?.let(DeduplicationScope::wrap)

  public fun deliveryDelay(): Duration? = unwrap(this).getDeliveryDelay()?.let(Duration::wrap)

  public fun encryption(): QueueEncryption? =
      unwrap(this).getEncryption()?.let(QueueEncryption::wrap)

  public fun encryptionMasterKey(): IKey? = unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  public fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

  public fun fifo(): Boolean? = unwrap(this).getFifo()

  public fun fifoThroughputLimit(): FifoThroughputLimit? =
      unwrap(this).getFifoThroughputLimit()?.let(FifoThroughputLimit::wrap)

  public fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

  public fun queueName(): String? = unwrap(this).getQueueName()

  public fun receiveMessageWaitTime(): Duration? =
      unwrap(this).getReceiveMessageWaitTime()?.let(Duration::wrap)

  public fun redriveAllowPolicy(): RedriveAllowPolicy? =
      unwrap(this).getRedriveAllowPolicy()?.let(RedriveAllowPolicy::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun retentionPeriod(): Duration? = unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

  public fun visibilityTimeout(): Duration? =
      unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    public fun dataKeyReuse(dataKeyReuse: Duration)

    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c52ffff7131f7048cf4b40cc247eaf4a5e1add0002f5f64e936bcf2863ba4c")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit)

    public fun deduplicationScope(deduplicationScope: DeduplicationScope)

    public fun deliveryDelay(deliveryDelay: Duration)

    public fun encryption(encryption: QueueEncryption)

    public fun encryptionMasterKey(encryptionMasterKey: IKey)

    public fun enforceSsl(enforceSsl: Boolean)

    public fun fifo(fifo: Boolean)

    public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit)

    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number)

    public fun queueName(queueName: String)

    public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration)

    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3513208c1e5568414a05e6ff76efa67ef80d61dea2eec0b2bfe4b6c24cb7cf73")
    public fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun retentionPeriod(retentionPeriod: Duration)

    public fun visibilityTimeout(visibilityTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueueProps.Builder =
        software.amazon.awscdk.services.sqs.QueueProps.builder()

    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    override fun dataKeyReuse(dataKeyReuse: Duration) {
      cdkBuilder.dataKeyReuse(dataKeyReuse.let(Duration::unwrap))
    }

    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueue::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9c52ffff7131f7048cf4b40cc247eaf4a5e1add0002f5f64e936bcf2863ba4c")
    override fun deadLetterQueue(deadLetterQueue: DeadLetterQueue.Builder.() -> Unit): Unit =
        deadLetterQueue(DeadLetterQueue(deadLetterQueue))

    override fun deduplicationScope(deduplicationScope: DeduplicationScope) {
      cdkBuilder.deduplicationScope(deduplicationScope.let(DeduplicationScope::unwrap))
    }

    override fun deliveryDelay(deliveryDelay: Duration) {
      cdkBuilder.deliveryDelay(deliveryDelay.let(Duration::unwrap))
    }

    override fun encryption(encryption: QueueEncryption) {
      cdkBuilder.encryption(encryption.let(QueueEncryption::unwrap))
    }

    override fun encryptionMasterKey(encryptionMasterKey: IKey) {
      cdkBuilder.encryptionMasterKey(encryptionMasterKey.let(IKey::unwrap))
    }

    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    override fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit.let(FifoThroughputLimit::unwrap))
    }

    override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    override fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
      cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime.let(Duration::unwrap))
    }

    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy.let(RedriveAllowPolicy::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3513208c1e5568414a05e6ff76efa67ef80d61dea2eec0b2bfe4b6c24cb7cf73")
    override fun redriveAllowPolicy(redriveAllowPolicy: RedriveAllowPolicy.Builder.() -> Unit): Unit
        = redriveAllowPolicy(RedriveAllowPolicy(redriveAllowPolicy))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.QueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.QueueProps,
  ) : CdkObject(cdkObject), QueueProps {
    override fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

    override fun dataKeyReuse(): Duration? = unwrap(this).getDataKeyReuse()?.let(Duration::wrap)

    override fun deadLetterQueue(): DeadLetterQueue? =
        unwrap(this).getDeadLetterQueue()?.let(DeadLetterQueue::wrap)

    override fun deduplicationScope(): DeduplicationScope? =
        unwrap(this).getDeduplicationScope()?.let(DeduplicationScope::wrap)

    override fun deliveryDelay(): Duration? = unwrap(this).getDeliveryDelay()?.let(Duration::wrap)

    override fun encryption(): QueueEncryption? =
        unwrap(this).getEncryption()?.let(QueueEncryption::wrap)

    override fun encryptionMasterKey(): IKey? =
        unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

    override fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

    override fun fifo(): Boolean? = unwrap(this).getFifo()

    override fun fifoThroughputLimit(): FifoThroughputLimit? =
        unwrap(this).getFifoThroughputLimit()?.let(FifoThroughputLimit::wrap)

    override fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

    override fun queueName(): String? = unwrap(this).getQueueName()

    override fun receiveMessageWaitTime(): Duration? =
        unwrap(this).getReceiveMessageWaitTime()?.let(Duration::wrap)

    override fun redriveAllowPolicy(): RedriveAllowPolicy? =
        unwrap(this).getRedriveAllowPolicy()?.let(RedriveAllowPolicy::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun retentionPeriod(): Duration? =
        unwrap(this).getRetentionPeriod()?.let(Duration::wrap)

    override fun visibilityTimeout(): Duration? =
        unwrap(this).getVisibilityTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueProps): QueueProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueProps): software.amazon.awscdk.services.sqs.QueueProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.QueueProps
  }
}
