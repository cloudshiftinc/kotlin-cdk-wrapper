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

  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  public fun routeName(routeName: String) {
    cdkBuilder.routeName(routeName)
  }

  public fun routeSpec(routeSpec: RouteSpec) {
    cdkBuilder.routeSpec(routeSpec)
  }

  public fun virtualRouter(virtualRouter: IVirtualRouter) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  public fun build(): RouteProps = cdkBuilder.build()
}
