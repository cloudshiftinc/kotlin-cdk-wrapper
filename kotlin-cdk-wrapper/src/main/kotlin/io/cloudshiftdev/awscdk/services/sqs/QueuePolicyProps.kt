@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to associate SQS queues with a policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * QueuePolicyProps queuePolicyProps = QueuePolicyProps.builder()
 * .queues(List.of(queue))
 * .build();
 * ```
 */
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
        QueuePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? QueuePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueuePolicyProps):
        software.amazon.awscdk.services.sqs.QueuePolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.QueuePolicyProps
  }
}
