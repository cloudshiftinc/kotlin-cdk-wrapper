package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DnsServiceProps : BaseServiceProps {
  public fun discoveryType(): DiscoveryType? =
      unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

  public fun dnsRecordType(): DnsRecordType? =
      unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

  public fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

  public fun loadBalancer(): Boolean? = unwrap(this).getLoadBalancer()

  public fun routingPolicy(): RoutingPolicy? =
      unwrap(this).getRoutingPolicy()?.let(RoutingPolicy::wrap)

  public interface Builder {
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e99c1cede38ec10ef3ed240f04f9c88a9e8d7fd197d3317dd65eb0f8e9bc2ee8")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun discoveryType(discoveryType: DiscoveryType) {
    }

    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    }

    public fun dnsTtl(dnsTtl: Duration) {
    }

    public fun healthCheck(healthCheck: HealthCheckConfig) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6bb39373eb4116d4d40eb1dfd568fbc3c43574ddd6cb828fafc775de079d6f9")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit) {
    }

    public fun loadBalancer(loadBalancer: Boolean) {
    }

    public fun name(name: String) {
    }

    public fun routingPolicy(routingPolicy: RoutingPolicy) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.DnsServiceProps.Builder
        = software.amazon.awscdk.services.servicediscovery.DnsServiceProps.builder()

    public override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e99c1cede38ec10ef3ed240f04f9c88a9e8d7fd197d3317dd65eb0f8e9bc2ee8")
    public override
        fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit): Unit =
        customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
    }

    public override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    public override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration::unwrap))
    }

    public override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6bb39373eb4116d4d40eb1dfd568fbc3c43574ddd6cb828fafc775de079d6f9")
    public override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    public override fun loadBalancer(loadBalancer: Boolean) {
      cdkBuilder.loadBalancer(loadBalancer)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.DnsServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.DnsServiceProps,
  ) : DnsServiceProps {
    public override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    public override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    public override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    public override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    public override fun loadBalancer(): Boolean? = unwrap(this).getLoadBalancer()

    public override fun name(): String? = unwrap(this).getName()

    public override fun routingPolicy(): RoutingPolicy? =
        unwrap(this).getRoutingPolicy()?.let(RoutingPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DnsServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.DnsServiceProps):
        DnsServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DnsServiceProps):
        software.amazon.awscdk.services.servicediscovery.DnsServiceProps = (wrapped as
        Wrapper).cdkObject
  }
}
