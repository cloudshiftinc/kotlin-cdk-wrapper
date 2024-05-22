@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Route class that creates the Route for API Gateway WebSocket API.
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
 * WebSocketRoute webSocketRoute = WebSocketRoute.Builder.create(this, "MyWebSocketRoute")
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
public open class WebSocketRoute(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute,
) : Resource(cdkObject), IWebSocketRoute {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketRouteProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketRoute(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WebSocketRouteProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketRouteProps.Builder.() -> Unit,
  ) : this(scope, id, WebSocketRouteProps(props)
  )

  /**
   * Integration response ID.
   */
  public open fun integrationResponseId(): String? = unwrap(this).getIntegrationResponseId()

  /**
   * Id of the Route.
   */
  public override fun routeId(): String = unwrap(this).getRouteId()

  /**
   * The key to this route.
   */
  public override fun routeKey(): String = unwrap(this).getRouteKey()

  /**
   * The WebSocket API associated with this route.
   */
  public override fun webSocketApi(): IWebSocketApi =
      unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether the route requires an API Key to be provided.
     *
     * Default: false
     *
     * @param apiKeyRequired Whether the route requires an API Key to be provided. 
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * The authorize to this route.
     *
     * You can only set authorizer to a $connect route.
     *
     * Default: - No Authorizer
     *
     * @param authorizer The authorize to this route. 
     */
    public fun authorizer(authorizer: IWebSocketRouteAuthorizer)

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route. 
     */
    public fun integration(integration: WebSocketRouteIntegration)

    /**
     * Should the route send a response to the client.
     *
     * Default: false
     *
     * @param returnResponse Should the route send a response to the client. 
     */
    public fun returnResponse(returnResponse: Boolean)

    /**
     * The key to this route.
     *
     * @param routeKey The key to this route. 
     */
    public fun routeKey(routeKey: String)

    /**
     * The API the route is associated with.
     *
     * @param webSocketApi The API the route is associated with. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder.create(scope, id)

    /**
     * Whether the route requires an API Key to be provided.
     *
     * Default: false
     *
     * @param apiKeyRequired Whether the route requires an API Key to be provided. 
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * The authorize to this route.
     *
     * You can only set authorizer to a $connect route.
     *
     * Default: - No Authorizer
     *
     * @param authorizer The authorize to this route. 
     */
    override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer.Companion::unwrap))
    }

    /**
     * The integration to be configured on this route.
     *
     * @param integration The integration to be configured on this route. 
     */
    override fun integration(integration: WebSocketRouteIntegration) {
      cdkBuilder.integration(integration.let(WebSocketRouteIntegration.Companion::unwrap))
    }

    /**
     * Should the route send a response to the client.
     *
     * Default: false
     *
     * @param returnResponse Should the route send a response to the client. 
     */
    override fun returnResponse(returnResponse: Boolean) {
      cdkBuilder.returnResponse(returnResponse)
    }

    /**
     * The key to this route.
     *
     * @param routeKey The key to this route. 
     */
    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    /**
     * The API the route is associated with.
     *
     * @param webSocketApi The API the route is associated with. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRoute =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute):
        WebSocketRoute = WebSocketRoute(cdkObject)

    internal fun unwrap(wrapped: WebSocketRoute):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRoute = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRoute
  }
}
