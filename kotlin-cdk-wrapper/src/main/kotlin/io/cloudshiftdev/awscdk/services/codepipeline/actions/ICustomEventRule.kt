@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import kotlin.String

public interface ICustomEventRule {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventPattern(): EventPattern

  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun target(): IRuleTarget

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.actions.ICustomEventRule,
  ) : CdkObject(cdkObject), ICustomEventRule {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventPattern(): EventPattern =
        unwrap(this).getEventPattern().let(EventPattern::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

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
