@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator.endpoints

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps

@CdkDslMarker
public class NetworkLoadBalancerEndpointPropsDsl {
  private val cdkBuilder: NetworkLoadBalancerEndpointProps.Builder =
      NetworkLoadBalancerEndpointProps.builder()

  /**
   * @param weight Endpoint weight across all endpoints in the group.
   * Must be a value between 0 and 255.
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): NetworkLoadBalancerEndpointProps = cdkBuilder.build()
}
