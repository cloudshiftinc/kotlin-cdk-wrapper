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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to publish data to an Amazon SQS queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * SqsActionProperty sqsActionProperty = SqsActionProperty.builder()
 * .queueUrl("queueUrl")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .useBase64(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sqsaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleSqsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.SqsActionProperty.Builder =
        CfnTopicRule.SqsActionProperty.builder()

    /** @param queueUrl The URL of the Amazon SQS queue. */
    public fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
    }

    /** @param roleArn The ARN of the IAM role that grants access. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param useBase64 Specifies whether to use Base64 encoding. */
    public fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
    }

    /** @param useBase64 Specifies whether to use Base64 encoding. */
    public fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64)
    }

    public fun build(): CfnTopicRule.SqsActionProperty = cdkBuilder.build()
}
