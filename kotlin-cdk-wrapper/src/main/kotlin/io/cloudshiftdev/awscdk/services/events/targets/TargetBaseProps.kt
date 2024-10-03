@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.Unit

/**
 * The generic properties for an RuleTarget.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * TargetBaseProps targetBaseProps = TargetBaseProps.builder()
 * .deadLetterQueue(queue)
 * .maxEventAge(Duration.minutes(30))
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface TargetBaseProps {
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
   * The maximum age of a request that Lambda sends to a function for processing.
   *
   * Minimum value of 60.
   * Maximum value of 86400.
   *
   * Default: Duration.hours(24)
   */
  public fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

  /**
   * The maximum number of times to retry when the function returns an error.
   *
   * Minimum value of 0.
   * Maximum value of 185.
   *
   * Default: 185
   */
  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * A builder for [TargetBaseProps]
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
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.TargetBaseProps.Builder =
        software.amazon.awscdk.services.events.targets.TargetBaseProps.builder()

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
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.TargetBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.TargetBaseProps,
  ) : CdkObject(cdkObject),
      TargetBaseProps {
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
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TargetBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.TargetBaseProps):
        TargetBaseProps = CdkObjectWrappers.wrap(cdkObject) as? TargetBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetBaseProps):
        software.amazon.awscdk.services.events.targets.TargetBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.TargetBaseProps
  }
}
