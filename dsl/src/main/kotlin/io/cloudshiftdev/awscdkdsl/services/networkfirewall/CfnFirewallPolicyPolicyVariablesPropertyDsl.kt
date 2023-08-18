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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * Contains variables that you can use to override default Suricata settings in your firewall
 * policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * PolicyVariablesProperty policyVariablesProperty = PolicyVariablesProperty.builder()
 * .ruleVariables(Map.of(
 * "ruleVariablesKey", Map.of(
 * "definition", List.of("definition"))))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-policyvariables.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyPolicyVariablesPropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.PolicyVariablesProperty.Builder =
        CfnFirewallPolicy.PolicyVariablesProperty.builder()

    /**
     * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
     *   `HOME_NET` variable. If your firewall uses an inspection VPC, you might want to override
     *   the `HOME_NET` variable with the CIDRs of your home networks. If you don't override
     *   `HOME_NET` with your own CIDRs, Network Firewall by default uses the CIDR of your
     *   inspection VPC.
     */
    public fun ruleVariables(ruleVariables: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(ruleVariables)
        cdkBuilder.ruleVariables(builder.map)
    }

    /**
     * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
     *   `HOME_NET` variable. If your firewall uses an inspection VPC, you might want to override
     *   the `HOME_NET` variable with the CIDRs of your home networks. If you don't override
     *   `HOME_NET` with your own CIDRs, Network Firewall by default uses the CIDR of your
     *   inspection VPC.
     */
    public fun ruleVariables(ruleVariables: Map<String, Any>) {
        cdkBuilder.ruleVariables(ruleVariables)
    }

    /**
     * @param ruleVariables The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata
     *   `HOME_NET` variable. If your firewall uses an inspection VPC, you might want to override
     *   the `HOME_NET` variable with the CIDRs of your home networks. If you don't override
     *   `HOME_NET` with your own CIDRs, Network Firewall by default uses the CIDR of your
     *   inspection VPC.
     */
    public fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables)
    }

    public fun build(): CfnFirewallPolicy.PolicyVariablesProperty = cdkBuilder.build()
}
