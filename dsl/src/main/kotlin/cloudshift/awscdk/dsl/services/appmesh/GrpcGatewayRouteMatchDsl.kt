@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch
import software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch
import software.amazon.awscdk.services.appmesh.HeaderMatch

@CdkDslMarker
public class GrpcGatewayRouteMatchDsl {
  private val cdkBuilder: GrpcGatewayRouteMatch.Builder = GrpcGatewayRouteMatch.builder()

  private val _metadata: MutableList<HeaderMatch> = mutableListOf()

  /**
   * @param hostname Create host name based gRPC gateway route match.
   */
  public fun hostname(hostname: GatewayRouteHostnameMatch) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param metadata Create metadata based gRPC gateway route match.
   * All specified metadata must match for the route to match.
   */
  public fun metadata(vararg metadata: HeaderMatch) {
    _metadata.addAll(listOf(*metadata))
  }

  /**
   * @param metadata Create metadata based gRPC gateway route match.
   * All specified metadata must match for the route to match.
   */
  public fun metadata(metadata: Collection<HeaderMatch>) {
    _metadata.addAll(metadata)
  }

  /**
   * @param port The port to match from the request.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param rewriteRequestHostname When `true`, rewrites the original request received at the
   * Virtual Gateway to the destination Virtual Service name.
   * When `false`, retains the original hostname from the request.
   */
  public fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
    cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
  }

  /**
   * @param serviceName Create service name based gRPC gateway route match.
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): GrpcGatewayRouteMatch {
    if(_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
    return cdkBuilder.build()
  }
}
