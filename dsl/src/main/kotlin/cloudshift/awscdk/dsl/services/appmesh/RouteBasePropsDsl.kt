@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.RouteBaseProps
import software.amazon.awscdk.services.appmesh.RouteSpec

@CdkDslMarker
public class RouteBasePropsDsl {
  private val cdkBuilder: RouteBaseProps.Builder = RouteBaseProps.builder()

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

  public fun build(): RouteBaseProps = cdkBuilder.build()
}
