@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.RouteProps
import software.amazon.awscdk.services.appmesh.RouteSpec

@CdkDslMarker
public class RoutePropsDsl {
  private val cdkBuilder: RouteProps.Builder = RouteProps.builder()

  /**
   * @param mesh The service mesh to define the route in. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param routeName The name of the route.
   */
  public fun routeName(routeName: String) {
    cdkBuilder.routeName(routeName)
  }

  /**
   * @param routeSpec Protocol specific spec. 
   */
  public fun routeSpec(routeSpec: RouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  /**
   * @param virtualRouter The VirtualRouter the Route belongs to. 
   */
  public fun virtualRouter(virtualRouter: IVirtualRouter) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  public fun build(): RouteProps = cdkBuilder.build()
}
