@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteQueryParameterPropertyDsl {
  private val cdkBuilder: CfnRoute.QueryParameterProperty.Builder =
      CfnRoute.QueryParameterProperty.builder()

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnRoute.HttpQueryParameterMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRoute.QueryParameterProperty = cdkBuilder.build()
}
