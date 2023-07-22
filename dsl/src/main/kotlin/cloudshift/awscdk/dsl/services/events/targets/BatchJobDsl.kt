@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.BatchJob
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.IConstruct

@CdkDslMarker
public class BatchJobDsl(
  jobQueueArn: String,
  jobQueueScope: IConstruct,
  jobDefinitionArn: String,
  jobDefinitionScope: IConstruct,
) {
  private val cdkBuilder: BatchJob.Builder = BatchJob.Builder.create(jobQueueArn, jobQueueScope,
      jobDefinitionArn, jobDefinitionScope)

  /**
   * The number of times to attempt to retry, if the job fails.
   *
   * Valid values are 1–10.
   *
   * Default: no retryStrategy is set
   *
   * @param attempts The number of times to attempt to retry, if the job fails. 
   */
  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

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
   *
   * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
   * [considerations for using a dead-letter
   * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
   * 
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
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
  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  /**
   * The name of the submitted job.
   *
   * Default: - Automatically generated
   *
   * @param jobName The name of the submitted job. 
   */
  public fun jobName(jobName: String) {
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
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * 
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
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
   */
  public fun retryAttempts(retryAttempts: Number) {
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
  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): BatchJob = cdkBuilder.build()
}
