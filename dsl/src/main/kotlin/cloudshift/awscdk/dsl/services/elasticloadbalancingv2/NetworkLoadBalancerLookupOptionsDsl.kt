@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions

/**
 * Options for looking up an NetworkLoadBalancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * NetworkLoadBalancerLookupOptions networkLoadBalancerLookupOptions =
 * NetworkLoadBalancerLookupOptions.builder()
 * .loadBalancerArn("loadBalancerArn")
 * .loadBalancerTags(Map.of(
 * "loadBalancerTagsKey", "loadBalancerTags"))
 * .build();
 * ```
 */
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
