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

import software.amazon.awscdk.services.budgets.CfnBudget
import software.amazon.awscdk.services.budgets.CfnBudgetProps
import software.amazon.awscdk.services.budgets.CfnBudgetsAction
import software.amazon.awscdk.services.budgets.CfnBudgetsActionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object budgets {
    public inline fun cfnBudget(
        scope: Construct,
        id: String,
        block: CfnBudgetDsl.() -> Unit = {},
    ): CfnBudget {
        val builder = CfnBudgetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetAutoAdjustDataProperty(
        block: CfnBudgetAutoAdjustDataPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.AutoAdjustDataProperty {
        val builder = CfnBudgetAutoAdjustDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetBudgetDataProperty(
        block: CfnBudgetBudgetDataPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.BudgetDataProperty {
        val builder = CfnBudgetBudgetDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetCostTypesProperty(
        block: CfnBudgetCostTypesPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.CostTypesProperty {
        val builder = CfnBudgetCostTypesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetHistoricalOptionsProperty(
        block: CfnBudgetHistoricalOptionsPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.HistoricalOptionsProperty {
        val builder = CfnBudgetHistoricalOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetNotificationProperty(
        block: CfnBudgetNotificationPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.NotificationProperty {
        val builder = CfnBudgetNotificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetNotificationWithSubscribersProperty(
        block: CfnBudgetNotificationWithSubscribersPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.NotificationWithSubscribersProperty {
        val builder = CfnBudgetNotificationWithSubscribersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetProps(block: CfnBudgetPropsDsl.() -> Unit = {}): CfnBudgetProps {
        val builder = CfnBudgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetSpendProperty(block: CfnBudgetSpendPropertyDsl.() -> Unit = {}): CfnBudget.SpendProperty {
        val builder = CfnBudgetSpendPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetSubscriberProperty(
        block: CfnBudgetSubscriberPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.SubscriberProperty {
        val builder = CfnBudgetSubscriberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetTimePeriodProperty(
        block: CfnBudgetTimePeriodPropertyDsl.() -> Unit =
            {},
    ): CfnBudget.TimePeriodProperty {
        val builder = CfnBudgetTimePeriodPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsAction(
        scope: Construct,
        id: String,
        block: CfnBudgetsActionDsl.() -> Unit = {},
    ): CfnBudgetsAction {
        val builder = CfnBudgetsActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionActionThresholdProperty(
        block: CfnBudgetsActionActionThresholdPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.ActionThresholdProperty {
        val builder = CfnBudgetsActionActionThresholdPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionDefinitionProperty(
        block: CfnBudgetsActionDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.DefinitionProperty {
        val builder = CfnBudgetsActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionIamActionDefinitionProperty(
        block: CfnBudgetsActionIamActionDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.IamActionDefinitionProperty {
        val builder = CfnBudgetsActionIamActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionProps(block: CfnBudgetsActionPropsDsl.() -> Unit = {}): CfnBudgetsActionProps {
        val builder = CfnBudgetsActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionScpActionDefinitionProperty(
        block: CfnBudgetsActionScpActionDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.ScpActionDefinitionProperty {
        val builder = CfnBudgetsActionScpActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionSsmActionDefinitionProperty(
        block: CfnBudgetsActionSsmActionDefinitionPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.SsmActionDefinitionProperty {
        val builder = CfnBudgetsActionSsmActionDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnBudgetsActionSubscriberProperty(
        block: CfnBudgetsActionSubscriberPropertyDsl.() -> Unit =
            {},
    ): CfnBudgetsAction.SubscriberProperty {
        val builder = CfnBudgetsActionSubscriberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
