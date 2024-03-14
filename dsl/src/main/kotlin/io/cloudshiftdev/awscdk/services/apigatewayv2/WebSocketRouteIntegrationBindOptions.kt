package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface WebSocketRouteIntegrationBindOptions {
  public fun route(): IWebSocketRoute

  public fun scope(): Construct

  public interface Builder {
    public fun route(route: IWebSocketRoute) {
    }

    public fun scope(scope: Construct) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.builder()

    public override fun route(route: IWebSocketRoute) {
      cdkBuilder.route(route.let(IWebSocketRoute::unwrap))
    }

    public override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions,
  ) : WebSocketRouteIntegrationBindOptions {
    public override fun route(): IWebSocketRoute =
        unwrap(this).getRoute().let(IWebSocketRoute::wrap)

    public override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    init {

    }

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
        as Wrapper).cdkObject
  }
}
