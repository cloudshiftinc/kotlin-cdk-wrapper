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

package cloudshift.awscdk.dsl.services.budgets

import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

/** The budget object that you want to create. */
public inline fun CfnBudget.setBudget(block: CfnBudgetBudgetDataPropertyDsl.() -> Unit = {}) {
    val builder = CfnBudgetBudgetDataPropertyDsl()
    builder.apply(block)
    return setBudget(builder.build())
}

/** The trigger threshold of the action. */
public inline fun CfnBudgetsAction.setActionThreshold(
    block: CfnBudgetsActionActionThresholdPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBudgetsActionActionThresholdPropertyDsl()
    builder.apply(block)
    return setActionThreshold(builder.build())
}

/** Specifies all of the type-specific parameters. */
public inline fun CfnBudgetsAction.setDefinition(
    block: CfnBudgetsActionDefinitionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBudgetsActionDefinitionPropertyDsl()
    builder.apply(block)
    return setDefinition(builder.build())
}
