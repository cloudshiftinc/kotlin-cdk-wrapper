@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Unit

/**
 * Configuration properties of an Event Bus event.
 *
 * Cannot extend TargetBaseProps. Retry policy is not supported for Event bus targets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * Role role;
 * EventBusProps eventBusProps = EventBusProps.builder()
 * .deadLetterQueue(queue)
 * .role(role)
 * .build();
 * ```
 */
public interface EventBusProps {
  /**
   * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
   * dead-letter
   * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
   *
   * The events not successfully delivered are automatically retried for a specified period of time,
   * depending on the retry policy of the target.
   * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
   * dead letter queue.
   *
   * Default: - no dead-letter queue
   */
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * Role to be used to publish the event.
   *
   * Default: a new role is created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [EventBusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param role Role to be used to publish the event.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EventBusProps.Builder =
        software.amazon.awscdk.services.events.targets.EventBusProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * @param role Role to be used to publish the event.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EventBusProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.EventBusProps,
  ) : CdkObject(cdkObject), EventBusProps {
    /**
     * The SQS queue to be used as deadLetterQueue. Check out the [considerations for using a
     * dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * Role to be used to publish the event.
     *
     * Default: a new role is created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EventBusProps):
        EventBusProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusProps):
        software.amazon.awscdk.services.events.targets.EventBusProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.EventBusProps
  }
}
