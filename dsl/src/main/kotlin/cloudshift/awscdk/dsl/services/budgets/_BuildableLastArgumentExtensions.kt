@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

public inline fun CfnBudget.setBudget(block: CfnBudgetBudgetDataPropertyDsl.() -> Unit = {}) {
  val builder = CfnBudgetBudgetDataPropertyDsl()
  builder.apply(block)
  return setBudget(builder.build())
}

public inline
    fun CfnBudgetsAction.setActionThreshold(block: CfnBudgetsActionActionThresholdPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBudgetsActionActionThresholdPropertyDsl()
  builder.apply(block)
  return setActionThreshold(builder.build())
}

public inline
    fun CfnBudgetsAction.setDefinition(block: CfnBudgetsActionDefinitionPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBudgetsActionDefinitionPropertyDsl()
  builder.apply(block)
  return setDefinition(builder.build())
}
