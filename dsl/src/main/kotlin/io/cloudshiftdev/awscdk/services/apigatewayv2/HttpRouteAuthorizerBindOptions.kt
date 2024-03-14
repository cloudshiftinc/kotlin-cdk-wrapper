package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface HttpRouteAuthorizerBindOptions {
  public fun route(): IHttpRoute

  public fun scope(): Construct

  public interface Builder {
    public fun route(route: IHttpRoute) {
    }

    public fun scope(scope: Construct) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions.builder()

    public override fun route(route: IHttpRoute) {
      cdkBuilder.route(route.let(IHttpRoute::unwrap))
    }

    public override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions,
  ) : HttpRouteAuthorizerBindOptions {
    public override fun route(): IHttpRoute = unwrap(this).getRoute().let(IHttpRoute::wrap)

    public override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteAuthorizerBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions):
        HttpRouteAuthorizerBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteAuthorizerBindOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
