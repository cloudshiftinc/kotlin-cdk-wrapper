@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps
import software.amazon.awscdk.services.networkfirewall.CfnFirewallProps
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps
import software.constructs.Construct

public object networkfirewall {
  public inline fun cfnFirewall(
    scope: Construct,
    id: String,
    block: CfnFirewallDsl.() -> Unit = {},
  ): CfnFirewall {
    val builder = CfnFirewallDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFirewallPolicy(
    scope: Construct,
    id: String,
    block: CfnFirewallPolicyDsl.() -> Unit = {},
  ): CfnFirewallPolicy {
    val builder = CfnFirewallPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyActionDefinitionProperty(block: CfnFirewallPolicyActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.ActionDefinitionProperty {
    val builder = CfnFirewallPolicyActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyCustomActionProperty(block: CfnFirewallPolicyCustomActionPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.CustomActionProperty {
    val builder = CfnFirewallPolicyCustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyDimensionProperty(block: CfnFirewallPolicyDimensionPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.DimensionProperty {
    val builder = CfnFirewallPolicyDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyFirewallPolicyProperty(block: CfnFirewallPolicyFirewallPolicyPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.FirewallPolicyProperty {
    val builder = CfnFirewallPolicyFirewallPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyIPSetProperty(block: CfnFirewallPolicyIPSetPropertyDsl.() -> Unit = {}):
      CfnFirewallPolicy.IPSetProperty {
    val builder = CfnFirewallPolicyIPSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyPolicyVariablesProperty(block: CfnFirewallPolicyPolicyVariablesPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.PolicyVariablesProperty {
    val builder = CfnFirewallPolicyPolicyVariablesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFirewallPolicyProps(block: CfnFirewallPolicyPropsDsl.() -> Unit = {}):
      CfnFirewallPolicyProps {
    val builder = CfnFirewallPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyPublishMetricActionProperty(block: CfnFirewallPolicyPublishMetricActionPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.PublishMetricActionProperty {
    val builder = CfnFirewallPolicyPublishMetricActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyStatefulEngineOptionsProperty(block: CfnFirewallPolicyStatefulEngineOptionsPropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.StatefulEngineOptionsProperty {
    val builder = CfnFirewallPolicyStatefulEngineOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyStatefulRuleGroupOverrideProperty(block: CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.StatefulRuleGroupOverrideProperty {
    val builder = CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyStatefulRuleGroupReferenceProperty(block: CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.StatefulRuleGroupReferenceProperty {
    val builder = CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallPolicyStatelessRuleGroupReferenceProperty(block: CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl.() -> Unit
      = {}): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty {
    val builder = CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFirewallProps(block: CfnFirewallPropsDsl.() -> Unit = {}): CfnFirewallProps {
    val builder = CfnFirewallPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFirewallSubnetMappingProperty(block: CfnFirewallSubnetMappingPropertyDsl.() -> Unit =
      {}): CfnFirewall.SubnetMappingProperty {
    val builder = CfnFirewallSubnetMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggingConfiguration(
    scope: Construct,
    id: String,
    block: CfnLoggingConfigurationDsl.() -> Unit = {},
  ): CfnLoggingConfiguration {
    val builder = CfnLoggingConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationLogDestinationConfigProperty(block: CfnLoggingConfigurationLogDestinationConfigPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.LogDestinationConfigProperty {
    val builder = CfnLoggingConfigurationLogDestinationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoggingConfigurationLoggingConfigurationProperty(block: CfnLoggingConfigurationLoggingConfigurationPropertyDsl.() -> Unit
      = {}): CfnLoggingConfiguration.LoggingConfigurationProperty {
    val builder = CfnLoggingConfigurationLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoggingConfigurationProps(block: CfnLoggingConfigurationPropsDsl.() -> Unit =
      {}): CfnLoggingConfigurationProps {
    val builder = CfnLoggingConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroup(
    scope: Construct,
    id: String,
    block: CfnRuleGroupDsl.() -> Unit = {},
  ): CfnRuleGroup {
    val builder = CfnRuleGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupActionDefinitionProperty(block: CfnRuleGroupActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.ActionDefinitionProperty {
    val builder = CfnRuleGroupActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupAddressProperty(block: CfnRuleGroupAddressPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.AddressProperty {
    val builder = CfnRuleGroupAddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupCustomActionProperty(block: CfnRuleGroupCustomActionPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.CustomActionProperty {
    val builder = CfnRuleGroupCustomActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupDimensionProperty(block: CfnRuleGroupDimensionPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.DimensionProperty {
    val builder = CfnRuleGroupDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupHeaderProperty(block: CfnRuleGroupHeaderPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.HeaderProperty {
    val builder = CfnRuleGroupHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupIPSetProperty(block: CfnRuleGroupIPSetPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.IPSetProperty {
    val builder = CfnRuleGroupIPSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupIPSetReferenceProperty(block: CfnRuleGroupIPSetReferencePropertyDsl.() -> Unit
      = {}): CfnRuleGroup.IPSetReferenceProperty {
    val builder = CfnRuleGroupIPSetReferencePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupMatchAttributesProperty(block: CfnRuleGroupMatchAttributesPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.MatchAttributesProperty {
    val builder = CfnRuleGroupMatchAttributesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupPortRangeProperty(block: CfnRuleGroupPortRangePropertyDsl.() -> Unit
      = {}): CfnRuleGroup.PortRangeProperty {
    val builder = CfnRuleGroupPortRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupPortSetProperty(block: CfnRuleGroupPortSetPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.PortSetProperty {
    val builder = CfnRuleGroupPortSetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupProps(block: CfnRuleGroupPropsDsl.() -> Unit = {}):
      CfnRuleGroupProps {
    val builder = CfnRuleGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupPublishMetricActionProperty(block: CfnRuleGroupPublishMetricActionPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.PublishMetricActionProperty {
    val builder = CfnRuleGroupPublishMetricActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupReferenceSetsProperty(block: CfnRuleGroupReferenceSetsPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.ReferenceSetsProperty {
    val builder = CfnRuleGroupReferenceSetsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRuleDefinitionProperty(block: CfnRuleGroupRuleDefinitionPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RuleDefinitionProperty {
    val builder = CfnRuleGroupRuleDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleGroupRuleGroupProperty(block: CfnRuleGroupRuleGroupPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RuleGroupProperty {
    val builder = CfnRuleGroupRuleGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRuleOptionProperty(block: CfnRuleGroupRuleOptionPropertyDsl.() -> Unit = {}):
      CfnRuleGroup.RuleOptionProperty {
    val builder = CfnRuleGroupRuleOptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRuleVariablesProperty(block: CfnRuleGroupRuleVariablesPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.RuleVariablesProperty {
    val builder = CfnRuleGroupRuleVariablesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRulesSourceListProperty(block: CfnRuleGroupRulesSourceListPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.RulesSourceListProperty {
    val builder = CfnRuleGroupRulesSourceListPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupRulesSourceProperty(block: CfnRuleGroupRulesSourcePropertyDsl.() -> Unit =
      {}): CfnRuleGroup.RulesSourceProperty {
    val builder = CfnRuleGroupRulesSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupStatefulRuleOptionsProperty(block: CfnRuleGroupStatefulRuleOptionsPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.StatefulRuleOptionsProperty {
    val builder = CfnRuleGroupStatefulRuleOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupStatefulRuleProperty(block: CfnRuleGroupStatefulRulePropertyDsl.() -> Unit =
      {}): CfnRuleGroup.StatefulRuleProperty {
    val builder = CfnRuleGroupStatefulRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupStatelessRuleProperty(block: CfnRuleGroupStatelessRulePropertyDsl.() -> Unit =
      {}): CfnRuleGroup.StatelessRuleProperty {
    val builder = CfnRuleGroupStatelessRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupStatelessRulesAndCustomActionsProperty(block: CfnRuleGroupStatelessRulesAndCustomActionsPropertyDsl.() -> Unit
      = {}): CfnRuleGroup.StatelessRulesAndCustomActionsProperty {
    val builder = CfnRuleGroupStatelessRulesAndCustomActionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleGroupTCPFlagFieldProperty(block: CfnRuleGroupTCPFlagFieldPropertyDsl.() -> Unit =
      {}): CfnRuleGroup.TCPFlagFieldProperty {
    val builder = CfnRuleGroupTCPFlagFieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
