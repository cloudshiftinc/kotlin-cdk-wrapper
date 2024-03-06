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
import software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions
import software.amazon.awscdk.services.apigatewayv2.HttpMethod
import software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegration
import software.amazon.awscdk.services.apigatewayv2.IHttpRouteAuthorizer

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
 * HttpLambdaIntegration bookStoreDefaultIntegration = new HttpLambdaIntegration("BooksIntegration",
 * bookStoreDefaultFn);
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
@CdkDslMarker
public class AddRoutesOptionsDsl {
    private val cdkBuilder: AddRoutesOptions.Builder = AddRoutesOptions.builder()

    private val _authorizationScopes: MutableList<String> = mutableListOf()

    private val _methods: MutableList<HttpMethod> = mutableListOf()

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. These
     *   scopes will override the default authorization scopes on the gateway. Set to [] to remove
     *   default scopes
     */
    public fun authorizationScopes(vararg authorizationScopes: String) {
        _authorizationScopes.addAll(listOf(*authorizationScopes))
    }

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. These
     *   scopes will override the default authorization scopes on the gateway. Set to [] to remove
     *   default scopes
     */
    public fun authorizationScopes(authorizationScopes: Collection<String>) {
        _authorizationScopes.addAll(authorizationScopes)
    }

    /**
     * @param authorizer Authorizer to be associated to these routes. Use NoneAuthorizer to remove
     *   the default authorizer for the api
     */
    public fun authorizer(authorizer: IHttpRouteAuthorizer) {
        cdkBuilder.authorizer(authorizer)
    }

    /** @param integration The integration to be configured on this route. */
    public fun integration(integration: HttpRouteIntegration) {
        cdkBuilder.integration(integration)
    }

    /** @param methods The HTTP methods to be configured. */
    public fun methods(vararg methods: HttpMethod) {
        _methods.addAll(listOf(*methods))
    }

    /** @param methods The HTTP methods to be configured. */
    public fun methods(methods: Collection<HttpMethod>) {
        _methods.addAll(methods)
    }

    /** @param path The path at which all of these routes are configured. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): AddRoutesOptions {
        if (_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
        if (_methods.isNotEmpty()) cdkBuilder.methods(_methods)
        return cdkBuilder.build()
    }
}
