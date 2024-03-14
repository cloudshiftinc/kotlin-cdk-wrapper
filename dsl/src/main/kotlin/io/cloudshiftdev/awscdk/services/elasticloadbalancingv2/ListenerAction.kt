package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class ListenerAction
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction,
) : IListenerAction {
    /**
     * Called when the action is being used in a listener.
     *
     * @param scope
     * @param listener
     * @param associatingConstruct
     */
    public open fun bind(scope: Construct, listener: IApplicationListener) {
        unwrap(this).bind(scope.let(Construct::unwrap), listener.let(IApplicationListener::unwrap))
    }

    /**
     * Called when the action is being used in a listener.
     *
     * @param scope
     * @param listener
     * @param associatingConstruct
     */
    public open fun bind(
        scope: Construct,
        listener: IApplicationListener,
        associatingConstruct: IConstruct,
    ) {
        unwrap(this)
            .bind(
                scope.let(Construct::unwrap),
                listener.let(IApplicationListener::unwrap),
                associatingConstruct.let(IConstruct::unwrap)
            )
    }

    /** Render the listener default actions in this chain. */
    public override fun renderActions(): List<CfnListener.ActionProperty> =
        unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

    /** Render the listener rule actions in this chain. */
    public override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
        unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)

    public companion object {
        public fun authenticateOidc(options: AuthenticateOidcOptions): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.authenticateOidc(
                    options.let(AuthenticateOidcOptions::unwrap)
                )
                .let(ListenerAction::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("02f4270c547a02b7f0b9d0550ece424b1b41de91bfc69f93696b32175affcdfd")
        public fun authenticateOidc(
            options: AuthenticateOidcOptions.Builder.() -> Unit
        ): ListenerAction = authenticateOidc(AuthenticateOidcOptions(options))

        public fun fixedResponse(statusCode: Number): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.fixedResponse(
                    statusCode
                )
                .let(ListenerAction::wrap)

        public fun fixedResponse(
            statusCode: Number,
            options: FixedResponseOptions
        ): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.fixedResponse(
                    statusCode,
                    options.let(FixedResponseOptions::unwrap)
                )
                .let(ListenerAction::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("6ca345f3d3c2683f66fa1e38f24b92a4b0f6c61f223ba47cf89c0dbdd408da8b")
        public fun fixedResponse(
            statusCode: Number,
            options: FixedResponseOptions.Builder.() -> Unit
        ): ListenerAction = fixedResponse(statusCode, FixedResponseOptions(options))

        public fun forward(targetGroups: List<IApplicationTargetGroup>): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.forward(
                    targetGroups.map(IApplicationTargetGroup::unwrap)
                )
                .let(ListenerAction::wrap)

        public fun forward(vararg targetGroups: IApplicationTargetGroup): ListenerAction =
            forward(targetGroups.toList())

        public fun forward(
            targetGroups: List<IApplicationTargetGroup>,
            options: ForwardOptions
        ): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.forward(
                    targetGroups.map(IApplicationTargetGroup::unwrap),
                    options.let(ForwardOptions::unwrap)
                )
                .let(ListenerAction::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b1977ca66cf3b21839ab7046d80272a616a15a4f9d160ae53eba23adceb6f9d1")
        public fun forward(
            targetGroups: List<IApplicationTargetGroup>,
            options: ForwardOptions.Builder.() -> Unit
        ): ListenerAction = forward(targetGroups, ForwardOptions(options))

        public fun redirect(options: RedirectOptions): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.redirect(
                    options.let(RedirectOptions::unwrap)
                )
                .let(ListenerAction::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("ff3e5156e25823d24931fc41a372d9f2a6c74f1a1eab69d9035d3936cbcb40e4")
        public fun redirect(options: RedirectOptions.Builder.() -> Unit): ListenerAction =
            redirect(RedirectOptions(options))

        public fun weightedForward(targetGroups: List<WeightedTargetGroup>): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.weightedForward(
                    targetGroups.map(WeightedTargetGroup::unwrap)
                )
                .let(ListenerAction::wrap)

        public fun weightedForward(vararg targetGroups: WeightedTargetGroup): ListenerAction =
            weightedForward(targetGroups.toList())

        public fun weightedForward(
            targetGroups: List<WeightedTargetGroup>,
            options: ForwardOptions
        ): ListenerAction =
            software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.weightedForward(
                    targetGroups.map(WeightedTargetGroup::unwrap),
                    options.let(ForwardOptions::unwrap)
                )
                .let(ListenerAction::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("f1faaf479f8b219868e510298addee08e2b43a0d635c2e647f5f5b14d4680765")
        public fun weightedForward(
            targetGroups: List<WeightedTargetGroup>,
            options: ForwardOptions.Builder.() -> Unit
        ): ListenerAction = weightedForward(targetGroups, ForwardOptions(options))

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
        ): ListenerAction = ListenerAction(cdkObject)

        internal fun unwrap(
            wrapped: ListenerAction
        ): software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction = wrapped.cdkObject
    }
}
