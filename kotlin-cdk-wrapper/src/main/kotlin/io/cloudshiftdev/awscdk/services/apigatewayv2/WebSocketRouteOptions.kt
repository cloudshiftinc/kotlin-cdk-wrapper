@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface WebSocketRouteOptions {
  public fun authorizer(): IWebSocketRouteAuthorizer? =
      unwrap(this).getAuthorizer()?.let(IWebSocketRouteAuthorizer::wrap)

  public fun integration(): WebSocketRouteIntegration

  public fun returnResponse(): Boolean? = unwrap(this).getReturnResponse()

  @CdkDslMarker
  public interface Builder {
    public fun authorizer(authorizer: IWebSocketRouteAuthorizer)

    public fun integration(integration: WebSocketRouteIntegration)

    public fun returnResponse(returnResponse: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions.builder()

    override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer::unwrap))
    }

    override fun integration(integration: WebSocketRouteIntegration) {
      cdkBuilder.integration(integration.let(WebSocketRouteIntegration::unwrap))
    }

    override fun returnResponse(returnResponse: Boolean) {
      cdkBuilder.returnResponse(returnResponse)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteOptions,
  ) : CdkObject(cdkObject), WebSocketRouteOptions {
    override fun authorizer(): IWebSocketRouteAuthorizer? =
        unwrap(this).getAuthorizer()?.let(IWebSocketRouteAuthorizer::wrap)

    override fun integration(): WebSocketRouteIntegration =
        unwrap(this).getIntegration().let(WebSocketRouteIntegration::wrap)

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
