@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl {
    private val cdkBuilder:
        CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder =
        CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.builder()

    private val _debugLogDeliveryAccounts: MutableList<String> = mutableListOf()

    private val _organizationConfigRuleTriggerTypes: MutableList<String> = mutableListOf()

    private val _resourceTypesScope: MutableList<String> = mutableListOf()

    public fun debugLogDeliveryAccounts(vararg debugLogDeliveryAccounts: String) {
        _debugLogDeliveryAccounts.addAll(listOf(*debugLogDeliveryAccounts))
    }

    public fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: Collection<String>) {
        _debugLogDeliveryAccounts.addAll(debugLogDeliveryAccounts)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun inputParameters(inputParameters: String) {
        cdkBuilder.inputParameters(inputParameters)
    }

    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    public fun organizationConfigRuleTriggerTypes(vararg organizationConfigRuleTriggerTypes: String) {
        _organizationConfigRuleTriggerTypes.addAll(listOf(*organizationConfigRuleTriggerTypes))
    }

    public fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: Collection<String>) {
        _organizationConfigRuleTriggerTypes.addAll(organizationConfigRuleTriggerTypes)
    }

    public fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
    }

    public fun resourceIdScope(resourceIdScope: String) {
        cdkBuilder.resourceIdScope(resourceIdScope)
    }

    public fun resourceTypesScope(vararg resourceTypesScope: String) {
        _resourceTypesScope.addAll(listOf(*resourceTypesScope))
    }

    public fun resourceTypesScope(resourceTypesScope: Collection<String>) {
        _resourceTypesScope.addAll(resourceTypesScope)
    }

    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun tagKeyScope(tagKeyScope: String) {
        cdkBuilder.tagKeyScope(tagKeyScope)
    }

    public fun tagValueScope(tagValueScope: String) {
        cdkBuilder.tagValueScope(tagValueScope)
    }

    public fun build(): CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty {
        if (_debugLogDeliveryAccounts.isNotEmpty()) {
            cdkBuilder.debugLogDeliveryAccounts(_debugLogDeliveryAccounts)
        }
        if (_organizationConfigRuleTriggerTypes.isNotEmpty()) {
            cdkBuilder.organizationConfigRuleTriggerTypes(_organizationConfigRuleTriggerTypes)
        }
        if (_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
        return cdkBuilder.build()
    }
}
