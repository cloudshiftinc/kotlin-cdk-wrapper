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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * The stateless or stateful rules definitions for use in a single rule group.
 *
 * Each rule group requires a single `RulesSource` . You can use an instance of this for either
 * stateless rules or stateful rules.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * RulesSourceProperty rulesSourceProperty = RulesSourceProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-rulessource.html)
 */
@CdkDslMarker
public class CfnRuleGroupRulesSourcePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RulesSourceProperty.Builder =
        CfnRuleGroup.RulesSourceProperty.builder()

    private val _statefulRules: MutableList<Any> = mutableListOf()

    /** @param rulesSourceList Stateful inspection criteria for a domain list rule group. */
    public fun rulesSourceList(rulesSourceList: IResolvable) {
        cdkBuilder.rulesSourceList(rulesSourceList)
    }

    /** @param rulesSourceList Stateful inspection criteria for a domain list rule group. */
    public fun rulesSourceList(rulesSourceList: CfnRuleGroup.RulesSourceListProperty) {
        cdkBuilder.rulesSourceList(rulesSourceList)
    }

    /**
     * @param rulesString Stateful inspection criteria, provided in Suricata compatible intrusion
     *   prevention system (IPS) rules. Suricata is an open-source network IPS that includes a
     *   standard rule-based language for network traffic inspection.
     *
     * These rules contain the inspection criteria and the action to take for traffic that matches
     * the criteria, so this type of rule group doesn't have a separate action setting.
     */
    public fun rulesString(rulesString: String) {
        cdkBuilder.rulesString(rulesString)
    }

    /**
     * @param statefulRules An array of individual stateful rules inspection criteria to be used
     *   together in a stateful rule group. Use this option to specify simple Suricata rules with
     *   protocol, source and destination, ports, direction, and rule options. For information about
     *   the Suricata `Rules` format, see
     *   [Rules Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
     *   .
     */
    public fun statefulRules(vararg statefulRules: Any) {
        _statefulRules.addAll(listOf(*statefulRules))
    }

    /**
     * @param statefulRules An array of individual stateful rules inspection criteria to be used
     *   together in a stateful rule group. Use this option to specify simple Suricata rules with
     *   protocol, source and destination, ports, direction, and rule options. For information about
     *   the Suricata `Rules` format, see
     *   [Rules Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
     *   .
     */
    public fun statefulRules(statefulRules: Collection<Any>) {
        _statefulRules.addAll(statefulRules)
    }

    /**
     * @param statefulRules An array of individual stateful rules inspection criteria to be used
     *   together in a stateful rule group. Use this option to specify simple Suricata rules with
     *   protocol, source and destination, ports, direction, and rule options. For information about
     *   the Suricata `Rules` format, see
     *   [Rules Format](https://docs.aws.amazon.com/https://suricata.readthedocs.io/en/suricata-6.0.9/rules/intro.html)
     *   .
     */
    public fun statefulRules(statefulRules: IResolvable) {
        cdkBuilder.statefulRules(statefulRules)
    }

    /**
     * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a stateless
     *   rule group.
     */
    public fun statelessRulesAndCustomActions(statelessRulesAndCustomActions: IResolvable) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
    }

    /**
     * @param statelessRulesAndCustomActions Stateless inspection criteria to be used in a stateless
     *   rule group.
     */
    public fun statelessRulesAndCustomActions(
        statelessRulesAndCustomActions: CfnRuleGroup.StatelessRulesAndCustomActionsProperty
    ) {
        cdkBuilder.statelessRulesAndCustomActions(statelessRulesAndCustomActions)
    }

    public fun build(): CfnRuleGroup.RulesSourceProperty {
        if (_statefulRules.isNotEmpty()) cdkBuilder.statefulRules(_statefulRules)
        return cdkBuilder.build()
    }
}
