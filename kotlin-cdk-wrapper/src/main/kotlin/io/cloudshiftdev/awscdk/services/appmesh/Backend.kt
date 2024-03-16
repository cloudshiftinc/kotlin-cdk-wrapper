@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains static factory methods to create backends.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * VirtualRouter router;
 * Service service;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8080)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5))
 * .path("/ping")
 * .timeout(Duration.seconds(2))
 * .unhealthyThreshold(2)
 * .build()))
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.seconds(5))
 * .build())
 * .build())))
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build();
 * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
 * .virtualServiceProvider(VirtualServiceProvider.virtualRouter(router))
 * .virtualServiceName("service1.domain.local")
 * .build();
 * node.addBackend(Backend.virtualService(virtualService));
 * ```
 */
public abstract class Backend internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.Backend,
) : CdkObject(cdkObject) {
  /**
   * Return backend config.
   *
   * @param _scope 
   */
  public open fun bind(scope: Construct): BackendConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(BackendConfig::wrap)

  public companion object {
    public fun virtualService(virtualService: IVirtualService): Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap)).let(Backend::wrap)

    public fun virtualService(virtualService: IVirtualService, props: VirtualServiceBackendOptions):
        Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap),
        props.let(VirtualServiceBackendOptions::unwrap)).let(Backend::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f9675289bd0bd999bf67bfd1bbd1b319fa2b042f6ddd5a2d2039ac9f8c433e3")
    public fun virtualService(virtualService: IVirtualService,
        props: VirtualServiceBackendOptions.Builder.() -> Unit): Backend =
        virtualService(virtualService, VirtualServiceBackendOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Backend): Backend =
        CdkObjectWrappers.wrap(cdkObject) as Backend

    internal fun unwrap(wrapped: Backend): software.amazon.awscdk.services.appmesh.Backend =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.Backend
  }
}
