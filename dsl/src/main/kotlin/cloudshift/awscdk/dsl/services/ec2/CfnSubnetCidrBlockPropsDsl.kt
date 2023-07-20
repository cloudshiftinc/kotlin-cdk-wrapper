@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps

@CdkDslMarker
public class CfnSubnetCidrBlockPropsDsl {
  private val cdkBuilder: CfnSubnetCidrBlockProps.Builder = CfnSubnetCidrBlockProps.builder()

  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetCidrBlockProps = cdkBuilder.build()
}
