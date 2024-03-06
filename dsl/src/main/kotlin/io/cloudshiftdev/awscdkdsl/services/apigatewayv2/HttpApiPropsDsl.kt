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
import software.amazon.awscdk.services.apigatewayv2.HttpApiProps
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer

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
@CdkDslMarker
public class HttpApiPropsDsl {
    private val cdkBuilder: HttpApiProps.Builder = HttpApiProps.builder()

    private val _defaultAuthorizationScopes: MutableList<String> = mutableListOf()

    /** @param apiName Name for the HTTP API resource. */
    public fun apiName(apiName: String) {
        cdkBuilder.apiName(apiName)
    }

    /** @param corsPreflight Specifies a CORS configuration for an API. */
    public fun corsPreflight(corsPreflight: CorsPreflightOptionsDsl.() -> Unit = {}) {
        val builder = CorsPreflightOptionsDsl()
        builder.apply(corsPreflight)
        cdkBuilder.corsPreflight(builder.build())
    }

    /** @param corsPreflight Specifies a CORS configuration for an API. */
    public fun corsPreflight(corsPreflight: CorsPreflightOptions) {
        cdkBuilder.corsPreflight(corsPreflight)
    }

    /**
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     *   created.
     */
    public fun createDefaultStage(createDefaultStage: Boolean) {
        cdkBuilder.createDefaultStage(createDefaultStage)
    }

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     *   unless explicitly configured on the route. The scopes are used with a COGNITO_USER_POOLS
     *   authorizer to authorize the method invocation.
     */
    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String) {
        _defaultAuthorizationScopes.addAll(listOf(*defaultAuthorizationScopes))
    }

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     *   unless explicitly configured on the route. The scopes are used with a COGNITO_USER_POOLS
     *   authorizer to authorize the method invocation.
     */
    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: Collection<String>) {
        _defaultAuthorizationScopes.addAll(defaultAuthorizationScopes)
    }

    /** @param defaultAuthorizer Default Authorizer applied to all routes in the gateway. */
    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
    }

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     *   HTTP API.
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptionsDsl.() -> Unit = {}) {
        val builder = DomainMappingOptionsDsl()
        builder.apply(defaultDomainMapping)
        cdkBuilder.defaultDomainMapping(builder.build())
    }

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     *   HTTP API.
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
        cdkBuilder.defaultDomainMapping(defaultDomainMapping)
    }

    /**
     * @param defaultIntegration An integration that will be configured on the catch-all route
     *   ($default).
     */
    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
        cdkBuilder.defaultIntegration(defaultIntegration)
    }

    /** @param description The description of the API. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     *   default endpoint. By default, clients can invoke your API with the default
     *   `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable this if you would
     *   like clients to use your custom domain name.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
        cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun build(): HttpApiProps {
        if (_defaultAuthorizationScopes.isNotEmpty())
            cdkBuilder.defaultAuthorizationScopes(_defaultAuthorizationScopes)
        return cdkBuilder.build()
    }
}
