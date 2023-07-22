@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.HeaderMatchConfig

@CdkDslMarker
public class HeaderMatchConfigDsl {
  private val cdkBuilder: HeaderMatchConfig.Builder = HeaderMatchConfig.builder()

  /**
   * @param headerMatch Route CFN configuration for the route header match. 
   */
  public fun headerMatch(headerMatch: CfnRouteHttpRouteHeaderPropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpRouteHeaderPropertyDsl()
    builder.apply(headerMatch)
    cdkBuilder.headerMatch(builder.build())
  }

  /**
   * @param headerMatch Route CFN configuration for the route header match. 
   */
  public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty) {
    cdkBuilder.headerMatch(headerMatch)
  }

  public fun build(): HeaderMatchConfig = cdkBuilder.build()
}
