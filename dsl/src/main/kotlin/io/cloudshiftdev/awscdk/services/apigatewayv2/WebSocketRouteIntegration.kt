package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class WebSocketRouteIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration,
) {
  public open fun bind(arg0: WebSocketRouteIntegrationBindOptions): WebSocketRouteIntegrationConfig
      =
      unwrap(this).bind(arg0.let(WebSocketRouteIntegrationBindOptions::unwrap)).let(WebSocketRouteIntegrationConfig::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a7b031c3048abbe6ba7d40d85e75a2ef504b8009c343d60be7d0e9d137fa9bc")
  public open fun bind(arg0: WebSocketRouteIntegrationBindOptions.Builder.() -> Unit):
      WebSocketRouteIntegrationConfig = bind(WebSocketRouteIntegrationBindOptions(arg0))

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration,
  ) : WebSocketRouteIntegration(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration):
        WebSocketRouteIntegration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteIntegration):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegration = (wrapped as
        Wrapper).cdkObject
  }
}
