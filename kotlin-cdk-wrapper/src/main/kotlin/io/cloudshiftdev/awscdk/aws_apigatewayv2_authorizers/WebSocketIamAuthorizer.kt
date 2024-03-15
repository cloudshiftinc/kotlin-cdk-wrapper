@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import kotlin.Unit
import kotlin.jvm.JvmName

public open class WebSocketIamAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer,
) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
  public override fun bind(_options: WebSocketRouteAuthorizerBindOptions):
      WebSocketRouteAuthorizerConfig =
      unwrap(this).bind(_options.let(WebSocketRouteAuthorizerBindOptions::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public override fun bind(_options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(_options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer):
        WebSocketIamAuthorizer = WebSocketIamAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketIamAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer =
        wrapped.cdkObject
  }
}
