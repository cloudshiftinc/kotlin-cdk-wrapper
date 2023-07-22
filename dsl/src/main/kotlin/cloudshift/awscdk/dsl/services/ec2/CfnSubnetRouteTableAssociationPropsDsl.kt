@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps

@CdkDslMarker
public class CfnSubnetRouteTableAssociationPropsDsl {
  private val cdkBuilder: CfnSubnetRouteTableAssociationProps.Builder =
      CfnSubnetRouteTableAssociationProps.builder()

  /**
   * @param routeTableId The ID of the route table. 
   * The physical ID changes when the route table ID is changed.
   */
  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  /**
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetRouteTableAssociationProps = cdkBuilder.build()
}
