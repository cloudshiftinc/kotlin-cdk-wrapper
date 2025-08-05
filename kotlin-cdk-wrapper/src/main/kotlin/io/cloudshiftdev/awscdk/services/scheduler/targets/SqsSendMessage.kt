@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.sqs.IQueue as CloudshiftdevAwscdkServicesSqsIQueue
import software.amazon.awscdk.services.sqs.IQueue as AmazonAwscdkServicesSqsIQueue

/**
 * Use an Amazon SQS Queue as a target for AWS EventBridge Scheduler.
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
public open class SqsSendMessage(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.SqsSendMessage,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue) :
      this(software.amazon.awscdk.services.scheduler.targets.SqsSendMessage(queue.let(CloudshiftdevAwscdkServicesSqsIQueue.Companion::unwrap))
  )

  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue, props: SqsSendMessageProps) :
      this(software.amazon.awscdk.services.scheduler.targets.SqsSendMessage(queue.let(CloudshiftdevAwscdkServicesSqsIQueue.Companion::unwrap),
      props.let(SqsSendMessageProps.Companion::unwrap))
  )

  public constructor(queue: CloudshiftdevAwscdkServicesSqsIQueue,
      props: SqsSendMessageProps.Builder.() -> Unit) : this(queue, SqsSendMessageProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.scheduler.targets.SqsSendMessage].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    public fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue)

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

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
     * @param messageGroupId The FIFO message group ID to use as the target. 
     */
    public fun messageGroupId(messageGroupId: String)

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    public fun retryAttempts(retryAttempts: Number)

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    queue: AmazonAwscdkServicesSqsIQueue,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.targets.SqsSendMessage.Builder
        = software.amazon.awscdk.services.scheduler.targets.SqsSendMessage.Builder.create(queue)

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    override fun deadLetterQueue(deadLetterQueue: CloudshiftdevAwscdkServicesSqsIQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CloudshiftdevAwscdkServicesSqsIQueue.Companion::unwrap))
    }

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

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
     * @param messageGroupId The FIFO message group ID to use as the target. 
     */
    override fun messageGroupId(messageGroupId: String) {
      cdkBuilder.messageGroupId(messageGroupId)
    }

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.SqsSendMessage =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(queue: CloudshiftdevAwscdkServicesSqsIQueue,
        block: Builder.() -> Unit = {}): SqsSendMessage {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSqsIQueue.unwrap(queue))
      return SqsSendMessage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.SqsSendMessage):
        SqsSendMessage = SqsSendMessage(cdkObject)

    internal fun unwrap(wrapped: SqsSendMessage):
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessage = wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.targets.SqsSendMessage
  }
}
