@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IRuleTarget {
  public fun bind(arg0: IRule): RuleTargetConfig

  public fun bind(arg0: IRule, arg1: String): RuleTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.IRuleTarget,
  ) : CdkObject(cdkObject), IRuleTarget {
    override fun bind(arg0: IRule): RuleTargetConfig =
        unwrap(this).bind(arg0.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

    override fun bind(arg0: IRule, arg1: String): RuleTargetConfig =
        unwrap(this).bind(arg0.let(IRule::unwrap), arg1).let(RuleTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRuleTarget): IRuleTarget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRuleTarget): software.amazon.awscdk.services.events.IRuleTarget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IRuleTarget
  }
}
