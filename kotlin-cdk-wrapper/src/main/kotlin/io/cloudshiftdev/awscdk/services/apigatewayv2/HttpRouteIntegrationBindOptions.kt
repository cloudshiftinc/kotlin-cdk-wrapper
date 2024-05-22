@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

/**
 * Options to the HttpRouteIntegration during its bind operation.
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
 * HttpRouteIntegrationBindOptions httpRouteIntegrationBindOptions =
 * HttpRouteIntegrationBindOptions.builder()
 * .route(httpRoute)
 * .scope(construct)
 * .build();
 * ```
 */
public interface HttpRouteIntegrationBindOptions {
  /**
   * The route to which this is being bound.
   */
  public fun route(): IHttpRoute

  /**
   * The current scope in which the bind is occurring.
   *
   * If the `HttpRouteIntegration` being bound creates additional constructs,
   * this will be used as their parent scope.
   */
  public fun scope(): Construct

  /**
   * A builder for [HttpRouteIntegrationBindOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param route The route to which this is being bound. 
     */
    public fun route(route: IHttpRoute)

    /**
     * @param scope The current scope in which the bind is occurring. 
     * If the `HttpRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.builder()

    /**
     * @param route The route to which this is being bound. 
     */
    override fun route(route: IHttpRoute) {
      cdkBuilder.route(route.let(IHttpRoute.Companion::unwrap))
    }

    /**
     * @param scope The current scope in which the bind is occurring. 
     * If the `HttpRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions,
  ) : CdkObject(cdkObject), HttpRouteIntegrationBindOptions {
    /**
     * The route to which this is being bound.
     */
    override fun route(): IHttpRoute = unwrap(this).getRoute().let(IHttpRoute::wrap)

    /**
     * The current scope in which the bind is occurring.
     *
     * If the `HttpRouteIntegration` being bound creates additional constructs,
     * this will be used as their parent scope.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteIntegrationBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions):
        HttpRouteIntegrationBindOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HttpRouteIntegrationBindOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegrationBindOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
  }
}
