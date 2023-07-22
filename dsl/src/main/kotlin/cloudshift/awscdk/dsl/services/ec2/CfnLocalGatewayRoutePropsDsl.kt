@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps

/**
 * Properties for defining a `CfnLocalGatewayRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteProps cfnLocalGatewayRouteProps = CfnLocalGatewayRouteProps.builder()
 * .destinationCidrBlock("destinationCidrBlock")
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * // the properties below are optional
 * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
 * .networkInterfaceId("networkInterfaceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html)
 */
@CdkDslMarker
public class CfnLocalGatewayRoutePropsDsl {
  private val cdkBuilder: CfnLocalGatewayRouteProps.Builder = CfnLocalGatewayRouteProps.builder()

  /**
   * @param destinationCidrBlock The CIDR block used for destination matches. 
   */
  public fun destinationCidrBlock(destinationCidrBlock: String) {
    cdkBuilder.destinationCidrBlock(destinationCidrBlock)
  }

  /**
   * @param localGatewayRouteTableId The ID of the local gateway route table. 
   */
  public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
  }

  /**
   * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group.
   */
  public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
    cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
  }

  /**
   * @param networkInterfaceId The ID of the network interface.
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun build(): CfnLocalGatewayRouteProps = cdkBuilder.build()
}
