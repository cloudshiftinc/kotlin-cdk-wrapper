package io.cloudshiftdev.awscdk.services.sqs

import kotlin.Number
import kotlin.Unit

public interface DeadLetterQueue {
  public fun maxReceiveCount(): Number

  public fun queue(): IQueue

  public interface Builder {
    public fun maxReceiveCount(maxReceiveCount: Number)

    public fun queue(queue: IQueue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder =
        software.amazon.awscdk.services.sqs.DeadLetterQueue.builder()

    override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.DeadLetterQueue = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue,
  ) : DeadLetterQueue {
    override fun maxReceiveCount(): Number = unwrap(this).getMaxReceiveCount()

    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterQueue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue):
        DeadLetterQueue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeadLetterQueue):
        software.amazon.awscdk.services.sqs.DeadLetterQueue = (wrapped as Wrapper).cdkObject
  }
}
