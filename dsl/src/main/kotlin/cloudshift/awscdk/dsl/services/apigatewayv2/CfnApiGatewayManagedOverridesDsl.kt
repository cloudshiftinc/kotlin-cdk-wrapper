@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::ApiGatewayManagedOverrides` resource overrides the default properties of
 * API Gateway-managed resources that are implicitly configured for you when you use quick create.
 *
 * When you create an API by using quick create, an `AWS::ApiGatewayV2::Route` ,
 * `AWS::ApiGatewayV2::Integration` , and `AWS::ApiGatewayV2::Stage` are created for you and
 * associated with your `AWS::ApiGatewayV2::Api` . The
 * `AWS::ApiGatewayV2::ApiGatewayManagedOverrides` resource enables you to set, or override the
 * properties of these implicit resources. Supported only for HTTP APIs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * CfnApiGatewayManagedOverrides cfnApiGatewayManagedOverrides =
 * CfnApiGatewayManagedOverrides.Builder.create(this, "MyCfnApiGatewayManagedOverrides")
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
public class CfnApiGatewayManagedOverridesDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiGatewayManagedOverrides.Builder =
        CfnApiGatewayManagedOverrides.Builder.create(scope, id)

    /**
     * The ID of the API for which to override the configuration of API Gateway-managed resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-apiid)
     *
     * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
     *   resources.
     */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     *
     * @param integration Overrides the integration configuration for an API Gateway-managed
     *   integration.
     */
    public fun integration(integration: IResolvable) {
        cdkBuilder.integration(integration)
    }

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     *
     * @param integration Overrides the integration configuration for an API Gateway-managed
     *   integration.
     */
    public fun integration(
        integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
    ) {
        cdkBuilder.integration(integration)
    }

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     *
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    public fun route(route: IResolvable) {
        cdkBuilder.route(route)
    }

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     *
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
        cdkBuilder.route(route)
    }

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     *
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    public fun stage(stage: IResolvable) {
        cdkBuilder.stage(stage)
    }

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     *
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnApiGatewayManagedOverrides = cdkBuilder.build()
}
