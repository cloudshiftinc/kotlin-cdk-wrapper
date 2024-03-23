@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Connection pool properties for HTTP listeners.
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
public interface HttpConnectionPool {
  /**
   * The maximum connections in the pool.
   *
   * Default: - none
   */
  public fun maxConnections(): Number

  /**
   * The maximum pending requests in the pool.
   *
   * Default: - none
   */
  public fun maxPendingRequests(): Number

  /**
   * A builder for [HttpConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    public fun maxConnections(maxConnections: Number)

    /**
     * @param maxPendingRequests The maximum pending requests in the pool. 
     */
    public fun maxPendingRequests(maxPendingRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.HttpConnectionPool.builder()

    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    /**
     * @param maxPendingRequests The maximum pending requests in the pool. 
     */
    override fun maxPendingRequests(maxPendingRequests: Number) {
      cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool,
  ) : CdkObject(cdkObject), HttpConnectionPool {
    /**
     * The maximum connections in the pool.
     *
     * Default: - none
     */
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()

    /**
     * The maximum pending requests in the pool.
     *
     * Default: - none
     */
    override fun maxPendingRequests(): Number = unwrap(this).getMaxPendingRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool):
        HttpConnectionPool = CdkObjectWrappers.wrap(cdkObject) as? HttpConnectionPool ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpConnectionPool):
        software.amazon.awscdk.services.appmesh.HttpConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpConnectionPool
  }
}
