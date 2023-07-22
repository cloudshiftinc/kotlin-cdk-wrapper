@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupStatefulRuleOptionsPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatefulRuleOptionsProperty.Builder =
      CfnRuleGroup.StatefulRuleOptionsProperty.builder()

  /**
   * @param ruleOrder Indicates how to manage the order of the rule evaluation for the rule group.
   * `DEFAULT_ACTION_ORDER` is the default behavior. Stateful rules are provided to the rule engine
   * as Suricata compatible strings, and Suricata evaluates them based on certain settings. For more
   * information, see [Evaluation order for stateful
   * rules](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html)
   * in the *AWS Network Firewall Developer Guide* .
   */
  public fun ruleOrder(ruleOrder: String) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  public fun build(): CfnRuleGroup.StatefulRuleOptionsProperty = cdkBuilder.build()
}
