@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.CloudWatchLogGroup
import software.amazon.awscdk.services.events.targets.LogGroupTargetInput
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class CloudWatchLogGroupDsl(
  logGroup: ILogGroup,
) {
  private val cdkBuilder: CloudWatchLogGroup.Builder = CloudWatchLogGroup.Builder.create(logGroup)

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
   * (deprecated) The event to send to the CloudWatch LogGroup.
   *
   * This will be the event logged into the CloudWatch LogGroup
   *
   * Default: - the entire EventBridge event
   *
   * @deprecated use logEvent instead
   * @param event The event to send to the CloudWatch LogGroup. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  /**
   * The event to send to the CloudWatch LogGroup.
   *
   * This will be the event logged into the CloudWatch LogGroup
   *
   * Default: - the entire EventBridge event
   *
   * @param logEvent The event to send to the CloudWatch LogGroup. 
   */
  public fun logEvent(logEvent: LogGroupTargetInput) {
    cdkBuilder.logEvent(logEvent)
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

  public fun build(): CloudWatchLogGroup = cdkBuilder.build()
}
