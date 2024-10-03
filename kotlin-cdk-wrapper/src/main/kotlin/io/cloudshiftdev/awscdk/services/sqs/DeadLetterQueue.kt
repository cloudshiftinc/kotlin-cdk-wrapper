@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Dead letter queue settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * DeadLetterQueue deadLetterQueue = DeadLetterQueue.builder()
 * .maxReceiveCount(123)
 * .queue(queue)
 * .build();
 * ```
 */
public interface DeadLetterQueue {
  /**
   * The number of times a message can be unsuccessfully dequeued before being moved to the
   * dead-letter queue.
   */
  public fun maxReceiveCount(): Number

  /**
   * The dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount is
   * exceeded.
   */
  public fun queue(): IQueue

  /**
   * A builder for [DeadLetterQueue]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxReceiveCount The number of times a message can be unsuccessfully dequeued before
     * being moved to the dead-letter queue. 
     */
    public fun maxReceiveCount(maxReceiveCount: Number)

    /**
     * @param queue The dead-letter queue to which Amazon SQS moves messages after the value of
     * maxReceiveCount is exceeded. 
     */
    public fun queue(queue: IQueue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder =
        software.amazon.awscdk.services.sqs.DeadLetterQueue.builder()

    /**
     * @param maxReceiveCount The number of times a message can be unsuccessfully dequeued before
     * being moved to the dead-letter queue. 
     */
    override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    /**
     * @param queue The dead-letter queue to which Amazon SQS moves messages after the value of
     * maxReceiveCount is exceeded. 
     */
    override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sqs.DeadLetterQueue = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue,
  ) : CdkObject(cdkObject),
      DeadLetterQueue {
    /**
     * The number of times a message can be unsuccessfully dequeued before being moved to the
     * dead-letter queue.
     */
    override fun maxReceiveCount(): Number = unwrap(this).getMaxReceiveCount()

    /**
     * The dead-letter queue to which Amazon SQS moves messages after the value of maxReceiveCount
     * is exceeded.
     */
    override fun queue(): IQueue = unwrap(this).getQueue().let(IQueue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterQueue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.DeadLetterQueue):
        DeadLetterQueue = CdkObjectWrappers.wrap(cdkObject) as? DeadLetterQueue ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeadLetterQueue):
        software.amazon.awscdk.services.sqs.DeadLetterQueue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.DeadLetterQueue
  }
}
