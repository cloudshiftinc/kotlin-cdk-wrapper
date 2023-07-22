@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions

@CdkDslMarker
public class NetworkLoadBalancerLookupOptionsDsl {
  private val cdkBuilder: NetworkLoadBalancerLookupOptions.Builder =
      NetworkLoadBalancerLookupOptions.builder()

  /**
   * @param loadBalancerArn Find by load balancer's ARN.
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param loadBalancerTags Match load balancer tags.
   */
  public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
    cdkBuilder.loadBalancerTags(loadBalancerTags)
  }

  public fun build(): NetworkLoadBalancerLookupOptions = cdkBuilder.build()
}
