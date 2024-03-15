@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RouteProps : RouteBaseProps {
  public fun mesh(): IMesh

  public fun virtualRouter(): IVirtualRouter

  @CdkDslMarker
  public interface Builder {
    public fun mesh(mesh: IMesh)

    public fun routeName(routeName: String)

    public fun routeSpec(routeSpec: RouteSpec)

    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteProps.Builder =
        software.amazon.awscdk.services.appmesh.RouteProps.builder()

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec::unwrap))
    }

    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteProps,
  ) : CdkObject(cdkObject), RouteProps {
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun routeName(): String? = unwrap(this).getRouteName()

    override fun routeSpec(): RouteSpec = unwrap(this).getRouteSpec().let(RouteSpec::wrap)

    override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteProps): RouteProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteProps): software.amazon.awscdk.services.appmesh.RouteProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.RouteProps
  }
}
