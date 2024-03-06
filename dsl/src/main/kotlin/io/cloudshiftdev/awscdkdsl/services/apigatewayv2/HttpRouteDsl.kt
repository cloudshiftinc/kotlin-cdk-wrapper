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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.HttpRoute
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpRouteKey
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import software.constructs.Construct

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
@CdkDslMarker
public class HttpRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HttpRoute.Builder = HttpRoute.Builder.create(scope, id)

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     *
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     *
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * Authorizer for a WebSocket API or an HTTP API.
     *
     * Default: - No authorizer
     *
     * @param authorizer Authorizer for a WebSocket API or an HTTP API.
     */
    public fun authorizer(authorizer: IHttpRouteAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /**
     * the API the route is associated with.
     *
     * @param httpApi the API the route is associated with.
     */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route.
     */
    public fun integration(integration: HttpRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    /**
     * The key to this route.
     *
     * This is a combination of an HTTP method and an HTTP path.
     *
     * @param routeKey The key to this route.
     */
    public fun routeKey(routeKey: HttpRouteKey) {
        cdkBuilder.routeKey(routeKey)
    }

    public fun build(): HttpRoute {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
