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
 * Customize the Batch Job Event Target.
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
public interface BatchJobProps : TargetBaseProps {
  /**
   * The number of times to attempt to retry, if the job fails.
   *
   * Valid values are 1–10.
   *
   * Default: no retryStrategy is set
   */
  public fun attempts(): Number? = unwrap(this).getAttempts()

  /**
   * The event to send to the Lambda.
   *
   * This will be the payload sent to the Lambda Function.
   *
   * Default: the entire EventBridge event
   */
  public fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

  /**
   * The name of the submitted job.
   *
   * Default: - Automatically generated
   */
  public fun jobName(): String? = unwrap(this).getJobName()

  /**
   * The size of the array, if this is an array batch job.
   *
   * Valid values are integers between 2 and 10,000.
   *
   * Default: no arrayProperties are set
   */
  public fun size(): Number? = unwrap(this).getSize()

  /**
   * A builder for [BatchJobProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attempts The number of times to attempt to retry, if the job fails.
     * Valid values are 1–10.
     */
    public fun attempts(attempts: Number)

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
     * @param event The event to send to the Lambda.
     * This will be the payload sent to the Lambda Function.
     */
    public fun event(event: RuleTargetInput)

    /**
     * @param jobName The name of the submitted job.
     */
    public fun jobName(jobName: String)

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

    /**
     * @param size The size of the array, if this is an array batch job.
     * Valid values are integers between 2 and 10,000.
     */
    public fun size(size: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.BatchJobProps.Builder =
        software.amazon.awscdk.services.events.targets.BatchJobProps.builder()

    /**
     * @param attempts The number of times to attempt to retry, if the job fails.
     * Valid values are 1–10.
     */
    override fun attempts(attempts: Number) {
      cdkBuilder.attempts(attempts)
    }

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
     * @param event The event to send to the Lambda.
     * This will be the payload sent to the Lambda Function.
     */
    override fun event(event: RuleTargetInput) {
      cdkBuilder.event(event.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param jobName The name of the submitted job.
     */
    override fun jobName(jobName: String) {
      cdkBuilder.jobName(jobName)
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

    /**
     * @param size The size of the array, if this is an array batch job.
     * Valid values are integers between 2 and 10,000.
     */
    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.BatchJobProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.BatchJobProps,
  ) : CdkObject(cdkObject), BatchJobProps {
    /**
     * The number of times to attempt to retry, if the job fails.
     *
     * Valid values are 1–10.
     *
     * Default: no retryStrategy is set
     */
    override fun attempts(): Number? = unwrap(this).getAttempts()

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
     * The event to send to the Lambda.
     *
     * This will be the payload sent to the Lambda Function.
     *
     * Default: the entire EventBridge event
     */
    override fun event(): RuleTargetInput? = unwrap(this).getEvent()?.let(RuleTargetInput::wrap)

    /**
     * The name of the submitted job.
     *
     * Default: - Automatically generated
     */
    override fun jobName(): String? = unwrap(this).getJobName()

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

    /**
     * The size of the array, if this is an array batch job.
     *
     * Valid values are integers between 2 and 10,000.
     *
     * Default: no arrayProperties are set
     */
    override fun size(): Number? = unwrap(this).getSize()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BatchJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.BatchJobProps):
        BatchJobProps = CdkObjectWrappers.wrap(cdkObject) as? BatchJobProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BatchJobProps):
        software.amazon.awscdk.services.events.targets.BatchJobProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.BatchJobProps
  }
}
