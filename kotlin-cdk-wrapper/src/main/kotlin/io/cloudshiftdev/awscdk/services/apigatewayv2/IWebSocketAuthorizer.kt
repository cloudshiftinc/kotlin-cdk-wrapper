@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An authorizer for WebSocket APIs.
 */
public interface IWebSocketAuthorizer : IAuthorizer {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketAuthorizer):
        IWebSocketAuthorizer = CdkObjectWrappers.wrap(cdkObject) as IWebSocketAuthorizer

    internal fun unwrap(wrapped: IWebSocketAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketAuthorizer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketAuthorizer
  }
}
