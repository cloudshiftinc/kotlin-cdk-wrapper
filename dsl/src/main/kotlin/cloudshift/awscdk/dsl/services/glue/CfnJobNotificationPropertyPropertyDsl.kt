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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnJob

/**
 * Specifies configuration properties of a notification.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-notificationproperty.html)
 */
@CdkDslMarker
public class CfnJobNotificationPropertyPropertyDsl {
    private val cdkBuilder: CfnJob.NotificationPropertyProperty.Builder =
        CfnJob.NotificationPropertyProperty.builder()

    /**
     * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending
     *   a job run delay notification.
     */
    public fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
    }

    public fun build(): CfnJob.NotificationPropertyProperty = cdkBuilder.build()
}
