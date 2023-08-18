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

package io.cloudshiftdev.awscdkdsl.services.devopsguru

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

/**
 * Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
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
 * SnsChannelConfigProperty snsChannelConfigProperty = SnsChannelConfigProperty.builder()
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-snschannelconfig.html)
 */
@CdkDslMarker
public class CfnNotificationChannelSnsChannelConfigPropertyDsl {
    private val cdkBuilder: CfnNotificationChannel.SnsChannelConfigProperty.Builder =
        CfnNotificationChannel.SnsChannelConfigProperty.builder()

    /**
     * @param topicArn The Amazon Resource Name (ARN) of an Amazon Simple Notification Service
     *   topic.
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnNotificationChannel.SnsChannelConfigProperty = cdkBuilder.build()
}
