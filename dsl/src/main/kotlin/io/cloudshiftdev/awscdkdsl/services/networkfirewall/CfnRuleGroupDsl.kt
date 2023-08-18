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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import software.constructs.Construct

/**
 * Use the `RuleGroup` to define a reusable collection of stateless or stateful network traffic
 * filtering rules.
 *
 * You use rule groups in an `FirewallPolicy` to specify the filtering behavior of an `Firewall` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnRuleGroup cfnRuleGroup = CfnRuleGroup.Builder.create(this, "MyCfnRuleGroup")
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
public class CfnRuleGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRuleGroup.Builder = CfnRuleGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The maximum operating resources that this rule group can use.
     *
     * You can't change a rule group's capacity setting after you create the rule group. When you
     * update a rule group, you are limited to this capacity. When you reference a rule group from a
     * firewall policy, Network Firewall reserves this capacity for the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-capacity)
     *
     * @param capacity The maximum operating resources that this rule group can use.
     */
    public fun capacity(capacity: Number) {
        cdkBuilder.capacity(capacity)
    }

    /**
     * A description of the rule group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-description)
     *
     * @param description A description of the rule group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     *
     * @param ruleGroup An object that defines the rule group rules.
     */
    public fun ruleGroup(ruleGroup: IResolvable) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    /**
     * An object that defines the rule group rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroup)
     *
     * @param ruleGroup An object that defines the rule group rules.
     */
    public fun ruleGroup(ruleGroup: CfnRuleGroup.RuleGroupProperty) {
        cdkBuilder.ruleGroup(ruleGroup)
    }

    /**
     * The descriptive name of the rule group.
     *
     * You can't change the name of a rule group after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-rulegroupname)
     *
     * @param ruleGroupName The descriptive name of the rule group.
     */
    public fun ruleGroupName(ruleGroupName: String) {
        cdkBuilder.ruleGroupName(ruleGroupName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Indicates whether the rule group is stateless or stateful.
     *
     * If the rule group is stateless, it contains stateless rules. If it is stateful, it contains
     * stateful rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-rulegroup.html#cfn-networkfirewall-rulegroup-type)
     *
     * @param type Indicates whether the rule group is stateless or stateful.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnRuleGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
