@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps

/**
 * Properties for defining a `CfnApiGatewayManagedOverrides`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * CfnApiGatewayManagedOverridesProps cfnApiGatewayManagedOverridesProps =
 * CfnApiGatewayManagedOverridesProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .integration(IntegrationOverridesProperty.builder()
 * .description("description")
 * .integrationMethod("integrationMethod")
 * .payloadFormatVersion("payloadFormatVersion")
 * .timeoutInMillis(123)
 * .build())
 * .route(RouteOverridesProperty.builder()
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .operationName("operationName")
 * .target("target")
 * .build())
 * .stage(StageOverridesProperty.builder()
 * .accessLogSettings(AccessLogSettingsProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .autoDeploy(false)
 * .defaultRouteSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .description("description")
 * .routeSettings(routeSettings)
 * .stageVariables(stageVariables)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html)
 */
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
