@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.Unit

/**
 * Customize the Step Functions State Machine target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .build();
 * Queue dlq = new Queue(this, "DeadLetterQueue");
 * Role role = Role.Builder.create(this, "Role")
 * .assumedBy(new ServicePrincipal("events.amazonaws.com"))
 * .build();
 * StateMachine stateMachine = StateMachine.Builder.create(this, "SM")
 * .definition(Wait.Builder.create(this,
 * "Hello").time(WaitTime.duration(Duration.seconds(10))).build())
 * .build();
 * rule.addTarget(SfnStateMachine.Builder.create(stateMachine)
 * .input(RuleTargetInput.fromObject(Map.of("SomeParam", "SomeValue")))
 * .deadLetterQueue(dlq)
 * .role(role)
 * .build());
 * ```
 */
public interface SfnStateMachineProps : TargetBaseProps {
  /**
   * The input to the state machine execution.
   *
   * Default: the entire EventBridge event
   */
  public fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

  /**
   * The IAM role to be assumed to execute the State Machine.
   *
   * Default: - a new role will be created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [SfnStateMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input The input to the state machine execution.
     */
    public fun input(input: RuleTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role The IAM role to be assumed to execute the State Machine.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.SfnStateMachineProps.Builder =
        software.amazon.awscdk.services.events.targets.SfnStateMachineProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter
     * queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param input The input to the state machine execution.
     */
    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role The IAM role to be assumed to execute the State Machine.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.SfnStateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachineProps,
  ) : CdkObject(cdkObject),
      SfnStateMachineProps {
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
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The input to the state machine execution.
     *
     * Default: the entire EventBridge event
     */
    override fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * The IAM role to be assumed to execute the State Machine.
     *
     * Default: - a new role will be created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SfnStateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.SfnStateMachineProps):
        SfnStateMachineProps = CdkObjectWrappers.wrap(cdkObject) as? SfnStateMachineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SfnStateMachineProps):
        software.amazon.awscdk.services.events.targets.SfnStateMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.SfnStateMachineProps
  }
}
