package io.cloudshiftdev.awscdk.services.sqs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface QueueAttributes {
  public fun fifo(): Boolean? = unwrap(this).getFifo()

  public fun keyArn(): String? = unwrap(this).getKeyArn()

  public fun queueArn(): String

  public fun queueName(): String? = unwrap(this).getQueueName()

  public fun queueUrl(): String? = unwrap(this).getQueueUrl()

  public interface Builder {
    public fun fifo(fifo: Boolean) {
    }

    public fun keyArn(keyArn: String) {
    }

    public fun queueArn(queueArn: String) {
    }

    public fun queueName(queueName: String) {
    }

    public fun queueUrl(queueUrl: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueueAttributes.Builder =
        software.amazon.awscdk.services.sqs.QueueAttributes.builder()

    public override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    public override fun keyArn(keyArn: String) {
      cdkBuilder.keyArn(keyArn)
    }

    public override fun queueArn(queueArn: String) {
      cdkBuilder.queueArn(queueArn)
    }

    public override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    public override fun queueUrl(queueUrl: String) {
      cdkBuilder.queueUrl(queueUrl)
    }

    public fun build(): software.amazon.awscdk.services.sqs.QueueAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sqs.QueueAttributes,
  ) : QueueAttributes {
    public override fun fifo(): Boolean? = unwrap(this).getFifo()

    public override fun keyArn(): String? = unwrap(this).getKeyArn()

    public override fun queueArn(): String = unwrap(this).getQueueArn()

    public override fun queueName(): String? = unwrap(this).getQueueName()

    public override fun queueUrl(): String? = unwrap(this).getQueueUrl()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueueAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueAttributes):
        QueueAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueAttributes):
        software.amazon.awscdk.services.sqs.QueueAttributes = (wrapped as Wrapper).cdkObject
  }
}
