@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@CdkDslMarker
public class CfnWorkgroupEndpointPropertyDsl {
  private val cdkBuilder: CfnWorkgroup.EndpointProperty.Builder =
      CfnWorkgroup.EndpointProperty.builder()

  private val _vpcEndpoints: MutableList<Any> = mutableListOf()

  /**
   * @param address The DNS address of the VPC endpoint.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param port The port that Amazon Redshift Serverless listens on.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param vpcEndpoints An array of `VpcEndpoint` objects.
   */
  public fun vpcEndpoints(vararg vpcEndpoints: Any) {
    _vpcEndpoints.addAll(listOf(*vpcEndpoints))
  }

  /**
   * @param vpcEndpoints An array of `VpcEndpoint` objects.
   */
  public fun vpcEndpoints(vpcEndpoints: Collection<Any>) {
    _vpcEndpoints.addAll(vpcEndpoints)
  }

  /**
   * @param vpcEndpoints An array of `VpcEndpoint` objects.
   */
  public fun vpcEndpoints(vpcEndpoints: IResolvable) {
    cdkBuilder.vpcEndpoints(vpcEndpoints)
  }

  public fun build(): CfnWorkgroup.EndpointProperty {
    if(_vpcEndpoints.isNotEmpty()) cdkBuilder.vpcEndpoints(_vpcEndpoints)
    return cdkBuilder.build()
  }
}
