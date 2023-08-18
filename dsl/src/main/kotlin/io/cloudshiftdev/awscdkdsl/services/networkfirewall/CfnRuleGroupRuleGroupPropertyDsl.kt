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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * The object that defines the rules in a rule group.
 *
 * AWS Network Firewall uses a rule group to inspect and control network traffic. You define
 * stateless rule groups to inspect individual packets and you define stateful rule groups to
 * inspect packets in the context of their traffic flow.
 *
 * To use a rule group, you include it by reference in an Network Firewall firewall policy, then you
 * use the policy in a firewall. You can reference a rule group from more than one firewall policy,
 * and you can use a firewall policy in more than one firewall.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * RuleGroupProperty ruleGroupProperty = RuleGroupProperty.builder()
 * .rulesSource(RulesSourceProperty.builder()
 * .rulesSourceList(RulesSourceListProperty.builder()
 * .generatedRulesType("generatedRulesType")
 * .targets(List.of("targets"))
 * .targetTypes(List.of("targetTypes"))
 * .build())
 * .rulesString("rulesString")
 * .statefulRules(List.of(StatefulRuleProperty.builder()
 * .action("action")
 * .header(HeaderProperty.builder()
 * .destination("destination")
 * .destinationPort("destinationPort")
 * .direction("direction")
 * .protocol("protocol")
 * .source("source")
 * .sourcePort("sourcePort")
 * .build())
 * .ruleOptions(List.of(RuleOptionProperty.builder()
 * .keyword("keyword")
 * // the properties below are optional
 * .settings(List.of("settings"))
 * .build()))
 * .build()))
 * .statelessRulesAndCustomActions(StatelessRulesAndCustomActionsProperty.builder()
 * .statelessRules(List.of(StatelessRuleProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .customActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .build())
 * .build())
 * // the properties below are optional
 * .referenceSets(ReferenceSetsProperty.builder()
 * .ipSetReferences(Map.of(
 * "ipSetReferencesKey", Map.of(
 * "referenceArn", "referenceArn")))
 * .build())
 * .ruleVariables(RuleVariablesProperty.builder()
 * .ipSets(Map.of(
 * "ipSetsKey", Map.of(
 * "definition", List.of("definition"))))
 * .portSets(Map.of(
 * "portSetsKey", PortSetProperty.builder()
 * .definition(List.of("definition"))
 * .build()))
 * .build())
 * .statefulRuleOptions(StatefulRuleOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulegroup.html)
 */
@CdkDslMarker
public class CfnRuleGroupRuleGroupPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleGroupProperty.Builder =
        CfnRuleGroup.RuleGroupProperty.builder()

    /** @param referenceSets The reference sets for the stateful rule group. */
    public fun referenceSets(referenceSets: IResolvable) {
        cdkBuilder.referenceSets(referenceSets)
    }

    /** @param referenceSets The reference sets for the stateful rule group. */
    public fun referenceSets(referenceSets: CfnRuleGroup.ReferenceSetsProperty) {
        cdkBuilder.referenceSets(referenceSets)
    }

    /**
     * @param ruleVariables Settings that are available for use in the rules in the rule group. You
     *   can only use these for stateful rule groups.
     */
    public fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables)
    }

    /**
     * @param ruleVariables Settings that are available for use in the rules in the rule group. You
     *   can only use these for stateful rule groups.
     */
    public fun ruleVariables(ruleVariables: CfnRuleGroup.RuleVariablesProperty) {
        cdkBuilder.ruleVariables(ruleVariables)
    }

    /** @param rulesSource The stateful rules or stateless rules for the rule group. */
    public fun rulesSource(rulesSource: IResolvable) {
        cdkBuilder.rulesSource(rulesSource)
    }

    /** @param rulesSource The stateful rules or stateless rules for the rule group. */
    public fun rulesSource(rulesSource: CfnRuleGroup.RulesSourceProperty) {
        cdkBuilder.rulesSource(rulesSource)
    }

    /**
     * @param statefulRuleOptions Additional options governing how Network Firewall handles stateful
     *   rules. The policies where you use your stateful rule group must have stateful rule options
     *   settings that are compatible with these settings.
     */
    public fun statefulRuleOptions(statefulRuleOptions: IResolvable) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions)
    }

    /**
     * @param statefulRuleOptions Additional options governing how Network Firewall handles stateful
     *   rules. The policies where you use your stateful rule group must have stateful rule options
     *   settings that are compatible with these settings.
     */
    public fun statefulRuleOptions(statefulRuleOptions: CfnRuleGroup.StatefulRuleOptionsProperty) {
        cdkBuilder.statefulRuleOptions(statefulRuleOptions)
    }

    public fun build(): CfnRuleGroup.RuleGroupProperty = cdkBuilder.build()
}
