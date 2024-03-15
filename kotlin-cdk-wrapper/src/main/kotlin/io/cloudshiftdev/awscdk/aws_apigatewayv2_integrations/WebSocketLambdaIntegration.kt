@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Lambda WebSocket Integration.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function messageHandler;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
 * .integration(new WebSocketLambdaIntegration("SendMessageIntegration", messageHandler))
 * .build());
 * ```
 */
public open class WebSocketLambdaIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration,
) : WebSocketRouteIntegration(cdkObject) {
  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public override fun bind(options: WebSocketRouteIntegrationBindOptions):
      WebSocketRouteIntegrationConfig =
      unwrap(this).bind(options.let(WebSocketRouteIntegrationBindOptions::unwrap)).let(WebSocketRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a7b031c3048abbe6ba7d40d85e75a2ef504b8009c343d60be7d0e9d137fa9bc")
  public override fun bind(options: WebSocketRouteIntegrationBindOptions.Builder.() -> Unit):
      WebSocketRouteIntegrationConfig = bind(WebSocketRouteIntegrationBindOptions(options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration):
        WebSocketLambdaIntegration = WebSocketLambdaIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration =
        wrapped.cdkObject
  }
}
