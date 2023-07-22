@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol

@CdkDslMarker
public class NetworkListenerLookupOptionsDsl {
  private val cdkBuilder: NetworkListenerLookupOptions.Builder =
      NetworkListenerLookupOptions.builder()

  /**
   * @param listenerPort Filter listeners by listener port.
   */
  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  /**
   * @param listenerProtocol Protocol of the listener port.
   */
  public fun listenerProtocol(listenerProtocol: Protocol) {
    cdkBuilder.listenerProtocol(listenerProtocol)
  }

  /**
   * @param loadBalancerArn Filter listeners by associated load balancer arn.
   */
  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  /**
   * @param loadBalancerTags Filter listeners by associated load balancer tags.
   */
  public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
    cdkBuilder.loadBalancerTags(loadBalancerTags)
  }

  public fun build(): NetworkListenerLookupOptions = cdkBuilder.build()
}
