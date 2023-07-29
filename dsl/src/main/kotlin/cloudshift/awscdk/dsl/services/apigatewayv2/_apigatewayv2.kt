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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.CfnDeployment
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName
import software.amazon.awscdk.services.apigatewayv2.CfnDomainNameProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps
import software.amazon.awscdk.services.apigatewayv2.CfnRoute
import software.amazon.awscdk.services.apigatewayv2.CfnRouteProps
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLink
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps
import software.constructs.Construct

public object apigatewayv2 {
    /**
     * The `AWS::ApiGatewayV2::Api` resource creates an API.
     *
     * WebSocket APIs and HTTP APIs are supported. For more information about WebSocket APIs, see
     * [About WebSocket APIs in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-overview.html)
     * in the *API Gateway Developer Guide* . For more information about HTTP APIs, see
     * [HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api.html) in
     * the *API Gateway Developer Guide.*
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object body;
     * CfnApi cfnApi = CfnApi.Builder.create(this, "MyCfnApi")
     * .apiKeySelectionExpression("apiKeySelectionExpression")
     * .basePath("basePath")
     * .body(body)
     * .bodyS3Location(BodyS3LocationProperty.builder()
     * .bucket("bucket")
     * .etag("etag")
     * .key("key")
     * .version("version")
     * .build())
     * .corsConfiguration(CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build())
     * .credentialsArn("credentialsArn")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .disableSchemaValidation(false)
     * .failOnWarnings(false)
     * .name("name")
     * .protocolType("protocolType")
     * .routeKey("routeKey")
     * .routeSelectionExpression("routeSelectionExpression")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .target("target")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html)
     */
    public inline fun cfnApi(
        scope: Construct,
        id: String,
        block: CfnApiDsl.() -> Unit = {},
    ): CfnApi {
        val builder = CfnApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `BodyS3Location` property specifies an S3 location from which to import an OpenAPI
     * definition.
     *
     * Supported only for HTTP APIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * BodyS3LocationProperty bodyS3LocationProperty = BodyS3LocationProperty.builder()
     * .bucket("bucket")
     * .etag("etag")
     * .key("key")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-bodys3location.html)
     */
    public inline fun cfnApiBodyS3LocationProperty(
        block: CfnApiBodyS3LocationPropertyDsl.() -> Unit = {}
    ): CfnApi.BodyS3LocationProperty {
        val builder = CfnApiBodyS3LocationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Cors` property specifies a CORS configuration for an API.
     *
     * Supported only for HTTP APIs. See
     * [Configuring CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     * for more information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CorsProperty corsProperty = CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html)
     */
    public inline fun cfnApiCorsProperty(
        block: CfnApiCorsPropertyDsl.() -> Unit = {}
    ): CfnApi.CorsProperty {
        val builder = CfnApiCorsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::ApiGatewayManagedOverrides` resource overrides the default properties
     * of API Gateway-managed resources that are implicitly configured for you when you use quick
     * create.
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
    public inline fun cfnApiGatewayManagedOverrides(
        scope: Construct,
        id: String,
        block: CfnApiGatewayManagedOverridesDsl.() -> Unit = {},
    ): CfnApiGatewayManagedOverrides {
        val builder = CfnApiGatewayManagedOverridesDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AccessLogSettings` property overrides the access log settings for an API Gateway-managed
     * stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * AccessLogSettingsProperty accessLogSettingsProperty = AccessLogSettingsProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html)
     */
    public inline fun cfnApiGatewayManagedOverridesAccessLogSettingsProperty(
        block: CfnApiGatewayManagedOverridesAccessLogSettingsPropertyDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverrides.AccessLogSettingsProperty {
        val builder = CfnApiGatewayManagedOverridesAccessLogSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `IntegrationOverrides` property overrides the integration settings for an API
     * Gateway-managed integration.
     *
     * If you remove this property, API Gateway restores the default values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * IntegrationOverridesProperty integrationOverridesProperty =
     * IntegrationOverridesProperty.builder()
     * .description("description")
     * .integrationMethod("integrationMethod")
     * .payloadFormatVersion("payloadFormatVersion")
     * .timeoutInMillis(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html)
     */
    public inline fun cfnApiGatewayManagedOverridesIntegrationOverridesProperty(
        block: CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverrides.IntegrationOverridesProperty {
        val builder = CfnApiGatewayManagedOverridesIntegrationOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiGatewayManagedOverrides`.
     *
     * Example:
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
    public inline fun cfnApiGatewayManagedOverridesProps(
        block: CfnApiGatewayManagedOverridesPropsDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverridesProps {
        val builder = CfnApiGatewayManagedOverridesPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `RouteOverrides` property overrides the route configuration for an API Gateway-managed
     * route.
     *
     * If you remove this property, API Gateway restores the default values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * RouteOverridesProperty routeOverridesProperty = RouteOverridesProperty.builder()
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType("authorizationType")
     * .authorizerId("authorizerId")
     * .operationName("operationName")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html)
     */
    public inline fun cfnApiGatewayManagedOverridesRouteOverridesProperty(
        block: CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverrides.RouteOverridesProperty {
        val builder = CfnApiGatewayManagedOverridesRouteOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `RouteSettings` property overrides the route settings for an API Gateway-managed route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html)
     */
    public inline fun cfnApiGatewayManagedOverridesRouteSettingsProperty(
        block: CfnApiGatewayManagedOverridesRouteSettingsPropertyDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverrides.RouteSettingsProperty {
        val builder = CfnApiGatewayManagedOverridesRouteSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `StageOverrides` property overrides the stage configuration for an API Gateway-managed
     * stage.
     *
     * If you remove this property, API Gateway restores the default values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object routeSettings;
     * Object stageVariables;
     * StageOverridesProperty stageOverridesProperty = StageOverridesProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html)
     */
    public inline fun cfnApiGatewayManagedOverridesStageOverridesProperty(
        block: CfnApiGatewayManagedOverridesStageOverridesPropertyDsl.() -> Unit = {}
    ): CfnApiGatewayManagedOverrides.StageOverridesProperty {
        val builder = CfnApiGatewayManagedOverridesStageOverridesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::ApiMapping` resource contains an API mapping.
     *
     * An API mapping relates a path of your custom domain name to a stage of your API. A custom
     * domain name can have multiple API mappings, but the paths can't overlap. A custom domain can
     * map only to APIs of the same protocol type. For more information, see
     * [CreateApiMapping](https://docs.aws.amazon.com/apigatewayv2/latest/api-reference/domainnames-domainname-apimappings.html#CreateApiMapping)
     * in the *Amazon API Gateway V2 API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnApiMapping cfnApiMapping = CfnApiMapping.Builder.create(this, "MyCfnApiMapping")
     * .apiId("apiId")
     * .domainName("domainName")
     * .stage("stage")
     * // the properties below are optional
     * .apiMappingKey("apiMappingKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html)
     */
    public inline fun cfnApiMapping(
        scope: Construct,
        id: String,
        block: CfnApiMappingDsl.() -> Unit = {},
    ): CfnApiMapping {
        val builder = CfnApiMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApiMapping`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnApiMappingProps cfnApiMappingProps = CfnApiMappingProps.builder()
     * .apiId("apiId")
     * .domainName("domainName")
     * .stage("stage")
     * // the properties below are optional
     * .apiMappingKey("apiMappingKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html)
     */
    public inline fun cfnApiMappingProps(
        block: CfnApiMappingPropsDsl.() -> Unit = {}
    ): CfnApiMappingProps {
        val builder = CfnApiMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApi`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object body;
     * CfnApiProps cfnApiProps = CfnApiProps.builder()
     * .apiKeySelectionExpression("apiKeySelectionExpression")
     * .basePath("basePath")
     * .body(body)
     * .bodyS3Location(BodyS3LocationProperty.builder()
     * .bucket("bucket")
     * .etag("etag")
     * .key("key")
     * .version("version")
     * .build())
     * .corsConfiguration(CorsProperty.builder()
     * .allowCredentials(false)
     * .allowHeaders(List.of("allowHeaders"))
     * .allowMethods(List.of("allowMethods"))
     * .allowOrigins(List.of("allowOrigins"))
     * .exposeHeaders(List.of("exposeHeaders"))
     * .maxAge(123)
     * .build())
     * .credentialsArn("credentialsArn")
     * .description("description")
     * .disableExecuteApiEndpoint(false)
     * .disableSchemaValidation(false)
     * .failOnWarnings(false)
     * .name("name")
     * .protocolType("protocolType")
     * .routeKey("routeKey")
     * .routeSelectionExpression("routeSelectionExpression")
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .target("target")
     * .version("version")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html)
     */
    public inline fun cfnApiProps(block: CfnApiPropsDsl.() -> Unit = {}): CfnApiProps {
        val builder = CfnApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Authorizer` resource creates an authorizer for a WebSocket API or an
     * HTTP API.
     *
     * To learn more, see
     * [Controlling and managing access to a WebSocket API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-control-access.html)
     * and
     * [Controlling and managing access to an HTTP API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-access-control.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnAuthorizer cfnAuthorizer = CfnAuthorizer.Builder.create(this, "MyCfnAuthorizer")
     * .apiId("apiId")
     * .authorizerType("authorizerType")
     * .name("name")
     * // the properties below are optional
     * .authorizerCredentialsArn("authorizerCredentialsArn")
     * .authorizerPayloadFormatVersion("authorizerPayloadFormatVersion")
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .enableSimpleResponses(false)
     * .identitySource(List.of("identitySource"))
     * .identityValidationExpression("identityValidationExpression")
     * .jwtConfiguration(JWTConfigurationProperty.builder()
     * .audience(List.of("audience"))
     * .issuer("issuer")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html)
     */
    public inline fun cfnAuthorizer(
        scope: Construct,
        id: String,
        block: CfnAuthorizerDsl.() -> Unit = {},
    ): CfnAuthorizer {
        val builder = CfnAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `JWTConfiguration` property specifies the configuration of a JWT authorizer.
     *
     * Required for the `JWT` authorizer type. Supported only for HTTP APIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * JWTConfigurationProperty jWTConfigurationProperty = JWTConfigurationProperty.builder()
     * .audience(List.of("audience"))
     * .issuer("issuer")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html)
     */
    public inline fun cfnAuthorizerJWTConfigurationProperty(
        block: CfnAuthorizerJWTConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAuthorizer.JWTConfigurationProperty {
        val builder = CfnAuthorizerJWTConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAuthorizer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnAuthorizerProps cfnAuthorizerProps = CfnAuthorizerProps.builder()
     * .apiId("apiId")
     * .authorizerType("authorizerType")
     * .name("name")
     * // the properties below are optional
     * .authorizerCredentialsArn("authorizerCredentialsArn")
     * .authorizerPayloadFormatVersion("authorizerPayloadFormatVersion")
     * .authorizerResultTtlInSeconds(123)
     * .authorizerUri("authorizerUri")
     * .enableSimpleResponses(false)
     * .identitySource(List.of("identitySource"))
     * .identityValidationExpression("identityValidationExpression")
     * .jwtConfiguration(JWTConfigurationProperty.builder()
     * .audience(List.of("audience"))
     * .issuer("issuer")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-authorizer.html)
     */
    public inline fun cfnAuthorizerProps(
        block: CfnAuthorizerPropsDsl.() -> Unit = {}
    ): CfnAuthorizerProps {
        val builder = CfnAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Deployment` resource creates a deployment for an API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
     * .apiId("apiId")
     * // the properties below are optional
     * .description("description")
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html)
     */
    public inline fun cfnDeployment(
        scope: Construct,
        id: String,
        block: CfnDeploymentDsl.() -> Unit = {},
    ): CfnDeployment {
        val builder = CfnDeploymentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDeployment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
     * .apiId("apiId")
     * // the properties below are optional
     * .description("description")
     * .stageName("stageName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html)
     */
    public inline fun cfnDeploymentProps(
        block: CfnDeploymentPropsDsl.() -> Unit = {}
    ): CfnDeploymentProps {
        val builder = CfnDeploymentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::DomainName` resource specifies a custom domain name for your API in
     * Amazon API Gateway (API Gateway).
     *
     * You can use a custom domain name to provide a URL that's more intuitive and easier to recall.
     * For more information about using custom domain names, see
     * [Set up Custom Domain Name for an API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object tags;
     * CfnDomainName cfnDomainName = CfnDomainName.Builder.create(this, "MyCfnDomainName")
     * .domainName("domainName")
     * // the properties below are optional
     * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .certificateName("certificateName")
     * .endpointType("endpointType")
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .securityPolicy("securityPolicy")
     * .build()))
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
     */
    public inline fun cfnDomainName(
        scope: Construct,
        id: String,
        block: CfnDomainNameDsl.() -> Unit = {},
    ): CfnDomainName {
        val builder = CfnDomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `DomainNameConfiguration` property type specifies the configuration for a an API's domain
     * name.
     *
     * `DomainNameConfiguration` is a property of the
     * [AWS::ApiGatewayV2::DomainName](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * DomainNameConfigurationProperty domainNameConfigurationProperty =
     * DomainNameConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .certificateName("certificateName")
     * .endpointType("endpointType")
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .securityPolicy("securityPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-domainnameconfiguration.html)
     */
    public inline fun cfnDomainNameDomainNameConfigurationProperty(
        block: CfnDomainNameDomainNameConfigurationPropertyDsl.() -> Unit = {}
    ): CfnDomainName.DomainNameConfigurationProperty {
        val builder = CfnDomainNameDomainNameConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * If specified, API Gateway performs two-way authentication between the client and the server.
     *
     * Clients must present a trusted certificate to access your API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
     * MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html)
     */
    public inline fun cfnDomainNameMutualTlsAuthenticationProperty(
        block: CfnDomainNameMutualTlsAuthenticationPropertyDsl.() -> Unit = {}
    ): CfnDomainName.MutualTlsAuthenticationProperty {
        val builder = CfnDomainNameMutualTlsAuthenticationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomainName`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object tags;
     * CfnDomainNameProps cfnDomainNameProps = CfnDomainNameProps.builder()
     * .domainName("domainName")
     * // the properties below are optional
     * .domainNameConfigurations(List.of(DomainNameConfigurationProperty.builder()
     * .certificateArn("certificateArn")
     * .certificateName("certificateName")
     * .endpointType("endpointType")
     * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
     * .securityPolicy("securityPolicy")
     * .build()))
     * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
     * .truststoreUri("truststoreUri")
     * .truststoreVersion("truststoreVersion")
     * .build())
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-domainname.html)
     */
    public inline fun cfnDomainNameProps(
        block: CfnDomainNamePropsDsl.() -> Unit = {}
    ): CfnDomainNameProps {
        val builder = CfnDomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Integration` resource creates an integration for an API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object requestParameters;
     * Object requestTemplates;
     * Object responseParameters;
     * CfnIntegration cfnIntegration = CfnIntegration.Builder.create(this, "MyCfnIntegration")
     * .apiId("apiId")
     * .integrationType("integrationType")
     * // the properties below are optional
     * .connectionId("connectionId")
     * .connectionType("connectionType")
     * .contentHandlingStrategy("contentHandlingStrategy")
     * .credentialsArn("credentialsArn")
     * .description("description")
     * .integrationMethod("integrationMethod")
     * .integrationSubtype("integrationSubtype")
     * .integrationUri("integrationUri")
     * .passthroughBehavior("passthroughBehavior")
     * .payloadFormatVersion("payloadFormatVersion")
     * .requestParameters(requestParameters)
     * .requestTemplates(requestTemplates)
     * .responseParameters(responseParameters)
     * .templateSelectionExpression("templateSelectionExpression")
     * .timeoutInMillis(123)
     * .tlsConfig(TlsConfigProperty.builder()
     * .serverNameToVerify("serverNameToVerify")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html)
     */
    public inline fun cfnIntegration(
        scope: Construct,
        id: String,
        block: CfnIntegrationDsl.() -> Unit = {},
    ): CfnIntegration {
        val builder = CfnIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object requestParameters;
     * Object requestTemplates;
     * Object responseParameters;
     * CfnIntegrationProps cfnIntegrationProps = CfnIntegrationProps.builder()
     * .apiId("apiId")
     * .integrationType("integrationType")
     * // the properties below are optional
     * .connectionId("connectionId")
     * .connectionType("connectionType")
     * .contentHandlingStrategy("contentHandlingStrategy")
     * .credentialsArn("credentialsArn")
     * .description("description")
     * .integrationMethod("integrationMethod")
     * .integrationSubtype("integrationSubtype")
     * .integrationUri("integrationUri")
     * .passthroughBehavior("passthroughBehavior")
     * .payloadFormatVersion("payloadFormatVersion")
     * .requestParameters(requestParameters)
     * .requestTemplates(requestTemplates)
     * .responseParameters(responseParameters)
     * .templateSelectionExpression("templateSelectionExpression")
     * .timeoutInMillis(123)
     * .tlsConfig(TlsConfigProperty.builder()
     * .serverNameToVerify("serverNameToVerify")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integration.html)
     */
    public inline fun cfnIntegrationProps(
        block: CfnIntegrationPropsDsl.() -> Unit = {}
    ): CfnIntegrationProps {
        val builder = CfnIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::IntegrationResponse` resource updates an integration response for an
     * WebSocket API.
     *
     * For more information, see
     * [Set up WebSocket API Integration Responses in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-integration-responses.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object responseParameters;
     * Object responseTemplates;
     * CfnIntegrationResponse cfnIntegrationResponse = CfnIntegrationResponse.Builder.create(this,
     * "MyCfnIntegrationResponse")
     * .apiId("apiId")
     * .integrationId("integrationId")
     * .integrationResponseKey("integrationResponseKey")
     * // the properties below are optional
     * .contentHandlingStrategy("contentHandlingStrategy")
     * .responseParameters(responseParameters)
     * .responseTemplates(responseTemplates)
     * .templateSelectionExpression("templateSelectionExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html)
     */
    public inline fun cfnIntegrationResponse(
        scope: Construct,
        id: String,
        block: CfnIntegrationResponseDsl.() -> Unit = {},
    ): CfnIntegrationResponse {
        val builder = CfnIntegrationResponseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a list of response parameters for an HTTP API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ResponseParameterListProperty responseParameterListProperty =
     * ResponseParameterListProperty.builder()
     * .responseParameters(List.of(ResponseParameterProperty.builder()
     * .destination("destination")
     * .source("source")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
     */
    public inline fun cfnIntegrationResponseParameterListProperty(
        block: CfnIntegrationResponseParameterListPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ResponseParameterListProperty {
        val builder = CfnIntegrationResponseParameterListPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Supported only for HTTP APIs.
     *
     * You use response parameters to transform the HTTP response from a backend integration before
     * returning the response to clients. Specify a key-value map from a selection key to response
     * parameters. The selection key must be a valid HTTP status code within the range of 200-599.
     * Response parameters are a key-value map. The key must match the pattern
     * `&lt;action&gt;:&lt;header&gt;.&lt;location&gt;` or `overwrite.statuscode` . The action can
     * be `append` , `overwrite` or `remove` . The value can be a static value, or map to response
     * data, stage variables, or context variables that are evaluated at runtime. To learn more, see
     * [Transforming API requests and responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ResponseParameterProperty responseParameterProperty = ResponseParameterProperty.builder()
     * .destination("destination")
     * .source("source")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html)
     */
    public inline fun cfnIntegrationResponseParameterProperty(
        block: CfnIntegrationResponseParameterPropertyDsl.() -> Unit = {}
    ): CfnIntegration.ResponseParameterProperty {
        val builder = CfnIntegrationResponseParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIntegrationResponse`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object responseParameters;
     * Object responseTemplates;
     * CfnIntegrationResponseProps cfnIntegrationResponseProps = CfnIntegrationResponseProps.builder()
     * .apiId("apiId")
     * .integrationId("integrationId")
     * .integrationResponseKey("integrationResponseKey")
     * // the properties below are optional
     * .contentHandlingStrategy("contentHandlingStrategy")
     * .responseParameters(responseParameters)
     * .responseTemplates(responseTemplates)
     * .templateSelectionExpression("templateSelectionExpression")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-integrationresponse.html)
     */
    public inline fun cfnIntegrationResponseProps(
        block: CfnIntegrationResponsePropsDsl.() -> Unit = {}
    ): CfnIntegrationResponseProps {
        val builder = CfnIntegrationResponsePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `TlsConfig` property specifies the TLS configuration for a private integration.
     *
     * If you specify a TLS configuration, private integration traffic uses the HTTPS protocol.
     * Supported only for HTTP APIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * TlsConfigProperty tlsConfigProperty = TlsConfigProperty.builder()
     * .serverNameToVerify("serverNameToVerify")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     */
    public inline fun cfnIntegrationTlsConfigProperty(
        block: CfnIntegrationTlsConfigPropertyDsl.() -> Unit = {}
    ): CfnIntegration.TlsConfigProperty {
        val builder = CfnIntegrationTlsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Model` resource updates data model for a WebSocket API.
     *
     * For more information, see
     * [Model Selection Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object schema;
     * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
     * .apiId("apiId")
     * .name("name")
     * .schema(schema)
     * // the properties below are optional
     * .contentType("contentType")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html)
     */
    public inline fun cfnModel(
        scope: Construct,
        id: String,
        block: CfnModelDsl.() -> Unit = {},
    ): CfnModel {
        val builder = CfnModelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnModel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object schema;
     * CfnModelProps cfnModelProps = CfnModelProps.builder()
     * .apiId("apiId")
     * .name("name")
     * .schema(schema)
     * // the properties below are optional
     * .contentType("contentType")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html)
     */
    public inline fun cfnModelProps(block: CfnModelPropsDsl.() -> Unit = {}): CfnModelProps {
        val builder = CfnModelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Route` resource creates a route for an API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object requestModels;
     * Object requestParameters;
     * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
     * .apiId("apiId")
     * .routeKey("routeKey")
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType("authorizationType")
     * .authorizerId("authorizerId")
     * .modelSelectionExpression("modelSelectionExpression")
     * .operationName("operationName")
     * .requestModels(requestModels)
     * .requestParameters(requestParameters)
     * .routeResponseSelectionExpression("routeResponseSelectionExpression")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html)
     */
    public inline fun cfnRoute(
        scope: Construct,
        id: String,
        block: CfnRouteDsl.() -> Unit = {},
    ): CfnRoute {
        val builder = CfnRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ParameterConstraintsProperty parameterConstraintsProperty =
     * ParameterConstraintsProperty.builder()
     * .required(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-route-parameterconstraints.html)
     */
    public inline fun cfnRouteParameterConstraintsProperty(
        block: CfnRouteParameterConstraintsPropertyDsl.() -> Unit = {}
    ): CfnRoute.ParameterConstraintsProperty {
        val builder = CfnRouteParameterConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRoute`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object requestModels;
     * Object requestParameters;
     * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
     * .apiId("apiId")
     * .routeKey("routeKey")
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType("authorizationType")
     * .authorizerId("authorizerId")
     * .modelSelectionExpression("modelSelectionExpression")
     * .operationName("operationName")
     * .requestModels(requestModels)
     * .requestParameters(requestParameters)
     * .routeResponseSelectionExpression("routeResponseSelectionExpression")
     * .target("target")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html)
     */
    public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
        val builder = CfnRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::RouteResponse` resource creates a route response for a WebSocket API.
     *
     * For more information, see
     * [Set up Route Responses for a WebSocket API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-route-response.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object responseModels;
     * CfnRouteResponse cfnRouteResponse = CfnRouteResponse.Builder.create(this, "MyCfnRouteResponse")
     * .apiId("apiId")
     * .routeId("routeId")
     * .routeResponseKey("routeResponseKey")
     * // the properties below are optional
     * .modelSelectionExpression("modelSelectionExpression")
     * .responseModels(responseModels)
     * .responseParameters(Map.of(
     * "responseParametersKey", ParameterConstraintsProperty.builder()
     * .required(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html)
     */
    public inline fun cfnRouteResponse(
        scope: Construct,
        id: String,
        block: CfnRouteResponseDsl.() -> Unit = {},
    ): CfnRouteResponse {
        val builder = CfnRouteResponseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether the parameter is required.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ParameterConstraintsProperty parameterConstraintsProperty =
     * ParameterConstraintsProperty.builder()
     * .required(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html)
     */
    public inline fun cfnRouteResponseParameterConstraintsProperty(
        block: CfnRouteResponseParameterConstraintsPropertyDsl.() -> Unit = {}
    ): CfnRouteResponse.ParameterConstraintsProperty {
        val builder = CfnRouteResponseParameterConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRouteResponse`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object responseModels;
     * CfnRouteResponseProps cfnRouteResponseProps = CfnRouteResponseProps.builder()
     * .apiId("apiId")
     * .routeId("routeId")
     * .routeResponseKey("routeResponseKey")
     * // the properties below are optional
     * .modelSelectionExpression("modelSelectionExpression")
     * .responseModels(responseModels)
     * .responseParameters(Map.of(
     * "responseParametersKey", ParameterConstraintsProperty.builder()
     * .required(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html)
     */
    public inline fun cfnRouteResponseProps(
        block: CfnRouteResponsePropsDsl.() -> Unit = {}
    ): CfnRouteResponseProps {
        val builder = CfnRouteResponsePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::Stage` resource specifies a stage for an API.
     *
     * Each stage is a named reference to a deployment of the API and is made available for client
     * applications to call. To learn more, see
     * [Working with stages for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-stages.html)
     * and
     * [Deploy a WebSocket API in API Gateway](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-set-up-websocket-deployment.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object routeSettings;
     * Object stageVariables;
     * Object tags;
     * CfnStage cfnStage = CfnStage.Builder.create(this, "MyCfnStage")
     * .apiId("apiId")
     * .stageName("stageName")
     * // the properties below are optional
     * .accessLogSettings(AccessLogSettingsProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .accessPolicyId("accessPolicyId")
     * .autoDeploy(false)
     * .clientCertificateId("clientCertificateId")
     * .defaultRouteSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .deploymentId("deploymentId")
     * .description("description")
     * .routeSettings(routeSettings)
     * .stageVariables(stageVariables)
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html)
     */
    public inline fun cfnStage(
        scope: Construct,
        id: String,
        block: CfnStageDsl.() -> Unit = {},
    ): CfnStage {
        val builder = CfnStageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Settings for logging access in a stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * AccessLogSettingsProperty accessLogSettingsProperty = AccessLogSettingsProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-accesslogsettings.html)
     */
    public inline fun cfnStageAccessLogSettingsProperty(
        block: CfnStageAccessLogSettingsPropertyDsl.() -> Unit = {}
    ): CfnStage.AccessLogSettingsProperty {
        val builder = CfnStageAccessLogSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStage`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * Object routeSettings;
     * Object stageVariables;
     * Object tags;
     * CfnStageProps cfnStageProps = CfnStageProps.builder()
     * .apiId("apiId")
     * .stageName("stageName")
     * // the properties below are optional
     * .accessLogSettings(AccessLogSettingsProperty.builder()
     * .destinationArn("destinationArn")
     * .format("format")
     * .build())
     * .accessPolicyId("accessPolicyId")
     * .autoDeploy(false)
     * .clientCertificateId("clientCertificateId")
     * .defaultRouteSettings(RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build())
     * .deploymentId("deploymentId")
     * .description("description")
     * .routeSettings(routeSettings)
     * .stageVariables(stageVariables)
     * .tags(tags)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-stage.html)
     */
    public inline fun cfnStageProps(block: CfnStagePropsDsl.() -> Unit = {}): CfnStageProps {
        val builder = CfnStagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a collection of route settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
     * .dataTraceEnabled(false)
     * .detailedMetricsEnabled(false)
     * .loggingLevel("loggingLevel")
     * .throttlingBurstLimit(123)
     * .throttlingRateLimit(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-stage-routesettings.html)
     */
    public inline fun cfnStageRouteSettingsProperty(
        block: CfnStageRouteSettingsPropertyDsl.() -> Unit = {}
    ): CfnStage.RouteSettingsProperty {
        val builder = CfnStageRouteSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApiGatewayV2::VpcLink` resource creates a VPC link.
     *
     * Supported only for HTTP APIs. The VPC link status must transition from `PENDING` to
     * `AVAILABLE` to successfully create a VPC link, which can take up to 10 minutes. To learn
     * more, see
     * [Working with VPC Links for HTTP APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-vpc-links.html)
     * in the *API Gateway Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnVpcLink cfnVpcLink = CfnVpcLink.Builder.create(this, "MyCfnVpcLink")
     * .name("name")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html)
     */
    public inline fun cfnVpcLink(
        scope: Construct,
        id: String,
        block: CfnVpcLinkDsl.() -> Unit = {},
    ): CfnVpcLink {
        val builder = CfnVpcLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcLink`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * CfnVpcLinkProps cfnVpcLinkProps = CfnVpcLinkProps.builder()
     * .name("name")
     * .subnetIds(List.of("subnetIds"))
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .tags(Map.of(
     * "tagsKey", "tags"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-vpclink.html)
     */
    public inline fun cfnVpcLinkProps(block: CfnVpcLinkPropsDsl.() -> Unit = {}): CfnVpcLinkProps {
        val builder = CfnVpcLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
