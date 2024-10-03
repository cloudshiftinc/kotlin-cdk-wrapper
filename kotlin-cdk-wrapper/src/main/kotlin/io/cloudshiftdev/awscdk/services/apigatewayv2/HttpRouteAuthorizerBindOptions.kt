@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

/**
 * Input to the bind() operation, that binds an authorizer to a route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import software.constructs.*;
 * Construct construct;
 * HttpRoute httpRoute;
 * HttpRouteAuthorizerBindOptions httpRouteAuthorizerBindOptions =
 * HttpRouteAuthorizerBindOptions.builder()
 * .route(httpRoute)
 * .scope(construct)
 * .build();
 * ```
 */
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
      cdkBuilder.route(route.let(IHttpRoute.Companion::unwrap))
    }

    /**
     * @param scope The scope for any constructs created as part of the bind. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions,
  ) : CdkObject(cdkObject),
      HttpRouteAuthorizerBindOptions {
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
        HttpRouteAuthorizerBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HttpRouteAuthorizerBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteAuthorizerBindOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
  }
}
