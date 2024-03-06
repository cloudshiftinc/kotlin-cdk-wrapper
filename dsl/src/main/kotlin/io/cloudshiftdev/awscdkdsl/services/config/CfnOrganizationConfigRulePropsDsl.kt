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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps

/**
 * Properties for defining a `CfnOrganizationConfigRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnOrganizationConfigRuleProps cfnOrganizationConfigRuleProps =
 * CfnOrganizationConfigRuleProps.builder()
 * .organizationConfigRuleName("organizationConfigRuleName")
 * // the properties below are optional
 * .excludedAccounts(List.of("excludedAccounts"))
 * .organizationCustomPolicyRuleMetadata(OrganizationCustomPolicyRuleMetadataProperty.builder()
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
 * .build())
 * .organizationCustomRuleMetadata(OrganizationCustomRuleMetadataProperty.builder()
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
 * .build())
 * .organizationManagedRuleMetadata(OrganizationManagedRuleMetadataProperty.builder()
 * .ruleIdentifier("ruleIdentifier")
 * // the properties below are optional
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconfigrule.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRulePropsDsl {
    private val cdkBuilder: CfnOrganizationConfigRuleProps.Builder =
        CfnOrganizationConfigRuleProps.builder()

    private val _excludedAccounts: MutableList<String> = mutableListOf()

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     *   Config rule.
     */
    public fun excludedAccounts(vararg excludedAccounts: String) {
        _excludedAccounts.addAll(listOf(*excludedAccounts))
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization AWS
     *   Config rule.
     */
    public fun excludedAccounts(excludedAccounts: Collection<String>) {
        _excludedAccounts.addAll(excludedAccounts)
    }

    /**
     * @param organizationConfigRuleName The name that you assign to organization AWS Config rule.
     */
    public fun organizationConfigRuleName(organizationConfigRuleName: String) {
        cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     *   organization's AWS Config Custom Policy rule. The metadata includes the runtime system in
     *   use, which accounts have debug logging enabled, and other custom rule metadata, such as
     *   resource type, resource ID of AWS resource, and organization trigger types that initiate
     *   AWS Config to evaluate AWS resources against a rule.
     */
    public fun organizationCustomPolicyRuleMetadata(
        organizationCustomPolicyRuleMetadata: IResolvable
    ) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    /**
     * @param organizationCustomPolicyRuleMetadata An object that specifies metadata for your
     *   organization's AWS Config Custom Policy rule. The metadata includes the runtime system in
     *   use, which accounts have debug logging enabled, and other custom rule metadata, such as
     *   resource type, resource ID of AWS resource, and organization trigger types that initiate
     *   AWS Config to evaluate AWS resources against a rule.
     */
    public fun organizationCustomPolicyRuleMetadata(
        organizationCustomPolicyRuleMetadata:
            CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty
    ) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    /** @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. */
    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    /** @param organizationCustomRuleMetadata An `OrganizationCustomRuleMetadata` object. */
    public fun organizationCustomRuleMetadata(
        organizationCustomRuleMetadata:
            CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty
    ) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    /** @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. */
    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    /** @param organizationManagedRuleMetadata An `OrganizationManagedRuleMetadata` object. */
    public fun organizationManagedRuleMetadata(
        organizationManagedRuleMetadata:
            CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty
    ) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    public fun build(): CfnOrganizationConfigRuleProps {
        if (_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
        return cdkBuilder.build()
    }
}
