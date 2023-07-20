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

package cloudshift.awscdk.dsl.services.ce

import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import software.amazon.awscdk.services.ce.CfnAnomalyMonitorProps
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
import software.amazon.awscdk.services.ce.CfnCostCategory
import software.amazon.awscdk.services.ce.CfnCostCategoryProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object ce {
    public inline fun cfnAnomalyMonitor(
        scope: Construct,
        id: String,
        block: CfnAnomalyMonitorDsl.() -> Unit = {},
    ): CfnAnomalyMonitor {
        val builder = CfnAnomalyMonitorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalyMonitorProps(block: CfnAnomalyMonitorPropsDsl.() -> Unit = {}): CfnAnomalyMonitorProps {
        val builder = CfnAnomalyMonitorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalyMonitorResourceTagProperty(
        block: CfnAnomalyMonitorResourceTagPropertyDsl.() -> Unit =
            {},
    ): CfnAnomalyMonitor.ResourceTagProperty {
        val builder = CfnAnomalyMonitorResourceTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalySubscription(
        scope: Construct,
        id: String,
        block: CfnAnomalySubscriptionDsl.() -> Unit = {},
    ): CfnAnomalySubscription {
        val builder = CfnAnomalySubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalySubscriptionProps(
        block: CfnAnomalySubscriptionPropsDsl.() -> Unit =
            {},
    ): CfnAnomalySubscriptionProps {
        val builder = CfnAnomalySubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalySubscriptionResourceTagProperty(
        block: CfnAnomalySubscriptionResourceTagPropertyDsl.() -> Unit =
            {},
    ): CfnAnomalySubscription.ResourceTagProperty {
        val builder = CfnAnomalySubscriptionResourceTagPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAnomalySubscriptionSubscriberProperty(
        block: CfnAnomalySubscriptionSubscriberPropertyDsl.() -> Unit =
            {},
    ): CfnAnomalySubscription.SubscriberProperty {
        val builder = CfnAnomalySubscriptionSubscriberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCostCategory(
        scope: Construct,
        id: String,
        block: CfnCostCategoryDsl.() -> Unit = {},
    ): CfnCostCategory {
        val builder = CfnCostCategoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCostCategoryProps(block: CfnCostCategoryPropsDsl.() -> Unit = {}): CfnCostCategoryProps {
        val builder = CfnCostCategoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
