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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOrganizationConfigRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOrganizationConfigRule.Builder =
        CfnOrganizationConfigRule.Builder.create(scope, id)

    private val _excludedAccounts: MutableList<String> = mutableListOf()

    public fun excludedAccounts(vararg excludedAccounts: String) {
        _excludedAccounts.addAll(listOf(*excludedAccounts))
    }

    public fun excludedAccounts(excludedAccounts: Collection<String>) {
        _excludedAccounts.addAll(excludedAccounts)
    }

    public fun organizationConfigRuleName(organizationConfigRuleName: String) {
        cdkBuilder.organizationConfigRuleName(organizationConfigRuleName)
    }

    public fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: IResolvable) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    public fun organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty) {
        cdkBuilder.organizationCustomPolicyRuleMetadata(organizationCustomPolicyRuleMetadata)
    }

    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: IResolvable) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    public fun organizationCustomRuleMetadata(organizationCustomRuleMetadata: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty) {
        cdkBuilder.organizationCustomRuleMetadata(organizationCustomRuleMetadata)
    }

    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: IResolvable) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    public fun organizationManagedRuleMetadata(organizationManagedRuleMetadata: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty) {
        cdkBuilder.organizationManagedRuleMetadata(organizationManagedRuleMetadata)
    }

    public fun build(): CfnOrganizationConfigRule {
        if (_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
        return cdkBuilder.build()
    }
}
