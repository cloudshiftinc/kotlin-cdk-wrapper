package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.services.servicediscovery.IService
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.Map

public abstract class ServiceDiscovery internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery,
) {
  public open fun bind(arg0: Construct): ServiceDiscoveryConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(ServiceDiscoveryConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery,
  ) : ServiceDiscovery(cdkObject)

  public companion object {
    public open fun cloudMap(service: IService): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap)).let(ServiceDiscovery::wrap)

    public open fun cloudMap(service: IService, instanceAttributes: Map<String, String>):
        ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap),
        instanceAttributes).let(ServiceDiscovery::wrap)

    public open fun cloudMap(
      service: IService,
      instanceAttributes: Map<String, String>,
      ipPreference: IpPreference,
    ): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap),
        instanceAttributes, ipPreference.let(IpPreference::unwrap)).let(ServiceDiscovery::wrap)

    public open fun dns(hostname: String): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname).let(ServiceDiscovery::wrap)

    public open fun dns(hostname: String, responseType: DnsResponseType): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname,
        responseType.let(DnsResponseType::unwrap)).let(ServiceDiscovery::wrap)

    public open fun dns(
      hostname: String,
      responseType: DnsResponseType,
      ipPreference: IpPreference,
    ): ServiceDiscovery = software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname,
        responseType.let(DnsResponseType::unwrap),
        ipPreference.let(IpPreference::unwrap)).let(ServiceDiscovery::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery):
        ServiceDiscovery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceDiscovery):
        software.amazon.awscdk.services.appmesh.ServiceDiscovery = (wrapped as Wrapper).cdkObject
  }
}
