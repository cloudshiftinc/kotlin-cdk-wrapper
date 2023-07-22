@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps

@CdkDslMarker
public class CfnGatewayRouteTableAssociationPropsDsl {
  private val cdkBuilder: CfnGatewayRouteTableAssociationProps.Builder =
      CfnGatewayRouteTableAssociationProps.builder()

  /**
   * @param gatewayId The ID of the gateway. 
   */
  public fun gatewayId(gatewayId: String) {
    cdkBuilder.gatewayId(gatewayId)
  }

  /**
   * @param routeTableId The ID of the route table. 
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  public fun build(): CfnGatewayRouteTableAssociationProps = cdkBuilder.build()
}
