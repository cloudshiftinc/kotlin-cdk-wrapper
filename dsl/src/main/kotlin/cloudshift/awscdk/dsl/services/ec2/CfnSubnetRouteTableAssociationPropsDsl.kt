@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps

@CdkDslMarker
public class CfnSubnetRouteTableAssociationPropsDsl {
  private val cdkBuilder: CfnSubnetRouteTableAssociationProps.Builder =
      CfnSubnetRouteTableAssociationProps.builder()

  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetRouteTableAssociationProps = cdkBuilder.build()
}
