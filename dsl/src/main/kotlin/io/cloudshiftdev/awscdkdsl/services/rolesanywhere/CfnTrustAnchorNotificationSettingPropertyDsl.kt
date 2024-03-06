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

package io.cloudshiftdev.awscdkdsl.services.rolesanywhere

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor

/**
 * Customizable notification settings that will be applied to notification events.
 *
 * IAM Roles Anywhere consumes these settings while notifying across multiple channels - CloudWatch
 * metrics, EventBridge , and AWS Health Dashboard .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rolesanywhere.*;
 * NotificationSettingProperty notificationSettingProperty = NotificationSettingProperty.builder()
 * .enabled(false)
 * .event("event")
 * // the properties below are optional
 * .channel("channel")
 * .threshold(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rolesanywhere-trustanchor-notificationsetting.html)
 */
@CdkDslMarker
public class CfnTrustAnchorNotificationSettingPropertyDsl {
    private val cdkBuilder: CfnTrustAnchor.NotificationSettingProperty.Builder =
        CfnTrustAnchor.NotificationSettingProperty.builder()

    /**
     * @param channel The specified channel of notification. IAM Roles Anywhere uses CloudWatch
     *   metrics, EventBridge , and AWS Health Dashboard to notify for an event.
     *
     * In the absence of a specific channel, IAM Roles Anywhere applies this setting to 'ALL'
     * channels.
     */
    public fun channel(channel: String) {
        cdkBuilder.channel(channel)
    }

    /** @param enabled Indicates whether the notification setting is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Indicates whether the notification setting is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param event The event to which this notification setting is applied. */
    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    /**
     * @param threshold The number of days before a notification event. This value is required for a
     *   notification setting that is enabled.
     */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun build(): CfnTrustAnchor.NotificationSettingProperty = cdkBuilder.build()
}
