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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Represents the Amazon CloudWatch Logs logging configuration settings for the pipe.
 *
 * Example:
 * ```
 * Queue sourceQueue;
 * Queue targetQueue;
 * Filter sourceFilter = new Filter(List.of(FilterPattern.fromObject(Map.of(
 * "body", Map.of(
 * // only forward events with customerType B2B or B2C
 * "customerType", List.of("B2B", "B2C"))))));
 * Pipe pipe = Pipe.Builder.create(this, "Pipe")
 * .source(new SqsSource(sourceQueue))
 * .target(new SqsTarget(targetQueue))
 * .filter(sourceFilter)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-cloudwatchlogslogdestination.html)
 */
@CdkDslMarker
public class CfnPipeCloudwatchLogsLogDestinationPropertyDsl {
    private val cdkBuilder: CfnPipe.CloudwatchLogsLogDestinationProperty.Builder =
        CfnPipe.CloudwatchLogsLogDestinationProperty.builder()

    /**
     * @param logGroupArn The AWS Resource Name (ARN) for the CloudWatch log group to which
     *   EventBridge sends the log records.
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnPipe.CloudwatchLogsLogDestinationProperty = cdkBuilder.build()
}
