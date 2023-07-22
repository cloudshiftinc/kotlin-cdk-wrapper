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
public class CfnRuleGroupRulesSourcePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RulesSourceProperty.Builder =
      CfnRuleGroup.RulesSourceProperty.builder()

  private val _statefulRules: MutableList<Any> = mutableListOf()

  /**
   * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
   */
  public fun rulesSourceList(rulesSourceList: IResolvable) {
    cdkBuilder.rulesSourceList(rulesSourceList)
  }

  /**
   * @param rulesSourceList Stateful inspection criteria for a domain list rule group.
   */
  public fun rulesSourceList(rulesSourceList: CfnRuleGroup.RulesSourceListProperty) {
    cdkBuilder.rulesSourceList(rulesSourceList)
  }

  /**
   * @param rulesString Stateful inspection criteria, provided in Suricata compatible intrusion
   * prevention system (IPS) rules.
   * Suricata is an open-source network IPS that includes a standard rule-based language for network
   * traffic inspection.
   *
   * These rules contain the inspection criteria and the action to take for traffic that matches the
   * criteria, so this type of rule group doesn't have a separate action setting.
   */
  public fun rulesString(rulesString: String) {
    cdkBuilder.rulesString(rulesString)
  }

  /**
   * @param statefulRules An array of individual stateful rules inspection criteria to be used
   * together in a stateful rule group.
   * Use this option to specify simple Suricata rules with protocol, source and destination, ports,
   * direction, and rule options. For information about the Suricata `Rules` format, see [Rules
   * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
   * .
   */
  public fun statefulRules(vararg statefulRules: Any) {
    _statefulRules.addAll(listOf(*statefulRules))
  }

  /**
   * @param statefulRules An array of individual stateful rules inspection criteria to be used
   * together in a stateful rule group.
   * Use this option to specify simple Suricata rules with protocol, source and destination, ports,
   * direction, and rule options. For information about the Suricata `Rules` format, see [Rules
   * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
   * .
   */
  public fun statefulRules(statefulRules: Collection<Any>) {
    _statefulRules.addAll(statefulRules)
  }

  /**
   * @param statefulRules An array of individual stateful rules inspection criteria to be used
   * together in a stateful rule group.
   * Use this option to specify simple Suricata rules with protocol, source and destination, ports,
   * direction, and rule options. For information about the Suricata `Rules` format, see [Rules
   * Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
   * .
   */
  public fun statefulRules(statefulRules: IResolvable) {
    cdkBuilder.statefulRules(statefulRules)
  }

  /**
   * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a stateless
   * rule group.
   */
  public fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable) {
    cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
  }

  /**
   * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a stateless
   * rule group.
   */
  public
      fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: CfnRuleGroup.StatelessRulesAndCustomActionsProperty) {
    cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
  }

  public fun build(): CfnRuleGroup.RulesSourceProperty {
    if(_statefulRules.isNotEmpty()) cdkBuilder.statefulRules(_statefulRules)
    return cdkBuilder.build()
  }
}
