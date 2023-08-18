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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SfnStateMachineProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the Step Functions State Machine target.
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
public class SfnStateMachinePropsDsl {
    private val cdkBuilder: SfnStateMachineProps.Builder = SfnStateMachineProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /** @param input The input to the state machine execution. */
    public fun input(input: RuleTargetInput) {
        cdkBuilder.input(input)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    /** @param role The IAM role to be assumed to execute the State Machine. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): SfnStateMachineProps = cdkBuilder.build()
}
