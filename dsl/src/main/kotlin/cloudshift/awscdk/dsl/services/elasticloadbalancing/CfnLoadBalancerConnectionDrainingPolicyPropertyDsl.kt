@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies the connection draining settings for your Classic Load Balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * ConnectionDrainingPolicyProperty connectionDrainingPolicyProperty =
 * ConnectionDrainingPolicyProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .timeout(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html)
 */
@CdkDslMarker
public class CfnLoadBalancerConnectionDrainingPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder =
      CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder()

  /**
   * @param enabled Specifies whether connection draining is enabled for the load balancer. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether connection draining is enabled for the load balancer. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param timeout The maximum time, in seconds, to keep the existing connections open before
   * deregistering the instances.
   */
  public fun timeout(timeout: Number) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnLoadBalancer.ConnectionDrainingPolicyProperty = cdkBuilder.build()
}
