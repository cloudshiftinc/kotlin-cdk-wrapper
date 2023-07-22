@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.targets.EventBus
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Notify an existing Event Bus of an event.
 *
 * Example:
 *
 * ```
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.expression("rate(1 minute)"))
 * .build();
 * rule.addTarget(new EventBus(EventBus.fromEventBusArn(this, "External",
 * "arn:aws:events:eu-west-1:999999999999:event-bus/test-bus")));
 * ```
 */
@CdkDslMarker
public class EventBusDsl(
  eventBus: IEventBus,
) {
  private val cdkBuilder: EventBus.Builder = EventBus.Builder.create(eventBus)

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
   * Role to be used to publish the event.
   *
   * Default: a new role is created.
   *
   * @param role Role to be used to publish the event. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): EventBus = cdkBuilder.build()
}
