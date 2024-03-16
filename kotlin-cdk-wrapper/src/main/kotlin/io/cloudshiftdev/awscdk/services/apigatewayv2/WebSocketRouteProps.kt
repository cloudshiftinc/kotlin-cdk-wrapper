@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties to initialize a new Route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * IWebSocketRouteAuthorizer webSocketRouteAuthorizer;
 * WebSocketRouteIntegration webSocketRouteIntegration;
 * WebSocketRouteProps webSocketRouteProps = WebSocketRouteProps.builder()
 * .integration(webSocketRouteIntegration)
 * .routeKey("routeKey")
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizer(webSocketRouteAuthorizer)
 * .returnResponse(false)
 * .build();
 * ```
 */
public interface WebSocketRouteProps : WebSocketRouteOptions {
  /**
   * Whether the route requires an API Key to be provided.
   *
   * Default: false
   */
  public fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

  /**
   * The key to this route.
   */
  public fun routeKey(): String

  /**
   * The API the route is associated with.
   */
  public fun webSocketApi(): IWebSocketApi

  /**
   * A builder for [WebSocketRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyRequired Whether the route requires an API Key to be provided.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

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

    /**
     * @param routeKey The key to this route. 
     */
    public fun routeKey(routeKey: String)

    /**
     * @param webSocketApi The API the route is associated with. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps.builder()

    /**
     * @param apiKeyRequired Whether the route requires an API Key to be provided.
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

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

    /**
     * @param routeKey The key to this route. 
     */
    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    /**
     * @param webSocketApi The API the route is associated with. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps,
  ) : CdkObject(cdkObject), WebSocketRouteProps {
    /**
     * Whether the route requires an API Key to be provided.
     *
     * Default: false
     */
    override fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

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

    /**
     * The key to this route.
     */
    override fun routeKey(): String = unwrap(this).getRouteKey()

    /**
     * The API the route is associated with.
     */
    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps):
        WebSocketRouteProps = CdkObjectWrappers.wrap(cdkObject) as WebSocketRouteProps

    internal fun unwrap(wrapped: WebSocketRouteProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps
  }
}
