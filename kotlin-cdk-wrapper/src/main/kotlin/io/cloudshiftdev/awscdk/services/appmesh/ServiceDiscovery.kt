@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.servicediscovery.IService
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.collections.Map

/**
 * Provides the Service Discovery method a VirtualNode uses.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Vpc vpc = new Vpc(this, "vpc");
 * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "test-namespace")
 * .vpc(vpc)
 * .name("domain.local")
 * .build();
 * Service service = namespace.createService("Svc");
 * VirtualNode node = mesh.addVirtualNode("virtual-node", VirtualNodeBaseProps.builder()
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8081)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5)) // minimum
 * .path("/health-check-path")
 * .timeout(Duration.seconds(2)) // minimum
 * .unhealthyThreshold(2)
 * .build()))
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build());
 * ```
 */
public abstract class ServiceDiscovery internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery,
) : CdkObject(cdkObject) {
  /**
   * Binds the current object when adding Service Discovery to a VirtualNode.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): ServiceDiscoveryConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(ServiceDiscoveryConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery,
  ) : ServiceDiscovery(cdkObject)

  public companion object {
    public fun cloudMap(service: IService): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap)).let(ServiceDiscovery::wrap)

    public fun cloudMap(service: IService, instanceAttributes: Map<String, String>):
        ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap),
        instanceAttributes).let(ServiceDiscovery::wrap)

    public fun cloudMap(
      service: IService,
      instanceAttributes: Map<String, String>,
      ipPreference: IpPreference,
    ): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.cloudMap(service.let(IService::unwrap),
        instanceAttributes, ipPreference.let(IpPreference::unwrap)).let(ServiceDiscovery::wrap)

    public fun dns(hostname: String): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname).let(ServiceDiscovery::wrap)

    public fun dns(hostname: String, responseType: DnsResponseType): ServiceDiscovery =
        software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname,
        responseType.let(DnsResponseType::unwrap)).let(ServiceDiscovery::wrap)

    public fun dns(
      hostname: String,
      responseType: DnsResponseType,
      ipPreference: IpPreference,
    ): ServiceDiscovery = software.amazon.awscdk.services.appmesh.ServiceDiscovery.dns(hostname,
        responseType.let(DnsResponseType::unwrap),
        ipPreference.let(IpPreference::unwrap)).let(ServiceDiscovery::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.ServiceDiscovery):
        ServiceDiscovery = CdkObjectWrappers.wrap(cdkObject) as? ServiceDiscovery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceDiscovery):
        software.amazon.awscdk.services.appmesh.ServiceDiscovery = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.ServiceDiscovery
  }
}
