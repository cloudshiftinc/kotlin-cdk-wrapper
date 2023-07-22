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
