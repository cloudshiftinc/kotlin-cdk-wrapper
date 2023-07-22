@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase

@CdkDslMarker
public class RouteSpecOptionsBaseDsl {
  private val cdkBuilder: RouteSpecOptionsBase.Builder = RouteSpecOptionsBase.builder()

  /**
   * @param priority The priority for the route.
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): RouteSpecOptionsBase = cdkBuilder.build()
}
