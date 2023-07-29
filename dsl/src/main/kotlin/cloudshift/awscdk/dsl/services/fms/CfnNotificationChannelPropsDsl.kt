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

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnNotificationChannelProps

/**
 * Properties for defining a `CfnNotificationChannel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fms.*;
 * CfnNotificationChannelProps cfnNotificationChannelProps = CfnNotificationChannelProps.builder()
 * .snsRoleName("snsRoleName")
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html)
 */
@CdkDslMarker
public class CfnNotificationChannelPropsDsl {
    private val cdkBuilder: CfnNotificationChannelProps.Builder =
        CfnNotificationChannelProps.builder()

    /**
     * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     *   record AWS Firewall Manager activity.
     */
    public fun snsRoleName(snsRoleName: String) {
        cdkBuilder.snsRoleName(snsRoleName)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects
     *   notifications from AWS Firewall Manager .
     */
    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): CfnNotificationChannelProps = cdkBuilder.build()
}
