@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Mock WebSocket Integration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.*;
 * WebSocketMockIntegration webSocketMockIntegration = new WebSocketMockIntegration("id");
 * ```
 */
public open class WebSocketMockIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration,
) : WebSocketRouteIntegration(cdkObject) {
  public constructor(id: String) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration(id)
  )

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
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration):
        WebSocketMockIntegration = WebSocketMockIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketMockIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration
  }
}
