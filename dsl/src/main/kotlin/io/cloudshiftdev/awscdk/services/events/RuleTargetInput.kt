package io.cloudshiftdev.awscdk.services.events

import kotlin.Any
import kotlin.String

public abstract class RuleTargetInput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
) {
  public open fun bind(arg0: IRule): RuleTargetInputProperties =
      unwrap(this).bind(arg0.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
  ) : RuleTargetInput(cdkObject)

  public companion object {
    public open fun fromEventPath(path: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromEventPath(path).let(RuleTargetInput::wrap)

    public open fun fromMultilineText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromMultilineText(text).let(RuleTargetInput::wrap)

    public open fun fromObject(obj: Any): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromObject(obj).let(RuleTargetInput::wrap)

    public open fun fromText(text: String): RuleTargetInput =
        software.amazon.awscdk.services.events.RuleTargetInput.fromText(text).let(RuleTargetInput::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleTargetInput):
        RuleTargetInput = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleTargetInput):
        software.amazon.awscdk.services.events.RuleTargetInput = (wrapped as Wrapper).cdkObject
  }
}
