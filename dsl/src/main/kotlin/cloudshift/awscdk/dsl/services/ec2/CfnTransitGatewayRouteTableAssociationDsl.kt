@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayRouteTableAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayRouteTableAssociation.Builder =
      CfnTransitGatewayRouteTableAssociation.Builder.create(scope, id)

  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
    cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
  }

  public fun build(): CfnTransitGatewayRouteTableAssociation = cdkBuilder.build()
}
