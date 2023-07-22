@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHttpQueryParameterMatchPropertyDsl {
  private val cdkBuilder: CfnRoute.HttpQueryParameterMatchProperty.Builder =
      CfnRoute.HttpQueryParameterMatchProperty.builder()

  /**
   * @param exact The exact query parameter to match on.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  public fun build(): CfnRoute.HttpQueryParameterMatchProperty = cdkBuilder.build()
}
