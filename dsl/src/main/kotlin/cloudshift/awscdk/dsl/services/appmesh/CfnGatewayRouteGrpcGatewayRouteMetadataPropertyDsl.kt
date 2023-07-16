@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.builder()

  public fun invert(invert: Boolean) {
    cdkBuilder.invert(invert)
  }

  public fun invert(invert: IResolvable) {
    cdkBuilder.invert(invert)
  }

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnGatewayRoute.GatewayRouteMetadataMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteMetadataProperty = cdkBuilder.build()
}
