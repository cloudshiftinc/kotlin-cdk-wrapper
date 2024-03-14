package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct

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
