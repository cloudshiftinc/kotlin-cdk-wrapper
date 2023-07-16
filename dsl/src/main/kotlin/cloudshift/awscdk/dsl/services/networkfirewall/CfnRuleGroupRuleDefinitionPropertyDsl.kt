@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupRuleDefinitionPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.RuleDefinitionProperty.Builder =
      CfnRuleGroup.RuleDefinitionProperty.builder()

  private val _actions: MutableList<String> = mutableListOf()

  public fun actions(vararg actions: String) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<String>) {
    _actions.addAll(actions)
  }

  public fun matchAttributes(matchAttributes: IResolvable) {
    cdkBuilder.matchAttributes(matchAttributes)
  }

  public fun matchAttributes(matchAttributes: CfnRuleGroup.MatchAttributesProperty) {
    cdkBuilder.matchAttributes(matchAttributes)
  }

  public fun build(): CfnRuleGroup.RuleDefinitionProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
