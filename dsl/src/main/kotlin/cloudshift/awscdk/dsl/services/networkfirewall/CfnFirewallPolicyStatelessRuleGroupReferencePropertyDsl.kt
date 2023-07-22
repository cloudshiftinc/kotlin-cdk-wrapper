@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder =
      CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder()

  /**
   * @param priority An integer setting that indicates the order in which to run the stateless rule
   * groups in a single `FirewallPolicy` . 
   * Network Firewall applies each stateless rule group to a packet starting with the group that has
   * the lowest priority setting. You must ensure that the priority settings are unique within each
   * policy.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the stateless rule group. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty = cdkBuilder.build()
}
