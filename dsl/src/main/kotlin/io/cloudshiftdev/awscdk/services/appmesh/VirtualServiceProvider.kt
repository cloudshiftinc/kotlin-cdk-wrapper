package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct

public abstract class VirtualServiceProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider,
) {
  public open fun bind(arg0: Construct): VirtualServiceProviderConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(VirtualServiceProviderConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider,
  ) : VirtualServiceProvider(cdkObject)

  public companion object {
    public open fun none(mesh: IMesh): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.none(mesh.let(IMesh::unwrap)).let(VirtualServiceProvider::wrap)

    public open fun virtualNode(virtualNode: IVirtualNode): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.virtualNode(virtualNode.let(IVirtualNode::unwrap)).let(VirtualServiceProvider::wrap)

    public open fun virtualRouter(virtualRouter: IVirtualRouter): VirtualServiceProvider =
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap)).let(VirtualServiceProvider::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProvider):
        VirtualServiceProvider = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProvider):
        software.amazon.awscdk.services.appmesh.VirtualServiceProvider = (wrapped as
        Wrapper).cdkObject
  }
}
