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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * Identifier for a single stateful rule group, used in a firewall policy to refer to a rule group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * StatefulRuleGroupReferenceProperty statefulRuleGroupReferenceProperty =
 * StatefulRuleGroupReferenceProperty.builder()
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .override(StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build())
 * .priority(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-statefulrulegroupreference.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyStatefulRuleGroupReferencePropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder =
        CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder()

    /**
     * @param override The action that allows the policy owner to override the behavior of the rule
     *   group within a policy.
     */
    public fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param override The action that allows the policy owner to override the behavior of the rule
     *   group within a policy.
     */
    public fun `override`(`override`: CfnFirewallPolicy.StatefulRuleGroupOverrideProperty) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param priority An integer setting that indicates the order in which to run the stateful rule
     *   groups in a single `FirewallPolicy` . This setting only applies to firewall policies that
     *   specify the `STRICT_ORDER` rule order in the stateful engine options settings.
     *
     * Network Firewall evalutes each stateful rule group against a packet starting with the group
     * that has the lowest priority setting. You must ensure that the priority settings are unique
     * within each policy.
     *
     * You can change the priority settings of your rule groups at any time. To make it easier to
     * insert rule groups later, number them so there's a wide range in between, for example use
     * 100, 200, and so on.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param resourceArn The Amazon Resource Name (ARN) of the stateful rule group. */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnFirewallPolicy.StatefulRuleGroupReferenceProperty = cdkBuilder.build()
}
