@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnIPAMPoolCidrProps

/**
 * Properties for defining a `CfnIPAMPoolCidr`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnIPAMPoolCidrProps cfnIPAMPoolCidrProps = CfnIPAMPoolCidrProps.builder()
 * .ipamPoolId("ipamPoolId")
 * // the properties below are optional
 * .cidr("cidr")
 * .netmaskLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipampoolcidr.html)
 */
@CdkDslMarker
public class CfnIPAMPoolCidrPropsDsl {
  private val cdkBuilder: CfnIPAMPoolCidrProps.Builder = CfnIPAMPoolCidrProps.builder()

  /**
   * @param cidr The CIDR provisioned to the IPAM pool.
   * A CIDR is a representation of an IP address and its associated network mask (or netmask) and
   * refers to a range of IP addresses. An IPv4 CIDR example is `10.24.34.0/23` . An IPv6 CIDR example
   * is `2001:DB8::/32` .
   */
  public fun cidr(cidr: String) {
    cdkBuilder.cidr(cidr)
  }

  /**
   * @param ipamPoolId The ID of the IPAM pool. 
   */
  public fun ipamPoolId(ipamPoolId: String) {
    cdkBuilder.ipamPoolId(ipamPoolId)
  }

  /**
   * @param netmaskLength The netmask length of the CIDR you'd like to provision to a pool.
   * Can be used for provisioning Amazon-provided IPv6 CIDRs to top-level pools and for provisioning
   * CIDRs to pools with source pools. Cannot be used to provision BYOIP CIDRs to top-level pools.
   * "NetmaskLength" or "Cidr" is required.
   */
  public fun netmaskLength(netmaskLength: Number) {
    cdkBuilder.netmaskLength(netmaskLength)
  }

  public fun build(): CfnIPAMPoolCidrProps = cdkBuilder.build()
}
