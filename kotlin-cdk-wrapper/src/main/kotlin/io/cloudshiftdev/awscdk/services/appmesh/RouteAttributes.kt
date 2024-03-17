@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Interface with properties ncecessary to import a reusable Route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * VirtualRouter virtualRouter;
 * RouteAttributes routeAttributes = RouteAttributes.builder()
 * .routeName("routeName")
 * .virtualRouter(virtualRouter)
 * .build();
 * ```
 */
public interface RouteAttributes {
  /**
   * The name of the Route.
   */
  public fun routeName(): String

  /**
   * The VirtualRouter the Route belongs to.
   */
  public fun virtualRouter(): IVirtualRouter

  /**
   * A builder for [RouteAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeName The name of the Route. 
     */
    public fun routeName(routeName: String)

    /**
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteAttributes.Builder =
        software.amazon.awscdk.services.appmesh.RouteAttributes.builder()

    /**
     * @param routeName The name of the Route. 
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes,
  ) : CdkObject(cdkObject), RouteAttributes {
    /**
     * The name of the Route.
     */
    override fun routeName(): String = unwrap(this).getRouteName()

    /**
     * The VirtualRouter the Route belongs to.
     */
    override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes):
        RouteAttributes = CdkObjectWrappers.wrap(cdkObject) as? RouteAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteAttributes):
        software.amazon.awscdk.services.appmesh.RouteAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.RouteAttributes
  }
}
