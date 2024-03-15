@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Connection pool properties for gRPC listeners.
 *
 * Example:
 *
 * ```
 * // A Virtual Node with a gRPC listener with a connection pool set
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * // DNS service discovery can optionally specify the DNS response type as either LOAD_BALANCER or
 * ENDPOINTS.
 * // LOAD_BALANCER means that the DNS resolver returns a loadbalanced set of endpoints,
 * // whereas ENDPOINTS means that the DNS resolver is returning all the endpoints.
 * // By default, the response type is assumed to be LOAD_BALANCER
 * .serviceDiscovery(ServiceDiscovery.dns("node", DnsResponseType.ENDPOINTS))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(80)
 * .connectionPool(HttpConnectionPool.builder()
 * .maxConnections(100)
 * .maxPendingRequests(10)
 * .build())
 * .build())))
 * .build();
 * // A Virtual Gateway with a gRPC listener with a connection pool set
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.grpc(GrpcGatewayListenerOptions.builder()
 * .port(8080)
 * .connectionPool(GrpcConnectionPool.builder()
 * .maxRequests(10)
 * .build())
 * .build())))
 * .virtualGatewayName("gateway")
 * .build();
 * ```
 */
public interface GrpcConnectionPool {
  /**
   * The maximum requests in the pool.
   *
   * Default: - none
   */
  public fun maxRequests(): Number

  /**
   * A builder for [GrpcConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    public fun maxRequests(maxRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool.builder()

    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool,
  ) : CdkObject(cdkObject), GrpcConnectionPool {
    /**
     * The maximum requests in the pool.
     *
     * Default: - none
     */
    override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool):
        GrpcConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcConnectionPool):
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcConnectionPool
  }
}
