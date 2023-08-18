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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * The inspection criteria and action for a single stateless rule.
 *
 * AWS Network Firewall inspects each packet for the specified matching criteria. When a packet
 * matches the criteria, Network Firewall performs the rule's actions on the packet.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * RuleDefinitionProperty ruleDefinitionProperty = RuleDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-ruledefinition.html)
 */
@CdkDslMarker
public class CfnRuleGroupRuleDefinitionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.RuleDefinitionProperty.Builder =
        CfnRuleGroup.RuleDefinitionProperty.builder()

    private val _actions: MutableList<String> = mutableListOf()

    /**
     * @param actions The actions to take on a packet that matches one of the stateless rule
     *   definition's match attributes. You must specify a standard action and you can add custom
     *   actions.
     *
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
     * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
     * for the `FirewallPolicy` .
     *
     * For every rule, you must specify exactly one of the following standard actions.
     * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its intended
     *   destination.
     * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
     *   intended destination.
     * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
     *   the stateful rule engine for inspection.
     *
     * Additionally, you can specify a custom action. To do this, you define a custom action by name
     * and type, then provide the name you've assigned to the action in this `Actions` setting.
     *
     * To provide more than one action in this setting, separate the settings with a comma. For
     * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
     * then you could specify the standard action `aws:pass` combined with the custom action using
     * `[“aws:pass”, “MyMetricsAction”]` .
     */
    public fun actions(vararg actions: String) {
        _actions.addAll(listOf(*actions))
    }

    /**
     * @param actions The actions to take on a packet that matches one of the stateless rule
     *   definition's match attributes. You must specify a standard action and you can add custom
     *   actions.
     *
     * Network Firewall only forwards a packet for stateful rule inspection if you specify
     * `aws:forward_to_sfe` for a rule that the packet matches, or if the packet doesn't match any
     * stateless rule and you specify `aws:forward_to_sfe` for the `StatelessDefaultActions` setting
     * for the `FirewallPolicy` .
     *
     * For every rule, you must specify exactly one of the following standard actions.
     * * *aws:pass* - Discontinues all inspection of the packet and permits it to go to its intended
     *   destination.
     * * *aws:drop* - Discontinues all inspection of the packet and blocks it from going to its
     *   intended destination.
     * * *aws:forward_to_sfe* - Discontinues stateless inspection of the packet and forwards it to
     *   the stateful rule engine for inspection.
     *
     * Additionally, you can specify a custom action. To do this, you define a custom action by name
     * and type, then provide the name you've assigned to the action in this `Actions` setting.
     *
     * To provide more than one action in this setting, separate the settings with a comma. For
     * example, if you have a publish metrics custom action that you've named `MyMetricsAction` ,
     * then you could specify the standard action `aws:pass` combined with the custom action using
     * `[“aws:pass”, “MyMetricsAction”]` .
     */
    public fun actions(actions: Collection<String>) {
        _actions.addAll(actions)
    }

    /**
     * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
     *   in stateless rule inspection. Each match attributes set can include one or more items such
     *   as IP address, CIDR range, port number, protocol, and TCP flags.
     */
    public fun matchAttributes(matchAttributes: IResolvable) {
        cdkBuilder.matchAttributes(matchAttributes)
    }

    /**
     * @param matchAttributes Criteria for Network Firewall to use to inspect an individual packet
     *   in stateless rule inspection. Each match attributes set can include one or more items such
     *   as IP address, CIDR range, port number, protocol, and TCP flags.
     */
    public fun matchAttributes(matchAttributes: CfnRuleGroup.MatchAttributesProperty) {
        cdkBuilder.matchAttributes(matchAttributes)
    }

    public fun build(): CfnRuleGroup.RuleDefinitionProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
