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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * Identifier for a single stateless rule group, used in a firewall policy to refer to the rule
 * group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * StatelessRuleGroupReferenceProperty statelessRuleGroupReferenceProperty =
 * StatelessRuleGroupReferenceProperty.builder()
 * .priority(123)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statelessrulegroupreference.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyStatelessRuleGroupReferencePropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder =
        CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder()

    /**
     * @param priority An integer setting that indicates the order in which to run the stateless
     *   rule groups in a single `FirewallPolicy` . Network Firewall applies each stateless rule
     *   group to a packet starting with the group that has the lowest priority setting. You must
     *   ensure that the priority settings are unique within each policy.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param resourceArn The Amazon Resource Name (ARN) of the stateless rule group. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnFirewallPolicy.StatelessRuleGroupReferenceProperty = cdkBuilder.build()
}
