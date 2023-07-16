@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.wafv2.CfnIPSet
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import software.amazon.awscdk.services.wafv2.CfnWebACL
import software.amazon.awscdk.services.wafv2.CfnWebACLAssociation

public inline fun CfnIPSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLoggingConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRegexPatternSet.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRuleGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRuleGroup.setVisibilityConfig(block: CfnRuleGroupVisibilityConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRuleGroupVisibilityConfigPropertyDsl()
  builder.apply(block)
  return setVisibilityConfig(builder.build())
}

public inline fun CfnWebACL.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnWebACL.setAssociationConfig(block: CfnWebACLAssociationConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWebACLAssociationConfigPropertyDsl()
  builder.apply(block)
  return setAssociationConfig(builder.build())
}

public inline fun CfnWebACL.setCaptchaConfig(block: CfnWebACLCaptchaConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWebACLCaptchaConfigPropertyDsl()
  builder.apply(block)
  return setCaptchaConfig(builder.build())
}

public inline fun CfnWebACL.setChallengeConfig(block: CfnWebACLChallengeConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWebACLChallengeConfigPropertyDsl()
  builder.apply(block)
  return setChallengeConfig(builder.build())
}

public inline fun CfnWebACL.setDefaultAction(block: CfnWebACLDefaultActionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnWebACLDefaultActionPropertyDsl()
  builder.apply(block)
  return setDefaultAction(builder.build())
}

public inline
    fun CfnWebACL.setVisibilityConfig(block: CfnWebACLVisibilityConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnWebACLVisibilityConfigPropertyDsl()
  builder.apply(block)
  return setVisibilityConfig(builder.build())
}

public inline fun CfnWebACLAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
