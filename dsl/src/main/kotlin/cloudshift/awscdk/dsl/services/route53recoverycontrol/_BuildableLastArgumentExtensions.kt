@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.route53recoverycontrol.CfnCluster
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel
import software.amazon.awscdk.services.route53recoverycontrol.CfnRoutingControl
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

public inline fun CfnCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnControlPanel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRoutingControl.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSafetyRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnSafetyRule.setRuleConfig(block: CfnSafetyRuleRuleConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSafetyRuleRuleConfigPropertyDsl()
  builder.apply(block)
  return setRuleConfig(builder.build())
}
