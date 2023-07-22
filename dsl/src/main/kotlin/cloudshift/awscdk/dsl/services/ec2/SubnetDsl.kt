@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.Subnet
import software.constructs.Construct

@CdkDslMarker
public class SubnetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Subnet.Builder = Subnet.Builder.create(scope, id)

  /**
   * The availability zone for the subnet.
   *
   * @param availabilityZone The availability zone for the subnet. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * The CIDR notation for this subnet.
   *
   * @param cidrBlock The CIDR notation for this subnet. 
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * Controls if a public IP is associated to an instance at launch.
   *
   * Default: true in Subnet.Public, false in Subnet.Private or Subnet.Isolated.
   *
   * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch. 
   */
  public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
    cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
  }

  /**
   * The VPC which this subnet is part of.
   *
   * @param vpcId The VPC which this subnet is part of. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): Subnet = cdkBuilder.build()
}
