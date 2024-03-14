package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import kotlin.String

public interface ICustomEventRule {
  /**
   * Description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * event pattern when this rule should be triggered.
   */
  public fun eventPattern(): EventPattern

  /**
   * Rulename.
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * Target e.g. Lambda when event pattern is fulfilled.
   */
  public fun target(): IRuleTarget

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule,
  ) : CdkObject(cdkObject), ICustomEventRule {
    /**
     * Description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * event pattern when this rule should be triggered.
     */
    override fun eventPattern(): EventPattern =
        unwrap(this).getEventPattern().let(EventPattern::wrap)

    /**
     * Rulename.
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * Target e.g. Lambda when event pattern is fulfilled.
     */
    override fun target(): IRuleTarget = unwrap(this).getTarget().let(IRuleTarget::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule):
        ICustomEventRule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICustomEventRule):
        software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule
  }
}
