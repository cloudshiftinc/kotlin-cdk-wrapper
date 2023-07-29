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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * A single stateless rule.
 *
 * This is used in `RuleGroup.StatelessRulesAndCustomActions` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * StatelessRuleProperty statelessRuleProperty = StatelessRuleProperty.builder()
 * .priority(123)
 * .ruleDefinition(RuleDefinitionProperty.builder()
 * .actions(List.of("actions"))
 * .matchAttributes(MatchAttributesProperty.builder()
 * .destinationPorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .destinations(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .protocols(List.of(123))
 * .sourcePorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .sources(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .tcpFlags(List.of(TCPFlagFieldProperty.builder()
 * .flags(List.of("flags"))
 * // the properties below are optional
 * .masks(List.of("masks"))
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrule.html)
 */
@CdkDslMarker
public class CfnRuleGroupStatelessRulePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.StatelessRuleProperty.Builder =
        CfnRuleGroup.StatelessRuleProperty.builder()

    /**
     * @param priority Indicates the order in which to run this rule relative to all of the rules
     *   that are defined for a stateless rule group. Network Firewall evaluates the rules in a rule
     *   group starting with the lowest priority setting. You must ensure that the priority settings
     *   are unique for the rule group.
     *
     * Each stateless rule group uses exactly one `StatelessRulesAndCustomActions` object, and each
     * `StatelessRulesAndCustomActions` contains exactly one `StatelessRules` object. To ensure
     * unique priority settings for your rule groups, set unique priorities for the stateless rules
     * that you define inside any single `StatelessRules` object.
     *
     * You can change the priority settings of your rules at any time. To make it easier to insert
     * rules later, number them so there's a wide range in between, for example use 100, 200, and so
     * on.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the action
     *   to take on a packet that matches the criteria.
     */
    public fun ruleDefinition(ruleDefinition: IResolvable) {
        cdkBuilder.ruleDefinition(ruleDefinition)
    }

    /**
     * @param ruleDefinition Defines the stateless 5-tuple packet inspection criteria and the action
     *   to take on a packet that matches the criteria.
     */
    public fun ruleDefinition(ruleDefinition: CfnRuleGroup.RuleDefinitionProperty) {
        cdkBuilder.ruleDefinition(ruleDefinition)
    }

    public fun build(): CfnRuleGroup.StatelessRuleProperty = cdkBuilder.build()
}
