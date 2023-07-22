@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

/**
 * The connection endpoint for connecting to an Amazon Redshift cluster through the proxy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
 * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .subnetId("subnetId")
 * .build()))
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcendpoint.html)
 */
@CdkDslMarker
public class CfnEndpointAccessVpcEndpointPropertyDsl {
  private val cdkBuilder: CfnEndpointAccess.VpcEndpointProperty.Builder =
      CfnEndpointAccess.VpcEndpointProperty.builder()

  private val _networkInterfaces: MutableList<Any> = mutableListOf()

  /**
   * @param networkInterfaces One or more network interfaces of the endpoint.
   * Also known as an interface endpoint.
   */
  public fun networkInterfaces(vararg networkInterfaces: Any) {
    _networkInterfaces.addAll(listOf(*networkInterfaces))
  }

  /**
   * @param networkInterfaces One or more network interfaces of the endpoint.
   * Also known as an interface endpoint.
   */
  public fun networkInterfaces(networkInterfaces: Collection<Any>) {
    _networkInterfaces.addAll(networkInterfaces)
  }

  /**
   * @param networkInterfaces One or more network interfaces of the endpoint.
   * Also known as an interface endpoint.
   */
  public fun networkInterfaces(networkInterfaces: IResolvable) {
    cdkBuilder.networkInterfaces(networkInterfaces)
  }

  /**
   * @param vpcEndpointId The connection endpoint ID for connecting an Amazon Redshift cluster
   * through the proxy.
   */
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  /**
   * @param vpcId The VPC identifier that the endpoint is associated.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnEndpointAccess.VpcEndpointProperty {
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    return cdkBuilder.build()
  }
}
