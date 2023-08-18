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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnTrigger

/**
 * Specifies configuration properties of a job run notification.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * NotificationPropertyProperty notificationPropertyProperty =
 * NotificationPropertyProperty.builder()
 * .notifyDelayAfter(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html)
 */
@CdkDslMarker
public class CfnTriggerNotificationPropertyPropertyDsl {
    private val cdkBuilder: CfnTrigger.NotificationPropertyProperty.Builder =
        CfnTrigger.NotificationPropertyProperty.builder()

    /**
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     *   a job run delay notification.
     */
    public fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
    }

    public fun build(): CfnTrigger.NotificationPropertyProperty = cdkBuilder.build()
}
