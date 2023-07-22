@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.appmesh.GrpcConnectionPool

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
@CdkDslMarker
public class GrpcConnectionPoolDsl {
  private val cdkBuilder: GrpcConnectionPool.Builder = GrpcConnectionPool.builder()

  /**
   * @param maxRequests The maximum requests in the pool. 
   */
  public fun maxRequests(maxRequests: Number) {
    cdkBuilder.maxRequests(maxRequests)
  }

  public fun build(): GrpcConnectionPool = cdkBuilder.build()
}
