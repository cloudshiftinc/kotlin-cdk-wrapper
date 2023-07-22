@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupStatefulRulePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatefulRuleProperty.Builder =
      CfnRuleGroup.StatefulRuleProperty.builder()

  private val _ruleOptions: MutableList<Any> = mutableListOf()

  /**
   * @param action Defines what Network Firewall should do with the packets in a traffic flow when
   * the flow matches the stateful rule criteria. 
   * For all actions, Network Firewall performs the specified action and discontinues stateful
   * inspection of the traffic flow.
   *
   * The actions for a stateful rule are defined as follows:
   *
   * * *PASS* - Permits the packets to go to the intended destination.
   * * *DROP* - Blocks the packets from going to the intended destination and sends an alert log
   * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
   * * *REJECT* - Drops traffic that matches the conditions of the stateful rule and sends a TCP
   * reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and a
   * `RST` bit contained in the TCP header flags. `REJECT` is available only for TCP traffic.
   * * *ALERT* - Permits the packets to go to the intended destination and sends an alert log
   * message, if alert logging is configured in the `Firewall` `LoggingConfiguration` .
   *
   * You can use this action to test a rule that you intend to use to drop traffic. You can enable
   * the rule with `ALERT` action, verify in the logs that the rule is filtering as you want, then
   * change the action to `DROP` .
   *
   * * *REJECT* - Drops TCP traffic that matches the conditions of the stateful rule, and sends a
   * TCP reset packet back to sender of the packet. A TCP reset packet is a packet with no payload and
   * a `RST` bit contained in the TCP header flags. Also sends an alert log mesage if alert logging is
   * configured in the `Firewall` `LoggingConfiguration` .
   *
   * `REJECT` isn't currently available for use with IMAP and FTP protocols.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param header The stateful inspection criteria for this rule, used to inspect traffic flows. 
   */
  public fun `header`(`header`: IResolvable) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param header The stateful inspection criteria for this rule, used to inspect traffic flows. 
   */
  public fun `header`(`header`: CfnRuleGroup.HeaderProperty) {
    cdkBuilder.`header`(`header`)
  }

  /**
   * @param ruleOptions Additional settings for a stateful rule, provided as keywords and settings. 
   */
  public fun ruleOptions(vararg ruleOptions: Any) {
    _ruleOptions.addAll(listOf(*ruleOptions))
  }

  /**
   * @param ruleOptions Additional settings for a stateful rule, provided as keywords and settings. 
   */
  public fun ruleOptions(ruleOptions: Collection<Any>) {
    _ruleOptions.addAll(ruleOptions)
  }

  /**
   * @param ruleOptions Additional settings for a stateful rule, provided as keywords and settings. 
   */
  public fun ruleOptions(ruleOptions: IResolvable) {
    cdkBuilder.ruleOptions(ruleOptions)
  }

  public fun build(): CfnRuleGroup.StatefulRuleProperty {
    if(_ruleOptions.isNotEmpty()) cdkBuilder.ruleOptions(_ruleOptions)
    return cdkBuilder.build()
  }
}
