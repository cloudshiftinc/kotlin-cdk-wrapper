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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

/**
 * Configures Amazon SNS notifications of available or expiring work items for work teams.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * NotificationConfigurationProperty notificationConfigurationProperty =
 * NotificationConfigurationProperty.builder()
 * .notificationTopicArn("notificationTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkteamNotificationConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkteam.NotificationConfigurationProperty.Builder =
        CfnWorkteam.NotificationConfigurationProperty.builder()

    /**
     * @param notificationTopicArn The ARN for the Amazon SNS topic to which notifications should be
     *   published.
     */
    public fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    public fun build(): CfnWorkteam.NotificationConfigurationProperty = cdkBuilder.build()
}
