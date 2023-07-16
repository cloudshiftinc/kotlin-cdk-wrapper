@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerLoadBalancerAttributePropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.LoadBalancerAttributeProperty.Builder =
      CfnLoadBalancer.LoadBalancerAttributeProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnLoadBalancer.LoadBalancerAttributeProperty = cdkBuilder.build()
}
