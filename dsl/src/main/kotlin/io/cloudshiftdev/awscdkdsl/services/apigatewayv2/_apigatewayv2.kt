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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions
import software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes
import software.amazon.awscdk.services.apigatewayv2.ApiMappingProps
import software.amazon.awscdk.services.apigatewayv2.BatchHttpRouteOptions
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
import software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions
import software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
import software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes
import software.amazon.awscdk.services.apigatewayv2.DomainNameProps
import software.amazon.awscdk.services.apigatewayv2.EndpointOptions
import software.amazon.awscdk.services.apigatewayv2.GrantInvokeOptions
import software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes
import software.amazon.awscdk.services.apigatewayv2.HttpApiProps
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.HttpIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.HttpRoute
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.HttpRouteProps
import software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes
import software.amazon.awscdk.services.apigatewayv2.HttpStageOptions
import software.amazon.awscdk.services.apigatewayv2.HttpStageProps
import software.amazon.awscdk.services.apigatewayv2.IApiMapping
import software.amazon.awscdk.services.apigatewayv2.IDomainName
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.IHttpStage
import software.amazon.awscdk.services.apigatewayv2.IVpcLink
import software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
import software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import software.amazon.awscdk.services.apigatewayv2.IWebSocketStage
import software.amazon.awscdk.services.apigatewayv2.MTLSConfig
import software.amazon.awscdk.services.apigatewayv2.StageAttributes
import software.amazon.awscdk.services.apigatewayv2.StageOptions
import software.amazon.awscdk.services.apigatewayv2.ThrottleSettings
import software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes
import software.amazon.awscdk.services.apigatewayv2.VpcLinkProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes
import software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration
import software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions
import software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps
import software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes
import software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps
import software.constructs.Construct

public object apigatewayv2 {
    /**
     * Options for the Route with Integration resource.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function bookStoreDefaultFn;
     * HttpUrlIntegration getBooksIntegration = new HttpUrlIntegration("GetBooksIntegration",
     * "https://get-books-proxy.example.com");
     * HttpLambdaIntegration bookStoreDefaultIntegration = new
     * HttpLambdaIntegration("BooksIntegration", bookStoreDefaultFn);
     * HttpApi httpApi = new HttpApi(this, "HttpApi");
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/books")
     * .methods(List.of(HttpMethod.GET))
     * .integration(getBooksIntegration)
     * .build());
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/books")
     * .methods(List.of(HttpMethod.ANY))
     * .integration(bookStoreDefaultIntegration)
     * .build());
     * ```
     */
    public inline fun addRoutesOptions(
        block: AddRoutesOptionsDsl.() -> Unit = {}
    ): AddRoutesOptions {
        val builder = AddRoutesOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new API mapping for API Gateway API endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * IApi api;
     * DomainName domainName;
     * IStage stage;
     * ApiMapping apiMapping = ApiMapping.Builder.create(this, "MyApiMapping")
     * .api(api)
     * .domainName(domainName)
     * // the properties below are optional
     * .apiMappingKey("apiMappingKey")
     * .stage(stage)
     * .build();
     * ```
     */
    public inline fun apiMapping(
        scope: Construct,
        id: String,
        block: ApiMappingDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.ApiMapping {
        val builder = ApiMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes used to import existing ApiMapping.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ApiMappingAttributes apiMappingAttributes = ApiMappingAttributes.builder()
     * .apiMappingId("apiMappingId")
     * .build();
     * ```
     */
    public inline fun apiMappingAttributes(
        block: ApiMappingAttributesDsl.() -> Unit = {}
    ): ApiMappingAttributes {
        val builder = ApiMappingAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties used to create the ApiMapping resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * IApi api;
     * DomainName domainName;
     * IStage stage;
     * ApiMappingProps apiMappingProps = ApiMappingProps.builder()
     * .api(api)
     * .domainName(domainName)
     * // the properties below are optional
     * .apiMappingKey("apiMappingKey")
     * .stage(stage)
     * .build();
     * ```
     */
    public inline fun apiMappingProps(block: ApiMappingPropsDsl.() -> Unit = {}): ApiMappingProps {
        val builder = ApiMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options used when configuring multiple routes, at once.
     *
     * The options here are the ones that would be configured for all being set up.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpRouteIntegration httpRouteIntegration;
     * BatchHttpRouteOptions batchHttpRouteOptions = BatchHttpRouteOptions.builder()
     * .integration(httpRouteIntegration)
     * .build();
     * ```
     */
    public inline fun batchHttpRouteOptions(
        block: BatchHttpRouteOptionsDsl.() -> Unit = {}
    ): BatchHttpRouteOptions {
        val builder = BatchHttpRouteOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

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
     * .tags(Map.of(
     * "tagsKey", "tags"))
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
     * The `DomainNameConfiguration` property type specifies the configuration for an API's domain
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
     * .tags(Map.of(
     * "tagsKey", "tags"))
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

    /**
     * Options for the CORS Configuration.
     *
     * Example:
     * ```
     * HttpApi.Builder.create(this, "HttpProxyApi")
     * .corsPreflight(CorsPreflightOptions.builder()
     * .allowHeaders(List.of("Authorization"))
     * .allowMethods(List.of(CorsHttpMethod.GET, CorsHttpMethod.HEAD, CorsHttpMethod.OPTIONS,
     * CorsHttpMethod.POST))
     * .allowOrigins(List.of("*"))
     * .maxAge(Duration.days(10))
     * .build())
     * .build();
     * ```
     */
    public inline fun corsPreflightOptions(
        block: CorsPreflightOptionsDsl.() -> Unit = {}
    ): CorsPreflightOptions {
        val builder = CorsPreflightOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for DomainMapping.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function handler;
     * DomainName dn;
     * HttpApi apiDemo = HttpApi.Builder.create(this, "DemoApi")
     * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
     * // https://${dn.domainName}/demo goes to apiDemo $default stage
     * .defaultDomainMapping(DomainMappingOptions.builder()
     * .domainName(dn)
     * .mappingKey("demo")
     * .build())
     * .build();
     * ```
     */
    public inline fun domainMappingOptions(
        block: DomainMappingOptionsDsl.() -> Unit = {}
    ): DomainMappingOptions {
        val builder = DomainMappingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Custom domain resource for the API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function handler;
     * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
     * String domainName = "example.com";
     * DomainName dn = DomainName.Builder.create(this, "DN")
     * .domainName(domainName)
     * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
     * .build();
     * HttpApi api = HttpApi.Builder.create(this, "HttpProxyProdApi")
     * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
     * // https://${dn.domainName}/foo goes to prodApi $default stage
     * .defaultDomainMapping(DomainMappingOptions.builder()
     * .domainName(dn)
     * .mappingKey("foo")
     * .build())
     * .build();
     * ```
     */
    public inline fun domainName(
        scope: Construct,
        id: String,
        block: DomainNameDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.DomainName {
        val builder = DomainNameDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * custom domain name attributes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * DomainNameAttributes domainNameAttributes = DomainNameAttributes.builder()
     * .name("name")
     * .regionalDomainName("regionalDomainName")
     * .regionalHostedZoneId("regionalHostedZoneId")
     * .build();
     * ```
     */
    public inline fun domainNameAttributes(
        block: DomainNameAttributesDsl.() -> Unit = {}
    ): DomainNameAttributes {
        val builder = DomainNameAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * properties used for creating the DomainName.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function handler;
     * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
     * String domainName = "example.com";
     * DomainName dn = DomainName.Builder.create(this, "DN")
     * .domainName(domainName)
     * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
     * .build();
     * HttpApi api = HttpApi.Builder.create(this, "HttpProxyProdApi")
     * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
     * // https://${dn.domainName}/foo goes to prodApi $default stage
     * .defaultDomainMapping(DomainMappingOptions.builder()
     * .domainName(dn)
     * .mappingKey("foo")
     * .build())
     * .build();
     * ```
     */
    public inline fun domainNameProps(block: DomainNamePropsDsl.() -> Unit = {}): DomainNameProps {
        val builder = DomainNamePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * properties for creating a domain name endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.services.certificatemanager.*;
     * Certificate certificate;
     * EndpointOptions endpointOptions = EndpointOptions.builder()
     * .certificate(certificate)
     * // the properties below are optional
     * .certificateName("certificateName")
     * .endpointType(EndpointType.EDGE)
     * .ownershipCertificate(certificate)
     * .securityPolicy(SecurityPolicy.TLS_1_0)
     * .build();
     * ```
     */
    public inline fun endpointOptions(block: EndpointOptionsDsl.() -> Unit = {}): EndpointOptions {
        val builder = EndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for granting invoke access.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * GrantInvokeOptions grantInvokeOptions = GrantInvokeOptions.builder()
     * .httpMethods(List.of(HttpMethod.ANY))
     * .build();
     * ```
     */
    public inline fun grantInvokeOptions(
        block: GrantInvokeOptionsDsl.() -> Unit = {}
    ): GrantInvokeOptions {
        val builder = GrantInvokeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new API Gateway HTTP API endpoint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function booksDefaultFn;
     * HttpLambdaIntegration booksIntegration = new HttpLambdaIntegration("BooksIntegration",
     * booksDefaultFn);
     * HttpApi httpApi = new HttpApi(this, "HttpApi");
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/books")
     * .methods(List.of(HttpMethod.GET))
     * .integration(booksIntegration)
     * .build());
     * ```
     */
    public inline fun httpApi(
        scope: Construct,
        id: String,
        block: HttpApiDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.HttpApi {
        val builder = HttpApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for importing an HttpApi into the CDK.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApiAttributes httpApiAttributes = HttpApiAttributes.builder()
     * .httpApiId("httpApiId")
     * // the properties below are optional
     * .apiEndpoint("apiEndpoint")
     * .build();
     * ```
     */
    public inline fun httpApiAttributes(
        block: HttpApiAttributesDsl.() -> Unit = {}
    ): HttpApiAttributes {
        val builder = HttpApiAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize an instance of `HttpApi`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
     * ApplicationLoadBalancer lb;
     * ApplicationListener listener = lb.addListener("listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddApplicationTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(HttpAlbIntegration.Builder.create("DefaultIntegration", listener)
     * .parameterMapping(new ParameterMapping().custom("myKey", "myValue"))
     * .build())
     * .build();
     * ```
     */
    public inline fun httpApiProps(block: HttpApiPropsDsl.() -> Unit = {}): HttpApiProps {
        val builder = HttpApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An authorizer for Http Apis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * HttpAuthorizer httpAuthorizer = HttpAuthorizer.Builder.create(this, "MyHttpAuthorizer")
     * .httpApi(httpApi)
     * .identitySource(List.of("identitySource"))
     * .type(HttpAuthorizerType.IAM)
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .authorizerUri("authorizerUri")
     * .enableSimpleResponses(false)
     * .jwtAudience(List.of("jwtAudience"))
     * .jwtIssuer("jwtIssuer")
     * .payloadFormatVersion(AuthorizerPayloadVersion.VERSION_1_0)
     * .resultsCacheTtl(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun httpAuthorizer(
        scope: Construct,
        id: String,
        block: HttpAuthorizerDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer {
        val builder = HttpAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to an http authorizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpAuthorizerAttributes httpAuthorizerAttributes = HttpAuthorizerAttributes.builder()
     * .authorizerId("authorizerId")
     * .authorizerType("authorizerType")
     * .build();
     * ```
     */
    public inline fun httpAuthorizerAttributes(
        block: HttpAuthorizerAttributesDsl.() -> Unit = {}
    ): HttpAuthorizerAttributes {
        val builder = HttpAuthorizerAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize an instance of `HttpAuthorizer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * HttpAuthorizerProps httpAuthorizerProps = HttpAuthorizerProps.builder()
     * .httpApi(httpApi)
     * .identitySource(List.of("identitySource"))
     * .type(HttpAuthorizerType.IAM)
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .authorizerUri("authorizerUri")
     * .enableSimpleResponses(false)
     * .jwtAudience(List.of("jwtAudience"))
     * .jwtIssuer("jwtIssuer")
     * .payloadFormatVersion(AuthorizerPayloadVersion.VERSION_1_0)
     * .resultsCacheTtl(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun httpAuthorizerProps(
        block: HttpAuthorizerPropsDsl.() -> Unit = {}
    ): HttpAuthorizerProps {
        val builder = HttpAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The integration for an API route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * IntegrationCredentials integrationCredentials;
     * ParameterMapping parameterMapping;
     * PayloadFormatVersion payloadFormatVersion;
     * HttpIntegration httpIntegration = HttpIntegration.Builder.create(this, "MyHttpIntegration")
     * .httpApi(httpApi)
     * .integrationType(HttpIntegrationType.HTTP_PROXY)
     * // the properties below are optional
     * .connectionId("connectionId")
     * .connectionType(HttpConnectionType.VPC_LINK)
     * .credentials(integrationCredentials)
     * .integrationSubtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
     * .integrationUri("integrationUri")
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .payloadFormatVersion(payloadFormatVersion)
     * .secureServerName("secureServerName")
     * .build();
     * ```
     */
    public inline fun httpIntegration(
        scope: Construct,
        id: String,
        block: HttpIntegrationDsl.() -> Unit = {},
    ): HttpIntegration {
        val builder = HttpIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The integration properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * IntegrationCredentials integrationCredentials;
     * ParameterMapping parameterMapping;
     * PayloadFormatVersion payloadFormatVersion;
     * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
     * .httpApi(httpApi)
     * .integrationType(HttpIntegrationType.HTTP_PROXY)
     * // the properties below are optional
     * .connectionId("connectionId")
     * .connectionType(HttpConnectionType.VPC_LINK)
     * .credentials(integrationCredentials)
     * .integrationSubtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
     * .integrationUri("integrationUri")
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .payloadFormatVersion(payloadFormatVersion)
     * .secureServerName("secureServerName")
     * .build();
     * ```
     */
    public inline fun httpIntegrationProps(
        block: HttpIntegrationPropsDsl.() -> Unit = {}
    ): HttpIntegrationProps {
        val builder = HttpIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Route class that creates the Route for API Gateway HTTP API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * IHttpRouteAuthorizer httpRouteAuthorizer;
     * HttpRouteIntegration httpRouteIntegration;
     * HttpRouteKey httpRouteKey;
     * HttpRoute httpRoute = HttpRoute.Builder.create(this, "MyHttpRoute")
     * .httpApi(httpApi)
     * .integration(httpRouteIntegration)
     * .routeKey(httpRouteKey)
     * // the properties below are optional
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer(httpRouteAuthorizer)
     * .build();
     * ```
     */
    public inline fun httpRoute(
        scope: Construct,
        id: String,
        block: HttpRouteDsl.() -> Unit = {},
    ): HttpRoute {
        val builder = HttpRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input to the bind() operation, that binds an authorizer to a route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.constructs.*;
     * Construct construct;
     * HttpRoute httpRoute;
     * HttpRouteAuthorizerBindOptions httpRouteAuthorizerBindOptions =
     * HttpRouteAuthorizerBindOptions.builder()
     * .route(httpRoute)
     * .scope(construct)
     * .build();
     * ```
     */
    public inline fun httpRouteAuthorizerBindOptions(
        block: HttpRouteAuthorizerBindOptionsDsl.() -> Unit = {}
    ): HttpRouteAuthorizerBindOptions {
        val builder = HttpRouteAuthorizerBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Results of binding an authorizer to an http route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpRouteAuthorizerConfig httpRouteAuthorizerConfig = HttpRouteAuthorizerConfig.builder()
     * .authorizationType("authorizationType")
     * // the properties below are optional
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizerId("authorizerId")
     * .build();
     * ```
     */
    public inline fun httpRouteAuthorizerConfig(
        block: HttpRouteAuthorizerConfigDsl.() -> Unit = {}
    ): HttpRouteAuthorizerConfig {
        val builder = HttpRouteAuthorizerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to the HttpRouteIntegration during its bind operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.constructs.*;
     * Construct construct;
     * HttpRoute httpRoute;
     * HttpRouteIntegrationBindOptions httpRouteIntegrationBindOptions =
     * HttpRouteIntegrationBindOptions.builder()
     * .route(httpRoute)
     * .scope(construct)
     * .build();
     * ```
     */
    public inline fun httpRouteIntegrationBindOptions(
        block: HttpRouteIntegrationBindOptionsDsl.() -> Unit = {}
    ): HttpRouteIntegrationBindOptions {
        val builder = HttpRouteIntegrationBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Config returned back as a result of the bind.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * IntegrationCredentials integrationCredentials;
     * ParameterMapping parameterMapping;
     * PayloadFormatVersion payloadFormatVersion;
     * HttpRouteIntegrationConfig httpRouteIntegrationConfig = HttpRouteIntegrationConfig.builder()
     * .payloadFormatVersion(payloadFormatVersion)
     * .type(HttpIntegrationType.HTTP_PROXY)
     * // the properties below are optional
     * .connectionId("connectionId")
     * .connectionType(HttpConnectionType.VPC_LINK)
     * .credentials(integrationCredentials)
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .secureServerName("secureServerName")
     * .subtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
     * .uri("uri")
     * .build();
     * ```
     */
    public inline fun httpRouteIntegrationConfig(
        block: HttpRouteIntegrationConfigDsl.() -> Unit = {}
    ): HttpRouteIntegrationConfig {
        val builder = HttpRouteIntegrationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize a new Route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * IHttpRouteAuthorizer httpRouteAuthorizer;
     * HttpRouteIntegration httpRouteIntegration;
     * HttpRouteKey httpRouteKey;
     * HttpRouteProps httpRouteProps = HttpRouteProps.builder()
     * .httpApi(httpApi)
     * .integration(httpRouteIntegration)
     * .routeKey(httpRouteKey)
     * // the properties below are optional
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizer(httpRouteAuthorizer)
     * .build();
     * ```
     */
    public inline fun httpRouteProps(block: HttpRoutePropsDsl.() -> Unit = {}): HttpRouteProps {
        val builder = HttpRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a stage where an instance of the API is deployed.
     *
     * Example:
     * ```
     * HttpApi api;
     * HttpStage.Builder.create(this, "Stage")
     * .httpApi(api)
     * .stageName("beta")
     * .build();
     * ```
     */
    public inline fun httpStage(
        scope: Construct,
        id: String,
        block: HttpStageDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.HttpStage {
        val builder = HttpStageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes used to import existing HttpStage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * HttpApi httpApi;
     * HttpStageAttributes httpStageAttributes = HttpStageAttributes.builder()
     * .api(httpApi)
     * .stageName("stageName")
     * .build();
     * ```
     */
    public inline fun httpStageAttributes(
        block: HttpStageAttributesDsl.() -> Unit = {}
    ): HttpStageAttributes {
        val builder = HttpStageAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The options to create a new Stage for an HTTP API.
     *
     * Example:
     * ```
     * HttpApi api;
     * DomainName dn;
     * api.addStage("beta", HttpStageOptions.builder()
     * .stageName("beta")
     * .autoDeploy(true)
     * // https://${dn.domainName}/bar goes to the beta stage
     * .domainMapping(DomainMappingOptions.builder()
     * .domainName(dn)
     * .mappingKey("bar")
     * .build())
     * .build());
     * ```
     */
    public inline fun httpStageOptions(
        block: HttpStageOptionsDsl.() -> Unit = {}
    ): HttpStageOptions {
        val builder = HttpStageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize an instance of `HttpStage`.
     *
     * Example:
     * ```
     * HttpApi api;
     * HttpStage.Builder.create(this, "Stage")
     * .httpApi(api)
     * .stageName("beta")
     * .build();
     * ```
     */
    public inline fun httpStageProps(block: HttpStagePropsDsl.() -> Unit = {}): HttpStageProps {
        val builder = HttpStagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The mTLS authentication configuration for a custom domain name.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.certificatemanager.*;
     * Bucket bucket;
     * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
     * String domainName = "example.com";
     * DomainName.Builder.create(this, "DomainName")
     * .domainName(domainName)
     * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
     * .mtls(MTLSConfig.builder()
     * .bucket(bucket)
     * .key("someca.pem")
     * .version("version")
     * .build())
     * .build();
     * ```
     */
    public inline fun mTLSConfig(block: MTLSConfigDsl.() -> Unit = {}): MTLSConfig {
        val builder = MTLSConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes used to import existing Stage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * StageAttributes stageAttributes = StageAttributes.builder()
     * .stageName("stageName")
     * .build();
     * ```
     */
    public inline fun stageAttributes(block: StageAttributesDsl.() -> Unit = {}): StageAttributes {
        val builder = StageAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options required to create a new stage.
     *
     * Options that are common between HTTP and Websocket APIs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * DomainName domainName;
     * StageOptions stageOptions = StageOptions.builder()
     * .autoDeploy(false)
     * .domainMapping(DomainMappingOptions.builder()
     * .domainName(domainName)
     * // the properties below are optional
     * .mappingKey("mappingKey")
     * .build())
     * .throttle(ThrottleSettings.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun stageOptions(block: StageOptionsDsl.() -> Unit = {}): StageOptions {
        val builder = StageOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for defining throttling parameters to API stages.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * ThrottleSettings throttleSettings = ThrottleSettings.builder()
     * .burstLimit(123)
     * .rateLimit(123)
     * .build();
     * ```
     */
    public inline fun throttleSettings(
        block: ThrottleSettingsDsl.() -> Unit = {}
    ): ThrottleSettings {
        val builder = ThrottleSettingsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a new VPC Link Specifies an API Gateway VPC link for a HTTP API to access resources in
     * an Amazon Virtual Private Cloud (VPC).
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * ApplicationLoadBalancer alb = ApplicationLoadBalancer.Builder.create(this,
     * "AppLoadBalancer").vpc(vpc).build();
     * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
     * // Creating an HTTP ALB Integration:
     * HttpAlbIntegration albIntegration = HttpAlbIntegration.Builder.create("ALBIntegration",
     * alb.getListeners()[0]).build();
     * ```
     */
    public inline fun vpcLink(
        scope: Construct,
        id: String,
        block: VpcLinkDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.VpcLink {
        val builder = VpcLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes when importing a new VpcLink.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * Vpc vpc;
     * IVpcLink awesomeLink = VpcLink.fromVpcLinkAttributes(this, "awesome-vpc-link",
     * VpcLinkAttributes.builder()
     * .vpcLinkId("us-east-1_oiuR12Abd")
     * .vpc(vpc)
     * .build());
     * ```
     */
    public inline fun vpcLinkAttributes(
        block: VpcLinkAttributesDsl.() -> Unit = {}
    ): VpcLinkAttributes {
        val builder = VpcLinkAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a VpcLink.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * ApplicationLoadBalancer alb = ApplicationLoadBalancer.Builder.create(this,
     * "AppLoadBalancer").vpc(vpc).build();
     * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
     * // Creating an HTTP ALB Integration:
     * HttpAlbIntegration albIntegration = HttpAlbIntegration.Builder.create("ALBIntegration",
     * alb.getListeners()[0]).build();
     * ```
     */
    public inline fun vpcLinkProps(block: VpcLinkPropsDsl.() -> Unit = {}): VpcLinkProps {
        val builder = VpcLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a new API Gateway WebSocket API endpoint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * Function messageHandler;
     * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
     * .integration(new WebSocketLambdaIntegration("SendMessageIntegration", messageHandler))
     * .build());
     * ```
     */
    public inline fun webSocketApi(
        scope: Construct,
        id: String,
        block: WebSocketApiDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.WebSocketApi {
        val builder = WebSocketApiDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes for importing a WebSocketApi into the CDK.
     *
     * Example:
     * ```
     * IWebSocketApi webSocketApi = WebSocketApi.fromWebSocketApiAttributes(this, "mywsapi",
     * WebSocketApiAttributes.builder().webSocketId("api-1234").build());
     * ```
     */
    public inline fun webSocketApiAttributes(
        block: WebSocketApiAttributesDsl.() -> Unit = {}
    ): WebSocketApiAttributes {
        val builder = WebSocketApiAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for WebSocket API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * // This function handles your auth logic
     * Function authHandler;
     * // This function handles your WebSocket requests
     * Function handler;
     * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer",
     * authHandler);
     * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration",
     * handler);
     * WebSocketApi.Builder.create(this, "WebSocketApi")
     * .connectRouteOptions(WebSocketRouteOptions.builder()
     * .integration(integration)
     * .authorizer(authorizer)
     * .build())
     * .build();
     * ```
     */
    public inline fun webSocketApiProps(
        block: WebSocketApiPropsDsl.() -> Unit = {}
    ): WebSocketApiProps {
        val builder = WebSocketApiPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An authorizer for WebSocket Apis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketApi webSocketApi;
     * WebSocketAuthorizer webSocketAuthorizer = WebSocketAuthorizer.Builder.create(this,
     * "MyWebSocketAuthorizer")
     * .identitySource(List.of("identitySource"))
     * .type(WebSocketAuthorizerType.LAMBDA)
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .authorizerUri("authorizerUri")
     * .build();
     * ```
     */
    public inline fun webSocketAuthorizer(
        scope: Construct,
        id: String,
        block: WebSocketAuthorizerDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer {
        val builder = WebSocketAuthorizerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to an WebSocket authorizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketAuthorizerAttributes webSocketAuthorizerAttributes =
     * WebSocketAuthorizerAttributes.builder()
     * .authorizerId("authorizerId")
     * .authorizerType("authorizerType")
     * .build();
     * ```
     */
    public inline fun webSocketAuthorizerAttributes(
        block: WebSocketAuthorizerAttributesDsl.() -> Unit = {}
    ): WebSocketAuthorizerAttributes {
        val builder = WebSocketAuthorizerAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize an instance of `WebSocketAuthorizer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketApi webSocketApi;
     * WebSocketAuthorizerProps webSocketAuthorizerProps = WebSocketAuthorizerProps.builder()
     * .identitySource(List.of("identitySource"))
     * .type(WebSocketAuthorizerType.LAMBDA)
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .authorizerName("authorizerName")
     * .authorizerUri("authorizerUri")
     * .build();
     * ```
     */
    public inline fun webSocketAuthorizerProps(
        block: WebSocketAuthorizerPropsDsl.() -> Unit = {}
    ): WebSocketAuthorizerProps {
        val builder = WebSocketAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The integration for an API route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * WebSocketApi webSocketApi;
     * WebSocketIntegration webSocketIntegration = WebSocketIntegration.Builder.create(this,
     * "MyWebSocketIntegration")
     * .integrationType(WebSocketIntegrationType.AWS_PROXY)
     * .integrationUri("integrationUri")
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .credentialsRole(role)
     * .integrationMethod("integrationMethod")
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .templateSelectionExpression("templateSelectionExpression")
     * .build();
     * ```
     */
    public inline fun webSocketIntegration(
        scope: Construct,
        id: String,
        block: WebSocketIntegrationDsl.() -> Unit = {},
    ): WebSocketIntegration {
        val builder = WebSocketIntegrationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The integration properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * WebSocketApi webSocketApi;
     * WebSocketIntegrationProps webSocketIntegrationProps = WebSocketIntegrationProps.builder()
     * .integrationType(WebSocketIntegrationType.AWS_PROXY)
     * .integrationUri("integrationUri")
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .credentialsRole(role)
     * .integrationMethod("integrationMethod")
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .templateSelectionExpression("templateSelectionExpression")
     * .build();
     * ```
     */
    public inline fun webSocketIntegrationProps(
        block: WebSocketIntegrationPropsDsl.() -> Unit = {}
    ): WebSocketIntegrationProps {
        val builder = WebSocketIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Route class that creates the Route for API Gateway WebSocket API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketApi webSocketApi;
     * IWebSocketRouteAuthorizer webSocketRouteAuthorizer;
     * WebSocketRouteIntegration webSocketRouteIntegration;
     * WebSocketRoute webSocketRoute = WebSocketRoute.Builder.create(this, "MyWebSocketRoute")
     * .integration(webSocketRouteIntegration)
     * .routeKey("routeKey")
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizer(webSocketRouteAuthorizer)
     * .returnResponse(false)
     * .build();
     * ```
     */
    public inline fun webSocketRoute(
        scope: Construct,
        id: String,
        block: WebSocketRouteDsl.() -> Unit = {},
    ): WebSocketRoute {
        val builder = WebSocketRouteDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Input to the bind() operation, that binds an authorizer to a route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.constructs.*;
     * Construct construct;
     * WebSocketRoute webSocketRoute;
     * WebSocketRouteAuthorizerBindOptions webSocketRouteAuthorizerBindOptions =
     * WebSocketRouteAuthorizerBindOptions.builder()
     * .route(webSocketRoute)
     * .scope(construct)
     * .build();
     * ```
     */
    public inline fun webSocketRouteAuthorizerBindOptions(
        block: WebSocketRouteAuthorizerBindOptionsDsl.() -> Unit = {}
    ): WebSocketRouteAuthorizerBindOptions {
        val builder = WebSocketRouteAuthorizerBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Results of binding an authorizer to an WebSocket route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketRouteAuthorizerConfig webSocketRouteAuthorizerConfig =
     * WebSocketRouteAuthorizerConfig.builder()
     * .authorizationType("authorizationType")
     * // the properties below are optional
     * .authorizerId("authorizerId")
     * .build();
     * ```
     */
    public inline fun webSocketRouteAuthorizerConfig(
        block: WebSocketRouteAuthorizerConfigDsl.() -> Unit = {}
    ): WebSocketRouteAuthorizerConfig {
        val builder = WebSocketRouteAuthorizerConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to the WebSocketRouteIntegration during its bind operation.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.constructs.*;
     * Construct construct;
     * WebSocketRoute webSocketRoute;
     * WebSocketRouteIntegrationBindOptions webSocketRouteIntegrationBindOptions =
     * WebSocketRouteIntegrationBindOptions.builder()
     * .route(webSocketRoute)
     * .scope(construct)
     * .build();
     * ```
     */
    public inline fun webSocketRouteIntegrationBindOptions(
        block: WebSocketRouteIntegrationBindOptionsDsl.() -> Unit = {}
    ): WebSocketRouteIntegrationBindOptions {
        val builder = WebSocketRouteIntegrationBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Config returned back as a result of the bind.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role role;
     * WebSocketRouteIntegrationConfig webSocketRouteIntegrationConfig =
     * WebSocketRouteIntegrationConfig.builder()
     * .type(WebSocketIntegrationType.AWS_PROXY)
     * .uri("uri")
     * // the properties below are optional
     * .credentialsRole(role)
     * .method("method")
     * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
     * .requestParameters(Map.of(
     * "requestParametersKey", "requestParameters"))
     * .requestTemplates(Map.of(
     * "requestTemplatesKey", "requestTemplates"))
     * .templateSelectionExpression("templateSelectionExpression")
     * .build();
     * ```
     */
    public inline fun webSocketRouteIntegrationConfig(
        block: WebSocketRouteIntegrationConfigDsl.() -> Unit = {}
    ): WebSocketRouteIntegrationConfig {
        val builder = WebSocketRouteIntegrationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options used to add route to the API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * Function messageHandler;
     * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
     * .integration(new WebSocketLambdaIntegration("SendMessageIntegration", messageHandler))
     * .build());
     * ```
     */
    public inline fun webSocketRouteOptions(
        block: WebSocketRouteOptionsDsl.() -> Unit = {}
    ): WebSocketRouteOptions {
        val builder = WebSocketRouteOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize a new Route.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketApi webSocketApi;
     * IWebSocketRouteAuthorizer webSocketRouteAuthorizer;
     * WebSocketRouteIntegration webSocketRouteIntegration;
     * WebSocketRouteProps webSocketRouteProps = WebSocketRouteProps.builder()
     * .integration(webSocketRouteIntegration)
     * .routeKey("routeKey")
     * .webSocketApi(webSocketApi)
     * // the properties below are optional
     * .apiKeyRequired(false)
     * .authorizer(webSocketRouteAuthorizer)
     * .returnResponse(false)
     * .build();
     * ```
     */
    public inline fun webSocketRouteProps(
        block: WebSocketRoutePropsDsl.() -> Unit = {}
    ): WebSocketRouteProps {
        val builder = WebSocketRoutePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a stage where an instance of the API is deployed.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * Function connectHandler;
     * Function disconnectHandler;
     * Function defaultHandler;
     * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
     * .connectRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("ConnectIntegration", connectHandler)).build())
     * .disconnectRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("DisconnectIntegration", disconnectHandler)).build())
     * .defaultRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("DefaultIntegration", defaultHandler)).build())
     * .build();
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * ```
     */
    public inline fun webSocketStage(
        scope: Construct,
        id: String,
        block: WebSocketStageDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.apigatewayv2.WebSocketStage {
        val builder = WebSocketStageDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The attributes used to import existing WebSocketStage.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * WebSocketApi webSocketApi;
     * WebSocketStageAttributes webSocketStageAttributes = WebSocketStageAttributes.builder()
     * .api(webSocketApi)
     * .stageName("stageName")
     * .build();
     * ```
     */
    public inline fun webSocketStageAttributes(
        block: WebSocketStageAttributesDsl.() -> Unit = {}
    ): WebSocketStageAttributes {
        val builder = WebSocketStageAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize an instance of `WebSocketStage`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * Function connectHandler;
     * Function disconnectHandler;
     * Function defaultHandler;
     * WebSocketApi webSocketApi = WebSocketApi.Builder.create(this, "mywsapi")
     * .connectRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("ConnectIntegration", connectHandler)).build())
     * .disconnectRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("DisconnectIntegration", disconnectHandler)).build())
     * .defaultRouteOptions(WebSocketRouteOptions.builder().integration(new
     * WebSocketLambdaIntegration("DefaultIntegration", defaultHandler)).build())
     * .build();
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * ```
     */
    public inline fun webSocketStageProps(
        block: WebSocketStagePropsDsl.() -> Unit = {}
    ): WebSocketStageProps {
        val builder = WebSocketStagePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public object ApiMapping {
        public fun fromApiMappingAttributes(
            scope: Construct,
            id: String,
            block: ApiMappingAttributesDsl.() -> Unit = {},
        ): IApiMapping {
            val builder = ApiMappingAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.ApiMapping.fromApiMappingAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object DomainName {
        public fun fromDomainNameAttributes(
            scope: Construct,
            id: String,
            block: DomainNameAttributesDsl.() -> Unit = {},
        ): IDomainName {
            val builder = DomainNameAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.DomainName.fromDomainNameAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object HttpApi {
        public fun fromHttpApiAttributes(
            scope: Construct,
            id: String,
            block: HttpApiAttributesDsl.() -> Unit = {},
        ): IHttpApi {
            val builder = HttpApiAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.HttpApi.fromHttpApiAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object HttpAuthorizer {
        public fun fromHttpAuthorizerAttributes(
            scope: Construct,
            id: String,
            block: HttpAuthorizerAttributesDsl.() -> Unit = {},
        ): IHttpRouteAuthorizer {
            val builder = HttpAuthorizerAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer
                .fromHttpAuthorizerAttributes(scope, id, builder.build())
        }
    }

    public object HttpStage {
        public fun fromHttpStageAttributes(
            scope: Construct,
            id: String,
            block: HttpStageAttributesDsl.() -> Unit = {},
        ): IHttpStage {
            val builder = HttpStageAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.HttpStage.fromHttpStageAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object VpcLink {
        public fun fromVpcLinkAttributes(
            scope: Construct,
            id: String,
            block: VpcLinkAttributesDsl.() -> Unit = {},
        ): IVpcLink {
            val builder = VpcLinkAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.VpcLink.fromVpcLinkAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }

    public object WebSocketApi {
        public fun fromWebSocketApiAttributes(
            scope: Construct,
            id: String,
            block: WebSocketApiAttributesDsl.() -> Unit = {},
        ): IWebSocketApi {
            val builder = WebSocketApiAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.WebSocketApi
                .fromWebSocketApiAttributes(scope, id, builder.build())
        }
    }

    public object WebSocketAuthorizer {
        public fun fromWebSocketAuthorizerAttributes(
            scope: Construct,
            id: String,
            block: WebSocketAuthorizerAttributesDsl.() -> Unit = {},
        ): IWebSocketRouteAuthorizer {
            val builder = WebSocketAuthorizerAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer
                .fromWebSocketAuthorizerAttributes(scope, id, builder.build())
        }
    }

    public object WebSocketStage {
        public fun fromWebSocketStageAttributes(
            scope: Construct,
            id: String,
            block: WebSocketStageAttributesDsl.() -> Unit = {},
        ): IWebSocketStage {
            val builder = WebSocketStageAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.apigatewayv2.WebSocketStage
                .fromWebSocketStageAttributes(scope, id, builder.build())
        }
    }
}
