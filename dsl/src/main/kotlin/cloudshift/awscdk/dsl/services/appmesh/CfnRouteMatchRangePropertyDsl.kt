@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteMatchRangePropertyDsl {
  private val cdkBuilder: CfnRoute.MatchRangeProperty.Builder =
      CfnRoute.MatchRangeProperty.builder()

  /**
   * @param end The end of the range. 
   */
  public fun end(end: Number) {
    cdkBuilder.end(end)
  }

  /**
   * @param start The start of the range. 
   */
  public fun start(start: Number) {
    cdkBuilder.start(start)
  }

  public fun build(): CfnRoute.MatchRangeProperty = cdkBuilder.build()
}
