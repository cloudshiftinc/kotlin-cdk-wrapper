@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The criterion for determining a request match for this GatewayRoute.
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
public interface GrpcGatewayRouteMatch {
  /**
   * Create host name based gRPC gateway route match.
   *
   * Default: - no matching on host name
   */
  public fun hostname(): GatewayRouteHostnameMatch? =
      unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

  /**
   * Create metadata based gRPC gateway route match.
   *
   * All specified metadata must match for the route to match.
   *
   * Default: - no matching on metadata
   */
  public fun metadata(): List<HeaderMatch> = unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?:
      emptyList()

  /**
   * The port to match from the request.
   *
   * Default: - do not match on port
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * When `true`, rewrites the original request received at the Virtual Gateway to the destination
   * Virtual Service name.
   *
   * When `false`, retains the original hostname from the request.
   *
   * Default: true
   */
  public fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

  /**
   * Create service name based gRPC gateway route match.
   *
   * Default: - no matching on service name
   */
  public fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * A builder for [GrpcGatewayRouteMatch]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostname Create host name based gRPC gateway route match.
     */
    public fun hostname(hostname: GatewayRouteHostnameMatch)

    /**
     * @param metadata Create metadata based gRPC gateway route match.
     * All specified metadata must match for the route to match.
     */
    public fun metadata(metadata: List<HeaderMatch>)

    /**
     * @param metadata Create metadata based gRPC gateway route match.
     * All specified metadata must match for the route to match.
     */
    public fun metadata(vararg metadata: HeaderMatch)

    /**
     * @param port The port to match from the request.
     */
    public fun port(port: Number)

    /**
     * @param rewriteRequestHostname When `true`, rewrites the original request received at the
     * Virtual Gateway to the destination Virtual Service name.
     * When `false`, retains the original hostname from the request.
     */
    public fun rewriteRequestHostname(rewriteRequestHostname: Boolean)

    /**
     * @param serviceName Create service name based gRPC gateway route match.
     */
    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch.builder()

    /**
     * @param hostname Create host name based gRPC gateway route match.
     */
    override fun hostname(hostname: GatewayRouteHostnameMatch) {
      cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatch::unwrap))
    }

    /**
     * @param metadata Create metadata based gRPC gateway route match.
     * All specified metadata must match for the route to match.
     */
    override fun metadata(metadata: List<HeaderMatch>) {
      cdkBuilder.metadata(metadata.map(HeaderMatch::unwrap))
    }

    /**
     * @param metadata Create metadata based gRPC gateway route match.
     * All specified metadata must match for the route to match.
     */
    override fun metadata(vararg metadata: HeaderMatch): Unit = metadata(metadata.toList())

    /**
     * @param port The port to match from the request.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param rewriteRequestHostname When `true`, rewrites the original request received at the
     * Virtual Gateway to the destination Virtual Service name.
     * When `false`, retains the original hostname from the request.
     */
    override fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
      cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
    }

    /**
     * @param serviceName Create service name based gRPC gateway route match.
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch,
  ) : CdkObject(cdkObject), GrpcGatewayRouteMatch {
    /**
     * Create host name based gRPC gateway route match.
     *
     * Default: - no matching on host name
     */
    override fun hostname(): GatewayRouteHostnameMatch? =
        unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

    /**
     * Create metadata based gRPC gateway route match.
     *
     * All specified metadata must match for the route to match.
     *
     * Default: - no matching on metadata
     */
    override fun metadata(): List<HeaderMatch> = unwrap(this).getMetadata()?.map(HeaderMatch::wrap)
        ?: emptyList()

    /**
     * The port to match from the request.
     *
     * Default: - do not match on port
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * When `true`, rewrites the original request received at the Virtual Gateway to the destination
     * Virtual Service name.
     *
     * When `false`, retains the original hostname from the request.
     *
     * Default: true
     */
    override fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

    /**
     * Create service name based gRPC gateway route match.
     *
     * Default: - no matching on service name
     */
    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch):
        GrpcGatewayRouteMatch = CdkObjectWrappers.wrap(cdkObject) as? GrpcGatewayRouteMatch ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcGatewayRouteMatch):
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch
  }
}
