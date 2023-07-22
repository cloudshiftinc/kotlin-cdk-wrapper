@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.HttpRoutePathMatchConfig

/**
 * The type returned from the `bind()` method in `HttpRoutePathMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpRoutePathMatchConfig httpRoutePathMatchConfig = HttpRoutePathMatchConfig.builder()
 * .prefixPathMatch("prefixPathMatch")
 * .wholePathMatch(HttpPathMatchProperty.builder()
 * .exact("exact")
 * .regex("regex")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpRoutePathMatchConfigDsl {
  private val cdkBuilder: HttpRoutePathMatchConfig.Builder = HttpRoutePathMatchConfig.builder()

  /**
   * @param prefixPathMatch Route configuration for matching on the prefix of the URL path of the
   * request.
   */
  public fun prefixPathMatch(prefixPathMatch: String) {
    cdkBuilder.prefixPathMatch(prefixPathMatch)
  }

  /**
   * @param wholePathMatch Route configuration for matching on the complete URL path of the request.
   */
  public fun wholePathMatch(wholePathMatch: CfnRouteHttpPathMatchPropertyDsl.() -> Unit = {}) {
    val builder = CfnRouteHttpPathMatchPropertyDsl()
    builder.apply(wholePathMatch)
    cdkBuilder.wholePathMatch(builder.build())
  }

  /**
   * @param wholePathMatch Route configuration for matching on the complete URL path of the request.
   */
  public fun wholePathMatch(wholePathMatch: CfnRoute.HttpPathMatchProperty) {
    cdkBuilder.wholePathMatch(wholePathMatch)
  }

  public fun build(): HttpRoutePathMatchConfig = cdkBuilder.build()
}
