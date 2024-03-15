@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface WebSocketRouteProps : WebSocketRouteOptions {
  public fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

  public fun routeKey(): String

  public fun webSocketApi(): IWebSocketApi

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    public fun authorizer(authorizer: IWebSocketRouteAuthorizer)

    public fun integration(integration: WebSocketRouteIntegration)

    public fun returnResponse(returnResponse: Boolean)

    public fun routeKey(routeKey: String)

    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps.builder()

    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer::unwrap))
    }

    override fun integration(integration: WebSocketRouteIntegration) {
      cdkBuilder.integration(integration.let(WebSocketRouteIntegration::unwrap))
    }

    override fun returnResponse(returnResponse: Boolean) {
      cdkBuilder.returnResponse(returnResponse)
    }

    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps,
  ) : CdkObject(cdkObject), WebSocketRouteProps {
    override fun apiKeyRequired(): Boolean? = unwrap(this).getApiKeyRequired()

    override fun authorizer(): IWebSocketRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IWebSocketRouteAuthorizer::wrap)

    override fun integration(): WebSocketRouteIntegration =
        unwrap(this).getIntegration().let(WebSocketRouteIntegration::wrap)

    override fun returnResponse(): Boolean? = unwrap(this).getReturnResponse()

    override fun routeKey(): String = unwrap(this).getRouteKey()

    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps):
        WebSocketRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketRouteProps
  }
}
