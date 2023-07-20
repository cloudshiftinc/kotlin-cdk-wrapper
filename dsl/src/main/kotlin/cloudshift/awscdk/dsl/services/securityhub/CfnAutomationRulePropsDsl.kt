@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import software.amazon.awscdk.services.securityhub.CfnAutomationRuleProps

@CdkDslMarker
public class CfnAutomationRulePropsDsl {
  private val cdkBuilder: CfnAutomationRuleProps.Builder = CfnAutomationRuleProps.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun criteria(criteria: IResolvable) {
    cdkBuilder.criteria(criteria)
  }

  public fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty) {
    cdkBuilder.criteria(criteria)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun isTerminal(isTerminal: Boolean) {
    cdkBuilder.isTerminal(isTerminal)
  }

  public fun isTerminal(isTerminal: IResolvable) {
    cdkBuilder.isTerminal(isTerminal)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun ruleOrder(ruleOrder: Number) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  public fun ruleStatus(ruleStatus: String) {
    cdkBuilder.ruleStatus(ruleStatus)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAutomationRuleProps {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
