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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption

/**
 * Provides a description of Amazon CloudWatch logging options, including the log stream Amazon
 * Resource Name (ARN).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CloudWatchLoggingOptionProperty cloudWatchLoggingOptionProperty =
 * CloudWatchLoggingOptionProperty.builder()
 * .logStreamArn("logStreamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html)
 */
@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl {
    private val cdkBuilder:
        CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.Builder =
        CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty.builder()

    /** @param logStreamArn The ARN of the CloudWatch log to receive application messages. */
    public fun logStreamArn(logStreamArn: String) {
        cdkBuilder.logStreamArn(logStreamArn)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOption.CloudWatchLoggingOptionProperty =
        cdkBuilder.build()
}
