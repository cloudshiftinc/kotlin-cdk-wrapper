@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ServiceProps : DnsServiceProps {
  public fun namespace(): INamespace

  @CdkDslMarker
  public interface Builder {
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("326bdf026963dc78ec7534f75d00e6bc13d5352216783ce66c6b946062536c06")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun discoveryType(discoveryType: DiscoveryType)

    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    public fun dnsTtl(dnsTtl: Duration)

    public fun healthCheck(healthCheck: HealthCheckConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab217c14cfd483030807fb649d00cd7f073c1e9bcbabd346b400cbcf0dd9d06")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    public fun loadBalancer(loadBalancer: Boolean)

    public fun name(name: String)

    public fun namespace(namespace: INamespace)

    public fun routingPolicy(routingPolicy: RoutingPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.ServiceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.ServiceProps.builder()

    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("326bdf026963dc78ec7534f75d00e6bc13d5352216783ce66c6b946062536c06")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
    }

    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration::unwrap))
    }

    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab217c14cfd483030807fb649d00cd7f073c1e9bcbabd346b400cbcf0dd9d06")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    override fun loadBalancer(loadBalancer: Boolean) {
      cdkBuilder.loadBalancer(loadBalancer)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun namespace(namespace: INamespace) {
      cdkBuilder.namespace(namespace.let(INamespace::unwrap))
    }

    override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.ServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceProps,
  ) : CdkObject(cdkObject), ServiceProps {
    override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    override fun loadBalancer(): Boolean? = unwrap(this).getLoadBalancer()

    override fun name(): String? = unwrap(this).getName()

    override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    override fun routingPolicy(): RoutingPolicy? =
        unwrap(this).getRoutingPolicy()?.let(RoutingPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceProps):
        ServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceProps):
        software.amazon.awscdk.services.servicediscovery.ServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.ServiceProps
  }
}
