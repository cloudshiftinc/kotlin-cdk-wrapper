package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AddRoutesOptions : BatchHttpRouteOptions {
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  public fun methods(): List<HttpMethod> = unwrap(this).getMethods()?.map(HttpMethod::wrap) ?:
      emptyList()

  public fun path(): String

  public interface Builder {
    public fun authorizationScopes(authorizationScopes: List<String>) {
    }

    public fun authorizer(authorizer: IHttpRouteAuthorizer) {
    }

    public fun integration(integration: HttpRouteIntegration) {
    }

    public fun methods(methods: List<HttpMethod>) {
    }

    public fun path(path: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions.builder()

    public override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    public override fun authorizer(authorizer: IHttpRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    public override fun integration(integration: HttpRouteIntegration) {
      cdkBuilder.integration(integration.let(HttpRouteIntegration::unwrap))
    }

    public override fun methods(methods: List<HttpMethod>) {
      cdkBuilder.methods(methods.map(HttpMethod::unwrap))
    }

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions,
  ) : AddRoutesOptions {
    public override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes()
        ?: emptyList()

    public override fun authorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    public override fun integration(): HttpRouteIntegration =
        unwrap(this).getIntegration().let(HttpRouteIntegration::wrap)

    public override fun methods(): List<HttpMethod> =
        unwrap(this).getMethods()?.map(HttpMethod::wrap) ?: emptyList()

    public override fun path(): String = unwrap(this).getPath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddRoutesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions):
        AddRoutesOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddRoutesOptions):
        software.amazon.awscdk.services.apigatewayv2.AddRoutesOptions = (wrapped as
        Wrapper).cdkObject
  }
}
