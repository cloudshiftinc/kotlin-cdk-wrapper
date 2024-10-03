@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Number
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
 * (Called `ListenerAction` instead of the more strictly correct
 * `ListenerAction` because this is the class most users interact
 * with, and we want to make it not too visually overwhelming).
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * Certificate certificate;
 * ApplicationLoadBalancer lb;
 * Bucket bucket;
 * TrustStore trustStore = TrustStore.Builder.create(this, "Store")
 * .bucket(bucket)
 * .key("rootCA_cert.pem")
 * .build();
 * lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(443)
 * .protocol(ApplicationProtocol.HTTPS)
 * .certificates(List.of(certificate))
 * // mTLS settings
 * .mutualAuthentication(MutualAuthentication.builder()
 * .ignoreClientCertificateExpiry(false)
 * .mutualAuthenticationMode(MutualAuthenticationMode.VERIFY)
 * .trustStore(trustStore)
 * .build())
 * .defaultAction(ListenerAction.fixedResponse(200,
 * FixedResponseOptions.builder().contentType("text/plain").messageBody("Success mTLS").build()))
 * .build());
 * ```
 */
public open class ListenerAction(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction,
) : CdkObject(cdkObject),
    IListenerAction {
  /**
   * Called when the action is being used in a listener.
   *
   * @param scope 
   * @param listener 
   * @param associatingConstruct
   */
  public open fun bind(scope: Construct, listener: IApplicationListener) {
    unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        listener.let(IApplicationListener.Companion::unwrap))
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
    unwrap(this).bind(scope.let(Construct.Companion::unwrap),
        listener.let(IApplicationListener.Companion::unwrap),
        associatingConstruct.let(IConstruct.Companion::unwrap))
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
    public fun authenticateOidc(options: AuthenticateOidcOptions): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.authenticateOidc(options.let(AuthenticateOidcOptions.Companion::unwrap)).let(ListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02f4270c547a02b7f0b9d0550ece424b1b41de91bfc69f93696b32175affcdfd")
    public fun authenticateOidc(options: AuthenticateOidcOptions.Builder.() -> Unit): ListenerAction
        = authenticateOidc(AuthenticateOidcOptions(options))

    public fun fixedResponse(statusCode: Number): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.fixedResponse(statusCode).let(ListenerAction::wrap)

    public fun fixedResponse(statusCode: Number, options: FixedResponseOptions): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.fixedResponse(statusCode,
        options.let(FixedResponseOptions.Companion::unwrap)).let(ListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ca345f3d3c2683f66fa1e38f24b92a4b0f6c61f223ba47cf89c0dbdd408da8b")
    public fun fixedResponse(statusCode: Number, options: FixedResponseOptions.Builder.() -> Unit):
        ListenerAction = fixedResponse(statusCode, FixedResponseOptions(options))

    public fun forward(targetGroups: List<IApplicationTargetGroup>): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.forward(targetGroups.map(IApplicationTargetGroup.Companion::unwrap)).let(ListenerAction::wrap)

    public fun forward(vararg targetGroups: IApplicationTargetGroup): ListenerAction =
        forward(targetGroups.toList())

    public fun forward(targetGroups: List<IApplicationTargetGroup>, options: ForwardOptions):
        ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.forward(targetGroups.map(IApplicationTargetGroup.Companion::unwrap),
        options.let(ForwardOptions.Companion::unwrap)).let(ListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1977ca66cf3b21839ab7046d80272a616a15a4f9d160ae53eba23adceb6f9d1")
    public fun forward(targetGroups: List<IApplicationTargetGroup>,
        options: ForwardOptions.Builder.() -> Unit): ListenerAction = forward(targetGroups,
        ForwardOptions(options))

    public fun redirect(options: RedirectOptions): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.redirect(options.let(RedirectOptions.Companion::unwrap)).let(ListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff3e5156e25823d24931fc41a372d9f2a6c74f1a1eab69d9035d3936cbcb40e4")
    public fun redirect(options: RedirectOptions.Builder.() -> Unit): ListenerAction =
        redirect(RedirectOptions(options))

    public fun weightedForward(targetGroups: List<WeightedTargetGroup>): ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.weightedForward(targetGroups.map(WeightedTargetGroup.Companion::unwrap)).let(ListenerAction::wrap)

    public fun weightedForward(vararg targetGroups: WeightedTargetGroup): ListenerAction =
        weightedForward(targetGroups.toList())

    public fun weightedForward(targetGroups: List<WeightedTargetGroup>, options: ForwardOptions):
        ListenerAction =
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction.weightedForward(targetGroups.map(WeightedTargetGroup.Companion::unwrap),
        options.let(ForwardOptions.Companion::unwrap)).let(ListenerAction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1faaf479f8b219868e510298addee08e2b43a0d635c2e647f5f5b14d4680765")
    public fun weightedForward(targetGroups: List<WeightedTargetGroup>,
        options: ForwardOptions.Builder.() -> Unit): ListenerAction = weightedForward(targetGroups,
        ForwardOptions(options))

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction):
        ListenerAction = ListenerAction(cdkObject)

    internal fun unwrap(wrapped: ListenerAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
  }
}
