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
