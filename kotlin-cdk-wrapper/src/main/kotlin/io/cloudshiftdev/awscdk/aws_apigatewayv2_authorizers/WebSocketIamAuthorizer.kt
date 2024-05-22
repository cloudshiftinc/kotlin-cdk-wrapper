@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.IWebSocketRouteAuthorizer
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerConfig
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Authorize WebSocket API Routes with IAM.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * // This function handles your connect route
 * Function connectHandler;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "WebSocketApi");
 * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
 * .integration(new WebSocketLambdaIntegration("Integration", connectHandler))
 * .authorizer(new WebSocketIamAuthorizer())
 * .build());
 * // Create an IAM user (identity)
 * User user = new User(this, "User");
 * String webSocketArn = Stack.of(this).formatArn(ArnComponents.builder()
 * .service("execute-api")
 * .resource(webSocketApi.getApiId())
 * .build());
 * // Grant access to the IAM user
 * user.attachInlinePolicy(Policy.Builder.create(this, "AllowInvoke")
 * .statements(List.of(
 * PolicyStatement.Builder.create()
 * .actions(List.of("execute-api:Invoke"))
 * .effect(Effect.ALLOW)
 * .resources(List.of(webSocketArn))
 * .build()))
 * .build());
 * ```
 */
public open class WebSocketIamAuthorizer(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer,
) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
  public constructor() :
      this(software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer()
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
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer):
        WebSocketIamAuthorizer = WebSocketIamAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketIamAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketIamAuthorizer
  }
}
