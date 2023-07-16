@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.amazon.awscdk.services.xray.CfnSamplingRule

public inline fun CfnGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnGroup.setInsightsConfiguration(block: CfnGroupInsightsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGroupInsightsConfigurationPropertyDsl()
  builder.apply(block)
  return setInsightsConfiguration(builder.build())
}

public inline fun CfnResourcePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnSamplingRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnSamplingRule.setSamplingRule(block: CfnSamplingRuleSamplingRulePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSamplingRuleSamplingRulePropertyDsl()
  builder.apply(block)
  return setSamplingRule(builder.build())
}
