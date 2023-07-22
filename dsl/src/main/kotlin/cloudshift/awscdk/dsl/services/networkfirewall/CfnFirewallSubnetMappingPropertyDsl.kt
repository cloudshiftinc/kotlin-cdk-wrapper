@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewall

@CdkDslMarker
public class CfnFirewallSubnetMappingPropertyDsl {
  private val cdkBuilder: CfnFirewall.SubnetMappingProperty.Builder =
      CfnFirewall.SubnetMappingProperty.builder()

  /**
   * @param ipAddressType The subnet's IP address type.
   * You can't change the IP address type after you create the subnet.
   */
  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * @param subnetId The unique identifier for the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnFirewall.SubnetMappingProperty = cdkBuilder.build()
}
