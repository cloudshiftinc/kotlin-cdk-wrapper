@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface ApplicationListenerProps : BaseApplicationListenerProps {
  public fun loadBalancer(): IApplicationLoadBalancer

  @CdkDslMarker
  public interface Builder {
    public fun certificates(certificates: List<IListenerCertificate>)

    public fun certificates(vararg certificates: IListenerCertificate)

    public fun defaultAction(defaultAction: ListenerAction)

    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>)

    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup)

    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

    public fun `open`(`open`: Boolean)

    public fun port(port: Number)

    public fun protocol(protocol: ApplicationProtocol)

    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps.builder()

    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

    override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

    override fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
    }

    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps,
  ) : CdkObject(cdkObject), ApplicationListenerProps {
    override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    override fun defaultAction(): ListenerAction? =
        unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

    override fun defaultTargetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

    override fun loadBalancer(): IApplicationLoadBalancer =
        unwrap(this).getLoadBalancer().let(IApplicationLoadBalancer::wrap)

    override fun `open`(): Boolean? = unwrap(this).getOpen()

    override fun port(): Number? = unwrap(this).getPort()

    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps):
        ApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
  }
}
