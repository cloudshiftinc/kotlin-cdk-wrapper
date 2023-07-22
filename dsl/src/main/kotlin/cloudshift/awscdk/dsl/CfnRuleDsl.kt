@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnRule
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.ICfnConditionExpression
import software.constructs.Construct

/**
 * The Rules that define template constraints in an AWS Service Catalog portfolio describe when end
 * users can use the template and which values they can specify for parameters that are declared in the
 * AWS CloudFormation template used to create the product they are attempting to use.
 *
 * Rules
 * are useful for preventing end users from inadvertently specifying an incorrect value.
 * For example, you can add a rule to verify whether end users specified a valid subnet in a
 * given VPC or used m1.small instance types for test environments. AWS CloudFormation uses
 * rules to validate parameter values before it creates the resources for the product.
 *
 * A rule can include a RuleCondition property and must include an Assertions property.
 * For each rule, you can define only one rule condition; you can define one or more asserts within
 * the Assertions property.
 * You define a rule condition and assertions by using rule-specific intrinsic functions.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the rule
 * CfnParameter myParameter;
 * CfnRule rule = cfnTemplate.getRule("MyRule");
 * rule.addAssertion(Fn.conditionContains(List.of("m1.small"), myParameter.getValueAsString()),
 * "MyParameter has to be m1.small");
 * ```
 */
@CdkDslMarker
public class CfnRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

  private val _assertions: MutableList<CfnRuleAssertion> = mutableListOf()

  /**
   * Assertions which define the rule.
   *
   * Default: - No assertions for the rule.
   *
   * @param assertions Assertions which define the rule. 
   */
  public fun assertions(assertions: CfnRuleAssertionDsl.() -> Unit) {
    _assertions.add(CfnRuleAssertionDsl().apply(assertions).build())
  }

  /**
   * Assertions which define the rule.
   *
   * Default: - No assertions for the rule.
   *
   * @param assertions Assertions which define the rule. 
   */
  public fun assertions(assertions: Collection<CfnRuleAssertion>) {
    _assertions.addAll(assertions)
  }

  /**
   * If the rule condition evaluates to false, the rule doesn't take effect.
   *
   * If the function in the rule condition evaluates to true, expressions in each assert are
   * evaluated and applied.
   *
   * Default: - Rule's assertions will always take effect.
   *
   * @param ruleCondition If the rule condition evaluates to false, the rule doesn't take effect. 
   */
  public fun ruleCondition(ruleCondition: ICfnConditionExpression) {
    cdkBuilder.ruleCondition(ruleCondition)
  }

  public fun build(): CfnRule {
    if(_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
    return cdkBuilder.build()
  }
}
