@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Explicitly configure no authorizers on specific WebSocket API routes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketNoneAuthorizer webSocketNoneAuthorizer = new WebSocketNoneAuthorizer();
 * ```
 */
public open class WebSocketNoneAuthorizer(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer,
) : CdkObject(cdkObject),
    IWebSocketRouteAuthorizer {
  public constructor() : this(software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer()
  )

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param _options 
   */
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions):
      WebSocketRouteAuthorizerConfig =
      unwrap(this).bind(options.let(WebSocketRouteAuthorizerBindOptions.Companion::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public override fun bind(options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer):
        WebSocketNoneAuthorizer = WebSocketNoneAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketNoneAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer
  }
}
