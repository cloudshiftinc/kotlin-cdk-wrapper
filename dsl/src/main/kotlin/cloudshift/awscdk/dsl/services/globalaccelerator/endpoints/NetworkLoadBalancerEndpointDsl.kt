@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpoint

@CdkDslMarker
public class NetworkLoadBalancerEndpointDsl(
  arg0: INetworkLoadBalancer,
) {
  private val cdkBuilder: NetworkLoadBalancerEndpoint.Builder =
      NetworkLoadBalancerEndpoint.Builder.create(arg0)

  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): NetworkLoadBalancerEndpoint = cdkBuilder.build()
}
