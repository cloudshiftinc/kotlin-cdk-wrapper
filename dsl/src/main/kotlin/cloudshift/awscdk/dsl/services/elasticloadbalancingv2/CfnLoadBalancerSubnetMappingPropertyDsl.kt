@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerSubnetMappingPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.SubnetMappingProperty.Builder =
      CfnLoadBalancer.SubnetMappingProperty.builder()

  public fun allocationId(allocationId: String) {
    cdkBuilder.allocationId(allocationId)
  }

  public fun iPv6Address(iPv6Address: String) {
    cdkBuilder.iPv6Address(iPv6Address)
  }

  public fun privateIPv4Address(privateIPv4Address: String) {
    cdkBuilder.privateIPv4Address(privateIPv4Address)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnLoadBalancer.SubnetMappingProperty = cdkBuilder.build()
}
