@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * Represents the output of the `CreateBudget` operation.
 *
 * The content consists of the detailed metadata and data file information, and the current status
 * of the `budget` object.
 *
 * This is the Amazon Resource Name (ARN) pattern for a budget:
 *
 * `arn:aws:budgets::AccountId:budget/budgetName`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * Object costFilters;
 * Object plannedBudgetLimits;
 * BudgetDataProperty budgetDataProperty = BudgetDataProperty.builder()
 * .budgetType("budgetType")
 * .timeUnit("timeUnit")
 * // the properties below are optional
 * .autoAdjustData(AutoAdjustDataProperty.builder()
 * .autoAdjustType("autoAdjustType")
 * // the properties below are optional
 * .historicalOptions(HistoricalOptionsProperty.builder()
 * .budgetAdjustmentPeriod(123)
 * .build())
 * .build())
 * .budgetLimit(SpendProperty.builder()
 * .amount(123)
 * .unit("unit")
 * .build())
 * .budgetName("budgetName")
 * .costFilters(costFilters)
 * .costTypes(CostTypesProperty.builder()
 * .includeCredit(false)
 * .includeDiscount(false)
 * .includeOtherSubscription(false)
 * .includeRecurring(false)
 * .includeRefund(false)
 * .includeSubscription(false)
 * .includeSupport(false)
 * .includeTax(false)
 * .includeUpfront(false)
 * .useAmortized(false)
 * .useBlended(false)
 * .build())
 * .plannedBudgetLimits(plannedBudgetLimits)
 * .timePeriod(TimePeriodProperty.builder()
 * .end("end")
 * .start("start")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html)
 */
@CdkDslMarker
public class CfnBudgetBudgetDataPropertyDsl {
  private val cdkBuilder: CfnBudget.BudgetDataProperty.Builder =
      CfnBudget.BudgetDataProperty.builder()

  /**
   * @param autoAdjustData the value to be set.
   */
  public fun autoAdjustData(autoAdjustData: IResolvable) {
    cdkBuilder.autoAdjustData(autoAdjustData)
  }

  /**
   * @param autoAdjustData the value to be set.
   */
  public fun autoAdjustData(autoAdjustData: CfnBudget.AutoAdjustDataProperty) {
    cdkBuilder.autoAdjustData(autoAdjustData)
  }

  /**
   * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings Plans
   * utilization, or Savings Plans coverage that you want to track with your budget.
   * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
   * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
   * `100` . This is the only valid value for RI or Savings Plans utilization or coverage budgets. You
   * can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and `UpdateBudget` actions.
   */
  public fun budgetLimit(budgetLimit: IResolvable) {
    cdkBuilder.budgetLimit(budgetLimit)
  }

  /**
   * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings Plans
   * utilization, or Savings Plans coverage that you want to track with your budget.
   * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
   * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
   * `100` . This is the only valid value for RI or Savings Plans utilization or coverage budgets. You
   * can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and `UpdateBudget` actions.
   */
  public fun budgetLimit(budgetLimit: CfnBudget.SpendProperty) {
    cdkBuilder.budgetLimit(budgetLimit)
  }

  /**
   * @param budgetName The name of a budget.
   * The value must be unique within an account. `BudgetName` can't include `:` and `\` characters.
   * If you don't include value for `BudgetName` in the template, Billing and Cost Management assigns
   * your budget a randomly generated name.
   */
  public fun budgetName(budgetName: String) {
    cdkBuilder.budgetName(budgetName)
  }

  /**
   * @param budgetType Specifies whether this budget tracks costs, usage, RI utilization, RI
   * coverage, Savings Plans utilization, or Savings Plans coverage. 
   */
  public fun budgetType(budgetType: String) {
    cdkBuilder.budgetType(budgetType)
  }

  /**
   * @param costFilters The cost filters, such as `Region` , `Service` , `member account` , `Tag` ,
   * or `Cost Category` , that are applied to a budget.
   * AWS Budgets supports the following services as a `Service` filter for RI budgets:
   *
   * * Amazon EC2
   * * Amazon Redshift
   * * Amazon Relational Database Service
   * * Amazon ElastiCache
   * * Amazon OpenSearch Service
   */
  public fun costFilters(costFilters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(costFilters)
    cdkBuilder.costFilters(builder.map)
  }

  /**
   * @param costFilters The cost filters, such as `Region` , `Service` , `member account` , `Tag` ,
   * or `Cost Category` , that are applied to a budget.
   * AWS Budgets supports the following services as a `Service` filter for RI budgets:
   *
   * * Amazon EC2
   * * Amazon Redshift
   * * Amazon Relational Database Service
   * * Amazon ElastiCache
   * * Amazon OpenSearch Service
   */
  public fun costFilters(costFilters: Any) {
    cdkBuilder.costFilters(costFilters)
  }

  /**
   * @param costTypes The types of costs that are included in this `COST` budget.
   * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
   * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
   */
  public fun costTypes(costTypes: IResolvable) {
    cdkBuilder.costTypes(costTypes)
  }

  /**
   * @param costTypes The types of costs that are included in this `COST` budget.
   * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
   * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
   */
  public fun costTypes(costTypes: CfnBudget.CostTypesProperty) {
    cdkBuilder.costTypes(costTypes)
  }

  /**
   * @param plannedBudgetLimits A map containing multiple `BudgetLimit` , including current or
   * future limits.
   * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
   * quarterly `TimeUnit` .
   *
   * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start from
   * the current month and include the next 11 months. The `key` is the start of the month, `UTC` in
   * epoch seconds.
   *
   * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in standard
   * calendar quarter increments. This must start from the current quarter and include the next three
   * quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
   *
   * If the planned budget expires before 12 months for monthly or four quarters for quarterly,
   * provide the `PlannedBudgetLimits` values only for the remaining periods.
   *
   * If the budget begins at a date in the future, provide `PlannedBudgetLimits` values from the
   * start date of the budget.
   *
   * After all of the `BudgetLimit` values in `PlannedBudgetLimits` are used, the budget continues
   * to use the last limit as the `BudgetLimit` . At that point, the planned budget provides the same
   * experience as a fixed budget.
   *
   * `DescribeBudget` and `DescribeBudgets` response along with `PlannedBudgetLimits` also contain
   * `BudgetLimit` representing the current month or quarter limit present in `PlannedBudgetLimits` .
   * This only applies to budgets that are created with `PlannedBudgetLimits` . Budgets that are
   * created without `PlannedBudgetLimits` only contain `BudgetLimit` . They don't contain
   * `PlannedBudgetLimits` .
   */
  public fun plannedBudgetLimits(plannedBudgetLimits: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(plannedBudgetLimits)
    cdkBuilder.plannedBudgetLimits(builder.map)
  }

  /**
   * @param plannedBudgetLimits A map containing multiple `BudgetLimit` , including current or
   * future limits.
   * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
   * quarterly `TimeUnit` .
   *
   * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start from
   * the current month and include the next 11 months. The `key` is the start of the month, `UTC` in
   * epoch seconds.
   *
   * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in standard
   * calendar quarter increments. This must start from the current quarter and include the next three
   * quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
   *
   * If the planned budget expires before 12 months for monthly or four quarters for quarterly,
   * provide the `PlannedBudgetLimits` values only for the remaining periods.
   *
   * If the budget begins at a date in the future, provide `PlannedBudgetLimits` values from the
   * start date of the budget.
   *
   * After all of the `BudgetLimit` values in `PlannedBudgetLimits` are used, the budget continues
   * to use the last limit as the `BudgetLimit` . At that point, the planned budget provides the same
   * experience as a fixed budget.
   *
   * `DescribeBudget` and `DescribeBudgets` response along with `PlannedBudgetLimits` also contain
   * `BudgetLimit` representing the current month or quarter limit present in `PlannedBudgetLimits` .
   * This only applies to budgets that are created with `PlannedBudgetLimits` . Budgets that are
   * created without `PlannedBudgetLimits` only contain `BudgetLimit` . They don't contain
   * `PlannedBudgetLimits` .
   */
  public fun plannedBudgetLimits(plannedBudgetLimits: Any) {
    cdkBuilder.plannedBudgetLimits(plannedBudgetLimits)
  }

  /**
   * @param timePeriod The period of time that is covered by a budget.
   * The period has a start date and an end date. The start date must come before the end date.
   * There are no restrictions on the end date.
   *
   * The start date for a budget. If you created your budget and didn't specify a start date, the
   * start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For
   * example, if you create your budget on January 24, 2019, choose `MONTHLY` , and don't set a start
   * date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS
   * Billing and Cost Management console and the API.
   *
   * You can change your start date with the `UpdateBudget` operation.
   *
   * After the end date, AWS deletes the budget and all associated notifications and subscribers.
   */
  public fun timePeriod(timePeriod: IResolvable) {
    cdkBuilder.timePeriod(timePeriod)
  }

  /**
   * @param timePeriod The period of time that is covered by a budget.
   * The period has a start date and an end date. The start date must come before the end date.
   * There are no restrictions on the end date.
   *
   * The start date for a budget. If you created your budget and didn't specify a start date, the
   * start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For
   * example, if you create your budget on January 24, 2019, choose `MONTHLY` , and don't set a start
   * date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS
   * Billing and Cost Management console and the API.
   *
   * You can change your start date with the `UpdateBudget` operation.
   *
   * After the end date, AWS deletes the budget and all associated notifications and subscribers.
   */
  public fun timePeriod(timePeriod: CfnBudget.TimePeriodProperty) {
    cdkBuilder.timePeriod(timePeriod)
  }

  /**
   * @param timeUnit The length of time until a budget resets the actual and forecasted spend. 
   * `DAILY` is available only for `RI_UTILIZATION` and `RI_COVERAGE` budgets.
   */
  public fun timeUnit(timeUnit: String) {
    cdkBuilder.timeUnit(timeUnit)
  }

  public fun build(): CfnBudget.BudgetDataProperty = cdkBuilder.build()
}
