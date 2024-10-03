@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties specific for HTTP Based GatewayRoutes.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-http-2", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.http(HttpGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(HttpGatewayRouteMatch.builder()
 * // This rewrites the path from '/test' to '/rewrittenPath'.
 * .path(HttpGatewayRoutePathMatch.exactly("/test", "/rewrittenPath"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public interface HttpGatewayRouteSpecOptions : CommonGatewayRouteSpecOptions {
  /**
   * The criterion for determining a request match for this GatewayRoute.
   *
   * When path match is defined, this may optionally determine the path rewrite configuration.
   *
   * Default: - matches any path and automatically rewrites the path to '/'
   */
  public fun match(): HttpGatewayRouteMatch? =
      unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

  /**
   * The VirtualService this GatewayRoute directs traffic to.
   */
  public fun routeTarget(): IVirtualService

  /**
   * A builder for [HttpGatewayRouteSpecOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param match The criterion for determining a request match for this GatewayRoute.
     * When path match is defined, this may optionally determine the path rewrite configuration.
     */
    public fun match(match: HttpGatewayRouteMatch)

    /**
     * @param match The criterion for determining a request match for this GatewayRoute.
     * When path match is defined, this may optionally determine the path rewrite configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    public fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit)

    /**
     * @param priority The priority for the gateway route.
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     */
    public fun priority(priority: Number)

    /**
     * @param routeTarget The VirtualService this GatewayRoute directs traffic to. 
     */
    public fun routeTarget(routeTarget: IVirtualService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.builder()

    /**
     * @param match The criterion for determining a request match for this GatewayRoute.
     * When path match is defined, this may optionally determine the path rewrite configuration.
     */
    override fun match(match: HttpGatewayRouteMatch) {
      cdkBuilder.match(match.let(HttpGatewayRouteMatch.Companion::unwrap))
    }

    /**
     * @param match The criterion for determining a request match for this GatewayRoute.
     * When path match is defined, this may optionally determine the path rewrite configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5de161a09ed98413915fa38ce6d6951ffd9f0e0bb9393542cdd7752003239f5f")
    override fun match(match: HttpGatewayRouteMatch.Builder.() -> Unit): Unit =
        match(HttpGatewayRouteMatch(match))

    /**
     * @param priority The priority for the gateway route.
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param routeTarget The VirtualService this GatewayRoute directs traffic to. 
     */
    override fun routeTarget(routeTarget: IVirtualService) {
      cdkBuilder.routeTarget(routeTarget.let(IVirtualService.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions,
  ) : CdkObject(cdkObject),
      HttpGatewayRouteSpecOptions {
    /**
     * The criterion for determining a request match for this GatewayRoute.
     *
     * When path match is defined, this may optionally determine the path rewrite configuration.
     *
     * Default: - matches any path and automatically rewrites the path to '/'
     */
    override fun match(): HttpGatewayRouteMatch? =
        unwrap(this).getMatch()?.let(HttpGatewayRouteMatch::wrap)

    /**
     * The priority for the gateway route.
     *
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     *
     * Default: - no particular priority
     */
    override fun priority(): Number? = unwrap(this).getPriority()

    /**
     * The VirtualService this GatewayRoute directs traffic to.
     */
    override fun routeTarget(): IVirtualService =
        unwrap(this).getRouteTarget().let(IVirtualService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions):
        HttpGatewayRouteSpecOptions = CdkObjectWrappers.wrap(cdkObject) as?
        HttpGatewayRouteSpecOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions
  }
}
