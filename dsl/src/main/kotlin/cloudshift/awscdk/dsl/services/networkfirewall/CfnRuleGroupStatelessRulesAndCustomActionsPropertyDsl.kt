@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * Stateless inspection criteria.
 *
 * Each stateless rule group uses exactly one of these data types to define its stateless rules.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * StatelessRulesAndCustomActionsProperty statelessRulesAndCustomActionsProperty =
 * StatelessRulesAndCustomActionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-statelessrulesandcustomactions.html)
 */
@CdkDslMarker
public class CfnRuleGroupStatelessRulesAndCustomActionsPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatelessRulesAndCustomActionsProperty.Builder =
      CfnRuleGroup.StatelessRulesAndCustomActionsProperty.builder()

  private val _customActions: MutableList<Any> = mutableListOf()

  private val _statelessRules: MutableList<Any> = mutableListOf()

  /**
   * @param customActions Defines an array of individual custom action definitions that are
   * available for use by the stateless rules in this `StatelessRulesAndCustomActions` specification.
   * You name each custom action that you define, and then you can use it by name in your stateless
   * rule `RuleGroup.RuleDefinition` `Actions` specification.
   */
  public fun customActions(vararg customActions: Any) {
    _customActions.addAll(listOf(*customActions))
  }

  /**
   * @param customActions Defines an array of individual custom action definitions that are
   * available for use by the stateless rules in this `StatelessRulesAndCustomActions` specification.
   * You name each custom action that you define, and then you can use it by name in your stateless
   * rule `RuleGroup.RuleDefinition` `Actions` specification.
   */
  public fun customActions(customActions: Collection<Any>) {
    _customActions.addAll(customActions)
  }

  /**
   * @param customActions Defines an array of individual custom action definitions that are
   * available for use by the stateless rules in this `StatelessRulesAndCustomActions` specification.
   * You name each custom action that you define, and then you can use it by name in your stateless
   * rule `RuleGroup.RuleDefinition` `Actions` specification.
   */
  public fun customActions(customActions: IResolvable) {
    cdkBuilder.customActions(customActions)
  }

  /**
   * @param statelessRules Defines the set of stateless rules for use in a stateless rule group. 
   */
  public fun statelessRules(vararg statelessRules: Any) {
    _statelessRules.addAll(listOf(*statelessRules))
  }

  /**
   * @param statelessRules Defines the set of stateless rules for use in a stateless rule group. 
   */
  public fun statelessRules(statelessRules: Collection<Any>) {
    _statelessRules.addAll(statelessRules)
  }

  /**
   * @param statelessRules Defines the set of stateless rules for use in a stateless rule group. 
   */
  public fun statelessRules(statelessRules: IResolvable) {
    cdkBuilder.statelessRules(statelessRules)
  }

  public fun build(): CfnRuleGroup.StatelessRulesAndCustomActionsProperty {
    if(_customActions.isNotEmpty()) cdkBuilder.customActions(_customActions)
    if(_statelessRules.isNotEmpty()) cdkBuilder.statelessRules(_statelessRules)
    return cdkBuilder.build()
  }
}
