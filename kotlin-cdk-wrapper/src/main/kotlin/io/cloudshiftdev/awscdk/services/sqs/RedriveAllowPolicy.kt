@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Permission settings for the dead letter source queue.
 *
 * Example:
 *
 * ```
 * IQueue sourceQueue;
 * // Only the sourceQueue can specify this queue as the dead-letter queue.
 * Queue queue1 = Queue.Builder.create(this, "Queue2")
 * .redriveAllowPolicy(RedriveAllowPolicy.builder()
 * .sourceQueues(List.of(sourceQueue))
 * .build())
 * .build();
 * // No source queues can specify this queue as the dead-letter queue.
 * Queue queue2 = Queue.Builder.create(this, "Queue")
 * .redriveAllowPolicy(RedriveAllowPolicy.builder()
 * .redrivePermission(RedrivePermission.DENY_ALL)
 * .build())
 * .build();
 * ```
 */
public interface RedriveAllowPolicy {
  /**
   * Permission settings for source queues that can designate this queue as their dead-letter queue.
   *
   * Default: - `RedrivePermission.BY_QUEUE` if `sourceQueues` is
   * specified,`RedrivePermission.ALLOW_ALL` otherwise.
   */
  public fun redrivePermission(): RedrivePermission? =
      unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

  /**
   * Source queues that can designate this queue as their dead-letter queue.
   *
   * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
   *
   * You can specify up to 10 source queues.
   * To allow more than 10 source queues to specify dead-letter queues, set the `redrivePermission`
   * to
   * `RedrivePermission.ALLOW_ALL`.
   *
   * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
   * `RedrivePermission.DENY_ALL`,
   * this parameter cannot be set.
   *
   * Default: - Required when `redrivePermission` is `RedrivePermission.BY_QUEUE`, cannot be defined
   * otherwise.
   */
  public fun sourceQueues(): List<IQueue> = unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?:
      emptyList()

  /**
   * A builder for [RedriveAllowPolicy]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param redrivePermission Permission settings for source queues that can designate this queue
     * as their dead-letter queue.
     */
    public fun redrivePermission(redrivePermission: RedrivePermission)

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
     *
     * You can specify up to 10 source queues.
     * To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` to
     * `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`,
     * this parameter cannot be set.
     */
    public fun sourceQueues(sourceQueues: List<IQueue>)

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
     *
     * You can specify up to 10 source queues.
     * To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` to
     * `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`,
     * this parameter cannot be set.
     */
    public fun sourceQueues(vararg sourceQueues: IQueue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.RedriveAllowPolicy.Builder =
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy.builder()

    /**
     * @param redrivePermission Permission settings for source queues that can designate this queue
     * as their dead-letter queue.
     */
    override fun redrivePermission(redrivePermission: RedrivePermission) {
      cdkBuilder.redrivePermission(redrivePermission.let(RedrivePermission.Companion::unwrap))
    }

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
     *
     * You can specify up to 10 source queues.
     * To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` to
     * `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`,
     * this parameter cannot be set.
     */
    override fun sourceQueues(sourceQueues: List<IQueue>) {
      cdkBuilder.sourceQueues(sourceQueues.map(IQueue.Companion::unwrap))
    }

    /**
     * @param sourceQueues Source queues that can designate this queue as their dead-letter queue.
     * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
     *
     * You can specify up to 10 source queues.
     * To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` to
     * `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`,
     * this parameter cannot be set.
     */
    override fun sourceQueues(vararg sourceQueues: IQueue): Unit =
        sourceQueues(sourceQueues.toList())

    public fun build(): software.amazon.awscdk.services.sqs.RedriveAllowPolicy = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy,
  ) : CdkObject(cdkObject),
      RedriveAllowPolicy {
    /**
     * Permission settings for source queues that can designate this queue as their dead-letter
     * queue.
     *
     * Default: - `RedrivePermission.BY_QUEUE` if `sourceQueues` is
     * specified,`RedrivePermission.ALLOW_ALL` otherwise.
     */
    override fun redrivePermission(): RedrivePermission? =
        unwrap(this).getRedrivePermission()?.let(RedrivePermission::wrap)

    /**
     * Source queues that can designate this queue as their dead-letter queue.
     *
     * When `redrivePermission` is set to `RedrivePermission.BY_QUEUE`, this parameter is required.
     *
     * You can specify up to 10 source queues.
     * To allow more than 10 source queues to specify dead-letter queues, set the
     * `redrivePermission` to
     * `RedrivePermission.ALLOW_ALL`.
     *
     * When `redrivePermission` is either `RedrivePermission.ALLOW_ALL` or
     * `RedrivePermission.DENY_ALL`,
     * this parameter cannot be set.
     *
     * Default: - Required when `redrivePermission` is `RedrivePermission.BY_QUEUE`, cannot be
     * defined otherwise.
     */
    override fun sourceQueues(): List<IQueue> = unwrap(this).getSourceQueues()?.map(IQueue::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RedriveAllowPolicy {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.RedriveAllowPolicy):
        RedriveAllowPolicy = CdkObjectWrappers.wrap(cdkObject) as? RedriveAllowPolicy ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedriveAllowPolicy):
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sqs.RedriveAllowPolicy
  }
}
