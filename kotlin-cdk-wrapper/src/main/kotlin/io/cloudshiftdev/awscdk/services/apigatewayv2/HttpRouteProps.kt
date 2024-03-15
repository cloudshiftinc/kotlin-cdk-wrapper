@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpRouteProps : BatchHttpRouteOptions {
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  public fun httpApi(): IHttpApi

  public fun routeKey(): HttpRouteKey

  @CdkDslMarker
  public interface Builder {
    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationScopes(vararg authorizationScopes: String)

    public fun authorizer(authorizer: IHttpRouteAuthorizer)

    public fun httpApi(httpApi: IHttpApi)

    public fun integration(integration: HttpRouteIntegration)

    public fun routeKey(routeKey: HttpRouteKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteProps.builder()

    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    override fun routeKey(routeKey: HttpRouteKey) {
      cdkBuilder.routeKey(routeKey.let(HttpRouteKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps,
  ) : CdkObject(cdkObject), HttpRouteProps {
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    override fun authorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)

    override fun routeKey(): HttpRouteKey = unwrap(this).getRouteKey().let(HttpRouteKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteProps):
        HttpRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteProps):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpRouteProps
  }
}
