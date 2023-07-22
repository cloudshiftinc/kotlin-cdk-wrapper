@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SqsQueueProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the SQS Queue Event Target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * RuleTargetInput ruleTargetInput;
 * SqsQueueProps sqsQueueProps = SqsQueueProps.builder()
 * .deadLetterQueue(queue)
 * .maxEventAge(Duration.minutes(30))
 * .message(ruleTargetInput)
 * .messageGroupId("messageGroupId")
 * .retryAttempts(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class SqsQueuePropsDsl {
  private val cdkBuilder: SqsQueueProps.Builder = SqsQueueProps.builder()

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
   * @param maxEventAge The maximum age of a request that Lambda sends to a function for processing.
   * Minimum value of 60.
   * Maximum value of 86400.
   */
  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  /**
   * @param message The message to send to the queue.
   * Must be a valid JSON text passed to the target queue.
   */
  public fun message(message: RuleTargetInput) {
    cdkBuilder.message(message)
  }

  /**
   * @param messageGroupId Message Group ID for messages sent to this queue.
   * Required for FIFO queues, leave empty for regular queues.
   */
  public fun messageGroupId(messageGroupId: String) {
    cdkBuilder.messageGroupId(messageGroupId)
  }

  /**
   * @param retryAttempts The maximum number of times to retry when the function returns an error.
   * Minimum value of 0.
   * Maximum value of 185.
   */
  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): SqsQueueProps = cdkBuilder.build()
}
