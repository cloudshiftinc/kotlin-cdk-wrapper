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

  public fun customActions(vararg customActions: Any) {
    _customActions.addAll(listOf(*customActions))
  }

  public fun customActions(customActions: Collection<Any>) {
    _customActions.addAll(customActions)
  }

  public fun customActions(customActions: IResolvable) {
    cdkBuilder.customActions(customActions)
  }

  public fun statelessRules(vararg statelessRules: Any) {
    _statelessRules.addAll(listOf(*statelessRules))
  }

  public fun statelessRules(statelessRules: Collection<Any>) {
    _statelessRules.addAll(statelessRules)
  }

  public fun statelessRules(statelessRules: IResolvable) {
    cdkBuilder.statelessRules(statelessRules)
  }

  public fun build(): CfnRuleGroup.StatelessRulesAndCustomActionsProperty {
    if(_customActions.isNotEmpty()) cdkBuilder.customActions(_customActions)
    if(_statelessRules.isNotEmpty()) cdkBuilder.statelessRules(_statelessRules)
    return cdkBuilder.build()
  }
}
