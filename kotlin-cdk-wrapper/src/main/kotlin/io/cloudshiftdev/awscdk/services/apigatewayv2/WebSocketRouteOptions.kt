@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Options used to add route to the API.
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
public interface WebSocketRouteOptions {
  /**
   * The authorize to this route.
   *
   * You can only set authorizer to a $connect route.
   *
   * Default: - No Authorizer
   */
  public fun authorizer(): IWebSocketRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IWebSocketRouteAuthorizer::wrap)

  /**
   * The integration to be configured on this route.
   */
  public fun integration(): WebSocketRouteIntegration

  /**
   * Should the route send a response to the client.
   *
   * Default: false
   */
  public fun returnResponse(): Boolean? = unwrap(this).getReturnResponse()

  /**
   * A builder for [WebSocketRouteOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizer The authorize to this route.
     * You can only set authorizer to a $connect route.
     */
    public fun authorizer(authorizer: IWebSocketRouteAuthorizer)

    /**
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: WebSocketRouteIntegration)

    /**
     * @param returnResponse Should the route send a response to the client.
     */
    public fun returnResponse(returnResponse: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions.builder()

    /**
     * @param authorizer The authorize to this route.
     * You can only set authorizer to a $connect route.
     */
    override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer::unwrap))
    }

    /**
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: WebSocketRouteIntegration) {
      cdkBuilder.integration(integration.let(WebSocketRouteIntegration::unwrap))
    }

    /**
     * @param returnResponse Should the route send a response to the client.
     */
    override fun returnResponse(returnResponse: Boolean) {
      cdkBuilder.returnResponse(returnResponse)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions,
  ) : CdkObject(cdkObject), WebSocketRouteOptions {
    /**
     * The authorize to this route.
     *
     * You can only set authorizer to a $connect route.
     *
     * Default: - No Authorizer
     */
    override fun authorizer(): IWebSocketRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IWebSocketRouteAuthorizer::wrap)

    /**
     * The integration to be configured on this route.
     */
    override fun integration(): WebSocketRouteIntegration =
        unwrap(this).getIntegration().let(WebSocketRouteIntegration::wrap)

    /**
     * Should the route send a response to the client.
     *
     * Default: false
     */
    override fun returnResponse(): Boolean? = unwrap(this).getReturnResponse()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions):
        WebSocketRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteOptions):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions
  }
}
