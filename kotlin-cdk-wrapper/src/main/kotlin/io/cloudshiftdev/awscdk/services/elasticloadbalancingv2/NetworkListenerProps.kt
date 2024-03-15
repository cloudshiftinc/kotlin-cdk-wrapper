@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface NetworkListenerProps : BaseNetworkListenerProps {
  public fun loadBalancer(): INetworkLoadBalancer

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps.builder()

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

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps,
  ) : CdkObject(cdkObject), NetworkListenerProps {
    override fun alpnPolicy(): AlpnPolicy? = unwrap(this).getAlpnPolicy()?.let(AlpnPolicy::wrap)

    override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    override fun defaultAction(): NetworkListenerAction? =
        unwrap(this).getDefaultAction()?.let(NetworkListenerAction::wrap)

    override fun defaultTargetGroups(): List<INetworkTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(INetworkTargetGroup::wrap) ?: emptyList()

    override fun loadBalancer(): INetworkLoadBalancer =
        unwrap(this).getLoadBalancer().let(INetworkLoadBalancer::wrap)

    override fun port(): Number = unwrap(this).getPort()

    override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps):
        NetworkListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
  }
}
