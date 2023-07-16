@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.CfnAggregationAuthorization
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConformancePack
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConformancePack
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheck
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.events.Rule

public inline fun AccessKeysRotated.onComplianceChange(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun AccessKeysRotated.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun AccessKeysRotated.onReEvaluationStatus(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}

public inline fun CfnAggregationAuthorization.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConfigRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnConfigRule.setScope(block: CfnConfigRuleScopePropertyDsl.() -> Unit = {}) {
  val builder = CfnConfigRuleScopePropertyDsl()
  builder.apply(block)
  return setScope(builder.build())
}

public inline fun CfnConfigRule.setSource(block: CfnConfigRuleSourcePropertyDsl.() -> Unit = {}) {
  val builder = CfnConfigRuleSourcePropertyDsl()
  builder.apply(block)
  return setSource(builder.build())
}

public inline fun CfnConfigurationAggregator.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationAggregator.setOrganizationAggregationSource(block: CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl()
  builder.apply(block)
  return setOrganizationAggregationSource(builder.build())
}

public inline fun CfnConfigurationRecorder.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnConfigurationRecorder.setRecordingGroup(block: CfnConfigurationRecorderRecordingGroupPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationRecorderRecordingGroupPropertyDsl()
  builder.apply(block)
  return setRecordingGroup(builder.build())
}

public inline fun CfnConformancePack.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDeliveryChannel.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDeliveryChannel.setConfigSnapshotDeliveryProperties(block: CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl()
  builder.apply(block)
  return setConfigSnapshotDeliveryProperties(builder.build())
}

public inline fun CfnOrganizationConfigRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationCustomPolicyRuleMetadata(block: CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationCustomPolicyRuleMetadata(builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationCustomRuleMetadata(block: CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationCustomRuleMetadata(builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationManagedRuleMetadata(block: CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationManagedRuleMetadata(builder.build())
}

public inline fun CfnOrganizationConformancePack.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRemediationConfiguration.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnRemediationConfiguration.setExecutionControls(block: CfnRemediationConfigurationExecutionControlsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRemediationConfigurationExecutionControlsPropertyDsl()
  builder.apply(block)
  return setExecutionControls(builder.build())
}

public inline fun CfnStoredQuery.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CloudFormationStackDriftDetectionCheck.onComplianceChange(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun CloudFormationStackDriftDetectionCheck.onEvent(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun CloudFormationStackDriftDetectionCheck.onReEvaluationStatus(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}

public inline fun CloudFormationStackNotificationCheck.onComplianceChange(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun CloudFormationStackNotificationCheck.onEvent(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun CloudFormationStackNotificationCheck.onReEvaluationStatus(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}

public inline fun CustomPolicy.onComplianceChange(arg0: String, block: OnEventOptionsDsl.() -> Unit
    = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun CustomPolicy.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun CustomPolicy.onReEvaluationStatus(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}

public inline fun CustomRule.onComplianceChange(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun CustomRule.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun CustomRule.onReEvaluationStatus(arg0: String, block: OnEventOptionsDsl.() -> Unit
    = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}

public inline fun ManagedRule.onComplianceChange(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0,builder.build())
}

public inline fun ManagedRule.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun ManagedRule.onReEvaluationStatus(arg0: String, block: OnEventOptionsDsl.() -> Unit
    = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0,builder.build())
}
