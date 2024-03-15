@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.IConstruct as CloudshiftdevConstructsIConstruct
import software.constructs.IConstruct as SoftwareConstructsIConstruct

/**
 * Use an AWS Batch Job / Queue as an event rule target.
 *
 * Most likely the code will look something like this:
 * `new BatchJob(jobQueue.jobQueueArn, jobQueue, jobDefinition.jobDefinitionArn, jobDefinition)`
 *
 * In the future this API will be improved to be fully typed
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.ecs.ContainerImage;
 * Vpc vpc;
 * FargateComputeEnvironment computeEnvironment = FargateComputeEnvironment.Builder.create(this,
 * "ComputeEnv")
 * .vpc(vpc)
 * .build();
 * JobQueue jobQueue = JobQueue.Builder.create(this, "JobQueue")
 * .priority(1)
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(computeEnvironment)
 * .order(1)
 * .build()))
 * .build();
 * EcsJobDefinition jobDefinition = EcsJobDefinition.Builder.create(this, "MyJob")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "Container")
 * .image(ContainerImage.fromRegistry("test-repo"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * Queue queue = new Queue(this, "Queue");
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(BatchJob.Builder.create(jobQueue.getJobQueueArn(), jobQueue,
 * jobDefinition.getJobDefinitionArn(), jobDefinition)
 * .deadLetterQueue(queue)
 * .event(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
 * .retryAttempts(2)
 * .maxEventAge(Duration.hours(2))
 * .build());
 * ```
 */
public open class BatchJob internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.BatchJob,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger queue this batch job as a result from an
   * EventBridge event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger queue this batch job as a result from an
   * EventBridge event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.BatchJob].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of times to attempt to retry, if the job fails.
     *
     * Valid values are 1–10.
     *
     * Default: no retryStrategy is set
     *
     * @param attempts The number of times to attempt to retry, if the job fails. 
     */
    public fun attempts(attempts: Number)

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
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * The event to send to the Lambda.
     *
     * This will be the payload sent to the Lambda Function.
     *
     * Default: the entire EventBridge event
     *
     * @param event The event to send to the Lambda. 
     */
    public fun event(event: RuleTargetInput)

    /**
     * The name of the submitted job.
     *
     * Default: - Automatically generated
     *
     * @param jobName The name of the submitted job. 
     */
    public fun jobName(jobName: String)

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

    /**
     * The size of the array, if this is an array batch job.
     *
     * Valid values are integers between 2 and 10,000.
     *
     * Default: no arrayProperties are set
     *
     * @param size The size of the array, if this is an array batch job. 
     */
    public fun size(size: Number)
  }

  private class BuilderImpl(
    jobQueueArn: String,
    jobQueueScope: SoftwareConstructsIConstruct,
    jobDefinitionArn: String,
    jobDefinitionScope: SoftwareConstructsIConstruct,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.BatchJob.Builder =
        software.amazon.awscdk.services.events.targets.BatchJob.Builder.create(jobQueueArn,
        jobQueueScope, jobDefinitionArn, jobDefinitionScope)

    /**
     * The number of times to attempt to retry, if the job fails.
     *
     * Valid values are 1–10.
     *
     * Default: no retryStrategy is set
     *
     * @param attempts The number of times to attempt to retry, if the job fails. 
     */
    override fun attempts(attempts: Number) {
      cdkBuilder.attempts(attempts)
    }

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
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    /**
     * The event to send to the Lambda.
     *
     * This will be the payload sent to the Lambda Function.
     *
     * Default: the entire EventBridge event
     *
     * @param event The event to send to the Lambda. 
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput::unwrap))
    }

    /**
     * The name of the submitted job.
     *
     * Default: - Automatically generated
     *
     * @param jobName The name of the submitted job. 
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
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

    /**
     * The size of the array, if this is an array batch job.
     *
     * Valid values are integers between 2 and 10,000.
     *
     * Default: no arrayProperties are set
     *
     * @param size The size of the array, if this is an array batch job. 
     */
    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.BatchJob = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      jobQueueArn: String,
      jobQueueScope: CloudshiftdevConstructsIConstruct,
      jobDefinitionArn: String,
      jobDefinitionScope: CloudshiftdevConstructsIConstruct,
      block: Builder.() -> Unit = {},
    ): BatchJob {
      val builderImpl = BuilderImpl(jobQueueArn,
          CloudshiftdevConstructsIConstruct.unwrap(jobQueueScope), jobDefinitionArn,
          CloudshiftdevConstructsIConstruct.unwrap(jobDefinitionScope))
      return BatchJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.BatchJob): BatchJob
        = BatchJob(cdkObject)

    internal fun unwrap(wrapped: BatchJob): software.amazon.awscdk.services.events.targets.BatchJob
        = wrapped.cdkObject
  }
}
