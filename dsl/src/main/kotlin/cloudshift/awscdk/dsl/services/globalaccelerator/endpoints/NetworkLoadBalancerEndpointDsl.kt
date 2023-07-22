@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint

@CdkDslMarker
public class NetworkLoadBalancerEndpointDsl(
  loadBalancer: INetworkLoadBalancer,
) {
  private val cdkBuilder: NetworkLoadBalancerEndpoint.Builder =
      NetworkLoadBalancerEndpoint.Builder.create(loadBalancer)

  /**
   * Endpoint weight across all endpoints in the group.
   *
   * Must be a value between 0 and 255.
   *
   * Default: 128
   *
   * @param weight Endpoint weight across all endpoints in the group. 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): NetworkLoadBalancerEndpoint = cdkBuilder.build()
}
