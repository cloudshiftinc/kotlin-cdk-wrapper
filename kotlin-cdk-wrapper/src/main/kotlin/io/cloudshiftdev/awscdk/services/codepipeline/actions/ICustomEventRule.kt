@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import kotlin.String

/**
 * Represents a custom event rule in AWS CodePipeline Actions.
 *
 * This interface defines the structure for specifying a custom event rule
 * in the AWS CodePipeline Actions module. The event rule is defined by an
 * event pattern and a target.
 *
 * [Documentation](https://docs.aws.amazon.com/cdk/api/v2/docs/aws-cdk-lib.aws_events_targets-readme.html)
 */
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
