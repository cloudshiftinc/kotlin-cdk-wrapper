@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.ICfnRuleConditionExpression
import software.amazon.awscdk.services.servicecatalog.TemplateRule
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion

@CdkDslMarker
public class TemplateRuleDsl {
  private val cdkBuilder: TemplateRule.Builder = TemplateRule.builder()

  private val _assertions: MutableList<TemplateRuleAssertion> = mutableListOf()

  /**
   * @param assertions A list of assertions that make up the rule. 
   */
  public fun assertions(assertions: TemplateRuleAssertionDsl.() -> Unit) {
    _assertions.add(TemplateRuleAssertionDsl().apply(assertions).build())
  }

  /**
   * @param assertions A list of assertions that make up the rule. 
   */
  public fun assertions(assertions: Collection<TemplateRuleAssertion>) {
    _assertions.addAll(assertions)
  }

  /**
   * @param condition Specify when to apply rule with a rule-specific intrinsic function.
   */
  public fun condition(condition: ICfnRuleConditionExpression) {
    cdkBuilder.condition(condition)
  }

  /**
   * @param ruleName Name of the rule. 
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun build(): TemplateRule {
    if(_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
    return cdkBuilder.build()
  }
}
