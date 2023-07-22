@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.LambdaFunctionProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the Lambda Event Target.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .runtime(Runtime.NODEJS_14_X)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = handler.toString()"))
 * .build();
 * Rule rule = Rule.Builder.create(this, "rule")
 * .eventPattern(EventPattern.builder()
 * .source(List.of("aws.ec2"))
 * .build())
 * .build();
 * Queue queue = new Queue(this, "Queue");
 * rule.addTarget(LambdaFunction.Builder.create(fn)
 * .deadLetterQueue(queue) // Optional: add a dead letter queue
 * .maxEventAge(Duration.hours(2)) // Optional: set the maxEventAge retry policy
 * .retryAttempts(2)
 * .build());
 * ```
 */
@CdkDslMarker
public class LambdaFunctionPropsDsl {
  private val cdkBuilder: LambdaFunctionProps.Builder = LambdaFunctionProps.builder()

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

  public fun build(): LambdaFunctionProps = cdkBuilder.build()
}
