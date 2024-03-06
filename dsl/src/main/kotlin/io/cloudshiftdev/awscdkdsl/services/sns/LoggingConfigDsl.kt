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
import kotlin.Number
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sns.LoggingConfig
import software.amazon.awscdk.services.sns.LoggingProtocol

/**
 * A logging configuration for delivery status of messages sent from SNS topic to subscribed
 * endpoints.
 *
 * For more information, see https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
 *
 * Example:
 * ```
 * Role role;
 * Topic topic = new Topic(this, "MyTopic");
 * topic.addLoggingConfig(LoggingConfig.builder()
 * .protocol(LoggingProtocol.SQS)
 * .failureFeedbackRole(role)
 * .successFeedbackRole(role)
 * .successFeedbackSampleRate(50)
 * .build());
 * ```
 */
@CdkDslMarker
public class LoggingConfigDsl {
    private val cdkBuilder: LoggingConfig.Builder = LoggingConfig.builder()

    /**
     * @param failureFeedbackRole The IAM role to be used when logging failed message deliveries in
     *   Amazon CloudWatch.
     */
    public fun failureFeedbackRole(failureFeedbackRole: IRole) {
        cdkBuilder.failureFeedbackRole(failureFeedbackRole)
    }

    /** @param protocol Indicates one of the supported protocols for the SNS topic. */
    public fun protocol(protocol: LoggingProtocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param successFeedbackRole The IAM role to be used when logging successful message deliveries
     *   in Amazon CloudWatch.
     */
    public fun successFeedbackRole(successFeedbackRole: IRole) {
        cdkBuilder.successFeedbackRole(successFeedbackRole)
    }

    /**
     * @param successFeedbackSampleRate The percentage of successful message deliveries to be logged
     *   in Amazon CloudWatch. Valid values are integer between 0-100
     */
    public fun successFeedbackSampleRate(successFeedbackSampleRate: Number) {
        cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
    }

    public fun build(): LoggingConfig = cdkBuilder.build()
}
