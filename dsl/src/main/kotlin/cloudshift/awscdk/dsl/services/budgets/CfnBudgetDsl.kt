@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget
import software.constructs.Construct

/**
 * The `AWS::Budgets::Budget` resource allows customers to take pre-defined actions that will
 * trigger once a budget threshold has been exceeded.
 *
 * creates, replaces, or deletes budgets for Billing and Cost Management. For more information, see
 * [Managing Your Costs with
 * Budgets](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html)
 * in the *AWS Billing and Cost Management User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * Object costFilters;
 * Object plannedBudgetLimits;
 * CfnBudget cfnBudget = CfnBudget.Builder.create(this, "MyCfnBudget")
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
public class CfnBudgetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBudget.Builder = CfnBudget.Builder.create(scope, id)

  private val _notificationsWithSubscribers: MutableList<Any> = mutableListOf()

  /**
   * The budget object that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
   * @param budget The budget object that you want to create. 
   */
  public fun budget(budget: IResolvable) {
    cdkBuilder.budget(budget)
  }

  /**
   * The budget object that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
   * @param budget The budget object that you want to create. 
   */
  public fun budget(budget: CfnBudget.BudgetDataProperty) {
    cdkBuilder.budget(budget)
  }

  /**
   * A notification that you want to associate with a budget.
   *
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
   * @param notificationsWithSubscribers A notification that you want to associate with a budget. 
   */
  public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any) {
    _notificationsWithSubscribers.addAll(listOf(*notificationsWithSubscribers))
  }

  /**
   * A notification that you want to associate with a budget.
   *
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
   * @param notificationsWithSubscribers A notification that you want to associate with a budget. 
   */
  public fun notificationsWithSubscribers(notificationsWithSubscribers: Collection<Any>) {
    _notificationsWithSubscribers.addAll(notificationsWithSubscribers)
  }

  /**
   * A notification that you want to associate with a budget.
   *
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
   * @param notificationsWithSubscribers A notification that you want to associate with a budget. 
   */
  public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
    cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers)
  }

  public fun build(): CfnBudget {
    if(_notificationsWithSubscribers.isNotEmpty())
        cdkBuilder.notificationsWithSubscribers(_notificationsWithSubscribers)
    return cdkBuilder.build()
  }
}
