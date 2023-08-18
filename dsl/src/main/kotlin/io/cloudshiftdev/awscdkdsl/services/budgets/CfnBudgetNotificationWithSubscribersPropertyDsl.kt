@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * A notification with subscribers.
 *
 * A notification can have one SNS subscriber and up to 10 email subscribers, for a total of 11
 * subscribers.
 *
 * Example:
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
@CdkDslMarker
public class CfnBudgetNotificationWithSubscribersPropertyDsl {
    private val cdkBuilder: CfnBudget.NotificationWithSubscribersProperty.Builder =
        CfnBudget.NotificationWithSubscribersProperty.builder()

    private val _subscribers: MutableList<Any> = mutableListOf()

    /** @param notification The notification that's associated with a budget. */
    public fun notification(notification: IResolvable) {
        cdkBuilder.notification(notification)
    }

    /** @param notification The notification that's associated with a budget. */
    public fun notification(notification: CfnBudget.NotificationProperty) {
        cdkBuilder.notification(notification)
    }

    /** @param subscribers A list of subscribers who are subscribed to this notification. */
    public fun subscribers(vararg subscribers: Any) {
        _subscribers.addAll(listOf(*subscribers))
    }

    /** @param subscribers A list of subscribers who are subscribed to this notification. */
    public fun subscribers(subscribers: Collection<Any>) {
        _subscribers.addAll(subscribers)
    }

    /** @param subscribers A list of subscribers who are subscribed to this notification. */
    public fun subscribers(subscribers: IResolvable) {
        cdkBuilder.subscribers(subscribers)
    }

    public fun build(): CfnBudget.NotificationWithSubscribersProperty {
        if (_subscribers.isNotEmpty()) cdkBuilder.subscribers(_subscribers)
        return cdkBuilder.build()
    }
}
