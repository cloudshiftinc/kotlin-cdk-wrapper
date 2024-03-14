package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface LoadBalancerListener {
  public fun allowConnectionsFrom(): List<IConnectable> =
      unwrap(this).getAllowConnectionsFrom()?.map(IConnectable::wrap) ?: emptyList()

  public fun externalPort(): Number

  public fun externalProtocol(): LoadBalancingProtocol? =
      unwrap(this).getExternalProtocol()?.let(LoadBalancingProtocol::wrap)

  public fun internalPort(): Number? = unwrap(this).getInternalPort()

  public fun internalProtocol(): LoadBalancingProtocol? =
      unwrap(this).getInternalProtocol()?.let(LoadBalancingProtocol::wrap)

  public fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

  public fun sslCertificateArn(): String? = unwrap(this).getSslCertificateArn()

  public interface Builder {
    public fun allowConnectionsFrom(allowConnectionsFrom: List<IConnectable>)

    public fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable)

    public fun externalPort(externalPort: Number)

    public fun externalProtocol(externalProtocol: LoadBalancingProtocol)

    public fun internalPort(internalPort: Number)

    public fun internalProtocol(internalProtocol: LoadBalancingProtocol)

    public fun policyNames(policyNames: List<String>)

    public fun policyNames(vararg policyNames: String)

    public fun sslCertificateArn(sslCertificateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener.builder()

    override fun allowConnectionsFrom(allowConnectionsFrom: List<IConnectable>) {
      cdkBuilder.allowConnectionsFrom(allowConnectionsFrom.map(IConnectable::unwrap))
    }

    override fun allowConnectionsFrom(vararg allowConnectionsFrom: IConnectable): Unit =
        allowConnectionsFrom(allowConnectionsFrom.toList())

    override fun externalPort(externalPort: Number) {
      cdkBuilder.externalPort(externalPort)
    }

    override fun externalProtocol(externalProtocol: LoadBalancingProtocol) {
      cdkBuilder.externalProtocol(externalProtocol.let(LoadBalancingProtocol::unwrap))
    }

    override fun internalPort(internalPort: Number) {
      cdkBuilder.internalPort(internalPort)
    }

    override fun internalProtocol(internalProtocol: LoadBalancingProtocol) {
      cdkBuilder.internalProtocol(internalProtocol.let(LoadBalancingProtocol::unwrap))
    }

    override fun policyNames(policyNames: List<String>) {
      cdkBuilder.policyNames(policyNames)
    }

    override fun policyNames(vararg policyNames: String): Unit = policyNames(policyNames.toList())

    override fun sslCertificateArn(sslCertificateArn: String) {
      cdkBuilder.sslCertificateArn(sslCertificateArn)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener,
  ) : LoadBalancerListener {
    override fun allowConnectionsFrom(): List<IConnectable> =
        unwrap(this).getAllowConnectionsFrom()?.map(IConnectable::wrap) ?: emptyList()

    override fun externalPort(): Number = unwrap(this).getExternalPort()

    override fun externalProtocol(): LoadBalancingProtocol? =
        unwrap(this).getExternalProtocol()?.let(LoadBalancingProtocol::wrap)

    override fun internalPort(): Number? = unwrap(this).getInternalPort()

    override fun internalProtocol(): LoadBalancingProtocol? =
        unwrap(this).getInternalProtocol()?.let(LoadBalancingProtocol::wrap)

    override fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

    override fun sslCertificateArn(): String? = unwrap(this).getSslCertificateArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerListener {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener):
        LoadBalancerListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerListener):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener = (wrapped as
        Wrapper).cdkObject
  }
}
