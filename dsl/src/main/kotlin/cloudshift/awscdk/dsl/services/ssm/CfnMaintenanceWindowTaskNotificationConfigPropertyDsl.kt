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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

/**
 * The `NotificationConfig` property type specifies configurations for sending notifications for a
 * maintenance window task in AWS Systems Manager .
 *
 * `NotificationConfig` is a property of the
 * [MaintenanceWindowRunCommandParameters](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-maintenancewindowruncommandparameters.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * NotificationConfigProperty notificationConfigProperty = NotificationConfigProperty.builder()
 * .notificationArn("notificationArn")
 * // the properties below are optional
 * .notificationEvents(List.of("notificationEvents"))
 * .notificationType("notificationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-maintenancewindowtask-notificationconfig.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTaskNotificationConfigPropertyDsl {
    private val cdkBuilder: CfnMaintenanceWindowTask.NotificationConfigProperty.Builder =
        CfnMaintenanceWindowTask.NotificationConfigProperty.builder()

    private val _notificationEvents: MutableList<String> = mutableListOf()

    /**
     * @param notificationArn An Amazon Resource Name (ARN) for an Amazon Simple Notification
     *   Service (Amazon SNS) topic. Run Command pushes notifications about command status changes
     *   to this topic.
     */
    public fun notificationArn(notificationArn: String) {
        cdkBuilder.notificationArn(notificationArn)
    }

    /**
     * @param notificationEvents The different events that you can receive notifications for. These
     *   events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
     *   `Cancelled` , `Failed` . To learn more about these events, see
     *   [Configuring Amazon SNS Notifications for AWS Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun notificationEvents(vararg notificationEvents: String) {
        _notificationEvents.addAll(listOf(*notificationEvents))
    }

    /**
     * @param notificationEvents The different events that you can receive notifications for. These
     *   events include the following: `All` (events), `InProgress` , `Success` , `TimedOut` ,
     *   `Cancelled` , `Failed` . To learn more about these events, see
     *   [Configuring Amazon SNS Notifications for AWS Systems Manager](https://docs.aws.amazon.com/systems-manager/latest/userguide/monitoring-sns-notifications.html)
     *   in the *AWS Systems Manager User Guide* .
     */
    public fun notificationEvents(notificationEvents: Collection<String>) {
        _notificationEvents.addAll(notificationEvents)
    }

    /**
     * @param notificationType The notification type.
     * * `Command` : Receive notification when the status of a command changes.
     * * `Invocation` : For commands sent to multiple instances, receive notification on a
     *   per-instance basis when the status of a command changes.
     */
    public fun notificationType(notificationType: String) {
        cdkBuilder.notificationType(notificationType)
    }

    public fun build(): CfnMaintenanceWindowTask.NotificationConfigProperty {
        if (_notificationEvents.isNotEmpty()) cdkBuilder.notificationEvents(_notificationEvents)
        return cdkBuilder.build()
    }
}
