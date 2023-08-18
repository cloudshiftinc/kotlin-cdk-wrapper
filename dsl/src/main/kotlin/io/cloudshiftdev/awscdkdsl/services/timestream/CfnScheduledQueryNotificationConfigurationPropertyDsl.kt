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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery

/**
 * Notification configuration for a scheduled query.
 *
 * A notification is sent by Timestream when a scheduled query is created, its state is updated or
 * when it is deleted.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * NotificationConfigurationProperty notificationConfigurationProperty =
 * NotificationConfigurationProperty.builder()
 * .snsConfiguration(SnsConfigurationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-scheduledquery-notificationconfiguration.html)
 */
@CdkDslMarker
public class CfnScheduledQueryNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.NotificationConfigurationProperty.Builder =
        CfnScheduledQuery.NotificationConfigurationProperty.builder()

    /** @param snsConfiguration Details on SNS configuration. */
    public fun snsConfiguration(snsConfiguration: IResolvable) {
        cdkBuilder.snsConfiguration(snsConfiguration)
    }

    /** @param snsConfiguration Details on SNS configuration. */
    public fun snsConfiguration(snsConfiguration: CfnScheduledQuery.SnsConfigurationProperty) {
        cdkBuilder.snsConfiguration(snsConfiguration)
    }

    public fun build(): CfnScheduledQuery.NotificationConfigurationProperty = cdkBuilder.build()
}
