@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.collections.List

/**
 * Interface for listener actions.
 */
public interface IListenerAction {
  /**
   * Render the listener default actions in this chain.
   */
  public fun renderActions(): List<CfnListener.ActionProperty>

  /**
   * Render the listener rule actions in this chain.
   */
  public fun renderRuleActions(): List<CfnListenerRule.ActionProperty>

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction):
        IListenerAction = CdkObjectWrappers.wrap(cdkObject) as IListenerAction

    internal fun unwrap(wrapped: IListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction
  }
}
