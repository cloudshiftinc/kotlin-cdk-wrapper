package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IRuleTarget {
  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule The EventBridge Rule that would trigger this target. 
   * @param id The id of the target that will be attached to the rule.
   */
  public fun bind(rule: IRule): RuleTargetConfig

  /**
   * Returns the rule target specification.
   *
   * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
   *
   * @param rule The EventBridge Rule that would trigger this target. 
   * @param id The id of the target that will be attached to the rule.
   */
  public fun bind(rule: IRule, id: String): RuleTargetConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.IRuleTarget,
  ) : CdkObject(cdkObject), IRuleTarget {
    /**
     * Returns the rule target specification.
     *
     * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
     *
     * @param rule The EventBridge Rule that would trigger this target. 
     * @param id The id of the target that will be attached to the rule.
     */
    override fun bind(rule: IRule): RuleTargetConfig =
        unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

    /**
     * Returns the rule target specification.
     *
     * NOTE: Do not use the various `inputXxx` options. They can be set in a call to `addTarget`.
     *
     * @param rule The EventBridge Rule that would trigger this target. 
     * @param id The id of the target that will be attached to the rule.
     */
    override fun bind(rule: IRule, id: String): RuleTargetConfig =
        unwrap(this).bind(rule.let(IRule::unwrap), id).let(RuleTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IRuleTarget): IRuleTarget =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRuleTarget): software.amazon.awscdk.services.events.IRuleTarget =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.events.IRuleTarget
  }
}
