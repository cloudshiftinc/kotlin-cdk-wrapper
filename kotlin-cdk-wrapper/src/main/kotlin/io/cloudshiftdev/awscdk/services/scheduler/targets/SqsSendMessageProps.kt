@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a SQS Queue Target.
 *
 * Example:
 *
 * ```
 * String payload = "test";
 * String messageGroupId = "id";
 * Queue queue = Queue.Builder.create(this, "MyQueue")
 * .fifo(true)
 * .contentBasedDeduplication(true)
 * .build();
 * SqsSendMessage target = SqsSendMessage.Builder.create(queue)
 * .input(ScheduleTargetInput.fromText(payload))
 * .messageGroupId(messageGroupId)
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(1)))
 * .target(target)
 * .build();
 * ```
 */
public interface SqsSendMessageProps : ScheduleTargetBaseProps {
  /**
   * The FIFO message group ID to use as the target.
   *
   * This must be specified when the target is a FIFO queue. If you specify
   * a FIFO queue as a target, the queue must have content-based deduplication enabled.
   *
   * A length of `messageGroupId` must be between 1 and 128.
   *
   * Default: - no message group ID
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html#cfn-scheduler-schedule-sqsparameters-messagegroupid)
   */
  public fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

  /**
   * A builder for [SqsSendMessageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input Input passed to the target.
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param messageGroupId The FIFO message group ID to use as the target.
     * This must be specified when the target is a FIFO queue. If you specify
     * a FIFO queue as a target, the queue must have content-based deduplication enabled.
     *
     * A length of `messageGroupId` must be between 1 and 128.
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps.Builder =
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
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
     * @param input Input passed to the target.
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param messageGroupId The FIFO message group ID to use as the target.
     * This must be specified when the target is a FIFO queue. If you specify
     * a FIFO queue as a target, the queue must have content-based deduplication enabled.
     *
     * A length of `messageGroupId` must be between 1 and 128.
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps,
  ) : CdkObject(cdkObject),
      SqsSendMessageProps {
    /**
     * The SQS queue to be used as deadLetterQueue.
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
     * Input passed to the target.
     *
     * Default: - no input.
     */
    override fun input(): ScheduleTargetInput? =
        unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The FIFO message group ID to use as the target.
     *
     * This must be specified when the target is a FIFO queue. If you specify
     * a FIFO queue as a target, the queue must have content-based deduplication enabled.
     *
     * A length of `messageGroupId` must be between 1 and 128.
     *
     * Default: - no message group ID
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sqsparameters.html#cfn-scheduler-schedule-sqsparameters-messagegroupid)
     */
    override fun messageGroupId(): String? = unwrap(this).getMessageGroupId()

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
     * other AWS services on your behalf.
     *
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     *
     * Default: - created by target
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqsSendMessageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps):
        SqsSendMessageProps = CdkObjectWrappers.wrap(cdkObject) as? SqsSendMessageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqsSendMessageProps):
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessageProps
  }
}
