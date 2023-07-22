@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointOptions
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.SubnetSelection

@CdkDslMarker
public class GatewayVpcEndpointOptionsDsl {
  private val cdkBuilder: GatewayVpcEndpointOptions.Builder = GatewayVpcEndpointOptions.builder()

  private val _subnets: MutableList<SubnetSelection> = mutableListOf()

  /**
   * @param service The service to use for this gateway VPC endpoint. 
   */
  public fun service(service: IGatewayVpcEndpointService) {
    cdkBuilder.service(service)
  }

  /**
   * @param subnets Where to add endpoint routing.
   * By default, this endpoint will be routable from all subnets in the VPC.
   * Specify a list of subnet selection objects here to be more specific.
   */
  public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
    _subnets.add(SubnetSelectionDsl().apply(subnets).build())
  }

  /**
   * @param subnets Where to add endpoint routing.
   * By default, this endpoint will be routable from all subnets in the VPC.
   * Specify a list of subnet selection objects here to be more specific.
   */
  public fun subnets(subnets: Collection<SubnetSelection>) {
    _subnets.addAll(subnets)
  }

  public fun build(): GatewayVpcEndpointOptions {
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
