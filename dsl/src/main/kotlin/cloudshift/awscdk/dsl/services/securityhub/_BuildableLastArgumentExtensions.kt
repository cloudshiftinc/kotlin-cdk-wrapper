@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

public inline
    fun CfnAutomationRule.setCriteria(block: CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAutomationRuleAutomationRulesFindingFiltersPropertyDsl()
  builder.apply(block)
  return setCriteria(builder.build())
}
