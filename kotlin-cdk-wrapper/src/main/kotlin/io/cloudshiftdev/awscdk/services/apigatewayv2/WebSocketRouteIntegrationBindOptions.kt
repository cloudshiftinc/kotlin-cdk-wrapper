@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface WebSocketRouteIntegrationBindOptions {
  public fun route(): IWebSocketRoute

  public fun scope(): Construct

  @CdkDslMarker
  public interface Builder {
    public fun route(route: IWebSocketRoute)

    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.builder()

    override fun route(route: IWebSocketRoute) {
      cdkBuilder.route(route.let(IWebSocketRoute::unwrap))
    }

    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions,
  ) : CdkObject(cdkObject), WebSocketRouteIntegrationBindOptions {
    override fun route(): IWebSocketRoute = unwrap(this).getRoute().let(IWebSocketRoute::wrap)

    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        WebSocketRouteIntegrationBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions):
        WebSocketRouteIntegrationBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteIntegrationBindOptions):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
  }
}
