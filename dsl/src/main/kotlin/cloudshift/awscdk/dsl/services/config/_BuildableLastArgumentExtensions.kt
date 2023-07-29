@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.IRule
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.events.Rule

/** Provides an organization and list of regions to be aggregated. */
public inline fun CfnConfigurationAggregator.setOrganizationAggregationSource(
    block: CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl()
    builder.apply(block)
    return setOrganizationAggregationSource(builder.build())
}

/**
 * Indicates whether to record configurations for all supported resources or for a list of resource
 * types.
 */
public inline fun CfnConfigurationRecorder.setRecordingGroup(
    block: CfnConfigurationRecorderRecordingGroupPropertyDsl.() -> Unit = {}
) {
    val builder = CfnConfigurationRecorderRecordingGroupPropertyDsl()
    builder.apply(block)
    return setRecordingGroup(builder.build())
}

/**
 * Defines a EventBridge event rule which triggers for rule compliance events.
 *
 * @param id
 * @param options
 */
public inline fun IRule.onComplianceChange(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onComplianceChange(arg0, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun IRule.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Defines a EventBridge event rule which triggers for rule re-evaluation status events.
 *
 * @param id
 * @param options
 */
public inline fun IRule.onReEvaluationStatus(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReEvaluationStatus(arg0, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule compliance events.
 *
 * @param id
 * @param options
 */
public inline fun CustomPolicy.onComplianceChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onComplianceChange(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun CustomPolicy.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
 *
 * @param id
 * @param options
 */
public inline fun CustomPolicy.onReEvaluationStatus(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReEvaluationStatus(id, builder.build())
}

/**
 * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
 */
public inline fun CfnDeliveryChannel.setConfigSnapshotDeliveryProperties(
    block: CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl()
    builder.apply(block)
    return setConfigSnapshotDeliveryProperties(builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule compliance events.
 *
 * @param id
 * @param options
 */
public inline fun CustomRule.onComplianceChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onComplianceChange(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun CustomRule.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
 *
 * @param id
 * @param options
 */
public inline fun CustomRule.onReEvaluationStatus(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReEvaluationStatus(id, builder.build())
}

/** An ExecutionControls object. */
public inline fun CfnRemediationConfiguration.setExecutionControls(
    block: CfnRemediationConfigurationExecutionControlsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRemediationConfigurationExecutionControlsPropertyDsl()
    builder.apply(block)
    return setExecutionControls(builder.build())
}

/**
 * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
 * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
 * the function to evaluate your AWS resources.
 */
public inline fun CfnConfigRule.setSource(block: CfnConfigRuleSourcePropertyDsl.() -> Unit = {}) {
    val builder = CfnConfigRuleSourcePropertyDsl()
    builder.apply(block)
    return setSource(builder.build())
}

/** Defines which resources can trigger an evaluation for the rule. */
public inline fun CfnConfigRule.setScope(block: CfnConfigRuleScopePropertyDsl.() -> Unit = {}) {
    val builder = CfnConfigRuleScopePropertyDsl()
    builder.apply(block)
    return setScope(builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule compliance events.
 *
 * @param id
 * @param options
 */
public inline fun ManagedRule.onComplianceChange(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onComplianceChange(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun ManagedRule.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines an EventBridge event rule which triggers for rule re-evaluation status events.
 *
 * @param id
 * @param options
 */
public inline fun ManagedRule.onReEvaluationStatus(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onReEvaluationStatus(id, builder.build())
}

/**  */
public inline fun CfnOrganizationConfigRule.setOrganizationCustomPolicyRuleMetadata(
    block: CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl()
    builder.apply(block)
    return setOrganizationCustomPolicyRuleMetadata(builder.build())
}

/** An `OrganizationCustomRuleMetadata` object. */
public inline fun CfnOrganizationConfigRule.setOrganizationCustomRuleMetadata(
    block: CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl()
    builder.apply(block)
    return setOrganizationCustomRuleMetadata(builder.build())
}

/** An `OrganizationManagedRuleMetadata` object. */
public inline fun CfnOrganizationConfigRule.setOrganizationManagedRuleMetadata(
    block: CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl()
    builder.apply(block)
    return setOrganizationManagedRuleMetadata(builder.build())
}
