@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Represents a WebSocket API.
 */
public interface IWebSocketApi : IApi {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketApi):
        IWebSocketApi = CdkObjectWrappers.wrap(cdkObject) as IWebSocketApi

    internal fun unwrap(wrapped: IWebSocketApi):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketApi = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketApi
  }
}
