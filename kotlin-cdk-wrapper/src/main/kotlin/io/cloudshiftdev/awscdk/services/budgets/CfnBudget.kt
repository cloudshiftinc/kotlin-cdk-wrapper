@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.budgets

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.budgets.*;
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
public open class CfnBudget(
  cdkObject: software.amazon.awscdk.services.budgets.CfnBudget,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBudgetProps,
  ) :
      this(software.amazon.awscdk.services.budgets.CfnBudget(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnBudgetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnBudgetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnBudgetProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The budget object that you want to create.
   */
  public open fun budget(): Any = unwrap(this).getBudget()

  /**
   * The budget object that you want to create.
   */
  public open fun budget(`value`: IResolvable) {
    unwrap(this).setBudget(`value`.let(IResolvable::unwrap))
  }

  /**
   * The budget object that you want to create.
   */
  public open fun budget(`value`: BudgetDataProperty) {
    unwrap(this).setBudget(`value`.let(BudgetDataProperty::unwrap))
  }

  /**
   * The budget object that you want to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec15b9885e0b46bad7ec5e25e4e8f0e45f5a7eb32cc6100ea7e4859e06bd94c6")
  public open fun budget(`value`: BudgetDataProperty.Builder.() -> Unit): Unit =
      budget(BudgetDataProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A notification that you want to associate with a budget.
   */
  public open fun notificationsWithSubscribers(): Any? =
      unwrap(this).getNotificationsWithSubscribers()

  /**
   * A notification that you want to associate with a budget.
   */
  public open fun notificationsWithSubscribers(`value`: IResolvable) {
    unwrap(this).setNotificationsWithSubscribers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A notification that you want to associate with a budget.
   */
  public open fun notificationsWithSubscribers(`value`: List<Any>) {
    unwrap(this).setNotificationsWithSubscribers(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A notification that you want to associate with a budget.
   */
  public open fun notificationsWithSubscribers(vararg `value`: Any): Unit =
      notificationsWithSubscribers(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.budgets.CfnBudget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    public fun budget(budget: IResolvable)

    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    public fun budget(budget: BudgetDataProperty)

    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("805381e53d3bae26faaf147ecc7138d323f4e3bcc3f9e783f86d2f96395ae6d3")
    public fun budget(budget: BudgetDataProperty.Builder.() -> Unit)

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
    public fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable)

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
    public fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>)

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
    public fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.budgets.CfnBudget.Builder =
        software.amazon.awscdk.services.budgets.CfnBudget.Builder.create(scope, id)

    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    override fun budget(budget: IResolvable) {
      cdkBuilder.budget(budget.let(IResolvable::unwrap))
    }

    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    override fun budget(budget: BudgetDataProperty) {
      cdkBuilder.budget(budget.let(BudgetDataProperty::unwrap))
    }

    /**
     * The budget object that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-budget)
     * @param budget The budget object that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("805381e53d3bae26faaf147ecc7138d323f4e3bcc3f9e783f86d2f96395ae6d3")
    override fun budget(budget: BudgetDataProperty.Builder.() -> Unit): Unit =
        budget(BudgetDataProperty(budget))

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
    override fun notificationsWithSubscribers(notificationsWithSubscribers: IResolvable) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.let(IResolvable::unwrap))
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
    override fun notificationsWithSubscribers(notificationsWithSubscribers: List<Any>) {
      cdkBuilder.notificationsWithSubscribers(notificationsWithSubscribers.map{CdkObjectWrappers.unwrap(it)})
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
    override fun notificationsWithSubscribers(vararg notificationsWithSubscribers: Any): Unit =
        notificationsWithSubscribers(notificationsWithSubscribers.toList())

    public fun build(): software.amazon.awscdk.services.budgets.CfnBudget = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.budgets.CfnBudget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBudget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBudget(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget): CfnBudget =
        CfnBudget(cdkObject)

    internal fun unwrap(wrapped: CfnBudget): software.amazon.awscdk.services.budgets.CfnBudget =
        wrapped.cdkObject as software.amazon.awscdk.services.budgets.CfnBudget
  }

  /**
   * Determine the budget amount for an auto-adjusting budget.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * AutoAdjustDataProperty autoAdjustDataProperty = AutoAdjustDataProperty.builder()
   * .autoAdjustType("autoAdjustType")
   * // the properties below are optional
   * .historicalOptions(HistoricalOptionsProperty.builder()
   * .budgetAdjustmentPeriod(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html)
   */
  public interface AutoAdjustDataProperty {
    /**
     * The string that defines whether your budget auto-adjusts based on historical or forecasted
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html#cfn-budgets-budget-autoadjustdata-autoadjusttype)
     */
    public fun autoAdjustType(): String

    /**
     * The parameters that define or describe the historical data that your auto-adjusting budget is
     * based on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html#cfn-budgets-budget-autoadjustdata-historicaloptions)
     */
    public fun historicalOptions(): Any? = unwrap(this).getHistoricalOptions()

    /**
     * A builder for [AutoAdjustDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoAdjustType The string that defines whether your budget auto-adjusts based on
       * historical or forecasted data. 
       */
      public fun autoAdjustType(autoAdjustType: String)

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      public fun historicalOptions(historicalOptions: IResolvable)

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      public fun historicalOptions(historicalOptions: HistoricalOptionsProperty)

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5eceb443e67551a23c0248352444c86100f311f34ebddb20ea68d14d5ad8abaf")
      public fun historicalOptions(historicalOptions: HistoricalOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty.builder()

      /**
       * @param autoAdjustType The string that defines whether your budget auto-adjusts based on
       * historical or forecasted data. 
       */
      override fun autoAdjustType(autoAdjustType: String) {
        cdkBuilder.autoAdjustType(autoAdjustType)
      }

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      override fun historicalOptions(historicalOptions: IResolvable) {
        cdkBuilder.historicalOptions(historicalOptions.let(IResolvable::unwrap))
      }

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      override fun historicalOptions(historicalOptions: HistoricalOptionsProperty) {
        cdkBuilder.historicalOptions(historicalOptions.let(HistoricalOptionsProperty::unwrap))
      }

      /**
       * @param historicalOptions The parameters that define or describe the historical data that
       * your auto-adjusting budget is based on.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5eceb443e67551a23c0248352444c86100f311f34ebddb20ea68d14d5ad8abaf")
      override
          fun historicalOptions(historicalOptions: HistoricalOptionsProperty.Builder.() -> Unit):
          Unit = historicalOptions(HistoricalOptionsProperty(historicalOptions))

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty,
    ) : CdkObject(cdkObject), AutoAdjustDataProperty {
      /**
       * The string that defines whether your budget auto-adjusts based on historical or forecasted
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html#cfn-budgets-budget-autoadjustdata-autoadjusttype)
       */
      override fun autoAdjustType(): String = unwrap(this).getAutoAdjustType()

      /**
       * The parameters that define or describe the historical data that your auto-adjusting budget
       * is based on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html#cfn-budgets-budget-autoadjustdata-historicaloptions)
       */
      override fun historicalOptions(): Any? = unwrap(this).getHistoricalOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoAdjustDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty):
          AutoAdjustDataProperty = CdkObjectWrappers.wrap(cdkObject) as? AutoAdjustDataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoAdjustDataProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.AutoAdjustDataProperty
    }
  }

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
   * import io.cloudshiftdev.awscdk.services.budgets.*;
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
  public interface BudgetDataProperty {
    /**
     * Determine the budget amount for an auto-adjusting budget.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-autoadjustdata)
     */
    public fun autoAdjustData(): Any? = unwrap(this).getAutoAdjustData()

    /**
     * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or
     * Savings Plans coverage that you want to track with your budget.
     *
     * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
     * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default to
     * `100` . This is the only valid value for RI or Savings Plans utilization or coverage budgets.
     * You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and `UpdateBudget`
     * actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
     */
    public fun budgetLimit(): Any? = unwrap(this).getBudgetLimit()

    /**
     * The name of a budget.
     *
     * The value must be unique within an account. `BudgetName` can't include `:` and `\`
     * characters. If you don't include value for `BudgetName` in the template, Billing and Cost
     * Management assigns your budget a randomly generated name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
     */
    public fun budgetName(): String? = unwrap(this).getBudgetName()

    /**
     * Specifies whether this budget tracks costs, usage, RI utilization, RI coverage, Savings Plans
     * utilization, or Savings Plans coverage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
     */
    public fun budgetType(): String

    /**
     * The cost filters, such as `Region` , `Service` , `LinkedAccount` , `Tag` , or `CostCategory`
     * , that are applied to a budget.
     *
     * AWS Budgets supports the following services as a `Service` filter for RI budgets:
     *
     * * Amazon EC2
     * * Amazon Redshift
     * * Amazon Relational Database Service
     * * Amazon ElastiCache
     * * Amazon OpenSearch Service
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
     */
    public fun costFilters(): Any? = unwrap(this).getCostFilters()

    /**
     * The types of costs that are included in this `COST` budget.
     *
     * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
     * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
     */
    public fun costTypes(): Any? = unwrap(this).getCostTypes()

    /**
     * A map containing multiple `BudgetLimit` , including current or future limits.
     *
     * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
     * quarterly `TimeUnit` .
     *
     * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start from
     * the current month and include the next 11 months. The `key` is the start of the month, `UTC` in
     * epoch seconds.
     *
     * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in
     * standard calendar quarter increments. This must start from the current quarter and include the
     * next three quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-plannedbudgetlimits)
     */
    public fun plannedBudgetLimits(): Any? = unwrap(this).getPlannedBudgetLimits()

    /**
     * The period of time that is covered by a budget.
     *
     * The period has a start date and an end date. The start date must come before the end date.
     * There are no restrictions on the end date.
     *
     * The start date for a budget. If you created your budget and didn't specify a start date, the
     * start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY).
     * For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and don't set a
     * start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the same for the
     * AWS Billing and Cost Management console and the API.
     *
     * You can change your start date with the `UpdateBudget` operation.
     *
     * After the end date, AWS deletes the budget and all associated notifications and subscribers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
     */
    public fun timePeriod(): Any? = unwrap(this).getTimePeriod()

    /**
     * The length of time until a budget resets the actual and forecasted spend.
     *
     * `DAILY` is available only for `RI_UTILIZATION` and `RI_COVERAGE` budgets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
     */
    public fun timeUnit(): String

    /**
     * A builder for [BudgetDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      public fun autoAdjustData(autoAdjustData: IResolvable)

      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      public fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty)

      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88da46d360439fbdd476f26c072bc4756180ee7bf65db6f45bcaf700dd1a5cc2")
      public fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty.Builder.() -> Unit)

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      public fun budgetLimit(budgetLimit: IResolvable)

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      public fun budgetLimit(budgetLimit: SpendProperty)

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9929afba155990a7b3a96b9693be190ec7ff27cc990634ebd7d705d12c04bd3")
      public fun budgetLimit(budgetLimit: SpendProperty.Builder.() -> Unit)

      /**
       * @param budgetName The name of a budget.
       * The value must be unique within an account. `BudgetName` can't include `:` and `\`
       * characters. If you don't include value for `BudgetName` in the template, Billing and Cost
       * Management assigns your budget a randomly generated name.
       */
      public fun budgetName(budgetName: String)

      /**
       * @param budgetType Specifies whether this budget tracks costs, usage, RI utilization, RI
       * coverage, Savings Plans utilization, or Savings Plans coverage. 
       */
      public fun budgetType(budgetType: String)

      /**
       * @param costFilters The cost filters, such as `Region` , `Service` , `LinkedAccount` , `Tag`
       * , or `CostCategory` , that are applied to a budget.
       * AWS Budgets supports the following services as a `Service` filter for RI budgets:
       *
       * * Amazon EC2
       * * Amazon Redshift
       * * Amazon Relational Database Service
       * * Amazon ElastiCache
       * * Amazon OpenSearch Service
       */
      public fun costFilters(costFilters: Any)

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      public fun costTypes(costTypes: IResolvable)

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      public fun costTypes(costTypes: CostTypesProperty)

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf7f848834fde77eaa0b63ed9552ca5b82e3a0feebc0022953f77cb7a7d5f2d")
      public fun costTypes(costTypes: CostTypesProperty.Builder.() -> Unit)

      /**
       * @param plannedBudgetLimits A map containing multiple `BudgetLimit` , including current or
       * future limits.
       * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
       * quarterly `TimeUnit` .
       *
       * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start
       * from the current month and include the next 11 months. The `key` is the start of the month,
       * `UTC` in epoch seconds.
       *
       * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in
       * standard calendar quarter increments. This must start from the current quarter and include the
       * next three quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
       *
       * If the planned budget expires before 12 months for monthly or four quarters for quarterly,
       * provide the `PlannedBudgetLimits` values only for the remaining periods.
       *
       * If the budget begins at a date in the future, provide `PlannedBudgetLimits` values from the
       * start date of the budget.
       *
       * After all of the `BudgetLimit` values in `PlannedBudgetLimits` are used, the budget
       * continues to use the last limit as the `BudgetLimit` . At that point, the planned budget
       * provides the same experience as a fixed budget.
       *
       * `DescribeBudget` and `DescribeBudgets` response along with `PlannedBudgetLimits` also
       * contain `BudgetLimit` representing the current month or quarter limit present in
       * `PlannedBudgetLimits` . This only applies to budgets that are created with
       * `PlannedBudgetLimits` . Budgets that are created without `PlannedBudgetLimits` only contain
       * `BudgetLimit` . They don't contain `PlannedBudgetLimits` .
       */
      public fun plannedBudgetLimits(plannedBudgetLimits: Any)

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      public fun timePeriod(timePeriod: IResolvable)

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      public fun timePeriod(timePeriod: TimePeriodProperty)

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f58d149cd4e7598ae6a77dfe53d7eda6c7ebed8332b42d73fc1aba4117073fc")
      public fun timePeriod(timePeriod: TimePeriodProperty.Builder.() -> Unit)

      /**
       * @param timeUnit The length of time until a budget resets the actual and forecasted spend. 
       * `DAILY` is available only for `RI_UTILIZATION` and `RI_COVERAGE` budgets.
       */
      public fun timeUnit(timeUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty.builder()

      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      override fun autoAdjustData(autoAdjustData: IResolvable) {
        cdkBuilder.autoAdjustData(autoAdjustData.let(IResolvable::unwrap))
      }

      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      override fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty) {
        cdkBuilder.autoAdjustData(autoAdjustData.let(AutoAdjustDataProperty::unwrap))
      }

      /**
       * @param autoAdjustData Determine the budget amount for an auto-adjusting budget.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88da46d360439fbdd476f26c072bc4756180ee7bf65db6f45bcaf700dd1a5cc2")
      override fun autoAdjustData(autoAdjustData: AutoAdjustDataProperty.Builder.() -> Unit): Unit =
          autoAdjustData(AutoAdjustDataProperty(autoAdjustData))

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      override fun budgetLimit(budgetLimit: IResolvable) {
        cdkBuilder.budgetLimit(budgetLimit.let(IResolvable::unwrap))
      }

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      override fun budgetLimit(budgetLimit: SpendProperty) {
        cdkBuilder.budgetLimit(budgetLimit.let(SpendProperty::unwrap))
      }

      /**
       * @param budgetLimit The total amount of cost, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage that you want to track with your budget.
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9929afba155990a7b3a96b9693be190ec7ff27cc990634ebd7d705d12c04bd3")
      override fun budgetLimit(budgetLimit: SpendProperty.Builder.() -> Unit): Unit =
          budgetLimit(SpendProperty(budgetLimit))

      /**
       * @param budgetName The name of a budget.
       * The value must be unique within an account. `BudgetName` can't include `:` and `\`
       * characters. If you don't include value for `BudgetName` in the template, Billing and Cost
       * Management assigns your budget a randomly generated name.
       */
      override fun budgetName(budgetName: String) {
        cdkBuilder.budgetName(budgetName)
      }

      /**
       * @param budgetType Specifies whether this budget tracks costs, usage, RI utilization, RI
       * coverage, Savings Plans utilization, or Savings Plans coverage. 
       */
      override fun budgetType(budgetType: String) {
        cdkBuilder.budgetType(budgetType)
      }

      /**
       * @param costFilters The cost filters, such as `Region` , `Service` , `LinkedAccount` , `Tag`
       * , or `CostCategory` , that are applied to a budget.
       * AWS Budgets supports the following services as a `Service` filter for RI budgets:
       *
       * * Amazon EC2
       * * Amazon Redshift
       * * Amazon Relational Database Service
       * * Amazon ElastiCache
       * * Amazon OpenSearch Service
       */
      override fun costFilters(costFilters: Any) {
        cdkBuilder.costFilters(costFilters)
      }

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      override fun costTypes(costTypes: IResolvable) {
        cdkBuilder.costTypes(costTypes.let(IResolvable::unwrap))
      }

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      override fun costTypes(costTypes: CostTypesProperty) {
        cdkBuilder.costTypes(costTypes.let(CostTypesProperty::unwrap))
      }

      /**
       * @param costTypes The types of costs that are included in this `COST` budget.
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6cf7f848834fde77eaa0b63ed9552ca5b82e3a0feebc0022953f77cb7a7d5f2d")
      override fun costTypes(costTypes: CostTypesProperty.Builder.() -> Unit): Unit =
          costTypes(CostTypesProperty(costTypes))

      /**
       * @param plannedBudgetLimits A map containing multiple `BudgetLimit` , including current or
       * future limits.
       * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
       * quarterly `TimeUnit` .
       *
       * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start
       * from the current month and include the next 11 months. The `key` is the start of the month,
       * `UTC` in epoch seconds.
       *
       * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in
       * standard calendar quarter increments. This must start from the current quarter and include the
       * next three quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
       *
       * If the planned budget expires before 12 months for monthly or four quarters for quarterly,
       * provide the `PlannedBudgetLimits` values only for the remaining periods.
       *
       * If the budget begins at a date in the future, provide `PlannedBudgetLimits` values from the
       * start date of the budget.
       *
       * After all of the `BudgetLimit` values in `PlannedBudgetLimits` are used, the budget
       * continues to use the last limit as the `BudgetLimit` . At that point, the planned budget
       * provides the same experience as a fixed budget.
       *
       * `DescribeBudget` and `DescribeBudgets` response along with `PlannedBudgetLimits` also
       * contain `BudgetLimit` representing the current month or quarter limit present in
       * `PlannedBudgetLimits` . This only applies to budgets that are created with
       * `PlannedBudgetLimits` . Budgets that are created without `PlannedBudgetLimits` only contain
       * `BudgetLimit` . They don't contain `PlannedBudgetLimits` .
       */
      override fun plannedBudgetLimits(plannedBudgetLimits: Any) {
        cdkBuilder.plannedBudgetLimits(plannedBudgetLimits)
      }

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      override fun timePeriod(timePeriod: IResolvable) {
        cdkBuilder.timePeriod(timePeriod.let(IResolvable::unwrap))
      }

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      override fun timePeriod(timePeriod: TimePeriodProperty) {
        cdkBuilder.timePeriod(timePeriod.let(TimePeriodProperty::unwrap))
      }

      /**
       * @param timePeriod The period of time that is covered by a budget.
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2f58d149cd4e7598ae6a77dfe53d7eda6c7ebed8332b42d73fc1aba4117073fc")
      override fun timePeriod(timePeriod: TimePeriodProperty.Builder.() -> Unit): Unit =
          timePeriod(TimePeriodProperty(timePeriod))

      /**
       * @param timeUnit The length of time until a budget resets the actual and forecasted spend. 
       * `DAILY` is available only for `RI_UTILIZATION` and `RI_COVERAGE` budgets.
       */
      override fun timeUnit(timeUnit: String) {
        cdkBuilder.timeUnit(timeUnit)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty,
    ) : CdkObject(cdkObject), BudgetDataProperty {
      /**
       * Determine the budget amount for an auto-adjusting budget.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-autoadjustdata)
       */
      override fun autoAdjustData(): Any? = unwrap(this).getAutoAdjustData()

      /**
       * The total amount of cost, usage, RI utilization, RI coverage, Savings Plans utilization, or
       * Savings Plans coverage that you want to track with your budget.
       *
       * `BudgetLimit` is required for cost or usage budgets, but optional for RI or Savings Plans
       * utilization or coverage budgets. RI and Savings Plans utilization or coverage budgets default
       * to `100` . This is the only valid value for RI or Savings Plans utilization or coverage
       * budgets. You can't use `BudgetLimit` with `PlannedBudgetLimits` for `CreateBudget` and
       * `UpdateBudget` actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetlimit)
       */
      override fun budgetLimit(): Any? = unwrap(this).getBudgetLimit()

      /**
       * The name of a budget.
       *
       * The value must be unique within an account. `BudgetName` can't include `:` and `\`
       * characters. If you don't include value for `BudgetName` in the template, Billing and Cost
       * Management assigns your budget a randomly generated name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname)
       */
      override fun budgetName(): String? = unwrap(this).getBudgetName()

      /**
       * Specifies whether this budget tracks costs, usage, RI utilization, RI coverage, Savings
       * Plans utilization, or Savings Plans coverage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype)
       */
      override fun budgetType(): String = unwrap(this).getBudgetType()

      /**
       * The cost filters, such as `Region` , `Service` , `LinkedAccount` , `Tag` , or
       * `CostCategory` , that are applied to a budget.
       *
       * AWS Budgets supports the following services as a `Service` filter for RI budgets:
       *
       * * Amazon EC2
       * * Amazon Redshift
       * * Amazon Relational Database Service
       * * Amazon ElastiCache
       * * Amazon OpenSearch Service
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters)
       */
      override fun costFilters(): Any? = unwrap(this).getCostFilters()

      /**
       * The types of costs that are included in this `COST` budget.
       *
       * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
       * `SAVINGS_PLANS_COVERAGE` budgets do not have `CostTypes` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costtypes)
       */
      override fun costTypes(): Any? = unwrap(this).getCostTypes()

      /**
       * A map containing multiple `BudgetLimit` , including current or future limits.
       *
       * `PlannedBudgetLimits` is available for cost or usage budget and supports both monthly and
       * quarterly `TimeUnit` .
       *
       * For monthly budgets, provide 12 months of `PlannedBudgetLimits` values. This must start
       * from the current month and include the next 11 months. The `key` is the start of the month,
       * `UTC` in epoch seconds.
       *
       * For quarterly budgets, provide four quarters of `PlannedBudgetLimits` value entries in
       * standard calendar quarter increments. This must start from the current quarter and include the
       * next three quarters. The `key` is the start of the quarter, `UTC` in epoch seconds.
       *
       * If the planned budget expires before 12 months for monthly or four quarters for quarterly,
       * provide the `PlannedBudgetLimits` values only for the remaining periods.
       *
       * If the budget begins at a date in the future, provide `PlannedBudgetLimits` values from the
       * start date of the budget.
       *
       * After all of the `BudgetLimit` values in `PlannedBudgetLimits` are used, the budget
       * continues to use the last limit as the `BudgetLimit` . At that point, the planned budget
       * provides the same experience as a fixed budget.
       *
       * `DescribeBudget` and `DescribeBudgets` response along with `PlannedBudgetLimits` also
       * contain `BudgetLimit` representing the current month or quarter limit present in
       * `PlannedBudgetLimits` . This only applies to budgets that are created with
       * `PlannedBudgetLimits` . Budgets that are created without `PlannedBudgetLimits` only contain
       * `BudgetLimit` . They don't contain `PlannedBudgetLimits` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-plannedbudgetlimits)
       */
      override fun plannedBudgetLimits(): Any? = unwrap(this).getPlannedBudgetLimits()

      /**
       * The period of time that is covered by a budget.
       *
       * The period has a start date and an end date. The start date must come before the end date.
       * There are no restrictions on the end date.
       *
       * The start date for a budget. If you created your budget and didn't specify a start date,
       * the start date defaults to the start of the chosen time period (MONTHLY, QUARTERLY, or
       * ANNUALLY). For example, if you create your budget on January 24, 2019, choose `MONTHLY` , and
       * don't set a start date, the start date defaults to `01/01/19 00:00 UTC` . The defaults are the
       * same for the AWS Billing and Cost Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * After the end date, AWS deletes the budget and all associated notifications and
       * subscribers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeperiod)
       */
      override fun timePeriod(): Any? = unwrap(this).getTimePeriod()

      /**
       * The length of time until a budget resets the actual and forecasted spend.
       *
       * `DAILY` is available only for `RI_UTILIZATION` and `RI_COVERAGE` budgets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit)
       */
      override fun timeUnit(): String = unwrap(this).getTimeUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BudgetDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty):
          BudgetDataProperty = CdkObjectWrappers.wrap(cdkObject) as? BudgetDataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BudgetDataProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.BudgetDataProperty
    }
  }

  /**
   * The types of cost that are included in a `COST` budget, such as tax and subscriptions.
   *
   * `USAGE` , `RI_UTILIZATION` , `RI_COVERAGE` , `SAVINGS_PLANS_UTILIZATION` , and
   * `SAVINGS_PLANS_COVERAGE` budgets don't have `CostTypes` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * CostTypesProperty costTypesProperty = CostTypesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html)
   */
  public interface CostTypesProperty {
    /**
     * Specifies whether a budget includes credits.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
     */
    public fun includeCredit(): Any? = unwrap(this).getIncludeCredit()

    /**
     * Specifies whether a budget includes discounts.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
     */
    public fun includeDiscount(): Any? = unwrap(this).getIncludeDiscount()

    /**
     * Specifies whether a budget includes non-RI subscription costs.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
     */
    public fun includeOtherSubscription(): Any? = unwrap(this).getIncludeOtherSubscription()

    /**
     * Specifies whether a budget includes recurring fees such as monthly RI fees.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
     */
    public fun includeRecurring(): Any? = unwrap(this).getIncludeRecurring()

    /**
     * Specifies whether a budget includes refunds.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
     */
    public fun includeRefund(): Any? = unwrap(this).getIncludeRefund()

    /**
     * Specifies whether a budget includes subscriptions.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
     */
    public fun includeSubscription(): Any? = unwrap(this).getIncludeSubscription()

    /**
     * Specifies whether a budget includes support subscription fees.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
     */
    public fun includeSupport(): Any? = unwrap(this).getIncludeSupport()

    /**
     * Specifies whether a budget includes taxes.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
     */
    public fun includeTax(): Any? = unwrap(this).getIncludeTax()

    /**
     * Specifies whether a budget includes upfront RI costs.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
     */
    public fun includeUpfront(): Any? = unwrap(this).getIncludeUpfront()

    /**
     * Specifies whether a budget uses the amortized rate.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
     */
    public fun useAmortized(): Any? = unwrap(this).getUseAmortized()

    /**
     * Specifies whether a budget uses a blended rate.
     *
     * The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
     */
    public fun useBlended(): Any? = unwrap(this).getUseBlended()

    /**
     * A builder for [CostTypesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param includeCredit Specifies whether a budget includes credits.
       * The default value is `true` .
       */
      public fun includeCredit(includeCredit: Boolean)

      /**
       * @param includeCredit Specifies whether a budget includes credits.
       * The default value is `true` .
       */
      public fun includeCredit(includeCredit: IResolvable)

      /**
       * @param includeDiscount Specifies whether a budget includes discounts.
       * The default value is `true` .
       */
      public fun includeDiscount(includeDiscount: Boolean)

      /**
       * @param includeDiscount Specifies whether a budget includes discounts.
       * The default value is `true` .
       */
      public fun includeDiscount(includeDiscount: IResolvable)

      /**
       * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
       * costs.
       * The default value is `true` .
       */
      public fun includeOtherSubscription(includeOtherSubscription: Boolean)

      /**
       * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
       * costs.
       * The default value is `true` .
       */
      public fun includeOtherSubscription(includeOtherSubscription: IResolvable)

      /**
       * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly
       * RI fees.
       * The default value is `true` .
       */
      public fun includeRecurring(includeRecurring: Boolean)

      /**
       * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly
       * RI fees.
       * The default value is `true` .
       */
      public fun includeRecurring(includeRecurring: IResolvable)

      /**
       * @param includeRefund Specifies whether a budget includes refunds.
       * The default value is `true` .
       */
      public fun includeRefund(includeRefund: Boolean)

      /**
       * @param includeRefund Specifies whether a budget includes refunds.
       * The default value is `true` .
       */
      public fun includeRefund(includeRefund: IResolvable)

      /**
       * @param includeSubscription Specifies whether a budget includes subscriptions.
       * The default value is `true` .
       */
      public fun includeSubscription(includeSubscription: Boolean)

      /**
       * @param includeSubscription Specifies whether a budget includes subscriptions.
       * The default value is `true` .
       */
      public fun includeSubscription(includeSubscription: IResolvable)

      /**
       * @param includeSupport Specifies whether a budget includes support subscription fees.
       * The default value is `true` .
       */
      public fun includeSupport(includeSupport: Boolean)

      /**
       * @param includeSupport Specifies whether a budget includes support subscription fees.
       * The default value is `true` .
       */
      public fun includeSupport(includeSupport: IResolvable)

      /**
       * @param includeTax Specifies whether a budget includes taxes.
       * The default value is `true` .
       */
      public fun includeTax(includeTax: Boolean)

      /**
       * @param includeTax Specifies whether a budget includes taxes.
       * The default value is `true` .
       */
      public fun includeTax(includeTax: IResolvable)

      /**
       * @param includeUpfront Specifies whether a budget includes upfront RI costs.
       * The default value is `true` .
       */
      public fun includeUpfront(includeUpfront: Boolean)

      /**
       * @param includeUpfront Specifies whether a budget includes upfront RI costs.
       * The default value is `true` .
       */
      public fun includeUpfront(includeUpfront: IResolvable)

      /**
       * @param useAmortized Specifies whether a budget uses the amortized rate.
       * The default value is `false` .
       */
      public fun useAmortized(useAmortized: Boolean)

      /**
       * @param useAmortized Specifies whether a budget uses the amortized rate.
       * The default value is `false` .
       */
      public fun useAmortized(useAmortized: IResolvable)

      /**
       * @param useBlended Specifies whether a budget uses a blended rate.
       * The default value is `false` .
       */
      public fun useBlended(useBlended: Boolean)

      /**
       * @param useBlended Specifies whether a budget uses a blended rate.
       * The default value is `false` .
       */
      public fun useBlended(useBlended: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty.builder()

      /**
       * @param includeCredit Specifies whether a budget includes credits.
       * The default value is `true` .
       */
      override fun includeCredit(includeCredit: Boolean) {
        cdkBuilder.includeCredit(includeCredit)
      }

      /**
       * @param includeCredit Specifies whether a budget includes credits.
       * The default value is `true` .
       */
      override fun includeCredit(includeCredit: IResolvable) {
        cdkBuilder.includeCredit(includeCredit.let(IResolvable::unwrap))
      }

      /**
       * @param includeDiscount Specifies whether a budget includes discounts.
       * The default value is `true` .
       */
      override fun includeDiscount(includeDiscount: Boolean) {
        cdkBuilder.includeDiscount(includeDiscount)
      }

      /**
       * @param includeDiscount Specifies whether a budget includes discounts.
       * The default value is `true` .
       */
      override fun includeDiscount(includeDiscount: IResolvable) {
        cdkBuilder.includeDiscount(includeDiscount.let(IResolvable::unwrap))
      }

      /**
       * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
       * costs.
       * The default value is `true` .
       */
      override fun includeOtherSubscription(includeOtherSubscription: Boolean) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription)
      }

      /**
       * @param includeOtherSubscription Specifies whether a budget includes non-RI subscription
       * costs.
       * The default value is `true` .
       */
      override fun includeOtherSubscription(includeOtherSubscription: IResolvable) {
        cdkBuilder.includeOtherSubscription(includeOtherSubscription.let(IResolvable::unwrap))
      }

      /**
       * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly
       * RI fees.
       * The default value is `true` .
       */
      override fun includeRecurring(includeRecurring: Boolean) {
        cdkBuilder.includeRecurring(includeRecurring)
      }

      /**
       * @param includeRecurring Specifies whether a budget includes recurring fees such as monthly
       * RI fees.
       * The default value is `true` .
       */
      override fun includeRecurring(includeRecurring: IResolvable) {
        cdkBuilder.includeRecurring(includeRecurring.let(IResolvable::unwrap))
      }

      /**
       * @param includeRefund Specifies whether a budget includes refunds.
       * The default value is `true` .
       */
      override fun includeRefund(includeRefund: Boolean) {
        cdkBuilder.includeRefund(includeRefund)
      }

      /**
       * @param includeRefund Specifies whether a budget includes refunds.
       * The default value is `true` .
       */
      override fun includeRefund(includeRefund: IResolvable) {
        cdkBuilder.includeRefund(includeRefund.let(IResolvable::unwrap))
      }

      /**
       * @param includeSubscription Specifies whether a budget includes subscriptions.
       * The default value is `true` .
       */
      override fun includeSubscription(includeSubscription: Boolean) {
        cdkBuilder.includeSubscription(includeSubscription)
      }

      /**
       * @param includeSubscription Specifies whether a budget includes subscriptions.
       * The default value is `true` .
       */
      override fun includeSubscription(includeSubscription: IResolvable) {
        cdkBuilder.includeSubscription(includeSubscription.let(IResolvable::unwrap))
      }

      /**
       * @param includeSupport Specifies whether a budget includes support subscription fees.
       * The default value is `true` .
       */
      override fun includeSupport(includeSupport: Boolean) {
        cdkBuilder.includeSupport(includeSupport)
      }

      /**
       * @param includeSupport Specifies whether a budget includes support subscription fees.
       * The default value is `true` .
       */
      override fun includeSupport(includeSupport: IResolvable) {
        cdkBuilder.includeSupport(includeSupport.let(IResolvable::unwrap))
      }

      /**
       * @param includeTax Specifies whether a budget includes taxes.
       * The default value is `true` .
       */
      override fun includeTax(includeTax: Boolean) {
        cdkBuilder.includeTax(includeTax)
      }

      /**
       * @param includeTax Specifies whether a budget includes taxes.
       * The default value is `true` .
       */
      override fun includeTax(includeTax: IResolvable) {
        cdkBuilder.includeTax(includeTax.let(IResolvable::unwrap))
      }

      /**
       * @param includeUpfront Specifies whether a budget includes upfront RI costs.
       * The default value is `true` .
       */
      override fun includeUpfront(includeUpfront: Boolean) {
        cdkBuilder.includeUpfront(includeUpfront)
      }

      /**
       * @param includeUpfront Specifies whether a budget includes upfront RI costs.
       * The default value is `true` .
       */
      override fun includeUpfront(includeUpfront: IResolvable) {
        cdkBuilder.includeUpfront(includeUpfront.let(IResolvable::unwrap))
      }

      /**
       * @param useAmortized Specifies whether a budget uses the amortized rate.
       * The default value is `false` .
       */
      override fun useAmortized(useAmortized: Boolean) {
        cdkBuilder.useAmortized(useAmortized)
      }

      /**
       * @param useAmortized Specifies whether a budget uses the amortized rate.
       * The default value is `false` .
       */
      override fun useAmortized(useAmortized: IResolvable) {
        cdkBuilder.useAmortized(useAmortized.let(IResolvable::unwrap))
      }

      /**
       * @param useBlended Specifies whether a budget uses a blended rate.
       * The default value is `false` .
       */
      override fun useBlended(useBlended: Boolean) {
        cdkBuilder.useBlended(useBlended)
      }

      /**
       * @param useBlended Specifies whether a budget uses a blended rate.
       * The default value is `false` .
       */
      override fun useBlended(useBlended: IResolvable) {
        cdkBuilder.useBlended(useBlended.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty,
    ) : CdkObject(cdkObject), CostTypesProperty {
      /**
       * Specifies whether a budget includes credits.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includecredit)
       */
      override fun includeCredit(): Any? = unwrap(this).getIncludeCredit()

      /**
       * Specifies whether a budget includes discounts.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includediscount)
       */
      override fun includeDiscount(): Any? = unwrap(this).getIncludeDiscount()

      /**
       * Specifies whether a budget includes non-RI subscription costs.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeothersubscription)
       */
      override fun includeOtherSubscription(): Any? = unwrap(this).getIncludeOtherSubscription()

      /**
       * Specifies whether a budget includes recurring fees such as monthly RI fees.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerecurring)
       */
      override fun includeRecurring(): Any? = unwrap(this).getIncludeRecurring()

      /**
       * Specifies whether a budget includes refunds.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includerefund)
       */
      override fun includeRefund(): Any? = unwrap(this).getIncludeRefund()

      /**
       * Specifies whether a budget includes subscriptions.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesubscription)
       */
      override fun includeSubscription(): Any? = unwrap(this).getIncludeSubscription()

      /**
       * Specifies whether a budget includes support subscription fees.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includesupport)
       */
      override fun includeSupport(): Any? = unwrap(this).getIncludeSupport()

      /**
       * Specifies whether a budget includes taxes.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includetax)
       */
      override fun includeTax(): Any? = unwrap(this).getIncludeTax()

      /**
       * Specifies whether a budget includes upfront RI costs.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-includeupfront)
       */
      override fun includeUpfront(): Any? = unwrap(this).getIncludeUpfront()

      /**
       * Specifies whether a budget uses the amortized rate.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useamortized)
       */
      override fun useAmortized(): Any? = unwrap(this).getUseAmortized()

      /**
       * Specifies whether a budget uses a blended rate.
       *
       * The default value is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html#cfn-budgets-budget-costtypes-useblended)
       */
      override fun useBlended(): Any? = unwrap(this).getUseBlended()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CostTypesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty):
          CostTypesProperty = CdkObjectWrappers.wrap(cdkObject) as? CostTypesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CostTypesProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.CostTypesProperty
    }
  }

  /**
   * The parameters that define or describe the historical data that your auto-adjusting budget is
   * based on.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * HistoricalOptionsProperty historicalOptionsProperty = HistoricalOptionsProperty.builder()
   * .budgetAdjustmentPeriod(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-historicaloptions.html)
   */
  public interface HistoricalOptionsProperty {
    /**
     * The number of budget periods included in the moving-average calculation that determines your
     * auto-adjusted budget amount.
     *
     * The maximum value depends on the `TimeUnit` granularity of the budget:
     *
     * * For the `DAILY` granularity, the maximum value is `60` .
     * * For the `MONTHLY` granularity, the maximum value is `12` .
     * * For the `QUARTERLY` granularity, the maximum value is `4` .
     * * For the `ANNUALLY` granularity, the maximum value is `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-historicaloptions.html#cfn-budgets-budget-historicaloptions-budgetadjustmentperiod)
     */
    public fun budgetAdjustmentPeriod(): Number

    /**
     * A builder for [HistoricalOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param budgetAdjustmentPeriod The number of budget periods included in the moving-average
       * calculation that determines your auto-adjusted budget amount. 
       * The maximum value depends on the `TimeUnit` granularity of the budget:
       *
       * * For the `DAILY` granularity, the maximum value is `60` .
       * * For the `MONTHLY` granularity, the maximum value is `12` .
       * * For the `QUARTERLY` granularity, the maximum value is `4` .
       * * For the `ANNUALLY` granularity, the maximum value is `1` .
       */
      public fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty.builder()

      /**
       * @param budgetAdjustmentPeriod The number of budget periods included in the moving-average
       * calculation that determines your auto-adjusted budget amount. 
       * The maximum value depends on the `TimeUnit` granularity of the budget:
       *
       * * For the `DAILY` granularity, the maximum value is `60` .
       * * For the `MONTHLY` granularity, the maximum value is `12` .
       * * For the `QUARTERLY` granularity, the maximum value is `4` .
       * * For the `ANNUALLY` granularity, the maximum value is `1` .
       */
      override fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
        cdkBuilder.budgetAdjustmentPeriod(budgetAdjustmentPeriod)
      }

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty,
    ) : CdkObject(cdkObject), HistoricalOptionsProperty {
      /**
       * The number of budget periods included in the moving-average calculation that determines
       * your auto-adjusted budget amount.
       *
       * The maximum value depends on the `TimeUnit` granularity of the budget:
       *
       * * For the `DAILY` granularity, the maximum value is `60` .
       * * For the `MONTHLY` granularity, the maximum value is `12` .
       * * For the `QUARTERLY` granularity, the maximum value is `4` .
       * * For the `ANNUALLY` granularity, the maximum value is `1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-historicaloptions.html#cfn-budgets-budget-historicaloptions-budgetadjustmentperiod)
       */
      override fun budgetAdjustmentPeriod(): Number = unwrap(this).getBudgetAdjustmentPeriod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HistoricalOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty):
          HistoricalOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HistoricalOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HistoricalOptionsProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.HistoricalOptionsProperty
    }
  }

  /**
   * A notification that's associated with a budget. A budget can have up to ten notifications.
   *
   * Each notification must have at least one subscriber. A notification can have one SNS subscriber
   * and up to 10 email subscribers, for a total of 11 subscribers.
   *
   * For example, if you have a budget for 200 dollars and you want to be notified when you go over
   * 160 dollars, create a notification with the following parameters:
   *
   * * A notificationType of `ACTUAL`
   * * A `thresholdType` of `PERCENTAGE`
   * * A `comparisonOperator` of `GREATER_THAN`
   * * A notification `threshold` of `80`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * NotificationProperty notificationProperty = NotificationProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .notificationType("notificationType")
   * .threshold(123)
   * // the properties below are optional
   * .thresholdType("thresholdType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html)
   */
  public interface NotificationProperty {
    /**
     * The comparison that's used for this notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
     */
    public fun comparisonOperator(): String

    /**
     * Specifies whether the notification is for how much you have spent ( `ACTUAL` ) or for how
     * much that you're forecasted to spend ( `FORECASTED` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
     */
    public fun notificationType(): String

    /**
     * The threshold that's associated with a notification.
     *
     * Thresholds are always a percentage, and many customers find value being alerted between 50% -
     * 200% of the budgeted amount. The maximum limit for your threshold is 1,000,000% above the
     * budgeted amount.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
     */
    public fun threshold(): Number

    /**
     * The type of threshold for a notification.
     *
     * For `ABSOLUTE_VALUE` thresholds, AWS notifies you when you go over or are forecasted to go
     * over your total cost threshold. For `PERCENTAGE` thresholds, AWS notifies you when you go over
     * or are forecasted to go over a certain percentage of your forecasted spend. For example, if you
     * have a budget for 200 dollars and you have a `PERCENTAGE` threshold of 80%, AWS notifies you
     * when you go over 160 dollars.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
     */
    public fun thresholdType(): String? = unwrap(this).getThresholdType()

    /**
     * A builder for [NotificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comparisonOperator The comparison that's used for this notification. 
       */
      public fun comparisonOperator(comparisonOperator: String)

      /**
       * @param notificationType Specifies whether the notification is for how much you have spent (
       * `ACTUAL` ) or for how much that you're forecasted to spend ( `FORECASTED` ). 
       */
      public fun notificationType(notificationType: String)

      /**
       * @param threshold The threshold that's associated with a notification. 
       * Thresholds are always a percentage, and many customers find value being alerted between
       * 50% - 200% of the budgeted amount. The maximum limit for your threshold is 1,000,000% above
       * the budgeted amount.
       */
      public fun threshold(threshold: Number)

      /**
       * @param thresholdType The type of threshold for a notification.
       * For `ABSOLUTE_VALUE` thresholds, AWS notifies you when you go over or are forecasted to go
       * over your total cost threshold. For `PERCENTAGE` thresholds, AWS notifies you when you go over
       * or are forecasted to go over a certain percentage of your forecasted spend. For example, if
       * you have a budget for 200 dollars and you have a `PERCENTAGE` threshold of 80%, AWS notifies
       * you when you go over 160 dollars.
       */
      public fun thresholdType(thresholdType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty.builder()

      /**
       * @param comparisonOperator The comparison that's used for this notification. 
       */
      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      /**
       * @param notificationType Specifies whether the notification is for how much you have spent (
       * `ACTUAL` ) or for how much that you're forecasted to spend ( `FORECASTED` ). 
       */
      override fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
      }

      /**
       * @param threshold The threshold that's associated with a notification. 
       * Thresholds are always a percentage, and many customers find value being alerted between
       * 50% - 200% of the budgeted amount. The maximum limit for your threshold is 1,000,000% above
       * the budgeted amount.
       */
      override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      /**
       * @param thresholdType The type of threshold for a notification.
       * For `ABSOLUTE_VALUE` thresholds, AWS notifies you when you go over or are forecasted to go
       * over your total cost threshold. For `PERCENTAGE` thresholds, AWS notifies you when you go over
       * or are forecasted to go over a certain percentage of your forecasted spend. For example, if
       * you have a budget for 200 dollars and you have a `PERCENTAGE` threshold of 80%, AWS notifies
       * you when you go over 160 dollars.
       */
      override fun thresholdType(thresholdType: String) {
        cdkBuilder.thresholdType(thresholdType)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty,
    ) : CdkObject(cdkObject), NotificationProperty {
      /**
       * The comparison that's used for this notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator)
       */
      override fun comparisonOperator(): String = unwrap(this).getComparisonOperator()

      /**
       * Specifies whether the notification is for how much you have spent ( `ACTUAL` ) or for how
       * much that you're forecasted to spend ( `FORECASTED` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype)
       */
      override fun notificationType(): String = unwrap(this).getNotificationType()

      /**
       * The threshold that's associated with a notification.
       *
       * Thresholds are always a percentage, and many customers find value being alerted between
       * 50% - 200% of the budgeted amount. The maximum limit for your threshold is 1,000,000% above
       * the budgeted amount.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold)
       */
      override fun threshold(): Number = unwrap(this).getThreshold()

      /**
       * The type of threshold for a notification.
       *
       * For `ABSOLUTE_VALUE` thresholds, AWS notifies you when you go over or are forecasted to go
       * over your total cost threshold. For `PERCENTAGE` thresholds, AWS notifies you when you go over
       * or are forecasted to go over a certain percentage of your forecasted spend. For example, if
       * you have a budget for 200 dollars and you have a `PERCENTAGE` threshold of 80%, AWS notifies
       * you when you go over 160 dollars.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype)
       */
      override fun thresholdType(): String? = unwrap(this).getThresholdType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty):
          NotificationProperty = CdkObjectWrappers.wrap(cdkObject) as? NotificationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationProperty
    }
  }

  /**
   * A notification with subscribers.
   *
   * A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11
   * subscribers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * NotificationWithSubscribersProperty notificationWithSubscribersProperty =
   * NotificationWithSubscribersProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html)
   */
  public interface NotificationWithSubscribersProperty {
    /**
     * The notification that's associated with a budget.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
     */
    public fun notification(): Any

    /**
     * A list of subscribers who are subscribed to this notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
     */
    public fun subscribers(): Any

    /**
     * A builder for [NotificationWithSubscribersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notification The notification that's associated with a budget. 
       */
      public fun notification(notification: IResolvable)

      /**
       * @param notification The notification that's associated with a budget. 
       */
      public fun notification(notification: NotificationProperty)

      /**
       * @param notification The notification that's associated with a budget. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be7d8f7c6331b0786274de1d180bb75d8b3e99b34d49f0a476f95488bf96d55b")
      public fun notification(notification: NotificationProperty.Builder.() -> Unit)

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      public fun subscribers(subscribers: IResolvable)

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      public fun subscribers(subscribers: List<Any>)

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      public fun subscribers(vararg subscribers: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.Builder
          =
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty.builder()

      /**
       * @param notification The notification that's associated with a budget. 
       */
      override fun notification(notification: IResolvable) {
        cdkBuilder.notification(notification.let(IResolvable::unwrap))
      }

      /**
       * @param notification The notification that's associated with a budget. 
       */
      override fun notification(notification: NotificationProperty) {
        cdkBuilder.notification(notification.let(NotificationProperty::unwrap))
      }

      /**
       * @param notification The notification that's associated with a budget. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be7d8f7c6331b0786274de1d180bb75d8b3e99b34d49f0a476f95488bf96d55b")
      override fun notification(notification: NotificationProperty.Builder.() -> Unit): Unit =
          notification(NotificationProperty(notification))

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      override fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers.let(IResolvable::unwrap))
      }

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      override fun subscribers(subscribers: List<Any>) {
        cdkBuilder.subscribers(subscribers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param subscribers A list of subscribers who are subscribed to this notification. 
       */
      override fun subscribers(vararg subscribers: Any): Unit = subscribers(subscribers.toList())

      public fun build():
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty,
    ) : CdkObject(cdkObject), NotificationWithSubscribersProperty {
      /**
       * The notification that's associated with a budget.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-notification)
       */
      override fun notification(): Any = unwrap(this).getNotification()

      /**
       * A list of subscribers who are subscribed to this notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers)
       */
      override fun subscribers(): Any = unwrap(this).getSubscribers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationWithSubscribersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty):
          NotificationWithSubscribersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NotificationWithSubscribersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationWithSubscribersProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.NotificationWithSubscribersProperty
    }
  }

  /**
   * The amount of cost or usage that's measured for a budget.
   *
   * *Cost example:* A `Spend` for `3 USD` of costs has the following parameters:
   *
   * * An `Amount` of `3`
   * * A `Unit` of `USD`
   *
   * *Usage example:* A `Spend` for `3 GB` of S3 usage has the following parameters:
   *
   * * An `Amount` of `3`
   * * A `Unit` of `GB`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * SpendProperty spendProperty = SpendProperty.builder()
   * .amount(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html)
   */
  public interface SpendProperty {
    /**
     * The cost or usage amount that's associated with a budget forecast, actual spend, or budget
     * threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
     */
    public fun amount(): Number

    /**
     * The unit of measurement that's used for the budget forecast, actual spend, or budget
     * threshold.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
     */
    public fun unit(): String

    /**
     * A builder for [SpendProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amount The cost or usage amount that's associated with a budget forecast, actual
       * spend, or budget threshold. 
       */
      public fun amount(amount: Number)

      /**
       * @param unit The unit of measurement that's used for the budget forecast, actual spend, or
       * budget threshold. 
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty.builder()

      /**
       * @param amount The cost or usage amount that's associated with a budget forecast, actual
       * spend, or budget threshold. 
       */
      override fun amount(amount: Number) {
        cdkBuilder.amount(amount)
      }

      /**
       * @param unit The unit of measurement that's used for the budget forecast, actual spend, or
       * budget threshold. 
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty,
    ) : CdkObject(cdkObject), SpendProperty {
      /**
       * The cost or usage amount that's associated with a budget forecast, actual spend, or budget
       * threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount)
       */
      override fun amount(): Number = unwrap(this).getAmount()

      /**
       * The unit of measurement that's used for the budget forecast, actual spend, or budget
       * threshold.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpendProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty):
          SpendProperty = CdkObjectWrappers.wrap(cdkObject) as? SpendProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpendProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.budgets.CfnBudget.SpendProperty
    }
  }

  /**
   * The `Subscriber` property type specifies who to notify for a Billing and Cost Management budget
   * notification.
   *
   * The subscriber consists of a subscription type, and either an Amazon SNS topic or an email
   * address.
   *
   * For example, an email subscriber would have the following parameters:
   *
   * * A `subscriptionType` of `EMAIL`
   * * An `address` of `example&#64;example.com`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
   * .address("address")
   * .subscriptionType("subscriptionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html)
   */
  public interface SubscriberProperty {
    /**
     * The address that AWS sends budget notifications to, either an SNS topic or an email.
     *
     * When you create a subscriber, the value of `Address` can't contain line breaks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
     */
    public fun address(): String

    /**
     * The type of notification that AWS sends to a subscriber.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
     */
    public fun subscriptionType(): String

    /**
     * A builder for [SubscriberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The address that AWS sends budget notifications to, either an SNS topic or
       * an email. 
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       */
      public fun address(address: String)

      /**
       * @param subscriptionType The type of notification that AWS sends to a subscriber. 
       */
      public fun subscriptionType(subscriptionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty.builder()

      /**
       * @param address The address that AWS sends budget notifications to, either an SNS topic or
       * an email. 
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param subscriptionType The type of notification that AWS sends to a subscriber. 
       */
      override fun subscriptionType(subscriptionType: String) {
        cdkBuilder.subscriptionType(subscriptionType)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty,
    ) : CdkObject(cdkObject), SubscriberProperty {
      /**
       * The address that AWS sends budget notifications to, either an SNS topic or an email.
       *
       * When you create a subscriber, the value of `Address` can't contain line breaks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-address)
       */
      override fun address(): String = unwrap(this).getAddress()

      /**
       * The type of notification that AWS sends to a subscriber.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html#cfn-budgets-budget-subscriber-subscriptiontype)
       */
      override fun subscriptionType(): String = unwrap(this).getSubscriptionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty):
          SubscriberProperty = CdkObjectWrappers.wrap(cdkObject) as? SubscriberProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriberProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.SubscriberProperty
    }
  }

  /**
   * The period of time that is covered by a budget.
   *
   * The period has a start date and an end date. The start date must come before the end date.
   * There are no restrictions on the end date.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.budgets.*;
   * TimePeriodProperty timePeriodProperty = TimePeriodProperty.builder()
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html)
   */
  public interface TimePeriodProperty {
    /**
     * The end date for a budget.
     *
     * If you didn't specify an end date, AWS set your end date to `06/15/87 00:00 UTC` . The
     * defaults are the same for the AWS Billing and Cost Management console and the API.
     *
     * After the end date, AWS deletes the budget and all the associated notifications and
     * subscribers. You can change your end date with the `UpdateBudget` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * The start date for a budget.
     *
     * If you created your budget and didn't specify a start date, the start date defaults to the
     * start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For example, if you create
     * your budget on January 24, 2019, choose `MONTHLY` , and don't set a start date, the start date
     * defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS Billing and Cost
     * Management console and the API.
     *
     * You can change your start date with the `UpdateBudget` operation.
     *
     * Valid values depend on the value of `BudgetType` :
     *
     * * If `BudgetType` is `COST` or `USAGE` : Valid values are `MONTHLY` , `QUARTERLY` , and
     * `ANNUALLY` .
     * * If `BudgetType` is `RI_UTILIZATION` or `RI_COVERAGE` : Valid values are `DAILY` , `MONTHLY`
     * , `QUARTERLY` , and `ANNUALLY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * A builder for [TimePeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param end The end date for a budget.
       * If you didn't specify an end date, AWS set your end date to `06/15/87 00:00 UTC` . The
       * defaults are the same for the AWS Billing and Cost Management console and the API.
       *
       * After the end date, AWS deletes the budget and all the associated notifications and
       * subscribers. You can change your end date with the `UpdateBudget` operation.
       */
      public fun end(end: String)

      /**
       * @param start The start date for a budget.
       * If you created your budget and didn't specify a start date, the start date defaults to the
       * start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For example, if you create
       * your budget on January 24, 2019, choose `MONTHLY` , and don't set a start date, the start date
       * defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS Billing and Cost
       * Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * Valid values depend on the value of `BudgetType` :
       *
       * * If `BudgetType` is `COST` or `USAGE` : Valid values are `MONTHLY` , `QUARTERLY` , and
       * `ANNUALLY` .
       * * If `BudgetType` is `RI_UTILIZATION` or `RI_COVERAGE` : Valid values are `DAILY` ,
       * `MONTHLY` , `QUARTERLY` , and `ANNUALLY` .
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.Builder =
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty.builder()

      /**
       * @param end The end date for a budget.
       * If you didn't specify an end date, AWS set your end date to `06/15/87 00:00 UTC` . The
       * defaults are the same for the AWS Billing and Cost Management console and the API.
       *
       * After the end date, AWS deletes the budget and all the associated notifications and
       * subscribers. You can change your end date with the `UpdateBudget` operation.
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start The start date for a budget.
       * If you created your budget and didn't specify a start date, the start date defaults to the
       * start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For example, if you create
       * your budget on January 24, 2019, choose `MONTHLY` , and don't set a start date, the start date
       * defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS Billing and Cost
       * Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * Valid values depend on the value of `BudgetType` :
       *
       * * If `BudgetType` is `COST` or `USAGE` : Valid values are `MONTHLY` , `QUARTERLY` , and
       * `ANNUALLY` .
       * * If `BudgetType` is `RI_UTILIZATION` or `RI_COVERAGE` : Valid values are `DAILY` ,
       * `MONTHLY` , `QUARTERLY` , and `ANNUALLY` .
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty,
    ) : CdkObject(cdkObject), TimePeriodProperty {
      /**
       * The end date for a budget.
       *
       * If you didn't specify an end date, AWS set your end date to `06/15/87 00:00 UTC` . The
       * defaults are the same for the AWS Billing and Cost Management console and the API.
       *
       * After the end date, AWS deletes the budget and all the associated notifications and
       * subscribers. You can change your end date with the `UpdateBudget` operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * The start date for a budget.
       *
       * If you created your budget and didn't specify a start date, the start date defaults to the
       * start of the chosen time period (MONTHLY, QUARTERLY, or ANNUALLY). For example, if you create
       * your budget on January 24, 2019, choose `MONTHLY` , and don't set a start date, the start date
       * defaults to `01/01/19 00:00 UTC` . The defaults are the same for the AWS Billing and Cost
       * Management console and the API.
       *
       * You can change your start date with the `UpdateBudget` operation.
       *
       * Valid values depend on the value of `BudgetType` :
       *
       * * If `BudgetType` is `COST` or `USAGE` : Valid values are `MONTHLY` , `QUARTERLY` , and
       * `ANNUALLY` .
       * * If `BudgetType` is `RI_UTILIZATION` or `RI_COVERAGE` : Valid values are `DAILY` ,
       * `MONTHLY` , `QUARTERLY` , and `ANNUALLY` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start)
       */
      override fun start(): String? = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimePeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty):
          TimePeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? TimePeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimePeriodProperty):
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.budgets.CfnBudget.TimePeriodProperty
    }
  }
}
