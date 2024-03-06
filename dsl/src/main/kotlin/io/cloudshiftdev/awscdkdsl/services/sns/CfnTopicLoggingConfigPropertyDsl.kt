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

package io.cloudshiftdev.awscdkdsl.services.sns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sns.CfnTopic

/**
 * The `LoggingConfig` property type specifies the `Delivery` status logging configuration for an
 * [`AWS::SNS::Topic`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sns.*;
 * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
 * .protocol("protocol")
 * // the properties below are optional
 * .failureFeedbackRoleArn("failureFeedbackRoleArn")
 * .successFeedbackRoleArn("successFeedbackRoleArn")
 * .successFeedbackSampleRate("successFeedbackSampleRate")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html)
 */
@CdkDslMarker
public class CfnTopicLoggingConfigPropertyDsl {
    private val cdkBuilder: CfnTopic.LoggingConfigProperty.Builder =
        CfnTopic.LoggingConfigProperty.builder()

    /**
     * @param failureFeedbackRoleArn The IAM role ARN to be used when logging failed message
     *   deliveries in Amazon CloudWatch.
     */
    public fun failureFeedbackRoleArn(failureFeedbackRoleArn: String) {
        cdkBuilder.failureFeedbackRoleArn(failureFeedbackRoleArn)
    }

    /**
     * @param protocol Indicates one of the supported protocols for the Amazon SNS topic.
     *
     * At least one of the other three `LoggingConfig` properties is recommend along with `Protocol`
     * .
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param successFeedbackRoleArn The IAM role ARN to be used when logging successful message
     *   deliveries in Amazon CloudWatch.
     */
    public fun successFeedbackRoleArn(successFeedbackRoleArn: String) {
        cdkBuilder.successFeedbackRoleArn(successFeedbackRoleArn)
    }

    /**
     * @param successFeedbackSampleRate The percentage of successful message deliveries to be logged
     *   in Amazon CloudWatch. Valid percentage values range from 0 to 100.
     */
    public fun successFeedbackSampleRate(successFeedbackSampleRate: String) {
        cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
    }

    public fun build(): CfnTopic.LoggingConfigProperty = cdkBuilder.build()
}
