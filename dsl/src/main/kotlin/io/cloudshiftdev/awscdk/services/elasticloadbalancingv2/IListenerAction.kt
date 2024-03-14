package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.collections.List

public interface IListenerAction {
    /** Render the listener default actions in this chain. */
    public fun renderActions(): List<CfnListener.ActionProperty>

    /** Render the listener rule actions in this chain. */
    public fun renderRuleActions(): List<CfnListenerRule.ActionProperty>

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction,
    ) : IListenerAction {
        /** Render the listener default actions in this chain. */
        override fun renderActions(): List<CfnListener.ActionProperty> =
            unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

        /** Render the listener rule actions in this chain. */
        override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
            unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction
        ): IListenerAction = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IListenerAction
        ): software.amazon.awscdk.services.elasticloadbalancingv2.IListenerAction =
            (wrapped as Wrapper).cdkObject
    }
}
