@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties specific for a gRPC GatewayRoute.
 *
 * Example:
 *
 * ```
 * VirtualGateway gateway;
 * VirtualService virtualService;
 * gateway.addGatewayRoute("gateway-route-grpc", GatewayRouteBaseProps.builder()
 * .routeSpec(GatewayRouteSpec.grpc(GrpcGatewayRouteSpecOptions.builder()
 * .routeTarget(virtualService)
 * .match(GrpcGatewayRouteMatch.builder()
 * .hostname(GatewayRouteHostnameMatch.endsWith(".example.com"))
 * .build())
 * .build()))
 * .build());
 * ```
 */
public interface GrpcGatewayRouteSpecOptions : CommonGatewayRouteSpecOptions {
  /**
   * The criterion for determining a request match for this GatewayRoute.
   */
  public fun match(): GrpcGatewayRouteMatch

  /**
   * The VirtualService this GatewayRoute directs traffic to.
   */
  public fun routeTarget(): IVirtualService

  /**
   * A builder for [GrpcGatewayRouteSpecOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param match The criterion for determining a request match for this GatewayRoute. 
     */
    public fun match(match: GrpcGatewayRouteMatch)

    /**
     * @param match The criterion for determining a request match for this GatewayRoute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049afeb2582a8cfa99cbd2258b2fe194b372388321855c061f39eb552c7e795a")
    public fun match(match: GrpcGatewayRouteMatch.Builder.() -> Unit)

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
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.builder()

    /**
     * @param match The criterion for determining a request match for this GatewayRoute. 
     */
    override fun match(match: GrpcGatewayRouteMatch) {
      cdkBuilder.match(match.let(GrpcGatewayRouteMatch::unwrap))
    }

    /**
     * @param match The criterion for determining a request match for this GatewayRoute. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("049afeb2582a8cfa99cbd2258b2fe194b372388321855c061f39eb552c7e795a")
    override fun match(match: GrpcGatewayRouteMatch.Builder.() -> Unit): Unit =
        match(GrpcGatewayRouteMatch(match))

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
      cdkBuilder.routeTarget(routeTarget.let(IVirtualService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions,
  ) : CdkObject(cdkObject), GrpcGatewayRouteSpecOptions {
    /**
     * The criterion for determining a request match for this GatewayRoute.
     */
    override fun match(): GrpcGatewayRouteMatch =
        unwrap(this).getMatch().let(GrpcGatewayRouteMatch::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions):
        GrpcGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions
  }
}
