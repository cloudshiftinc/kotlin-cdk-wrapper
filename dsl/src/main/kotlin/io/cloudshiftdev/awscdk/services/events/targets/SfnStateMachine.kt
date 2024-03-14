package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine as CloudshiftdevAwscdkServicesStepfunctionsIStateMachine
import software.amazon.awscdk.services.stepfunctions.IStateMachine as AmazonAwscdkServicesStepfunctionsIStateMachine

public open class SfnStateMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachine,
) : CdkObject(cdkObject), IRuleTarget {
  /**
   * Returns a properties that are used in an Rule to trigger this State Machine.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sns-permissions)
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  /**
   * Returns a properties that are used in an Rule to trigger this State Machine.
   *
   * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/resource-based-policies-eventbridge.html#sns-permissions)
   * @param _rule 
   * @param _id
   */
  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  /**
   *
   */
  public open fun machine(): CloudshiftdevAwscdkServicesStepfunctionsIStateMachine =
      unwrap(this).getMachine().let(CloudshiftdevAwscdkServicesStepfunctionsIStateMachine::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.targets.SfnStateMachine].
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
     * The input to the state machine execution.
     *
     * Default: the entire EventBridge event
     *
     * @param input The input to the state machine execution. 
     */
    public fun input(input: RuleTargetInput)

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

    /**
     * The IAM role to be assumed to execute the State Machine.
     *
     * Default: - a new role will be created
     *
     * @param role The IAM role to be assumed to execute the State Machine. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    machine: AmazonAwscdkServicesStepfunctionsIStateMachine,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.SfnStateMachine.Builder =
        software.amazon.awscdk.services.events.targets.SfnStateMachine.Builder.create(machine)

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
     * The input to the state machine execution.
     *
     * Default: the entire EventBridge event
     *
     * @param input The input to the state machine execution. 
     */
    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput::unwrap))
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

    /**
     * The IAM role to be assumed to execute the State Machine.
     *
     * Default: - a new role will be created
     *
     * @param role The IAM role to be assumed to execute the State Machine. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SfnStateMachine =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(machine: CloudshiftdevAwscdkServicesStepfunctionsIStateMachine,
        block: Builder.() -> Unit = {}): SfnStateMachine {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesStepfunctionsIStateMachine.unwrap(machine))
      return SfnStateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachine):
        SfnStateMachine = SfnStateMachine(cdkObject)

    internal fun unwrap(wrapped: SfnStateMachine):
        software.amazon.awscdk.services.events.targets.SfnStateMachine = wrapped.cdkObject
  }
}
