@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * What to do when a client makes a request to a listener.
 *
 * Some actions can be combined with other ones (specifically,
 * you can perform authentication before serving the request).
 *
 * Multiple actions form a linked chain; the chain must always terminate in a
 * *(weighted)forward*, *fixedResponse* or *redirect* action.
 *
 * If an action supports chaining, the next action can be indicated
 * by passing it in the `next` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * NetworkTargetGroup networkTargetGroup;
 * NetworkListenerAction networkListenerAction =
 * NetworkListenerAction.forward(List.of(networkTargetGroup), NetworkForwardOptions.builder()
 * .stickinessDuration(Duration.minutes(30))
 * .build());
 * ```
 */
public open class NetworkListenerAction(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction,
) : CdkObject(cdkObject),
    IListenerAction {
  /**
   * Called when the action is being used in a listener.
   *
   * @param scope 
   * @param listener 
   */
  public open fun bind(scope: Construct, listener: INetworkListener) {
    unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        listener.let(INetworkListener.Companion::unwrap))
  }

  /**
   * Render the listener default actions in this chain.
   */
  public override fun renderActions(): List<CfnListener.ActionProperty> =
      unwrap(this).renderActions().map(CfnListener.ActionProperty::wrap)

  /**
   * Render the listener rule actions in this chain.
   */
  public override fun renderRuleActions(): List<CfnListenerRule.ActionProperty> =
      unwrap(this).renderRuleActions().map(CfnListenerRule.ActionProperty::wrap)

  public companion object {
    public fun forward(targetGroups: List<INetworkTargetGroup>): NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.forward(targetGroups.map(INetworkTargetGroup.Companion::unwrap)).let(NetworkListenerAction::wrap)

    public fun forward(vararg targetGroups: INetworkTargetGroup): NetworkListenerAction =
        forward(targetGroups.toList())

    public fun forward(targetGroups: List<INetworkTargetGroup>, options: NetworkForwardOptions):
        NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.forward(targetGroups.map(INetworkTargetGroup.Companion::unwrap),
        options.let(NetworkForwardOptions.Companion::unwrap)).let(NetworkListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8de02d392eea3480b5baa6fa25dc414abfe95b01e64827e0f129d8d217b140d")
    public fun forward(targetGroups: List<INetworkTargetGroup>,
        options: NetworkForwardOptions.Builder.() -> Unit): NetworkListenerAction =
        forward(targetGroups, NetworkForwardOptions(options))

    public fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>):
        NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.weightedForward(targetGroups.map(NetworkWeightedTargetGroup.Companion::unwrap)).let(NetworkListenerAction::wrap)

    public fun weightedForward(vararg targetGroups: NetworkWeightedTargetGroup):
        NetworkListenerAction = weightedForward(targetGroups.toList())

    public fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>,
        options: NetworkForwardOptions): NetworkListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction.weightedForward(targetGroups.map(NetworkWeightedTargetGroup.Companion::unwrap),
        options.let(NetworkForwardOptions.Companion::unwrap)).let(NetworkListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a81ee2c40d375f94fdb3a1bab176498ab7876003dd1c156f2df5db10392ac1b")
    public fun weightedForward(targetGroups: List<NetworkWeightedTargetGroup>,
        options: NetworkForwardOptions.Builder.() -> Unit): NetworkListenerAction =
        weightedForward(targetGroups, NetworkForwardOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction):
        NetworkListenerAction = NetworkListenerAction(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction
  }
}
