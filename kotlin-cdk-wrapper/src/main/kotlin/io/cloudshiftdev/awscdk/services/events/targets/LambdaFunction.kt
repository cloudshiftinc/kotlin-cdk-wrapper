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
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Use an AWS Lambda function as an event rule target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function fn = Function.Builder.create(this, "MyFunc")
 * .runtime(Runtime.NODEJS_LATEST)
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
public open class LambdaFunction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.LambdaFunction,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a RuleTarget that can be used to trigger this Lambda as a result from an EventBridge
   * event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a RuleTarget that can be used to trigger this Lambda as a result from an EventBridge
   * event.
   *
   * @param rule 
   * @param _id
   */
  public override fun bind(rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.LambdaFunction].
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl(
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.LambdaFunction.Builder =
        software.amazon.awscdk.services.events.targets.LambdaFunction.Builder.create(handler)

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

    public fun build(): software.amazon.awscdk.services.events.targets.LambdaFunction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(handler: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaFunction {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return LambdaFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LambdaFunction):
        LambdaFunction = LambdaFunction(cdkObject)

    internal fun unwrap(wrapped: LambdaFunction):
        software.amazon.awscdk.services.events.targets.LambdaFunction = wrapped.cdkObject
  }
}
