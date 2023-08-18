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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to publish to an Amazon SNS topic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * SnsActionProperty snsActionProperty = SnsActionProperty.builder()
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .messageFormat("messageFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-snsaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleSnsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.SnsActionProperty.Builder =
        CfnTopicRule.SnsActionProperty.builder()

    /**
     * @param messageFormat (Optional) The message format of the message to publish. Accepted values
     *   are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses this setting to
     *   determine if the payload should be parsed and relevant platform-specific bits of the
     *   payload should be extracted. For more information, see
     *   [Amazon SNS Message and JSON Formats](https://docs.aws.amazon.com/sns/latest/dg/json-formats.html)
     *   in the *Amazon Simple Notification Service Developer Guide* .
     */
    public fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
    }

    /** @param roleArn The ARN of the IAM role that grants access. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param targetArn The ARN of the SNS topic. */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnTopicRule.SnsActionProperty = cdkBuilder.build()
}
