@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize a new Route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
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
public interface HttpRouteProps : BatchHttpRouteOptions {
  /**
   * The list of OIDC scopes to include in the authorization.
   *
   * These scopes will be merged with the scopes from the attached authorizer
   *
   * Default: - no additional authorization scopes
   */
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * Authorizer for a WebSocket API or an HTTP API.
   *
   * Default: - No authorizer
   */
  public fun authorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  /**
   * the API the route is associated with.
   */
  public fun httpApi(): IHttpApi

  /**
   * The key to this route.
   *
   * This is a combination of an HTTP method and an HTTP path.
   */
  public fun routeKey(): HttpRouteKey

  /**
   * A builder for [HttpRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will be merged with the scopes from the attached authorizer
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will be merged with the scopes from the attached authorizer
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * @param authorizer Authorizer for a WebSocket API or an HTTP API.
     */
    public fun authorizer(authorizer: IHttpRouteAuthorizer)

    /**
     * @param httpApi the API the route is associated with. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: HttpRouteIntegration)

    /**
     * @param routeKey The key to this route. 
     * This is a combination of an HTTP method and an HTTP path.
     */
    public fun routeKey(routeKey: HttpRouteKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteProps.builder()

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will be merged with the scopes from the attached authorizer
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * @param authorizationScopes The list of OIDC scopes to include in the authorization.
     * These scopes will be merged with the scopes from the attached authorizer
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * @param authorizer Authorizer for a WebSocket API or an HTTP API.
     */
    override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    /**
     * @param httpApi the API the route is associated with. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    /**
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    /**
     * @param routeKey The key to this route. 
     * This is a combination of an HTTP method and an HTTP path.
     */
    override fun routeKey(routeKey: HttpRouteKey) {
      cdkBuilder.routeKey(routeKey.let(HttpRouteKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps,
  ) : CdkObject(cdkObject), HttpRouteProps {
    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     */
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * Authorizer for a WebSocket API or an HTTP API.
     *
     * Default: - No authorizer
     */
    override fun authorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    /**
     * the API the route is associated with.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    /**
     * The integration to be configured on this route.
     */
    override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)

    /**
     * The key to this route.
     *
     * This is a combination of an HTTP method and an HTTP path.
     */
    override fun routeKey(): HttpRouteKey = unwrap(this).getRouteKey().let(HttpRouteKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps):
        HttpRouteProps = CdkObjectWrappers.wrap(cdkObject) as? HttpRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteProps):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpRouteProps
  }
}
