package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface HttpRouteAuthorizerBindOptions {
  /**
   * The route to which the authorizer is being bound.
   */
  public fun route(): IHttpRoute

  /**
   * The scope for any constructs created as part of the bind.
   */
  public fun scope(): Construct

  /**
   * A builder for [HttpRouteAuthorizerBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param route The route to which the authorizer is being bound. 
     */
    public fun route(route: IHttpRoute)

    /**
     * @param scope The scope for any constructs created as part of the bind. 
     */
    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions.builder()

    /**
     * @param route The route to which the authorizer is being bound. 
     */
    override fun route(route: IHttpRoute) {
      cdkBuilder.route(route.let(IHttpRoute::unwrap))
    }

    /**
     * @param scope The scope for any constructs created as part of the bind. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions,
  ) : CdkObject(cdkObject), HttpRouteAuthorizerBindOptions {
    /**
     * The route to which the authorizer is being bound.
     */
    override fun route(): IHttpRoute = unwrap(this).getRoute().let(IHttpRoute::wrap)

    /**
     * The scope for any constructs created as part of the bind.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteAuthorizerBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions):
        HttpRouteAuthorizerBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteAuthorizerBindOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
  }
}
