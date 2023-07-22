@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.HeaderMatchConfig

/**
 * Configuration for `HeaderMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HeaderMatchConfig headerMatchConfig = HeaderMatchConfig.builder()
 * .headerMatch(HttpRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HeaderMatchMethodProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(MatchRangeProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build())
 * .build();
 * ```
 */
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
