@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps

@CdkDslMarker
public class CfnTransitGatewayRouteTableAssociationPropsDsl {
  private val cdkBuilder: CfnTransitGatewayRouteTableAssociationProps.Builder =
      CfnTransitGatewayRouteTableAssociationProps.builder()

  /**
   * @param transitGatewayAttachmentId The ID of the attachment. 
   */
  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  /**
   * @param transitGatewayRouteTableId The ID of the route table for the transit gateway. 
   */
  public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
    cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
  }

  public fun build(): CfnTransitGatewayRouteTableAssociationProps = cdkBuilder.build()
}
