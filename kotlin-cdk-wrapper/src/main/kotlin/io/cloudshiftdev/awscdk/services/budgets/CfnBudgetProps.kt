@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBudget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.budgets.*;
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
public interface CfnBudgetProps {
  /**
   * The budget object that you want to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
   */
  public fun budget(): Any

  /**
   * A notification that you want to associate with a budget.
   *
   * A budget can have up to five notifications, and each notification can have one SNS subscriber
   * and up to 10 email subscribers. If you include notifications and subscribers in your
   * `CreateBudget` call, AWS creates the notifications and subscribers for you.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
   */
  public fun notificationsWithSubscribers(): Any? = unwrap(this).getNotificationsWithSubscribers()

  /**
   * A builder for [CfnBudgetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param budget The budget object that you want to create. 
     */
    public fun budget(budget: IResolvable)

    /**
     * @param budget The budget object that you want to create. 
     */
    public fun budget(budget: CfnBudget.BudgetDataProperty)

    /**
     * @param budget The budget object that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4934b00ace1fddd3bdf38d9af5920b5480ab1e28ba84c56df3b4e0575ad1e34c")
    public fun budget(budget: CfnBudget.BudgetDataProperty.Builder.() -> Unit)

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable)

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    public fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>)

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudgetProps.Builder =
        software.amazon.awscdk.services.budgets.CfnBudgetProps.builder()

    /**
     * @param budget The budget object that you want to create. 
     */
    override fun budget(budget: IResolvable) {
      cdkBuilder.budget(budget.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param budget The budget object that you want to create. 
     */
    override fun budget(budget: CfnBudget.BudgetDataProperty) {
      cdkBuilder.budget(budget.let(CfnBudget.BudgetDataProperty.Companion::unwrap))
    }

    /**
     * @param budget The budget object that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4934b00ace1fddd3bdf38d9af5920b5480ab1e28ba84c56df3b4e0575ad1e34c")
    override fun budget(budget: CfnBudget.BudgetDataProperty.Builder.() -> Unit): Unit =
        budget(CfnBudget.BudgetDataProperty(budget))

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    override fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    override fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param notificationsWithSubscribers A notification that you want to associate with a budget.
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     */
    override fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any): Unit =
        notificationsWithSubscribers(notificationsWithSubscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudgetProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetProps,
  ) : CdkObject(cdkObject), CfnBudgetProps {
    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     */
    override fun budget(): Any = unwrap(this).getBudget()

    /**
     * A notification that you want to associate with a budget.
     *
     * A budget can have up to five notifications, and each notification can have one SNS subscriber
     * and up to 10 email subscribers. If you include notifications and subscribers in your
     * `CreateBudget` call, AWS creates the notifications and subscribers for you.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers)
     */
    override fun notificationsWithSubscribers(): Any? =
        unwrap(this).getNotificationsWithSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBudgetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudgetProps):
        CfnBudgetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBudgetProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBudgetProps):
        software.amazon.awscdk.services.budgets.CfnBudgetProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.budgets.CfnBudgetProps
  }
}
