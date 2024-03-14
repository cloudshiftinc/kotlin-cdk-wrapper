package io.cloudshiftdev.awscdk.services.events

import kotlin.String

public interface IRuleTarget {
  public fun bind(arg0: IRule): RuleTargetConfig

  public fun bind(arg0: IRule, arg1: String): RuleTargetConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IRuleTarget,
  ) : IRuleTarget {
    override fun bind(arg0: IRule): RuleTargetConfig =
        unwrap(this).bind(arg0.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

    override fun bind(arg0: IRule, arg1: String): RuleTargetConfig =
        unwrap(this).bind(arg0.let(IRule::unwrap), arg1).let(RuleTargetConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRuleTarget): IRuleTarget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRuleTarget): software.amazon.awscdk.services.events.IRuleTarget =
        (wrapped as Wrapper).cdkObject
  }
}
