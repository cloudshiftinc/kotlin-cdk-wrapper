@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupStatefulRuleOptionsPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.StatefulRuleOptionsProperty.Builder =
      CfnRuleGroup.StatefulRuleOptionsProperty.builder()

  public fun ruleOrder(ruleOrder: String) {
    cdkBuilder.ruleOrder(ruleOrder)
  }

  public fun build(): CfnRuleGroup.StatefulRuleOptionsProperty = cdkBuilder.build()
}
