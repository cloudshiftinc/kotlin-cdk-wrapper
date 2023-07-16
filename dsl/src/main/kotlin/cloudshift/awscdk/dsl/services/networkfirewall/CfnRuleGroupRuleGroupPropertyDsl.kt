@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRuleGroupPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleGroupProperty.Builder =
      CfnRuleGroup.RuleGroupProperty.builder()

  public fun referenceSets(referenceSets: IResolvable) {
    cdkBuilder.referenceSets(referenceSets)
  }

  public fun referenceSets(referenceSets: CfnRuleGroup.ReferenceSetsProperty) {
    cdkBuilder.referenceSets(referenceSets)
  }

  public fun ruleVariables(ruleVariables: IResolvable) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  public fun ruleVariables(ruleVariables: CfnRuleGroup.RuleVariablesProperty) {
    cdkBuilder.ruleVariables(ruleVariables)
  }

  public fun rulesSource(rulesSource: IResolvable) {
    cdkBuilder.rulesSource(rulesSource)
  }

  public fun rulesSource(rulesSource: CfnRuleGroup.RulesSourceProperty) {
    cdkBuilder.rulesSource(rulesSource)
  }

  public fun statefulRuleOptions(statefulRuleOptions: IResolvable) {
    cdkBuilder.statefulRuleOptions(statefulRuleOptions)
  }

  public fun statefulRuleOptions(statefulRuleOptions: CfnRuleGroup.StatefulRuleOptionsProperty) {
    cdkBuilder.statefulRuleOptions(statefulRuleOptions)
  }

  public fun build(): CfnRuleGroup.RuleGroupProperty = cdkBuilder.build()
}
