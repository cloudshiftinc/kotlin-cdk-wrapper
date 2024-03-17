@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties to define new Routes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * Mesh mesh;
 * RouteSpec routeSpec;
 * VirtualRouter virtualRouter;
 * RouteProps routeProps = RouteProps.builder()
 * .mesh(mesh)
 * .routeSpec(routeSpec)
 * .virtualRouter(virtualRouter)
 * // the properties below are optional
 * .routeName("routeName")
 * .build();
 * ```
 */
public interface RouteProps : RouteBaseProps {
  /**
   * The service mesh to define the route in.
   */
  public fun mesh(): IMesh

  /**
   * The VirtualRouter the Route belongs to.
   */
  public fun virtualRouter(): IVirtualRouter

  /**
   * A builder for [RouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh The service mesh to define the route in. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param routeName The name of the route.
     */
    public fun routeName(routeName: String)

    /**
     * @param routeSpec Protocol specific spec. 
     */
    public fun routeSpec(routeSpec: RouteSpec)

    /**
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteProps.Builder =
        software.amazon.awscdk.services.appmesh.RouteProps.builder()

    /**
     * @param mesh The service mesh to define the route in. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param routeName The name of the route.
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * @param routeSpec Protocol specific spec. 
     */
    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec::unwrap))
    }

    /**
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteProps,
  ) : CdkObject(cdkObject), RouteProps {
    /**
     * The service mesh to define the route in.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the route.
     *
     * Default: - An automatically generated name
     */
    override fun routeName(): String? = unwrap(this).getRouteName()

    /**
     * Protocol specific spec.
     */
    override fun routeSpec(): RouteSpec = unwrap(this).getRouteSpec().let(RouteSpec::wrap)

    /**
     * The VirtualRouter the Route belongs to.
     */
    override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteProps): RouteProps =
        CdkObjectWrappers.wrap(cdkObject) as? RouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteProps): software.amazon.awscdk.services.appmesh.RouteProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.RouteProps
  }
}
