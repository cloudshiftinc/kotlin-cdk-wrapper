@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.constructs.Construct

@CdkDslMarker
public class CfnTransitGatewayRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayRoute.Builder =
      CfnTransitGatewayRoute.Builder.create(scope, id)

  public fun blackhole(blackhole: Boolean) {
    cdkBuilder.blackhole(blackhole)
  }

  public fun blackhole(blackhole: IResolvable) {
    cdkBuilder.blackhole(blackhole)
  }

  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
    cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
  }

  public fun build(): CfnTransitGatewayRoute = cdkBuilder.build()
}
