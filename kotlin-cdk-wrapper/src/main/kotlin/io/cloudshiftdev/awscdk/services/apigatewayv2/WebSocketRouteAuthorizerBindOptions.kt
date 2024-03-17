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
 * WebSocketRoute webSocketRoute;
 * WebSocketRouteAuthorizerBindOptions webSocketRouteAuthorizerBindOptions =
 * WebSocketRouteAuthorizerBindOptions.builder()
 * .route(webSocketRoute)
 * .scope(construct)
 * .build();
 * ```
 */
public interface WebSocketRouteAuthorizerBindOptions {
  /**
   * The route to which the authorizer is being bound.
   */
  public fun route(): IWebSocketRoute

  /**
   * The scope for any constructs created as part of the bind.
   */
  public fun scope(): Construct

  /**
   * A builder for [WebSocketRouteAuthorizerBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param route The route to which the authorizer is being bound. 
     */
    public fun route(route: IWebSocketRoute)

    /**
     * @param scope The scope for any constructs created as part of the bind. 
     */
    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions.builder()

    /**
     * @param route The route to which the authorizer is being bound. 
     */
    override fun route(route: IWebSocketRoute) {
      cdkBuilder.route(route.let(IWebSocketRoute::unwrap))
    }

    /**
     * @param scope The scope for any constructs created as part of the bind. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions,
  ) : CdkObject(cdkObject), WebSocketRouteAuthorizerBindOptions {
    /**
     * The route to which the authorizer is being bound.
     */
    override fun route(): IWebSocketRoute = unwrap(this).getRoute().let(IWebSocketRoute::wrap)

    /**
     * The scope for any constructs created as part of the bind.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        WebSocketRouteAuthorizerBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions):
        WebSocketRouteAuthorizerBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketRouteAuthorizerBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteAuthorizerBindOptions):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteAuthorizerBindOptions
  }
}
