@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes

@CdkDslMarker
public class PrivateSubnetAttributesDsl {
  private val cdkBuilder: PrivateSubnetAttributes.Builder = PrivateSubnetAttributes.builder()

  /**
   * @param availabilityZone The Availability Zone the subnet is located in.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param ipv4CidrBlock The IPv4 CIDR block associated with the subnet.
   */
  public fun ipv4CidrBlock(ipv4CidrBlock: String) {
    cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
  }

  /**
   * @param routeTableId The ID of the route table for this particular subnet.
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  /**
   * @param subnetId The subnetId for this particular subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): PrivateSubnetAttributes = cdkBuilder.build()
}
