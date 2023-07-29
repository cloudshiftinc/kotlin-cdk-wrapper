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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.constructs.Construct

/**
 * Adds a notification channel to DevOps Guru.
 *
 * A notification channel is used to notify you about important DevOps Guru events, such as when an
 * insight is generated.
 *
 * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
 * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
 * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard
 * SNS topics. For more information, see
 * [Permissions for Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html)
 * .
 *
 * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
 * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
 * [Permissions for AWS KMS–encrypted Amazon SNS topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnNotificationChannel cfnNotificationChannel = CfnNotificationChannel.Builder.create(this,
 * "MyCfnNotificationChannel")
 * .config(NotificationChannelConfigProperty.builder()
 * .filters(NotificationFilterConfigProperty.builder()
 * .messageTypes(List.of("messageTypes"))
 * .severities(List.of("severities"))
 * .build())
 * .sns(SnsChannelConfigProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html)
 */
@CdkDslMarker
public class CfnNotificationChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNotificationChannel.Builder =
        CfnNotificationChannel.Builder.create(scope, id)

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     *
     * @param config A `NotificationChannelConfig` object that contains information about configured
     *   notification channels.
     */
    public fun config(config: IResolvable) {
        cdkBuilder.config(config)
    }

    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     *
     * @param config A `NotificationChannelConfig` object that contains information about configured
     *   notification channels.
     */
    public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
        cdkBuilder.config(config)
    }

    public fun build(): CfnNotificationChannel = cdkBuilder.build()
}
