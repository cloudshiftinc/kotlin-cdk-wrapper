@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String

/**
 * The input to send to the event target.
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
public abstract class RuleTargetInput(
  cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
) : CdkObject(cdkObject) {
  /**
   * Return the input properties for this input object.
   *
   * @param rule 
   */
  public open fun bind(rule: IRule): RuleTargetInputProperties =
      unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
  ) : RuleTargetInput(cdkObject)

  public companion object {
    public fun fromEventPath(path: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromEventPath(path).let(RuleTargetInput::wrap)

    public fun fromMultilineText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromMultilineText(text).let(RuleTargetInput::wrap)

    public fun fromObject(obj: Any): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromObject(obj).let(RuleTargetInput::wrap)

    public fun fromText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromText(text).let(RuleTargetInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInput):
        RuleTargetInput = CdkObjectWrappers.wrap(cdkObject) as? RuleTargetInput ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInput):
        software.amazon.awscdk.services.events.RuleTargetInput = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.RuleTargetInput
  }
}
