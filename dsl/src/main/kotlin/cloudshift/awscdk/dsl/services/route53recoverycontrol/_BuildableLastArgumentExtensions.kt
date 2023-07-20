@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import kotlin.Unit
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

public inline fun CfnSafetyRule.setRuleConfig(block: CfnSafetyRuleRuleConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSafetyRuleRuleConfigPropertyDsl()
  builder.apply(block)
  return setRuleConfig(builder.build())
}

public inline
    fun CfnSafetyRule.setAssertionRule(block: CfnSafetyRuleAssertionRulePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSafetyRuleAssertionRulePropertyDsl()
  builder.apply(block)
  return setAssertionRule(builder.build())
}

public inline fun CfnSafetyRule.setGatingRule(block: CfnSafetyRuleGatingRulePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSafetyRuleGatingRulePropertyDsl()
  builder.apply(block)
  return setGatingRule(builder.build())
}
