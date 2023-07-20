@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.PublicSubnetAttributes

@CdkDslMarker
public class PublicSubnetAttributesDsl {
  private val cdkBuilder: PublicSubnetAttributes.Builder = PublicSubnetAttributes.builder()

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun ipv4CidrBlock(ipv4CidrBlock: String) {
    cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
  }

  public fun routeTableId(routeTableId: String) {
    cdkBuilder.routeTableId(routeTableId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): PublicSubnetAttributes = cdkBuilder.build()
}
