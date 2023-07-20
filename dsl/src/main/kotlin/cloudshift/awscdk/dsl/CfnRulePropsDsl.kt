@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.CfnRuleProps
import software.amazon.awscdk.ICfnConditionExpression

@CdkDslMarker
public class CfnRulePropsDsl {
  private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

  private val _assertions: MutableList<CfnRuleAssertion> = mutableListOf()

  public fun assertions(assertions: CfnRuleAssertionDsl.() -> Unit) {
    _assertions.add(CfnRuleAssertionDsl().apply(assertions).build())
  }

  public fun assertions(assertions: Collection<CfnRuleAssertion>) {
    _assertions.addAll(assertions)
  }

  public fun ruleCondition(ruleCondition: ICfnConditionExpression) {
    cdkBuilder.ruleCondition(ruleCondition)
  }

  public fun build(): CfnRuleProps {
    if(_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
    return cdkBuilder.build()
  }
}
