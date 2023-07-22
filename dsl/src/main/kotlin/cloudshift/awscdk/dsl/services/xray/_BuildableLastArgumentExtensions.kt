@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnSamplingRule

/**
 * The structure containing configurations related to insights.
 */
public inline
    fun CfnGroup.setInsightsConfiguration(block: CfnGroupInsightsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGroupInsightsConfigurationPropertyDsl()
  builder.apply(block)
  return setInsightsConfiguration(builder.build())
}

/**
 * The sampling rule to be created or updated.
 */
public inline
    fun CfnSamplingRule.setSamplingRule(block: CfnSamplingRuleSamplingRulePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnSamplingRuleSamplingRulePropertyDsl()
  builder.apply(block)
  return setSamplingRule(builder.build())
}

/**
 * @deprecated this property has been deprecated
 */
public inline
    fun CfnSamplingRule.setSamplingRuleRecord(block: CfnSamplingRuleSamplingRuleRecordPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSamplingRuleSamplingRuleRecordPropertyDsl()
  builder.apply(block)
  return setSamplingRuleRecord(builder.build())
}

/**
 * @deprecated this property has been deprecated
 */
public inline
    fun CfnSamplingRule.setSamplingRuleUpdate(block: CfnSamplingRuleSamplingRuleUpdatePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnSamplingRuleSamplingRuleUpdatePropertyDsl()
  builder.apply(block)
  return setSamplingRuleUpdate(builder.build())
}
