@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerAppCookieStickinessPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder =
      CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder()

  /**
   * @param cookieName The name of the application cookie used for stickiness. 
   */
  public fun cookieName(cookieName: String) {
    cdkBuilder.cookieName(cookieName)
  }

  /**
   * @param policyName The mnemonic name for the policy being created. 
   * The name must be unique within a set of policies for this load balancer.
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun build(): CfnLoadBalancer.AppCookieStickinessPolicyProperty = cdkBuilder.build()
}
