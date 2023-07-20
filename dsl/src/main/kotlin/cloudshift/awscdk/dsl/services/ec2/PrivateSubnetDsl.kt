@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.constructs.Construct

@CdkDslMarker
public class PrivateSubnetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PrivateSubnet.Builder = PrivateSubnet.Builder.create(scope, id)

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
    cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): PrivateSubnet = cdkBuilder.build()
}
