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

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * A notification that's associated with a budget. A budget can have up to ten notifications.
 *
 * Each notification must have at least one subscriber. A notification can have one SNS subscriber
 * and up to 10 email subscribers, for a total of 11 subscribers.
 *
 * For example, if you have a budget for 200 dollars and you want to be notified when you go over
 * 160 dollars, create a notification with the following parameters:
 * * A notificationType of `ACTUAL`
 * * A `thresholdType` of `PERCENTAGE`
 * * A `comparisonOperator` of `GREATER_THAN`
 * * A notification `threshold` of `80`
 *
 * Example:
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
@CdkDslMarker
public class CfnBudgetNotificationPropertyDsl {
    private val cdkBuilder: CfnBudget.NotificationProperty.Builder =
        CfnBudget.NotificationProperty.builder()

    /** @param comparisonOperator The comparison that's used for this notification. */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /**
     * @param notificationType Specifies whether the notification is for how much you have spent (
     *   `ACTUAL` ) or for how much that you're forecasted to spend ( `FORECASTED` ).
     */
    public fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
    }

    /**
     * @param threshold The threshold that's associated with a notification. Thresholds are always a
     *   percentage, and many customers find value being alerted between 50% - 200% of the budgeted
     *   amount. The maximum limit for your threshold is 1,000,000% above the budgeted amount.
     */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    /**
     * @param thresholdType The type of threshold for a notification. For `ABSOLUTE_VALUE`
     *   thresholds, AWS notifies you when you go over or are forecasted to go over your total cost
     *   threshold. For `PERCENTAGE` thresholds, AWS notifies you when you go over or are forecasted
     *   to go over a certain percentage of your forecasted spend. For example, if you have a budget
     *   for 200 dollars and you have a `PERCENTAGE` threshold of 80%, AWS notifies you when you go
     *   over 160 dollars.
     */
    public fun thresholdType(thresholdType: String) {
        cdkBuilder.thresholdType(thresholdType)
    }

    public fun build(): CfnBudget.NotificationProperty = cdkBuilder.build()
}
