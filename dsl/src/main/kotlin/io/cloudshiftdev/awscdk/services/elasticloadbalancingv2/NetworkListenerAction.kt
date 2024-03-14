package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class NetworkListenerAction internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction,
) : IListenerAction {
  public open fun bind(scope: Construct, listener: INetworkListener) {
    unwrap(this).bind(scope.let(Construct::unwrap), listener.let(INetworkListener::unwrap))
  }

  public override fun renderActions(): List<CfnListener.ActionProperty> =
      unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

  public override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
      unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)

  public companion object {
    public open fun forward(targetGroups: List<INetworkTargetGroup>): NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.forward(targetGroups.map(INetworkTargetGroup::unwrap)).let(NetworkListenerAction::wrap)

    public open fun forward(vararg targetGroups: INetworkTargetGroup): NetworkListenerAction =
        forward(targetGroups.toList())

    public open fun forward(targetGroups: List<INetworkTargetGroup>,
        options: NetworkForwardOptions): NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.forward(targetGroups.map(INetworkTargetGroup::unwrap),
        options.let(NetworkForwardOptions::unwrap)).let(NetworkListenerAction::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8de02d392eea3480b5baa6fa25dc414abfe95b01e64827e0f129d8d217b140d")
    public open fun forward(targetGroups: List<INetworkTargetGroup>,
        options: NetworkForwardOptions.Builder.() -> Unit): NetworkListenerAction =
        forward(targetGroups, NetworkForwardOptions(options))

    public open fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>):
        NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.weightedForward(targetGroups.map(NetworkWeightedTargetGroup::unwrap)).let(NetworkListenerAction::wrap)

    public open fun weightedForward(vararg targetGroups: NetworkWeightedTargetGroup):
        NetworkListenerAction = weightedForward(targetGroups.toList())

    public open fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>,
        options: NetworkForwardOptions): NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.weightedForward(targetGroups.map(NetworkWeightedTargetGroup::unwrap),
        options.let(NetworkForwardOptions::unwrap)).let(NetworkListenerAction::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a81ee2c40d375f94fdb3a1bab176498ab7876003dd1c156f2df5db10392ac1b")
    public open fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>,
        options: NetworkForwardOptions.Builder.() -> Unit): NetworkListenerAction =
        weightedForward(targetGroups, NetworkForwardOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction):
        NetworkListenerAction = NetworkListenerAction(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction =
        wrapped.cdkObject
  }
}
