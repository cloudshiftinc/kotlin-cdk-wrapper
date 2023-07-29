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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroupProps

/**
 * Properties for defining a `CfnRuleGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnRuleGroupProps cfnRuleGroupProps = CfnRuleGroupProps.builder()
 * .capacity(123)
 * .ruleGroupName("ruleGroupName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .ruleGroup(RuleGroupProperty.builder()
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
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html)
 */
@CdkDslMarker
public class CfnRuleGroupPropsDsl {
    private val cdkBuilder: CfnRuleGroupProps.Builder = CfnRuleGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param capacity The maximum operating resources that this rule group can use. You can't
     *   change a rule group's capacity setting after you create the rule group. When you update a
     *   rule group, you are limited to this capacity. When you reference a rule group from a
     *   firewall policy, Network Firewall reserves this capacity for the rule group.
     */
    public fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
    }

    /** @param description A description of the rule group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param ruleGroup An object that defines the rule group rules. */
    public fun ruleGroup(ruleGroup: IResolvable) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    /** @param ruleGroup An object that defines the rule group rules. */
    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    /**
     * @param ruleGroupName The descriptive name of the rule group. You can't change the name of a
     *   rule group after you create it.
     */
    public fun ruleGroupName(ruleGroupName: String) {
        cdkBuilder.ruleGroupName(ruleGroupName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type Indicates whether the rule group is stateless or stateful. If the rule group is
     *   stateless, it contains stateless rules. If it is stateful, it contains stateful rules.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnRuleGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
