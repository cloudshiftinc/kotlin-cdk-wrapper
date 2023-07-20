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
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import kotlin.String

@CdkDslMarker
public class CfnFirewallPolicyStatefulRuleGroupOverridePropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder =
        CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun build(): CfnFirewallPolicy.StatefulRuleGroupOverrideProperty = cdkBuilder.build()
}
