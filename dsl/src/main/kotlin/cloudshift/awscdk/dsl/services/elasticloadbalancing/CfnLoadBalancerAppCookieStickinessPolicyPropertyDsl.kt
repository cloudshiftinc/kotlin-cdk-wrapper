@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder =
      CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder()

  public fun cookieName(cookieName: String) {
    cdkBuilder.cookieName(cookieName)
  }

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnLoadBalancer.AppCookieStickinessPolicyProperty = cdkBuilder.build()
}
