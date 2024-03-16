@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a Route for an WebSocket API.
 */
public interface IWebSocketRoute : IRoute {
  /**
   * The key to this route.
   */
  public fun routeKey(): String

  /**
   * The WebSocket API associated with this route.
   */
  public fun webSocketApi(): IWebSocketApi

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute):
        IWebSocketRoute = CdkObjectWrappers.wrap(cdkObject) as IWebSocketRoute

    internal fun unwrap(wrapped: IWebSocketRoute):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketRoute
  }
}
