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

package io.cloudshiftdev.awscdkdsl.services.codestarnotifications

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule

/**
 * Information about the AWS Chatbot topics or AWS Chatbot clients associated with a notification
 * rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .targetAddress("targetAddress")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codestarnotifications-notificationrule-target.html)
 */
@CdkDslMarker
public class CfnNotificationRuleTargetPropertyDsl {
    private val cdkBuilder: CfnNotificationRule.TargetProperty.Builder =
        CfnNotificationRule.TargetProperty.builder()

    /**
     * @param targetAddress The Amazon Resource Name (ARN) of the AWS Chatbot topic or AWS Chatbot
     *   client.
     */
    public fun targetAddress(targetAddress: String) {
        cdkBuilder.targetAddress(targetAddress)
    }

    /**
     * @param targetType The target type. Can be an Amazon Simple Notification Service topic or AWS
     *   Chatbot client.
     * * Amazon Simple Notification Service topics are specified as `SNS` .
     * * AWS Chatbot clients are specified as `AWSChatbotSlack` .
     * * AWS Chatbot clients for Microsoft Teams are specified as `AWSChatbotMicrosoftTeams` .
     */
    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnNotificationRule.TargetProperty = cdkBuilder.build()
}
