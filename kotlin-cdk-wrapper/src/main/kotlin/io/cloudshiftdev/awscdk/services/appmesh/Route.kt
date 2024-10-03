@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Route represents a new or existing route attached to a VirtualRouter and Mesh.
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
 * Route route = Route.Builder.create(this, "MyRoute")
 * .mesh(mesh)
 * .routeSpec(routeSpec)
 * .virtualRouter(virtualRouter)
 * // the properties below are optional
 * .routeName("routeName")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html)
 */
public open class Route(
  cdkObject: software.amazon.awscdk.services.appmesh.Route,
) : Resource(cdkObject),
    IRoute {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RouteProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.Route(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(RouteProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: RouteProps.Builder.() -> Unit,
  ) : this(scope, id, RouteProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for the route.
   */
  public override fun routeArn(): String = unwrap(this).getRouteArn()

  /**
   * The name of the Route.
   */
  public override fun routeName(): String = unwrap(this).getRouteName()

  /**
   * The VirtualRouter the Route belongs to.
   */
  public override fun virtualRouter(): IVirtualRouter =
      unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.Route].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The service mesh to define the route in.
     *
     * @param mesh The service mesh to define the route in. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * The name of the route.
     *
     * Default: - An automatically generated name
     *
     * @param routeName The name of the route. 
     */
    public fun routeName(routeName: String)

    /**
     * Protocol specific spec.
     *
     * @param routeSpec Protocol specific spec. 
     */
    public fun routeSpec(routeSpec: RouteSpec)

    /**
     * The VirtualRouter the Route belongs to.
     *
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Route.Builder =
        software.amazon.awscdk.services.appmesh.Route.Builder.create(scope, id)

    /**
     * The service mesh to define the route in.
     *
     * @param mesh The service mesh to define the route in. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh.Companion::unwrap))
    }

    /**
     * The name of the route.
     *
     * Default: - An automatically generated name
     *
     * @param routeName The name of the route. 
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * Protocol specific spec.
     *
     * @param routeSpec Protocol specific spec. 
     */
    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec.Companion::unwrap))
    }

    /**
     * The VirtualRouter the Route belongs to.
     *
     * @param virtualRouter The VirtualRouter the Route belongs to. 
     */
    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.Route = cdkBuilder.build()
  }

  public companion object {
    public fun fromRouteArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      routeArn: String,
    ): IRoute =
        software.amazon.awscdk.services.appmesh.Route.fromRouteArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, routeArn).let(IRoute::wrap)

    public fun fromRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RouteAttributes,
    ): IRoute =
        software.amazon.awscdk.services.appmesh.Route.fromRouteAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(RouteAttributes.Companion::unwrap)).let(IRoute::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2190a84fefcc7733f8e8d4df66b3b93fcad4f580dbc174940b6d79b14de1022")
    public fun fromRouteAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: RouteAttributes.Builder.() -> Unit,
    ): IRoute = fromRouteAttributes(scope, id, RouteAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Route {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Route(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Route): Route =
        Route(cdkObject)

    internal fun unwrap(wrapped: Route): software.amazon.awscdk.services.appmesh.Route =
        wrapped.cdkObject as software.amazon.awscdk.services.appmesh.Route
  }
}
