@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SfnStateMachine
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.stepfunctions.IStateMachine

/**
 * Use a StepFunctions state machine as a target for Amazon EventBridge rules.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.stepfunctions.*;
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
@CdkDslMarker
public class SfnStateMachineDsl(
    machine: IStateMachine,
) {
    private val cdkBuilder: SfnStateMachine.Builder = SfnStateMachine.Builder.create(machine)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time, depending on the retry policy of the target. If an event is not delivered before all
     * retry attempts are exhausted, it will be sent to the dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * The input to the state machine execution.
     *
     * Default: the entire EventBridge event
     *
     * @param input The input to the state machine execution.
     */
    public fun input(input: RuleTargetInput) {
        cdkBuilder.input(input)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60. Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0. Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * The IAM role to be assumed to execute the State Machine.
     *
     * Default: - a new role will be created
     *
     * @param role The IAM role to be assumed to execute the State Machine.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): SfnStateMachine = cdkBuilder.build()
}
