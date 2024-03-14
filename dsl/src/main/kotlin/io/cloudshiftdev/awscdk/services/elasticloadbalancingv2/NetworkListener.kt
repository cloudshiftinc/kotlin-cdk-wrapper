package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener,
) : BaseListener(cdkObject), INetworkListener {
  public open fun addAction(_id: String, props: AddNetworkActionProps) {
    unwrap(this).addAction(_id, props.let(AddNetworkActionProps::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("036aa6d3ab6bc8c429ccb9ac7b967253290c5479fa6b86a60dd00debbb34dec3")
  public open fun addAction(_id: String, props: AddNetworkActionProps.Builder.() -> Unit): Unit =
      addAction(_id, AddNetworkActionProps(props))

  public open fun addCertificates(id: String, certificates: List<IListenerCertificate>) {
    unwrap(this).addCertificates(id, certificates.map(IListenerCertificate::unwrap))
  }

  public open fun addTargetGroups(_id: String, targetGroups: INetworkTargetGroup) {
    unwrap(this).addTargetGroups(_id, targetGroups.let(INetworkTargetGroup::unwrap))
  }

  public open fun addTargets(id: String, props: AddNetworkTargetsProps): NetworkTargetGroup =
      unwrap(this).addTargets(id,
      props.let(AddNetworkTargetsProps::unwrap)).let(NetworkTargetGroup::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("41f0d55776f114fa246adc0a6dd8ab00cb0e063207a8f595e01583960d0dc3d3")
  public open fun addTargets(id: String, props: AddNetworkTargetsProps.Builder.() -> Unit):
      NetworkTargetGroup = addTargets(id, AddNetworkTargetsProps(props))

  public open fun loadBalancer(): INetworkLoadBalancer =
      unwrap(this).getLoadBalancer().let(INetworkLoadBalancer::wrap)

  public interface Builder {
    public fun alpnPolicy(alpnPolicy: AlpnPolicy)

    public fun certificates(certificates: List<IListenerCertificate>)

    public fun certificates(vararg certificates: IListenerCertificate)

    public fun defaultAction(defaultAction: NetworkListenerAction)

    public fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>)

    public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup)

    public fun loadBalancer(loadBalancer: INetworkLoadBalancer)

    public fun port(port: Number)

    public fun protocol(protocol: Protocol)

    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.Builder.create(scope,
        id)

    override fun alpnPolicy(alpnPolicy: AlpnPolicy) {
      cdkBuilder.alpnPolicy(alpnPolicy.let(AlpnPolicy::unwrap))
    }

    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    override fun defaultAction(defaultAction: NetworkListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(NetworkListenerAction::unwrap))
    }

    override fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(INetworkTargetGroup::unwrap))
    }

    override fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    override fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(INetworkLoadBalancer::unwrap))
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkListenerLookupOptions,
    ): INetworkListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(NetworkListenerLookupOptions::unwrap)).let(INetworkListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abba836d5b64859eb292993f79e315fb864ac07f994e22ba71ba4c2aa5303a97")
    public open fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: NetworkListenerLookupOptions.Builder.() -> Unit,
    ): INetworkListener = fromLookup(scope, id, NetworkListenerLookupOptions(options))

    public open fun fromNetworkListenerArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      networkListenerArn: String,
    ): INetworkListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener.fromNetworkListenerArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, networkListenerArn).let(INetworkListener::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkListener(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener):
        NetworkListener = NetworkListener(cdkObject)

    internal fun unwrap(wrapped: NetworkListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener = wrapped.cdkObject
  }
}
