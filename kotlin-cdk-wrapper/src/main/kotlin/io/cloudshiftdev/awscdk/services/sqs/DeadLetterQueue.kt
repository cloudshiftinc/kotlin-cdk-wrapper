@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface DeadLetterQueue {
  public fun maxReceiveCount(): Number

  public fun queue(): IQueue

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue,
  ) : CdkObject(cdkObject), DeadLetterQueue {
    override fun maxReceiveCount(): Number = unwrap(this).getMaxReceiveCount()

    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterQueue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue):
        DeadLetterQueue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeadLetterQueue):
        software.amazon.awscdk.services.sqs.DeadLetterQueue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.DeadLetterQueue
  }
}
