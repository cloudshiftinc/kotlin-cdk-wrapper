@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
 * stateful rule groups and other settings.
 */
public inline
    fun CfnFirewallPolicy.setFirewallPolicy(block: CfnFirewallPolicyFirewallPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnFirewallPolicyFirewallPolicyPropertyDsl()
  builder.apply(block)
  return setFirewallPolicy(builder.build())
}

/**
 * Defines how AWS Network Firewall performs logging for a `Firewall` .
 */
public inline
    fun CfnLoggingConfiguration.setLoggingConfiguration(block: CfnLoggingConfigurationLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnLoggingConfigurationLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

/**
 * An object that defines the rule group rules.
 */
public inline fun CfnRuleGroup.setRuleGroup(block: CfnRuleGroupRuleGroupPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnRuleGroupRuleGroupPropertyDsl()
  builder.apply(block)
  return setRuleGroup(builder.build())
}
