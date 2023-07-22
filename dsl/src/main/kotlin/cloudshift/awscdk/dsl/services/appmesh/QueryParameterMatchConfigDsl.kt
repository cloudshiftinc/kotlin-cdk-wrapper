@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig

@CdkDslMarker
public class QueryParameterMatchConfigDsl {
  private val cdkBuilder: QueryParameterMatchConfig.Builder = QueryParameterMatchConfig.builder()

  /**
   * @param queryParameterMatch Route CFN configuration for route query parameter match. 
   */
  public fun queryParameterMatch(queryParameterMatch: CfnRouteQueryParameterPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnRouteQueryParameterPropertyDsl()
    builder.apply(queryParameterMatch)
    cdkBuilder.queryParameterMatch(builder.build())
  }

  /**
   * @param queryParameterMatch Route CFN configuration for route query parameter match. 
   */
  public fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty) {
    cdkBuilder.queryParameterMatch(queryParameterMatch)
  }

  public fun build(): QueryParameterMatchConfig = cdkBuilder.build()
}
