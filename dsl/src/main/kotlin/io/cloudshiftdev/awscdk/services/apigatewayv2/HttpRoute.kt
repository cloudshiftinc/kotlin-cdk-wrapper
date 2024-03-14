package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRoute,
) : Resource(cdkObject), IHttpRoute {
  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  public override fun grantInvoke(grantee: IGrantable): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  public override fun grantInvoke(grantee: IGrantable, options: GrantInvokeOptions): Grant =
      unwrap(this).grantInvoke(grantee.let(IGrantable::unwrap),
      options.let(GrantInvokeOptions::unwrap)).let(Grant::wrap)

  /**
   * Grant access to invoke the route.
   *
   * This method requires that the authorizer of the route is undefined or is
   * an `HttpIamAuthorizer`.
   *
   * @param grantee 
   * @param options
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("412779fe515aba89b3c88de8dca006d0a8d413686405d41ff168250ac6c8b73c")
  public override fun grantInvoke(grantee: IGrantable,
      options: GrantInvokeOptions.Builder.() -> Unit): Grant = grantInvoke(grantee,
      GrantInvokeOptions(options))

  /**
   * The HTTP API associated with this route.
   */
  public override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

  /**
   * Returns the path component of this HTTP route, `undefined` if the path is the catch-all route.
   */
  public override fun path(): String? = unwrap(this).getPath()

  /**
   * Returns the arn of the route.
   */
  public override fun routeArn(): String = unwrap(this).getRouteArn()

  /**
   * Id of the Route.
   */
  public override fun routeId(): String = unwrap(this).getRouteId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     *
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. 
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     *
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. 
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * Authorizer for a WebSocket API or an HTTP API.
     *
     * Default: - No authorizer
     *
     * @param authorizer Authorizer for a WebSocket API or an HTTP API. 
     */
    public fun authorizer(authorizer: IHttpRouteAuthorizer)

    /**
     * the API the route is associated with.
     *
     * @param httpApi the API the route is associated with. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: HttpRouteIntegration)

    /**
     * The key to this route.
     *
     * This is a combination of an HTTP method and an HTTP path.
     *
     * @param routeKey The key to this route. 
     */
    public fun routeKey(routeKey: HttpRouteKey)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRoute.Builder.create(scope, id)

    /**
     * The list of OIDC scopes to include in the authorization.
     *
     * These scopes will be merged with the scopes from the attached authorizer
     *
     * Default: - no additional authorization scopes
     *
     * @param authorizationScopes The list of OIDC scopes to include in the authorization. 
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
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
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * Authorizer for a WebSocket API or an HTTP API.
     *
     * Default: - No authorizer
     *
     * @param authorizer Authorizer for a WebSocket API or an HTTP API. 
     */
    override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    /**
     * the API the route is associated with.
     *
     * @param httpApi the API the route is associated with. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    /**
     * The key to this route.
     *
     * This is a combination of an HTTP method and an HTTP path.
     *
     * @param routeKey The key to this route. 
     */
    override fun routeKey(routeKey: HttpRouteKey) {
      cdkBuilder.routeKey(routeKey.let(HttpRouteKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRoute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRoute): HttpRoute
        = HttpRoute(cdkObject)

    internal fun unwrap(wrapped: HttpRoute): software.amazon.awscdk.services.apigatewayv2.HttpRoute
        = wrapped.cdkObject
  }
}
