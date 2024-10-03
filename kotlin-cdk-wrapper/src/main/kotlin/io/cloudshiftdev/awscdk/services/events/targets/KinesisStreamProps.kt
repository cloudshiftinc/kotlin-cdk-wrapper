@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Customize the Kinesis Stream Event Target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.events.targets.*;
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * Queue queue;
 * RuleTargetInput ruleTargetInput;
 * KinesisStreamProps kinesisStreamProps = KinesisStreamProps.builder()
 * .deadLetterQueue(queue)
 * .maxEventAge(Duration.minutes(30))
 * .message(ruleTargetInput)
 * .partitionKeyPath("partitionKeyPath")
 * .retryAttempts(123)
 * .build();
 * ```
 */
public interface KinesisStreamProps : TargetBaseProps {
  /**
   * The message to send to the stream.
   *
   * Must be a valid JSON text passed to the target stream.
   *
   * Default: - the entire CloudWatch event
   */
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  /**
   * Partition Key Path for records sent to this stream.
   *
   * Default: - eventId as the partition key
   */
  public fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()

  /**
   * A builder for [KinesisStreamProps]
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
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    public fun message(message: RuleTargetInput)

    /**
     * @param partitionKeyPath Partition Key Path for records sent to this stream.
     */
    public fun partitionKeyPath(partitionKeyPath: String)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.Builder =
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.builder()

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
     * @param message The message to send to the stream.
     * Must be a valid JSON text passed to the target stream.
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param partitionKeyPath Partition Key Path for records sent to this stream.
     */
    override fun partitionKeyPath(partitionKeyPath: String) {
      cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps,
  ) : CdkObject(cdkObject),
      KinesisStreamProps {
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
     * The message to send to the stream.
     *
     * Must be a valid JSON text passed to the target stream.
     *
     * Default: - the entire CloudWatch event
     */
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

    /**
     * Partition Key Path for records sent to this stream.
     *
     * Default: - eventId as the partition key
     */
    override fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps):
        KinesisStreamProps = CdkObjectWrappers.wrap(cdkObject) as? KinesisStreamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.KinesisStreamProps
  }
}
