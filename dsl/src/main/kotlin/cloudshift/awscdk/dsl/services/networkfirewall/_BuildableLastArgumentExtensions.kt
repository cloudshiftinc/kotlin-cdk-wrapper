@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

public inline fun CfnFirewall.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnFirewallPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFirewallPolicy.setFirewallPolicy(block: CfnFirewallPolicyFirewallPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFirewallPolicyFirewallPolicyPropertyDsl()
  builder.apply(block)
  return setFirewallPolicy(builder.build())
}

public inline fun CfnLoggingConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnLoggingConfiguration.setLoggingConfiguration(block: CfnLoggingConfigurationLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggingConfigurationLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

public inline fun CfnRuleGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRuleGroup.setRuleGroup(block: CfnRuleGroupRuleGroupPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRuleGroupRuleGroupPropertyDsl()
  builder.apply(block)
  return setRuleGroup(builder.build())
}
