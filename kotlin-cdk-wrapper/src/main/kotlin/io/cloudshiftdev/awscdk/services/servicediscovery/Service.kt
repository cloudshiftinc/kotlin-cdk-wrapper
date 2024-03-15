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

public open class Service internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicediscovery.Service,
) : Resource(cdkObject), IService {
  public override fun discoveryType(): DiscoveryType =
      unwrap(this).getDiscoveryType().let(DiscoveryType::wrap)

  public override fun dnsRecordType(): DnsRecordType =
      unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

  public override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

  public open fun registerCnameInstance(id: String, props: CnameInstanceBaseProps): IInstance =
      unwrap(this).registerCnameInstance(id,
      props.let(CnameInstanceBaseProps::unwrap)).let(IInstance::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3fe8e72d324e6159f2a99e449f36d642701f08953723067c834d4b4879c7a153")
  public open fun registerCnameInstance(id: String,
      props: CnameInstanceBaseProps.Builder.() -> Unit): IInstance = registerCnameInstance(id,
      CnameInstanceBaseProps(props))

  public open fun registerIpInstance(id: String, props: IpInstanceBaseProps): IInstance =
      unwrap(this).registerIpInstance(id,
      props.let(IpInstanceBaseProps::unwrap)).let(IInstance::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7744e28af767b436577e95f6d01ad983ced1858ccb9f9d5da41e7d299499638")
  public open fun registerIpInstance(id: String, props: IpInstanceBaseProps.Builder.() -> Unit):
      IInstance = registerIpInstance(id, IpInstanceBaseProps(props))

  public open fun registerLoadBalancer(id: String, loadBalancer: ILoadBalancerV2): IInstance =
      unwrap(this).registerLoadBalancer(id,
      loadBalancer.let(ILoadBalancerV2::unwrap)).let(IInstance::wrap)

  public open fun registerLoadBalancer(
    id: String,
    loadBalancer: ILoadBalancerV2,
    customAttributes: Map<String, String>,
  ): IInstance = unwrap(this).registerLoadBalancer(id, loadBalancer.let(ILoadBalancerV2::unwrap),
      customAttributes).let(IInstance::wrap)

  public open fun registerNonIpInstance(id: String, props: NonIpInstanceBaseProps): IInstance =
      unwrap(this).registerNonIpInstance(id,
      props.let(NonIpInstanceBaseProps::unwrap)).let(IInstance::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d491cb4cb9be63e7287e29a98dfa347d895818ca55f56a74d5b6c139205e21c3")
  public open fun registerNonIpInstance(id: String,
      props: NonIpInstanceBaseProps.Builder.() -> Unit): IInstance = registerNonIpInstance(id,
      NonIpInstanceBaseProps(props))

  public override fun routingPolicy(): RoutingPolicy =
      unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

  public override fun serviceArn(): String = unwrap(this).getServiceArn()

  public override fun serviceId(): String = unwrap(this).getServiceId()

  public override fun serviceName(): String = unwrap(this).getServiceName()

  @CdkDslMarker
  public interface Builder {
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b76f09d0c23e4e70030023fec6b487cf4a163a13b98b819f88d27549997f8")
    public fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig.Builder.() -> Unit)

    public fun description(description: String)

    public fun discoveryType(discoveryType: DiscoveryType)

    public fun dnsRecordType(dnsRecordType: DnsRecordType)

    public fun dnsTtl(dnsTtl: Duration)

    public fun healthCheck(healthCheck: HealthCheckConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34e6d47e404c64739af1604e475e4de04d1ae729d19ff40352af79d913d29fc6")
    public fun healthCheck(healthCheck: HealthCheckConfig.Builder.() -> Unit)

    public fun loadBalancer(loadBalancer: Boolean)

    public fun name(name: String)

    public fun namespace(namespace: INamespace)

    public fun routingPolicy(routingPolicy: RoutingPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.Service.Builder =
        software.amazon.awscdk.services.servicediscovery.Service.Builder.create(scope, id)

    override fun customHealthCheck(customHealthCheck: HealthCheckCustomConfig) {
      cdkBuilder.customHealthCheck(customHealthCheck.let(HealthCheckCustomConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d1b76f09d0c23e4e70030023fec6b487cf4a163a13b98b819f88d27549997f8")
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
    @JvmName("34e6d47e404c64739af1604e475e4de04d1ae729d19ff40352af79d913d29fc6")
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

    public fun build(): software.amazon.awscdk.services.servicediscovery.Service =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServiceAttributes,
    ): IService =
        software.amazon.awscdk.services.servicediscovery.Service.fromServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ServiceAttributes::unwrap)).let(IService::wrap)

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
        = wrapped.cdkObject
  }
}
