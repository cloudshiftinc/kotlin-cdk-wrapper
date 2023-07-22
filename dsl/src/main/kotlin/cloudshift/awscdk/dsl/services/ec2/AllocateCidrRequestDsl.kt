@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AllocateCidrRequest
import software.amazon.awscdk.services.ec2.RequestedSubnet

@CdkDslMarker
public class AllocateCidrRequestDsl {
  private val cdkBuilder: AllocateCidrRequest.Builder = AllocateCidrRequest.builder()

  private val _requestedSubnets: MutableList<RequestedSubnet> = mutableListOf()

  /**
   * @param requestedSubnets The Subnets to be allocated. 
   */
  public fun requestedSubnets(requestedSubnets: RequestedSubnetDsl.() -> Unit) {
    _requestedSubnets.add(RequestedSubnetDsl().apply(requestedSubnets).build())
  }

  /**
   * @param requestedSubnets The Subnets to be allocated. 
   */
  public fun requestedSubnets(requestedSubnets: Collection<RequestedSubnet>) {
    _requestedSubnets.addAll(requestedSubnets)
  }

  /**
   * @param vpcCidr The IPv4 CIDR block for this Vpc. 
   */
  public fun vpcCidr(vpcCidr: String) {
    cdkBuilder.vpcCidr(vpcCidr)
  }

  public fun build(): AllocateCidrRequest {
    if(_requestedSubnets.isNotEmpty()) cdkBuilder.requestedSubnets(_requestedSubnets)
    return cdkBuilder.build()
  }
}
