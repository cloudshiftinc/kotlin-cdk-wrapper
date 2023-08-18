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
 * organization custom rule metadata such as resource type, resource ID of AWS resource, Lambda
 * function ARN, and organization trigger types that trigger AWS Config to evaluate your AWS
 * resources against a rule.
 *
 * It also provides the frequency with which you want AWS Config to run evaluations for the rule if
 * the trigger type is periodic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * OrganizationCustomRuleMetadataProperty organizationCustomRuleMetadataProperty =
 * OrganizationCustomRuleMetadataProperty.builder()
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
 * // the properties below are optional
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustomrulemetadata.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl {
    private val cdkBuilder:
        CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder =
        CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.builder()

    private val _organizationConfigRuleTriggerTypes: MutableList<String> = mutableListOf()

    private val _resourceTypesScope: MutableList<String> = mutableListOf()

    /**
     * @param description The description that you provide for your organization AWS Config rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param inputParameters A string, in JSON format, that is passed to your organization AWS
     *   Config rule Lambda function.
     */
    public fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /** @param lambdaFunctionArn The lambda function ARN. */
    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     *   for a rule. Your custom rule is triggered when AWS Config delivers the configuration
     *   snapshot. For more information, see `ConfigSnapshotDeliveryProperties` .
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
     *   to run an evaluation for a rule. You can specify the following notification types:
     * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
     *   configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
     *   delivers an oversized configuration item. AWS Config may generate this notification type
     *   when a resource changes and the notification exceeds the maximum size allowed by Amazon
     *   SNS.
     * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
     *   `MaximumExecutionFrequency` .
     */
    public fun organizationConfigRuleTriggerTypes(
        vararg organizationConfigRuleTriggerTypes: String
    ) {
        _organizationConfigRuleTriggerTypes.addAll(listOf(*organizationConfigRuleTriggerTypes))
    }

    /**
     * @param organizationConfigRuleTriggerTypes The type of notification that triggers AWS Config
     *   to run an evaluation for a rule. You can specify the following notification types:
     * * `ConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config delivers a
     *   configuration item as a result of a resource change.
     * * `OversizedConfigurationItemChangeNotification` - Triggers an evaluation when AWS Config
     *   delivers an oversized configuration item. AWS Config may generate this notification type
     *   when a resource changes and the notification exceeds the maximum size allowed by Amazon
     *   SNS.
     * * `ScheduledNotification` - Triggers a periodic evaluation at the frequency specified for
     *   `MaximumExecutionFrequency` .
     */
    public fun organizationConfigRuleTriggerTypes(
        organizationConfigRuleTriggerTypes: Collection<String>
    ) {
        _organizationConfigRuleTriggerTypes.addAll(organizationConfigRuleTriggerTypes)
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

    public fun build(): CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty {
        if (_organizationConfigRuleTriggerTypes.isNotEmpty())
            cdkBuilder.organizationConfigRuleTriggerTypes(_organizationConfigRuleTriggerTypes)
        if (_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
        return cdkBuilder.build()
    }
}
