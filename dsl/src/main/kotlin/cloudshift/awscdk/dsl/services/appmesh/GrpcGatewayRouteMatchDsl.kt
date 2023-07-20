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

  public fun hostname(hostname: GatewayRouteHostnameMatch) {
    cdkBuilder.hostname(hostname)
  }

  public fun metadata(vararg metadata: HeaderMatch) {
    _metadata.addAll(listOf(*metadata))
  }

  public fun metadata(metadata: Collection<HeaderMatch>) {
    _metadata.addAll(metadata)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
    cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): GrpcGatewayRouteMatch {
    if(_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
    return cdkBuilder.build()
  }
}
