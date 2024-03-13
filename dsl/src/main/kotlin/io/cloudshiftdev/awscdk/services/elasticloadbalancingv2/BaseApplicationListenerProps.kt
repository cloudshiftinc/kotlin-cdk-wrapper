package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface BaseApplicationListenerProps {
  public fun certificates(): List<IListenerCertificate> =
      unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

  public fun defaultAction(): ListenerAction? =
      unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

  public fun defaultTargetGroups(): List<IApplicationTargetGroup> =
      unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

  public fun `open`(): Boolean? = unwrap(this).getOpen()

  public fun port(): Number? = unwrap(this).getPort()

  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  public interface Builder {
    public fun certificates(certificates: List<IListenerCertificate>) {
    }

    public fun defaultAction(defaultAction: ListenerAction) {
    }

    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
    }

    public fun `open`(`open`: Boolean) {
    }

    public fun port(port: Number) {
    }

    public fun protocol(protocol: ApplicationProtocol) {
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps.builder()

    public override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    public override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

    public override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

    public override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    public override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps,
  ) : BaseApplicationListenerProps {
    public override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    public override fun defaultAction(): ListenerAction? =
        unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

    public override fun defaultTargetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

    public override fun `open`(): Boolean? = unwrap(this).getOpen()

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    public override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BaseApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps):
        BaseApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseApplicationListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps =
        (wrapped as Wrapper).cdkObject
  }
}
