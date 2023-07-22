@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.constructs.Construct

/**
 * Associates a subnet with a route table.
 *
 * The subnet and route table must be in the same VPC. This association causes traffic originating
 * from the subnet to be routed according to the routes in the route table. A route table can be
 * associated with multiple subnets. To create a route table, see
 * [AWS::EC2::RouteTable](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-routetable.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetRouteTableAssociation cfnSubnetRouteTableAssociation =
 * CfnSubnetRouteTableAssociation.Builder.create(this, "MyCfnSubnetRouteTableAssociation")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html)
 */
@CdkDslMarker
public class CfnSubnetRouteTableAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubnetRouteTableAssociation.Builder =
      CfnSubnetRouteTableAssociation.Builder.create(scope, id)

  /**
   * The ID of the route table.
   *
   * The physical ID changes when the route table ID is changed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-routetableid)
   * @param routeTableId The ID of the route table. 
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetroutetableassociation.html#cfn-ec2-subnetroutetableassociation-subnetid)
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetRouteTableAssociation = cdkBuilder.build()
}
