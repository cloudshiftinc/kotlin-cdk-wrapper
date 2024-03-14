package io.cloudshiftdev.awscdk.services.servicediscovery

import kotlin.String
import kotlin.Unit

public interface ServiceAttributes {
  public fun discoveryType(): DiscoveryType? =
      unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

  public fun dnsRecordType(): DnsRecordType

  public fun namespace(): INamespace

  public fun routingPolicy(): RoutingPolicy

  public fun serviceArn(): String

  public fun serviceId(): String

  public fun serviceName(): String

  public interface Builder {
    public fun discoveryType(discoveryType: DiscoveryType) {
    }

    public fun dnsRecordType(dnsRecordType: DnsRecordType) {
    }

    public fun namespace(namespace: INamespace) {
    }

    public fun routingPolicy(routingPolicy: RoutingPolicy) {
    }

    public fun serviceArn(serviceArn: String) {
    }

    public fun serviceId(serviceId: String) {
    }

    public fun serviceName(serviceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes.Builder =
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes.builder()

    public override fun discoveryType(discoveryType: DiscoveryType) {
      cdkBuilder.discoveryType(discoveryType.let(DiscoveryType::unwrap))
    }

    public override fun dnsRecordType(dnsRecordType: DnsRecordType) {
      cdkBuilder.dnsRecordType(dnsRecordType.let(DnsRecordType::unwrap))
    }

    public override fun namespace(namespace: INamespace) {
      cdkBuilder.namespace(namespace.let(INamespace::unwrap))
    }

    public override fun routingPolicy(routingPolicy: RoutingPolicy) {
      cdkBuilder.routingPolicy(routingPolicy.let(RoutingPolicy::unwrap))
    }

    public override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    public override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.ServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes,
  ) : ServiceAttributes {
    public override fun discoveryType(): DiscoveryType? =
        unwrap(this).getDiscoveryType()?.let(DiscoveryType::wrap)

    public override fun dnsRecordType(): DnsRecordType =
        unwrap(this).getDnsRecordType().let(DnsRecordType::wrap)

    public override fun namespace(): INamespace = unwrap(this).getNamespace().let(INamespace::wrap)

    public override fun routingPolicy(): RoutingPolicy =
        unwrap(this).getRoutingPolicy().let(RoutingPolicy::wrap)

    public override fun serviceArn(): String = unwrap(this).getServiceArn()

    public override fun serviceId(): String = unwrap(this).getServiceId()

    public override fun serviceName(): String = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.ServiceAttributes):
        ServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceAttributes):
        software.amazon.awscdk.services.servicediscovery.ServiceAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
