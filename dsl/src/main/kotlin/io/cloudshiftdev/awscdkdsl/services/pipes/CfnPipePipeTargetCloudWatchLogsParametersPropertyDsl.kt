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
 * The parameters for using an CloudWatch Logs log stream as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetCloudWatchLogsParametersProperty pipeTargetCloudWatchLogsParametersProperty =
 * PipeTargetCloudWatchLogsParametersProperty.builder()
 * .logStreamName("logStreamName")
 * .timestamp("timestamp")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetcloudwatchlogsparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetCloudWatchLogsParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetCloudWatchLogsParametersProperty.Builder =
        CfnPipe.PipeTargetCloudWatchLogsParametersProperty.builder()

    /** @param logStreamName The name of the log stream. */
    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    /**
     * @param timestamp The time the event occurred, expressed as the number of milliseconds after
     *   Jan 1, 1970 00:00:00 UTC.
     */
    public fun timestamp(timestamp: String) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun build(): CfnPipe.PipeTargetCloudWatchLogsParametersProperty = cdkBuilder.build()
}
