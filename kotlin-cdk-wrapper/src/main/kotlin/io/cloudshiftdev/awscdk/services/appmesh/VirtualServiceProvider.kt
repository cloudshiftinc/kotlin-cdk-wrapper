@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

/**
 * Represents the properties needed to define the provider for a VirtualService.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .build();
 * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
 * .virtualServiceProvider(VirtualServiceProvider.virtualNode(node))
 * .virtualServiceName("service1.domain.local")
 * .build();
 * node.addBackend(Backend.virtualService(virtualService));
 * ```
 */
public abstract class VirtualServiceProvider internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider,
) : CdkObject(cdkObject) {
  /**
   * Enforces mutual exclusivity for VirtualService provider types.
   *
   * @param _construct 
   */
  public open fun bind(_construct: Construct): VirtualServiceProviderConfig =
      unwrap(this).bind(_construct.let(Construct::unwrap)).let(VirtualServiceProviderConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider,
  ) : VirtualServiceProvider(cdkObject)

  public companion object {
    public fun none(mesh: IMesh): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.none(mesh.let(IMesh::unwrap)).let(VirtualServiceProvider::wrap)

    public fun virtualNode(virtualNode: IVirtualNode): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.virtualNode(virtualNode.let(IVirtualNode::unwrap)).let(VirtualServiceProvider::wrap)

    public fun virtualRouter(virtualRouter: IVirtualRouter): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap)).let(VirtualServiceProvider::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider):
        VirtualServiceProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProvider):
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceProvider
  }
}
