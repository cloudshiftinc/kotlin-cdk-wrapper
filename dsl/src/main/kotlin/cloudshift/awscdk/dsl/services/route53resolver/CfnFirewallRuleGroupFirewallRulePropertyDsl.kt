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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnFirewallRuleGroupFirewallRulePropertyDsl {
    private val cdkBuilder: CfnFirewallRuleGroup.FirewallRuleProperty.Builder =
        CfnFirewallRuleGroup.FirewallRuleProperty.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun blockOverrideDnsType(blockOverrideDnsType: String) {
        cdkBuilder.blockOverrideDnsType(blockOverrideDnsType)
    }

    public fun blockOverrideDomain(blockOverrideDomain: String) {
        cdkBuilder.blockOverrideDomain(blockOverrideDomain)
    }

    public fun blockOverrideTtl(blockOverrideTtl: Number) {
        cdkBuilder.blockOverrideTtl(blockOverrideTtl)
    }

    public fun blockResponse(blockResponse: String) {
        cdkBuilder.blockResponse(blockResponse)
    }

    public fun firewallDomainListId(firewallDomainListId: String) {
        cdkBuilder.firewallDomainListId(firewallDomainListId)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): CfnFirewallRuleGroup.FirewallRuleProperty = cdkBuilder.build()
}
