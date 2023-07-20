@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnGroupProps
import software.amazon.awscdk.services.xray.CfnResourcePolicy
import software.amazon.awscdk.services.xray.CfnResourcePolicyProps
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps
import software.constructs.Construct

public object xray {
  public inline fun cfnGroup(
    scope: Construct,
    id: String,
    block: CfnGroupDsl.() -> Unit = {},
  ): CfnGroup {
    val builder = CfnGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGroupInsightsConfigurationProperty(block: CfnGroupInsightsConfigurationPropertyDsl.() -> Unit
      = {}): CfnGroup.InsightsConfigurationProperty {
    val builder = CfnGroupInsightsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGroupProps(block: CfnGroupPropsDsl.() -> Unit = {}): CfnGroupProps {
    val builder = CfnGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSamplingRule(
    scope: Construct,
    id: String,
    block: CfnSamplingRuleDsl.() -> Unit = {},
  ): CfnSamplingRule {
    val builder = CfnSamplingRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSamplingRuleProps(block: CfnSamplingRulePropsDsl.() -> Unit = {}):
      CfnSamplingRuleProps {
    val builder = CfnSamplingRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSamplingRuleSamplingRuleProperty(block: CfnSamplingRuleSamplingRulePropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleProperty {
    val builder = CfnSamplingRuleSamplingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSamplingRuleSamplingRuleRecordProperty(block: CfnSamplingRuleSamplingRuleRecordPropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleRecordProperty {
    val builder = CfnSamplingRuleSamplingRuleRecordPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSamplingRuleSamplingRuleUpdateProperty(block: CfnSamplingRuleSamplingRuleUpdatePropertyDsl.() -> Unit
      = {}): CfnSamplingRule.SamplingRuleUpdateProperty {
    val builder = CfnSamplingRuleSamplingRuleUpdatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
