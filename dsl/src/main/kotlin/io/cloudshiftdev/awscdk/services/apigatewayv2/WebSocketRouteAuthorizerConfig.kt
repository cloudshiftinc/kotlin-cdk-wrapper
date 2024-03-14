package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface WebSocketRouteAuthorizerConfig {
  public fun authorizationType(): String

  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  public interface Builder {
    public fun authorizationType(authorizationType: String) {
    }

    public fun authorizerId(authorizerId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig.builder()

    public override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    public override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig,
  ) : WebSocketRouteAuthorizerConfig {
    public override fun authorizationType(): String = unwrap(this).getAuthorizationType()

    public override fun authorizerId(): String? = unwrap(this).getAuthorizerId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig):
        WebSocketRouteAuthorizerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteAuthorizerConfig):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig = (wrapped as
        Wrapper).cdkObject
  }
}
