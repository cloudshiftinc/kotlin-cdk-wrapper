@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch
import software.amazon.awscdk.services.appmesh.HeaderMatch

@CdkDslMarker
public class GrpcRouteMatchDsl {
  private val cdkBuilder: GrpcRouteMatch.Builder = GrpcRouteMatch.builder()

  private val _metadata: MutableList<HeaderMatch> = mutableListOf()

  /**
   * @param metadata Create metadata based gRPC route match.
   * All specified metadata must match for the route to match.
   */
  public fun metadata(vararg metadata: HeaderMatch) {
    _metadata.addAll(listOf(*metadata))
  }

  /**
   * @param metadata Create metadata based gRPC route match.
   * All specified metadata must match for the route to match.
   */
  public fun metadata(metadata: Collection<HeaderMatch>) {
    _metadata.addAll(metadata)
  }

  /**
   * @param methodName The method name to match from the request.
   * If the method name is specified, service name must be also provided.
   */
  public fun methodName(methodName: String) {
    cdkBuilder.methodName(methodName)
  }

  /**
   * @param port The port to match from the request.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param serviceName Create service name based gRPC route match.
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): GrpcRouteMatch {
    if(_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
    return cdkBuilder.build()
  }
}
