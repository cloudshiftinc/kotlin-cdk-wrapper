@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.targets.EventBusProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Configuration properties of an Event Bus event.
 *
 * Cannot extend TargetBaseProps. Retry policy is not supported for Event bus targets.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * Role role;
 * EventBusProps eventBusProps = EventBusProps.builder()
 * .deadLetterQueue(queue)
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class EventBusPropsDsl {
  private val cdkBuilder: EventBusProps.Builder = EventBusProps.builder()

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
   * @param role Role to be used to publish the event.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): EventBusProps = cdkBuilder.build()
}
