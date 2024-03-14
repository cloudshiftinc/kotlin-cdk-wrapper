package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ServiceProps : DnsServiceProps {
  /**
   * The namespace that you want to use for DNS configuration.
   */
  public fun namespace(): INamespace

  /**
   * A builder for [ServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("326bdf026963dc78ec7534f75d00e6bc13d5352216783ce66c6b946062536c06")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    /**
     * @param description A description of the service.
     */
    public fun description(description: String)

    /**
     * @param discoveryType Controls how instances within this service can be discovered.
     */
    public fun discoveryType(discoveryType: DiscoveryType)

    /**
     * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create.
     * Supported record types
     * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    /**
     * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     */
    public fun dnsTtl(dnsTtl: Duration)

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    public fun healthCheck(healthCheck: HealthCheckConfig)

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab217c14cfd483030807fb649d00cd7f073c1e9bcbabd346b400cbcf0dd9d06")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    /**
     * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered
     * to it as an AliasTargetInstance.
     * Setting this to `true` correctly configures the `routingPolicy`
     * and performs some additional validation.
     */
    public fun loadBalancer(loadBalancer: Boolean)

    /**
     * @param name A name for the Service.
     */
    public fun name(name: String)

    /**
     * @param namespace The namespace that you want to use for DNS configuration. 
     */
    public fun namespace(namespace: INamespace)

    /**
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service.
     */
    public fun routingPolicy(routingPolicy: RoutingPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.ServiceProps.Builder =
        software.amazon.awscdk.services.servicediscovery.ServiceProps.builder()

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    /**
     * @param customHealthCheck Structure containing failure threshold for a custom health checker.
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("326bdf026963dc78ec7534f75d00e6bc13d5352216783ce66c6b946062536c06")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    /**
     * @param description A description of the service.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param discoveryType Controls how instances within this service can be discovered.
     */
    override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
    }

    /**
     * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create.
     * Supported record types
     * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     */
    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    /**
     * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record.
     */
    override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration::unwrap))
    }

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig::unwrap))
    }

    /**
     * @param healthCheck Settings for an optional health check.
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dab217c14cfd483030807fb649d00cd7f073c1e9bcbabd346b400cbcf0dd9d06")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    /**
     * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered
     * to it as an AliasTargetInstance.
     * Setting this to `true` correctly configures the `routingPolicy`
     * and performs some additional validation.
     */
    override fun loadBalancer(loadBalancer: Boolean) {
      cdkBuilder.loadBalancer(loadBalancer)
    }

    /**
     * @param name A name for the Service.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param namespace The namespace that you want to use for DNS configuration. 
     */
    override fun namespace(namespace: INamespace) {
      cdkBuilder.namespace(namespace.let(INamespace::unwrap))
    }

    /**
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service.
     */
    override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.ServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceProps,
  ) : CdkObject(cdkObject), ServiceProps {
    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     */
    override fun customHealthCheck(): HealthCheckCustomConfig? =
        unwrap(this).getCustomHealthCheck()?.let(HealthCheckCustomConfig::wrap)

    /**
     * A description of the service.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Controls how instances within this service can be discovered.
     *
     * Default: DNS_AND_API
     */
    override fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    /**
     * The DNS type of the record that you want AWS Cloud Map to create.
     *
     * Supported record types
     * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     *
     * Default: A
     */
    override fun dnsRecordType(): DnsRecordType? =
        unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
     * record.
     *
     * Default: Duration.minutes(1)
     */
    override fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

    /**
     * Settings for an optional health check.
     *
     * If you specify health check settings, AWS Cloud Map associates the health
     * check with the records that you specify in DnsConfig. Only one of healthCheckConfig or
     * healthCheckCustomConfig can
     * be specified. Not valid for PrivateDnsNamespaces. If you use healthCheck, you can only
     * register IP instances to
     * this service.
     *
     * Default: none
     */
    override fun healthCheck(): HealthCheckConfig? =
        unwrap(this).getHealthCheck()?.let(HealthCheckConfig::wrap)

    /**
     * Whether or not this service will have an Elastic LoadBalancer registered to it as an
     * AliasTargetInstance.
     *
     * Setting this to `true` correctly configures the `routingPolicy`
     * and performs some additional validation.
     *
     * Default: false
     */
    override fun loadBalancer(): Boolean? = unwrap(this).getLoadBalancer()

    /**
     * A name for the Service.
     *
     * Default: CloudFormation-generated name
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The namespace that you want to use for DNS configuration.
     */
    override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    /**
     * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
     * you register an instance and specify this service.
     *
     * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
     */
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
