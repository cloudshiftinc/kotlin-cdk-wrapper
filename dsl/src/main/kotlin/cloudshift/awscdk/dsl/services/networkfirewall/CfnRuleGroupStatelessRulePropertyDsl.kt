@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupStatelessRulePropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatelessRuleProperty.Builder =
      CfnRuleGroup.StatelessRuleProperty.builder()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun ruleDefinition(ruleDefinition: IResolvable) {
    cdkBuilder.ruleDefinition(ruleDefinition)
  }

  public fun ruleDefinition(ruleDefinition: CfnRuleGroup.RuleDefinitionProperty) {
    cdkBuilder.ruleDefinition(ruleDefinition)
  }

  public fun build(): CfnRuleGroup.StatelessRuleProperty = cdkBuilder.build()
}
