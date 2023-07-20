@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.constructs.Construct

@CdkDslMarker
public class CfnSubnetCidrBlockDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubnetCidrBlock.Builder = CfnSubnetCidrBlock.Builder.create(scope, id)

  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetCidrBlock = cdkBuilder.build()
}
