@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.constructs.Construct

/**
 * Associates a virtual private gateway or internet gateway with a route table.
 *
 * The gateway and route table must be in the same VPC. This association causes the incoming traffic
 * to the gateway to be routed according to the routes in the route table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnGatewayRouteTableAssociation cfnGatewayRouteTableAssociation =
 * CfnGatewayRouteTableAssociation.Builder.create(this, "MyCfnGatewayRouteTableAssociation")
 * .gatewayId("gatewayId")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html)
 */
@CdkDslMarker
public class CfnGatewayRouteTableAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnGatewayRouteTableAssociation.Builder =
      CfnGatewayRouteTableAssociation.Builder.create(scope, id)

  /**
   * The ID of the gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid)
   * @param gatewayId The ID of the gateway. 
   */
  public fun gatewayId(gatewayId: String) {
    cdkBuilder.gatewayId(gatewayId)
  }

  /**
   * The ID of the route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid)
   * @param routeTableId The ID of the route table. 
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  public fun build(): CfnGatewayRouteTableAssociation = cdkBuilder.build()
}
