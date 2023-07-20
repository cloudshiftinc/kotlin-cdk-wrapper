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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFirewallPolicyFirewallPolicyPropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.FirewallPolicyProperty.Builder =
        CfnFirewallPolicy.FirewallPolicyProperty.builder()

    private val _statefulDefaultActions: MutableList<String> = mutableListOf()

    private val _statefulRuleGroupReferences: MutableList<Any> = mutableListOf()

    private val _statelessCustomActions: MutableList<Any> = mutableListOf()

    private val _statelessDefaultActions: MutableList<String> = mutableListOf()

    private val _statelessFragmentDefaultActions: MutableList<String> = mutableListOf()

    private val _statelessRuleGroupReferences: MutableList<Any> = mutableListOf()

    public fun policyVariables(policyVariables: IResolvable) {
        cdkBuilder.policyVariables(policyVariables)
    }

    public fun policyVariables(policyVariables: CfnFirewallPolicy.PolicyVariablesProperty) {
        cdkBuilder.policyVariables(policyVariables)
    }

    public fun statefulDefaultActions(vararg statefulDefaultActions: String) {
        _statefulDefaultActions.addAll(listOf(*statefulDefaultActions))
    }

    public fun statefulDefaultActions(statefulDefaultActions: Collection<String>) {
        _statefulDefaultActions.addAll(statefulDefaultActions)
    }

    public fun statefulEngineOptions(statefulEngineOptions: IResolvable) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions)
    }

    public fun statefulEngineOptions(statefulEngineOptions: CfnFirewallPolicy.StatefulEngineOptionsProperty) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions)
    }

    public fun statefulRuleGroupReferences(vararg statefulRuleGroupReferences: Any) {
        _statefulRuleGroupReferences.addAll(listOf(*statefulRuleGroupReferences))
    }

    public fun statefulRuleGroupReferences(statefulRuleGroupReferences: Collection<Any>) {
        _statefulRuleGroupReferences.addAll(statefulRuleGroupReferences)
    }

    public fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable) {
        cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences)
    }

    public fun statelessCustomActions(vararg statelessCustomActions: Any) {
        _statelessCustomActions.addAll(listOf(*statelessCustomActions))
    }

    public fun statelessCustomActions(statelessCustomActions: Collection<Any>) {
        _statelessCustomActions.addAll(statelessCustomActions)
    }

    public fun statelessCustomActions(statelessCustomActions: IResolvable) {
        cdkBuilder.statelessCustomActions(statelessCustomActions)
    }

    public fun statelessDefaultActions(vararg statelessDefaultActions: String) {
        _statelessDefaultActions.addAll(listOf(*statelessDefaultActions))
    }

    public fun statelessDefaultActions(statelessDefaultActions: Collection<String>) {
        _statelessDefaultActions.addAll(statelessDefaultActions)
    }

    public fun statelessFragmentDefaultActions(vararg statelessFragmentDefaultActions: String) {
        _statelessFragmentDefaultActions.addAll(listOf(*statelessFragmentDefaultActions))
    }

    public fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: Collection<String>) {
        _statelessFragmentDefaultActions.addAll(statelessFragmentDefaultActions)
    }

    public fun statelessRuleGroupReferences(vararg statelessRuleGroupReferences: Any) {
        _statelessRuleGroupReferences.addAll(listOf(*statelessRuleGroupReferences))
    }

    public fun statelessRuleGroupReferences(statelessRuleGroupReferences: Collection<Any>) {
        _statelessRuleGroupReferences.addAll(statelessRuleGroupReferences)
    }

    public fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable) {
        cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences)
    }

    public fun build(): CfnFirewallPolicy.FirewallPolicyProperty {
        if (_statefulDefaultActions.isNotEmpty()) {
            cdkBuilder.statefulDefaultActions(_statefulDefaultActions)
        }
        if (_statefulRuleGroupReferences.isNotEmpty()) {
            cdkBuilder.statefulRuleGroupReferences(_statefulRuleGroupReferences)
        }
        if (_statelessCustomActions.isNotEmpty()) {
            cdkBuilder.statelessCustomActions(_statelessCustomActions)
        }
        if (_statelessDefaultActions.isNotEmpty()) {
            cdkBuilder.statelessDefaultActions(_statelessDefaultActions)
        }
        if (_statelessFragmentDefaultActions.isNotEmpty()) {
            cdkBuilder.statelessFragmentDefaultActions(_statelessFragmentDefaultActions)
        }
        if (_statelessRuleGroupReferences.isNotEmpty()) {
            cdkBuilder.statelessRuleGroupReferences(_statelessRuleGroupReferences)
        }
        return cdkBuilder.build()
    }
}
