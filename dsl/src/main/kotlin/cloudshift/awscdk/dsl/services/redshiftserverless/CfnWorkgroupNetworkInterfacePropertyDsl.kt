@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@CdkDslMarker
public class CfnWorkgroupNetworkInterfacePropertyDsl {
  private val cdkBuilder: CfnWorkgroup.NetworkInterfaceProperty.Builder =
      CfnWorkgroup.NetworkInterfaceProperty.builder()

  /**
   * @param availabilityZone The availability Zone.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param networkInterfaceId The unique identifier of the network interface.
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param privateIpAddress The IPv4 address of the network interface within the subnet.
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  /**
   * @param subnetId The unique identifier of the subnet.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnWorkgroup.NetworkInterfaceProperty = cdkBuilder.build()
}
