@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps

/**
 * Properties for defining a `CfnBudget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * Object costFilters;
 * Object plannedBudgetLimits;
 * CfnBudgetProps cfnBudgetProps = CfnBudgetProps.builder()
 * .budget(BudgetDataProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .notificationsWithSubscribers(List.of(NotificationWithSubscribersProperty.builder()
 * .notification(NotificationProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .notificationType("notificationType")
 * .threshold(123)
 * // the properties below are optional
 * .thresholdType("thresholdType")
 * .build())
 * .subscribers(List.of(SubscriberProperty.builder()
 * .address("address")
 * .subscriptionType("subscriptionType")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html)
 */
@CdkDslMarker
public class CfnBudgetPropsDsl {
  private val cdkBuilder: CfnBudgetProps.Builder = CfnBudgetProps.builder()

  private val _notificationsWithSubscribers: MutableList<Any> = mutableListOf()

  /**
   * @param budget The budget object that you want to create. 
   */
  public fun budget(budget: IResolvable) {
    cdkBuilder.budget(budget)
  }

  /**
   * @param budget The budget object that you want to create. 
   */
  public fun budget(budget: CfnBudget.BudgetDataProperty) {
    cdkBuilder.budget(budget)
  }

  /**
   * @param notificationsWithSubscribers A notification that you want to associate with a budget.
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   */
  public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any) {
    _notificationsWithSubscribers.addAll(listOf(*notificationsWithSubscribers))
  }

  /**
   * @param notificationsWithSubscribers A notification that you want to associate with a budget.
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   */
  public fun notificationsWithSubscribers(notificationsWithSubscribers: Collection<Any>) {
    _notificationsWithSubscribers.addAll(notificationsWithSubscribers)
  }

  /**
   * @param notificationsWithSubscribers A notification that you want to associate with a budget.
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   */
  public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
    cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers)
  }

  public fun build(): CfnBudgetProps {
    if(_notificationsWithSubscribers.isNotEmpty())
        cdkBuilder.notificationsWithSubscribers(_notificationsWithSubscribers)
    return cdkBuilder.build()
  }
}
