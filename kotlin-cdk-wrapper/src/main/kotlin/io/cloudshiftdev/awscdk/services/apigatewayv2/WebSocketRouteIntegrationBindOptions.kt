@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

/**
 * Options to the WebSocketRouteIntegration during its bind operation.
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
 * WebSocketRouteIntegrationBindOptions webSocketRouteIntegrationBindOptions =
 * WebSocketRouteIntegrationBindOptions.builder()
 * .route(webSocketRoute)
 * .scope(construct)
 * .build();
 * ```
 */
public interface WebSocketRouteIntegrationBindOptions {
  /**
   * The route to which this is being bound.
   */
  public fun route(): IWebSocketRoute

  /**
   * The current scope in which the bind is occurring.
   *
   * If the `WebSocketRouteIntegration` being bound creates additional constructs,
   * this will be used as their parent scope.
   */
  public fun scope(): Construct

  /**
   * A builder for [WebSocketRouteIntegrationBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param route The route to which this is being bound. 
     */
    public fun route(route: IWebSocketRoute)

    /**
     * @param scope The current scope in which the bind is occurring. 
     * If the `WebSocketRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions.builder()

    /**
     * @param route The route to which this is being bound. 
     */
    override fun route(route: IWebSocketRoute) {
      cdkBuilder.route(route.let(IWebSocketRoute::unwrap))
    }

    /**
     * @param scope The current scope in which the bind is occurring. 
     * If the `WebSocketRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
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
    /**
     * The route to which this is being bound.
     */
    override fun route(): IWebSocketRoute = unwrap(this).getRoute().let(IWebSocketRoute::wrap)

    /**
     * The current scope in which the bind is occurring.
     *
     * If the `WebSocketRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
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
        WebSocketRouteIntegrationBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketRouteIntegrationBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteIntegrationBindOptions):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
  }
}
