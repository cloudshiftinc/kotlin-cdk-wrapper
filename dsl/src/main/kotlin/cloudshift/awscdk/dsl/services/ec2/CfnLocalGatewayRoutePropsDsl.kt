@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps

@CdkDslMarker
public class CfnLocalGatewayRoutePropsDsl {
  private val cdkBuilder: CfnLocalGatewayRouteProps.Builder = CfnLocalGatewayRouteProps.builder()

  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
  }

  public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
    cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
  }

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun build(): CfnLocalGatewayRouteProps = cdkBuilder.build()
}
