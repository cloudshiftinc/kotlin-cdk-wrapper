@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInterface

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
