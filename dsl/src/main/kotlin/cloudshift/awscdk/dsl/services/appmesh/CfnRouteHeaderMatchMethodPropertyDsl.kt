@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHeaderMatchMethodPropertyDsl {
  private val cdkBuilder: CfnRoute.HeaderMatchMethodProperty.Builder =
      CfnRoute.HeaderMatchMethodProperty.builder()

  /**
   * @param exact The value sent by the client must match the specified value exactly.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  /**
   * @param prefix The value sent by the client must begin with the specified characters.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param range An object that represents the range of values to match on.
   */
  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  /**
   * @param range An object that represents the range of values to match on.
   */
  public fun range(range: CfnRoute.MatchRangeProperty) {
    cdkBuilder.range(range)
  }

  /**
   * @param regex The value sent by the client must include the specified characters.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  /**
   * @param suffix The value sent by the client must end with the specified characters.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnRoute.HeaderMatchMethodProperty = cdkBuilder.build()
}
