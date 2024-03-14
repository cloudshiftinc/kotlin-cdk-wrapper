package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface QueuePolicyProps {
  /**
   * The set of queues this policy applies to.
   */
  public fun queues(): List<IQueue>

  /**
   * A builder for [QueuePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param queues The set of queues this policy applies to. 
     */
    public fun queues(queues: List<IQueue>)

    /**
     * @param queues The set of queues this policy applies to. 
     */
    public fun queues(vararg queues: IQueue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder =
        software.amazon.awscdk.services.sqs.QueuePolicyProps.builder()

    /**
     * @param queues The set of queues this policy applies to. 
     */
    override fun queues(queues: List<IQueue>) {
      cdkBuilder.queues(queues.map(IQueue::unwrap))
    }

    /**
     * @param queues The set of queues this policy applies to. 
     */
    override fun queues(vararg queues: IQueue): Unit = queues(queues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.QueuePolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.QueuePolicyProps,
  ) : CdkObject(cdkObject), QueuePolicyProps {
    /**
     * The set of queues this policy applies to.
     */
    override fun queues(): List<IQueue> = unwrap(this).getQueues().map(IQueue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueuePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueuePolicyProps):
        QueuePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueuePolicyProps):
        software.amazon.awscdk.services.sqs.QueuePolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.QueuePolicyProps
  }
}
