package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.collections.List

public interface IListenerAction {
  public fun renderActions(): List<CfnListener.ActionProperty>

  public fun renderRuleActions(): List<CfnListenerRule.ActionProperty>

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction,
  ) : IListenerAction {
    public override fun renderActions(): List<CfnListener.ActionProperty> =
        unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

    public override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
        unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction):
        IListenerAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction = (wrapped as
        Wrapper).cdkObject
  }
}
