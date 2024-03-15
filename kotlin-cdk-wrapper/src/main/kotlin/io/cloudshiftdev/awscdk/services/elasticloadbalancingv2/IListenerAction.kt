@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.collections.List

public interface IListenerAction {
  public fun renderActions(): List<CfnListener.ActionProperty>

  public fun renderRuleActions(): List<CfnListenerRule.ActionProperty>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction,
  ) : CdkObject(cdkObject), IListenerAction {
    override fun renderActions(): List<CfnListener.ActionProperty> =
        unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

    override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
        unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction):
        IListenerAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction
  }
}
