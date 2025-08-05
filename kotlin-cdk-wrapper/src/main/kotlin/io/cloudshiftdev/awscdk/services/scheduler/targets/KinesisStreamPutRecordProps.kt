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
 * Properties for a Kinesis Data Streams Target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * Stream stream = new Stream(this, "MyStream");
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(KinesisStreamPutRecord.Builder.create(stream)
 * .partitionKey("key")
 * .build())
 * .build();
 * ```
 */
public interface KinesisStreamPutRecordProps : ScheduleTargetBaseProps {
  /**
   * The shard to which EventBridge Scheduler sends the event.
   *
   * The length must be between 1 and 256.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
   */
  public fun partitionKey(): String

  /**
   * A builder for [KinesisStreamPutRecordProps]
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
     * @param partitionKey The shard to which EventBridge Scheduler sends the event. 
     * The length must be between 1 and 256.
     */
    public fun partitionKey(partitionKey: String)

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
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps.Builder =
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps.builder()

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
     * @param partitionKey The shard to which EventBridge Scheduler sends the event. 
     * The length must be between 1 and 256.
     */
    override fun partitionKey(partitionKey: String) {
      cdkBuilder.partitionKey(partitionKey)
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

    public fun build():
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps,
  ) : CdkObject(cdkObject),
      KinesisStreamPutRecordProps {
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
     * The shard to which EventBridge Scheduler sends the event.
     *
     * The length must be between 1 and 256.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
     */
    override fun partitionKey(): String = unwrap(this).getPartitionKey()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamPutRecordProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps):
        KinesisStreamPutRecordProps = CdkObjectWrappers.wrap(cdkObject) as?
        KinesisStreamPutRecordProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamPutRecordProps):
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecordProps
  }
}
