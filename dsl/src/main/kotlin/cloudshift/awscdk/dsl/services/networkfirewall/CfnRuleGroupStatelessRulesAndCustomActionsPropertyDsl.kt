@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

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
