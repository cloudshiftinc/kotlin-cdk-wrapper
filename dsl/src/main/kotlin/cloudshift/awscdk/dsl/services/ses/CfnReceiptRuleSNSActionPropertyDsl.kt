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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action publishes a notification to Amazon Simple
 * Notification Service (Amazon SNS).
 *
 * This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon
 * SNS notifications for all other actions simply provide information about the email. They do not
 * include the email content itself.
 *
 * If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to
 * publish emails to it. However, if you don't own the Amazon SNS topic, you need to attach a policy
 * to the topic to give Amazon SES permissions to access it. For information about giving
 * permissions, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-permissions.html)
 * .
 *
 * You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger
 * emails bounce. If you anticipate emails larger than 150 KB, use the S3 action instead.
 *
 * For information about using a receipt rule to publish an Amazon SNS notification, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-sns.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * SNSActionProperty sNSActionProperty = SNSActionProperty.builder()
 * .encoding("encoding")
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleSNSActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.SNSActionProperty.Builder =
        CfnReceiptRule.SNSActionProperty.builder()

    /**
     * @param encoding The encoding to use for the email within the Amazon SNS notification. UTF-8
     *   is easier to use, but may not preserve all special characters when a message was encoded
     *   with a different encoding format. Base64 preserves all special characters. The default
     *   value is UTF-8.
     */
    public fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. You can
     *   find the ARN of a topic by using the
     *   [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
     *   Amazon SNS.
     *
     * For more information about Amazon SNS topics, see the
     * [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnReceiptRule.SNSActionProperty = cdkBuilder.build()
}
