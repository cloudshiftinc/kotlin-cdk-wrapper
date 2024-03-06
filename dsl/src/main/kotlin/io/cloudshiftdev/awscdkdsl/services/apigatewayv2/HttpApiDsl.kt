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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.CorsPreflightOptions
import software.amazon.awscdk.services.apigatewayv2.DomainMappingOptions
import software.amazon.awscdk.services.apigatewayv2.HttpApi
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import software.constructs.Construct

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
@CdkDslMarker
public class HttpApiDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpApi.Builder = HttpApi.Builder.create(scope, id)

    private val _defaultAuthorizationScopes: MutableList<String> = mutableListOf()

    /**
     * Name for the HTTP API resource.
     *
     * Default: - id of the HttpApi construct.
     *
     * @param apiName Name for the HTTP API resource.
     */
    public fun apiName(apiName: String) {
        cdkBuilder.apiName(apiName)
    }

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     *
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    public fun corsPreflight(corsPreflight: CorsPreflightOptionsDsl.() -> Unit = {}) {
        val builder = CorsPreflightOptionsDsl()
        builder.apply(corsPreflight)
        cdkBuilder.corsPreflight(builder.build())
    }

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     *
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    public fun corsPreflight(corsPreflight: CorsPreflightOptions) {
        cdkBuilder.corsPreflight(corsPreflight)
    }

    /**
     * Whether a default stage and deployment should be automatically created.
     *
     * Default: true
     *
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     *   created.
     */
    public fun createDefaultStage(createDefaultStage: Boolean) {
        cdkBuilder.createDefaultStage(createDefaultStage)
    }

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     *   unless explicitly configured on the route.
     */
    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String) {
        _defaultAuthorizationScopes.addAll(listOf(*defaultAuthorizationScopes))
    }

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     *   unless explicitly configured on the route.
     */
    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: Collection<String>) {
        _defaultAuthorizationScopes.addAll(defaultAuthorizationScopes)
    }

    /**
     * Default Authorizer applied to all routes in the gateway.
     *
     * Default: - no default authorizer
     *
     * @param defaultAuthorizer Default Authorizer applied to all routes in the gateway.
     */
    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
    }

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     *   HTTP API.
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptionsDsl.() -> Unit = {}) {
        val builder = DomainMappingOptionsDsl()
        builder.apply(defaultDomainMapping)
        cdkBuilder.defaultDomainMapping(builder.build())
    }

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     *   HTTP API.
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
        cdkBuilder.defaultDomainMapping(defaultDomainMapping)
    }

    /**
     * An integration that will be configured on the catch-all route ($default).
     *
     * Default: - none
     *
     * @param defaultIntegration An integration that will be configured on the catch-all route
     *   ($default).
     */
    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke your API using the default endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable this if you would like
     * clients to use your custom domain name.
     *
     * Default: false execute-api endpoint enabled.
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     *   default endpoint.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun build(): HttpApi {
        if (_defaultAuthorizationScopes.isNotEmpty())
            cdkBuilder.defaultAuthorizationScopes(_defaultAuthorizationScopes)
        return cdkBuilder.build()
    }
}
