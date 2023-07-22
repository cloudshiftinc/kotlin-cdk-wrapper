@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig

/**
 * Configuration for `QueryParameterMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * QueryParameterMatchConfig queryParameterMatchConfig = QueryParameterMatchConfig.builder()
 * .queryParameterMatch(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build())
 * .build();
 * ```
 */
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
