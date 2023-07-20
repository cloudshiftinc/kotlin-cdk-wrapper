@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnBudgetBudgetDataPropertyDsl {
    private val cdkBuilder: CfnBudget.BudgetDataProperty.Builder =
        CfnBudget.BudgetDataProperty.builder()

    public fun autoAdjustData(autoAdjustData: IResolvable) {
        cdkBuilder.autoAdjustData(autoAdjustData)
    }

    public fun autoAdjustData(autoAdjustData: CfnBudget.AutoAdjustDataProperty) {
        cdkBuilder.autoAdjustData(autoAdjustData)
    }

    public fun budgetLimit(budgetLimit: IResolvable) {
        cdkBuilder.budgetLimit(budgetLimit)
    }

    public fun budgetLimit(budgetLimit: CfnBudget.SpendProperty) {
        cdkBuilder.budgetLimit(budgetLimit)
    }

    public fun budgetName(budgetName: String) {
        cdkBuilder.budgetName(budgetName)
    }

    public fun budgetType(budgetType: String) {
        cdkBuilder.budgetType(budgetType)
    }

    public fun costFilters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.costFilters(builder.map)
    }

    public fun costFilters(costFilters: Any) {
        cdkBuilder.costFilters(costFilters)
    }

    public fun costTypes(costTypes: IResolvable) {
        cdkBuilder.costTypes(costTypes)
    }

    public fun costTypes(costTypes: CfnBudget.CostTypesProperty) {
        cdkBuilder.costTypes(costTypes)
    }

    public fun plannedBudgetLimits(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.plannedBudgetLimits(builder.map)
    }

    public fun plannedBudgetLimits(plannedBudgetLimits: Any) {
        cdkBuilder.plannedBudgetLimits(plannedBudgetLimits)
    }

    public fun timePeriod(timePeriod: IResolvable) {
        cdkBuilder.timePeriod(timePeriod)
    }

    public fun timePeriod(timePeriod: CfnBudget.TimePeriodProperty) {
        cdkBuilder.timePeriod(timePeriod)
    }

    public fun timeUnit(timeUnit: String) {
        cdkBuilder.timeUnit(timeUnit)
    }

    public fun build(): CfnBudget.BudgetDataProperty = cdkBuilder.build()
}
