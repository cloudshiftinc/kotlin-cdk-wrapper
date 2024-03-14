package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IWebSocketRouteAuthorizer {
  public fun bind(arg0: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public fun bind(arg0: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer,
  ) : IWebSocketRouteAuthorizer {
    override fun bind(arg0: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig =
        unwrap(this).bind(arg0.let(WebSocketRouteAuthorizerBindOptions::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
    override fun bind(arg0: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
        WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(arg0))
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer):
        IWebSocketRouteAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketRouteAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer = (wrapped as
        Wrapper).cdkObject
  }
}
