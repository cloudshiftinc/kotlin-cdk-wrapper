@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides

@CdkDslMarker
public class CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl {
  private val cdkBuilder: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder =
      CfnApiGatewayManagedOverrides.RouteOverridesProperty.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  public fun authorizationType(authorizationType: String) {
    cdkBuilder.authorizationType(authorizationType)
  }

  public fun authorizerId(authorizerId: String) {
    cdkBuilder.authorizerId(authorizerId)
  }

  public fun operationName(operationName: String) {
    cdkBuilder.operationName(operationName)
  }

  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  public fun build(): CfnApiGatewayManagedOverrides.RouteOverridesProperty {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    return cdkBuilder.build()
  }
}
