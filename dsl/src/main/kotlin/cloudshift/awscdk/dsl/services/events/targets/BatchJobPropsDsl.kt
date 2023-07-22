@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.BatchJobProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the Batch Job Event Target.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.batch.alpha.*;
 * import software.amazon.awscdk.services.ecs.ContainerImage;
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
@CdkDslMarker
public class BatchJobPropsDsl {
  private val cdkBuilder: BatchJobProps.Builder = BatchJobProps.builder()

  /**
   * @param attempts The number of times to attempt to retry, if the job fails.
   * Valid values are 1–10.
   */
  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  /**
   * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
   * [considerations for using a dead-letter
   * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
   * The events not successfully delivered are automatically retried for a specified period of time,
   * depending on the retry policy of the target.
   * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
   * dead letter queue.
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * @param event The event to send to the Lambda.
   * This will be the payload sent to the Lambda Function.
   */
  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  /**
   * @param jobName The name of the submitted job.
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * Minimum value of 60.
   * Maximum value of 86400.
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * @param retryAttempts The maximum number of times to retry when the function returns an error.
   * Minimum value of 0.
   * Maximum value of 185.
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  /**
   * @param size The size of the array, if this is an array batch job.
   * Valid values are integers between 2 and 10,000.
   */
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): BatchJobProps = cdkBuilder.build()
}
