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
import software.constructs.Construct

@CdkDslMarker
public class CfnAutomationRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAutomationRule.Builder = CfnAutomationRule.Builder.create(scope, id)

  private val _actions: MutableList<Any> = mutableListOf()

  /**
   * One or more actions to update finding fields if a finding matches the defined criteria of the
   * rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
   * @param actions One or more actions to update finding fields if a finding matches the defined
   * criteria of the rule. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * One or more actions to update finding fields if a finding matches the defined criteria of the
   * rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
   * @param actions One or more actions to update finding fields if a finding matches the defined
   * criteria of the rule. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * One or more actions to update finding fields if a finding matches the defined criteria of the
   * rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-actions)
   * @param actions One or more actions to update finding fields if a finding matches the defined
   * criteria of the rule. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * A set of [AWS Security Finding
   * Format](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
   * Security Hub applies the rule action to the finding.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
   * @param criteria A set of [AWS Security Finding
   * Format](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
   * Security Hub applies the rule action to the finding. 
   */
  public fun criteria(criteria: IResolvable) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * A set of [AWS Security Finding
   * Format](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
   * Security Hub applies the rule action to the finding.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-criteria)
   * @param criteria A set of [AWS Security Finding
   * Format](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format.html)
   * finding field attributes and corresponding expected values that Security Hub uses to filter
   * findings. If a rule is enabled and a finding matches the conditions specified in this parameter,
   * Security Hub applies the rule action to the finding. 
   */
  public fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty) {
    cdkBuilder.criteria(criteria)
  }

  /**
   * A description of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-description)
   * @param description A description of the rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Specifies whether a rule is the last to be applied with respect to a finding that matches the
   * rule criteria.
   *
   * This is useful when a finding matches the criteria for multiple rules, and each rule has
   * different actions. If the value of this field is set to `true` for a rule, Security Hub applies
   * the rule action to a finding that matches the rule criteria and doesn't evaluate other rules for
   * the finding. The default value of this field is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
   * @param isTerminal Specifies whether a rule is the last to be applied with respect to a finding
   * that matches the rule criteria. 
   */
  public fun isTerminal(isTerminal: Boolean) {
    cdkBuilder.isTerminal(isTerminal)
  }

  /**
   * Specifies whether a rule is the last to be applied with respect to a finding that matches the
   * rule criteria.
   *
   * This is useful when a finding matches the criteria for multiple rules, and each rule has
   * different actions. If the value of this field is set to `true` for a rule, Security Hub applies
   * the rule action to a finding that matches the rule criteria and doesn't evaluate other rules for
   * the finding. The default value of this field is `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-isterminal)
   * @param isTerminal Specifies whether a rule is the last to be applied with respect to a finding
   * that matches the rule criteria. 
   */
  public fun isTerminal(isTerminal: IResolvable) {
    cdkBuilder.isTerminal(isTerminal)
  }

  /**
   * The name of the rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulename)
   * @param ruleName The name of the rule. 
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * An integer ranging from 1 to 1000 that represents the order in which the rule action is applied
   * to findings.
   *
   * Security Hub applies rules with lower values for this parameter first.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-ruleorder)
   * @param ruleOrder An integer ranging from 1 to 1000 that represents the order in which the rule
   * action is applied to findings. 
   */
  public fun ruleOrder(ruleOrder: Number) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  /**
   * Whether the rule is active after it is created.
   *
   * If this parameter is equal to `ENABLED` , Security Hub applies the rule to findings and finding
   * updates after the rule is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-rulestatus)
   * @param ruleStatus Whether the rule is active after it is created. 
   */
  public fun ruleStatus(ruleStatus: String) {
    cdkBuilder.ruleStatus(ruleStatus)
  }

  /**
   * User-defined tags that help you label the purpose of a rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-automationrule.html#cfn-securityhub-automationrule-tags)
   * @param tags User-defined tags that help you label the purpose of a rule. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAutomationRule {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
