@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRuleGroupPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleGroupProperty.Builder =
      CfnRuleGroup.RuleGroupProperty.builder()

  /**
   * @param referenceSets The reference sets for the stateful rule group.
   */
  public fun referenceSets(referenceSets: IResolvable) {
    cdkBuilder.referenceSets(referenceSets)
  }

  /**
   * @param referenceSets The reference sets for the stateful rule group.
   */
  public fun referenceSets(referenceSets: CfnRuleGroup.ReferenceSetsProperty) {
    cdkBuilder.referenceSets(referenceSets)
  }

  /**
   * @param ruleVariables Settings that are available for use in the rules in the rule group.
   * You can only use these for stateful rule groups.
   */
  public fun ruleVariables(ruleVariables: IResolvable) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  /**
   * @param ruleVariables Settings that are available for use in the rules in the rule group.
   * You can only use these for stateful rule groups.
   */
  public fun ruleVariables(ruleVariables: CfnRuleGroup.RuleVariablesProperty) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  /**
   * @param rulesSource The stateful rules or stateless rules for the rule group. 
   */
  public fun rulesSource(rulesSource: IResolvable) {
    cdkBuilder.rulesSource(rulesSource)
  }

  /**
   * @param rulesSource The stateful rules or stateless rules for the rule group. 
   */
  public fun rulesSource(rulesSource: CfnRuleGroup.RulesSourceProperty) {
    cdkBuilder.rulesSource(rulesSource)
  }

  /**
   * @param statefulRuleOptions Additional options governing how Network Firewall handles stateful
   * rules.
   * The policies where you use your stateful rule group must have stateful rule options settings
   * that are compatible with these settings.
   */
  public fun statefulRuleOptions(statefulRuleOptions: IResolvable) {
    cdkBuilder.statefulRuleOptions(statefulRuleOptions)
  }

  /**
   * @param statefulRuleOptions Additional options governing how Network Firewall handles stateful
   * rules.
   * The policies where you use your stateful rule group must have stateful rule options settings
   * that are compatible with these settings.
   */
  public fun statefulRuleOptions(statefulRuleOptions: CfnRuleGroup.StatefulRuleOptionsProperty) {
    cdkBuilder.statefulRuleOptions(statefulRuleOptions)
  }

  public fun build(): CfnRuleGroup.RuleGroupProperty = cdkBuilder.build()
}
