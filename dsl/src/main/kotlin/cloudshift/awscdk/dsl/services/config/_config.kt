@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.AccessKeysRotatedProps
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnConformancePackProps
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnDeliveryChannelProps
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnRemediationConfigurationProps
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomPolicyProps
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.CustomRuleProps
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.amazon.awscdk.services.config.RuleProps
import software.constructs.Construct

public object config {
  public inline fun accessKeysRotated(
    scope: Construct,
    id: String,
    block: AccessKeysRotatedDsl.() -> Unit = {},
  ): AccessKeysRotated {
    val builder = AccessKeysRotatedDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun accessKeysRotatedProps(block: AccessKeysRotatedPropsDsl.() -> Unit = {}):
      AccessKeysRotatedProps {
    val builder = AccessKeysRotatedPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAggregationAuthorization(
    scope: Construct,
    id: String,
    block: CfnAggregationAuthorizationDsl.() -> Unit = {},
  ): CfnAggregationAuthorization {
    val builder = CfnAggregationAuthorizationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAggregationAuthorizationProps(block: CfnAggregationAuthorizationPropsDsl.() -> Unit =
      {}): CfnAggregationAuthorizationProps {
    val builder = CfnAggregationAuthorizationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigRule(
    scope: Construct,
    id: String,
    block: CfnConfigRuleDsl.() -> Unit = {},
  ): CfnConfigRule {
    val builder = CfnConfigRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigRuleCustomPolicyDetailsProperty(block: CfnConfigRuleCustomPolicyDetailsPropertyDsl.() -> Unit
      = {}): CfnConfigRule.CustomPolicyDetailsProperty {
    val builder = CfnConfigRuleCustomPolicyDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigRuleProps(block: CfnConfigRulePropsDsl.() -> Unit = {}):
      CfnConfigRuleProps {
    val builder = CfnConfigRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigRuleScopeProperty(block: CfnConfigRuleScopePropertyDsl.() -> Unit =
      {}): CfnConfigRule.ScopeProperty {
    val builder = CfnConfigRuleScopePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigRuleSourceDetailProperty(block: CfnConfigRuleSourceDetailPropertyDsl.() -> Unit =
      {}): CfnConfigRule.SourceDetailProperty {
    val builder = CfnConfigRuleSourceDetailPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigRuleSourceProperty(block: CfnConfigRuleSourcePropertyDsl.() -> Unit =
      {}): CfnConfigRule.SourceProperty {
    val builder = CfnConfigRuleSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationAggregator(
    scope: Construct,
    id: String,
    block: CfnConfigurationAggregatorDsl.() -> Unit = {},
  ): CfnConfigurationAggregator {
    val builder = CfnConfigurationAggregatorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationAggregatorAccountAggregationSourceProperty(block: CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl.() -> Unit
      = {}): CfnConfigurationAggregator.AccountAggregationSourceProperty {
    val builder = CfnConfigurationAggregatorAccountAggregationSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationAggregatorOrganizationAggregationSourceProperty(block: CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl.() -> Unit
      = {}): CfnConfigurationAggregator.OrganizationAggregationSourceProperty {
    val builder = CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationAggregatorProps(block: CfnConfigurationAggregatorPropsDsl.() -> Unit =
      {}): CfnConfigurationAggregatorProps {
    val builder = CfnConfigurationAggregatorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationRecorder(
    scope: Construct,
    id: String,
    block: CfnConfigurationRecorderDsl.() -> Unit = {},
  ): CfnConfigurationRecorder {
    val builder = CfnConfigurationRecorderDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConfigurationRecorderProps(block: CfnConfigurationRecorderPropsDsl.() -> Unit
      = {}): CfnConfigurationRecorderProps {
    val builder = CfnConfigurationRecorderPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConfigurationRecorderRecordingGroupProperty(block: CfnConfigurationRecorderRecordingGroupPropertyDsl.() -> Unit
      = {}): CfnConfigurationRecorder.RecordingGroupProperty {
    val builder = CfnConfigurationRecorderRecordingGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConformancePack(
    scope: Construct,
    id: String,
    block: CfnConformancePackDsl.() -> Unit = {},
  ): CfnConformancePack {
    val builder = CfnConformancePackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConformancePackConformancePackInputParameterProperty(block: CfnConformancePackConformancePackInputParameterPropertyDsl.() -> Unit
      = {}): CfnConformancePack.ConformancePackInputParameterProperty {
    val builder = CfnConformancePackConformancePackInputParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnConformancePackProps(block: CfnConformancePackPropsDsl.() -> Unit = {}):
      CfnConformancePackProps {
    val builder = CfnConformancePackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnConformancePackTemplateSSMDocumentDetailsProperty(block: CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl.() -> Unit
      = {}): CfnConformancePack.TemplateSSMDocumentDetailsProperty {
    val builder = CfnConformancePackTemplateSSMDocumentDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeliveryChannel(
    scope: Construct,
    id: String,
    block: CfnDeliveryChannelDsl.() -> Unit = {},
  ): CfnDeliveryChannel {
    val builder = CfnDeliveryChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDeliveryChannelConfigSnapshotDeliveryPropertiesProperty(block: CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl.() -> Unit
      = {}): CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty {
    val builder = CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDeliveryChannelProps(block: CfnDeliveryChannelPropsDsl.() -> Unit = {}):
      CfnDeliveryChannelProps {
    val builder = CfnDeliveryChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationConfigRule(
    scope: Construct,
    id: String,
    block: CfnOrganizationConfigRuleDsl.() -> Unit = {},
  ): CfnOrganizationConfigRule {
    val builder = CfnOrganizationConfigRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataProperty(block: CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl.() -> Unit
      = {}): CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty {
    val builder = CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConfigRuleOrganizationCustomRuleMetadataProperty(block: CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl.() -> Unit
      = {}): CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty {
    val builder = CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConfigRuleOrganizationManagedRuleMetadataProperty(block: CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl.() -> Unit
      = {}): CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty {
    val builder = CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConfigRuleProps(block: CfnOrganizationConfigRulePropsDsl.() -> Unit = {}):
      CfnOrganizationConfigRuleProps {
    val builder = CfnOrganizationConfigRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOrganizationConformancePack(
    scope: Construct,
    id: String,
    block: CfnOrganizationConformancePackDsl.() -> Unit = {},
  ): CfnOrganizationConformancePack {
    val builder = CfnOrganizationConformancePackDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConformancePackConformancePackInputParameterProperty(block: CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl.() -> Unit
      = {}): CfnOrganizationConformancePack.ConformancePackInputParameterProperty {
    val builder = CfnOrganizationConformancePackConformancePackInputParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOrganizationConformancePackProps(block: CfnOrganizationConformancePackPropsDsl.() -> Unit
      = {}): CfnOrganizationConformancePackProps {
    val builder = CfnOrganizationConformancePackPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRemediationConfiguration(
    scope: Construct,
    id: String,
    block: CfnRemediationConfigurationDsl.() -> Unit = {},
  ): CfnRemediationConfiguration {
    val builder = CfnRemediationConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationExecutionControlsProperty(block: CfnRemediationConfigurationExecutionControlsPropertyDsl.() -> Unit
      = {}): CfnRemediationConfiguration.ExecutionControlsProperty {
    val builder = CfnRemediationConfigurationExecutionControlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationProps(block: CfnRemediationConfigurationPropsDsl.() -> Unit =
      {}): CfnRemediationConfigurationProps {
    val builder = CfnRemediationConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationRemediationParameterValueProperty(block: CfnRemediationConfigurationRemediationParameterValuePropertyDsl.() -> Unit
      = {}): CfnRemediationConfiguration.RemediationParameterValueProperty {
    val builder = CfnRemediationConfigurationRemediationParameterValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationResourceValueProperty(block: CfnRemediationConfigurationResourceValuePropertyDsl.() -> Unit
      = {}): CfnRemediationConfiguration.ResourceValueProperty {
    val builder = CfnRemediationConfigurationResourceValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationSsmControlsProperty(block: CfnRemediationConfigurationSsmControlsPropertyDsl.() -> Unit
      = {}): CfnRemediationConfiguration.SsmControlsProperty {
    val builder = CfnRemediationConfigurationSsmControlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRemediationConfigurationStaticValueProperty(block: CfnRemediationConfigurationStaticValuePropertyDsl.() -> Unit
      = {}): CfnRemediationConfiguration.StaticValueProperty {
    val builder = CfnRemediationConfigurationStaticValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStoredQuery(
    scope: Construct,
    id: String,
    block: CfnStoredQueryDsl.() -> Unit = {},
  ): CfnStoredQuery {
    val builder = CfnStoredQueryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStoredQueryProps(block: CfnStoredQueryPropsDsl.() -> Unit = {}):
      CfnStoredQueryProps {
    val builder = CfnStoredQueryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudFormationStackDriftDetectionCheck(
    scope: Construct,
    id: String,
    block: CloudFormationStackDriftDetectionCheckDsl.() -> Unit = {},
  ): CloudFormationStackDriftDetectionCheck {
    val builder = CloudFormationStackDriftDetectionCheckDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cloudFormationStackDriftDetectionCheckProps(block: CloudFormationStackDriftDetectionCheckPropsDsl.() -> Unit
      = {}): CloudFormationStackDriftDetectionCheckProps {
    val builder = CloudFormationStackDriftDetectionCheckPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudFormationStackNotificationCheck(
    scope: Construct,
    id: String,
    block: CloudFormationStackNotificationCheckDsl.() -> Unit = {},
  ): CloudFormationStackNotificationCheck {
    val builder = CloudFormationStackNotificationCheckDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cloudFormationStackNotificationCheckProps(block: CloudFormationStackNotificationCheckPropsDsl.() -> Unit
      = {}): CloudFormationStackNotificationCheckProps {
    val builder = CloudFormationStackNotificationCheckPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customPolicy(
    scope: Construct,
    id: String,
    block: CustomPolicyDsl.() -> Unit = {},
  ): CustomPolicy {
    val builder = CustomPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun customPolicyProps(block: CustomPolicyPropsDsl.() -> Unit = {}):
      CustomPolicyProps {
    val builder = CustomPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customRule(
    scope: Construct,
    id: String,
    block: CustomRuleDsl.() -> Unit = {},
  ): CustomRule {
    val builder = CustomRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun customRuleProps(block: CustomRulePropsDsl.() -> Unit = {}): CustomRuleProps {
    val builder = CustomRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedRule(
    scope: Construct,
    id: String,
    block: ManagedRuleDsl.() -> Unit = {},
  ): ManagedRule {
    val builder = ManagedRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedRuleProps(block: ManagedRulePropsDsl.() -> Unit = {}): ManagedRuleProps {
    val builder = ManagedRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun ruleProps(block: RulePropsDsl.() -> Unit = {}): RuleProps {
    val builder = RulePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
