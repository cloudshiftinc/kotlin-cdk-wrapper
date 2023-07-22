@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.VpcIpamOptions

@CdkDslMarker
public class VpcIpamOptionsDsl {
  private val cdkBuilder: VpcIpamOptions.Builder = VpcIpamOptions.builder()

  /**
   * @param cidrBlock Cidr Block for Vpc.
   */
  public fun cidrBlock(cidrBlock: String) {
    cdkBuilder.cidrBlock(cidrBlock)
  }

  /**
   * @param ipv4IpamPoolId ipv4 IPAM Pool Id.
   */
  public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
    cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
  }

  /**
   * @param ipv4NetmaskLength Cidr Mask for Vpc.
   */
  public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
    cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
  }

  public fun build(): VpcIpamOptions = cdkBuilder.build()
}
