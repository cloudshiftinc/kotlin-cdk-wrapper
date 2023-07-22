@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

/**
 * The connection endpoint for connecting to Amazon Redshift Serverless through the proxy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshiftserverless.*;
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html)
 */
@CdkDslMarker
public class CfnWorkgroupVpcEndpointPropertyDsl {
  private val cdkBuilder: CfnWorkgroup.VpcEndpointProperty.Builder =
      CfnWorkgroup.VpcEndpointProperty.builder()

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
   * @param vpcEndpointId The connection endpoint ID for connecting to Amazon Redshift Serverless.
   */
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  /**
   * @param vpcId The VPC identifier that the endpoint is associated with.
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnWorkgroup.VpcEndpointProperty {
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    return cdkBuilder.build()
  }
}
