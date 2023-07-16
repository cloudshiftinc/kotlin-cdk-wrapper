@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder()

  private val _metadata: MutableList<Any> = mutableListOf()

  public fun hostname(hostname: IResolvable) {
    cdkBuilder.hostname(hostname)
  }

  public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
    cdkBuilder.hostname(hostname)
  }

  public fun metadata(vararg metadata: Any) {
    _metadata.addAll(listOf(*metadata))
  }

  public fun metadata(metadata: Collection<Any>) {
    _metadata.addAll(metadata)
  }

  public fun metadata(metadata: IResolvable) {
    cdkBuilder.metadata(metadata)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteMatchProperty {
    if(_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
    return cdkBuilder.build()
  }
}
