package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.Number

public abstract class VirtualRouterListener internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener,
) {
  public open fun bind(arg0: Construct): VirtualRouterListenerConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(VirtualRouterListenerConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener,
  ) : VirtualRouterListener(cdkObject)

  public companion object {
    public open fun grpc(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.grpc().let(VirtualRouterListener::wrap)

    public open fun grpc(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.grpc(port).let(VirtualRouterListener::wrap)

    public open fun http(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http().let(VirtualRouterListener::wrap)

    public open fun http(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http(port).let(VirtualRouterListener::wrap)

    public open fun http2(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http2().let(VirtualRouterListener::wrap)

    public open fun http2(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http2(port).let(VirtualRouterListener::wrap)

    public open fun tcp(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.tcp().let(VirtualRouterListener::wrap)

    public open fun tcp(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.tcp(port).let(VirtualRouterListener::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener):
        VirtualRouterListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterListener):
        software.amazon.awscdk.services.appmesh.VirtualRouterListener = (wrapped as
        Wrapper).cdkObject
  }
}
