@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

@CdkDslMarker
public class CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder =
      CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder()

  /**
   * @param action The action that changes the rule group from `DROP` to `ALERT` .
   * This only applies to managed rule groups.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnFirewallPolicy.StatefulRuleGroupOverrideProperty = cdkBuilder.build()
}
