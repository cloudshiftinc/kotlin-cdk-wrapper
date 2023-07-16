@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnGatewayRouteTableAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGatewayRouteTableAssociation.Builder =
      CfnGatewayRouteTableAssociation.Builder.create(scope, id)

  public fun gatewayId(gatewayId: String) {
    cdkBuilder.gatewayId(gatewayId)
  }

  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  public fun build(): CfnGatewayRouteTableAssociation = cdkBuilder.build()
}
