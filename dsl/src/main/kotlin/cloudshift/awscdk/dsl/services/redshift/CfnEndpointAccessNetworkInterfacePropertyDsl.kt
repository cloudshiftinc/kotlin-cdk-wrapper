@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@CdkDslMarker
public class CfnEndpointAccessNetworkInterfacePropertyDsl {
  private val cdkBuilder: CfnEndpointAccess.NetworkInterfaceProperty.Builder =
      CfnEndpointAccess.NetworkInterfaceProperty.builder()

  /**
   * @param availabilityZone The Availability Zone.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param networkInterfaceId The network interface identifier.
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
   * @param subnetId The subnet identifier.
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnEndpointAccess.NetworkInterfaceProperty = cdkBuilder.build()
}
