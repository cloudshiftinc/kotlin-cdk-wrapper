@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

/**
 * Describes a network interface.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-networkinterface.html)
 */
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
