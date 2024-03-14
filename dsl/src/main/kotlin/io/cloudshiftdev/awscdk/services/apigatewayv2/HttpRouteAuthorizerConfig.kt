package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HttpRouteAuthorizerConfig {
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  public fun authorizationType(): String

  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  public interface Builder {
    public fun authorizationScopes(authorizationScopes: List<String>)

    public fun authorizationType(authorizationType: String)

    public fun authorizerId(authorizerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig.builder()

    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig,
  ) : HttpRouteAuthorizerConfig {
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    override fun authorizationType(): String = unwrap(this).getAuthorizationType()

    override fun authorizerId(): String? = unwrap(this).getAuthorizerId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig):
        HttpRouteAuthorizerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteAuthorizerConfig):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig = (wrapped as
        Wrapper).cdkObject
  }
}
