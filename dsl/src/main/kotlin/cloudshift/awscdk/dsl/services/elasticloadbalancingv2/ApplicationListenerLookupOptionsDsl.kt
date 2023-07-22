@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol

@CdkDslMarker
public class ApplicationListenerLookupOptionsDsl {
  private val cdkBuilder: ApplicationListenerLookupOptions.Builder =
      ApplicationListenerLookupOptions.builder()

  /**
   * @param listenerArn ARN of the listener to look up.
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  /**
   * @param listenerPort Filter listeners by listener port.
   */
  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  /**
   * @param listenerProtocol Filter listeners by listener protocol.
   */
  public fun listenerProtocol(listenerProtocol: ApplicationProtocol) {
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

  public fun build(): ApplicationListenerLookupOptions = cdkBuilder.build()
}
