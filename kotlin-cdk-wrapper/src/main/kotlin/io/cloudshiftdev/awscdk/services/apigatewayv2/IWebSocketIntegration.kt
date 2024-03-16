@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents an Integration for an WebSocket API.
 */
public interface IWebSocketIntegration : IIntegration {
  /**
   * The WebSocket API associated with this integration.
   */
  public fun webSocketApi(): IWebSocketApi

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration):
        IWebSocketIntegration = CdkObjectWrappers.wrap(cdkObject) as IWebSocketIntegration

    internal fun unwrap(wrapped: IWebSocketIntegration):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketIntegration
  }
}
