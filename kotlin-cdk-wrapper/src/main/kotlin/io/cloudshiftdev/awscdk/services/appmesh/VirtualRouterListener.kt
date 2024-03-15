@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Number

/**
 * Represents the properties needed to define listeners for a VirtualRouter.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * VirtualRouter router = mesh.addVirtualRouter("router", VirtualRouterBaseProps.builder()
 * .listeners(List.of(VirtualRouterListener.http(8080)))
 * .build());
 * ```
 */
public abstract class VirtualRouterListener internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener,
) : CdkObject(cdkObject) {
  /**
   * Called when the VirtualRouterListener type is initialized.
   *
   * Can be used to enforce
   * mutual exclusivity
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): VirtualRouterListenerConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(VirtualRouterListenerConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener,
  ) : VirtualRouterListener(cdkObject)

  public companion object {
    public fun grpc(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.grpc().let(VirtualRouterListener::wrap)

    public fun grpc(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.grpc(port).let(VirtualRouterListener::wrap)

    public fun http(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http().let(VirtualRouterListener::wrap)

    public fun http(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http(port).let(VirtualRouterListener::wrap)

    public fun http2(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http2().let(VirtualRouterListener::wrap)

    public fun http2(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.http2(port).let(VirtualRouterListener::wrap)

    public fun tcp(): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.tcp().let(VirtualRouterListener::wrap)

    public fun tcp(port: Number): VirtualRouterListener =
        software.amazon.awscdk.services.appmesh.VirtualRouterListener.tcp(port).let(VirtualRouterListener::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListener):
        VirtualRouterListener = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterListener):
        software.amazon.awscdk.services.appmesh.VirtualRouterListener = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualRouterListener
  }
}
