@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.AclCidrConfig

@CdkDslMarker
public class AclCidrConfigDsl {
  private val cdkBuilder: AclCidrConfig.Builder = AclCidrConfig.builder()

  /**
   * @param cidrBlock Ipv4 CIDR.
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * @param ipv6CidrBlock Ipv6 CIDR.
   */
  public fun ipv6CidrBlock(ipv6CidrBlock: String) {
    cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
  }

  public fun build(): AclCidrConfig = cdkBuilder.build()
}
