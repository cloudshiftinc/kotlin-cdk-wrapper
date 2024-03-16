@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents the WebSocketStage.
 */
public interface IWebSocketStage : IStage {
  /**
   * The API this stage is associated to.
   */
  public fun api(): IWebSocketApi

  /**
   * The callback URL to this stage.
   *
   * You can use the callback URL to send messages to the client from the backend system.
   * https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-basic-concept.html
   * https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html
   */
  public fun callbackUrl(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.IWebSocketStage):
        IWebSocketStage = CdkObjectWrappers.wrap(cdkObject) as IWebSocketStage

    internal fun unwrap(wrapped: IWebSocketStage):
        software.amazon.awscdk.services.apigatewayv2.IWebSocketStage = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.IWebSocketStage
  }
}
