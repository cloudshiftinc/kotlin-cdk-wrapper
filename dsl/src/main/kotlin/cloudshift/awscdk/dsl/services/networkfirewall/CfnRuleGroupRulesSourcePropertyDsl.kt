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

  public fun rulesSourceList(rulesSourceList: IResolvable) {
    cdkBuilder.rulesSourceList(rulesSourceList)
  }

  public fun rulesSourceList(rulesSourceList: CfnRuleGroup.RulesSourceListProperty) {
    cdkBuilder.rulesSourceList(rulesSourceList)
  }

  public fun rulesString(rulesString: String) {
    cdkBuilder.rulesString(rulesString)
  }

  public fun statefulRules(vararg statefulRules: Any) {
    _statefulRules.addAll(listOf(*statefulRules))
  }

  public fun statefulRules(statefulRules: Collection<Any>) {
    _statefulRules.addAll(statefulRules)
  }

  public fun statefulRules(statefulRules: IResolvable) {
    cdkBuilder.statefulRules(statefulRules)
  }

  public fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable) {
    cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
  }

  public
      fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: CfnRuleGroup.StatelessRulesAndCustomActionsProperty) {
    cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
  }

  public fun build(): CfnRuleGroup.RulesSourceProperty {
    if(_statefulRules.isNotEmpty()) cdkBuilder.statefulRules(_statefulRules)
    return cdkBuilder.build()
  }
}
