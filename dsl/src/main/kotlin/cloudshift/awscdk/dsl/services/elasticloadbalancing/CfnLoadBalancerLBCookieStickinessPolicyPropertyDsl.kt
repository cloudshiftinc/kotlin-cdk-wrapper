@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder =
      CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder()

  /**
   * @param cookieExpirationPeriod The time period, in seconds, after which the cookie should be
   * considered stale.
   * If this parameter is not specified, the stickiness session lasts for the duration of the
   * browser session.
   */
  public fun cookieExpirationPeriod(cookieExpirationPeriod: String) {
    cdkBuilder.cookieExpirationPeriod(cookieExpirationPeriod)
  }

  /**
   * @param policyName The name of the policy.
   * This name must be unique within the set of policies for this load balancer.
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnLoadBalancer.LBCookieStickinessPolicyProperty = cdkBuilder.build()
}
