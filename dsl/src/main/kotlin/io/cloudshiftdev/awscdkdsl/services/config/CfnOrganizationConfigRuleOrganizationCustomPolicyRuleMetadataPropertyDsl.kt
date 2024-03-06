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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

/**
 * An object that specifies metadata for your organization's AWS Config Custom Policy rule.
 *
 * The metadata includes the runtime system in use, which accounts have debug logging enabled, and
 * other custom rule metadata, such as resource type, resource ID of AWS resource, and organization
 * trigger types that initiate AWS Config to evaluate AWS resources against a rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * OrganizationCustomPolicyRuleMetadataProperty organizationCustomPolicyRuleMetadataProperty =
 * OrganizationCustomPolicyRuleMetadataProperty.builder()
 * .policyText("policyText")
 * .runtime("runtime")
 * // the properties below are optional
 * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl {
    private val cdkBuilder:
        CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder =
        CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.builder()

    private val _debugLogDeliveryAccounts: MutableList<String> = mutableListOf()

    private val _organizationConfigRuleTriggerTypes: MutableList<String> = mutableListOf()

    private val _resourceTypesScope: MutableList<String> = mutableListOf()

    /**
     * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for your
     *   organization AWS Config Custom Policy rule. List is null when debug logging is enabled for
     *   all accounts.
     */
    public fun debugLogDeliveryAccounts(vararg debugLogDeliveryAccounts: String) {
        _debugLogDeliveryAccounts.addAll(listOf(*debugLogDeliveryAccounts))
    }

    /**
     * @param debugLogDeliveryAccounts A list of accounts that you can enable debug logging for your
     *   organization AWS Config Custom Policy rule. List is null when debug logging is enabled for
     *   all accounts.
     */
    public fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: Collection<String>) {
        _debugLogDeliveryAccounts.addAll(debugLogDeliveryAccounts)
    }

    /**
     * @param description The description that you provide for your organization AWS Config Custom
     *   Policy rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param inputParameters A string, in JSON format, that is passed to your organization AWS
     *   Config Custom Policy rule.
     */
    public fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     *   for a rule. Your AWS Config Custom Policy rule is triggered when AWS Config delivers the
     *   configuration snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS Config
     *   to run an evaluation for a rule. For AWS Config Custom Policy rules, AWS Config supports
     *   change-initiated notification types:
     * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers a
     *   configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
     *   delivers an oversized configuration item. AWS Config may generate this notification type
     *   when a resource changes and the notification exceeds the maximum size allowed by Amazon
     *   SNS.
     */
    public fun organizationConfigRuleTriggerTypes(
        vararg organizationConfigRuleTriggerTypes: String
    ) {
        _organizationConfigRuleTriggerTypes.addAll(listOf(*organizationConfigRuleTriggerTypes))
    }

    /**
     * @param organizationConfigRuleTriggerTypes The type of notification that initiates AWS Config
     *   to run an evaluation for a rule. For AWS Config Custom Policy rules, AWS Config supports
     *   change-initiated notification types:
     * * `ConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config delivers a
     *   configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Initiates an evaluation when AWS Config
     *   delivers an oversized configuration item. AWS Config may generate this notification type
     *   when a resource changes and the notification exceeds the maximum size allowed by Amazon
     *   SNS.
     */
    public fun organizationConfigRuleTriggerTypes(
        organizationConfigRuleTriggerTypes: Collection<String>
    ) {
        _organizationConfigRuleTriggerTypes.addAll(organizationConfigRuleTriggerTypes)
    }

    /**
     * @param policyText The policy definition containing the logic for your organization AWS Config
     *   Custom Policy rule.
     */
    public fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
    }

    /** @param resourceIdScope The ID of the AWS resource that was evaluated. */
    public fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
    }

    /** @param resourceTypesScope The type of the AWS resource that was evaluated. */
    public fun resourceTypesScope(vararg resourceTypesScope: String) {
        _resourceTypesScope.addAll(listOf(*resourceTypesScope))
    }

    /** @param resourceTypesScope The type of the AWS resource that was evaluated. */
    public fun resourceTypesScope(resourceTypesScope: Collection<String>) {
        _resourceTypesScope.addAll(resourceTypesScope)
    }

    /**
     * @param runtime The runtime system for your organization AWS Config Custom Policy rules. Guard
     *   is a policy-as-code language that allows you to write policies that are enforced by AWS
     *   Config Custom Policy rules. For more information about Guard, see the
     *   [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     *   .
     */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    /**
     * @param tagKeyScope One part of a key-value pair that make up a tag. A key is a general label
     *   that acts like a category for more specific tag values.
     */
    public fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
    }

    /**
     * @param tagValueScope The optional part of a key-value pair that make up a tag. A value acts
     *   as a descriptor within a tag category (key).
     */
    public fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
    }

    public fun build(): CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty {
        if (_debugLogDeliveryAccounts.isNotEmpty())
            cdkBuilder.debugLogDeliveryAccounts(_debugLogDeliveryAccounts)
        if (_organizationConfigRuleTriggerTypes.isNotEmpty())
            cdkBuilder.organizationConfigRuleTriggerTypes(_organizationConfigRuleTriggerTypes)
        if (_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
        return cdkBuilder.build()
    }
}
