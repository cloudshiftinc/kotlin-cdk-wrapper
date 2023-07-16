@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerLBCookieStickinessPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder =
      CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder()

  public fun cookieExpirationPeriod(cookieExpirationPeriod: String) {
    cdkBuilder.cookieExpirationPeriod(cookieExpirationPeriod)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnLoadBalancer.LBCookieStickinessPolicyProperty = cdkBuilder.build()
}
