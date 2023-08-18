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
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * The setting that allows the policy owner to change the behavior of the rule group within a
 * policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * StatefulRuleGroupOverrideProperty statefulRuleGroupOverrideProperty =
 * StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupoverride.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder =
        CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder()

    /**
     * @param action The action that changes the rule group from `DROP` to `ALERT` . This only
     *   applies to managed rule groups.
     */
    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun build(): CfnFirewallPolicy.StatefulRuleGroupOverrideProperty = cdkBuilder.build()
}
