@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.LogGroupProps
import software.amazon.awscdk.services.events.targets.LogGroupTargetInput
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the CloudWatch LogGroup Event Target.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.logs.*;
 * LogGroup logGroup;
 * Rule rule;
 * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
 * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
 * .timestamp(EventField.fromPath("$.time"))
 * .message(EventField.fromPath("$.detail-type"))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class LogGroupPropsDsl {
  private val cdkBuilder: LogGroupProps.Builder = LogGroupProps.builder()

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
   * @param event The event to send to the CloudWatch LogGroup.
   * This will be the event logged into the CloudWatch LogGroup
   * @deprecated use logEvent instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  /**
   * @param logEvent The event to send to the CloudWatch LogGroup.
   * This will be the event logged into the CloudWatch LogGroup
   */
  public fun logEvent(logEvent: LogGroupTargetInput) {
    cdkBuilder.logEvent(logEvent)
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

  public fun build(): LogGroupProps = cdkBuilder.build()
}
