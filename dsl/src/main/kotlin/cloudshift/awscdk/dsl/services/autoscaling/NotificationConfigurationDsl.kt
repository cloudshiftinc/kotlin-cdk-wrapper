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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration
import software.amazon.awscdk.services.autoscaling.ScalingEvents
import software.amazon.awscdk.services.sns.ITopic

/**
 * AutoScalingGroup fleet change notifications configurations.
 *
 * You can configure AutoScaling to send an SNS notification whenever your Auto Scaling group
 * scales.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.sns.*;
 * ScalingEvents scalingEvents;
 * Topic topic;
 * NotificationConfiguration notificationConfiguration = NotificationConfiguration.builder()
 * .topic(topic)
 * // the properties below are optional
 * .scalingEvents(scalingEvents)
 * .build();
 * ```
 */
@CdkDslMarker
public class NotificationConfigurationDsl {
    private val cdkBuilder: NotificationConfiguration.Builder = NotificationConfiguration.builder()

    /** @param scalingEvents Which fleet scaling events triggers a notification. */
    public fun scalingEvents(scalingEvents: ScalingEvents) {
        cdkBuilder.scalingEvents(scalingEvents)
    }

    /** @param topic SNS topic to send notifications about fleet scaling events. */
    public fun topic(topic: ITopic) {
        cdkBuilder.topic(topic)
    }

    public fun build(): NotificationConfiguration = cdkBuilder.build()
}
