@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An authorizer that can attach to an WebSocket Route.
 */
public interface IWebSocketRouteAuthorizer {
  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param options 
   */
  public fun bind(options: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public fun bind(options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer,
  ) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
    /**
     * Bind this authorizer to a specified WebSocket route.
     *
     * @param options 
     */
    override fun bind(options: WebSocketRouteAuthorizerBindOptions): WebSocketRouteAuthorizerConfig
        =
        unwrap(this).bind(options.let(WebSocketRouteAuthorizerBindOptions.Companion::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

    /**
     * Bind this authorizer to a specified WebSocket route.
     *
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
    override fun bind(options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
        WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(options))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer):
        IWebSocketRouteAuthorizer = CdkObjectWrappers.wrap(cdkObject) as? IWebSocketRouteAuthorizer
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IWebSocketRouteAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
  }
}
