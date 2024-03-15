@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.sqs.IQueue as CloudshiftdevAwscdkServicesSqsIQueue
import software.amazon.awscdk.services.sqs.IQueue as AmazonAwscdkServicesSqsIQueue

/**
 * Use an SQS Queue as a target for Amazon EventBridge rules.
 *
 * Example:
 *
 * ```
 * // publish to an SQS queue every time code is committed
 * // to a CodeCommit repository
 * repository.onCommit("onCommit", OnCommitOptions.builder().target(new SqsQueue(queue)).build());
 * ```
 */
public open class SqsQueue internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.SqsQueue,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger this SQS queue as a result from an EventBridge
   * event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sqs-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this SQS queue as a result from an EventBridge
   * event.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sqs-permissions)
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   *
   */
  public open fun queue(): CloudshiftdevAwscdkServicesSqsIQueue =
      unwrap(this).getQueue().let(CloudshiftdevAwscdkServicesSqsIQueue::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.SqsQueue].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    public fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The message to send to the queue.
     *
     * Must be a valid JSON text passed to the target queue.
     *
     * Default: the entire EventBridge event
     *
     * @param message The message to send to the queue. 
     */
    public fun message(message: RuleTargetInput)

    /**
     * Message Group ID for messages sent to this queue.
     *
     * Required for FIFO queues, leave empty for regular queues.
     *
     * Default: - no message group ID (regular queue)
     *
     * @param messageGroupId Message Group ID for messages sent to this queue. 
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)
  }

  private class BuilderImpl(
    queue: AmazonAwscdkServicesSqsIQueue,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SqsQueue.Builder =
        software.amazon.awscdk.services.events.targets.SqsQueue.Builder.create(queue)

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * 
     */
    override fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CloudshiftdevAwscdkServicesSqsIQueue::unwrap))
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    /**
     * The message to send to the queue.
     *
     * Must be a valid JSON text passed to the target queue.
     *
     * Default: the entire EventBridge event
     *
     * @param message The message to send to the queue. 
     */
    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    /**
     * Message Group ID for messages sent to this queue.
     *
     * Required for FIFO queues, leave empty for regular queues.
     *
     * Default: - no message group ID (regular queue)
     *
     * @param messageGroupId Message Group ID for messages sent to this queue. 
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SqsQueue = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(queue: CloudshiftdevAwscdkServicesSqsIQueue,
        block: Builder.() -> Unit = {}): SqsQueue {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSqsIQueue.unwrap(queue))
      return SqsQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SqsQueue): SqsQueue
        = SqsQueue(cdkObject)

    internal fun unwrap(wrapped: SqsQueue): software.amazon.awscdk.services.events.targets.SqsQueue
        = wrapped.cdkObject
  }
}
