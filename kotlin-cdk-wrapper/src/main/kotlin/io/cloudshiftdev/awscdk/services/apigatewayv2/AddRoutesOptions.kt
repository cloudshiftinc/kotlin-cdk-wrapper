@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the Route with Integration resource.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
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
public interface AddRoutesOptions : BatchHttpRouteOptions {
  /**
   * The list of OIDC scopes to include in the authorization.
   *
   * These scopes will override the default authorization scopes on the gateway.
   * Set to [] to remove default scopes
   *
   * Default: - uses defaultAuthorizationScopes if configured on the API, otherwise none.
   */
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * Authorizer to be associated to these routes.
   *
   * Use NoneAuthorizer to remove the default authorizer for the api
   *
   * Default: - uses the default authorizer if one is specified on the HttpApi
   */
  public fun authorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  /**
   * The HTTP methods to be configured.
   *
   * Default: HttpMethod.ANY
   */
  public fun methods(): List<HttpMethod> = unwrap(this).getMethods()?.map(HttpMethod::wrap) ?:
      emptyList()

  /**
   * The path at which all of these routes are configured.
   */
  public fun path(): String

  /**
   * A builder for [AddRoutesOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will override the default authorization scopes on the gateway.
     * Set to [] to remove default scopes
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will override the default authorization scopes on the gateway.
     * Set to [] to remove default scopes
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * @param authorizer Authorizer to be associated to these routes.
     * Use NoneAuthorizer to remove the default authorizer for the api
     */
    public fun authorizer(authorizer: IHttpRouteAuthorizer)

    /**
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: HttpRouteIntegration)

    /**
     * @param methods The HTTP methods to be configured.
     */
    public fun methods(methods: List<HttpMethod>)

    /**
     * @param methods The HTTP methods to be configured.
     */
    public fun methods(vararg methods: HttpMethod)

    /**
     * @param path The path at which all of these routes are configured. 
     */
    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions.builder()

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will override the default authorization scopes on the gateway.
     * Set to [] to remove default scopes
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will override the default authorization scopes on the gateway.
     * Set to [] to remove default scopes
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * @param authorizer Authorizer to be associated to these routes.
     * Use NoneAuthorizer to remove the default authorizer for the api
     */
    override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    /**
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    /**
     * @param methods The HTTP methods to be configured.
     */
    override fun methods(methods: List<HttpMethod>) {
      cdkBuilder.methods(methods.map(HttpMethod::unwrap))
    }

    /**
     * @param methods The HTTP methods to be configured.
     */
    override fun methods(vararg methods: HttpMethod): Unit = methods(methods.toList())

    /**
     * @param path The path at which all of these routes are configured. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions,
  ) : CdkObject(cdkObject), AddRoutesOptions {
    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will override the default authorization scopes on the gateway.
     * Set to [] to remove default scopes
     *
     * Default: - uses defaultAuthorizationScopes if configured on the API, otherwise none.
     */
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * Authorizer to be associated to these routes.
     *
     * Use NoneAuthorizer to remove the default authorizer for the api
     *
     * Default: - uses the default authorizer if one is specified on the HttpApi
     */
    override fun authorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    /**
     * The integration to be configured on this route.
     */
    override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)

    /**
     * The HTTP methods to be configured.
     *
     * Default: HttpMethod.ANY
     */
    override fun methods(): List<HttpMethod> = unwrap(this).getMethods()?.map(HttpMethod::wrap) ?:
        emptyList()

    /**
     * The path at which all of these routes are configured.
     */
    override fun path(): String = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddRoutesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions):
        AddRoutesOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddRoutesOptions):
        software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions
  }
}
