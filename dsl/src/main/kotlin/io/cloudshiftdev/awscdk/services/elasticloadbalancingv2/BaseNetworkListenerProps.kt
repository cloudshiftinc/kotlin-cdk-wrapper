package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface BaseNetworkListenerProps {
  public fun alpnPolicy(): AlpnPolicy? = unwrap(this).getAlpnPolicy()?.let(AlpnPolicy::wrap)

  public fun certificates(): List<IListenerCertificate> =
      unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

  public fun defaultAction(): NetworkListenerAction? =
      unwrap(this).getDefaultAction()?.let(NetworkListenerAction::wrap)

  public fun defaultTargetGroups(): List<INetworkTargetGroup> =
      unwrap(this).getDefaultTargetGroups()?.map(INetworkTargetGroup::wrap) ?: emptyList()

  public fun port(): Number

  public fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  public interface Builder {
    public fun alpnPolicy(alpnPolicy: AlpnPolicy) {
    }

    public fun certificates(certificates: List<IListenerCertificate>) {
    }

    public fun defaultAction(defaultAction: NetworkListenerAction) {
    }

    public fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: Protocol) {
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps.builder()

    public override fun alpnPolicy(alpnPolicy: AlpnPolicy) {
      cdkBuilder.alpnPolicy(alpnPolicy.let(AlpnPolicy::unwrap))
    }

    public override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    public override fun defaultAction(defaultAction: NetworkListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(NetworkListenerAction::unwrap))
    }

    public override fun defaultTargetGroups(defaultTargetGroups: List<INetworkTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(INetworkTargetGroup::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol::unwrap))
    }

    public override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps,
  ) : BaseNetworkListenerProps {
    public override fun alpnPolicy(): AlpnPolicy? =
        unwrap(this).getAlpnPolicy()?.let(AlpnPolicy::wrap)

    public override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    public override fun defaultAction(): NetworkListenerAction? =
        unwrap(this).getDefaultAction()?.let(NetworkListenerAction::wrap)

    public override fun defaultTargetGroups(): List<INetworkTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(INetworkTargetGroup::wrap) ?: emptyList()

    public override fun port(): Number = unwrap(this).getPort()

    public override fun protocol(): Protocol? = unwrap(this).getProtocol()?.let(Protocol::wrap)

    public override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseNetworkListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps):
        BaseNetworkListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseNetworkListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps = (wrapped
        as Wrapper).cdkObject
  }
}
