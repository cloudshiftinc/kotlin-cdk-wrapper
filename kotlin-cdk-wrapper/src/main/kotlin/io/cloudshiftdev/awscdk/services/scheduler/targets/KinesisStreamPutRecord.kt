@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.kinesis.IStream as CloudshiftdevAwscdkServicesKinesisIStream
import software.amazon.awscdk.services.kinesis.IStream as AmazonAwscdkServicesKinesisIStream

/**
 * Use an Amazon Kinesis Data Streams as a target for AWS EventBridge Scheduler.
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
public open class KinesisStreamPutRecord(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisStreamPutRecordProps) :
      this(software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord(stream.let(CloudshiftdevAwscdkServicesKinesisIStream.Companion::unwrap),
      props.let(KinesisStreamPutRecordProps.Companion::unwrap))
  )

  public constructor(stream: CloudshiftdevAwscdkServicesKinesisIStream,
      props: KinesisStreamPutRecordProps.Builder.() -> Unit) : this(stream,
      KinesisStreamPutRecordProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.scheduler.targets.KinesisStreamPutRecord].
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
    public fun deadLetterQueue(deadLetterQueue: IQueue)

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
     * The shard to which EventBridge Scheduler sends the event.
     *
     * The length must be between 1 and 256.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
     * @param partitionKey The shard to which EventBridge Scheduler sends the event. 
     */
    public fun partitionKey(partitionKey: String)

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
    stream: AmazonAwscdkServicesKinesisIStream,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord.Builder =
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord.Builder.create(stream)

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
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
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
     * The shard to which EventBridge Scheduler sends the event.
     *
     * The length must be between 1 and 256.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-kinesisparameters.html)
     * @param partitionKey The shard to which EventBridge Scheduler sends the event. 
     */
    override fun partitionKey(partitionKey: String) {
      cdkBuilder.partitionKey(partitionKey)
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

    public fun build(): software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(stream: CloudshiftdevAwscdkServicesKinesisIStream,
        block: Builder.() -> Unit = {}): KinesisStreamPutRecord {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesKinesisIStream.unwrap(stream))
      return KinesisStreamPutRecord(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord):
        KinesisStreamPutRecord = KinesisStreamPutRecord(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamPutRecord):
        software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord = wrapped.cdkObject
        as software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord
  }
}
