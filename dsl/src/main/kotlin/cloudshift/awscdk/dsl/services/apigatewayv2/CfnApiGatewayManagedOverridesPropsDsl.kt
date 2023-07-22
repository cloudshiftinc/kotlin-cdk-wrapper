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

  /**
   * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
   * resources. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param integration Overrides the integration configuration for an API Gateway-managed
   * integration.
   */
  public fun integration(integration: IResolvable) {
    cdkBuilder.integration(integration)
  }

  /**
   * @param integration Overrides the integration configuration for an API Gateway-managed
   * integration.
   */
  public fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty) {
    cdkBuilder.integration(integration)
  }

  /**
   * @param route Overrides the route configuration for an API Gateway-managed route.
   */
  public fun route(route: IResolvable) {
    cdkBuilder.route(route)
  }

  /**
   * @param route Overrides the route configuration for an API Gateway-managed route.
   */
  public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
    cdkBuilder.route(route)
  }

  /**
   * @param stage Overrides the stage configuration for an API Gateway-managed stage.
   */
  public fun stage(stage: IResolvable) {
    cdkBuilder.stage(stage)
  }

  /**
   * @param stage Overrides the stage configuration for an API Gateway-managed stage.
   */
  public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApiGatewayManagedOverridesProps = cdkBuilder.build()
}
