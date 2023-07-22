@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteSpec
import software.constructs.Construct

@CdkDslMarker
public class RouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Route.Builder = Route.Builder.create(scope, id)

  /**
   * The service mesh to define the route in.
   *
   * @param mesh The service mesh to define the route in. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * The name of the route.
   *
   * Default: - An automatically generated name
   *
   * @param routeName The name of the route. 
   */
  public fun routeName(routeName: String) {
    cdkBuilder.routeName(routeName)
  }

  /**
   * Protocol specific spec.
   *
   * @param routeSpec Protocol specific spec. 
   */
  public fun routeSpec(routeSpec: RouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  /**
   * The VirtualRouter the Route belongs to.
   *
   * @param virtualRouter The VirtualRouter the Route belongs to. 
   */
  public fun virtualRouter(virtualRouter: IVirtualRouter) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  public fun build(): Route = cdkBuilder.build()
}
