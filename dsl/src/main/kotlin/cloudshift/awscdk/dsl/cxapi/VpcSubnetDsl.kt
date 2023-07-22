@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cxapi.VpcSubnet

@CdkDslMarker
public class VpcSubnetDsl {
  private val cdkBuilder: VpcSubnet.Builder = VpcSubnet.builder()

  /**
   * @param availabilityZone The code of the availability zone this subnet is in (for example,
   * 'us-west-2a'). 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param cidr CIDR range of the subnet.
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param routeTableId The identifier of the route table for this subnet. 
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  /**
   * @param subnetId The identifier of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): VpcSubnet = cdkBuilder.build()
}
