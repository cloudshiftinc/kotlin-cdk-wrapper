@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a CloudMap Service.
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
public open class Service(
  cdkObject: software.amazon.awscdk.services.servicediscovery.Service,
) : Resource(cdkObject),
    IService {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceProps,
  ) :
      this(software.amazon.awscdk.services.servicediscovery.Service(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServiceProps.Builder.() -> Unit,
  ) : this(scope, id, ServiceProps(props)
  )

  /**
   * The discovery type used by this service.
   */
  public override fun discoveryType(): DiscoveryType =
      unwrap(this).getDiscoveryType().let(DiscoveryType::wrap)

  /**
   * The DnsRecordType used by the service.
   */
  public override fun dnsRecordType(): DnsRecordType =
      unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

  /**
   * The namespace for the Cloudmap Service.
   */
  public override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

  /**
   * Registers a resource that is accessible using a CNAME.
   *
   * @param id 
   * @param props 
   */
  public open fun registerCnameInstance(id: String, props: CnameInstanceBaseProps): IInstance =
      unwrap(this).registerCnameInstance(id,
      props.let(CnameInstanceBaseProps.Companion::unwrap)).let(IInstance::wrap)

  /**
   * Registers a resource that is accessible using a CNAME.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fe8e72d324e6159f2a99e449f36d642701f08953723067c834d4b4879c7a153")
  public open fun registerCnameInstance(id: String,
      props: CnameInstanceBaseProps.Builder.() -> Unit): IInstance = registerCnameInstance(id,
      CnameInstanceBaseProps(props))

  /**
   * Registers a resource that is accessible using an IP address.
   *
   * @param id 
   * @param props 
   */
  public open fun registerIpInstance(id: String, props: IpInstanceBaseProps): IInstance =
      unwrap(this).registerIpInstance(id,
      props.let(IpInstanceBaseProps.Companion::unwrap)).let(IInstance::wrap)

  /**
   * Registers a resource that is accessible using an IP address.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7744e28af767b436577e95f6d01ad983ced1858ccb9f9d5da41e7d299499638")
  public open fun registerIpInstance(id: String, props: IpInstanceBaseProps.Builder.() -> Unit):
      IInstance = registerIpInstance(id, IpInstanceBaseProps(props))

  /**
   * Registers an ELB as a new instance with unique name instanceId in this service.
   *
   * @param id 
   * @param loadBalancer 
   * @param customAttributes
   */
  public open fun registerLoadBalancer(id: String, loadBalancer: ILoadBalancerV2): IInstance =
      unwrap(this).registerLoadBalancer(id,
      loadBalancer.let(ILoadBalancerV2.Companion::unwrap)).let(IInstance::wrap)

  /**
   * Registers an ELB as a new instance with unique name instanceId in this service.
   *
   * @param id 
   * @param loadBalancer 
   * @param customAttributes
   */
  public open fun registerLoadBalancer(
    id: String,
    loadBalancer: ILoadBalancerV2,
    customAttributes: Map<String, String>,
  ): IInstance = unwrap(this).registerLoadBalancer(id,
      loadBalancer.let(ILoadBalancerV2.Companion::unwrap), customAttributes).let(IInstance::wrap)

  /**
   * Registers a resource that is accessible using values other than an IP address or a domain name
   * (CNAME).
   *
   * @param id 
   * @param props 
   */
  public open fun registerNonIpInstance(id: String, props: NonIpInstanceBaseProps): IInstance =
      unwrap(this).registerNonIpInstance(id,
      props.let(NonIpInstanceBaseProps.Companion::unwrap)).let(IInstance::wrap)

  /**
   * Registers a resource that is accessible using values other than an IP address or a domain name
   * (CNAME).
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d491cb4cb9be63e7287e29a98dfa347d895818ca55f56a74d5b6c139205e21c3")
  public open fun registerNonIpInstance(id: String,
      props: NonIpInstanceBaseProps.Builder.() -> Unit): IInstance = registerNonIpInstance(id,
      NonIpInstanceBaseProps(props))

  /**
   * The Routing Policy used by the service.
   */
  public override fun routingPolicy(): RoutingPolicy =
      unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

  /**
   * The Arn of the namespace that you want to use for DNS configuration.
   */
  public override fun serviceArn(): String = unwrap(this).getServiceArn()

  /**
   * The ID of the namespace that you want to use for DNS configuration.
   */
  public override fun serviceId(): String = unwrap(this).getServiceId()

  /**
   * A name for the Cloudmap Service.
   */
  public override fun serviceName(): String = unwrap(this).getServiceName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicediscovery.Service].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     *
     * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
     */
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     *
     * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b76f09d0c23e4e70030023fec6b487cf4a163a13b98b819f88d27549997f8")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    /**
     * A description of the service.
     *
     * Default: none
     *
     * @param description A description of the service. 
     */
    public fun description(description: String)

    /**
     * Controls how instances within this service can be discovered.
     *
     * Default: DNS_AND_API
     *
     * @param discoveryType Controls how instances within this service can be discovered. 
     */
    public fun discoveryType(discoveryType: DiscoveryType)

    /**
     * The DNS type of the record that you want AWS Cloud Map to create.
     *
     * Supported record types
     * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     *
     * Default: A
     *
     * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create. 
     */
    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
     * record.
     *
     * Default: Duration.minutes(1)
     *
     * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record. 
     */
    public fun dnsTtl(dnsTtl: Duration)

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
     *
     * @param healthCheck Settings for an optional health check. 
     */
    public fun healthCheck(healthCheck: HealthCheckConfig)

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
     *
     * @param healthCheck Settings for an optional health check. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34e6d47e404c64739af1604e475e4de04d1ae729d19ff40352af79d913d29fc6")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    /**
     * Whether or not this service will have an Elastic LoadBalancer registered to it as an
     * AliasTargetInstance.
     *
     * Setting this to `true` correctly configures the `routingPolicy`
     * and performs some additional validation.
     *
     * Default: false
     *
     * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered
     * to it as an AliasTargetInstance. 
     */
    public fun loadBalancer(loadBalancer: Boolean)

    /**
     * A name for the Service.
     *
     * Default: CloudFormation-generated name
     *
     * @param name A name for the Service. 
     */
    public fun name(name: String)

    /**
     * The namespace that you want to use for DNS configuration.
     *
     * @param namespace The namespace that you want to use for DNS configuration. 
     */
    public fun namespace(namespace: INamespace)

    /**
     * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
     * you register an instance and specify this service.
     *
     * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
     *
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service. 
     */
    public fun routingPolicy(routingPolicy: RoutingPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.Service.Builder =
        software.amazon.awscdk.services.servicediscovery.Service.Builder.create(scope, id)

    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     *
     * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
     */
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig.Companion::unwrap))
    }

    /**
     * Structure containing failure threshold for a custom health checker.
     *
     * Only one of healthCheckConfig or healthCheckCustomConfig can be specified.
     * See: https://docs.aws.amazon.com/cloud-map/latest/api/API_HealthCheckCustomConfig.html
     *
     * Default: none
     *
     * @param customHealthCheck Structure containing failure threshold for a custom health checker. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b76f09d0c23e4e70030023fec6b487cf4a163a13b98b819f88d27549997f8")
    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit):
        Unit = customHealthCheck(HealthCheckCustomConfig(customHealthCheck))

    /**
     * A description of the service.
     *
     * Default: none
     *
     * @param description A description of the service. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Controls how instances within this service can be discovered.
     *
     * Default: DNS_AND_API
     *
     * @param discoveryType Controls how instances within this service can be discovered. 
     */
    override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType.Companion::unwrap))
    }

    /**
     * The DNS type of the record that you want AWS Cloud Map to create.
     *
     * Supported record types
     * include A, AAAA, A and AAAA (A_AAAA), CNAME, and SRV.
     *
     * Default: A
     *
     * @param dnsRecordType The DNS type of the record that you want AWS Cloud Map to create. 
     */
    override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType.Companion::unwrap))
    }

    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this
     * record.
     *
     * Default: Duration.minutes(1)
     *
     * @param dnsTtl The amount of time, in seconds, that you want DNS resolvers to cache the
     * settings for this record. 
     */
    override fun dnsTtl(dnsTtl: Duration) {
      cdkBuilder.dnsTtl(dnsTtl.let(Duration.Companion::unwrap))
    }

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
     *
     * @param healthCheck Settings for an optional health check. 
     */
    override fun healthCheck(healthCheck: HealthCheckConfig) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfig.Companion::unwrap))
    }

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
     *
     * @param healthCheck Settings for an optional health check. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34e6d47e404c64739af1604e475e4de04d1ae729d19ff40352af79d913d29fc6")
    override fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckConfig(healthCheck))

    /**
     * Whether or not this service will have an Elastic LoadBalancer registered to it as an
     * AliasTargetInstance.
     *
     * Setting this to `true` correctly configures the `routingPolicy`
     * and performs some additional validation.
     *
     * Default: false
     *
     * @param loadBalancer Whether or not this service will have an Elastic LoadBalancer registered
     * to it as an AliasTargetInstance. 
     */
    override fun loadBalancer(loadBalancer: Boolean) {
      cdkBuilder.loadBalancer(loadBalancer)
    }

    /**
     * A name for the Service.
     *
     * Default: CloudFormation-generated name
     *
     * @param name A name for the Service. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The namespace that you want to use for DNS configuration.
     *
     * @param namespace The namespace that you want to use for DNS configuration. 
     */
    override fun namespace(namespace: INamespace) {
      cdkBuilder.namespace(namespace.let(INamespace.Companion::unwrap))
    }

    /**
     * The routing policy that you want to apply to all DNS records that AWS Cloud Map creates when
     * you register an instance and specify this service.
     *
     * Default: WEIGHTED for CNAME records and when loadBalancer is true, MULTIVALUE otherwise
     *
     * @param routingPolicy The routing policy that you want to apply to all DNS records that AWS
     * Cloud Map creates when you register an instance and specify this service. 
     */
    override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.Service =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServiceAttributes,
    ): IService =
        software.amazon.awscdk.services.servicediscovery.Service.fromServiceAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(ServiceAttributes.Companion::unwrap)).let(IService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a843f03cb9f8cbd3c1cb9455ee3379fcaccbd31428da3ee426b5d1c759a129d0")
    public fun fromServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServiceAttributes.Builder.() -> Unit,
    ): IService = fromServiceAttributes(scope, id, ServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Service(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.Service): Service
        = Service(cdkObject)

    internal fun unwrap(wrapped: Service): software.amazon.awscdk.services.servicediscovery.Service
        = wrapped.cdkObject as software.amazon.awscdk.services.servicediscovery.Service
  }
}
