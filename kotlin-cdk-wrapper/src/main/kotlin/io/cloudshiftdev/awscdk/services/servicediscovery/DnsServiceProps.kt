@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Service props needed to create a service in a given namespace.
 *
 * Used by createService() for PrivateDnsNamespace and
 * PublicDnsNamespace
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.*;
 * App app = new App();
 * Stack stack = new Stack(app, "aws-servicediscovery-integ");
 * PublicDnsNamespace namespace = PublicDnsNamespace.Builder.create(stack, "Namespace")
 * .name("foobar.com")
 * .build();
 * Service service = namespace.createService("Service", DnsServiceProps.builder()
 * .name("foo")
 * .dnsRecordType(DnsRecordType.A)
 * .dnsTtl(Duration.seconds(30))
 * .healthCheck(HealthCheckConfig.builder()
 * .type(HealthCheckType.HTTPS)
 * .resourcePath("/healthcheck")
 * .failureThreshold(2)
 * .build())
 * .build());
 * service.registerIpInstance("IpInstance", IpInstanceBaseProps.builder()
 * .ipv4("54.239.25.192")
 * .port(443)
 * .build());
 * app.synth();
 * ```
 */
public interface DnsServiceProps : BaseServiceProps {
  /**
   * Controls how instances within this service can be discovered.
   *
   * Default: DNS_AND_API
   */
  public fun discoveryType(): DiscoveryType? =
      unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

  /**
   * The DNS type of the record that you want AWS Cloud Map to create.
   *
   * Supported record types
   * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
   *
   * Default: A
   */
  public fun dnsRecordType(): DnsRecordType? =
      unwrap(this).getDnsRecordType()?.let(DnsRecordType::wrap)

  /**
   * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
   * record.
   *
   * Default: Duration.minutes(1)
   */
  public fun dnsTtl(): Duration? = unwrap(this).getDnsTtl()?.let(Duration::wrap)

  /**
   * Whether or not this service will have an Elastic LoadBalancer registered to it as an
   * AliasTargetInstance.
   *
   * Setting this to `true` correctly configures the `routingPolicy`
   * and performs some additional validation.
   *
   * Default: false
   */
  public fun loadBalancer(): Boolean? = unwrap(this).getLoadBalancer()

  /**
   * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
   * you register an instance and specify this service.
   *
   * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
   */
  public fun routingPolicy(): RoutingPolicy? =
      unwrap(this).getRoutingPolicy()?.let(RoutingPolicy::wrap)

  /**
   * A builder for [DnsServiceProps]
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e99c1cede38ec10ef3ed240f04f9c88a9e8d7fd197d3317dd65eb0f8e9bc2ee8")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6bb39373eb4116d4d40eb1dfd568fbc3c43574ddd6cb828fafc775de079d6f9")
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
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service.
     */
    public fun routingPolicy(routingPolicy: RoutingPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.DnsServiceProps.Builder
        = software.amazon.awscdk.services.servicediscovery.DnsServiceProps.builder()

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e99c1cede38ec10ef3ed240f04f9c88a9e8d7fd197d3317dd65eb0f8e9bc2ee8")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6bb39373eb4116d4d40eb1dfd568fbc3c43574ddd6cb828fafc775de079d6f9")
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
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service.
     */
    override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.DnsServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.DnsServiceProps,
  ) : CdkObject(cdkObject), DnsServiceProps {
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
     * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
     * you register an instance and specify this service.
     *
     * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
     */
    override fun routingPolicy(): RoutingPolicy? =
        unwrap(this).getRoutingPolicy()?.let(RoutingPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DnsServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.DnsServiceProps):
        DnsServiceProps = CdkObjectWrappers.wrap(cdkObject) as? DnsServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DnsServiceProps):
        software.amazon.awscdk.services.servicediscovery.DnsServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.DnsServiceProps
  }
}
