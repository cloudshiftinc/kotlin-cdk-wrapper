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
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.HttpRouteKey
import software.amazon.awscdk.services.apigatewayv2.HttpRouteProps
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer

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
@CdkDslMarker
public class HttpRoutePropsDsl {
    private val cdkBuilder: HttpRouteProps.Builder = HttpRouteProps.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. These
     *   scopes will be merged with the scopes from the attached authorizer
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. These
     *   scopes will be merged with the scopes from the attached authorizer
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /** @param authorizer Authorizer for a WebSocket API or an HTTP API. */
    public fun authorizer(authorizer: IHttpRouteAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /** @param httpApi the API the route is associated with. */
    public fun httpApi(httpApi: IHttpApi) {
        cdkBuilder.httpApi(httpApi)
    }

    /** @param integration The integration to be configured on this route. */
    public fun integration(integration: HttpRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    /**
     * @param routeKey The key to this route. This is a combination of an HTTP method and an HTTP
     *   path.
     */
    public fun routeKey(routeKey: HttpRouteKey) {
        cdkBuilder.routeKey(routeKey)
    }

    public fun build(): HttpRouteProps {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        return cdkBuilder.build()
    }
}
