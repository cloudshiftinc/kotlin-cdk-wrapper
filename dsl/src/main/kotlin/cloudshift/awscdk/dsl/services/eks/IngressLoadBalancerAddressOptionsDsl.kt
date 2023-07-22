@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions

/**
 * Options for fetching an IngressLoadBalancerAddress.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.eks.*;
 * IngressLoadBalancerAddressOptions ingressLoadBalancerAddressOptions =
 * IngressLoadBalancerAddressOptions.builder()
 * .namespace("namespace")
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class IngressLoadBalancerAddressOptionsDsl {
  private val cdkBuilder: IngressLoadBalancerAddressOptions.Builder =
      IngressLoadBalancerAddressOptions.builder()

  /**
   * @param namespace The namespace the service belongs to.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param timeout Timeout for waiting on the load balancer address.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): IngressLoadBalancerAddressOptions = cdkBuilder.build()
}
