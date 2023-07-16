@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse

@CdkDslMarker
public class CfnRouteResponseParameterConstraintsPropertyDsl {
  private val cdkBuilder: CfnRouteResponse.ParameterConstraintsProperty.Builder =
      CfnRouteResponse.ParameterConstraintsProperty.builder()

  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  public fun required(required: IResolvable) {
    cdkBuilder.required(required)
  }

  public fun build(): CfnRouteResponse.ParameterConstraintsProperty = cdkBuilder.build()
}
