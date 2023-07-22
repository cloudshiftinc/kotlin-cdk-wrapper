@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInterface

/**
 * Describes the IPv6 addresses to associate with the network interface.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-instanceipv6address.html)
 */
@CdkDslMarker
public class CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl {
  private val cdkBuilder: CfnNetworkInterface.InstanceIpv6AddressProperty.Builder =
      CfnNetworkInterface.InstanceIpv6AddressProperty.builder()

  /**
   * @param ipv6Address An IPv6 address to associate with the network interface. 
   */
  public fun ipv6Address(ipv6Address: String) {
    cdkBuilder.ipv6Address(ipv6Address)
  }

  public fun build(): CfnNetworkInterface.InstanceIpv6AddressProperty = cdkBuilder.build()
}
