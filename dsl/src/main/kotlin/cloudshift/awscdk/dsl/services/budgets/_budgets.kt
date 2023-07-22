@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.budgets

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
import software.constructs.Construct

public object budgets {
  /**
   * The `AWS::Budgets::Budget` resource allows customers to take pre-defined actions that will
   * trigger once a budget threshold has been exceeded.
   *
   * creates, replaces, or deletes budgets for Billing and Cost Management. For more information,
   * see [Managing Your Costs with
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
  public inline fun cfnBudget(
    scope: Construct,
    id: String,
    block: CfnBudgetDsl.() -> Unit = {},
  ): CfnBudget {
    val builder = CfnBudgetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
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
  public inline
      fun cfnBudgetAutoAdjustDataProperty(block: CfnBudgetAutoAdjustDataPropertyDsl.() -> Unit =
      {}): CfnBudget.AutoAdjustDataProperty {
    val builder = CfnBudgetAutoAdjustDataPropertyDsl()
    builder.apply(block)
    return builder.build()
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
  public inline fun cfnBudgetBudgetDataProperty(block: CfnBudgetBudgetDataPropertyDsl.() -> Unit =
      {}): CfnBudget.BudgetDataProperty {
    val builder = CfnBudgetBudgetDataPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.budgets.*;
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
  public inline fun cfnBudgetCostTypesProperty(block: CfnBudgetCostTypesPropertyDsl.() -> Unit =
      {}): CfnBudget.CostTypesProperty {
    val builder = CfnBudgetCostTypesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * HistoricalOptionsProperty historicalOptionsProperty = HistoricalOptionsProperty.builder()
   * .budgetAdjustmentPeriod(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-historicaloptions.html)
   */
  public inline
      fun cfnBudgetHistoricalOptionsProperty(block: CfnBudgetHistoricalOptionsPropertyDsl.() -> Unit
      = {}): CfnBudget.HistoricalOptionsProperty {
    val builder = CfnBudgetHistoricalOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.budgets.*;
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
  public inline fun cfnBudgetNotificationProperty(block: CfnBudgetNotificationPropertyDsl.() -> Unit
      = {}): CfnBudget.NotificationProperty {
    val builder = CfnBudgetNotificationPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.budgets.*;
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
  public inline
      fun cfnBudgetNotificationWithSubscribersProperty(block: CfnBudgetNotificationWithSubscribersPropertyDsl.() -> Unit
      = {}): CfnBudget.NotificationWithSubscribersProperty {
    val builder = CfnBudgetNotificationWithSubscribersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

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
  public inline fun cfnBudgetProps(block: CfnBudgetPropsDsl.() -> Unit = {}): CfnBudgetProps {
    val builder = CfnBudgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The amount of cost or usage that's measured for a budget.
   *
   * For example, a `Spend` for `3 GB` of S3 usage has the following parameters:
   *
   * * An `Amount` of `3`
   * * A `unit` of `GB`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * SpendProperty spendProperty = SpendProperty.builder()
   * .amount(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html)
   */
  public inline fun cfnBudgetSpendProperty(block: CfnBudgetSpendPropertyDsl.() -> Unit = {}):
      CfnBudget.SpendProperty {
    val builder = CfnBudgetSpendPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.budgets.*;
   * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
   * .address("address")
   * .subscriptionType("subscriptionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-subscriber.html)
   */
  public inline fun cfnBudgetSubscriberProperty(block: CfnBudgetSubscriberPropertyDsl.() -> Unit =
      {}): CfnBudget.SubscriberProperty {
    val builder = CfnBudgetSubscriberPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.budgets.*;
   * TimePeriodProperty timePeriodProperty = TimePeriodProperty.builder()
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html)
   */
  public inline fun cfnBudgetTimePeriodProperty(block: CfnBudgetTimePeriodPropertyDsl.() -> Unit =
      {}): CfnBudget.TimePeriodProperty {
    val builder = CfnBudgetTimePeriodPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::Budgets::BudgetsAction` resource enables you to take predefined actions that are
   * initiated when a budget threshold has been exceeded.
   *
   * For more information, see [Managing Your Costs with
   * Budgets](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * CfnBudgetsAction cfnBudgetsAction = CfnBudgetsAction.Builder.create(this, "MyCfnBudgetsAction")
   * .actionThreshold(ActionThresholdProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .actionType("actionType")
   * .budgetName("budgetName")
   * .definition(DefinitionProperty.builder()
   * .iamActionDefinition(IamActionDefinitionProperty.builder()
   * .policyArn("policyArn")
   * // the properties below are optional
   * .groups(List.of("groups"))
   * .roles(List.of("roles"))
   * .users(List.of("users"))
   * .build())
   * .scpActionDefinition(ScpActionDefinitionProperty.builder()
   * .policyId("policyId")
   * .targetIds(List.of("targetIds"))
   * .build())
   * .ssmActionDefinition(SsmActionDefinitionProperty.builder()
   * .instanceIds(List.of("instanceIds"))
   * .region("region")
   * .subtype("subtype")
   * .build())
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .notificationType("notificationType")
   * .subscribers(List.of(SubscriberProperty.builder()
   * .address("address")
   * .type("type")
   * .build()))
   * // the properties below are optional
   * .approvalModel("approvalModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html)
   */
  public inline fun cfnBudgetsAction(
    scope: Construct,
    id: String,
    block: CfnBudgetsActionDsl.() -> Unit = {},
  ): CfnBudgetsAction {
    val builder = CfnBudgetsActionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The trigger threshold of the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * ActionThresholdProperty actionThresholdProperty = ActionThresholdProperty.builder()
   * .type("type")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-actionthreshold.html)
   */
  public inline
      fun cfnBudgetsActionActionThresholdProperty(block: CfnBudgetsActionActionThresholdPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.ActionThresholdProperty {
    val builder = CfnBudgetsActionActionThresholdPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The definition is where you specify all of the type-specific parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * DefinitionProperty definitionProperty = DefinitionProperty.builder()
   * .iamActionDefinition(IamActionDefinitionProperty.builder()
   * .policyArn("policyArn")
   * // the properties below are optional
   * .groups(List.of("groups"))
   * .roles(List.of("roles"))
   * .users(List.of("users"))
   * .build())
   * .scpActionDefinition(ScpActionDefinitionProperty.builder()
   * .policyId("policyId")
   * .targetIds(List.of("targetIds"))
   * .build())
   * .ssmActionDefinition(SsmActionDefinitionProperty.builder()
   * .instanceIds(List.of("instanceIds"))
   * .region("region")
   * .subtype("subtype")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-definition.html)
   */
  public inline
      fun cfnBudgetsActionDefinitionProperty(block: CfnBudgetsActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.DefinitionProperty {
    val builder = CfnBudgetsActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS Identity and Access Management ( IAM ) action definition details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * IamActionDefinitionProperty iamActionDefinitionProperty = IamActionDefinitionProperty.builder()
   * .policyArn("policyArn")
   * // the properties below are optional
   * .groups(List.of("groups"))
   * .roles(List.of("roles"))
   * .users(List.of("users"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-iamactiondefinition.html)
   */
  public inline
      fun cfnBudgetsActionIamActionDefinitionProperty(block: CfnBudgetsActionIamActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.IamActionDefinitionProperty {
    val builder = CfnBudgetsActionIamActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnBudgetsAction`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * CfnBudgetsActionProps cfnBudgetsActionProps = CfnBudgetsActionProps.builder()
   * .actionThreshold(ActionThresholdProperty.builder()
   * .type("type")
   * .value(123)
   * .build())
   * .actionType("actionType")
   * .budgetName("budgetName")
   * .definition(DefinitionProperty.builder()
   * .iamActionDefinition(IamActionDefinitionProperty.builder()
   * .policyArn("policyArn")
   * // the properties below are optional
   * .groups(List.of("groups"))
   * .roles(List.of("roles"))
   * .users(List.of("users"))
   * .build())
   * .scpActionDefinition(ScpActionDefinitionProperty.builder()
   * .policyId("policyId")
   * .targetIds(List.of("targetIds"))
   * .build())
   * .ssmActionDefinition(SsmActionDefinitionProperty.builder()
   * .instanceIds(List.of("instanceIds"))
   * .region("region")
   * .subtype("subtype")
   * .build())
   * .build())
   * .executionRoleArn("executionRoleArn")
   * .notificationType("notificationType")
   * .subscribers(List.of(SubscriberProperty.builder()
   * .address("address")
   * .type("type")
   * .build()))
   * // the properties below are optional
   * .approvalModel("approvalModel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budgetsaction.html)
   */
  public inline fun cfnBudgetsActionProps(block: CfnBudgetsActionPropsDsl.() -> Unit = {}):
      CfnBudgetsActionProps {
    val builder = CfnBudgetsActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The service control policies (SCP) action definition details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * ScpActionDefinitionProperty scpActionDefinitionProperty = ScpActionDefinitionProperty.builder()
   * .policyId("policyId")
   * .targetIds(List.of("targetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-scpactiondefinition.html)
   */
  public inline
      fun cfnBudgetsActionScpActionDefinitionProperty(block: CfnBudgetsActionScpActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.ScpActionDefinitionProperty {
    val builder = CfnBudgetsActionScpActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The Amazon EC2 Systems Manager ( SSM ) action definition details.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * SsmActionDefinitionProperty ssmActionDefinitionProperty = SsmActionDefinitionProperty.builder()
   * .instanceIds(List.of("instanceIds"))
   * .region("region")
   * .subtype("subtype")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-ssmactiondefinition.html)
   */
  public inline
      fun cfnBudgetsActionSsmActionDefinitionProperty(block: CfnBudgetsActionSsmActionDefinitionPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.SsmActionDefinitionProperty {
    val builder = CfnBudgetsActionSsmActionDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The subscriber to a budget notification.
   *
   * The subscriber consists of a subscription type and either an Amazon SNS topic or an email
   * address.
   *
   * For example, an email subscriber has the following parameters:
   *
   * * A `subscriptionType` of `EMAIL`
   * * An `address` of `example&#64;example.com`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.budgets.*;
   * SubscriberProperty subscriberProperty = SubscriberProperty.builder()
   * .address("address")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budgetsaction-subscriber.html)
   */
  public inline
      fun cfnBudgetsActionSubscriberProperty(block: CfnBudgetsActionSubscriberPropertyDsl.() -> Unit
      = {}): CfnBudgetsAction.SubscriberProperty {
    val builder = CfnBudgetsActionSubscriberPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
