@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerSubnetMappingPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.SubnetMappingProperty.Builder =
      CfnLoadBalancer.SubnetMappingProperty.builder()

  /**
   * @param allocationId [Network Load Balancers] The allocation ID of the Elastic IP address for an
   * internet-facing load balancer.
   */
  public fun allocationId(allocationId: String) {
    cdkBuilder.allocationId(allocationId)
  }

  /**
   * @param iPv6Address [Network Load Balancers] The IPv6 address.
   */
  public fun iPv6Address(iPv6Address: String) {
    cdkBuilder.iPv6Address(iPv6Address)
  }

  /**
   * @param privateIPv4Address [Network Load Balancers] The private IPv4 address for an internal
   * load balancer.
   */
  public fun privateIPv4Address(privateIPv4Address: String) {
    cdkBuilder.privateIPv4Address(privateIPv4Address)
  }

  /**
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnLoadBalancer.SubnetMappingProperty = cdkBuilder.build()
}
