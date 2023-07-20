@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps

@CdkDslMarker
public class CfnApiGatewayManagedOverridesPropsDsl {
  private val cdkBuilder: CfnApiGatewayManagedOverridesProps.Builder =
      CfnApiGatewayManagedOverridesProps.builder()

  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  public fun integration(integration: IResolvable) {
    cdkBuilder.integration(integration)
  }

  public fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty) {
    cdkBuilder.integration(integration)
  }

  public fun route(route: IResolvable) {
    cdkBuilder.route(route)
  }

  public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
    cdkBuilder.route(route)
  }

  public fun stage(stage: IResolvable) {
    cdkBuilder.stage(stage)
  }

  public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApiGatewayManagedOverridesProps = cdkBuilder.build()
}
