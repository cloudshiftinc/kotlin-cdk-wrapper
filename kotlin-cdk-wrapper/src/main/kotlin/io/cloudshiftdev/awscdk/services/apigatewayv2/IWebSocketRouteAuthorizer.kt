@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IWebSocketRouteAuthorizer {
  public fun bind(arg0: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public fun bind(arg0: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer,
  ) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
    override fun bind(arg0: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig =
        unwrap(this).bind(arg0.let(WebSocketRouteAuthorizerBindOptions::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
    override fun bind(arg0: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
        WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(arg0))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer):
        IWebSocketRouteAuthorizer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketRouteAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
  }
}
