@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IVirtualRouter
import software.amazon.awscdk.services.appmesh.RouteAttributes

@CdkDslMarker
public class RouteAttributesDsl {
  private val cdkBuilder: RouteAttributes.Builder = RouteAttributes.builder()

  /**
   * @param routeName The name of the Route. 
   */
  public fun routeName(routeName: String) {
    cdkBuilder.routeName(routeName)
  }

  /**
   * @param virtualRouter The VirtualRouter the Route belongs to. 
   */
  public fun virtualRouter(virtualRouter: IVirtualRouter) {
    cdkBuilder.virtualRouter(virtualRouter)
  }

  public fun build(): RouteAttributes = cdkBuilder.build()
}
